package org.joda.time.chrono;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10220g;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;

public final class IslamicChronology extends BasicChronology {

    /* renamed from: AH */
    public static final int f18790AH = 1;
    private static final int CYCLE = 30;
    private static final C10143b ERA_FIELD = new C10162d("AH");
    private static final IslamicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    public static final LeapYearPatternType LEAP_YEAR_15_BASED = new LeapYearPatternType(0, 623158436);
    public static final LeapYearPatternType LEAP_YEAR_16_BASED = new LeapYearPatternType(1, 623191204);
    public static final LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB = new LeapYearPatternType(3, 153692453);
    public static final LeapYearPatternType LEAP_YEAR_INDIAN = new LeapYearPatternType(2, 690562340);
    private static final int LONG_MONTH_LENGTH = 30;
    private static final int MAX_YEAR = 292271022;
    private static final long MILLIS_PER_CYCLE = 918518400000L;
    private static final long MILLIS_PER_LONG_MONTH = 2592000000L;
    private static final long MILLIS_PER_LONG_YEAR = 30672000000L;
    private static final long MILLIS_PER_MONTH = 2551440384L;
    private static final long MILLIS_PER_MONTH_PAIR = 5097600000L;
    private static final long MILLIS_PER_SHORT_YEAR = 30585600000L;
    private static final long MILLIS_PER_YEAR = 30617280288L;
    private static final long MILLIS_YEAR_1 = -42521587200000L;
    private static final int MIN_YEAR = -292269337;
    private static final int MONTH_PAIR_LENGTH = 59;
    private static final int SHORT_MONTH_LENGTH = 29;
    private static final Map<DateTimeZone, IslamicChronology[]> cCache = new HashMap();
    private static final long serialVersionUID = -3663823829888L;
    private final LeapYearPatternType iLeapYears;

    public static class LeapYearPatternType implements Serializable {
        private static final long serialVersionUID = 26581275372698L;
        final byte index;
        final int pattern;

        LeapYearPatternType(int i, int i2) {
            this.index = (byte) i;
            this.pattern = i2;
        }

        private Object readResolve() {
            byte b = this.index;
            return b != 0 ? b != 1 ? b != 2 ? b != 3 ? this : IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB : IslamicChronology.LEAP_YEAR_INDIAN : IslamicChronology.LEAP_YEAR_16_BASED : IslamicChronology.LEAP_YEAR_15_BASED;
        }

        public boolean equals(Object obj) {
            return (obj instanceof LeapYearPatternType) && this.index == ((LeapYearPatternType) obj).index;
        }

        public int hashCode() {
            return this.index;
        }

        /* access modifiers changed from: package-private */
        public boolean isLeapYear(int i) {
            return ((1 << (i % 30)) & this.pattern) > 0;
        }
    }

    IslamicChronology(C10142a aVar, Object obj, LeapYearPatternType leapYearPatternType) {
        super(aVar, obj, 4);
        this.iLeapYears = leapYearPatternType;
    }

