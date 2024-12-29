package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Map;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10220g;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;

public final class CopticChronology extends BasicFixedMonthChronology {

    /* renamed from: AM */
    public static final int f18780AM = 1;
    private static final C10143b ERA_FIELD = new C10162d("AM");
    private static final CopticChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    private static final int MAX_YEAR = 292272708;
    private static final int MIN_YEAR = -292269337;
    private static final Map<DateTimeZone, CopticChronology[]> cCache = new HashMap();
    private static final long serialVersionUID = -5972804258688333942L;

    CopticChronology(C10142a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    public static CopticChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static CopticChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static CopticChronology getInstance(DateTimeZone dateTimeZone, int i) {
        CopticChronology copticChronology;
        CopticChronology copticChronology2;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        Map<DateTimeZone, CopticChronology[]> map = cCache;
        synchronized (map) {
            CopticChronology[] copticChronologyArr = map.get(dateTimeZone);
            if (copticChronologyArr == null) {
                copticChronologyArr = new CopticChronology[7];
                map.put(dateTimeZone, copticChronologyArr);
            }
            int i2 = i - 1;
            try {
                copticChronology = copticChronologyArr[i2];
                if (copticChronology == null) {
                    DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                    if (dateTimeZone == dateTimeZone2) {
                        CopticChronology copticChronology3 = new CopticChronology((C10142a) null, (Object) null, i);
                        copticChronology2 = new CopticChronology(LimitChronology.getInstance(copticChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, (C10142a) copticChronology3), (C10220g) null), (Object) null, i);
                    } else {
                        copticChronology2 = new CopticChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i), dateTimeZone), (Object) null, i);
                    }
                    copticChronology = copticChronology2;
                    copticChronologyArr[i2] = copticChronology;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IllegalArgumentException("Invalid min days in first week: " + i);
            }
        }
        return copticChronology;
    }

    public static CopticChronology getInstanceUTC() {
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
            aVar.f18750I = ERA_FIELD;
            C10161c cVar = new C10161c(this, 13);
            aVar.f18745D = cVar;
            aVar.f18759i = cVar.getDurationField();
        }
    }

    /* access modifiers changed from: package-private */
    public long calculateFirstDayOfYearMillis(int i) {
        int i2;
        int i3 = i - 1687;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !isLeapYear(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) + 21859200000L;
    }

    /* access modifiers changed from: package-private */
    public long getApproxMillisAtEpochDividedByTwo() {
        return 26607895200000L;
    }

    /* access modifiers changed from: package-private */
    public int getMaxYear() {
        return MAX_YEAR;
    }

    /* access modifiers changed from: package-private */
    public int getMinYear() {
        return MIN_YEAR;
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
