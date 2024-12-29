package org.joda.time;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Objects;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;

@Deprecated
public final class DateMidnight extends BaseDateTime {
    private static final long serialVersionUID = 156371964018738L;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = 257629620;
        private C10143b iField;
        private DateMidnight iInstant;

        Property(DateMidnight dateMidnight, C10143b bVar) {
            this.iInstant = dateMidnight;
            this.iField = bVar;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (DateMidnight) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public DateMidnight addToCopy(int i) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.add(dateMidnight.getMillis(), i));
        }

        public DateMidnight addToCopy(long j) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.add(dateMidnight.getMillis(), j));
        }

        public DateMidnight addWrapFieldToCopy(int i) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.addWrapField(dateMidnight.getMillis(), i));
        }

        /* access modifiers changed from: protected */
        public C10142a getChronology() {
            return this.iInstant.getChronology();
        }

        public DateMidnight getDateMidnight() {
            return this.iInstant;
        }

        public C10143b getField() {
            return this.iField;
        }

        /* access modifiers changed from: protected */
        public long getMillis() {
            return this.iInstant.getMillis();
        }

        public DateMidnight roundCeilingCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundCeiling(dateMidnight.getMillis()));
        }

        public DateMidnight roundFloorCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundFloor(dateMidnight.getMillis()));
        }

        public DateMidnight roundHalfCeilingCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundHalfCeiling(dateMidnight.getMillis()));
        }

        public DateMidnight roundHalfEvenCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundHalfEven(dateMidnight.getMillis()));
        }

        public DateMidnight roundHalfFloorCopy() {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.roundHalfFloor(dateMidnight.getMillis()));
        }

        public DateMidnight setCopy(int i) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.set(dateMidnight.getMillis(), i));
        }

        public DateMidnight setCopy(String str) {
            return setCopy(str, (Locale) null);
        }

        public DateMidnight setCopy(String str, Locale locale) {
            DateMidnight dateMidnight = this.iInstant;
            return dateMidnight.withMillis(this.iField.set(dateMidnight.getMillis(), str, locale));
        }

        public DateMidnight withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public DateMidnight withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public DateMidnight() {
    }

    public DateMidnight(int i, int i2, int i3) {
        super(i, i2, i3, 0, 0, 0, 0);
    }

    public DateMidnight(int i, int i2, int i3, DateTimeZone dateTimeZone) {
        super(i, i2, i3, 0, 0, 0, 0, dateTimeZone);
    }

    public DateMidnight(int i, int i2, int i3, C10142a aVar) {
        super(i, i2, i3, 0, 0, 0, 0, aVar);
    }

    public DateMidnight(long j) {
        super(j);
    }

    public DateMidnight(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public DateMidnight(long j, C10142a aVar) {
        super(j, aVar);
    }

    public DateMidnight(Object obj) {
        super(obj, (C10142a) null);
    }

    public DateMidnight(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public DateMidnight(Object obj, C10142a aVar) {
        super(obj, C10149c.m25337b(aVar));
    }

    public DateMidnight(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public DateMidnight(C10142a aVar) {
        super(aVar);
    }

    public static DateMidnight now() {
        return new DateMidnight();
    }

    public static DateMidnight now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new DateMidnight(dateTimeZone);
    }

    public static DateMidnight now(C10142a aVar) {
        Objects.requireNonNull(aVar, "Chronology must not be null");
        return new DateMidnight(aVar);
    }

    @FromString
    public static DateMidnight parse(String str) {
        return parse(str, C10206f.m25540i().mo41445u());
    }

    public static DateMidnight parse(String str, C10199a aVar) {
        return aVar.mo41433e(str).toDateMidnight();
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    /* access modifiers changed from: protected */
    public long checkInstant(long j, C10142a aVar) {
        return aVar.dayOfMonth().roundFloor(j);
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

    public DateMidnight minus(long j) {
        return withDurationAdded(j, -1);
    }

    public DateMidnight minus(C10221h hVar) {
        return withDurationAdded(hVar, -1);
    }

    public DateMidnight minus(C10225l lVar) {
        return withPeriodAdded(lVar, -1);
    }

    public DateMidnight minusDays(int i) {
        return i == 0 ? this : withMillis(getChronology().days().subtract(getMillis(), i));
    }

    public DateMidnight minusMonths(int i) {
        return i == 0 ? this : withMillis(getChronology().months().subtract(getMillis(), i));
    }

    public DateMidnight minusWeeks(int i) {
        return i == 0 ? this : withMillis(getChronology().weeks().subtract(getMillis(), i));
    }

    public DateMidnight minusYears(int i) {
        return i == 0 ? this : withMillis(getChronology().years().subtract(getMillis(), i));
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public DateMidnight plus(long j) {
        return withDurationAdded(j, 1);
    }

    public DateMidnight plus(C10221h hVar) {
        return withDurationAdded(hVar, 1);
    }

    public DateMidnight plus(C10225l lVar) {
        return withPeriodAdded(lVar, 1);
    }

    public DateMidnight plusDays(int i) {
        return i == 0 ? this : withMillis(getChronology().days().add(getMillis(), i));
    }

    public DateMidnight plusMonths(int i) {
        return i == 0 ? this : withMillis(getChronology().months().add(getMillis(), i));
    }

    public DateMidnight plusWeeks(int i) {
        return i == 0 ? this : withMillis(getChronology().weeks().add(getMillis(), i));
    }

    public DateMidnight plusYears(int i) {
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

    public Interval toInterval() {
        C10142a chronology = getChronology();
        long millis = getMillis();
        return new Interval(millis, DurationFieldType.days().getField(chronology).add(millis, 1), chronology);
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getMillis(), getChronology());
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

    public DateMidnight withCenturyOfEra(int i) {
        return withMillis(getChronology().centuryOfEra().set(getMillis(), i));
    }

    public DateMidnight withChronology(C10142a aVar) {
        return aVar == getChronology() ? this : new DateMidnight(getMillis(), aVar);
    }

    public DateMidnight withDayOfMonth(int i) {
        return withMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    public DateMidnight withDayOfWeek(int i) {
        return withMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    public DateMidnight withDayOfYear(int i) {
        return withMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    public DateMidnight withDurationAdded(long j, int i) {
        return (j == 0 || i == 0) ? this : withMillis(getChronology().add(getMillis(), j, i));
    }

    public DateMidnight withDurationAdded(C10221h hVar, int i) {
        return (hVar == null || i == 0) ? this : withDurationAdded(hVar.getMillis(), i);
    }

    public DateMidnight withEra(int i) {
        return withMillis(getChronology().era().set(getMillis(), i));
    }

    public DateMidnight withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            return withMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public DateMidnight withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            return i == 0 ? this : withMillis(durationFieldType.getField(getChronology()).add(getMillis(), i));
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public DateMidnight withFields(C10224k kVar) {
        return kVar == null ? this : withMillis(getChronology().set(kVar, getMillis()));
    }

    public DateMidnight withMillis(long j) {
        C10142a chronology = getChronology();
        long checkInstant = checkInstant(j, chronology);
        return checkInstant == getMillis() ? this : new DateMidnight(checkInstant, chronology);
    }

    public DateMidnight withMonthOfYear(int i) {
        return withMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public DateMidnight withPeriodAdded(C10225l lVar, int i) {
        return (lVar == null || i == 0) ? this : withMillis(getChronology().add(lVar, getMillis(), i));
    }

    public DateMidnight withWeekOfWeekyear(int i) {
        return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    public DateMidnight withWeekyear(int i) {
        return withMillis(getChronology().weekyear().set(getMillis(), i));
    }

    public DateMidnight withYear(int i) {
        return withMillis(getChronology().year().set(getMillis(), i));
    }

    public DateMidnight withYearOfCentury(int i) {
        return withMillis(getChronology().yearOfCentury().set(getMillis(), i));
    }

    public DateMidnight withYearOfEra(int i) {
        return withMillis(getChronology().yearOfEra().set(getMillis(), i));
    }

    public DateMidnight withZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone l = C10149c.m25347l(dateTimeZone);
        DateTimeZone l2 = C10149c.m25347l(getZone());
        return l == l2 ? this : new DateMidnight(l2.getMillisKeepLocal(l, getMillis()), getChronology().withZone(l));
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
