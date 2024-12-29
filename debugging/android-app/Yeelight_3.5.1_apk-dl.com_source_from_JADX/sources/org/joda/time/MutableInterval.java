package org.joda.time;

import org.joda.time.base.BaseInterval;
import org.joda.time.field.C10179e;

public class MutableInterval extends BaseInterval implements C10173e, Cloneable {
    private static final long serialVersionUID = -5982824024992428470L;

    public MutableInterval() {
        super(0, 0, (C10142a) null);
    }

    public MutableInterval(long j, long j2) {
        super(j, j2, (C10142a) null);
    }

    public MutableInterval(long j, long j2, C10142a aVar) {
        super(j, j2, aVar);
    }

    public MutableInterval(Object obj) {
        super(obj, (C10142a) null);
    }

    public MutableInterval(Object obj, C10142a aVar) {
        super(obj, aVar);
    }

    public MutableInterval(C10221h hVar, C10222i iVar) {
        super(hVar, iVar);
    }

    public MutableInterval(C10222i iVar, C10221h hVar) {
        super(iVar, hVar);
    }

    public MutableInterval(C10222i iVar, C10222i iVar2) {
        super(iVar, iVar2);
    }

    public MutableInterval(C10222i iVar, C10225l lVar) {
        super(iVar, lVar);
    }

    public MutableInterval(C10225l lVar, C10222i iVar) {
        super(lVar, iVar);
    }

    public static MutableInterval parse(String str) {
        return new MutableInterval(str);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutableInterval copy() {
        return (MutableInterval) clone();
    }

    public void setChronology(C10142a aVar) {
        super.setInterval(getStartMillis(), getEndMillis(), aVar);
    }

    public void setDurationAfterStart(long j) {
        setEndMillis(C10179e.m25389e(getStartMillis(), j));
    }

    public void setDurationAfterStart(C10221h hVar) {
        setEndMillis(C10179e.m25389e(getStartMillis(), C10149c.m25340e(hVar)));
    }

    public void setDurationBeforeEnd(long j) {
        setStartMillis(C10179e.m25389e(getEndMillis(), -j));
    }

    public void setDurationBeforeEnd(C10221h hVar) {
        setStartMillis(C10179e.m25389e(getEndMillis(), -C10149c.m25340e(hVar)));
    }

    public void setEnd(C10222i iVar) {
        super.setInterval(getStartMillis(), C10149c.m25342g(iVar), getChronology());
    }

    public void setEndMillis(long j) {
        super.setInterval(getStartMillis(), j, getChronology());
    }

    public void setInterval(long j, long j2) {
        super.setInterval(j, j2, getChronology());
    }

    public void setInterval(C10222i iVar, C10222i iVar2) {
        if (iVar == null && iVar2 == null) {
            long a = C10149c.m25336a();
            setInterval(a, a);
            return;
        }
        super.setInterval(C10149c.m25342g(iVar), C10149c.m25342g(iVar2), C10149c.m25341f(iVar));
    }

    public void setInterval(C10223j jVar) {
        if (jVar != null) {
            super.setInterval(jVar.getStartMillis(), jVar.getEndMillis(), jVar.getChronology());
            return;
        }
        throw new IllegalArgumentException("Interval must not be null");
    }

    public void setPeriodAfterStart(C10225l lVar) {
        setEndMillis(lVar == null ? getStartMillis() : getChronology().add(lVar, getStartMillis(), 1));
    }

    public void setPeriodBeforeEnd(C10225l lVar) {
        setStartMillis(lVar == null ? getEndMillis() : getChronology().add(lVar, getEndMillis(), -1));
    }

    public void setStart(C10222i iVar) {
        super.setInterval(C10149c.m25342g(iVar), getEndMillis(), getChronology());
    }

    public void setStartMillis(long j) {
        super.setInterval(j, getEndMillis(), getChronology());
    }
}
