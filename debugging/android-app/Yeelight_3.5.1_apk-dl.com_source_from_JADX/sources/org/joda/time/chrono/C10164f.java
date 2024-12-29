package org.joda.time.chrono;

import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C10179e;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.f */
final class C10164f extends ImpreciseDateTimeField {

    /* renamed from: d */
    private final BasicChronology f18808d;

    C10164f(BasicChronology basicChronology) {
        super(DateTimeFieldType.weekyear(), basicChronology.getAverageMillisPerYear());
        this.f18808d = basicChronology;
    }

    public long add(long j, int i) {
        return i == 0 ? j : set(j, get(j) + i);
    }

    public long add(long j, long j2) {
        return add(j, C10179e.m25395k(j2));
    }

    public long addWrapField(long j, int i) {
        return add(j, i);
    }

    public int get(long j) {
        return this.f18808d.getWeekyear(j);
    }

    public long getDifferenceAsLong(long j, long j2) {
        if (j < j2) {
            return (long) (-getDifference(j2, j));
        }
        int i = get(j);
        int i2 = get(j2);
        long remainder = remainder(j);
        long remainder2 = remainder(j2);
        if (remainder2 >= 31449600000L && this.f18808d.getWeeksInYear(i) <= 52) {
            remainder2 -= 604800000;
        }
        int i3 = i - i2;
        if (remainder < remainder2) {
            i3--;
        }
        return (long) i3;
    }

    public int getLeapAmount(long j) {
        BasicChronology basicChronology = this.f18808d;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j)) - 52;
    }

    public C10172d getLeapDurationField() {
        return this.f18808d.weeks();
    }

    public int getMaximumValue() {
        return this.f18808d.getMaxYear();
    }

    public int getMinimumValue() {
        return this.f18808d.getMinYear();
    }

    public C10172d getRangeDurationField() {
        return null;
    }

    public boolean isLeap(long j) {
        BasicChronology basicChronology = this.f18808d;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j)) > 52;
    }

    public boolean isLenient() {
        return false;
    }

    public long remainder(long j) {
        return j - roundFloor(j);
    }

    public long roundFloor(long j) {
        long roundFloor = this.f18808d.weekOfWeekyear().roundFloor(j);
        int weekOfWeekyear = this.f18808d.getWeekOfWeekyear(roundFloor);
        return weekOfWeekyear > 1 ? roundFloor - (((long) (weekOfWeekyear - 1)) * 604800000) : roundFloor;
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, Math.abs(i), this.f18808d.getMinYear(), this.f18808d.getMaxYear());
        int i2 = get(j);
        if (i2 == i) {
            return j;
        }
        int dayOfWeek = this.f18808d.getDayOfWeek(j);
        int weeksInYear = this.f18808d.getWeeksInYear(i2);
        int weeksInYear2 = this.f18808d.getWeeksInYear(i);
        if (weeksInYear2 < weeksInYear) {
            weeksInYear = weeksInYear2;
        }
        int weekOfWeekyear = this.f18808d.getWeekOfWeekyear(j);
        if (weekOfWeekyear <= weeksInYear) {
            weeksInYear = weekOfWeekyear;
        }
        long year = this.f18808d.setYear(j, i);
        int i3 = get(year);
        if (i3 < i) {
            year += 604800000;
        } else if (i3 > i) {
            year -= 604800000;
        }
        return this.f18808d.dayOfWeek().set(year + (((long) (weeksInYear - this.f18808d.getWeekOfWeekyear(year))) * 604800000), dayOfWeek);
    }
}
