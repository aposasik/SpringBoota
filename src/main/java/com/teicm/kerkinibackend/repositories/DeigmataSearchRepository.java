package com.teicm.kerkinibackend.repositories;

import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchDTO;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchHelperDTO;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
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
public class DeigmataSearchRepository {

    @Autowired
    PrwtokolaRepository prwtokolaRepository;

    @PersistenceContext
    EntityManager entityManager;

    public DeigmataSearchRepository() {
    }

    // Producing the Predicates for the search queries
    private Predicate search(List<SearchCriteria> searchCriteriaList, CriteriaBuilder builder, Root root) {

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
//                    Pattern pattern = Pattern.compile("(\\w+)");
                    Pattern pattern = Pattern.compile("([(!-/.: 0-9\\p{L})]+)");
                    Matcher matcher = pattern.matcher((CharSequence) param.getValue());
                    ArrayList matchesList = new ArrayList();

                    while (matcher.find()) {
                        matchesList.add(matcher.group());
                    }

                    if (matchesList.size() > 0) {
                        // Not allowing for localDate or localTime because they should use '<' '>' ( greater equal, less equal ) instead.
                        // Checking for String
                        if (root.get(param.getKey()).getJavaType() == Prwtokola.class){
                            for (Object match: matchesList) {
                                Optional<Prwtokola> optionalPrwtokola = prwtokolaRepository.findById(Long.parseLong(match.toString()));

                                // Checking if present though it should exist since the user is inputting through an existing (db) list of values
                                if (optionalPrwtokola.isPresent()) {
                                    predicate = builder.equal(root.get(param.getKey()), optionalPrwtokola.get());

                                    predsOrList.add(predicate);
                                }
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

    private DeigmataSearchDTO mapToDeigmataSearchDTO(List<Deigmata> deigmataList, Long count, int size, int page, String sort ){
        try {
            DeigmataSearchDTO deigmataSearchDTO = new DeigmataSearchDTO();

            List<DeigmataSearchHelperDTO> deigmataSearchHelperDTOList = new ArrayList<>();

            for (Deigmata deigma: deigmataList) {
                DeigmataSearchHelperDTO deigmataSearchHelperDTO = new DeigmataSearchHelperDTO();

                deigmataSearchHelperDTO.setId(deigma.getId());
                deigmataSearchHelperDTO.setDeigmaThhlastikwnId(deigma.getDeigmaThhlastikwn().getId());
                deigmataSearchHelperDTO.setPrwtokolaId(deigma.getPrwtokola().getId());

                deigmataSearchHelperDTOList.add(deigmataSearchHelperDTO);
            }

            // Mapping
            deigmataSearchDTO.setPage(page);
            deigmataSearchDTO.setTotalResults(count);
            deigmataSearchDTO.setDeigmataList(deigmataSearchHelperDTOList);
            deigmataSearchDTO.setTotalReturnedResults(deigmataSearchHelperDTOList.size());
            deigmataSearchDTO.setSort(sort);
            if (deigmataList.size() > 0){
                long totalPages = (count + size - 1) / size;

                deigmataSearchDTO.setTotalPages((int) totalPages);

                if ((deigmataSearchDTO.getPage() + 1) < deigmataSearchDTO.getTotalPages()){
                    deigmataSearchDTO.setHasNextPage(true);
                }else {
                    deigmataSearchDTO.setHasNextPage(false);
                }

                if (deigmataSearchDTO.getPage() == 0){
                    deigmataSearchDTO.setHasPreviousPage(false);
                } else if ((deigmataSearchDTO.getTotalPages() - (deigmataSearchDTO.getPage() + 1)) >= 0 ){
                    deigmataSearchDTO.setHasPreviousPage(true);
                }else {
                    deigmataSearchDTO.setHasPreviousPage(false);
                }
            } else if (count > 0 ){
                long totalPages = (count + size - 1) / size;

                deigmataSearchDTO.setTotalPages((int) totalPages);
                deigmataSearchDTO.setHasPreviousPage(true);
                deigmataSearchDTO.setHasNextPage(false);
            } else {
                deigmataSearchDTO.setTotalPages(0);
                deigmataSearchDTO.setHasPreviousPage(false);
                deigmataSearchDTO.setHasPreviousPage(false);
            }
            return deigmataSearchDTO;

        }catch (Exception e){
            throw e;
        }
    }

    private List<DeigmataSearchHelperDTO> mapToDeigmataSearchHelperDTO(List<Deigmata> deigmataList){
        try {
            List<DeigmataSearchHelperDTO> deigmataSearchHelperDTOList = new ArrayList<>();

            for (Deigmata deigma: deigmataList) {
                DeigmataSearchHelperDTO deigmataSearchHelperDTO = new DeigmataSearchHelperDTO();

                deigmataSearchHelperDTO.setId(deigma.getId());
                deigmataSearchHelperDTO.setDeigmaThhlastikwnId(deigma.getDeigmaThhlastikwn().getId());
                deigmataSearchHelperDTO.setPrwtokolaId(deigma.getPrwtokola().getId());

                deigmataSearchHelperDTOList.add(deigmataSearchHelperDTO);
            }
            return deigmataSearchHelperDTOList;
        }catch (Exception e){
            throw e;
        }
    }

    public DeigmataSearchDTO searchDeigmata(List<SearchCriteria> searchCriteriaList, int size, int page, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Deigmata> query = builder.createQuery(Deigmata.class);
            Root root = query.from(Deigmata.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("deigmaThhlastikwn"),
                    root.get("prwtokola")
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
            TypedQuery<Deigmata> typedQuery = entityManager.createQuery(query);

            typedQuery.setFirstResult(page * size);

            typedQuery.setMaxResults(size);

            List<Deigmata> deigmaThhlastikwnList = typedQuery.getResultList();


            // Initializes the count query
            CriteriaQuery<Long> countQuery = builder.createQuery(Long.class);
            countQuery.select(builder.count(countQuery.from(Deigmata.class)));
            entityManager.createQuery(countQuery);
            countQuery.where(predicates);

            Long count = entityManager.createQuery(countQuery).getSingleResult();

            // Mapping to the DeigmaThhlastikwnSearchDTO and returning it
            return mapToDeigmataSearchDTO(deigmaThhlastikwnList, count, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    public List<DeigmataSearchHelperDTO> downloadDeigmata(List<SearchCriteria> searchCriteriaList, String sort){
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Deigmata> query = builder.createQuery(Deigmata.class);
            Root root = query.from(Deigmata.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("deigmaThhlastikwn"),
                    root.get("prwtokola")
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

            TypedQuery<Deigmata> typedQuery = entityManager.createQuery(query);

            List<Deigmata> deigmataList = typedQuery.getResultList();

            return mapToDeigmataSearchHelperDTO(deigmataList);
        }catch (Exception e){
            throw e;
        }
    }

}
