package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C10175a;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10206f;

@Deprecated
public final class YearMonthDay extends BasePartial {
    public static final int DAY_OF_MONTH = 2;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    @Deprecated
    public static class Property extends C10175a implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final int iFieldIndex;
        private final YearMonthDay iYearMonthDay;

        Property(YearMonthDay yearMonthDay, int i) {
            this.iYearMonthDay = yearMonthDay;
            this.iFieldIndex = i;
        }

        public YearMonthDay addToCopy(int i) {
            return new YearMonthDay(this.iYearMonthDay, getField().add(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i));
        }

        public YearMonthDay addWrapFieldToCopy(int i) {
            return new YearMonthDay(this.iYearMonthDay, getField().addWrapField(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i));
        }

        public int get() {
            return this.iYearMonthDay.getValue(this.iFieldIndex);
        }

        public C10143b getField() {
            return this.iYearMonthDay.getField(this.iFieldIndex);
        }

        /* access modifiers changed from: protected */
        public C10224k getReadablePartial() {
            return this.iYearMonthDay;
        }

        public YearMonthDay getYearMonthDay() {
            return this.iYearMonthDay;
        }

        public YearMonthDay setCopy(int i) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i));
        }

        public YearMonthDay setCopy(String str) {
            return setCopy(str, (Locale) null);
        }

        public YearMonthDay setCopy(String str, Locale locale) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), str, locale));
        }

        public YearMonthDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public YearMonthDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public YearMonthDay() {
    }

    public YearMonthDay(int i, int i2, int i3) {
        this(i, i2, i3, (C10142a) null);
    }

    public YearMonthDay(int i, int i2, int i3, C10142a aVar) {
        super(new int[]{i, i2, i3}, aVar);
    }

    public YearMonthDay(long j) {
        super(j);
    }

    public YearMonthDay(long j, C10142a aVar) {
        super(j, aVar);
    }

    public YearMonthDay(Object obj) {
        super(obj, (C10142a) null, C10206f.m25538g());
    }

    public YearMonthDay(Object obj, C10142a aVar) {
        super(obj, C10149c.m25337b(aVar), C10206f.m25538g());
    }

    public YearMonthDay(DateTimeZone dateTimeZone) {
        super((C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    YearMonthDay(YearMonthDay yearMonthDay, C10142a aVar) {
        super((BasePartial) yearMonthDay, aVar);
    }

    YearMonthDay(YearMonthDay yearMonthDay, int[] iArr) {
        super((BasePartial) yearMonthDay, iArr);
    }

    public YearMonthDay(C10142a aVar) {
        super(aVar);
    }

    public static YearMonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonthDay(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static YearMonthDay fromDateFields(Date date) {
        if (date != null) {
            return new YearMonthDay(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public Property dayOfMonth() {
        return new Property(this, 2);
    }

    public int getDayOfMonth() {
        return getValue(2);
    }

    /* access modifiers changed from: protected */
    public C10143b getField(int i, C10142a aVar) {
        if (i == 0) {
            return aVar.year();
        }
        if (i == 1) {
            return aVar.monthOfYear();
        }
        if (i == 2) {
            return aVar.dayOfMonth();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public DateTimeFieldType getFieldType(int i) {
        return FIELD_TYPES[i];
    }

    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getMonthOfYear() {
        return getValue(1);
    }

    public int getYear() {
        return getValue(0);
    }

    public YearMonthDay minus(C10225l lVar) {
        return withPeriodAdded(lVar, -1);
    }

    public YearMonthDay minusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), C10179e.m25393i(i));
    }

    public YearMonthDay minusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), C10179e.m25393i(i));
    }

    public YearMonthDay minusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), C10179e.m25393i(i));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonthDay plus(C10225l lVar) {
        return withPeriodAdded(lVar, 1);
    }

    public YearMonthDay plusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), i);
    }

    public YearMonthDay plusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public YearMonthDay plusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public int size() {
        return 3;
    }

    public DateMidnight toDateMidnight() {
        return toDateMidnight((DateTimeZone) null);
    }

    public DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(dateTimeZone));
    }

    public DateTime toDateTime(TimeOfDay timeOfDay) {
        return toDateTime(timeOfDay, (DateTimeZone) null);
    }

    public DateTime toDateTime(TimeOfDay timeOfDay, DateTimeZone dateTimeZone) {
        C10142a withZone = getChronology().withZone(dateTimeZone);
        long j = withZone.set(this, C10149c.m25336a());
        if (timeOfDay != null) {
            j = withZone.set(timeOfDay, j);
        }
        return new DateTime(j, withZone);
    }

    public DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime((DateTimeZone) null);
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        C10142a withZone = getChronology().withZone(dateTimeZone);
        return new DateTime(withZone.set(this, C10149c.m25336a()), withZone);
    }

    public DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight((DateTimeZone) null);
    }

    public DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(dateTimeZone));
    }

    public Interval toInterval() {
        return toInterval((DateTimeZone) null);
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        return toDateMidnight(C10149c.m25347l(dateTimeZone)).toInterval();
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    public String toString() {
        return C10206f.m25552u().mo41439k(this);
    }

    public YearMonthDay withChronologyRetainFields(C10142a aVar) {
        C10142a withUTC = C10149c.m25337b(aVar).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        YearMonthDay yearMonthDay = new YearMonthDay(this, withUTC);
        withUTC.validate(yearMonthDay, getValues());
        return yearMonthDay;
    }

    public YearMonthDay withDayOfMonth(int i) {
        return new YearMonthDay(this, getChronology().dayOfMonth().set(this, 2, getValues(), i));
    }

    public YearMonthDay withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new YearMonthDay(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public YearMonthDay withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new YearMonthDay(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i));
    }

    public YearMonthDay withMonthOfYear(int i) {
        return new YearMonthDay(this, getChronology().monthOfYear().set(this, 1, getValues(), i));
    }

    public YearMonthDay withPeriodAdded(C10225l lVar, int i) {
        if (lVar == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < lVar.size(); i2++) {
            int indexOf = indexOf(lVar.getFieldType(i2));
            if (indexOf >= 0) {
                values = getField(indexOf).add(this, indexOf, values, C10179e.m25390f(lVar.getValue(i2), i));
            }
        }
        return new YearMonthDay(this, values);
    }

    public YearMonthDay withYear(int i) {
        return new YearMonthDay(this, getChronology().year().set(this, 0, getValues(), i));
    }

    public Property year() {
        return new Property(this, 0);
    }
}
