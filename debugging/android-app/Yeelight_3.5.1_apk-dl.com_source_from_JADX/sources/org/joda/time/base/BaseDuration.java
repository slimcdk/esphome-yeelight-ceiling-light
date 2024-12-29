package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10221h;
import org.joda.time.C10222i;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.field.C10179e;
import p153e7.C9008d;

public abstract class BaseDuration extends C3587b implements Serializable {
    private static final long serialVersionUID = 2581698638990L;
    private volatile long iMillis;

    protected BaseDuration(long j) {
        this.iMillis = j;
    }

    protected BaseDuration(long j, long j2) {
        this.iMillis = C10179e.m25389e(j2, -j);
    }

    protected BaseDuration(Object obj) {
        this.iMillis = C9008d.m21502b().mo36870a(obj).mo36879f(obj);
    }

    protected BaseDuration(C10222i iVar, C10222i iVar2) {
        long j;
        if (iVar == iVar2) {
            j = 0;
        } else {
            j = C10179e.m25389e(C10149c.m25342g(iVar2), -C10149c.m25342g(iVar));
        }
        this.iMillis = j;
    }

    public long getMillis() {
        return this.iMillis;
    }

    /* access modifiers changed from: protected */
    public void setMillis(long j) {
        this.iMillis = j;
    }

    public Interval toIntervalFrom(C10222i iVar) {
        return new Interval(iVar, (C10221h) this);
    }

    public Interval toIntervalTo(C10222i iVar) {
        return new Interval((C10221h) this, iVar);
    }

    public Period toPeriod(PeriodType periodType) {
        return new Period(getMillis(), periodType);
    }

    public Period toPeriod(PeriodType periodType, C10142a aVar) {
        return new Period(getMillis(), periodType, aVar);
    }

    public Period toPeriod(C10142a aVar) {
        return new Period(getMillis(), aVar);
    }

    public Period toPeriodFrom(C10222i iVar) {
        return new Period(iVar, (C10221h) this);
    }

    public Period toPeriodFrom(C10222i iVar, PeriodType periodType) {
        return new Period(iVar, (C10221h) this, periodType);
    }

    public Period toPeriodTo(C10222i iVar) {
        return new Period((C10221h) this, iVar);
    }

    public Period toPeriodTo(C10222i iVar, PeriodType periodType) {
        return new Period((C10221h) this, iVar, periodType);
    }
}
