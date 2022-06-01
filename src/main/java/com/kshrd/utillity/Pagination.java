package com.kshrd.utillity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Pagination {
    private int page;
    private int limit; // how many data show in one page
    private int nextPage;
    private int previousPage;
    private int totalCount;
    private int totalPages;
    private int pageToShow;
    private int startPage;
    private int endPage;

    @JsonIgnore
    private int offset; // starting points

    public Pagination() {
        this(1, 5, 0, 0, 5);
    }

    public Pagination(int page, int limit, int totalCount, int totalPages, int pagesToShow) {
        this.page = page;
        this.limit = limit;
        this.totalCount = totalCount;
        this.pageToShow = pagesToShow;
    }

    // getter & setter
    public int getPage() {
        return page;
    }

    public void setPage(int currentPage) {
        this.page = (currentPage <= 1 ? 1 : currentPage);
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getTotalPages(){
        return (int) Math.ceil((double) this.totalCount/limit);
    }
    public void setTotalPages(int totalPages){this.totalPages=totalPages;}

    public int getOffset(){return (this.page-1)*this.limit; }

    public int getNextPage(){return (int)(page>= getTotalPages()? getTotalPages():page+1);}

    public int getPreviousPage(){return (int) (page<=1? 1 : page-1);}

    public int getPageToShow(){return pageToShow;};

    public int getTotalCount(){ return totalCount; }

    public void setTotalCount(int totalCount){
        this.totalCount = totalCount;
        this.setStartPageEndPage(getTotalPages());
    }

    private void setStartPageEndPage(int totalPages){
        int halfPagesToShow = pageToShow/2;

        if (totalPages <= pageToShow){
            startPage = 1;
            endPage = totalPages;
        }else if(page - halfPagesToShow <= 0){
            startPage = 1 ;
            endPage = pageToShow;
        }else if (page + halfPagesToShow == totalPages){
            startPage=page - halfPagesToShow + 1;// I added my own
            endPage = totalPages;
        }else  if (page + halfPagesToShow > totalPages){
            startPage = totalPages - pageToShow + 1;
            endPage = totalPages;
        }else {
            startPage = page - halfPagesToShow;
            endPage = page + halfPagesToShow;
        }
    }
    @Override
    public String toString() {
        return "Paging [page=" + page + ", limit=" + limit + ", totalCount=" + totalCount + ", totalPages=" + totalPages
                + ", nextPage=" + nextPage + ", previousPage=" + previousPage + ", offset=" + offset + "]";
    }

}
