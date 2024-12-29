package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C10175a;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;
import org.joda.time.format.DateTimeFormat;

public final class YearMonth extends BasePartial {
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    public static class Property extends C10175a implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final YearMonth iBase;
        private final int iFieldIndex;

        Property(YearMonth yearMonth, int i) {
            this.iBase = yearMonth;
            this.iFieldIndex = i;
        }

        public YearMonth addToCopy(int i) {
            return new YearMonth(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public YearMonth addWrapFieldToCopy(int i) {
            return new YearMonth(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        public C10143b getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        /* access modifiers changed from: protected */
        public C10224k getReadablePartial() {
            return this.iBase;
        }

        public YearMonth getYearMonth() {
            return this.iBase;
        }

        public YearMonth setCopy(int i) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public YearMonth setCopy(String str) {
            return setCopy(str, (Locale) null);
        }

        public YearMonth setCopy(String str, Locale locale) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }
    }

    public YearMonth() {
    }

    public YearMonth(int i, int i2) {
        this(i, i2, (C10142a) null);
    }

    public YearMonth(int i, int i2, C10142a aVar) {
        super(new int[]{i, i2}, aVar);
    }

    public YearMonth(long j) {
        super(j);
    }

    public YearMonth(long j, C10142a aVar) {
        super(j, aVar);
    }

    public YearMonth(Object obj) {
        super(obj, (C10142a) null, C10206f.m25544m());
    }

    public YearMonth(Object obj, C10142a aVar) {
        super(obj, C10149c.m25337b(aVar), C10206f.m25544m());
    }

    public YearMonth(DateTimeZone dateTimeZone) {
        super((C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    YearMonth(YearMonth yearMonth, C10142a aVar) {
        super((BasePartial) yearMonth, aVar);
    }

    YearMonth(YearMonth yearMonth, int[] iArr) {
        super((BasePartial) yearMonth, iArr);
    }

    public YearMonth(C10142a aVar) {
        super(aVar);
    }

    public static YearMonth fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonth(calendar.get(1), calendar.get(2) + 1);
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static YearMonth fromDateFields(Date date) {
        if (date != null) {
            return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static YearMonth now() {
        return new YearMonth();
    }

    public static YearMonth now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new YearMonth(dateTimeZone);
    }

    public static YearMonth now(C10142a aVar) {
        Objects.requireNonNull(aVar, "Chronology must not be null");
        return new YearMonth(aVar);
    }

    @FromString
    public static YearMonth parse(String str) {
        return parse(str, C10206f.m25544m());
    }

    public static YearMonth parse(String str, C10199a aVar) {
        LocalDate f = aVar.mo41434f(str);
        return new YearMonth(f.getYear(), f.getMonthOfYear());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new YearMonth(this, getChronology().withUTC()) : this;
    }

    /* access modifiers changed from: protected */
    public C10143b getField(int i, C10142a aVar) {
        if (i == 0) {
            return aVar.year();
        }
        if (i == 1) {
            return aVar.monthOfYear();
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

    public YearMonth minus(C10225l lVar) {
        return withPeriodAdded(lVar, -1);
    }

    public YearMonth minusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), C10179e.m25393i(i));
    }

    public YearMonth minusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), C10179e.m25393i(i));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonth plus(C10225l lVar) {
        return withPeriodAdded(lVar, 1);
    }

    public YearMonth plusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public YearMonth plusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public int size() {
        return 2;
    }

    public Interval toInterval() {
        return toInterval((DateTimeZone) null);
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone l = C10149c.m25347l(dateTimeZone);
        return new Interval((C10222i) toLocalDate(1).toDateTimeAtStartOfDay(l), (C10222i) plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(l));
    }

    public LocalDate toLocalDate(int i) {
        return new LocalDate(getYear(), getMonthOfYear(), i, getChronology());
    }

    @ToString
    public String toString() {
        return C10206f.m25551t().mo41439k(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41439k(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41444t(locale).mo41439k(this);
    }

    public YearMonth withChronologyRetainFields(C10142a aVar) {
        C10142a withUTC = C10149c.m25337b(aVar).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        YearMonth yearMonth = new YearMonth(this, withUTC);
        withUTC.validate(yearMonth, getValues());
        return yearMonth;
    }

    public YearMonth withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new YearMonth(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public YearMonth withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new YearMonth(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i));
    }

    public YearMonth withMonthOfYear(int i) {
        return new YearMonth(this, getChronology().monthOfYear().set(this, 1, getValues(), i));
    }

    public YearMonth withPeriodAdded(C10225l lVar, int i) {
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
        return new YearMonth(this, values);
    }

    public YearMonth withYear(int i) {
        return new YearMonth(this, getChronology().year().set(this, 0, getValues(), i));
    }

    public Property year() {
        return new Property(this, 0);
    }
}
