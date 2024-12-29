package org.joda.time.field;

import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.c */
public abstract class C10177c extends C10176b {

    /* renamed from: b */
    private final C10143b f18835b;

    protected C10177c(C10143b bVar, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeFieldType);
        if (bVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (bVar.isSupported()) {
            this.f18835b = bVar;
        } else {
            throw new IllegalArgumentException("The field must be supported");
        }
    }

    public int get(long j) {
        return this.f18835b.get(j);
    }

    public C10172d getDurationField() {
        return this.f18835b.getDurationField();
    }

    public int getMaximumValue() {
        return this.f18835b.getMaximumValue();
    }

    public int getMinimumValue() {
        return this.f18835b.getMinimumValue();
    }

    public C10172d getRangeDurationField() {
        return this.f18835b.getRangeDurationField();
    }

    public final C10143b getWrappedField() {
        return this.f18835b;
    }

    public boolean isLenient() {
        return this.f18835b.isLenient();
    }

    public long set(long j, int i) {
        return this.f18835b.set(j, i);
    }
}
