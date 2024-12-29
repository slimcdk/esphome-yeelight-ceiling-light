package org.joda.time.chrono;

import java.io.ObjectInputStream;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.DateTimeZone;

public abstract class AssembledChronology extends BaseChronology {
    private static final long serialVersionUID = -6728465968995518215L;
    private final C10142a iBase;
    private transient int iBaseFlags;
    private transient C10172d iCenturies;
    private transient C10143b iCenturyOfEra;
    private transient C10143b iClockhourOfDay;
    private transient C10143b iClockhourOfHalfday;
    private transient C10143b iDayOfMonth;
    private transient C10143b iDayOfWeek;
    private transient C10143b iDayOfYear;
    private transient C10172d iDays;
    private transient C10143b iEra;
    private transient C10172d iEras;
    private transient C10143b iHalfdayOfDay;
    private transient C10172d iHalfdays;
    private transient C10143b iHourOfDay;
    private transient C10143b iHourOfHalfday;
    private transient C10172d iHours;
    private transient C10172d iMillis;
    private transient C10143b iMillisOfDay;
    private transient C10143b iMillisOfSecond;
    private transient C10143b iMinuteOfDay;
    private transient C10143b iMinuteOfHour;
    private transient C10172d iMinutes;
    private transient C10143b iMonthOfYear;
    private transient C10172d iMonths;
    private final Object iParam;
    private transient C10143b iSecondOfDay;
    private transient C10143b iSecondOfMinute;
    private transient C10172d iSeconds;
    private transient C10143b iWeekOfWeekyear;
    private transient C10172d iWeeks;
    private transient C10143b iWeekyear;
    private transient C10143b iWeekyearOfCentury;
    private transient C10172d iWeekyears;
    private transient C10143b iYear;
    private transient C10143b iYearOfCentury;
    private transient C10143b iYearOfEra;
    private transient C10172d iYears;

    /* renamed from: org.joda.time.chrono.AssembledChronology$a */
    public static final class C10152a {

        /* renamed from: A */
        public C10143b f18742A;

        /* renamed from: B */
        public C10143b f18743B;

        /* renamed from: C */
        public C10143b f18744C;

        /* renamed from: D */
        public C10143b f18745D;

        /* renamed from: E */
        public C10143b f18746E;

        /* renamed from: F */
        public C10143b f18747F;

        /* renamed from: G */
        public C10143b f18748G;

        /* renamed from: H */
        public C10143b f18749H;

        /* renamed from: I */
        public C10143b f18750I;

        /* renamed from: a */
        public C10172d f18751a;

        /* renamed from: b */
        public C10172d f18752b;

        /* renamed from: c */
        public C10172d f18753c;

        /* renamed from: d */
        public C10172d f18754d;

        /* renamed from: e */
        public C10172d f18755e;

        /* renamed from: f */
        public C10172d f18756f;

        /* renamed from: g */
        public C10172d f18757g;

        /* renamed from: h */
        public C10172d f18758h;

        /* renamed from: i */
        public C10172d f18759i;

        /* renamed from: j */
        public C10172d f18760j;

        /* renamed from: k */
        public C10172d f18761k;

        /* renamed from: l */
        public C10172d f18762l;

        /* renamed from: m */
        public C10143b f18763m;

        /* renamed from: n */
        public C10143b f18764n;

        /* renamed from: o */
        public C10143b f18765o;

        /* renamed from: p */
        public C10143b f18766p;

        /* renamed from: q */
        public C10143b f18767q;

        /* renamed from: r */
        public C10143b f18768r;

        /* renamed from: s */
        public C10143b f18769s;

        /* renamed from: t */
        public C10143b f18770t;

        /* renamed from: u */
        public C10143b f18771u;

        /* renamed from: v */
        public C10143b f18772v;

        /* renamed from: w */
        public C10143b f18773w;

        /* renamed from: x */
        public C10143b f18774x;

        /* renamed from: y */
        public C10143b f18775y;

        /* renamed from: z */
        public C10143b f18776z;

        C10152a() {
        }