    public static IslamicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone, LeapYearPatternType leapYearPatternType) {
        IslamicChronology islamicChronology;
        IslamicChronology islamicChronology2;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        Map<DateTimeZone, IslamicChronology[]> map = cCache;
        synchronized (map) {
            IslamicChronology[] islamicChronologyArr = map.get(dateTimeZone);
            if (islamicChronologyArr == null) {
                islamicChronologyArr = new IslamicChronology[4];
                map.put(dateTimeZone, islamicChronologyArr);
            }
            islamicChronology = islamicChronologyArr[leapYearPatternType.index];
            if (islamicChronology == null) {
                DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                if (dateTimeZone == dateTimeZone2) {
                    IslamicChronology islamicChronology3 = new IslamicChronology((C10142a) null, (Object) null, leapYearPatternType);
                    islamicChronology2 = new IslamicChronology(LimitChronology.getInstance(islamicChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, (C10142a) islamicChronology3), (C10220g) null), (Object) null, leapYearPatternType);
                } else {
                    islamicChronology2 = new IslamicChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, leapYearPatternType), dateTimeZone), (Object) null, leapYearPatternType);
                }
                islamicChronology = islamicChronology2;
                islamicChronologyArr[leapYearPatternType.index] = islamicChronology;
            }
        }
        return islamicChronology;
    }

    public static IslamicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        C10142a base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    /* access modifiers changed from: protected */
    public void assemble(AssembledChronology.C10152a aVar) {
        if (getBase() == null) {
            super.assemble(aVar);
            aVar.f18750I = ERA_FIELD;
            C10161c cVar = new C10161c(this, 12);
            aVar.f18745D = cVar;
            aVar.f18759i = cVar.getDurationField();
        }
    }

    /* access modifiers changed from: package-private */
    public long calculateFirstDayOfYearMillis(int i) {
        if (i > MAX_YEAR) {
            throw new ArithmeticException("Year is too large: " + i + " > " + MAX_YEAR);
        } else if (i >= MIN_YEAR) {
            int i2 = i - 1;
            long j = (((long) (i2 / 30)) * MILLIS_PER_CYCLE) + MILLIS_YEAR_1;
            int i3 = (i2 % 30) + 1;
            for (int i4 = 1; i4 < i3; i4++) {
                j += isLeapYear(i4) ? MILLIS_PER_LONG_YEAR : MILLIS_PER_SHORT_YEAR;
            }
            return j;
        } else {
            throw new ArithmeticException("Year is too small: " + i + " < " + MIN_YEAR);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IslamicChronology) && getLeapYearPatternType().index == ((IslamicChronology) obj).getLeapYearPatternType().index && super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public long getApproxMillisAtEpochDividedByTwo() {
        return 21260793600000L;
    }

    /* access modifiers changed from: package-private */
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    /* access modifiers changed from: package-private */
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    /* access modifiers changed from: package-private */
    public long getAverageMillisPerYearDividedByTwo() {
        return 15308640144L;
    }

    /* access modifiers changed from: package-private */
    public int getDayOfMonth(long j) {
        int dayOfYear = getDayOfYear(j) - 1;
        if (dayOfYear == 354) {
            return 30;
        }
        return ((dayOfYear % 59) % 30) + 1;
    }

    /* access modifiers changed from: package-private */
    public int getDaysInMonthMax() {
        return 30;
    }

    /* access modifiers changed from: package-private */
    public int getDaysInMonthMax(int i) {
        return (i == 12 || (i + -1) % 2 == 0) ? 30 : 29;
    }

    /* access modifiers changed from: package-private */
    public int getDaysInYear(int i) {
        return isLeapYear(i) ? 355 : 354;
    }

    /* access modifiers changed from: package-private */
    public int getDaysInYearMax() {
        return 355;
    }

    /* access modifiers changed from: package-private */
    public int getDaysInYearMonth(int i, int i2) {
        return ((i2 != 12 || !isLeapYear(i)) && (i2 + -1) % 2 != 0) ? 29 : 30;
    }

    public LeapYearPatternType getLeapYearPatternType() {
        return this.iLeapYears;
    }

    /* access modifiers changed from: package-private */
    public int getMaxYear() {
        return MAX_YEAR;
    }

    /* access modifiers changed from: package-private */
    public int getMinYear() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public int getMonthOfYear(long j, int i) {
        int yearMillis = (int) ((j - getYearMillis(i)) / 86400000);
        if (yearMillis == 354) {
            return 12;
        }
        return ((yearMillis * 2) / 59) + 1;
    }

    /* access modifiers changed from: package-private */
    public long getTotalMillisByYearMonth(int i, int i2) {
        int i3 = i2 - 1;
        int i4 = i3 % 2;
        int i5 = i3 / 2;
        return i4 == 1 ? (((long) i5) * MILLIS_PER_MONTH_PAIR) + MILLIS_PER_LONG_MONTH : ((long) i5) * MILLIS_PER_MONTH_PAIR;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0024, code lost:
        if (isLeapYear(r0) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        r6 = 30672000000L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        r6 = 30585600000L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r9 < r6) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r9 = r9 - r6;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (isLeapYear(r0) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getYear(long r9) {
        /*
            r8 = this;
            r0 = -42521587200000(0xffffd953abe65000, double:NaN)
            long r9 = r9 - r0
            r0 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r2 = r9 / r0
            long r9 = r9 % r0
            r0 = 30
            long r2 = r2 * r0
            r0 = 1
            long r2 = r2 + r0
            int r0 = (int) r2
            boolean r1 = r8.isLeapYear(r0)
            r2 = 30672000000(0x724319400, double:1.5153981489E-313)
            r4 = 30585600000(0x71f0b3800, double:1.51112942174E-313)
            if (r1 == 0) goto L_0x0028
        L_0x0026:
            r6 = r2
            goto L_0x0029
        L_0x0028:
            r6 = r4
        L_0x0029:
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0037
            long r9 = r9 - r6
            int r0 = r0 + 1
            boolean r1 = r8.isLeapYear(r0)
            if (r1 == 0) goto L_0x0028
            goto L_0x0026
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.IslamicChronology.getYear(long):int");
    }

    /* access modifiers changed from: package-private */
    public long getYearDifference(long j, long j2) {
        int year = getYear(j);
        int year2 = getYear(j2);
        int i = year - year2;
        if (j - getYearMillis(year) < j2 - getYearMillis(year2)) {
            i--;
        }
        return (long) i;
    }

    public int hashCode() {
        return (super.hashCode() * 13) + getLeapYearPatternType().hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean isLeapYear(int i) {
        return this.iLeapYears.isLeapYear(i);
    }

    /* access modifiers changed from: package-private */
    public long setYear(long j, int i) {
        int dayOfYear = getDayOfYear(j, getYear(j));
        int millisOfDay = getMillisOfDay(j);
        if (dayOfYear > 354 && !isLeapYear(i)) {
            dayOfYear--;
        }
        return getYearMonthDayMillis(i, 1, dayOfYear) + ((long) millisOfDay);
    }

    public C10142a withUTC() {
        return INSTANCE_UTC;
    }

    public C10142a withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone);
    }
}
