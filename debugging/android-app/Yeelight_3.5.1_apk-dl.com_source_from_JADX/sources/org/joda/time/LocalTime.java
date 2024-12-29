package org.joda.time;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.C10148g;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;
import org.joda.time.format.DateTimeFormat;
import p153e7.C9008d;
import p153e7.C9017l;

public final class LocalTime extends C10148g implements Serializable {
    private static final int HOUR_OF_DAY = 0;
    public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);
    private static final int MILLIS_OF_SECOND = 3;
    private static final int MINUTE_OF_HOUR = 1;
    private static final int SECOND_OF_MINUTE = 2;
    private static final Set<DurationFieldType> TIME_DURATION_TYPES;
    private static final long serialVersionUID = -12873158713873L;
    private final C10142a iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -325842547277223L;
        private transient C10143b iField;
        private transient LocalTime iInstant;

        Property(LocalTime localTime, C10143b bVar) {
            this.iInstant = localTime;
            this.iField = bVar;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (LocalTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalTime addCopy(int i) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), i));
        }

        public LocalTime addCopy(long j) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), j));
        }

        public LocalTime addNoWrapToCopy(int i) {
            long add = this.iField.add(this.iInstant.getLocalMillis(), i);
            if (((long) this.iInstant.getChronology().millisOfDay().get(add)) == add) {
                return this.iInstant.withLocalMillis(add);
            }
            throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
        }

        public LocalTime addWrapFieldToCopy(int i) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.addWrapField(localTime.getLocalMillis(), i));
        }

        /* access modifiers changed from: protected */
        public C10142a getChronology() {
            return this.iInstant.getChronology();
        }

        public C10143b getField() {
            return this.iField;
        }

        public LocalTime getLocalTime() {
            return this.iInstant;
        }

        /* access modifiers changed from: protected */
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalTime roundCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundFloor(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfEvenCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfEven(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfFloor(localTime.getLocalMillis()));
        }

        public LocalTime setCopy(int i) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), i));
        }

        public LocalTime setCopy(String str) {
            return setCopy(str, (Locale) null);
        }

        public LocalTime setCopy(String str, Locale locale) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), str, locale));
        }

        public LocalTime withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalTime withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    static {
        HashSet hashSet = new HashSet();
        TIME_DURATION_TYPES = hashSet;
        hashSet.add(DurationFieldType.millis());
        hashSet.add(DurationFieldType.seconds());
        hashSet.add(DurationFieldType.minutes());
        hashSet.add(DurationFieldType.hours());
    }

    public LocalTime() {
        this(C10149c.m25336a(), (C10142a) ISOChronology.getInstance());
    }

    public LocalTime(int i, int i2) {
        this(i, i2, 0, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i, int i2, int i3) {
        this(i, i2, i3, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i, int i2, int i3, int i4, C10142a aVar) {
        C10142a withUTC = C10149c.m25337b(aVar).withUTC();
        long dateTimeMillis = withUTC.getDateTimeMillis(0, i, i2, i3, i4);
        this.iChronology = withUTC;
        this.iLocalMillis = dateTimeMillis;
    }

    public LocalTime(long j) {
        this(j, (C10142a) ISOChronology.getInstance());
    }

    public LocalTime(long j, DateTimeZone dateTimeZone) {
        this(j, (C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    public LocalTime(long j, C10142a aVar) {
        C10142a b = C10149c.m25337b(aVar);
        long millisKeepLocal = b.getZone().getMillisKeepLocal(DateTimeZone.UTC, j);
        C10142a withUTC = b.withUTC();
        this.iLocalMillis = (long) withUTC.millisOfDay().get(millisKeepLocal);
        this.iChronology = withUTC;
    }

    public LocalTime(Object obj) {
        this(obj, (C10142a) null);
    }

    public LocalTime(Object obj, DateTimeZone dateTimeZone) {
        C9017l e = C9008d.m21502b().mo36873e(obj);
        C10142a b = C10149c.m25337b(e.mo36862b(obj, dateTimeZone));
        C10142a withUTC = b.withUTC();
        this.iChronology = withUTC;
        int[] i = e.mo36883i(this, obj, b, C10206f.m25545n());
        this.iLocalMillis = withUTC.getDateTimeMillis(0, i[0], i[1], i[2], i[3]);
    }

    public LocalTime(Object obj, C10142a aVar) {
        C9017l e = C9008d.m21502b().mo36873e(obj);
        C10142a b = C10149c.m25337b(e.mo36861a(obj, aVar));
        C10142a withUTC = b.withUTC();
        this.iChronology = withUTC;
        int[] i = e.mo36883i(this, obj, b, C10206f.m25545n());
        this.iLocalMillis = withUTC.getDateTimeMillis(0, i[0], i[1], i[2], i[3]);
    }

    public LocalTime(DateTimeZone dateTimeZone) {
        this(C10149c.m25336a(), (C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    public LocalTime(C10142a aVar) {
        this(C10149c.m25336a(), aVar);
    }

    public static LocalTime fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new LocalTime(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static LocalTime fromDateFields(Date date) {
        if (date != null) {
            return new LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static LocalTime fromMillisOfDay(long j) {
        return fromMillisOfDay(j, (C10142a) null);
    }

    public static LocalTime fromMillisOfDay(long j, C10142a aVar) {
        return new LocalTime(j, C10149c.m25337b(aVar).withUTC());
    }

    public static LocalTime now() {
        return new LocalTime();
    }

    public static LocalTime now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new LocalTime(dateTimeZone);
    }

    public static LocalTime now(C10142a aVar) {
        Objects.requireNonNull(aVar, "Chronology must not be null");
        return new LocalTime(aVar);
    }

    @FromString
    public static LocalTime parse(String str) {
        return parse(str, C10206f.m25545n());
    }

    public static LocalTime parse(String str, C10199a aVar) {
        return aVar.mo41436h(str);
    }

    private Object readResolve() {
        C10142a aVar = this.iChronology;
        return aVar == null ? new LocalTime(this.iLocalMillis, (C10142a) ISOChronology.getInstanceUTC()) : !DateTimeZone.UTC.equals(aVar.getZone()) ? new LocalTime(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public int compareTo(C10224k kVar) {
        if (this == kVar) {
            return 0;
        }
        if (kVar instanceof LocalTime) {
            LocalTime localTime = (LocalTime) kVar;
            if (this.iChronology.equals(localTime.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localTime.iLocalMillis;
                if (j < j2) {
                    return -1;
                }
                return j == j2 ? 0 : 1;
            }
        }
        return super.compareTo(kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.iChronology.equals(localTime.iChronology)) {
                return this.iLocalMillis == localTime.iLocalMillis;
            }
        }
        return super.equals(obj);
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

    public C10142a getChronology() {
        return this.iChronology;
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

    public int getHourOfDay() {
        return getChronology().hourOfDay().get(getLocalMillis());
    }

    /* access modifiers changed from: protected */
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMillisOfDay() {
        return getChronology().millisOfDay().get(getLocalMillis());
    }

    public int getMillisOfSecond() {
        return getChronology().millisOfSecond().get(getLocalMillis());
    }

    public int getMinuteOfHour() {
        return getChronology().minuteOfHour().get(getLocalMillis());
    }

    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    public int getValue(int i) {
        C10143b hourOfDay;
        if (i == 0) {
            hourOfDay = getChronology().hourOfDay();
        } else if (i == 1) {
            hourOfDay = getChronology().minuteOfHour();
        } else if (i == 2) {
            hourOfDay = getChronology().secondOfMinute();
        } else if (i == 3) {
            hourOfDay = getChronology().millisOfSecond();
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        return hourOfDay.get(getLocalMillis());
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null || !isSupported(dateTimeFieldType.getDurationType())) {
            return false;
        }
        DurationFieldType rangeDurationType = dateTimeFieldType.getRangeDurationType();
        return isSupported(rangeDurationType) || rangeDurationType == DurationFieldType.days();
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        C10172d field = durationFieldType.getField(getChronology());
        if (TIME_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() < getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalTime minus(C10225l lVar) {
        return withPeriodAdded(lVar, -1);
    }

    public LocalTime minusHours(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i));
    }

    public LocalTime minusMillis(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i));
    }

    public LocalTime minusMinutes(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i));
    }

    public LocalTime minusSeconds(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i));
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public LocalTime plus(C10225l lVar) {
        return withPeriodAdded(lVar, 1);
    }

    public LocalTime plusHours(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().hours().add(getLocalMillis(), i));
    }

    public LocalTime plusMillis(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().millis().add(getLocalMillis(), i));
    }

    public LocalTime plusMinutes(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().minutes().add(getLocalMillis(), i));
    }

    public LocalTime plusSeconds(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().seconds().add(getLocalMillis(), i));
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

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
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

    @ToString
    public String toString() {
        return C10206f.m25547p().mo41439k(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41439k(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41444t(locale).mo41439k(this);
    }

    public LocalTime withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i));
        } else {
            throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
        }
    }

    public LocalTime withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (isSupported(durationFieldType)) {
            return i == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i));
        } else {
            throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
        }
    }

    public LocalTime withFields(C10224k kVar) {
        return kVar == null ? this : withLocalMillis(getChronology().set(kVar, getLocalMillis()));
    }

    public LocalTime withHourOfDay(int i) {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i));
    }

    /* access modifiers changed from: package-private */
    public LocalTime withLocalMillis(long j) {
        return j == getLocalMillis() ? this : new LocalTime(j, getChronology());
    }

    public LocalTime withMillisOfDay(int i) {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i));
    }

    public LocalTime withMillisOfSecond(int i) {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i));
    }

    public LocalTime withMinuteOfHour(int i) {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i));
    }

    public LocalTime withPeriodAdded(C10225l lVar, int i) {
        return (lVar == null || i == 0) ? this : withLocalMillis(getChronology().add(lVar, getLocalMillis(), i));
    }

    public LocalTime withSecondOfMinute(int i) {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i));
    }
}
