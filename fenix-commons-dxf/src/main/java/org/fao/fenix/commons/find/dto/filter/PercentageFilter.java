package org.fao.fenix.commons.find.dto.filter;

import java.util.Collection;

public class PercentageFilter {
    private Double total;
    private boolean inclusive = false;
    private StandardFilter totalRows;



    public boolean isInclusive() {
        return inclusive;
    }

    public void setInclusive(boolean inclusive) {
        this.inclusive = inclusive;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public StandardFilter getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(StandardFilter totalRows) {
        this.totalRows = totalRows;
    }
}
