package org.joda.time.field;

import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.h */
public abstract class C10182h extends C10176b {

    /* renamed from: b */
    final long f18845b;

    /* renamed from: c */
    private final C10172d f18846c;

    public C10182h(DateTimeFieldType dateTimeFieldType, C10172d dVar) {
        super(dateTimeFieldType);
        if (dVar.isPrecise()) {
            long unitMillis = dVar.getUnitMillis();
            this.f18845b = unitMillis;
            if (unitMillis >= 1) {
                this.f18846c = dVar;
                return;
            }
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        throw new IllegalArgumentException("Unit duration field must be precise");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo41271b(long j, int i) {
        return getMaximumValue(j);
    }

    /* renamed from: c */
    public final long mo41370c() {
        return this.f18845b;
    }

    public C10172d getDurationField() {
        return this.f18846c;
    }

    public int getMinimumValue() {
        return 0;
    }

    public boolean isLenient() {
        return false;
    }

    public long remainder(long j) {
        if (j >= 0) {
            return j % this.f18845b;
        }
        long j2 = this.f18845b;
        return (((j + 1) % j2) + j2) - 1;
    }

    public long roundCeiling(long j) {
        if (j <= 0) {
            return j - (j % this.f18845b);
        }
        long j2 = j - 1;
        long j3 = this.f18845b;
        return (j2 - (j2 % j3)) + j3;
    }

    public long roundFloor(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.f18845b;
        } else {
            long j3 = j + 1;
            j2 = this.f18845b;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, getMinimumValue(), mo41271b(j, i));
        return j + (((long) (i - get(j))) * this.f18845b);
    }
}
