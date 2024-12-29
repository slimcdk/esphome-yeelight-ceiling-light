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
public final class TimeOfDay extends BasePartial {
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()};
    public static final int HOUR_OF_DAY = 0;
    public static final TimeOfDay MIDNIGHT = new TimeOfDay(0, 0, 0, 0);
    public static final int MILLIS_OF_SECOND = 3;
    public static final int MINUTE_OF_HOUR = 1;
    public static final int SECOND_OF_MINUTE = 2;
    private static final long serialVersionUID = 3633353405803318660L;

    @Deprecated
    public static class Property extends C10175a implements Serializable {
        private static final long serialVersionUID = 5598459141741063833L;
        private final int iFieldIndex;
        private final TimeOfDay iTimeOfDay;

        Property(TimeOfDay timeOfDay, int i) {
            this.iTimeOfDay = timeOfDay;
            this.iFieldIndex = i;
        }

        public TimeOfDay addNoWrapToCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().add(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public TimeOfDay addToCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapPartial(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public TimeOfDay addWrapFieldToCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapField(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public int get() {
            return this.iTimeOfDay.getValue(this.iFieldIndex);
        }

        public C10143b getField() {
            return this.iTimeOfDay.getField(this.iFieldIndex);
        }

        /* access modifiers changed from: protected */
        public C10224k getReadablePartial() {
            return this.iTimeOfDay;
        }

        public TimeOfDay getTimeOfDay() {
            return this.iTimeOfDay;
        }

        public TimeOfDay setCopy(int i) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i));
        }

        public TimeOfDay setCopy(String str) {
            return setCopy(str, (Locale) null);
        }

        public TimeOfDay setCopy(String str, Locale locale) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), str, locale));
        }

        public TimeOfDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public TimeOfDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public TimeOfDay() {
    }

    public TimeOfDay(int i, int i2) {
        this(i, i2, 0, 0, (C10142a) null);
    }

    public TimeOfDay(int i, int i2, int i3) {
        this(i, i2, i3, 0, (C10142a) null);
    }

    public TimeOfDay(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (C10142a) null);
    }

    public TimeOfDay(int i, int i2, int i3, int i4, C10142a aVar) {
        super(new int[]{i, i2, i3, i4}, aVar);
    }

    public TimeOfDay(int i, int i2, int i3, C10142a aVar) {
        this(i, i2, i3, 0, aVar);
    }

    public TimeOfDay(int i, int i2, C10142a aVar) {
        this(i, i2, 0, 0, aVar);
    }

    public TimeOfDay(long j) {
        super(j);
    }

    public TimeOfDay(long j, C10142a aVar) {
        super(j, aVar);
    }

    public TimeOfDay(Object obj) {
        super(obj, (C10142a) null, C10206f.m25549r());
    }

    public TimeOfDay(Object obj, C10142a aVar) {
        super(obj, C10149c.m25337b(aVar), C10206f.m25549r());
    }

    public TimeOfDay(DateTimeZone dateTimeZone) {
        super((C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    TimeOfDay(TimeOfDay timeOfDay, C10142a aVar) {
        super((BasePartial) timeOfDay, aVar);
    }

    TimeOfDay(TimeOfDay timeOfDay, int[] iArr) {
        super((BasePartial) timeOfDay, iArr);
    }

    public TimeOfDay(C10142a aVar) {
        super(aVar);
    }

    public static TimeOfDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new TimeOfDay(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static TimeOfDay fromDateFields(Date date) {
        if (date != null) {
            return new TimeOfDay(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static TimeOfDay fromMillisOfDay(long j) {
        return fromMillisOfDay(j, (C10142a) null);
    }

    public static TimeOfDay fromMillisOfDay(long j, C10142a aVar) {
        return new TimeOfDay(j, C10149c.m25337b(aVar).withUTC());
    }

    /* access modifiers changed from: protected */
    public C10143b getField(int i, C10142a aVar) {
        if (i == 0) {
            return aVar.hourOfDay();
        }
        if (i == 1) {
            return aVar.minuteOfHour();
        }
        if (i == 2) {
            return aVar.secondOfMinute();
        }
        if (i == 3) {
            return aVar.millisOfSecond();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public DateTimeFieldType getFieldType(int i) {
        return FIELD_TYPES[i];
    }

    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getHourOfDay() {
        return getValue(0);
    }

    public int getMillisOfSecond() {
        return getValue(3);
    }

    public int getMinuteOfHour() {
        return getValue(1);
    }

    public int getSecondOfMinute() {
        return getValue(2);
    }

    public Property hourOfDay() {
        return new Property(this, 0);
    }

    public Property millisOfSecond() {
        return new Property(this, 3);
    }

    public TimeOfDay minus(C10225l lVar) {
        return withPeriodAdded(lVar, -1);
    }

    public TimeOfDay minusHours(int i) {
        return withFieldAdded(DurationFieldType.hours(), C10179e.m25393i(i));
    }

    public TimeOfDay minusMillis(int i) {
        return withFieldAdded(DurationFieldType.millis(), C10179e.m25393i(i));
    }

    public TimeOfDay minusMinutes(int i) {
        return withFieldAdded(DurationFieldType.minutes(), C10179e.m25393i(i));
    }

    public TimeOfDay minusSeconds(int i) {
        return withFieldAdded(DurationFieldType.seconds(), C10179e.m25393i(i));
    }

    public Property minuteOfHour() {
        return new Property(this, 1);
    }

    public TimeOfDay plus(C10225l lVar) {
        return withPeriodAdded(lVar, 1);
    }

    public TimeOfDay plusHours(int i) {
        return withFieldAdded(DurationFieldType.hours(), i);
    }

    public TimeOfDay plusMillis(int i) {
        return withFieldAdded(DurationFieldType.millis(), i);
    }

    public TimeOfDay plusMinutes(int i) {
        return withFieldAdded(DurationFieldType.minutes(), i);
    }

    public TimeOfDay plusSeconds(int i) {
        return withFieldAdded(DurationFieldType.seconds(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public Property secondOfMinute() {
        return new Property(this, 2);
    }

    public int size() {
        return 4;
    }

    public DateTime toDateTimeToday() {
        return toDateTimeToday((DateTimeZone) null);
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        C10142a withZone = getChronology().withZone(dateTimeZone);
        return new DateTime(withZone.set(this, C10149c.m25336a()), withZone);
    }

    public LocalTime toLocalTime() {
        return new LocalTime(getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), getChronology());
    }

    public String toString() {
        return C10206f.m25546o().mo41439k(this);
    }

    public TimeOfDay withChronologyRetainFields(C10142a aVar) {
        C10142a withUTC = C10149c.m25337b(aVar).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        TimeOfDay timeOfDay = new TimeOfDay(this, withUTC);
        withUTC.validate(timeOfDay, getValues());
        return timeOfDay;
    }

    public TimeOfDay withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new TimeOfDay(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public TimeOfDay withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new TimeOfDay(this, getField(indexOfSupported).addWrapPartial(this, indexOfSupported, getValues(), i));
    }

    public TimeOfDay withHourOfDay(int i) {
        return new TimeOfDay(this, getChronology().hourOfDay().set(this, 0, getValues(), i));
    }

    public TimeOfDay withMillisOfSecond(int i) {
        return new TimeOfDay(this, getChronology().millisOfSecond().set(this, 3, getValues(), i));
    }

    public TimeOfDay withMinuteOfHour(int i) {
        return new TimeOfDay(this, getChronology().minuteOfHour().set(this, 1, getValues(), i));
    }

    public TimeOfDay withPeriodAdded(C10225l lVar, int i) {
        if (lVar == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < lVar.size(); i2++) {
            int indexOf = indexOf(lVar.getFieldType(i2));
            if (indexOf >= 0) {
                values = getField(indexOf).addWrapPartial(this, indexOf, values, C10179e.m25390f(lVar.getValue(i2), i));
            }
        }
        return new TimeOfDay(this, values);
    }

    public TimeOfDay withSecondOfMinute(int i) {
        return new TimeOfDay(this, getChronology().secondOfMinute().set(this, 2, getValues(), i));
    }
}
