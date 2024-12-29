package org.joda.time.chrono;

import org.joda.time.C10149c;
import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.C10179e;
import org.joda.time.field.ImpreciseDateTimeField;

/* renamed from: org.joda.time.chrono.c */
class C10161c extends ImpreciseDateTimeField {

    /* renamed from: d */
    private final BasicChronology f18803d;

    /* renamed from: e */
    private final int f18804e;

    /* renamed from: f */
    private final int f18805f;

    C10161c(BasicChronology basicChronology, int i) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.f18803d = basicChronology;
        this.f18804e = basicChronology.getMaxMonth();
        this.f18805f = i;
    }

    public long add(long j, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return j;
        }
        long millisOfDay = (long) this.f18803d.getMillisOfDay(j);
        int year = this.f18803d.getYear(j);
        int monthOfYear = this.f18803d.getMonthOfYear(j, year);
        int i4 = (monthOfYear - 1) + i;
        int i5 = this.f18804e;
        if (i4 >= 0) {
            i2 = (i4 / i5) + year;
            i3 = (i4 % i5) + 1;
        } else {
            i2 = ((i4 / i5) + year) - 1;
            int abs = Math.abs(i4);
            int i6 = this.f18804e;
            int i7 = abs % i6;
            if (i7 == 0) {
                i7 = i6;
            }
            i3 = (i6 - i7) + 1;
            if (i3 == 1) {
                i2++;
            }
        }
        int dayOfMonth = this.f18803d.getDayOfMonth(j, year, monthOfYear);
        int daysInYearMonth = this.f18803d.getDaysInYearMonth(i2, i3);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.f18803d.getYearMonthDayMillis(i2, i3, dayOfMonth) + millisOfDay;
    }

    public long add(long j, long j2) {
        long j3;
        long j4;
        long j5 = j;
        long j6 = j2;
        int i = (int) j6;
        if (((long) i) == j6) {
            return add(j5, i);
        }
        long millisOfDay = (long) this.f18803d.getMillisOfDay(j5);
        int year = this.f18803d.getYear(j5);
        int monthOfYear = this.f18803d.getMonthOfYear(j5, year);
        long j7 = ((long) (monthOfYear - 1)) + j6;
        if (j7 >= 0) {
            int i2 = this.f18804e;
            j3 = ((long) year) + (j7 / ((long) i2));
            j4 = (j7 % ((long) i2)) + 1;
        } else {
            j3 = (((long) year) + (j7 / ((long) this.f18804e))) - 1;
            long abs = Math.abs(j7);
            int i3 = this.f18804e;
            int i4 = (int) (abs % ((long) i3));
            if (i4 == 0) {
                i4 = i3;
            }
            j4 = (long) ((i3 - i4) + 1);
            if (j4 == 1) {
                j3++;
            }
        }
        if (j3 < ((long) this.f18803d.getMinYear()) || j3 > ((long) this.f18803d.getMaxYear())) {
            throw new IllegalArgumentException("Magnitude of add amount is too large: " + j6);
        }
        int i5 = (int) j3;
        int i6 = (int) j4;
        int dayOfMonth = this.f18803d.getDayOfMonth(j5, year, monthOfYear);
        int daysInYearMonth = this.f18803d.getDaysInYearMonth(i5, i6);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.f18803d.getYearMonthDayMillis(i5, i6, dayOfMonth) + millisOfDay;
    }

    public int[] add(C10224k kVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        if (kVar.size() > 0 && kVar.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i == 0) {
            return set(kVar, 0, iArr, ((((kVar.getValue(0) - 1) + (i2 % 12)) + 12) % 12) + 1);
        }
        if (!C10149c.m25348m(kVar)) {
            return super.add(kVar, i, iArr, i2);
        }
        long j = 0;
        int size = kVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            j = kVar.getFieldType(i3).getField(this.f18803d).set(j, iArr[i3]);
        }
        return this.f18803d.get(kVar, add(j, i2));
    }

    public long addWrapField(long j, int i) {
        return set(j, C10179e.m25387c(get(j), i, 1, this.f18804e));
    }

    public int get(long j) {
        return this.f18803d.getMonthOfYear(j);
    }

    public long getDifferenceAsLong(long j, long j2) {
        if (j < j2) {
            return (long) (-getDifference(j2, j));
        }
        int year = this.f18803d.getYear(j);
        int monthOfYear = this.f18803d.getMonthOfYear(j, year);
        int year2 = this.f18803d.getYear(j2);
        int monthOfYear2 = this.f18803d.getMonthOfYear(j2, year2);
        long j3 = ((((long) (year - year2)) * ((long) this.f18804e)) + ((long) monthOfYear)) - ((long) monthOfYear2);
        int dayOfMonth = this.f18803d.getDayOfMonth(j, year, monthOfYear);
        if (dayOfMonth == this.f18803d.getDaysInYearMonth(year, monthOfYear) && this.f18803d.getDayOfMonth(j2, year2, monthOfYear2) > dayOfMonth) {
            j2 = this.f18803d.dayOfMonth().set(j2, dayOfMonth);
        }
        return j - this.f18803d.getYearMonthMillis(year, monthOfYear) < j2 - this.f18803d.getYearMonthMillis(year2, monthOfYear2) ? j3 - 1 : j3;
    }

    public int getLeapAmount(long j) {
        return isLeap(j) ? 1 : 0;
    }

    public C10172d getLeapDurationField() {
        return this.f18803d.days();
    }

    public int getMaximumValue() {
        return this.f18804e;
    }

    public int getMinimumValue() {
        return 1;
    }

    public C10172d getRangeDurationField() {
        return this.f18803d.years();
    }

    public boolean isLeap(long j) {
        int year = this.f18803d.getYear(j);
        return this.f18803d.isLeapYear(year) && this.f18803d.getMonthOfYear(j, year) == this.f18805f;
    }

    public boolean isLenient() {
        return false;
    }

    public long remainder(long j) {
        return j - roundFloor(j);
    }

    public long roundFloor(long j) {
        int year = this.f18803d.getYear(j);
        return this.f18803d.getYearMonthMillis(year, this.f18803d.getMonthOfYear(j, year));
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, 1, this.f18804e);
        int year = this.f18803d.getYear(j);
        int dayOfMonth = this.f18803d.getDayOfMonth(j, year);
        int daysInYearMonth = this.f18803d.getDaysInYearMonth(year, i);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.f18803d.getYearMonthDayMillis(year, i, dayOfMonth) + ((long) this.f18803d.getMillisOfDay(j));
    }
}
