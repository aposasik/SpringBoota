package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnSearchDTO;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Repository
public class DeigmaThhlastikwnSearchRepository {

    @PersistenceContext
    EntityManager entityManager;

    public DeigmaThhlastikwnSearchRepository() {
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
                    if (param.getKey().equals("date")) {
                        LocalDate localDate = LocalDate.parse((CharSequence) param.getValue());

                        predicate = builder.greaterThanOrEqualTo(root.get(param.getKey()), localDate);
                    } else if (param.getKey().equals("time")) {
                        LocalTime localTime = LocalTime.parse((CharSequence) param.getValue());

                        predicate = builder.greaterThanOrEqualTo(root.get(param.getKey()), localTime);
                    } else {
                        predicate = builder.greaterThanOrEqualTo(root.get(param.getKey()), param.getValue().toString());
                    }
                    predicatesAndList = builder.and(predicatesAndList, predicate);

                } else if (param.getOperation().equalsIgnoreCase("<")) {
                    if (param.getKey().equals("date")) {
                        LocalDate localDate = LocalDate.parse((CharSequence) param.getValue());

                        predicate = builder.lessThanOrEqualTo(root.get(param.getKey()), localDate);
                    } else if (param.getKey().equals("time")) {
                        LocalTime localTime = LocalTime.parse((CharSequence) param.getValue());

                        predicate = builder.lessThanOrEqualTo(root.get(param.getKey()), localTime);
                    } else {
                        predicate = builder.lessThanOrEqualTo(root.get(param.getKey()), param.getValue().toString());
                    }
                    predicatesAndList = builder.and(predicatesAndList, predicate);
                } else if (param.getOperation().equalsIgnoreCase("~")) {
                    // Each value
                    Predicate predsOrParam = builder.conjunction();
                    // Each parameter
                    Predicate predAnd = builder.conjunction();
                    // Each parameter's values
                    ArrayList<Predicate> predsOrList = new ArrayList<>();

                    // Regex checking for multiple values
                    // Pattern pattern = Pattern.compile("(\\w+[(!-/. ?\\w+)]+)");
                    Pattern pattern = Pattern.compile("([(!-/.: 0-9\\p{L})]+)");

                    Matcher matcher = pattern.matcher((CharSequence) param.getValue());
                    ArrayList matchesList = new ArrayList();

                    while (matcher.find()) {
                        matchesList.add(matcher.group());
                    }

                    if (matchesList.size() > 0) {
                        // Not allowing for localDate or localTime because they should use '<' '>' (
                        // greater equal, less equal ) instead.
                        // Checking for String
                        if (root.get(param.getKey()).getJavaType() == String.class) {
                            for (Object match : matchesList) {
                                predicate = builder.equal(root.get(param.getKey()),
                                        match.toString());
                                predsOrList.add(predicate);
                            }
                            predsOrParam = builder.or(predsOrList.toArray(new Predicate[predsOrList.size()]));
                            // Checking for Double
                        } else if (root.get(param.getKey()).getJavaType() == Double.class) {
                            for (Object match : matchesList) {
                                predicate = builder.equal(root.get(param.getKey()),
                                        match);
                                predsOrList.add(predicate);
                            }
                            predsOrParam = builder.or(predsOrList.toArray(new Predicate[predsOrList.size()]));
                        }
                    }
                    predAnd = builder.and(predsOrParam);
                    predicatesAndList = builder.and(predicatesAndList, predAnd);
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return predicatesAndList;
    }

    private DeigmaThhlastikwnSearchDTO mapToDeigmaThhlastikwnSearchDTO(List<DeigmaThhlastikwn> deigmaThhlastikwnList,
            Long count, int size, int page, String sort) {
        try {
            DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = new DeigmaThhlastikwnSearchDTO();

            // Mapping
            deigmaThhlastikwnSearchDTO.setPage(page);
            deigmaThhlastikwnSearchDTO.setTotalResults(count);
            deigmaThhlastikwnSearchDTO.setDeigmaThhlastikwnList(deigmaThhlastikwnList);
            deigmaThhlastikwnSearchDTO.setTotalReturnedResults(deigmaThhlastikwnList.size());
            deigmaThhlastikwnSearchDTO.setSort(sort);
            if (deigmaThhlastikwnList.size() > 0) {
                long totalPages = (count + size - 1) / size;

                deigmaThhlastikwnSearchDTO.setTotalPages((int) totalPages);

                if ((deigmaThhlastikwnSearchDTO.getPage() + 1) < deigmaThhlastikwnSearchDTO.getTotalPages()) {
                    deigmaThhlastikwnSearchDTO.setHasNextPage(true);
                } else {
                    deigmaThhlastikwnSearchDTO.setHasNextPage(false);
                }

                if (deigmaThhlastikwnSearchDTO.getPage() == 0) {
                    deigmaThhlastikwnSearchDTO.setHasPreviousPage(false);
                } else if ((deigmaThhlastikwnSearchDTO.getTotalPages()
                        - (deigmaThhlastikwnSearchDTO.getPage() + 1)) >= 0) {
                    deigmaThhlastikwnSearchDTO.setHasPreviousPage(true);
                } else {
                    deigmaThhlastikwnSearchDTO.setHasPreviousPage(false);
                }
            } else if (count > 0) {
                long totalPages = (count + size - 1) / size;

                deigmaThhlastikwnSearchDTO.setTotalPages((int) totalPages);
                deigmaThhlastikwnSearchDTO.setHasPreviousPage(true);
                deigmaThhlastikwnSearchDTO.setHasNextPage(false);
            } else {
                deigmaThhlastikwnSearchDTO.setTotalPages(0);
                deigmaThhlastikwnSearchDTO.setHasPreviousPage(false);
                deigmaThhlastikwnSearchDTO.setHasPreviousPage(false);
            }
            return deigmaThhlastikwnSearchDTO;

        } catch (Exception e) {
            throw e;
        }
    }

