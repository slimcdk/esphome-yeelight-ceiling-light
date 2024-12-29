package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10172d;
import org.joda.time.C10222i;
import org.joda.time.C10224k;
import org.joda.time.C10225l;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C10179e;

public abstract class BaseSingleFieldPeriod implements C10225l, Comparable<BaseSingleFieldPeriod>, Serializable {
    private static final long START_1972 = 63072000000L;
    private static final long serialVersionUID = 9386874258972L;
    private volatile int iPeriod;

    protected BaseSingleFieldPeriod(int i) {
        this.iPeriod = i;
    }

    protected static int between(C10222i iVar, C10222i iVar2, DurationFieldType durationFieldType) {
        if (iVar != null && iVar2 != null) {
            return durationFieldType.getField(C10149c.m25341f(iVar)).getDifference(iVar2.getMillis(), iVar.getMillis());
        }
        throw new IllegalArgumentException("ReadableInstant objects must not be null");
    }

    protected static int between(C10224k kVar, C10224k kVar2, C10225l lVar) {
        if (kVar == null || kVar2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        } else if (kVar.size() == kVar2.size()) {
            int size = kVar.size();
            int i = 0;
            while (i < size) {
                if (kVar.getFieldType(i) == kVar2.getFieldType(i)) {
                    i++;
                } else {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
            }
            if (C10149c.m25348m(kVar)) {
                C10142a withUTC = C10149c.m25337b(kVar.getChronology()).withUTC();
                return withUTC.get(lVar, withUTC.set(kVar, START_1972), withUTC.set(kVar2, START_1972))[0];
            }
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        } else {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
    }

    protected static int standardPeriodIn(C10225l lVar, long j) {
        if (lVar == null) {
            return 0;
        }
        ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
        long j2 = 0;
        for (int i = 0; i < lVar.size(); i++) {
            int value = lVar.getValue(i);
            if (value != 0) {
                C10172d field = lVar.getFieldType(i).getField(instanceUTC);
                if (field.isPrecise()) {
                    j2 = C10179e.m25389e(j2, C10179e.m25391g(field.getUnitMillis(), value));
                } else {
                    throw new IllegalArgumentException("Cannot convert period to duration as " + field.getName() + " is not precise in the period " + lVar);
                }
            }
        }
        return C10179e.m25395k(j2 / j);
    }

    public int compareTo(BaseSingleFieldPeriod baseSingleFieldPeriod) {
        if (baseSingleFieldPeriod.getClass() == getClass()) {
            int value = baseSingleFieldPeriod.getValue();
            int value2 = getValue();
            if (value2 > value) {
                return 1;
            }
            return value2 < value ? -1 : 0;
        }
        throw new ClassCastException(getClass() + " cannot be compared to " + baseSingleFieldPeriod.getClass());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10225l)) {
            return false;
        }
        C10225l lVar = (C10225l) obj;
        return lVar.getPeriodType() == getPeriodType() && lVar.getValue(0) == getValue();
    }

    public int get(DurationFieldType durationFieldType) {
        if (durationFieldType == getFieldType()) {
            return getValue();
        }
        return 0;
    }

    public abstract DurationFieldType getFieldType();

    public DurationFieldType getFieldType(int i) {
        if (i == 0) {
            return getFieldType();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public abstract PeriodType getPeriodType();

    /* access modifiers changed from: protected */
    public int getValue() {
        return this.iPeriod;
    }

    public int getValue(int i) {
        if (i == 0) {
            return getValue();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public int hashCode() {
        return ((459 + getValue()) * 27) + getFieldType().hashCode();
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return durationFieldType == getFieldType();
    }

    /* access modifiers changed from: protected */
    public void setValue(int i) {
        this.iPeriod = i;
    }

    public int size() {
        return 1;
    }

    public MutablePeriod toMutablePeriod() {
        MutablePeriod mutablePeriod = new MutablePeriod();
        mutablePeriod.add((C10225l) this);
        return mutablePeriod;
    }

    public Period toPeriod() {
        return Period.ZERO.withFields(this);
    }
}
