package org.joda.time;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Objects;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;

public final class DateTime extends BaseDateTime {
    private static final long serialVersionUID = -5171125899451703815L;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -6983323811635733510L;
        private C10143b iField;
        private DateTime iInstant;

        Property(DateTime dateTime, C10143b bVar) {
            this.iInstant = dateTime;
            this.iField = bVar;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (DateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public DateTime addToCopy(int i) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.add(dateTime.getMillis(), i));
        }

        public DateTime addToCopy(long j) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.add(dateTime.getMillis(), j));
        }

        public DateTime addWrapFieldToCopy(int i) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.addWrapField(dateTime.getMillis(), i));
        }

        /* access modifiers changed from: protected */
        public C10142a getChronology() {
            return this.iInstant.getChronology();
        }

        public DateTime getDateTime() {
            return this.iInstant;
        }

        public C10143b getField() {
            return this.iField;
        }

        /* access modifiers changed from: protected */
        public long getMillis() {
            return this.iInstant.getMillis();
        }

        public DateTime roundCeilingCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundCeiling(dateTime.getMillis()));
        }

        public DateTime roundFloorCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundFloor(dateTime.getMillis()));
        }

        public DateTime roundHalfCeilingCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundHalfCeiling(dateTime.getMillis()));
        }

        public DateTime roundHalfEvenCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundHalfEven(dateTime.getMillis()));
        }

        public DateTime roundHalfFloorCopy() {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.roundHalfFloor(dateTime.getMillis()));
        }

        public DateTime setCopy(int i) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.set(dateTime.getMillis(), i));
        }

        public DateTime setCopy(String str) {
            return setCopy(str, (Locale) null);
        }

        public DateTime setCopy(String str, Locale locale) {
            DateTime dateTime = this.iInstant;
            return dateTime.withMillis(this.iField.set(dateTime.getMillis(), str, locale));
        }

        public DateTime withMaximumValue() {
            try {
                return setCopy(getMaximumValue());
            } catch (RuntimeException e) {
                if (IllegalInstantException.isIllegalInstant(e)) {
                    return new DateTime(getChronology().getZone().previousTransition(getMillis() + 86400000), getChronology());
                }
                throw e;
            }
        }

        public DateTime withMinimumValue() {
            try {
                return setCopy(getMinimumValue());
            } catch (RuntimeException e) {
                if (IllegalInstantException.isIllegalInstant(e)) {
                    return new DateTime(getChronology().getZone().nextTransition(getMillis() - 86400000), getChronology());
                }
                throw e;
            }
        }
    }

    public DateTime() {
    }

    public DateTime(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4, i5, 0, 0);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6, 0);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2, i3, i4, i5, i6, i7);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, i7, dateTimeZone);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C10142a aVar) {
        super(i, i2, i3, i4, i5, i6, i7, aVar);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, 0, dateTimeZone);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, int i6, C10142a aVar) {
        super(i, i2, i3, i4, i5, i6, 0, aVar);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, 0, 0, dateTimeZone);
    }

    public DateTime(int i, int i2, int i3, int i4, int i5, C10142a aVar) {
        super(i, i2, i3, i4, i5, 0, 0, aVar);
    }

    public DateTime(long j) {
        super(j);
    }

    public DateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public DateTime(long j, C10142a aVar) {
        super(j, aVar);
    }

    public DateTime(Object obj) {
        super(obj, (C10142a) null);
    }

    public DateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public DateTime(Object obj, C10142a aVar) {
        super(obj, C10149c.m25337b(aVar));
    }

    public DateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public DateTime(C10142a aVar) {
        super(aVar);
    }

    public static DateTime now() {
        return new DateTime();
    }

    public static DateTime now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new DateTime(dateTimeZone);
    }

    public static DateTime now(C10142a aVar) {
        Objects.requireNonNull(aVar, "Chronology must not be null");
        return new DateTime(aVar);
    }

    @FromString
    public static DateTime parse(String str) {
        return parse(str, C10206f.m25540i().mo41445u());
    }

    public static DateTime parse(String str, C10199a aVar) {
        return aVar.mo41433e(str);
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public DateTime minus(long j) {
        return withDurationAdded(j, -1);
    }

    public DateTime minus(C10221h hVar) {
        return withDurationAdded(hVar, -1);
    }

    public DateTime minus(C10225l lVar) {
        return withPeriodAdded(lVar, -1);
    }

    public DateTime minusDays(int i) {
        return i == 0 ? this : withMillis(getChronology().days().subtract(getMillis(), i));
    }

    public DateTime minusHours(int i) {
        return i == 0 ? this : withMillis(getChronology().hours().subtract(getMillis(), i));
    }

    public DateTime minusMillis(int i) {
        return i == 0 ? this : withMillis(getChronology().millis().subtract(getMillis(), i));
    }

    public DateTime minusMinutes(int i) {
        return i == 0 ? this : withMillis(getChronology().minutes().subtract(getMillis(), i));
    }

    public DateTime minusMonths(int i) {
        return i == 0 ? this : withMillis(getChronology().months().subtract(getMillis(), i));
    }

    public DateTime minusSeconds(int i) {
        return i == 0 ? this : withMillis(getChronology().seconds().subtract(getMillis(), i));
    }

    public DateTime minusWeeks(int i) {
        return i == 0 ? this : withMillis(getChronology().weeks().subtract(getMillis(), i));
    }

    public DateTime minusYears(int i) {
        return i == 0 ? this : withMillis(getChronology().years().subtract(getMillis(), i));
    }

    public Property minuteOfDay() {
        return new Property(this, getChronology().minuteOfDay());
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public DateTime plus(long j) {
        return withDurationAdded(j, 1);
    }

    public DateTime plus(C10221h hVar) {
        return withDurationAdded(hVar, 1);
    }

    public DateTime plus(C10225l lVar) {
        return withPeriodAdded(lVar, 1);
    }

    public DateTime plusDays(int i) {
        return i == 0 ? this : withMillis(getChronology().days().add(getMillis(), i));
    }

    public DateTime plusHours(int i) {
        return i == 0 ? this : withMillis(getChronology().hours().add(getMillis(), i));
    }

    public DateTime plusMillis(int i) {
        return i == 0 ? this : withMillis(getChronology().millis().add(getMillis(), i));
    }

    public DateTime plusMinutes(int i) {
        return i == 0 ? this : withMillis(getChronology().minutes().add(getMillis(), i));
    }

    public DateTime plusMonths(int i) {
        return i == 0 ? this : withMillis(getChronology().months().add(getMillis(), i));
    }

    public DateTime plusSeconds(int i) {
        return i == 0 ? this : withMillis(getChronology().seconds().add(getMillis(), i));
    }

    public DateTime plusWeeks(int i) {
        return i == 0 ? this : withMillis(getChronology().weeks().add(getMillis(), i));
    }

    public DateTime plusYears(int i) {
        return i == 0 ? this : withMillis(getChronology().years().add(getMillis(), i));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            C10143b field = dateTimeFieldType.getField(getChronology());
            if (field.isSupported()) {
                return new Property(this, field);
            }
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public Property secondOfDay() {
        return new Property(this, getChronology().secondOfDay());
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Deprecated
    public DateMidnight toDateMidnight() {
        return new DateMidnight(getMillis(), getChronology());
    }

    public DateTime toDateTime() {
        return this;
    }

    public DateTime toDateTime(DateTimeZone dateTimeZone) {
        DateTimeZone l = C10149c.m25347l(dateTimeZone);
        return getZone() == l ? this : super.toDateTime(l);
    }

    public DateTime toDateTime(C10142a aVar) {
        C10142a b = C10149c.m25337b(aVar);
        return getChronology() == b ? this : super.toDateTime(b);
    }

    public DateTime toDateTimeISO() {
        return getChronology() == ISOChronology.getInstance() ? this : super.toDateTimeISO();
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getMillis(), getChronology());
    }

    public LocalDateTime toLocalDateTime() {
        return new LocalDateTime(getMillis(), getChronology());
    }

    public LocalTime toLocalTime() {
        return new LocalTime(getMillis(), getChronology());
    }

    @Deprecated
    public TimeOfDay toTimeOfDay() {
        return new TimeOfDay(getMillis(), getChronology());
    }

    @Deprecated
    public YearMonthDay toYearMonthDay() {
        return new YearMonthDay(getMillis(), getChronology());
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public DateTime withCenturyOfEra(int i) {
        return withMillis(getChronology().centuryOfEra().set(getMillis(), i));
    }

    public DateTime withChronology(C10142a aVar) {
        C10142a b = C10149c.m25337b(aVar);
        return b == getChronology() ? this : new DateTime(getMillis(), b);
    }

    public DateTime withDate(int i, int i2, int i3) {
        C10142a chronology = getChronology();
        return withMillis(chronology.dayOfMonth().set(chronology.monthOfYear().set(chronology.year().set(getMillis(), i), i2), i3));
    }

    public DateTime withDayOfMonth(int i) {
        return withMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    public DateTime withDayOfWeek(int i) {
        return withMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    public DateTime withDayOfYear(int i) {
        return withMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    public DateTime withDurationAdded(long j, int i) {
        return (j == 0 || i == 0) ? this : withMillis(getChronology().add(getMillis(), j, i));
    }

    public DateTime withDurationAdded(C10221h hVar, int i) {
        return (hVar == null || i == 0) ? this : withDurationAdded(hVar.getMillis(), i);
    }

    public DateTime withEarlierOffsetAtOverlap() {
        return withMillis(getZone().adjustOffset(getMillis(), false));
    }

    public DateTime withEra(int i) {
        return withMillis(getChronology().era().set(getMillis(), i));
    }

    public DateTime withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            return withMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public DateTime withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            return i == 0 ? this : withMillis(durationFieldType.getField(getChronology()).add(getMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public DateTime withFields(C10224k kVar) {
        return kVar == null ? this : withMillis(getChronology().set(kVar, getMillis()));
    }

    public DateTime withHourOfDay(int i) {
        return withMillis(getChronology().hourOfDay().set(getMillis(), i));
    }

    public DateTime withLaterOffsetAtOverlap() {
        return withMillis(getZone().adjustOffset(getMillis(), true));
    }

    public DateTime withMillis(long j) {
        return j == getMillis() ? this : new DateTime(j, getChronology());
    }

    public DateTime withMillisOfDay(int i) {
        return withMillis(getChronology().millisOfDay().set(getMillis(), i));
    }

    public DateTime withMillisOfSecond(int i) {
        return withMillis(getChronology().millisOfSecond().set(getMillis(), i));
    }

    public DateTime withMinuteOfHour(int i) {
        return withMillis(getChronology().minuteOfHour().set(getMillis(), i));
    }

    public DateTime withMonthOfYear(int i) {
        return withMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public DateTime withPeriodAdded(C10225l lVar, int i) {
        return (lVar == null || i == 0) ? this : withMillis(getChronology().add(lVar, getMillis(), i));
    }

    public DateTime withSecondOfMinute(int i) {
        return withMillis(getChronology().secondOfMinute().set(getMillis(), i));
    }

    public DateTime withTime(int i, int i2, int i3, int i4) {
        C10142a chronology = getChronology();
        return withMillis(chronology.millisOfSecond().set(chronology.secondOfMinute().set(chronology.minuteOfHour().set(chronology.hourOfDay().set(getMillis(), i), i2), i3), i4));
    }

    public DateTime withTimeAtStartOfDay() {
        return toLocalDate().toDateTimeAtStartOfDay(getZone());
    }

    public DateTime withWeekOfWeekyear(int i) {
        return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    public DateTime withWeekyear(int i) {
        return withMillis(getChronology().weekyear().set(getMillis(), i));
    }

    public DateTime withYear(int i) {
        return withMillis(getChronology().year().set(getMillis(), i));
    }

    public DateTime withYearOfCentury(int i) {
        return withMillis(getChronology().yearOfCentury().set(getMillis(), i));
    }

    public DateTime withYearOfEra(int i) {
        return withMillis(getChronology().yearOfEra().set(getMillis(), i));
    }

    public DateTime withZone(DateTimeZone dateTimeZone) {
        return withChronology(getChronology().withZone(dateTimeZone));
    }

    public DateTime withZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone l = C10149c.m25347l(dateTimeZone);
        DateTimeZone l2 = C10149c.m25347l(getZone());
        return l == l2 ? this : new DateTime(l2.getMillisKeepLocal(l, getMillis()), getChronology().withZone(l));
    }

    public Property year() {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }
}
