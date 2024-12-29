package org.joda.time.chrono;

import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C10179e;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.g */
class C10165g extends ImpreciseDateTimeField {

    /* renamed from: d */
    protected final BasicChronology f18809d;

    C10165g(BasicChronology basicChronology) {
        super(DateTimeFieldType.year(), basicChronology.getAverageMillisPerYear());
        this.f18809d = basicChronology;
    }

    public long add(long j, int i) {
        return i == 0 ? j : set(j, C10179e.m25388d(get(j), i));
    }

    public long add(long j, long j2) {
        return add(j, C10179e.m25395k(j2));
    }

    public long addWrapField(long j, int i) {
        return i == 0 ? j : set(j, C10179e.m25387c(this.f18809d.getYear(j), i, this.f18809d.getMinYear(), this.f18809d.getMaxYear()));
    }

    public int get(long j) {
        return this.f18809d.getYear(j);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return j < j2 ? -this.f18809d.getYearDifference(j2, j) : this.f18809d.getYearDifference(j, j2);
    }

    public int getLeapAmount(long j) {
        return this.f18809d.isLeapYear(get(j)) ? 1 : 0;
    }

    public C10172d getLeapDurationField() {
        return this.f18809d.days();
    }

    public int getMaximumValue() {
        return this.f18809d.getMaxYear();
    }

    public int getMinimumValue() {
        return this.f18809d.getMinYear();
    }

    public C10172d getRangeDurationField() {
        return null;
    }

    public boolean isLeap(long j) {
        return this.f18809d.isLeapYear(get(j));
    }

    public boolean isLenient() {
        return false;
    }

    public long remainder(long j) {
        return j - roundFloor(j);
    }

    public long roundCeiling(long j) {
        int i = get(j);
        return j != this.f18809d.getYearMillis(i) ? this.f18809d.getYearMillis(i + 1) : j;
    }

    public long roundFloor(long j) {
        return this.f18809d.getYearMillis(get(j));
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, this.f18809d.getMinYear(), this.f18809d.getMaxYear());
        return this.f18809d.setYear(j, i);
    }
}
