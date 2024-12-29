package org.joda.time.field;

import org.joda.time.DurationFieldType;

public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j) {
        super(durationFieldType);
        this.iUnitMillis = j;
    }

    public long add(long j, int i) {
        return C10179e.m25389e(j, ((long) i) * this.iUnitMillis);
    }

    public long add(long j, long j2) {
        return C10179e.m25389e(j, C10179e.m25392h(j2, this.iUnitMillis));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreciseDurationField)) {
            return false;
        }
        PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
        return getType() == preciseDurationField.getType() && this.iUnitMillis == preciseDurationField.iUnitMillis;
    }

    public long getDifferenceAsLong(long j, long j2) {
        return C10179e.m25394j(j, j2) / this.iUnitMillis;
    }

    public long getMillis(int i, long j) {
        return ((long) i) * this.iUnitMillis;
    }

    public long getMillis(long j, long j2) {
        return C10179e.m25392h(j, this.iUnitMillis);
    }

    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    public long getValueAsLong(long j, long j2) {
        return j / this.iUnitMillis;
    }

    public int hashCode() {
        long j = this.iUnitMillis;
        return ((int) (j ^ (j >>> 32))) + getType().hashCode();
    }

    public final boolean isPrecise() {
        return true;
    }
}
