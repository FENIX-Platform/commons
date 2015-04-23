package org.fao.fenix.commons.utils;

import javax.servlet.ServletRequest;

public class  Page {
    public int skip = 0;
    public int length = 100000; //Default result maximum size

    public int page = 1;
    public int perPage = -1;
    public int pages = 1;

    public Page() {
    }

    public Page(ServletRequest request) {
        String page = request.getParameter("page");
        String perPage = request.getParameter("perPage");
        String pages = request.getParameter("pages");
        String limit = request.getParameter("limit");

        init(page!=null?new Integer(page):null, perPage!=null?new Integer(perPage):null, pages!=null?new Integer(pages):null, limit!=null?new Integer(limit):null);
    }

    public Page(Integer page, Integer perPage, Integer pages, Integer limit) {
        init(page,perPage,pages,limit);
    }

    public Page(int skip, int length) {
        this.skip = skip;
        this.length = length;
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

    private void init(Integer page, Integer perPage, Integer pages, Integer limit) {
        if (perPage!=null && perPage>0) {
            this.perPage = perPage;
            this.page = page = page != null && page > 0 ? page : 1;
            this.pages = pages = pages != null && pages > 0 ? pages : 1;

            length = perPage*pages;
            skip = (page-1)*perPage;
        } else if (limit!=null)
            length = limit>0 ? limit : -1;
    }



    //UTILS
    public String toH2SQL() {
        return perPage>0 ? " LIMIT "+length+" OFFSET "+skip : "";
    }
    public String toOrientSQL() {
        return perPage>0 ? " skip "+skip+" limit "+length : " limit "+length;
    }
}
