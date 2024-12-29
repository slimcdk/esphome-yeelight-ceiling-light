package org.seamless.util.time;

import org.seamless.util.time.DateRange;

public enum DateRangeOption {
    ALL("All dates", DateRange.Preset.ALL.getDateRange()),
    MONTH_TO_DATE("Month to date", DateRange.Preset.MONTH_TO_DATE.getDateRange()),
    YEAR_TO_DATE("Year to date", DateRange.Preset.YEAR_TO_DATE.getDateRange()),
    LAST_MONTH("Last month", DateRange.Preset.LAST_MONTH.getDateRange()),
    LAST_YEAR("Last year", DateRange.Preset.LAST_YEAR.getDateRange()),
    CUSTOM("Custom dates", (int) null);
    
    DateRange dateRange;
    String label;

    private DateRangeOption(String str, DateRange dateRange2) {
        this.label = str;
        this.dateRange = dateRange2;
    }

    public DateRange getDateRange() {
        return this.dateRange;
    }

    public String getLabel() {
        return this.label;
    }
}
