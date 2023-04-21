package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhSearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Repository
public class DeigmaThhlastikwnXEidhSearchRepository {

    @Autowired
    CtThhlastikaEidhRepository ctThhlastikaEidhRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @PersistenceContext
    EntityManager entityManager;

    public DeigmaThhlastikwnXEidhSearchRepository() {
    }

    // Producing the Predicates for the search queries
    private Predicate search(List<SearchCriteria> searchCriteriaList, CriteriaBuilder builder, Root root) {
        // Generally used everytime
        Predicate predicate = builder.conjunction();

        // Final Predicates list
        Predicate predicatesAndList = builder.conjunction();

        try {
            for (SearchCriteria param : searchCriteriaList) {
                if (param.getOperation().equalsIgnoreCase(">")) {
                    predicate = builder.greaterThanOrEqualTo(root.get(param.getKey()), param.getValue().toString());

                    predicatesAndList = builder.and(predicatesAndList, predicate);
                } else if (param.getOperation().equalsIgnoreCase("<")) {
                    predicate = builder.lessThanOrEqualTo(root.get(param.getKey()), param.getValue().toString());

                    predicatesAndList = builder.and(predicatesAndList, predicate);
                } else if (param.getOperation().equalsIgnoreCase("~")) {
                    // Each value
                    Predicate predsOrParam = builder.conjunction();
                    // Each parameter
                    Predicate predAnd = builder.conjunction();
                    // Each parameter's values
                    ArrayList<Predicate> predsOrList = new ArrayList<>();

                    // For Booleans using only And predicates
                    if (root.get(param.getKey()).getJavaType() == Boolean.class) {
                        predicate = builder.equal(root.get(param.getKey()), Boolean.parseBoolean(param.getValue().toString()));

                        predicatesAndList = builder.and(predicatesAndList, predicate);

                    // For CtThhlastikaEidh
                    }else if (root.get(param.getKey()).getJavaType() == CtThhlastikaEidh.class) {
                        // Regex checking for multiple values
//                        Pattern pattern = Pattern.compile("(\\w+[(!-/. ?\\w+)]+)");
                        Pattern pattern = Pattern.compile("([(!-/. 0-9\\p{L})]+)");
                        Matcher matcher = pattern.matcher((CharSequence) param.getValue());
                        ArrayList matchesList = new ArrayList();

                        while (matcher.find()) {
                            matchesList.add(matcher.group());
                        }

                        // Creating Or Predicates for all the matches in the the param's value
                        if (matchesList.size() > 0) {
                            for (Object match: matchesList) {
                                Optional<CtThhlastikaEidh> optionalCtThhlastikaEidh = Optional.ofNullable(ctThhlastikaEidhRepository.findByEidosEquals(String.valueOf(match)));

                                // If present Ct with matched "eidos" then create Or Predicate
                                if (optionalCtThhlastikaEidh.isPresent()){
                                    predicate = builder.equal(root.get(param.getKey()), optionalCtThhlastikaEidh.get());

                                    predsOrList.add(predicate);
                                }
                            }
                            predsOrParam = builder.or( predsOrList.toArray(new Predicate[predsOrList.size()]));
                        }
                        predAnd = builder.and( predsOrParam );
                        predicatesAndList = builder.and(predicatesAndList, predAnd);

                    // For DeigmaThhlastikwn
                    }else if (root.get(param.getKey()).getJavaType() == DeigmaThhlastikwn.class){
                        // Regex checking for multiple values
                        Pattern pattern = Pattern.compile("([\\d]+)");
                        Matcher matcher = pattern.matcher((CharSequence) param.getValue());
                        ArrayList matchesList = new ArrayList();

                        while (matcher.find()) {
                            matchesList.add(matcher.group());
                        }

                        // Creating Or Predicates for all the matches in the the param's value
                        if (matchesList.size() > 0) {
                            for (Object match: matchesList) {
                                Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(Long.parseLong(match.toString()));

                                // If present DeigmaThhlastikwn with matched "id" then create Or Predicate
                                if (optionalDeigmaThhlastikwn.isPresent()){
                                    predicate = builder.equal(root.get(param.getKey()), optionalDeigmaThhlastikwn.get());

                                    predsOrList.add(predicate);
                                }
                            }
                            predsOrParam = builder.or( predsOrList.toArray(new Predicate[predsOrList.size()]));
                        }
                        predAnd = builder.and( predsOrParam );
                        predicatesAndList = builder.and(predicatesAndList, predAnd);

                    // For Strings using both Or - And predicates
                    }else if (root.get(param.getKey()).getJavaType() == String.class){
                        // Regex checking for multiple values
//                        Pattern pattern = Pattern.compile("(\\w+[(!-/. ?\\w+)]+)");
                        Pattern pattern = Pattern.compile("([(!-/.: 0-9\\p{L})]+)");
                        Matcher matcher = pattern.matcher((CharSequence) param.getValue());
                        ArrayList matchesList = new ArrayList();

                        while (matcher.find()) {
                            matchesList.add(matcher.group());
                        }

                        if (matchesList.size() > 0) {
                            for (Object match: matchesList) {
                                predicate = builder.equal(root.get(param.getKey()),
                                        match.toString());
                                predsOrList.add(predicate);
                            }
                            predsOrParam = builder.or( predsOrList.toArray(new Predicate[predsOrList.size()]));
                        }
                        predAnd = builder.and( predsOrParam );
                        predicatesAndList = builder.and(predicatesAndList, predAnd);
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return predicatesAndList;
    }

    private DeigmaThhlastikwnXEidhSearchDTO mapToDeigmaThhlastikwnXEidhSearchDTO(List<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhList, Long count, int size, int page, String sort ){
        try {
            DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = new DeigmaThhlastikwnXEidhSearchDTO();

            // Mapping
            deigmaThhlastikwnXEidhSearchDTO.setPage(page);
            deigmaThhlastikwnXEidhSearchDTO.setTotalResults(count);
            deigmaThhlastikwnXEidhSearchDTO.setDeigmaThhlastikwnXEidhList(deigmaThhlastikwnXEidhList);
            deigmaThhlastikwnXEidhSearchDTO.setTotalReturnedResults(deigmaThhlastikwnXEidhList.size());
            deigmaThhlastikwnXEidhSearchDTO.setSort(sort);
            if (deigmaThhlastikwnXEidhList.size() > 0){
                long totalPages = (count + size - 1) / size;

                deigmaThhlastikwnXEidhSearchDTO.setTotalPages((int) totalPages);

                if ((deigmaThhlastikwnXEidhSearchDTO.getPage() + 1) < deigmaThhlastikwnXEidhSearchDTO.getTotalPages()){
                    deigmaThhlastikwnXEidhSearchDTO.setHasNextPage(true);
                }else {
                    deigmaThhlastikwnXEidhSearchDTO.setHasNextPage(false);
                }

                if (deigmaThhlastikwnXEidhSearchDTO.getPage() == 0){
                    deigmaThhlastikwnXEidhSearchDTO.setHasPreviousPage(false);
                } else if ((deigmaThhlastikwnXEidhSearchDTO.getTotalPages() - (deigmaThhlastikwnXEidhSearchDTO.getPage() + 1)) >= 0 ){
                    deigmaThhlastikwnXEidhSearchDTO.setHasPreviousPage(true);
                }else {
                    deigmaThhlastikwnXEidhSearchDTO.setHasPreviousPage(false);
                }
            } else if (count > 0 ){
                long totalPages = (count + size - 1) / size;

                deigmaThhlastikwnXEidhSearchDTO.setTotalPages((int) totalPages);
                deigmaThhlastikwnXEidhSearchDTO.setHasPreviousPage(true);
                deigmaThhlastikwnXEidhSearchDTO.setHasNextPage(false);
            } else {
                deigmaThhlastikwnXEidhSearchDTO.setTotalPages(0);
                deigmaThhlastikwnXEidhSearchDTO.setHasPreviousPage(false);
                deigmaThhlastikwnXEidhSearchDTO.setHasPreviousPage(false);
            }
            return deigmaThhlastikwnXEidhSearchDTO;

        }catch (Exception e){
            throw e;
        }
    }

    public DeigmaThhlastikwnXEidhSearchDTO searchDeigmaThhlastikwnXEidh(List<SearchCriteria> searchCriteriaList, int size, int page, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<DeigmaThhlastikwnXEidh> query = builder.createQuery(DeigmaThhlastikwnXEidh.class);
            Root root = query.from(DeigmaThhlastikwnXEidh.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("deigmaThhlastikwn"),
                    root.get("ctThhlastikaEidh"),
                    root.get("sxetikhAfthonia"),
                    root.get("parathrhseis"),
                    root.get("hlikia"),
                    root.get("fulo"),
                    root.get("plhthos"),
                    root.get("eokParII"),
                    root.get("eokParIV"),
                    root.get("eokParV")
            );

            // Predicating for the query
            Predicate predicates = search(searchCriteriaList, builder, root);

            // Setting the predicates for the main query
            query.where(predicates);

            // Sorting of the query
            if (sort.equals("Asc")){
                query.orderBy(builder.asc(root.get("id")));
            } else if (sort.equals("Desc")){
                query.orderBy(builder.desc(root.get("id")));
            }

            // Paging - Sizing of the query
            TypedQuery<DeigmaThhlastikwnXEidh> typedQuery = entityManager.createQuery(query);

            typedQuery.setFirstResult(page * size);

            typedQuery.setMaxResults(size);

            List<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhList = typedQuery.getResultList();


            // Initializes the count query
            CriteriaQuery<Long> countQuery = builder.createQuery(Long.class);
            countQuery.select(builder.count(countQuery.from(DeigmaThhlastikwnXEidh.class)));
            entityManager.createQuery(countQuery);
            countQuery.where(predicates);

            Long count = entityManager.createQuery(countQuery).getSingleResult();

            // Mapping to the DeigmaThhlastikwnSearchDTO and returning it
            return mapToDeigmaThhlastikwnXEidhSearchDTO(deigmaThhlastikwnXEidhList, count, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    public List<DeigmaThhlastikwnXEidh> downloadDeigmaThhlastikwnXEidh(List<SearchCriteria> searchCriteriaList, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<DeigmaThhlastikwnXEidh> query = builder.createQuery(DeigmaThhlastikwnXEidh.class);
            Root root = query.from(DeigmaThhlastikwnXEidh.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("deigmaThhlastikwn"),
                    root.get("ctThhlastikaEidh"),
                    root.get("sxetikhAfthonia"),
                    root.get("parathrhseis"),
                    root.get("hlikia"),
                    root.get("fulo"),
                    root.get("plhthos"),
                    root.get("eokParII"),
                    root.get("eokParIV"),
                    root.get("eokParV")
            );

            // Predicating for the query
            Predicate predicates = search(searchCriteriaList, builder, root);

            // Setting the predicates for the main query
            query.where(predicates);

            // Sorting of the query
            if (sort.equals("Asc")){
                query.orderBy(builder.asc(root.get("id")));
            } else if (sort.equals("Desc")){
                query.orderBy(builder.desc(root.get("id")));
            }

            // Paging - Sizing of the query
            TypedQuery<DeigmaThhlastikwnXEidh> typedQuery = entityManager.createQuery(query);

            List<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhList = typedQuery.getResultList();

            return deigmaThhlastikwnXEidhList;
        }catch (Exception e){
            throw e;
        }
    }

}
