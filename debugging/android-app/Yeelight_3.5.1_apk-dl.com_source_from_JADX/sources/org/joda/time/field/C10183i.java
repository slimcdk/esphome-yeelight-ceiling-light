package org.joda.time.field;

import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.i */
public class C10183i extends C10177c {

    /* renamed from: c */
    final int f18847c;

    /* renamed from: d */
    final C10172d f18848d;

    public C10183i(C10143b bVar, DateTimeFieldType dateTimeFieldType, int i) {
        super(bVar, dateTimeFieldType);
        if (i >= 2) {
            C10172d durationField = bVar.getDurationField();
            if (durationField == null) {
                this.f18848d = null;
            } else {
                this.f18848d = new ScaledDurationField(durationField, dateTimeFieldType.getRangeDurationType(), i);
            }
            this.f18847c = i;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    public C10183i(C10178d dVar) {
        this(dVar, dVar.getType());
    }

    public C10183i(C10178d dVar, DateTimeFieldType dateTimeFieldType) {
        super(dVar.getWrappedField(), dateTimeFieldType);
        this.f18847c = dVar.f18836c;
        this.f18848d = dVar.f18837d;
    }

    /* renamed from: b */
    private int m25400b(int i) {
        return i >= 0 ? i / this.f18847c : ((i + 1) / this.f18847c) - 1;
    }

    public long addWrapField(long j, int i) {
        return set(j, C10179e.m25387c(get(j), i, 0, this.f18847c - 1));
    }

    public int get(long j) {
        int i = getWrappedField().get(j);
        int i2 = this.f18847c;
        return i >= 0 ? i % i2 : (i2 - 1) + ((i + 1) % i2);
    }

    public int getMaximumValue() {
        return this.f18847c - 1;
    }

    public int getMinimumValue() {
        return 0;
    }

    public C10172d getRangeDurationField() {
        return this.f18848d;
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
        C10179e.m25396l(this, i, 0, this.f18847c - 1);
        return getWrappedField().set(j, (m25400b(getWrappedField().get(j)) * this.f18847c) + i);
    }
}
