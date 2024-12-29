package org.joda.time.field;

import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.j */
public final class C10184j extends C10177c {
    public C10184j(C10143b bVar, DateTimeFieldType dateTimeFieldType) {
        super(bVar, dateTimeFieldType);
        if (bVar.getMinimumValue() != 0) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
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
        return i == 0 ? getMaximumValue() : i;
    }

    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2);
    }

    public int getLeapAmount(long j) {
        return getWrappedField().getLeapAmount(j);
    }

    public C10172d getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    public int getMaximumValue() {
        return getWrappedField().getMaximumValue() + 1;
    }

    public int getMaximumValue(long j) {
        return getWrappedField().getMaximumValue(j) + 1;
    }

    public int getMaximumValue(C10224k kVar) {
        return getWrappedField().getMaximumValue(kVar) + 1;
    }

    public int getMaximumValue(C10224k kVar, int[] iArr) {
        return getWrappedField().getMaximumValue(kVar, iArr) + 1;
    }

    public int getMinimumValue() {
        return 1;
    }

    public int getMinimumValue(long j) {
        return 1;
    }

    public int getMinimumValue(C10224k kVar) {
        return 1;
    }

    public int getMinimumValue(C10224k kVar, int[] iArr) {
        return 1;
    }

    public boolean isLeap(long j) {
        return getWrappedField().isLeap(j);
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

    public long roundHalfCeiling(long j) {
        return getWrappedField().roundHalfCeiling(j);
    }

    public long roundHalfEven(long j) {
        return getWrappedField().roundHalfEven(j);
    }

    public long roundHalfFloor(long j) {
        return getWrappedField().roundHalfFloor(j);
    }

    public long set(long j, int i) {
        int maximumValue = getMaximumValue();
        C10179e.m25396l(this, i, 1, maximumValue);
        if (i == maximumValue) {
            i = 0;
        }
        return getWrappedField().set(j, i);
    }
}
