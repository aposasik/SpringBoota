package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatsSearchDTO;
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
public class CtThhlastikaPressThreatsSearchRepository {

    @PersistenceContext
    EntityManager entityManager;

    public CtThhlastikaPressThreatsSearchRepository() {
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
                    // TODO: 2/12/2019 Implement \\\\R for strings with newLine chars. Tried it, it passes all the way to the query (having the \\\\R both in Controller and Repository regex) but it doens't give back data (EVENT THOUGH : select * from kerkinidb.ct_thhlastika_press_threats where description_en = 'a\ns\ndd' WORKS IN MYSQL WORKBENCH)//                    \\\\R for newLine characters but couldnt make it work
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

                                // TODO: 2/14/2019 Trying replacing \n with lineSeparator , it works but still no data returned
                                // Replacing the \n newLine char with a new System lineSeparator since it somehow was being parsed as text in the equals instead of a newLine character
//                                match = match.toString().replace("\\n", System.lineSeparator());

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
    private CtThhlastikaPressThreatsSearchDTO mapToCtThhlastikaPressThreatsSearchDTO(List<CtThhlastikaPressThreats> ctThhlastikaEidhList, Long count, int size, int page, String sort ){
        try {
            CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = new CtThhlastikaPressThreatsSearchDTO();

            // Mapping
            ctThhlastikaPressThreatsSearchDTO.setPage(page);
            ctThhlastikaPressThreatsSearchDTO.setTotalResults(count);
            ctThhlastikaPressThreatsSearchDTO.setCtThhlastikaPressThreatsList(ctThhlastikaEidhList);
            ctThhlastikaPressThreatsSearchDTO.setTotalReturnedResults(ctThhlastikaEidhList.size());
            ctThhlastikaPressThreatsSearchDTO.setSort(sort);
            if (ctThhlastikaEidhList.size() > 0){
                long totalPages = (count + size - 1) / size;

                ctThhlastikaPressThreatsSearchDTO.setTotalPages((int) totalPages);

                if ((ctThhlastikaPressThreatsSearchDTO.getPage() + 1) < ctThhlastikaPressThreatsSearchDTO.getTotalPages()){
                    ctThhlastikaPressThreatsSearchDTO.setHasNextPage(true);
                }else {
                    ctThhlastikaPressThreatsSearchDTO.setHasNextPage(false);
                }

                if (ctThhlastikaPressThreatsSearchDTO.getPage() == 0){
                    ctThhlastikaPressThreatsSearchDTO.setHasPreviousPage(false);
                } else if ((ctThhlastikaPressThreatsSearchDTO.getTotalPages() - (ctThhlastikaPressThreatsSearchDTO.getPage() + 1)) >= 0 ){
                    ctThhlastikaPressThreatsSearchDTO.setHasPreviousPage(true);
                }else {
                    ctThhlastikaPressThreatsSearchDTO.setHasPreviousPage(false);
                }
            } else if (count > 0 ){
                long totalPages = (count + size - 1) / size;

                ctThhlastikaPressThreatsSearchDTO.setTotalPages((int) totalPages);
                ctThhlastikaPressThreatsSearchDTO.setHasPreviousPage(true);
                ctThhlastikaPressThreatsSearchDTO.setHasNextPage(false);
            } else {
                ctThhlastikaPressThreatsSearchDTO.setTotalPages(0);
                ctThhlastikaPressThreatsSearchDTO.setHasPreviousPage(false);
                ctThhlastikaPressThreatsSearchDTO.setHasPreviousPage(false);
            }
            return ctThhlastikaPressThreatsSearchDTO;
        }catch (Exception e){
            throw e;
        }
    }

    public CtThhlastikaPressThreatsSearchDTO searchCtThhlastikaPressThreats(List<SearchCriteria> searchCriteriaList, int size, int page, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<CtThhlastikaPressThreats> query = builder.createQuery(CtThhlastikaPressThreats.class);
            Root root = query.from(CtThhlastikaPressThreats.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("actCode"),
                    root.get("descriptionEn"),
                    root.get("remarks")
            );

            // Predicating for the query
            Predicate predicates = search(searchCriteriaList, builder, root);

            // Setting the predicate to the main query
            query.where(predicates);

            // Sorting of the query
            if (sort.equals("Asc")){
                query.orderBy(builder.asc(root.get("id")));
            } else if (sort.equals("Desc")){
                query.orderBy(builder.desc(root.get("id")));
            }

            // Paging - Sizing of the query
            TypedQuery<CtThhlastikaPressThreats> typedQuery = entityManager.createQuery(query);

            typedQuery.setFirstResult(page * size);

            typedQuery.setMaxResults(size);

            List<CtThhlastikaPressThreats> ctThhlastikaEidhList = typedQuery.getResultList();


            // Initializes the count query
            CriteriaQuery<Long> countQuery = builder.createQuery(Long.class);
            countQuery.select(builder.count(countQuery.from(CtThhlastikaPressThreats.class)));
            entityManager.createQuery(countQuery);
            countQuery.where(predicates);

            Long count = entityManager.createQuery(countQuery).getSingleResult();

            // Mapping to the CtThhlastikaPressThreatsSearchDTO and returning it
            return mapToCtThhlastikaPressThreatsSearchDTO(ctThhlastikaEidhList, count, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    public List<CtThhlastikaPressThreats> downloadCtThhlastikaPressThreats(List<SearchCriteria> searchCriteriaList, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<CtThhlastikaPressThreats> query = builder.createQuery(CtThhlastikaPressThreats.class);
            Root root = query.from(CtThhlastikaPressThreats.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("actCode"),
                    root.get("descriptionEn"),
                    root.get("remarks")
            );

            // Predicating for the query
            Predicate predicates = search(searchCriteriaList, builder, root);

            // Setting the predicate to the main query
            query.where(predicates);

            // Sorting of the query
            if (sort.equals("Asc")){
                query.orderBy(builder.asc(root.get("id")));
            } else if (sort.equals("Desc")){
                query.orderBy(builder.desc(root.get("id")));
            }

            TypedQuery<CtThhlastikaPressThreats> typedQuery = entityManager.createQuery(query);

            List<CtThhlastikaPressThreats> ctThhlastikaEidhList = typedQuery.getResultList();

            return ctThhlastikaEidhList;
        }catch (Exception e){
            throw e;
        }
    }


}
