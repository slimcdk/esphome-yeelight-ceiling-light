package org.seamless.util;

import java.io.Serializable;

public class Pager implements Serializable {
    private Long numOfRecords = 0L;
    private Integer page = 1;
    private Long pageSize = 15L;

    public Pager() {
    }

    public Pager(Long l) {
        this.numOfRecords = l;
    }

    public Pager(Long l, Integer num) {
        this.numOfRecords = l;
        this.page = num;
    }

    public Pager(Long l, Integer num, Long l2) {
        this.numOfRecords = l;
        this.page = num;
        this.pageSize = l2;
    }

    public int getFirstPage() {
        return 1;
    }

    public long getIndexRangeBegin() {
        long intValue = ((long) (getPage().intValue() - 1)) * getPageSize().longValue();
        long longValue = getNumOfRecords().longValue() - 1;
        if (intValue < 0) {
            intValue = 0;
        }
        return Math.max(Math.min(longValue, intValue), 0);
    }

    public long getIndexRangeEnd() {
        return Math.min(getIndexRangeBegin() + (getPageSize().longValue() - 1), getNumOfRecords().longValue() - 1);
    }

    public long getLastPage() {
        long longValue = this.numOfRecords.longValue() / this.pageSize.longValue();
        if (this.numOfRecords.longValue() % this.pageSize.longValue() == 0) {
            longValue--;
        }
        return longValue + 1;
    }

    public int getNextPage() {
        return this.page.intValue() + 1;
    }

    public Long getNumOfRecords() {
        return this.numOfRecords;
    }

    public Integer getPage() {
        return this.page;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public int getPreviousPage() {
        return this.page.intValue() - 1;
    }

    public boolean isNextPageAvailable() {
        return this.numOfRecords.longValue() - 1 > getIndexRangeEnd();
    }

    public boolean isPreviousPageAvailable() {
        return getIndexRangeBegin() + 1 > getPageSize().longValue();
    }

    public boolean isSeveralPages() {
        return getNumOfRecords().longValue() != 0 && getNumOfRecords().longValue() > getPageSize().longValue();
    }

    public void setNumOfRecords(Long l) {
        this.numOfRecords = l;
    }

    public void setPage(Integer num) {
        if (num != null) {
            this.page = num;
        }
    }

    public void setPageSize(Long l) {
        if (l != null) {
            this.pageSize = l;
        }
    }

    public String toString() {
        return "Pager - Records: " + getNumOfRecords() + " Page size: " + getPageSize();
    }
}
