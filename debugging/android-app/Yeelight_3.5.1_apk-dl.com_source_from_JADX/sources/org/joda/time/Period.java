package org.joda.time;

import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

public final class Period extends BasePeriod {
    public static final Period ZERO = new Period();
    private static final long serialVersionUID = 741052353876488155L;

    public Period() {
        super(0, (PeriodType) null, (C10142a) null);
    }

    public Period(int i, int i2, int i3, int i4) {
        super(0, 0, 0, 0, i, i2, i3, i4, PeriodType.standard());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4, i5, i6, i7, i8, PeriodType.standard());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        super(i, i2, i3, i4, i5, i6, i7, i8, periodType);
    }

    public Period(long j) {
        super(j);
    }

    public Period(long j, long j2) {
        super(j, j2, (PeriodType) null, (C10142a) null);
    }

    public Period(long j, long j2, PeriodType periodType) {
        super(j, j2, periodType, (C10142a) null);
    }

    public Period(long j, long j2, PeriodType periodType, C10142a aVar) {
        super(j, j2, periodType, aVar);
    }

    public Period(long j, long j2, C10142a aVar) {
        super(j, j2, (PeriodType) null, aVar);
    }

    public Period(long j, PeriodType periodType) {
        super(j, periodType, (C10142a) null);
    }

    public Period(long j, PeriodType periodType, C10142a aVar) {
        super(j, periodType, aVar);
    }

    public Period(long j, C10142a aVar) {
        super(j, (PeriodType) null, aVar);
    }

    public Period(Object obj) {
        super(obj, (PeriodType) null, (C10142a) null);
    }

    public Period(Object obj, PeriodType periodType) {
        super(obj, periodType, (C10142a) null);
    }

    public Period(Object obj, PeriodType periodType, C10142a aVar) {
        super(obj, periodType, aVar);
    }

    public Period(Object obj, C10142a aVar) {
        super(obj, (PeriodType) null, aVar);
    }

    public Period(C10221h hVar, C10222i iVar) {
        super(hVar, iVar, (PeriodType) null);
    }

    public Period(C10221h hVar, C10222i iVar, PeriodType periodType) {
        super(hVar, iVar, periodType);
    }

    public Period(C10222i iVar, C10221h hVar) {
        super(iVar, hVar, (PeriodType) null);
    }

    public Period(C10222i iVar, C10221h hVar, PeriodType periodType) {
        super(iVar, hVar, periodType);
    }

    public Period(C10222i iVar, C10222i iVar2) {
        super(iVar, iVar2, (PeriodType) null);
    }

    public Period(C10222i iVar, C10222i iVar2, PeriodType periodType) {
        super(iVar, iVar2, periodType);
    }

    public Period(C10224k kVar, C10224k kVar2) {
        super(kVar, kVar2, (PeriodType) null);
    }

    public Period(C10224k kVar, C10224k kVar2, PeriodType periodType) {
        super(kVar, kVar2, periodType);
    }

    private Period(int[] iArr, PeriodType periodType) {
        super(iArr, periodType);
    }

    private void checkYearsAndMonths(String str) {
        if (getMonths() != 0) {
            throw new UnsupportedOperationException("Cannot convert to " + str + " as this period contains months and months vary in length");
        } else if (getYears() != 0) {
            throw new UnsupportedOperationException("Cannot convert to " + str + " as this period contains years and years vary in length");
        }
    }

    public static Period days(int i) {
        return new Period(new int[]{0, 0, 0, i, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period fieldDifference(C10224k kVar, C10224k kVar2) {
        if (kVar == null || kVar2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        } else if (kVar.size() == kVar2.size()) {
            DurationFieldType[] durationFieldTypeArr = new DurationFieldType[kVar.size()];
            int[] iArr = new int[kVar.size()];
            int i = 0;
            int size = kVar.size();
            while (i < size) {
                if (kVar.getFieldType(i) == kVar2.getFieldType(i)) {
                    durationFieldTypeArr[i] = kVar.getFieldType(i).getDurationType();
                    if (i <= 0 || durationFieldTypeArr[i - 1] != durationFieldTypeArr[i]) {
                        iArr[i] = kVar2.getValue(i) - kVar.getValue(i);
                        i++;
                    } else {
                        throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
                    }
                } else {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
            }
            return new Period(iArr, PeriodType.forFields(durationFieldTypeArr));
        } else {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
    }

    public static Period hours(int i) {
        return new Period(new int[]{0, 0, 0, 0, i, 0, 0, 0}, PeriodType.standard());
    }

    public static Period millis(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, 0, i}, PeriodType.standard());
    }

    public static Period minutes(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, i, 0, 0}, PeriodType.standard());
    }

    public static Period months(int i) {
        return new Period(new int[]{0, i, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    @FromString
    public static Period parse(String str) {
        return parse(str, C10208g.m25627a());
    }

    public static Period parse(String str, C10209h hVar) {
        return hVar.mo41469h(str);
    }

    public static Period seconds(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, i, 0}, PeriodType.standard());
    }

    public static Period weeks(int i) {
        return new Period(new int[]{0, 0, i, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period years(int i) {
        return new Period(new int[]{i, 0, 0, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    public Period minus(C10225l lVar) {
        if (lVar == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, -lVar.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, -lVar.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, -lVar.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, -lVar.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, -lVar.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, -lVar.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, -lVar.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, -lVar.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period minusDays(int i) {
        return plusDays(-i);
    }

    public Period minusHours(int i) {
        return plusHours(-i);
    }

    public Period minusMillis(int i) {
        return plusMillis(-i);
    }

    public Period minusMinutes(int i) {
        return plusMinutes(-i);
    }

    public Period minusMonths(int i) {
        return plusMonths(-i);
    }

    public Period minusSeconds(int i) {
        return plusSeconds(-i);
    }

    public Period minusWeeks(int i) {
        return plusWeeks(-i);
    }

    public Period minusYears(int i) {
        return plusYears(-i);
    }

    public Period multipliedBy(int i) {
        if (this == ZERO || i == 1) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < values.length; i2++) {
            values[i2] = C10179e.m25390f(values[i2], i);
        }
        return new Period(values, getPeriodType());
    }

    public Period negated() {
        return multipliedBy(-1);
    }

    public Period normalizedStandard() {
        return normalizedStandard(PeriodType.standard());
    }

    public Period normalizedStandard(PeriodType periodType) {
        Period period = new Period(((long) getMillis()) + (((long) getSeconds()) * 1000) + (((long) getMinutes()) * 60000) + (((long) getHours()) * 3600000) + (((long) getDays()) * 86400000) + (((long) getWeeks()) * 604800000), C10149c.m25345j(periodType), (C10142a) ISOChronology.getInstanceUTC());
        int years = getYears();
        int months = getMonths();
        if (years == 0 && months == 0) {
            return period;
        }
        int d = C10179e.m25388d(years, months / 12);
        int i = months % 12;
        if (d != 0) {
            period = period.withYears(d);
        }
        return i != 0 ? period.withMonths(i) : period;
    }

    public Period plus(C10225l lVar) {
        if (lVar == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, lVar.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, lVar.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, lVar.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, lVar.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, lVar.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, lVar.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, lVar.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, lVar.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period plusDays(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusHours(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMillis(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMinutes(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMonths(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusSeconds(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusWeeks(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusYears(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period toPeriod() {
        return this;
    }

    public Days toStandardDays() {
        checkYearsAndMonths("Days");
        return Days.days(C10179e.m25395k(C10179e.m25389e(C10179e.m25389e((((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) + (((long) getHours()) * 3600000)) / 86400000, (long) getDays()), ((long) getWeeks()) * 7)));
    }

    public Duration toStandardDuration() {
        checkYearsAndMonths("Duration");
        return new Duration(((long) getMillis()) + (((long) getSeconds()) * 1000) + (((long) getMinutes()) * 60000) + (((long) getHours()) * 3600000) + (((long) getDays()) * 86400000) + (((long) getWeeks()) * 604800000));
    }

    public Hours toStandardHours() {
        checkYearsAndMonths("Hours");
        return Hours.hours(C10179e.m25395k(C10179e.m25389e(C10179e.m25389e(C10179e.m25389e(((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) / 3600000, (long) getHours()), ((long) getDays()) * 24), ((long) getWeeks()) * 168)));
    }

    public Minutes toStandardMinutes() {
        checkYearsAndMonths("Minutes");
        return Minutes.minutes(C10179e.m25395k(C10179e.m25389e(C10179e.m25389e(C10179e.m25389e(C10179e.m25389e((((long) getMillis()) + (((long) getSeconds()) * 1000)) / 60000, (long) getMinutes()), ((long) getHours()) * 60), ((long) getDays()) * 1440), ((long) getWeeks()) * 10080)));
    }

    public Seconds toStandardSeconds() {
        checkYearsAndMonths("Seconds");
        return Seconds.seconds(C10179e.m25395k(C10179e.m25389e(C10179e.m25389e(C10179e.m25389e(C10179e.m25389e(C10179e.m25389e((long) (getMillis() / 1000), (long) getSeconds()), ((long) getMinutes()) * 60), ((long) getHours()) * 3600), ((long) getDays()) * 86400), ((long) getWeeks()) * 604800)));
    }

    public Weeks toStandardWeeks() {
        checkYearsAndMonths("Weeks");
        return Weeks.weeks(C10179e.m25395k(((long) getWeeks()) + (((((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) + (((long) getHours()) * 3600000)) + (((long) getDays()) * 86400000)) / 604800000)));
    }

    public Period withDays(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withField(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            int[] values = getValues();
            super.setFieldInto(values, durationFieldType, i);
            return new Period(values, getPeriodType());
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public Period withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i == 0) {
            return this;
        } else {
            int[] values = getValues();
            super.addFieldInto(values, durationFieldType, i);
            return new Period(values, getPeriodType());
        }
    }

    public Period withFields(C10225l lVar) {
        return lVar == null ? this : new Period(super.mergePeriodInto(getValues(), lVar), getPeriodType());
    }

    public Period withHours(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMillis(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMinutes(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMonths(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withPeriodType(PeriodType periodType) {
        PeriodType j = C10149c.m25345j(periodType);
        return j.equals(getPeriodType()) ? this : new Period((Object) this, j);
    }

    public Period withSeconds(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withWeeks(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withYears(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }
}
