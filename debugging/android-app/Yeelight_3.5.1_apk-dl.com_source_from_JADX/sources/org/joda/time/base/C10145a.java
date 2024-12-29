package org.joda.time.base;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.joda.time.C10220g;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormat;

/* renamed from: org.joda.time.base.a */
public abstract class C10145a extends C3588c implements C10220g {
    protected C10145a() {
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.getField(getChronology()).get(getMillis());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getMillis());
    }

    public int getDayOfMonth() {
        return getChronology().dayOfMonth().get(getMillis());
    }

    public int getDayOfWeek() {
        return getChronology().dayOfWeek().get(getMillis());
    }

    public int getDayOfYear() {
        return getChronology().dayOfYear().get(getMillis());
    }

    public int getEra() {
        return getChronology().era().get(getMillis());
    }

    public int getHourOfDay() {
        return getChronology().hourOfDay().get(getMillis());
    }

    public int getMillisOfDay() {
        return getChronology().millisOfDay().get(getMillis());
    }

    public int getMillisOfSecond() {
        return getChronology().millisOfSecond().get(getMillis());
    }

    public int getMinuteOfDay() {
        return getChronology().minuteOfDay().get(getMillis());
    }

    public int getMinuteOfHour() {
        return getChronology().minuteOfHour().get(getMillis());
    }

    public int getMonthOfYear() {
        return getChronology().monthOfYear().get(getMillis());
    }

    public int getSecondOfDay() {
        return getChronology().secondOfDay().get(getMillis());
    }

    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getMillis());
    }

    public int getWeekOfWeekyear() {
        return getChronology().weekOfWeekyear().get(getMillis());
    }

    public int getWeekyear() {
        return getChronology().weekyear().get(getMillis());
    }

    public int getYear() {
        return getChronology().year().get(getMillis());
    }

    public int getYearOfCentury() {
        return getChronology().yearOfCentury().get(getMillis());
    }

    public int getYearOfEra() {
        return getChronology().yearOfEra().get(getMillis());
    }

    public Calendar toCalendar(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Calendar instance = Calendar.getInstance(getZone().toTimeZone(), locale);
        instance.setTime(toDate());
        return instance;
    }

    public GregorianCalendar toGregorianCalendar() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(getZone().toTimeZone());
        gregorianCalendar.setTime(toDate());
        return gregorianCalendar;
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41438j(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41444t(locale).mo41438j(this);
    }
}
