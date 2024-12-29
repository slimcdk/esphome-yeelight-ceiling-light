package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Map;
import org.joda.time.C10142a;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;

public final class JulianChronology extends BasicGJChronology {
    private static final JulianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    private static final int MAX_YEAR = 292272992;
    private static final long MILLIS_PER_MONTH = 2629800000L;
    private static final long MILLIS_PER_YEAR = 31557600000L;
    private static final int MIN_YEAR = -292269054;
    private static final Map<DateTimeZone, JulianChronology[]> cCache = new HashMap();
    private static final long serialVersionUID = -8731039522547897247L;

    JulianChronology(C10142a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    static int adjustYearForSet(int i) {
        if (i > 0) {
            return i;
        }
        if (i != 0) {
            return i + 1;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.year(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
    }

    public static JulianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone, int i) {
        JulianChronology julianChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        Map<DateTimeZone, JulianChronology[]> map = cCache;
        synchronized (map) {
            JulianChronology[] julianChronologyArr = map.get(dateTimeZone);
            if (julianChronologyArr == null) {
                julianChronologyArr = new JulianChronology[7];
                map.put(dateTimeZone, julianChronologyArr);
            }
            int i2 = i - 1;
            try {
                julianChronology = julianChronologyArr[i2];
                if (julianChronology == null) {
                    DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                    julianChronology = dateTimeZone == dateTimeZone2 ? new JulianChronology((C10142a) null, (Object) null, i) : new JulianChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i), dateTimeZone), (Object) null, i);
                    julianChronologyArr[i2] = julianChronology;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IllegalArgumentException("Invalid min days in first week: " + i);
            }
        }
        return julianChronology;
    }

    public static JulianChronology getInstanceUTC() {
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
            aVar.f18746E = new SkipDateTimeField(this, aVar.f18746E);
            aVar.f18743B = new SkipDateTimeField(this, aVar.f18743B);
        }
    }

    /* access modifiers changed from: package-private */
    public long calculateFirstDayOfYearMillis(int i) {
        int i2;
        int i3 = i - 1968;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !isLeapYear(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) - 62035200000L;
    }

    /* access modifiers changed from: package-private */
    public long getApproxMillisAtEpochDividedByTwo() {
        return 31083663600000L;
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
        return 15778800000L;
    }

    /* access modifiers changed from: package-private */
    public long getDateMidnightMillis(int i, int i2, int i3) {
        return super.getDateMidnightMillis(adjustYearForSet(i), i2, i3);
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
        return (i & 3) == 0;
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
