package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Map;
import org.joda.time.C10142a;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;

public final class GregorianChronology extends BasicGJChronology {
    private static final int DAYS_0000_TO_1970 = 719527;
    private static final GregorianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    private static final int MAX_YEAR = 292278993;
    private static final long MILLIS_PER_MONTH = 2629746000L;
    private static final long MILLIS_PER_YEAR = 31556952000L;
    private static final int MIN_YEAR = -292275054;
    private static final Map<DateTimeZone, GregorianChronology[]> cCache = new HashMap();
    private static final long serialVersionUID = -861407383323710522L;

    private GregorianChronology(C10142a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    public static GregorianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static GregorianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static GregorianChronology getInstance(DateTimeZone dateTimeZone, int i) {
        GregorianChronology gregorianChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        Map<DateTimeZone, GregorianChronology[]> map = cCache;
        synchronized (map) {
            GregorianChronology[] gregorianChronologyArr = map.get(dateTimeZone);
            if (gregorianChronologyArr == null) {
                gregorianChronologyArr = new GregorianChronology[7];
                map.put(dateTimeZone, gregorianChronologyArr);
            }
            int i2 = i - 1;
            try {
                gregorianChronology = gregorianChronologyArr[i2];
                if (gregorianChronology == null) {
                    DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                    gregorianChronology = dateTimeZone == dateTimeZone2 ? new GregorianChronology((C10142a) null, (Object) null, i) : new GregorianChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i), dateTimeZone), (Object) null, i);
                    gregorianChronologyArr[i2] = gregorianChronology;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IllegalArgumentException("Invalid min days in first week: " + i);
            }
        }
        return gregorianChronology;
    }

    public static GregorianChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        C10142a base = getBase();
        int minimumDaysInFirstWeek = getMinimumDaysInFirstWeek();
        if (minimumDaysInFirstWeek == 0) {
            minimumDaysInFirstWeek = 4;
        }
        return getInstance(base == null ? DateTimeZone.UTC : base.getZone(), minimumDaysInFirstWeek);
    }

    /* access modifiers changed from: protected */
    public void assemble(AssembledChronology.C10152a aVar) {
        if (getBase() == null) {
            super.assemble(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public long calculateFirstDayOfYearMillis(int i) {
        int i2;
        int i3 = i / 100;
        if (i < 0) {
            i2 = ((((i + 3) >> 2) - i3) + ((i3 + 3) >> 2)) - 1;
        } else {
            i2 = ((i >> 2) - i3) + (i3 >> 2);
            if (isLeapYear(i)) {
                i2--;
            }
        }
        return ((((long) i) * 365) + ((long) (i2 - DAYS_0000_TO_1970))) * 86400000;
    }

    /* access modifiers changed from: package-private */
    public long getApproxMillisAtEpochDividedByTwo() {
        return 31083597720000L;
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
        return 15778476000L;
    }

    /* access modifiers changed from: package-private */
    public int getMaxYear() {
        return MAX_YEAR;
    }

    /* access modifiers changed from: package-private */
    public int getMinYear() {
        return MIN_YEAR;
    }

    /* access modifiers changed from: package-private */
    public boolean isLeapYear(int i) {
        return (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0);
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
