package org.joda.time;

/* renamed from: org.joda.time.d */
public abstract class C10172d implements Comparable<C10172d> {
    public abstract long add(long j, int i);

    public abstract long add(long j, long j2);

    public abstract int getDifference(long j, long j2);

    public abstract long getDifferenceAsLong(long j, long j2);

    public abstract long getMillis(int i);

    public abstract long getMillis(int i, long j);

    public abstract long getMillis(long j);

    public abstract long getMillis(long j, long j2);

    public abstract String getName();

    public abstract DurationFieldType getType();

    public abstract long getUnitMillis();

    public abstract int getValue(long j);

    public abstract int getValue(long j, long j2);

    public abstract long getValueAsLong(long j);

    public abstract long getValueAsLong(long j, long j2);

    public abstract boolean isPrecise();

    public abstract boolean isSupported();

    public long subtract(long j, int i) {
        return i == Integer.MIN_VALUE ? subtract(j, (long) i) : add(j, -i);
    }

    public long subtract(long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            return add(j, -j2);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }

    public abstract String toString();
}
