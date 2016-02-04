package org.fao.fenix.commons.utils;

import javax.servlet.ServletRequest;

public class  Page {
    public int skip = 0;
    public int length = Integer.MAX_VALUE;

    public int page = 1;
    public int perPage = -1;
    public int pages = 1;
    public int limit = -1;

    //INIT
    public Page() {
    }

    public Page(ServletRequest request) {
        String page = request.getParameter("page");
        String perPage = request.getParameter("perPage");
        String pages = request.getParameter("pages");
        String limit = request.getParameter("limit");

        if (page!=null)
            this.page = Integer.parseInt(page);
        if (perPage!=null)
            this.perPage = Integer.parseInt(perPage);
        if (pages!=null)
            this.pages = Integer.parseInt(pages);
        if (limit!=null)
            this.limit = Integer.parseInt(limit);

        init();
    }

    public Page(int page, int perPage, int pages) {
        this.page = page;
        this.perPage = perPage;
        this.pages = pages;

        init();
    }

    public Page(int skip, int length) {
        this.skip = skip;
        this.length = length;
    }

    public void init() {
        if (perPage>0) {
            length = perPage*pages;
            skip = (page-1)*perPage;
        } else if (limit>0)
            length = limit;
    }


    //GET-SET

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


    //UTILS

    public String toH2SQLWhereCondition() {
        return skip>0 || length<Integer.MAX_VALUE ? "_ROWID_ between "+(skip+1)+" and "+(skip+length) : null;
    }
    public String toH2SQL() {
        return skip>0 || length<Integer.MAX_VALUE ? " LIMIT "+length+" OFFSET "+skip : " LIMIT "+length;
    }
    public String toOrientSQL() {
        return skip>0 || length<Integer.MAX_VALUE ? " SKIP "+skip+" LIMIT "+length : " LIMIT "+length;
    }
}
