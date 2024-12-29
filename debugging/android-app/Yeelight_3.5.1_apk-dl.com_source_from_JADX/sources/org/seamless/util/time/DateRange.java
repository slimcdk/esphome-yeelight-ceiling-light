package org.seamless.util.time;

import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.Date;

public class DateRange implements Serializable {
    protected Date end;
    protected Date start;

    public enum Preset {
        ALL(new DateRange((Date) null)),
        YEAR_TO_DATE(new DateRange(new Date(DateRange.getCurrentYear(), 0, 1))),
        MONTH_TO_DATE(new DateRange(new Date(DateRange.getCurrentYear(), DateRange.getCurrentMonth(), 1))),
        LAST_MONTH(DateRange.getMonthOf(new Date(DateRange.getCurrentYear(), DateRange.getCurrentMonth() - 1, 1))),
        LAST_YEAR(new DateRange(new Date(DateRange.getCurrentYear() - 1, 0, 1), new Date(DateRange.getCurrentYear() - 1, 11, 31)));
        
        DateRange dateRange;

        private Preset(DateRange dateRange2) {
            this.dateRange = dateRange2;
        }

        public DateRange getDateRange() {
            return this.dateRange;
        }
    }

    public DateRange() {
    }

    public DateRange(String str, String str2) {
        if (str != null) {
            this.start = new Date(Long.valueOf(str).longValue());
        }
        if (str2 != null) {
            this.end = new Date(Long.valueOf(str2).longValue());
        }
    }

    public DateRange(Date date) {
        this.start = date;
    }

    public DateRange(Date date, Date date2) {
        this.start = date;
        this.end = date2;
    }

    public static int getCurrentDayOfMonth() {
        return new Date().getDate();
    }

    public static int getCurrentMonth() {
        return new Date().getMonth();
    }

    public static int getCurrentYear() {
        return new Date().getYear();
    }

    public static int getDaysInMonth(Date date) {
        int month = date.getMonth();
        int year = date.getYear() + 1900;
        boolean z = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        int[] iArr = new int[12];
        iArr[0] = 31;
        iArr[1] = z ? 29 : 28;
        iArr[2] = 31;
        iArr[3] = 30;
        iArr[4] = 31;
        iArr[5] = 30;
        iArr[6] = 31;
        iArr[7] = 31;
        iArr[8] = 30;
        iArr[9] = 31;
        iArr[10] = 30;
        iArr[11] = 31;
        return iArr[month];
    }

    public static DateRange getMonthOf(Date date) {
        return new DateRange(new Date(date.getYear(), date.getMonth(), 1), new Date(date.getYear(), date.getMonth(), getDaysInMonth(date)));
    }

    public static DateRange valueOf(String str) {
        if (!str.contains("dr=")) {
            return null;
        }
        String substring = str.substring(str.indexOf("dr=") + 3);
        String[] split = substring.substring(0, substring.indexOf(";")).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length != 2) {
            return null;
        }
        try {
            return new DateRange(!split[0].equals(TimerCodec.DISENABLE) ? new Date(Long.valueOf(split[0]).longValue()) : null, !split[1].equals(TimerCodec.DISENABLE) ? new Date(Long.valueOf(split[1]).longValue()) : null);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DateRange dateRange = (DateRange) obj;
        Date date = this.end;
        if (date == null ? dateRange.end != null : !date.equals(dateRange.end)) {
            return false;
        }
        Date date2 = this.start;
        Date date3 = dateRange.start;
        return date2 == null ? date3 == null : date2.equals(date3);
    }

    public Date getEnd() {
        return this.end;
    }

    public Date getOneDayBeforeStart() {
        if (getStart() != null) {
            return new Date(getStart().getTime() - 86400000);
        }
        throw new IllegalStateException("Can't get day before start date because start date is null");
    }

    public Date getStart() {
        return this.start;
    }

    public boolean hasStartOrEnd() {
        return (getStart() == null && getEnd() == null) ? false : true;
    }

    public int hashCode() {
        Date date = this.start;
        int i = 0;
        int hashCode = (date != null ? date.hashCode() : 0) * 31;
        Date date2 = this.end;
        if (date2 != null) {
            i = date2.hashCode();
        }
        return hashCode + i;
    }

    public boolean isInRange(Date date) {
        return getStart() != null && getStart().getTime() < date.getTime() && (getEnd() == null || getEnd().getTime() > date.getTime());
    }

    public boolean isStartAfter(Date date) {
        return getStart() != null && getStart().getTime() > date.getTime();
    }

    public boolean isValid() {
        return getStart() != null && (getEnd() == null || getStart().getTime() <= getEnd().getTime());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("dr=");
        Date start2 = getStart();
        Object obj = TimerCodec.DISENABLE;
        sb.append(start2 != null ? Long.valueOf(getStart().getTime()) : obj);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (getEnd() != null) {
            obj = Long.valueOf(getEnd().getTime());
        }
        sb.append(obj);
        sb.append(";");
        return sb.toString();
    }
}
