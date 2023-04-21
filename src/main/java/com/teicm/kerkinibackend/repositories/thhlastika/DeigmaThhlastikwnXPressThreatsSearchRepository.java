package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsSearchDTO;
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
public class DeigmaThhlastikwnXPressThreatsSearchRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository;


    public DeigmaThhlastikwnXPressThreatsSearchRepository() {
    }

    // Producing the Predicates for the search queries
    private Predicate search(List<SearchCriteria> searchCriteriaList, CriteriaBuilder builder, Root root) {
        // Generally used everytime
        Predicate predicate = builder.conjunction();

        // Final Predicates list
        Predicate predicatesAndList = builder.conjunction();

        try {
            for (SearchCriteria param : searchCriteriaList) {
                // Operations of ">" and "<" are not needed here but left in case they will be in the future. "~" is still necessary.
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

                    // For CtThhlastikaPressThreats
                    if (root.get(param.getKey()).getJavaType() == CtThhlastikaPressThreats.class) {
                        // Regex checking for multiple values
//                        Pattern pattern = Pattern.compile("(\\w+[(!-/. ?\\w+)]+)");
                        Pattern pattern = Pattern.compile("([(!-/.: 0-9\\p{L})]+)");
                        Matcher matcher = pattern.matcher((CharSequence) param.getValue());
                        ArrayList matchesList = new ArrayList();

                        while (matcher.find()) {
                            matchesList.add(matcher.group());
                        }

                        // Creating Or Predicates for all the matches in the the param's value
                        if (matchesList.size() > 0) {
                            for (Object match: matchesList) {
                                Optional<CtThhlastikaPressThreats> optionalCtThhlastikaPressThreats = Optional.ofNullable(ctThhlastikaPressThreatsRepository.findByActCodeEquals(String.valueOf(match)));

                                // If present Ct with matched "actCode" then create Or Predicate
                                if (optionalCtThhlastikaPressThreats.isPresent()){
                                    predicate = builder.equal(root.get(param.getKey()), optionalCtThhlastikaPressThreats.get());

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
                                // Checking if present though it should exist since the user is inputting through an existing (db) list of values
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
                        Pattern pattern = Pattern.compile("([(!-/. 0-9\\p{L})]+)");
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

    // Mapping to a SearchDTO object for providing extra needed pagination fields
    private DeigmaThhlastikwnXPressThreatsSearchDTO mapToDeigmaThhlastikwnXPressThreatsSearchDTO(List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList, Long count, int size, int page, String sort ){
        try {
            DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = new DeigmaThhlastikwnXPressThreatsSearchDTO();

            // Mapping
            deigmaThhlastikwnXPressThreatsSearchDTO.setPage(page);
            deigmaThhlastikwnXPressThreatsSearchDTO.setTotalResults(count);
            deigmaThhlastikwnXPressThreatsSearchDTO.setDeigmaThhlastikwnXPressThreatsList(deigmaThhlastikwnXPressThreatsList);
            deigmaThhlastikwnXPressThreatsSearchDTO.setTotalReturnedResults(deigmaThhlastikwnXPressThreatsList.size());
            deigmaThhlastikwnXPressThreatsSearchDTO.setSort(sort);
            if (deigmaThhlastikwnXPressThreatsList.size() > 0){
                long totalPages = (count + size - 1) / size;

                deigmaThhlastikwnXPressThreatsSearchDTO.setTotalPages((int) totalPages);

                if ((deigmaThhlastikwnXPressThreatsSearchDTO.getPage() + 1) < deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages()){
                    deigmaThhlastikwnXPressThreatsSearchDTO.setHasNextPage(true);
                }else {
                    deigmaThhlastikwnXPressThreatsSearchDTO.setHasNextPage(false);
                }

                if (deigmaThhlastikwnXPressThreatsSearchDTO.getPage() == 0){
                    deigmaThhlastikwnXPressThreatsSearchDTO.setHasPreviousPage(false);
                } else if ((deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages() - (deigmaThhlastikwnXPressThreatsSearchDTO.getPage() + 1)) >= 0 ){
                    deigmaThhlastikwnXPressThreatsSearchDTO.setHasPreviousPage(true);
                }else {
                    deigmaThhlastikwnXPressThreatsSearchDTO.setHasPreviousPage(false);
                }
            } else if (count > 0 ){
                long totalPages = (count + size - 1) / size;

                deigmaThhlastikwnXPressThreatsSearchDTO.setTotalPages((int) totalPages);
                deigmaThhlastikwnXPressThreatsSearchDTO.setHasPreviousPage(true);
                deigmaThhlastikwnXPressThreatsSearchDTO.setHasNextPage(false);
            } else {
                deigmaThhlastikwnXPressThreatsSearchDTO.setTotalPages(0);
                deigmaThhlastikwnXPressThreatsSearchDTO.setHasPreviousPage(false);
                deigmaThhlastikwnXPressThreatsSearchDTO.setHasPreviousPage(false);
            }
            return deigmaThhlastikwnXPressThreatsSearchDTO;

        }catch (Exception e){
            throw e;
        }
    }


    public DeigmaThhlastikwnXPressThreatsSearchDTO searchDeigmaThhlastikwnXPressThreats(List<SearchCriteria> searchCriteriaList, int size, int page, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<DeigmaThhlastikwnXPressThreats> query = builder.createQuery(DeigmaThhlastikwnXPressThreats.class);
            Root root = query.from(DeigmaThhlastikwnXPressThreats.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("deigmaThhlastikwn"),
                    root.get("ctThhlastikaPressThreats"),
                    root.get("kwdikosEidous"),
                    root.get("pressThreat"),
                    root.get("importance")
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
            TypedQuery<DeigmaThhlastikwnXPressThreats> typedQuery = entityManager.createQuery(query);

            typedQuery.setFirstResult(page * size);

            typedQuery.setMaxResults(size);

            List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList = typedQuery.getResultList();


            // Initializes the count query
            CriteriaQuery<Long> countQuery = builder.createQuery(Long.class);
            countQuery.select(builder.count(countQuery.from(DeigmaThhlastikwnXPressThreats.class)));
            entityManager.createQuery(countQuery);
            countQuery.where(predicates);

            Long count = entityManager.createQuery(countQuery).getSingleResult();

            // Mapping to the DeigmaThhlastikwnSearchDTO and returning it
            return mapToDeigmaThhlastikwnXPressThreatsSearchDTO(deigmaThhlastikwnXPressThreatsList, count, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    public List<DeigmaThhlastikwnXPressThreats> downloadDeigmaThhlastikwnXPressThreats(List<SearchCriteria> searchCriteriaList, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<DeigmaThhlastikwnXPressThreats> query = builder.createQuery(DeigmaThhlastikwnXPressThreats.class);
            Root root = query.from(DeigmaThhlastikwnXPressThreats.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("deigmaThhlastikwn"),
                    root.get("ctThhlastikaPressThreats"),
                    root.get("kwdikosEidous"),
                    root.get("pressThreat"),
                    root.get("importance")
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
            TypedQuery<DeigmaThhlastikwnXPressThreats> typedQuery = entityManager.createQuery(query);

            List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList = typedQuery.getResultList();

            return deigmaThhlastikwnXPressThreatsList;
        }catch (Exception e){
            throw e;
        }
    }

}
