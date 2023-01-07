package com.teicm.kerkinibackend.v1.models.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;

import java.util.List;

public class DeigmaThhlastikwnXPressThreatsSearchDTO {

    private List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList;

    private int page;

    private int totalReturnedResults;

    private String sort;

    private int totalPages;

    private Long totalResults;

    private boolean hasPreviousPage;

    private boolean hasNextPage;

    public DeigmaThhlastikwnXPressThreatsSearchDTO() {
    }

    public DeigmaThhlastikwnXPressThreatsSearchDTO(List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList, int page, int totalReturnedResults, String sort, int totalPages, Long totalResults, boolean hasPreviousPage, boolean hasNextPage) {
        this.deigmaThhlastikwnXPressThreatsList = deigmaThhlastikwnXPressThreatsList;
        this.page = page;
        this.totalReturnedResults = totalReturnedResults;
        this.sort = sort;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
        this.hasPreviousPage = hasPreviousPage;
        this.hasNextPage = hasNextPage;
    }

    public List<DeigmaThhlastikwnXPressThreats> getDeigmaThhlastikwnXPressThreatsList() {
        return deigmaThhlastikwnXPressThreatsList;
    }

    public void setDeigmaThhlastikwnXPressThreatsList(List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList) {
        this.deigmaThhlastikwnXPressThreatsList = deigmaThhlastikwnXPressThreatsList;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalReturnedResults() {
        return totalReturnedResults;
    }

    public void setTotalReturnedResults(int totalReturnedResults) {
        this.totalReturnedResults = totalReturnedResults;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }
}
