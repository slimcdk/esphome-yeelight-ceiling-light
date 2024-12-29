package org.joda.time.base;

import org.apache.commons.p194io.IOUtils;
import org.joda.time.C10149c;
import org.joda.time.C10222i;
import org.joda.time.C10223j;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;

/* renamed from: org.joda.time.base.d */
public abstract class C10146d implements C10223j {
    protected C10146d() {
    }

    /* access modifiers changed from: protected */
    public void checkInterval(long j, long j2) {
        if (j2 < j) {
            throw new IllegalArgumentException("The end instant must be greater or equal to the start");
        }
    }

    public boolean contains(long j) {
        return j >= getStartMillis() && j < getEndMillis();
    }

    public boolean contains(C10222i iVar) {
        return iVar == null ? containsNow() : contains(iVar.getMillis());
    }

    public boolean contains(C10223j jVar) {
        if (jVar == null) {
            return containsNow();
        }
        long startMillis = jVar.getStartMillis();
        long endMillis = jVar.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        return startMillis2 <= startMillis && startMillis < endMillis2 && endMillis <= endMillis2;
    }

    public boolean containsNow() {
        return contains(C10149c.m25336a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10223j)) {
            return false;
        }
        C10223j jVar = (C10223j) obj;
        return getStartMillis() == jVar.getStartMillis() && getEndMillis() == jVar.getEndMillis() && C10179e.m25385a(getChronology(), jVar.getChronology());
    }

    public DateTime getEnd() {
        return new DateTime(getEndMillis(), getChronology());
    }

    public DateTime getStart() {
        return new DateTime(getStartMillis(), getChronology());
    }

    public int hashCode() {
        long startMillis = getStartMillis();
        long endMillis = getEndMillis();
        return ((((3007 + ((int) (startMillis ^ (startMillis >>> 32)))) * 31) + ((int) (endMillis ^ (endMillis >>> 32)))) * 31) + getChronology().hashCode();
    }

    public boolean isAfter(long j) {
        return getStartMillis() > j;
    }

    public boolean isAfter(C10222i iVar) {
        return iVar == null ? isAfterNow() : isAfter(iVar.getMillis());
    }

    public boolean isAfter(C10223j jVar) {
        return getStartMillis() >= (jVar == null ? C10149c.m25336a() : jVar.getEndMillis());
    }

    public boolean isAfterNow() {
        return isAfter(C10149c.m25336a());
    }

    public boolean isBefore(long j) {
        return getEndMillis() <= j;
    }

    public boolean isBefore(C10222i iVar) {
        return iVar == null ? isBeforeNow() : isBefore(iVar.getMillis());
    }

    public boolean isBefore(C10223j jVar) {
        return jVar == null ? isBeforeNow() : isBefore(jVar.getStartMillis());
    }

    public boolean isBeforeNow() {
        return isBefore(C10149c.m25336a());
    }

    public boolean isEqual(C10223j jVar) {
        return getStartMillis() == jVar.getStartMillis() && getEndMillis() == jVar.getEndMillis();
    }

    public boolean overlaps(C10223j jVar) {
        long startMillis = getStartMillis();
        long endMillis = getEndMillis();
        if (jVar == null) {
            long a = C10149c.m25336a();
            return startMillis < a && a < endMillis;
        }
        return startMillis < jVar.getEndMillis() && jVar.getStartMillis() < endMillis;
    }

    public Duration toDuration() {
        long durationMillis = toDurationMillis();
        return durationMillis == 0 ? Duration.ZERO : new Duration(durationMillis);
    }

    public long toDurationMillis() {
        return C10179e.m25389e(getEndMillis(), -getStartMillis());
    }

    public Interval toInterval() {
        return new Interval(getStartMillis(), getEndMillis(), getChronology());
    }

    public MutableInterval toMutableInterval() {
        return new MutableInterval(getStartMillis(), getEndMillis(), getChronology());
    }

    public Period toPeriod() {
        return new Period(getStartMillis(), getEndMillis(), getChronology());
    }

    public Period toPeriod(PeriodType periodType) {
        return new Period(getStartMillis(), getEndMillis(), periodType, getChronology());
    }

    public String toString() {
        C10199a s = C10206f.m25539h().mo41443s(getChronology());
        StringBuffer stringBuffer = new StringBuffer(48);
        s.mo41440l(stringBuffer, getStartMillis());
        stringBuffer.append(IOUtils.DIR_SEPARATOR_UNIX);
        s.mo41440l(stringBuffer, getEndMillis());
        return stringBuffer.toString();
    }
}