    public DeigmaThhlastikwnSearchDTO searchDeigmataThhlastikwn(List<SearchCriteria> searchCriteriaList, int size,
            int page, String sort) {
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<DeigmaThhlastikwn> query = builder.createQuery(DeigmaThhlastikwn.class);
            Root root = query.from(DeigmaThhlastikwn.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("kwdikosDeigmatolhpsias"),
                    root.get("xrhmatodothsh"),
                    root.get("ereunhths"),
                    root.get("topothesia"),
                    root.get("date"),
                    root.get("time"),
                    root.get("diarkeia"),
                    root.get("tuposVlasthshs"),
                    root.get("tuposOikotopou"),
                    root.get("epifaneiaDeigmatolhpsias"),
                    root.get("latitudeEGSA"),
                    root.get("longitudeEGSA"),
                    root.get("latitudeWGS84"),
                    root.get("longitudeWGS84"),
                    root.get("gridCell"),
                    root.get("kwdikosNatura"),
                    root.get("methodosDeigmatolhpsias"),
                    root.get("parathrhseis"),
                    root.get("nomos"));

            // Predicating for the query
            Predicate predicates = search(searchCriteriaList, builder, root);

            // Setting the predicates for the main query
            query.where(predicates);

            // Sorting of the query
            if (sort.equals("Asc")) {
                query.orderBy(builder.asc(root.get("id")));
            } else if (sort.equals("Desc")) {
                query.orderBy(builder.desc(root.get("id")));
            }

            // Paging - Sizing of the query
            TypedQuery<DeigmaThhlastikwn> typedQuery = entityManager.createQuery(query);

            typedQuery.setFirstResult(page * size);

            typedQuery.setMaxResults(size);

            List<DeigmaThhlastikwn> deigmaThhlastikwnList = typedQuery.getResultList();

            // Initializes the count query
            CriteriaQuery<Long> countQuery = builder.createQuery(Long.class);
            countQuery.select(builder.count(countQuery.from(DeigmaThhlastikwn.class)));
            entityManager.createQuery(countQuery);
            countQuery.where(predicates);

            Long count = entityManager.createQuery(countQuery).getSingleResult();

            // Mapping to the DeigmaThhlastikwnSearchDTO and returning it
            return mapToDeigmaThhlastikwnSearchDTO(deigmaThhlastikwnList, count, size, page, sort);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<DeigmaThhlastikwn> downloadDeigmataThhlastikwn(List<SearchCriteria> searchCriteriaList, String sort) {
        try {
            // Initializes for the query
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<DeigmaThhlastikwn> query = builder.createQuery(DeigmaThhlastikwn.class);
            Root root = query.from(DeigmaThhlastikwn.class);

            // Selecting for the query using a constructor of the Entity
            query.multiselect(
                    root.get("id"),
                    root.get("kwdikosDeigmatolhpsias"),
                    root.get("xrhmatodothsh"),
                    root.get("ereunhths"),
                    root.get("topothesia"),
                    root.get("date"),
                    root.get("time"),
                    root.get("diarkeia"),
                    root.get("tuposVlasthshs"),
                    root.get("tuposOikotopou"),
                    root.get("epifaneiaDeigmatolhpsias"),
                    root.get("latitudeEGSA"),
                    root.get("longitudeEGSA"),
                    root.get("latitudeWGS84"),
                    root.get("longitudeWGS84"),
                    root.get("gridCell"),
                    root.get("kwdikosNatura"),
                    root.get("methodosDeigmatolhpsias"),
                    root.get("parathrhseis"),
                    root.get("nomos"));

            // Predicating for the query
            Predicate predicates = search(searchCriteriaList, builder, root);

            // Setting the predicates for the main query
            query.where(predicates);

            // Sorting of the query
            if (sort.equals("Asc")) {
                query.orderBy(builder.asc(root.get("id")));
            } else if (sort.equals("Desc")) {
                query.orderBy(builder.desc(root.get("id")));
            }

            TypedQuery<DeigmaThhlastikwn> typedQuery = entityManager.createQuery(query);

            List<DeigmaThhlastikwn> deigmaThhlastikwnList = typedQuery.getResultList();

            return deigmaThhlastikwnList;
        } catch (Exception e) {
            throw e;
        }
    }

}