        /* renamed from: b */
        private static boolean m25350b(C10143b bVar) {
            if (bVar == null) {
                return false;
            }
            return bVar.isSupported();
        }

        /* renamed from: c */
        private static boolean m25351c(C10172d dVar) {
            if (dVar == null) {
                return false;
            }
            return dVar.isSupported();
        }

        /* renamed from: a */
        public void mo41187a(C10142a aVar) {
            C10172d millis = aVar.millis();
            if (m25351c(millis)) {
                this.f18751a = millis;
            }
            C10172d seconds = aVar.seconds();
            if (m25351c(seconds)) {
                this.f18752b = seconds;
            }
            C10172d minutes = aVar.minutes();
            if (m25351c(minutes)) {
                this.f18753c = minutes;
            }
            C10172d hours = aVar.hours();
            if (m25351c(hours)) {
                this.f18754d = hours;
            }
            C10172d halfdays = aVar.halfdays();
            if (m25351c(halfdays)) {
                this.f18755e = halfdays;
            }
            C10172d days = aVar.days();
            if (m25351c(days)) {
                this.f18756f = days;
            }
            C10172d weeks = aVar.weeks();
            if (m25351c(weeks)) {
                this.f18757g = weeks;
            }
            C10172d weekyears = aVar.weekyears();
            if (m25351c(weekyears)) {
                this.f18758h = weekyears;
            }
            C10172d months = aVar.months();
            if (m25351c(months)) {
                this.f18759i = months;
            }
            C10172d years = aVar.years();
            if (m25351c(years)) {
                this.f18760j = years;
            }
            C10172d centuries = aVar.centuries();
            if (m25351c(centuries)) {
                this.f18761k = centuries;
            }
            C10172d eras = aVar.eras();
            if (m25351c(eras)) {
                this.f18762l = eras;
            }
            C10143b millisOfSecond = aVar.millisOfSecond();
            if (m25350b(millisOfSecond)) {
                this.f18763m = millisOfSecond;
            }
            C10143b millisOfDay = aVar.millisOfDay();
            if (m25350b(millisOfDay)) {
                this.f18764n = millisOfDay;
            }
            C10143b secondOfMinute = aVar.secondOfMinute();
            if (m25350b(secondOfMinute)) {
                this.f18765o = secondOfMinute;
            }
            C10143b secondOfDay = aVar.secondOfDay();
            if (m25350b(secondOfDay)) {
                this.f18766p = secondOfDay;
            }
            C10143b minuteOfHour = aVar.minuteOfHour();
            if (m25350b(minuteOfHour)) {
                this.f18767q = minuteOfHour;
            }
            C10143b minuteOfDay = aVar.minuteOfDay();
            if (m25350b(minuteOfDay)) {
                this.f18768r = minuteOfDay;
            }
            C10143b hourOfDay = aVar.hourOfDay();
            if (m25350b(hourOfDay)) {
                this.f18769s = hourOfDay;
            }
            C10143b clockhourOfDay = aVar.clockhourOfDay();
            if (m25350b(clockhourOfDay)) {
                this.f18770t = clockhourOfDay;
            }
            C10143b hourOfHalfday = aVar.hourOfHalfday();
            if (m25350b(hourOfHalfday)) {
                this.f18771u = hourOfHalfday;
            }
            C10143b clockhourOfHalfday = aVar.clockhourOfHalfday();
            if (m25350b(clockhourOfHalfday)) {
                this.f18772v = clockhourOfHalfday;
            }
            C10143b halfdayOfDay = aVar.halfdayOfDay();
            if (m25350b(halfdayOfDay)) {
                this.f18773w = halfdayOfDay;
            }
            C10143b dayOfWeek = aVar.dayOfWeek();
            if (m25350b(dayOfWeek)) {
                this.f18774x = dayOfWeek;
            }
            C10143b dayOfMonth = aVar.dayOfMonth();
            if (m25350b(dayOfMonth)) {
                this.f18775y = dayOfMonth;
            }
            C10143b dayOfYear = aVar.dayOfYear();
            if (m25350b(dayOfYear)) {
                this.f18776z = dayOfYear;
            }
            C10143b weekOfWeekyear = aVar.weekOfWeekyear();
            if (m25350b(weekOfWeekyear)) {
                this.f18742A = weekOfWeekyear;
            }
            C10143b weekyear = aVar.weekyear();
            if (m25350b(weekyear)) {
                this.f18743B = weekyear;
            }
            C10143b weekyearOfCentury = aVar.weekyearOfCentury();
            if (m25350b(weekyearOfCentury)) {
                this.f18744C = weekyearOfCentury;
            }
            C10143b monthOfYear = aVar.monthOfYear();
            if (m25350b(monthOfYear)) {
                this.f18745D = monthOfYear;
            }
            C10143b year = aVar.year();
            if (m25350b(year)) {
                this.f18746E = year;
            }
            C10143b yearOfEra = aVar.yearOfEra();
            if (m25350b(yearOfEra)) {
                this.f18747F = yearOfEra;
            }
            C10143b yearOfCentury = aVar.yearOfCentury();
            if (m25350b(yearOfCentury)) {
                this.f18748G = yearOfCentury;
            }
            C10143b centuryOfEra = aVar.centuryOfEra();
            if (m25350b(centuryOfEra)) {
                this.f18749H = centuryOfEra;
            }
            C10143b era = aVar.era();
            if (m25350b(era)) {
                this.f18750I = era;
            }
        }
    }

