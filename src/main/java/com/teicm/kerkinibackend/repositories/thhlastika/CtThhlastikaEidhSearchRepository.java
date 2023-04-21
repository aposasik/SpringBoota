package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidhSearchDTO;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Repository
public class CtThhlastikaEidhSearchRepository {

    @PersistenceContext
    EntityManager entityManager;

    public CtThhlastikaEidhSearchRepository() {
    }

    // Producing the Predicates for the search queries
    private Predicate search(List<SearchCriteria> searchCriteriaList, CriteriaBuilder builder, Root root){
        // Generally used everytime
        Predicate predicate = builder.conjunction();

        // Final Predicates list
        Predicate predicatesAndList = builder.conjunction();

        try {
            for (SearchCriteria param : searchCriteriaList) {
                if (param.getOperation().equalsIgnoreCase("~")) {
                    // Each value
                    Predicate predsOrParam = builder.conjunction();
                    // Each parameter
                    Predicate predAnd = builder.conjunction();
                    // Each parameter's values
                    ArrayList<Predicate> predsOrList = new ArrayList<>();

                    // Regex checking for multiple values
//                    Pattern pattern = Pattern.compile("(\\w+[(!-/. ?\\w+)]+)");
                    Pattern pattern = Pattern.compile("([(!-/.: 0-9\\p{L})]+)");
                    Matcher matcher = pattern.matcher((CharSequence) param.getValue());
                    ArrayList matchesList = new ArrayList();

                    while (matcher.find()) {
                        matchesList.add(matcher.group());
                    }
                    if (matchesList.size() > 0) {
                        // Den to afhnw gia localDate h localTime gt s auto tha dinei '<' '>' opote de tha prepei n vrethei edw.
                        if (root.get(param.getKey()).getJavaType() == String.class) {
                            for (Object match: matchesList) {
                                predicate = builder.equal(root.get(param.getKey()),
                                        match.toString());
                                predsOrList.add(predicate);
                            }
                            predsOrParam = builder.or( predsOrList.toArray(new Predicate[predsOrList.size()]));
                        }
                    }
                    predAnd = builder.and( predsOrParam );
                    predicatesAndList = builder.and(predicatesAndList, predAnd);
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return predicatesAndList;
    }


    // Mapping to a SearchDTO object for providing extra needed pagination fields
    private CtThhlastikaEidhSearchDTO mapToCtThhlastikaEidhSearchDTO(List<CtThhlastikaEidh> ctThhlastikaEidhList, Long count, int size, int page, String sort){
        try {
            CtThhlastikaEidhSearchDTO ctThhlastikaEidhSearchDTO = new CtThhlastikaEidhSearchDTO();

            // Mapping
            ctThhlastikaEidhSearchDTO.setPage(page);
            ctThhlastikaEidhSearchDTO.setTotalResults(count);
            ctThhlastikaEidhSearchDTO.setCtThhlastikaEidhList(ctThhlastikaEidhList);
            ctThhlastikaEidhSearchDTO.setTotalReturnedResults(ctThhlastikaEidhList.size());
            ctThhlastikaEidhSearchDTO.setSort(sort);
            if (ctThhlastikaEidhList.size() > 0){
                long totalPages = (count + size - 1) / size;

                ctThhlastikaEidhSearchDTO.setTotalPages((int) totalPages);

                if ((ctThhlastikaEidhSearchDTO.getPage() + 1) < ctThhlastikaEidhSearchDTO.getTotalPages()){
                    ctThhlastikaEidhSearchDTO.setHasNextPage(true);
                }else {
                    ctThhlastikaEidhSearchDTO.setHasNextPage(false);
                }

                if (ctThhlastikaEidhSearchDTO.getPage() == 0){
                    ctThhlastikaEidhSearchDTO.setHasPreviousPage(false);
                }else if ((ctThhlastikaEidhSearchDTO.getTotalPages() - (ctThhlastikaEidhSearchDTO.getPage() + 1)) >= 0 ){
                    ctThhlastikaEidhSearchDTO.setHasPreviousPage(true);
                }else {
                    ctThhlastikaEidhSearchDTO.setHasPreviousPage(false);
                }
            } else if (count > 0 ){
                long totalPages = (count + size - 1) / size;

                ctThhlastikaEidhSearchDTO.setTotalPages((int) totalPages);
                ctThhlastikaEidhSearchDTO.setHasPreviousPage(true);
                ctThhlastikaEidhSearchDTO.setHasNextPage(false);
            } else {
                ctThhlastikaEidhSearchDTO.setTotalPages(0);
                ctThhlastikaEidhSearchDTO.setHasPreviousPage(false);
                ctThhlastikaEidhSearchDTO.setHasPreviousPage(false);
            }
            return ctThhlastikaEidhSearchDTO;
        }catch (Exception e){
            throw e;
        }
    }

    public CtThhlastikaEidhSearchDTO searchCtThhlastikaEidh(List<SearchCriteria> searchCriteriaList, int size, int page, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<CtThhlastikaEidh> query = builder.createQuery(CtThhlastikaEidh.class);
            Root root = query.from(CtThhlastikaEidh.class);

            // Selecting for the query from a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("eidos")
            );

            // Predicating for the query
            Predicate predicates = search(searchCriteriaList, builder, root);

            query.where(predicates);

            // Sorting of the query
            if (sort.equals("Asc")){
                query.orderBy(builder.asc(root.get("id")));
            } else if (sort.equals("Desc")){
                query.orderBy(builder.desc(root.get("id")));
            }

            // Paging - Sizing of the query
            TypedQuery<CtThhlastikaEidh> typedQuery = entityManager.createQuery(query);

            typedQuery.setFirstResult(page * size);

            typedQuery.setMaxResults(size);

            List<CtThhlastikaEidh> ctThhlastikaEidhList = typedQuery.getResultList();


            // Initializes the count query
            CriteriaQuery<Long> countQuery = builder.createQuery(Long.class);
            countQuery.select(builder.count(countQuery.from(CtThhlastikaEidh.class)));
            entityManager.createQuery(countQuery);
            countQuery.where(predicates);

            Long count = entityManager.createQuery(countQuery).getSingleResult();

            // Mapping to the CtThhlastikaEidhSearchDTO and returning it
            return mapToCtThhlastikaEidhSearchDTO(ctThhlastikaEidhList, count, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    public List<CtThhlastikaEidh> downloadCtThhlastikaEidh(List<SearchCriteria> searchCriteriaList, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<CtThhlastikaEidh> query = builder.createQuery(CtThhlastikaEidh.class);
            Root root = query.from(CtThhlastikaEidh.class);

            // Selecting for the query from a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("eidos")
            );

            // Predicating for the query
            Predicate predicates = search(searchCriteriaList, builder, root);

            query.where(predicates);

            // Sorting of the query
            if (sort.equals("Asc")){
                query.orderBy(builder.asc(root.get("id")));
            } else if (sort.equals("Desc")){
                query.orderBy(builder.desc(root.get("id")));
            }

            TypedQuery<CtThhlastikaEidh> typedQuery = entityManager.createQuery(query);

            List<CtThhlastikaEidh> ctThhlastikaEidhList = typedQuery.getResultList();

            return ctThhlastikaEidhList;
        }catch (Exception e){
            throw e;
        }
    }

}
