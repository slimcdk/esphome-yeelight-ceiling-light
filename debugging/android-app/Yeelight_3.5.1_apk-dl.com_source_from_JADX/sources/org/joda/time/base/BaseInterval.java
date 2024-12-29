package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10173e;
import org.joda.time.C10221h;
import org.joda.time.C10222i;
import org.joda.time.C10223j;
import org.joda.time.C10225l;
import org.joda.time.MutableInterval;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C10179e;
import p153e7.C9008d;
import p153e7.C9014i;

public abstract class BaseInterval extends C10146d implements Serializable {
    private static final long serialVersionUID = 576586928732749278L;
    private volatile C10142a iChronology;
    private volatile long iEndMillis;
    private volatile long iStartMillis;

    protected BaseInterval(long j, long j2, C10142a aVar) {
        this.iChronology = C10149c.m25337b(aVar);
        checkInterval(j, j2);
        this.iStartMillis = j;
        this.iEndMillis = j2;
    }

    protected BaseInterval(Object obj, C10142a aVar) {
        long j;
        C9014i d = C9008d.m21502b().mo36872d(obj);
        if (d.mo36880c(obj, aVar)) {
            C10223j jVar = (C10223j) obj;
            this.iChronology = aVar == null ? jVar.getChronology() : aVar;
            this.iStartMillis = jVar.getStartMillis();
            j = jVar.getEndMillis();
        } else if (this instanceof C10173e) {
            d.mo36881k((C10173e) this, obj, aVar);
            checkInterval(this.iStartMillis, this.iEndMillis);
        } else {
            MutableInterval mutableInterval = new MutableInterval();
            d.mo36881k(mutableInterval, obj, aVar);
            this.iChronology = mutableInterval.getChronology();
            this.iStartMillis = mutableInterval.getStartMillis();
            j = mutableInterval.getEndMillis();
        }
        this.iEndMillis = j;
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(C10221h hVar, C10222i iVar) {
        this.iChronology = C10149c.m25341f(iVar);
        this.iEndMillis = C10149c.m25342g(iVar);
        this.iStartMillis = C10179e.m25389e(this.iEndMillis, -C10149c.m25340e(hVar));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(C10222i iVar, C10221h hVar) {
        this.iChronology = C10149c.m25341f(iVar);
        this.iStartMillis = C10149c.m25342g(iVar);
        this.iEndMillis = C10179e.m25389e(this.iStartMillis, C10149c.m25340e(hVar));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(C10222i iVar, C10222i iVar2) {
        if (iVar == null && iVar2 == null) {
            long a = C10149c.m25336a();
            this.iEndMillis = a;
            this.iStartMillis = a;
            this.iChronology = ISOChronology.getInstance();
            return;
        }
        this.iChronology = C10149c.m25341f(iVar);
        this.iStartMillis = C10149c.m25342g(iVar);
        this.iEndMillis = C10149c.m25342g(iVar2);
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(C10222i iVar, C10225l lVar) {
        C10142a f = C10149c.m25341f(iVar);
        this.iChronology = f;
        this.iStartMillis = C10149c.m25342g(iVar);
        this.iEndMillis = lVar == null ? this.iStartMillis : f.add(lVar, this.iStartMillis, 1);
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(C10225l lVar, C10222i iVar) {
        C10142a f = C10149c.m25341f(iVar);
        this.iChronology = f;
        this.iEndMillis = C10149c.m25342g(iVar);
        this.iStartMillis = lVar == null ? this.iEndMillis : f.add(lVar, this.iEndMillis, -1);
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public C10142a getChronology() {
        return this.iChronology;
    }

    public long getEndMillis() {
        return this.iEndMillis;
    }

    public long getStartMillis() {
        return this.iStartMillis;
    }

    /* access modifiers changed from: protected */
    public void setInterval(long j, long j2, C10142a aVar) {
        checkInterval(j, j2);
        this.iStartMillis = j;
        this.iEndMillis = j2;
        this.iChronology = C10149c.m25337b(aVar);
    }
}
