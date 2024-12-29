package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
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
import org.joda.time.format.DateTimeFormatterBuilder;

public final class MonthDay extends BasePartial {
    public static final int DAY_OF_MONTH = 1;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    public static final int MONTH_OF_YEAR = 0;
    private static final C10199a PARSER = new DateTimeFormatterBuilder().mo41376E(C10206f.m25544m().mo41430b()).mo41376E(DateTimeFormat.m25402b("--MM-dd").mo41430b()).mo41396d0();
    private static final long serialVersionUID = 2954560699050434609L;

    public static class Property extends C10175a implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final MonthDay iBase;
        private final int iFieldIndex;

        Property(MonthDay monthDay, int i) {
            this.iBase = monthDay;
            this.iFieldIndex = i;
        }

        public MonthDay addToCopy(int i) {
            return new MonthDay(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public MonthDay addWrapFieldToCopy(int i) {
            return new MonthDay(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        public C10143b getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        public MonthDay getMonthDay() {
            return this.iBase;
        }

        /* access modifiers changed from: protected */
        public C10224k getReadablePartial() {
            return this.iBase;
        }

        public MonthDay setCopy(int i) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public MonthDay setCopy(String str) {
            return setCopy(str, (Locale) null);
        }

        public MonthDay setCopy(String str, Locale locale) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }
    }

    public MonthDay() {
    }

    public MonthDay(int i, int i2) {
        this(i, i2, (C10142a) null);
    }

    public MonthDay(int i, int i2, C10142a aVar) {
        super(new int[]{i, i2}, aVar);
    }

    public MonthDay(long j) {
        super(j);
    }

    public MonthDay(long j, C10142a aVar) {
        super(j, aVar);
    }

    public MonthDay(Object obj) {
        super(obj, (C10142a) null, C10206f.m25544m());
    }

    public MonthDay(Object obj, C10142a aVar) {
        super(obj, C10149c.m25337b(aVar), C10206f.m25544m());
    }

    public MonthDay(DateTimeZone dateTimeZone) {
        super((C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    MonthDay(MonthDay monthDay, C10142a aVar) {
        super((BasePartial) monthDay, aVar);
    }

    MonthDay(MonthDay monthDay, int[] iArr) {
        super((BasePartial) monthDay, iArr);
    }

    public MonthDay(C10142a aVar) {
        super(aVar);
    }

    public static MonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new MonthDay(calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static MonthDay fromDateFields(Date date) {
        if (date != null) {
            return new MonthDay(date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static MonthDay now() {
        return new MonthDay();
    }

    public static MonthDay now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new MonthDay(dateTimeZone);
    }

    public static MonthDay now(C10142a aVar) {
        Objects.requireNonNull(aVar, "Chronology must not be null");
        return new MonthDay(aVar);
    }

    @FromString
    public static MonthDay parse(String str) {
        return parse(str, PARSER);
    }

    public static MonthDay parse(String str, C10199a aVar) {
        LocalDate f = aVar.mo41434f(str);
        return new MonthDay(f.getMonthOfYear(), f.getDayOfMonth());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new MonthDay(this, getChronology().withUTC()) : this;
    }

    public Property dayOfMonth() {
        return new Property(this, 1);
    }

    public int getDayOfMonth() {
        return getValue(1);
    }

    /* access modifiers changed from: protected */
    public C10143b getField(int i, C10142a aVar) {
        if (i == 0) {
            return aVar.monthOfYear();
        }
        if (i == 1) {
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
        return getValue(0);
    }

    public MonthDay minus(C10225l lVar) {
        return withPeriodAdded(lVar, -1);
    }

    public MonthDay minusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), C10179e.m25393i(i));
    }

    public MonthDay minusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), C10179e.m25393i(i));
    }

    public Property monthOfYear() {
        return new Property(this, 0);
    }

    public MonthDay plus(C10225l lVar) {
        return withPeriodAdded(lVar, 1);
    }

    public MonthDay plusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), i);
    }

    public MonthDay plusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public int size() {
        return 2;
    }

    public LocalDate toLocalDate(int i) {
        return new LocalDate(i, getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    @ToString
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DateTimeFieldType.monthOfYear());
        arrayList.add(DateTimeFieldType.dayOfMonth());
        return C10206f.m25541j(arrayList, true, true).mo41439k(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41439k(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41444t(locale).mo41439k(this);
    }

    public MonthDay withChronologyRetainFields(C10142a aVar) {
        C10142a withUTC = C10149c.m25337b(aVar).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        MonthDay monthDay = new MonthDay(this, withUTC);
        withUTC.validate(monthDay, getValues());
        return monthDay;
    }

    public MonthDay withDayOfMonth(int i) {
        return new MonthDay(this, getChronology().dayOfMonth().set(this, 1, getValues(), i));
    }

    public MonthDay withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new MonthDay(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public MonthDay withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new MonthDay(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i));
    }

    public MonthDay withMonthOfYear(int i) {
        return new MonthDay(this, getChronology().monthOfYear().set(this, 0, getValues(), i));
    }

    public MonthDay withPeriodAdded(C10225l lVar, int i) {
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
        return new MonthDay(this, values);
    }
}
