package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.C10172d;
import org.joda.time.DurationFieldType;

public abstract class BaseDurationField extends C10172d implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    protected BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType != null) {
            this.iType = durationFieldType;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public int compareTo(C10172d dVar) {
        long unitMillis = dVar.getUnitMillis();
        long unitMillis2 = getUnitMillis();
        if (unitMillis2 == unitMillis) {
            return 0;
        }
        return unitMillis2 < unitMillis ? -1 : 1;
    }

    public int getDifference(long j, long j2) {
        return C10179e.m25395k(getDifferenceAsLong(j, j2));
    }

    public long getMillis(int i) {
        return ((long) i) * getUnitMillis();
    }

    public long getMillis(long j) {
        return C10179e.m25392h(j, getUnitMillis());
    }

    public final String getName() {
        return this.iType.getName();
    }

    public final DurationFieldType getType() {
        return this.iType;
    }

    public int getValue(long j) {
        return C10179e.m25395k(getValueAsLong(j));
    }

    public int getValue(long j, long j2) {
        return C10179e.m25395k(getValueAsLong(j, j2));
    }

    public long getValueAsLong(long j) {
        return j / getUnitMillis();
    }

    public final boolean isSupported() {
        return true;
    }

    public String toString() {
        return "DurationField[" + getName() + ']';
    }
}
