package org.joda.time.field;

import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.d */
public class C10178d extends C10177c {

    /* renamed from: c */
    final int f18836c;

    /* renamed from: d */
    final C10172d f18837d;

    /* renamed from: e */
    private final int f18838e;

    /* renamed from: f */
    private final int f18839f;

    public C10178d(C10143b bVar, DateTimeFieldType dateTimeFieldType, int i) {
        super(bVar, dateTimeFieldType);
        if (i >= 2) {
            C10172d durationField = bVar.getDurationField();
            if (durationField == null) {
                this.f18837d = null;
            } else {
                this.f18837d = new ScaledDurationField(durationField, dateTimeFieldType.getDurationType(), i);
            }
            this.f18836c = i;
            int minimumValue = bVar.getMinimumValue();
            int i2 = minimumValue >= 0 ? minimumValue / i : ((minimumValue + 1) / i) - 1;
            int maximumValue = bVar.getMaximumValue();
            int i3 = maximumValue >= 0 ? maximumValue / i : ((maximumValue + 1) / i) - 1;
            this.f18838e = i2;
            this.f18839f = i3;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    /* renamed from: b */
    private int m25384b(int i) {
        int i2 = this.f18836c;
        return i >= 0 ? i % i2 : (i2 - 1) + ((i + 1) % i2);
    }

    public long add(long j, int i) {
        return getWrappedField().add(j, i * this.f18836c);
    }

    public long add(long j, long j2) {
        return getWrappedField().add(j, j2 * ((long) this.f18836c));
    }

    public long addWrapField(long j, int i) {
        return set(j, C10179e.m25387c(get(j), i, this.f18838e, this.f18839f));
    }

    public int get(long j) {
        int i = getWrappedField().get(j);
        return i >= 0 ? i / this.f18836c : ((i + 1) / this.f18836c) - 1;
    }

    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2) / this.f18836c;
    }

    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2) / ((long) this.f18836c);
    }

    public C10172d getDurationField() {
        return this.f18837d;
    }

    public int getMaximumValue() {
        return this.f18839f;
    }

    public int getMinimumValue() {
        return this.f18838e;
    }

    public long remainder(long j) {
        return set(j, get(getWrappedField().remainder(j)));
    }

    public long roundFloor(long j) {
        C10143b wrappedField = getWrappedField();
        return wrappedField.roundFloor(wrappedField.set(j, get(j) * this.f18836c));
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, this.f18838e, this.f18839f);
        return getWrappedField().set(j, (i * this.f18836c) + m25384b(getWrappedField().get(j)));
    }
}
