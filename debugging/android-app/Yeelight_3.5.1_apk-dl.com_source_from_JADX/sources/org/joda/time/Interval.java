package org.joda.time;

import org.joda.time.base.BaseInterval;
import org.joda.time.chrono.ISOChronology;

public final class Interval extends BaseInterval {
    private static final long serialVersionUID = 4922451897541386752L;

    public Interval(long j, long j2) {
        super(j, j2, (C10142a) null);
    }

    public Interval(long j, long j2, DateTimeZone dateTimeZone) {
        super(j, j2, ISOChronology.getInstance(dateTimeZone));
    }

    public Interval(long j, long j2, C10142a aVar) {
        super(j, j2, aVar);
    }

    public Interval(Object obj) {
        super(obj, (C10142a) null);
    }

    public Interval(Object obj, C10142a aVar) {
        super(obj, aVar);
    }

    public Interval(C10221h hVar, C10222i iVar) {
        super(hVar, iVar);
    }

    public Interval(C10222i iVar, C10221h hVar) {
        super(iVar, hVar);
    }

    public Interval(C10222i iVar, C10222i iVar2) {
        super(iVar, iVar2);
    }

    public Interval(C10222i iVar, C10225l lVar) {
        super(iVar, lVar);
    }

    public Interval(C10225l lVar, C10222i iVar) {
        super(lVar, iVar);
    }

    public static Interval parse(String str) {
        return new Interval(str);
    }

    public boolean abuts(C10223j jVar) {
        if (jVar != null) {
            return jVar.getEndMillis() == getStartMillis() || getEndMillis() == jVar.getStartMillis();
        }
        long a = C10149c.m25336a();
        return getStartMillis() == a || getEndMillis() == a;
    }

    public Interval gap(C10223j jVar) {
        C10223j k = C10149c.m25346k(jVar);
        long startMillis = k.getStartMillis();
        long endMillis = k.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        if (startMillis2 > endMillis) {
            return new Interval(endMillis, startMillis2, getChronology());
        }
        if (startMillis > endMillis2) {
            return new Interval(endMillis2, startMillis, getChronology());
        }
        return null;
    }

    public Interval overlap(C10223j jVar) {
        C10223j k = C10149c.m25346k(jVar);
        if (!overlaps(k)) {
            return null;
        }
        return new Interval(Math.max(getStartMillis(), k.getStartMillis()), Math.min(getEndMillis(), k.getEndMillis()), getChronology());
    }

    public Interval toInterval() {
        return this;
    }

    public Interval withChronology(C10142a aVar) {
        return getChronology() == aVar ? this : new Interval(getStartMillis(), getEndMillis(), aVar);
    }

    public Interval withDurationAfterStart(C10221h hVar) {
        long e = C10149c.m25340e(hVar);
        if (e == toDurationMillis()) {
            return this;
        }
        C10142a chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(startMillis, e, 1), chronology);
    }

    public Interval withDurationBeforeEnd(C10221h hVar) {
        long e = C10149c.m25340e(hVar);
        if (e == toDurationMillis()) {
            return this;
        }
        C10142a chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(endMillis, e, -1), endMillis, chronology);
    }

    public Interval withEnd(C10222i iVar) {
        return withEndMillis(C10149c.m25342g(iVar));
    }

    public Interval withEndMillis(long j) {
        if (j == getEndMillis()) {
            return this;
        }
        return new Interval(getStartMillis(), j, getChronology());
    }

    public Interval withPeriodAfterStart(C10225l lVar) {
        if (lVar == null) {
            return withDurationAfterStart((C10221h) null);
        }
        C10142a chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(lVar, startMillis, 1), chronology);
    }

    public Interval withPeriodBeforeEnd(C10225l lVar) {
        if (lVar == null) {
            return withDurationBeforeEnd((C10221h) null);
        }
        C10142a chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(lVar, endMillis, -1), endMillis, chronology);
    }

    public Interval withStart(C10222i iVar) {
        return withStartMillis(C10149c.m25342g(iVar));
    }

    public Interval withStartMillis(long j) {
        if (j == getStartMillis()) {
            return this;
        }
        return new Interval(j, getEndMillis(), getChronology());
    }
}
