package org.joda.time.field;

import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.g */
public class C10181g extends C10182h {

    /* renamed from: d */
    private final int f18843d;

    /* renamed from: e */
    private final C10172d f18844e;

    public C10181g(DateTimeFieldType dateTimeFieldType, C10172d dVar, C10172d dVar2) {
        super(dateTimeFieldType, dVar);
        if (dVar2.isPrecise()) {
            int unitMillis = (int) (dVar2.getUnitMillis() / mo41370c());
            this.f18843d = unitMillis;
            if (unitMillis >= 2) {
                this.f18844e = dVar2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    public long addWrapField(long j, int i) {
        int i2 = get(j);
        return j + (((long) (C10179e.m25387c(i2, i, getMinimumValue(), getMaximumValue()) - i2)) * mo41370c());
    }

    public int get(long j) {
        return j >= 0 ? (int) ((j / mo41370c()) % ((long) this.f18843d)) : (this.f18843d - 1) + ((int) (((j + 1) / mo41370c()) % ((long) this.f18843d)));
    }

    public int getMaximumValue() {
        return this.f18843d - 1;
    }

    public C10172d getRangeDurationField() {
        return this.f18844e;
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, getMinimumValue(), getMaximumValue());
        return j + (((long) (i - get(j))) * this.f18845b);
    }
}
