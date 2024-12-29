package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.C10172d;
import org.joda.time.DurationFieldType;

public final class MillisDurationField extends C10172d implements Serializable {
    public static final C10172d INSTANCE = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private MillisDurationField() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public long add(long j, int i) {
        return C10179e.m25389e(j, (long) i);
    }

    public long add(long j, long j2) {
        return C10179e.m25389e(j, j2);
    }

    public int compareTo(C10172d dVar) {
        long unitMillis = dVar.getUnitMillis();
        long unitMillis2 = getUnitMillis();
        if (unitMillis2 == unitMillis) {
            return 0;
        }
        return unitMillis2 < unitMillis ? -1 : 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MillisDurationField) && getUnitMillis() == ((MillisDurationField) obj).getUnitMillis();
    }

    public int getDifference(long j, long j2) {
        return C10179e.m25395k(C10179e.m25394j(j, j2));
    }

    public long getDifferenceAsLong(long j, long j2) {
        return C10179e.m25394j(j, j2);
    }

    public long getMillis(int i) {
        return (long) i;
    }

    public long getMillis(int i, long j) {
        return (long) i;
    }

    public long getMillis(long j) {
        return j;
    }

    public long getMillis(long j, long j2) {
        return j;
    }

    public String getName() {
        return "millis";
    }

    public DurationFieldType getType() {
        return DurationFieldType.millis();
    }

    public final long getUnitMillis() {
        return 1;
    }

    public int getValue(long j) {
        return C10179e.m25395k(j);
    }

    public int getValue(long j, long j2) {
        return C10179e.m25395k(j);
    }

    public long getValueAsLong(long j) {
        return j;
    }

    public long getValueAsLong(long j, long j2) {
        return j;
    }

    public int hashCode() {
        return (int) getUnitMillis();
    }

    public final boolean isPrecise() {
        return true;
    }

    public boolean isSupported() {
        return true;
    }

    public String toString() {
        return "DurationField[millis]";
    }
}
