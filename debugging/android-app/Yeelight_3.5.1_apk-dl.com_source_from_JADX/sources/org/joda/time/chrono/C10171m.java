package org.joda.time.chrono;

import org.joda.time.C10143b;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C10177c;
import org.joda.time.field.C10179e;

/* renamed from: org.joda.time.chrono.m */
class C10171m extends C10177c {

    /* renamed from: c */
    static final C10143b f18831c = new C10171m();

    private C10171m() {
        super(GregorianChronology.getInstanceUTC().year(), DateTimeFieldType.yearOfEra());
    }

    public long add(long j, int i) {
        return getWrappedField().add(j, i);
    }

    public long add(long j, long j2) {
        return getWrappedField().add(j, j2);
    }

    public long addWrapField(long j, int i) {
        return getWrappedField().addWrapField(j, i);
    }

    public int[] addWrapField(C10224k kVar, int i, int[] iArr, int i2) {
        return getWrappedField().addWrapField(kVar, i, iArr, i2);
    }

    public int get(long j) {
        int i = getWrappedField().get(j);
        return i < 0 ? -i : i;
    }

    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2);
    }

    public int getMaximumValue() {
        return getWrappedField().getMaximumValue();
    }

    public int getMinimumValue() {
        return 0;
    }

    public long remainder(long j) {
        return getWrappedField().remainder(j);
    }

    public long roundCeiling(long j) {
        return getWrappedField().roundCeiling(j);
    }

    public long roundFloor(long j) {
        return getWrappedField().roundFloor(j);
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, 0, getMaximumValue());
        if (getWrappedField().get(j) < 0) {
            i = -i;
        }
        return super.set(j, i);
    }
}
