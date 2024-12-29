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

public final class EthiopicChronology extends BasicFixedMonthChronology {

    /* renamed from: EE */
    public static final int f18781EE = 1;
    private static final C10143b ERA_FIELD = new C10162d("EE");
    private static final EthiopicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    private static final int MAX_YEAR = 292272984;
    private static final int MIN_YEAR = -292269337;
    private static final Map<DateTimeZone, EthiopicChronology[]> cCache = new HashMap();
    private static final long serialVersionUID = -5972804258688333942L;

    EthiopicChronology(C10142a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    public static EthiopicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone, int i) {
        EthiopicChronology ethiopicChronology;
        EthiopicChronology ethiopicChronology2;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        Map<DateTimeZone, EthiopicChronology[]> map = cCache;
        synchronized (map) {
            EthiopicChronology[] ethiopicChronologyArr = map.get(dateTimeZone);
            if (ethiopicChronologyArr == null) {
                ethiopicChronologyArr = new EthiopicChronology[7];
                map.put(dateTimeZone, ethiopicChronologyArr);
            }
            int i2 = i - 1;
            try {
                ethiopicChronology = ethiopicChronologyArr[i2];
                if (ethiopicChronology == null) {
                    DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                    if (dateTimeZone == dateTimeZone2) {
                        EthiopicChronology ethiopicChronology3 = new EthiopicChronology((C10142a) null, (Object) null, i);
                        ethiopicChronology2 = new EthiopicChronology(LimitChronology.getInstance(ethiopicChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, (C10142a) ethiopicChronology3), (C10220g) null), (Object) null, i);
                    } else {
                        ethiopicChronology2 = new EthiopicChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i), dateTimeZone), (Object) null, i);
                    }
                    ethiopicChronology = ethiopicChronology2;
                    ethiopicChronologyArr[i2] = ethiopicChronology;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IllegalArgumentException("Invalid min days in first week: " + i);
            }
        }
        return ethiopicChronology;
    }

    public static EthiopicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        C10142a base = getBase();
        return getInstance(base == null ? DateTimeZone.UTC : base.getZone(), getMinimumDaysInFirstWeek());
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
        int i3 = i - 1963;
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
        return 30962844000000L;
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
