package org.joda.time.chrono;

import java.io.Serializable;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.C10225l;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.C10179e;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

public abstract class BaseChronology extends C10142a implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    protected BaseChronology() {
    }

    public long add(long j, long j2, int i) {
        return (j2 == 0 || i == 0) ? j : C10179e.m25389e(j, C10179e.m25391g(j2, i));
    }

    public long add(C10225l lVar, long j, int i) {
        if (!(i == 0 || lVar == null)) {
            int size = lVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                long value = (long) lVar.getValue(i2);
                if (value != 0) {
                    j = lVar.getFieldType(i2).getField(this).add(j, value * ((long) i));
                }
            }
        }
        return j;
    }

    public C10172d centuries() {
        return UnsupportedDurationField.getInstance(DurationFieldType.centuries());
    }

    public C10143b centuryOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.centuryOfEra(), centuries());
    }

    public C10143b clockhourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfDay(), hours());
    }

    public C10143b clockhourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfHalfday(), hours());
    }

    public C10143b dayOfMonth() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfMonth(), days());
    }

    public C10143b dayOfWeek() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfWeek(), days());
    }

    public C10143b dayOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfYear(), days());
    }

    public C10172d days() {
        return UnsupportedDurationField.getInstance(DurationFieldType.days());
    }

    public C10143b era() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.era(), eras());
    }

    public C10172d eras() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    public int[] get(C10224k kVar, long j) {
        int size = kVar.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = kVar.getFieldType(i).getField(this).get(j);
        }
        return iArr;
    }

    public int[] get(C10225l lVar, long j) {
        int size = lVar.size();
        int[] iArr = new int[size];
        long j2 = 0;
        if (j != 0) {
            for (int i = 0; i < size; i++) {
                C10172d field = lVar.getFieldType(i).getField(this);
                if (field.isPrecise()) {
                    int difference = field.getDifference(j, j2);
                    j2 = field.add(j2, difference);
                    iArr[i] = difference;
                }
            }
        }
        return iArr;
    }

    public int[] get(C10225l lVar, long j, long j2) {
        int size = lVar.size();
        int[] iArr = new int[size];
        if (j != j2) {
            for (int i = 0; i < size; i++) {
                C10172d field = lVar.getFieldType(i).getField(this);
                int difference = field.getDifference(j2, j);
                j = field.add(j, difference);
                iArr[i] = difference;
            }
        }
        return iArr;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) {
        return millisOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0, i), i2), i3), i4);
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0, i), i2), i3), i4), i5), i6), i7);
    }

    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(j, i), i2), i3), i4);
    }

    public abstract DateTimeZone getZone();

    public C10143b halfdayOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.halfdayOfDay(), halfdays());
    }

    public C10172d halfdays() {
        return UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
    }

    public C10143b hourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfDay(), hours());
    }

    public C10143b hourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfHalfday(), hours());
    }

    public C10172d hours() {
        return UnsupportedDurationField.getInstance(DurationFieldType.hours());
    }

    public C10172d millis() {
        return UnsupportedDurationField.getInstance(DurationFieldType.millis());
    }

    public C10143b millisOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfDay(), millis());
    }

    public C10143b millisOfSecond() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfSecond(), millis());
    }

    public C10143b minuteOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfDay(), minutes());
    }

    public C10143b minuteOfHour() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfHour(), minutes());
    }

    public C10172d minutes() {
        return UnsupportedDurationField.getInstance(DurationFieldType.minutes());
    }

    public C10143b monthOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.monthOfYear(), months());
    }

    public C10172d months() {
        return UnsupportedDurationField.getInstance(DurationFieldType.months());
    }

    public C10143b secondOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfDay(), seconds());
    }

    public C10143b secondOfMinute() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), seconds());
    }

    public C10172d seconds() {
        return UnsupportedDurationField.getInstance(DurationFieldType.seconds());
    }

    public long set(C10224k kVar, long j) {
        int size = kVar.size();
        for (int i = 0; i < size; i++) {
            j = kVar.getFieldType(i).getField(this).set(j, kVar.getValue(i));
        }
        return j;
    }

    public abstract String toString();

    public void validate(C10224k kVar, int[] iArr) {
        int size = kVar.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = iArr[i2];
            C10143b field = kVar.getField(i2);
            if (i3 < field.getMinimumValue()) {
                throw new IllegalFieldValueException(field.getType(), (Number) Integer.valueOf(i3), (Number) Integer.valueOf(field.getMinimumValue()), (Number) null);
            } else if (i3 <= field.getMaximumValue()) {
                i2++;
            } else {
                throw new IllegalFieldValueException(field.getType(), (Number) Integer.valueOf(i3), (Number) null, (Number) Integer.valueOf(field.getMaximumValue()));
            }
        }
        while (i < size) {
            int i4 = iArr[i];
            C10143b field2 = kVar.getField(i);
            if (i4 < field2.getMinimumValue(kVar, iArr)) {
                throw new IllegalFieldValueException(field2.getType(), (Number) Integer.valueOf(i4), (Number) Integer.valueOf(field2.getMinimumValue(kVar, iArr)), (Number) null);
            } else if (i4 <= field2.getMaximumValue(kVar, iArr)) {
                i++;
            } else {
                throw new IllegalFieldValueException(field2.getType(), (Number) Integer.valueOf(i4), (Number) null, (Number) Integer.valueOf(field2.getMaximumValue(kVar, iArr)));
            }
        }
    }

    public C10143b weekOfWeekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekOfWeekyear(), weeks());
    }

    public C10172d weeks() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weeks());
    }

    public C10143b weekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyear(), weekyears());
    }

    public C10143b weekyearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyearOfCentury(), weekyears());
    }

    public C10172d weekyears() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weekyears());
    }

    public abstract C10142a withUTC();

    public abstract C10142a withZone(DateTimeZone dateTimeZone);

    public C10143b year() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), years());
    }

    public C10143b yearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfCentury(), years());
    }

    public C10143b yearOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfEra(), years());
    }

    public C10172d years() {
        return UnsupportedDurationField.getInstance(DurationFieldType.years());
    }
}
