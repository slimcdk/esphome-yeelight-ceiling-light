package org.joda.time;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.C10148g;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;
import org.joda.time.format.DateTimeFormat;
import p153e7.C9008d;
import p153e7.C9017l;

public final class LocalDate extends C10148g implements Serializable {
    private static final Set<DurationFieldType> DATE_DURATION_TYPES;
    private static final int DAY_OF_MONTH = 2;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = -8775358157899L;
    private final C10142a iChronology;
    private volatile transient int iHash;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -3193829732634L;
        private transient C10143b iField;
        private transient LocalDate iInstant;

        Property(LocalDate localDate, C10143b bVar) {
            this.iInstant = localDate;
            this.iField = bVar;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (LocalDate) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalDate addToCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.add(localDate.getLocalMillis(), i));
        }

        public LocalDate addWrapFieldToCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.addWrapField(localDate.getLocalMillis(), i));
        }

        /* access modifiers changed from: protected */
        public C10142a getChronology() {
            return this.iInstant.getChronology();
        }

        public C10143b getField() {
            return this.iField;
        }

        public LocalDate getLocalDate() {
            return this.iInstant;
        }

        /* access modifiers changed from: protected */
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalDate roundCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundCeiling(localDate.getLocalMillis()));
        }

        public LocalDate roundFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundFloor(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfCeiling(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfEvenCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfEven(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfFloor(localDate.getLocalMillis()));
        }

        public LocalDate setCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), i));
        }

        public LocalDate setCopy(String str) {
            return setCopy(str, (Locale) null);
        }

        public LocalDate setCopy(String str, Locale locale) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), str, locale));
        }

        public LocalDate withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalDate withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    static {
        HashSet hashSet = new HashSet();
        DATE_DURATION_TYPES = hashSet;
        hashSet.add(DurationFieldType.days());
        hashSet.add(DurationFieldType.weeks());
        hashSet.add(DurationFieldType.months());
        hashSet.add(DurationFieldType.weekyears());
        hashSet.add(DurationFieldType.years());
        hashSet.add(DurationFieldType.centuries());
        hashSet.add(DurationFieldType.eras());
    }

    public LocalDate() {
        this(C10149c.m25336a(), (C10142a) ISOChronology.getInstance());
    }

    public LocalDate(int i, int i2, int i3) {
        this(i, i2, i3, ISOChronology.getInstanceUTC());
    }

    public LocalDate(int i, int i2, int i3, C10142a aVar) {
        C10142a withUTC = C10149c.m25337b(aVar).withUTC();
        long dateTimeMillis = withUTC.getDateTimeMillis(i, i2, i3, 0);
        this.iChronology = withUTC;
        this.iLocalMillis = dateTimeMillis;
    }

    public LocalDate(long j) {
        this(j, (C10142a) ISOChronology.getInstance());
    }

    public LocalDate(long j, DateTimeZone dateTimeZone) {
        this(j, (C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDate(long j, C10142a aVar) {
        C10142a b = C10149c.m25337b(aVar);
        long millisKeepLocal = b.getZone().getMillisKeepLocal(DateTimeZone.UTC, j);
        C10142a withUTC = b.withUTC();
        this.iLocalMillis = withUTC.dayOfMonth().roundFloor(millisKeepLocal);
        this.iChronology = withUTC;
    }

    public LocalDate(Object obj) {
        this(obj, (C10142a) null);
    }

    public LocalDate(Object obj, DateTimeZone dateTimeZone) {
        C9017l e = C9008d.m21502b().mo36873e(obj);
        C10142a b = C10149c.m25337b(e.mo36862b(obj, dateTimeZone));
        C10142a withUTC = b.withUTC();
        this.iChronology = withUTC;
        int[] i = e.mo36883i(this, obj, b, C10206f.m25544m());
        this.iLocalMillis = withUTC.getDateTimeMillis(i[0], i[1], i[2], 0);
    }

    public LocalDate(Object obj, C10142a aVar) {
        C9017l e = C9008d.m21502b().mo36873e(obj);
        C10142a b = C10149c.m25337b(e.mo36861a(obj, aVar));
        C10142a withUTC = b.withUTC();
        this.iChronology = withUTC;
        int[] i = e.mo36883i(this, obj, b, C10206f.m25544m());
        this.iLocalMillis = withUTC.getDateTimeMillis(i[0], i[1], i[2], 0);
    }

    public LocalDate(DateTimeZone dateTimeZone) {
        this(C10149c.m25336a(), (C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDate(C10142a aVar) {
        this(C10149c.m25336a(), aVar);
    }

    public static LocalDate fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            int i = calendar.get(0);
            int i2 = calendar.get(1);
            if (i != 1) {
                i2 = 1 - i2;
            }
            return new LocalDate(i2, calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static LocalDate fromDateFields(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (date.getTime() >= 0) {
            return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return fromCalendarFields(gregorianCalendar);
        }
    }

    public static LocalDate now() {
        return new LocalDate();
    }

    public static LocalDate now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new LocalDate(dateTimeZone);
    }

    public static LocalDate now(C10142a aVar) {
        Objects.requireNonNull(aVar, "Chronology must not be null");
        return new LocalDate(aVar);
    }

    @FromString
    public static LocalDate parse(String str) {
        return parse(str, C10206f.m25544m());
    }

    public static LocalDate parse(String str, C10199a aVar) {
        return aVar.mo41434f(str);
    }

    private Object readResolve() {
        C10142a aVar = this.iChronology;
        return aVar == null ? new LocalDate(this.iLocalMillis, (C10142a) ISOChronology.getInstanceUTC()) : !DateTimeZone.UTC.equals(aVar.getZone()) ? new LocalDate(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public int compareTo(C10224k kVar) {
        if (this == kVar) {
            return 0;
        }
        if (kVar instanceof LocalDate) {
            LocalDate localDate = (LocalDate) kVar;
            if (this.iChronology.equals(localDate.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localDate.iLocalMillis;
                if (j < j2) {
                    return -1;
                }
                return j == j2 ? 0 : 1;
            }
        }
        return super.compareTo(kVar);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            LocalDate localDate = (LocalDate) obj;
            if (this.iChronology.equals(localDate.iChronology)) {
                return this.iLocalMillis == localDate.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    public int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getLocalMillis());
    }

    public C10142a getChronology() {
        return this.iChronology;
    }

    public int getDayOfMonth() {
        return getChronology().dayOfMonth().get(getLocalMillis());
    }

    public int getDayOfWeek() {
        return getChronology().dayOfWeek().get(getLocalMillis());
    }

    public int getDayOfYear() {
        return getChronology().dayOfYear().get(getLocalMillis());
    }

    public int getEra() {
        return getChronology().era().get(getLocalMillis());
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

    /* access modifiers changed from: protected */
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMonthOfYear() {
        return getChronology().monthOfYear().get(getLocalMillis());
    }

    public int getValue(int i) {
        C10143b year;
        if (i == 0) {
            year = getChronology().year();
        } else if (i == 1) {
            year = getChronology().monthOfYear();
        } else if (i == 2) {
            year = getChronology().dayOfMonth();
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        return year.get(getLocalMillis());
    }

    public int getWeekOfWeekyear() {
        return getChronology().weekOfWeekyear().get(getLocalMillis());
    }

    public int getWeekyear() {
        return getChronology().weekyear().get(getLocalMillis());
    }

    public int getYear() {
        return getChronology().year().get(getLocalMillis());
    }

    public int getYearOfCentury() {
        return getChronology().yearOfCentury().get(getLocalMillis());
    }

    public int getYearOfEra() {
        return getChronology().yearOfEra().get(getLocalMillis());
    }

    public int hashCode() {
        int i = this.iHash;
        if (i != 0) {
            return i;
        }
        int hashCode = super.hashCode();
        this.iHash = hashCode;
        return hashCode;
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        DurationFieldType durationType = dateTimeFieldType.getDurationType();
        if (DATE_DURATION_TYPES.contains(durationType) || durationType.getField(getChronology()).getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return dateTimeFieldType.getField(getChronology()).isSupported();
        }
        return false;
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        C10172d field = durationFieldType.getField(getChronology());
        if (DATE_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public LocalDate minus(C10225l lVar) {
        return withPeriodAdded(lVar, -1);
    }

    public LocalDate minusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().subtract(getLocalMillis(), i));
    }

    public LocalDate minusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().subtract(getLocalMillis(), i));
    }

    public LocalDate minusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i));
    }

    public LocalDate minusYears(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().years().subtract(getLocalMillis(), i));
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public LocalDate plus(C10225l lVar) {
        return withPeriodAdded(lVar, 1);
    }

    public LocalDate plusDays(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().days().add(getLocalMillis(), i));
    }

    public LocalDate plusMonths(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().months().add(getLocalMillis(), i));
    }

    public LocalDate plusWeeks(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().weeks().add(getLocalMillis(), i));
    }

    public LocalDate plusYears(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().years().add(getLocalMillis(), i));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.getField(getChronology()));
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    public int size() {
        return 3;
    }

    public Date toDate() {
        int dayOfMonth = getDayOfMonth();
        Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, dayOfMonth);
        LocalDate fromDateFields = fromDateFields(date);
        if (fromDateFields.isBefore(this)) {
            while (!fromDateFields.equals(this)) {
                date.setTime(date.getTime() + 3600000);
                fromDateFields = fromDateFields(date);
            }
            while (true) {
                int date2 = date.getDate();
                long time = date.getTime();
                if (date2 == dayOfMonth) {
                    date.setTime(time - 1000);
                } else {
                    date.setTime(time + 1000);
                    return date;
                }
            }
        } else if (!fromDateFields.equals(this)) {
            return date;
        } else {
            Date date3 = new Date(date.getTime() - ((long) TimeZone.getDefault().getDSTSavings()));
            return date3.getDate() == dayOfMonth ? date3 : date;
        }
    }

    @Deprecated
    public DateMidnight toDateMidnight() {
        return toDateMidnight((DateTimeZone) null);
    }

    @Deprecated
    public DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(C10149c.m25347l(dateTimeZone)));
    }

    public DateTime toDateTime(LocalTime localTime) {
        return toDateTime(localTime, (DateTimeZone) null);
    }

    public DateTime toDateTime(LocalTime localTime, DateTimeZone dateTimeZone) {
        if (localTime == null || getChronology() == localTime.getChronology()) {
            C10142a withZone = getChronology().withZone(dateTimeZone);
            long j = withZone.set(this, C10149c.m25336a());
            if (localTime != null) {
                j = withZone.set(localTime, j);
            }
            return new DateTime(j, withZone);
        }
        throw new IllegalArgumentException("The chronology of the time does not match");
    }

    public DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime((DateTimeZone) null);
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        C10142a withZone = getChronology().withZone(C10149c.m25347l(dateTimeZone));
        return new DateTime(withZone.set(this, C10149c.m25336a()), withZone);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight((DateTimeZone) null);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(C10149c.m25347l(dateTimeZone)));
    }

    public DateTime toDateTimeAtStartOfDay() {
        return toDateTimeAtStartOfDay((DateTimeZone) null);
    }

    public DateTime toDateTimeAtStartOfDay(DateTimeZone dateTimeZone) {
        DateTimeZone l = C10149c.m25347l(dateTimeZone);
        C10142a withZone = getChronology().withZone(l);
        return new DateTime(withZone.dayOfMonth().roundFloor(l.convertLocalToUTC(getLocalMillis() + 21600000, false)), withZone);
    }

    public Interval toInterval() {
        return toInterval((DateTimeZone) null);
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone l = C10149c.m25347l(dateTimeZone);
        return new Interval((C10222i) toDateTimeAtStartOfDay(l), (C10222i) plusDays(1).toDateTimeAtStartOfDay(l));
    }

    public LocalDateTime toLocalDateTime(LocalTime localTime) {
        if (localTime == null) {
            throw new IllegalArgumentException("The time must not be null");
        } else if (getChronology() == localTime.getChronology()) {
            return new LocalDateTime(getLocalMillis() + localTime.getLocalMillis(), getChronology());
        } else {
            throw new IllegalArgumentException("The chronology of the time does not match");
        }
    }

    @ToString
    public String toString() {
        return C10206f.m25534c().mo41439k(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41439k(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41444t(locale).mo41439k(this);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public LocalDate withCenturyOfEra(int i) {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfMonth(int i) {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfWeek(int i) {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfYear(int i) {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
    }

    public LocalDate withEra(int i) {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
    }

    public LocalDate withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i));
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    public LocalDate withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (isSupported(durationFieldType)) {
            return i == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i));
        } else {
            throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
        }
    }

    public LocalDate withFields(C10224k kVar) {
        return kVar == null ? this : withLocalMillis(getChronology().set(kVar, getLocalMillis()));
    }

    /* access modifiers changed from: package-private */
    public LocalDate withLocalMillis(long j) {
        long roundFloor = this.iChronology.dayOfMonth().roundFloor(j);
        return roundFloor == getLocalMillis() ? this : new LocalDate(roundFloor, getChronology());
    }

    public LocalDate withMonthOfYear(int i) {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
    }

    public LocalDate withPeriodAdded(C10225l lVar, int i) {
        if (lVar == null || i == 0) {
            return this;
        }
        long localMillis = getLocalMillis();
        C10142a chronology = getChronology();
        for (int i2 = 0; i2 < lVar.size(); i2++) {
            long f = (long) C10179e.m25390f(lVar.getValue(i2), i);
            DurationFieldType fieldType = lVar.getFieldType(i2);
            if (isSupported(fieldType)) {
                localMillis = fieldType.getField(chronology).add(localMillis, f);
            }
        }
        return withLocalMillis(localMillis);
    }

    public LocalDate withWeekOfWeekyear(int i) {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
    }

    public LocalDate withWeekyear(int i) {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
    }

    public LocalDate withYear(int i) {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
    }

    public LocalDate withYearOfCentury(int i) {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
    }

    public LocalDate withYearOfEra(int i) {
        return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i));
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
