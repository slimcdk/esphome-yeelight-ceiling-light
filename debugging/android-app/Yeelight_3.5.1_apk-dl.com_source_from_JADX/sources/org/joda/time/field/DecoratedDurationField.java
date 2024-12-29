package org.joda.time.field;

import org.joda.time.C10172d;
import org.joda.time.DurationFieldType;

public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final C10172d iField;

    public DecoratedDurationField(C10172d dVar, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (dVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (dVar.isSupported()) {
            this.iField = dVar;
        } else {
            throw new IllegalArgumentException("The field must be supported");
        }
    }

    public long add(long j, int i) {
        return this.iField.add(j, i);
    }

    public long add(long j, long j2) {
        return this.iField.add(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    public long getMillis(int i, long j) {
        return this.iField.getMillis(i, j);
    }

    public long getMillis(long j, long j2) {
        return this.iField.getMillis(j, j2);
    }

    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    public long getValueAsLong(long j, long j2) {
        return this.iField.getValueAsLong(j, j2);
    }

    public final C10172d getWrappedField() {
        return this.iField;
    }

    public boolean isPrecise() {
        return this.iField.isPrecise();
    }
}