    protected AssembledChronology(C10142a aVar, Object obj) {
        this.iBase = aVar;
        this.iParam = obj;
        setFields();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        setFields();
    }

    private void setFields() {
        C10152a aVar = new C10152a();
        C10142a aVar2 = this.iBase;
        if (aVar2 != null) {
            aVar.mo41187a(aVar2);
        }
        assemble(aVar);
        C10172d dVar = aVar.f18751a;
        if (dVar == null) {
            dVar = super.millis();
        }
        this.iMillis = dVar;
        C10172d dVar2 = aVar.f18752b;
        if (dVar2 == null) {
            dVar2 = super.seconds();
        }
        this.iSeconds = dVar2;
        C10172d dVar3 = aVar.f18753c;
        if (dVar3 == null) {
            dVar3 = super.minutes();
        }
        this.iMinutes = dVar3;
        C10172d dVar4 = aVar.f18754d;
        if (dVar4 == null) {
            dVar4 = super.hours();
        }
        this.iHours = dVar4;
        C10172d dVar5 = aVar.f18755e;
        if (dVar5 == null) {
            dVar5 = super.halfdays();
        }
        this.iHalfdays = dVar5;
        C10172d dVar6 = aVar.f18756f;
        if (dVar6 == null) {
            dVar6 = super.days();
        }
        this.iDays = dVar6;
        C10172d dVar7 = aVar.f18757g;
        if (dVar7 == null) {
            dVar7 = super.weeks();
        }
        this.iWeeks = dVar7;
        C10172d dVar8 = aVar.f18758h;
        if (dVar8 == null) {
            dVar8 = super.weekyears();
        }
        this.iWeekyears = dVar8;
        C10172d dVar9 = aVar.f18759i;
        if (dVar9 == null) {
            dVar9 = super.months();
        }
        this.iMonths = dVar9;
        C10172d dVar10 = aVar.f18760j;
        if (dVar10 == null) {
            dVar10 = super.years();
        }
        this.iYears = dVar10;
        C10172d dVar11 = aVar.f18761k;
        if (dVar11 == null) {
            dVar11 = super.centuries();
        }
        this.iCenturies = dVar11;
        C10172d dVar12 = aVar.f18762l;
        if (dVar12 == null) {
            dVar12 = super.eras();
        }
        this.iEras = dVar12;
        C10143b bVar = aVar.f18763m;
        if (bVar == null) {
            bVar = super.millisOfSecond();
        }
        this.iMillisOfSecond = bVar;
        C10143b bVar2 = aVar.f18764n;
        if (bVar2 == null) {
            bVar2 = super.millisOfDay();
        }
        this.iMillisOfDay = bVar2;
        C10143b bVar3 = aVar.f18765o;
        if (bVar3 == null) {
            bVar3 = super.secondOfMinute();
        }
        this.iSecondOfMinute = bVar3;
        C10143b bVar4 = aVar.f18766p;
        if (bVar4 == null) {
            bVar4 = super.secondOfDay();
        }
        this.iSecondOfDay = bVar4;
        C10143b bVar5 = aVar.f18767q;
        if (bVar5 == null) {
            bVar5 = super.minuteOfHour();
        }
        this.iMinuteOfHour = bVar5;
        C10143b bVar6 = aVar.f18768r;
        if (bVar6 == null) {
            bVar6 = super.minuteOfDay();
        }
        this.iMinuteOfDay = bVar6;
        C10143b bVar7 = aVar.f18769s;
        if (bVar7 == null) {
            bVar7 = super.hourOfDay();
        }
        this.iHourOfDay = bVar7;
        C10143b bVar8 = aVar.f18770t;
        if (bVar8 == null) {
            bVar8 = super.clockhourOfDay();
        }
        this.iClockhourOfDay = bVar8;
        C10143b bVar9 = aVar.f18771u;
        if (bVar9 == null) {
            bVar9 = super.hourOfHalfday();
        }
        this.iHourOfHalfday = bVar9;
        C10143b bVar10 = aVar.f18772v;
        if (bVar10 == null) {
            bVar10 = super.clockhourOfHalfday();
        }
        this.iClockhourOfHalfday = bVar10;
        C10143b bVar11 = aVar.f18773w;
        if (bVar11 == null) {
            bVar11 = super.halfdayOfDay();
        }
        this.iHalfdayOfDay = bVar11;
        C10143b bVar12 = aVar.f18774x;
        if (bVar12 == null) {
            bVar12 = super.dayOfWeek();
        }
        this.iDayOfWeek = bVar12;
        C10143b bVar13 = aVar.f18775y;
        if (bVar13 == null) {
            bVar13 = super.dayOfMonth();
        }
        this.iDayOfMonth = bVar13;
        C10143b bVar14 = aVar.f18776z;
        if (bVar14 == null) {
            bVar14 = super.dayOfYear();
        }
        this.iDayOfYear = bVar14;
        C10143b bVar15 = aVar.f18742A;
        if (bVar15 == null) {
            bVar15 = super.weekOfWeekyear();
        }
        this.iWeekOfWeekyear = bVar15;
        C10143b bVar16 = aVar.f18743B;
        if (bVar16 == null) {
            bVar16 = super.weekyear();
        }
        this.iWeekyear = bVar16;
        C10143b bVar17 = aVar.f18744C;
        if (bVar17 == null) {
            bVar17 = super.weekyearOfCentury();
        }
        this.iWeekyearOfCentury = bVar17;
        C10143b bVar18 = aVar.f18745D;
        if (bVar18 == null) {
            bVar18 = super.monthOfYear();
        }
        this.iMonthOfYear = bVar18;
        C10143b bVar19 = aVar.f18746E;
        if (bVar19 == null) {
            bVar19 = super.year();
        }
        this.iYear = bVar19;
        C10143b bVar20 = aVar.f18747F;
        if (bVar20 == null) {
            bVar20 = super.yearOfEra();
        }
        this.iYearOfEra = bVar20;
        C10143b bVar21 = aVar.f18748G;
        if (bVar21 == null) {
            bVar21 = super.yearOfCentury();
        }
        this.iYearOfCentury = bVar21;
        C10143b bVar22 = aVar.f18749H;
        if (bVar22 == null) {
            bVar22 = super.centuryOfEra();
        }
        this.iCenturyOfEra = bVar22;
        C10143b bVar23 = aVar.f18750I;
        if (bVar23 == null) {
            bVar23 = super.era();
        }
        this.iEra = bVar23;
        C10142a aVar3 = this.iBase;
        int i = 0;
        if (aVar3 != null) {
            int i2 = ((this.iHourOfDay == aVar3.hourOfDay() && this.iMinuteOfHour == this.iBase.minuteOfHour() && this.iSecondOfMinute == this.iBase.secondOfMinute() && this.iMillisOfSecond == this.iBase.millisOfSecond()) ? 1 : 0) | (this.iMillisOfDay == this.iBase.millisOfDay() ? 2 : 0);
            if (this.iYear == this.iBase.year() && this.iMonthOfYear == this.iBase.monthOfYear() && this.iDayOfMonth == this.iBase.dayOfMonth()) {
                i = 4;
            }
            i |= i2;
        }
        this.iBaseFlags = i;
    }

