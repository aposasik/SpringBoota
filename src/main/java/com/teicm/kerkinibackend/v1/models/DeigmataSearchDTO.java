package com.teicm.kerkinibackend.v1.models;


import java.util.List;

public class DeigmataSearchDTO {

    private List<DeigmataSearchHelperDTO> deigmataList;

    private int page;

    private int totalReturnedResults;

    private String sort;

    private int totalPages;

    private Long totalResults;

    private boolean hasPreviousPage;

    private boolean hasNextPage;

    public DeigmataSearchDTO() {
    }

    public DeigmataSearchDTO(List<DeigmataSearchHelperDTO> deigmataList, int page, int totalReturnedResults, String sort, int totalPages, Long totalResults, boolean hasPreviousPage, boolean hasNextPage) {
        this.deigmataList = deigmataList;
        this.page = page;
        this.totalReturnedResults = totalReturnedResults;
        this.sort = sort;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
        this.hasPreviousPage = hasPreviousPage;
        this.hasNextPage = hasNextPage;
    }

    public List<DeigmataSearchHelperDTO> getDeigmataList() {
        return deigmataList;
    }

    public void setDeigmataList(List<DeigmataSearchHelperDTO> deigmataList) {
        this.deigmataList = deigmataList;
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

