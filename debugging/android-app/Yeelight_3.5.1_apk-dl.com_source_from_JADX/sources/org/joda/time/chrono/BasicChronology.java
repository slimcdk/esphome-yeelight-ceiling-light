package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C10178d;
import org.joda.time.field.C10179e;
import org.joda.time.field.C10180f;
import org.joda.time.field.C10181g;
import org.joda.time.field.C10183i;
import org.joda.time.field.C10184j;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;

abstract class BasicChronology extends AssembledChronology {
    private static final int CACHE_MASK = 1023;
    private static final int CACHE_SIZE = 1024;
    private static final C10143b cClockhourOfDayField;
    private static final C10143b cClockhourOfHalfdayField;
    /* access modifiers changed from: private */
    public static final C10172d cDaysField;
    private static final C10143b cHalfdayOfDayField = new C10153a();
    /* access modifiers changed from: private */
    public static final C10172d cHalfdaysField;
    private static final C10143b cHourOfDayField;
    private static final C10143b cHourOfHalfdayField;
    private static final C10172d cHoursField;
    private static final C10172d cMillisField;
    private static final C10143b cMillisOfDayField;
    private static final C10143b cMillisOfSecondField;
    private static final C10143b cMinuteOfDayField;
    private static final C10143b cMinuteOfHourField;
    private static final C10172d cMinutesField;
    private static final C10143b cSecondOfDayField;
    private static final C10143b cSecondOfMinuteField;
    private static final C10172d cSecondsField;
    private static final C10172d cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), 604800000);
    private static final long serialVersionUID = 8283225332206808863L;
    private final int iMinDaysInFirstWeek;
    private final transient C10154b[] iYearInfoCache = new C10154b[1024];

    /* renamed from: org.joda.time.chrono.BasicChronology$a */
    private static class C10153a extends C10181g {
        C10153a() {
            super(DateTimeFieldType.halfdayOfDay(), BasicChronology.cHalfdaysField, BasicChronology.cDaysField);
        }

        public String getAsText(int i, Locale locale) {
            return C10168j.m25362h(locale).mo41285p(i);
        }

        public int getMaximumTextLength(Locale locale) {
            return C10168j.m25362h(locale).mo41281l();
        }

        public long set(long j, String str, Locale locale) {
            return set(j, C10168j.m25362h(locale).mo41284o(str));
        }
    }

    /* renamed from: org.joda.time.chrono.BasicChronology$b */
    private static class C10154b {

        /* renamed from: a */
        public final int f18777a;

        /* renamed from: b */
        public final long f18778b;

        C10154b(int i, long j) {
            this.f18777a = i;
            this.f18778b = j;
        }
    }

    static {
        C10172d dVar = MillisDurationField.INSTANCE;
        cMillisField = dVar;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
        cSecondsField = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.minutes(), 60000);
        cMinutesField = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.hours(), 3600000);
        cHoursField = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.halfdays(), 43200000);
        cHalfdaysField = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.days(), 86400000);
        cDaysField = preciseDurationField5;
        cMillisOfSecondField = new C10181g(DateTimeFieldType.millisOfSecond(), dVar, preciseDurationField);
        cMillisOfDayField = new C10181g(DateTimeFieldType.millisOfDay(), dVar, preciseDurationField5);
        cSecondOfMinuteField = new C10181g(DateTimeFieldType.secondOfMinute(), preciseDurationField, preciseDurationField2);
        cSecondOfDayField = new C10181g(DateTimeFieldType.secondOfDay(), preciseDurationField, preciseDurationField5);
        cMinuteOfHourField = new C10181g(DateTimeFieldType.minuteOfHour(), preciseDurationField2, preciseDurationField3);
        cMinuteOfDayField = new C10181g(DateTimeFieldType.minuteOfDay(), preciseDurationField2, preciseDurationField5);
        C10181g gVar = new C10181g(DateTimeFieldType.hourOfDay(), preciseDurationField3, preciseDurationField5);
        cHourOfDayField = gVar;
        C10181g gVar2 = new C10181g(DateTimeFieldType.hourOfHalfday(), preciseDurationField3, preciseDurationField4);
        cHourOfHalfdayField = gVar2;
        cClockhourOfDayField = new C10184j(gVar, DateTimeFieldType.clockhourOfDay());
        cClockhourOfHalfdayField = new C10184j(gVar2, DateTimeFieldType.clockhourOfHalfday());
    }

    BasicChronology(C10142a aVar, Object obj, int i) {
        super(aVar, obj);
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Invalid min days in first week: " + i);
        }
        this.iMinDaysInFirstWeek = i;
    }

    private C10154b getYearInfo(int i) {
        C10154b[] bVarArr = this.iYearInfoCache;
        int i2 = i & CACHE_MASK;
        C10154b bVar = bVarArr[i2];
        if (bVar != null && bVar.f18777a == i) {
            return bVar;
        }
        C10154b bVar2 = new C10154b(i, calculateFirstDayOfYearMillis(i));
        this.iYearInfoCache[i2] = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void assemble(AssembledChronology.C10152a aVar) {
        aVar.f18751a = cMillisField;
        aVar.f18752b = cSecondsField;
        aVar.f18753c = cMinutesField;
        aVar.f18754d = cHoursField;
        aVar.f18755e = cHalfdaysField;
        aVar.f18756f = cDaysField;
        aVar.f18757g = cWeeksField;
        aVar.f18763m = cMillisOfSecondField;
        aVar.f18764n = cMillisOfDayField;
        aVar.f18765o = cSecondOfMinuteField;
        aVar.f18766p = cSecondOfDayField;
        aVar.f18767q = cMinuteOfHourField;
        aVar.f18768r = cMinuteOfDayField;
        aVar.f18769s = cHourOfDayField;
        aVar.f18771u = cHourOfHalfdayField;
        aVar.f18770t = cClockhourOfDayField;
        aVar.f18772v = cClockhourOfHalfdayField;
        aVar.f18773w = cHalfdayOfDayField;
        C10165g gVar = new C10165g(this);
        aVar.f18746E = gVar;
        C10170l lVar = new C10170l(gVar, this);
        aVar.f18747F = lVar;
        C10178d dVar = new C10178d(new C10180f(lVar, 99), DateTimeFieldType.centuryOfEra(), 100);
        aVar.f18749H = dVar;
        aVar.f18748G = new C10180f(new C10183i(dVar), DateTimeFieldType.yearOfCentury(), 1);
        aVar.f18750I = new C10167i(this);
        aVar.f18774x = new C10166h(this, aVar.f18756f);
        aVar.f18775y = new C10159a(this, aVar.f18756f);
        aVar.f18776z = new C10160b(this, aVar.f18756f);
        aVar.f18745D = new C10169k(this);
        aVar.f18743B = new C10164f(this);
        aVar.f18742A = new C10163e(this, aVar.f18757g);
        aVar.f18744C = new C10180f(new C10183i(aVar.f18743B, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        aVar.f18760j = aVar.f18746E.getDurationField();
        aVar.f18761k = aVar.f18749H.getDurationField();
        aVar.f18759i = aVar.f18745D.getDurationField();
        aVar.f18758h = aVar.f18743B.getDurationField();
    }

    /* access modifiers changed from: package-private */
    public abstract long calculateFirstDayOfYearMillis(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        return getMinimumDaysInFirstWeek() == basicChronology.getMinimumDaysInFirstWeek() && getZone().equals(basicChronology.getZone());
    }

    /* access modifiers changed from: package-private */
    public abstract long getApproxMillisAtEpochDividedByTwo();

    /* access modifiers changed from: package-private */
    public abstract long getAverageMillisPerMonth();

    /* access modifiers changed from: package-private */
    public abstract long getAverageMillisPerYear();

    /* access modifiers changed from: package-private */
    public abstract long getAverageMillisPerYearDividedByTwo();

    /* access modifiers changed from: package-private */
    public long getDateMidnightMillis(int i, int i2, int i3) {
        C10179e.m25397m(DateTimeFieldType.year(), i, getMinYear(), getMaxYear());
        C10179e.m25397m(DateTimeFieldType.monthOfYear(), i2, 1, getMaxMonth(i));
        C10179e.m25397m(DateTimeFieldType.dayOfMonth(), i3, 1, getDaysInYearMonth(i, i2));
        return getYearMonthDayMillis(i, i2, i3);
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) {
        C10142a base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4);
        }
        C10179e.m25397m(DateTimeFieldType.millisOfDay(), i4, 0, 86399999);
        return getDateMidnightMillis(i, i2, i3) + ((long) i4);
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C10142a base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        C10179e.m25397m(DateTimeFieldType.hourOfDay(), i4, 0, 23);
        C10179e.m25397m(DateTimeFieldType.minuteOfHour(), i5, 0, 59);
        C10179e.m25397m(DateTimeFieldType.secondOfMinute(), i6, 0, 59);
        C10179e.m25397m(DateTimeFieldType.millisOfSecond(), i7, 0, 999);
        return getDateMidnightMillis(i, i2, i3) + ((long) (i4 * 3600000)) + ((long) (i5 * 60000)) + ((long) (i6 * 1000)) + ((long) i7);
    }

    /* access modifiers changed from: package-private */
    public int getDayOfMonth(long j) {
        int year = getYear(j);
        return getDayOfMonth(j, year, getMonthOfYear(j, year));
    }

    /* access modifiers changed from: package-private */
    public int getDayOfMonth(long j, int i) {
        return getDayOfMonth(j, i, getMonthOfYear(j, i));
    }

    /* access modifiers changed from: package-private */
    public int getDayOfMonth(long j, int i, int i2) {
        return ((int) ((j - (getYearMillis(i) + getTotalMillisByYearMonth(i, i2))) / 86400000)) + 1;
    }

    /* access modifiers changed from: package-private */
    public int getDayOfWeek(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* access modifiers changed from: package-private */
    public int getDayOfYear(long j) {
        return getDayOfYear(j, getYear(j));
    }

    /* access modifiers changed from: package-private */
    public int getDayOfYear(long j, int i) {
        return ((int) ((j - getYearMillis(i)) / 86400000)) + 1;
    }

    /* access modifiers changed from: package-private */
    public int getDaysInMonthMax() {
        return 31;
    }

    /* access modifiers changed from: package-private */
    public abstract int getDaysInMonthMax(int i);

    /* access modifiers changed from: package-private */
    public int getDaysInMonthMax(long j) {
        int year = getYear(j);
        return getDaysInYearMonth(year, getMonthOfYear(j, year));
    }

    /* access modifiers changed from: package-private */
    public int getDaysInMonthMaxForSet(long j, int i) {
        return getDaysInMonthMax(j);
    }

    /* access modifiers changed from: package-private */
    public int getDaysInYear(int i) {
        return isLeapYear(i) ? 366 : 365;
    }

    /* access modifiers changed from: package-private */
    public int getDaysInYearMax() {
        return 366;
    }

    /* access modifiers changed from: package-private */
    public abstract int getDaysInYearMonth(int i, int i2);

    /* access modifiers changed from: package-private */
    public long getFirstWeekOfYearMillis(int i) {
        long yearMillis = getYearMillis(i);
        int dayOfWeek = getDayOfWeek(yearMillis);
        return dayOfWeek > 8 - this.iMinDaysInFirstWeek ? yearMillis + (((long) (8 - dayOfWeek)) * 86400000) : yearMillis - (((long) (dayOfWeek - 1)) * 86400000);
    }

    /* access modifiers changed from: package-private */
    public int getMaxMonth() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    public int getMaxMonth(int i) {
        return getMaxMonth();
    }

    /* access modifiers changed from: package-private */
    public abstract int getMaxYear();

    /* access modifiers changed from: package-private */
    public int getMillisOfDay(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    /* access modifiers changed from: package-private */
    public abstract int getMinYear();

    public int getMinimumDaysInFirstWeek() {
        return this.iMinDaysInFirstWeek;
    }

    /* access modifiers changed from: package-private */
    public int getMonthOfYear(long j) {
        return getMonthOfYear(j, getYear(j));
    }

    /* access modifiers changed from: package-private */
    public abstract int getMonthOfYear(long j, int i);

    /* access modifiers changed from: package-private */
    public abstract long getTotalMillisByYearMonth(int i, int i2);

    /* access modifiers changed from: package-private */
    public int getWeekOfWeekyear(long j) {
        return getWeekOfWeekyear(j, getYear(j));
    }

    /* access modifiers changed from: package-private */
    public int getWeekOfWeekyear(long j, int i) {
        long firstWeekOfYearMillis = getFirstWeekOfYearMillis(i);
        if (j < firstWeekOfYearMillis) {
            return getWeeksInYear(i - 1);
        }
        if (j >= getFirstWeekOfYearMillis(i + 1)) {
            return 1;
        }
        return ((int) ((j - firstWeekOfYearMillis) / 604800000)) + 1;
    }

    /* access modifiers changed from: package-private */
    public int getWeeksInYear(int i) {
        return (int) ((getFirstWeekOfYearMillis(i + 1) - getFirstWeekOfYearMillis(i)) / 604800000);
    }

    /* access modifiers changed from: package-private */
    public int getWeekyear(long j) {
        long j2;
        int year = getYear(j);
        int weekOfWeekyear = getWeekOfWeekyear(j, year);
        if (weekOfWeekyear == 1) {
            j2 = j + 604800000;
        } else if (weekOfWeekyear <= 51) {
            return year;
        } else {
            j2 = j - 1209600000;
        }
        return getYear(j2);
    }

    /* access modifiers changed from: package-private */
    public int getYear(long j) {
        long averageMillisPerYearDividedByTwo = getAverageMillisPerYearDividedByTwo();
        long approxMillisAtEpochDividedByTwo = (j >> 1) + getApproxMillisAtEpochDividedByTwo();
        if (approxMillisAtEpochDividedByTwo < 0) {
            approxMillisAtEpochDividedByTwo = (approxMillisAtEpochDividedByTwo - averageMillisPerYearDividedByTwo) + 1;
        }
        int i = (int) (approxMillisAtEpochDividedByTwo / averageMillisPerYearDividedByTwo);
        long yearMillis = getYearMillis(i);
        long j2 = j - yearMillis;
        if (j2 < 0) {
            return i - 1;
        }
        long j3 = 31536000000L;
        if (j2 < 31536000000L) {
            return i;
        }
        if (isLeapYear(i)) {
            j3 = 31622400000L;
        }
        return yearMillis + j3 <= j ? i + 1 : i;
    }

    /* access modifiers changed from: package-private */
    public abstract long getYearDifference(long j, long j2);

    /* access modifiers changed from: package-private */
    public long getYearMillis(int i) {
        return getYearInfo(i).f18778b;
    }

    /* access modifiers changed from: package-private */
    public long getYearMonthDayMillis(int i, int i2, int i3) {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, i2) + (((long) (i3 - 1)) * 86400000);
    }

    /* access modifiers changed from: package-private */
    public long getYearMonthMillis(int i, int i2) {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, i2);
    }

    public DateTimeZone getZone() {
        C10142a base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public int hashCode() {
        return (getClass().getName().hashCode() * 11) + getZone().hashCode() + getMinimumDaysInFirstWeek();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean isLeapYear(int i);

    /* access modifiers changed from: package-private */
    public abstract long setYear(long j, int i);

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        DateTimeZone zone = getZone();
        if (zone != null) {
            sb.append(zone.getID());
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            sb.append(",mdfw=");
            sb.append(getMinimumDaysInFirstWeek());
        }
        sb.append(']');
        return sb.toString();
    }
}