    /* access modifiers changed from: protected */
    public abstract void assemble(C10152a aVar);

    public final C10172d centuries() {
        return this.iCenturies;
    }

    public final C10143b centuryOfEra() {
        return this.iCenturyOfEra;
    }

    public final C10143b clockhourOfDay() {
        return this.iClockhourOfDay;
    }

    public final C10143b clockhourOfHalfday() {
        return this.iClockhourOfHalfday;
    }

    public final C10143b dayOfMonth() {
        return this.iDayOfMonth;
    }

    public final C10143b dayOfWeek() {
        return this.iDayOfWeek;
    }

    public final C10143b dayOfYear() {
        return this.iDayOfYear;
    }

    public final C10172d days() {
        return this.iDays;
    }

    public final C10143b era() {
        return this.iEra;
    }

    public final C10172d eras() {
        return this.iEras;
    }

    /* access modifiers changed from: protected */
    public final C10142a getBase() {
        return this.iBase;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) {
        C10142a aVar = this.iBase;
        return (aVar == null || (this.iBaseFlags & 6) != 6) ? super.getDateTimeMillis(i, i2, i3, i4) : aVar.getDateTimeMillis(i, i2, i3, i4);
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C10142a aVar = this.iBase;
        return (aVar == null || (this.iBaseFlags & 5) != 5) ? super.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7) : aVar.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
    }

    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) {
        C10142a aVar = this.iBase;
        return (aVar == null || (this.iBaseFlags & 1) != 1) ? super.getDateTimeMillis(j, i, i2, i3, i4) : aVar.getDateTimeMillis(j, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final Object getParam() {
        return this.iParam;
    }

    public DateTimeZone getZone() {
        C10142a aVar = this.iBase;
        if (aVar != null) {
            return aVar.getZone();
        }
        return null;
    }

    public final C10143b halfdayOfDay() {
        return this.iHalfdayOfDay;
    }

    public final C10172d halfdays() {
        return this.iHalfdays;
    }

    public final C10143b hourOfDay() {
        return this.iHourOfDay;
    }

    public final C10143b hourOfHalfday() {
        return this.iHourOfHalfday;
    }

    public final C10172d hours() {
        return this.iHours;
    }

    public final C10172d millis() {
        return this.iMillis;
    }

    public final C10143b millisOfDay() {
        return this.iMillisOfDay;
    }

    public final C10143b millisOfSecond() {
        return this.iMillisOfSecond;
    }

    public final C10143b minuteOfDay() {
        return this.iMinuteOfDay;
    }

    public final C10143b minuteOfHour() {
        return this.iMinuteOfHour;
    }

    public final C10172d minutes() {
        return this.iMinutes;
    }

    public final C10143b monthOfYear() {
        return this.iMonthOfYear;
    }

    public final C10172d months() {
        return this.iMonths;
    }

    public final C10143b secondOfDay() {
        return this.iSecondOfDay;
    }

    public final C10143b secondOfMinute() {
        return this.iSecondOfMinute;
    }

    public final C10172d seconds() {
        return this.iSeconds;
    }

    public final C10143b weekOfWeekyear() {
        return this.iWeekOfWeekyear;
    }

    public final C10172d weeks() {
        return this.iWeeks;
    }

    public final C10143b weekyear() {
        return this.iWeekyear;
    }

    public final C10143b weekyearOfCentury() {
        return this.iWeekyearOfCentury;
    }

    public final C10172d weekyears() {
        return this.iWeekyears;
    }

    public final C10143b year() {
        return this.iYear;
    }

    public final C10143b yearOfCentury() {
        return this.iYearOfCentury;
    }

    public final C10143b yearOfEra() {
        return this.iYearOfEra;
    }

    public final C10172d years() {
        return this.iYears;
    }
}
