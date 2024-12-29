package org.joda.time;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Objects;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;

public class MutableDateTime extends BaseDateTime implements Cloneable {
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_FLOOR = 1;
    public static final int ROUND_HALF_CEILING = 4;
    public static final int ROUND_HALF_EVEN = 5;
    public static final int ROUND_HALF_FLOOR = 3;
    public static final int ROUND_NONE = 0;
    private static final long serialVersionUID = 2852608688135209575L;
    private C10143b iRoundingField;
    private int iRoundingMode;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        private C10143b iField;
        private MutableDateTime iInstant;

        Property(MutableDateTime mutableDateTime, C10143b bVar) {
            this.iInstant = mutableDateTime;
            this.iField = bVar;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public MutableDateTime add(int i) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        public MutableDateTime add(long j) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), j));
            return this.iInstant;
        }

        public MutableDateTime addWrapField(int i) {
            this.iInstant.setMillis(getField().addWrapField(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        /* access modifiers changed from: protected */
        public C10142a getChronology() {
            return this.iInstant.getChronology();
        }

        public C10143b getField() {
            return this.iField;
        }

        /* access modifiers changed from: protected */
        public long getMillis() {
            return this.iInstant.getMillis();
        }

        public MutableDateTime getMutableDateTime() {
            return this.iInstant;
        }

        public MutableDateTime roundCeiling() {
            this.iInstant.setMillis(getField().roundCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundFloor() {
            this.iInstant.setMillis(getField().roundFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfCeiling() {
            this.iInstant.setMillis(getField().roundHalfCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfEven() {
            this.iInstant.setMillis(getField().roundHalfEven(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfFloor() {
            this.iInstant.setMillis(getField().roundHalfFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime set(int i) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        public MutableDateTime set(String str) {
            set(str, (Locale) null);
            return this.iInstant;
        }

        public MutableDateTime set(String str, Locale locale) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), str, locale));
            return this.iInstant;
        }
    }

    public MutableDateTime() {
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2, i3, i4, i5, i6, i7);
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, i7, dateTimeZone);
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C10142a aVar) {
        super(i, i2, i3, i4, i5, i6, i7, aVar);
    }

    public MutableDateTime(long j) {
        super(j);
    }

    public MutableDateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public MutableDateTime(long j, C10142a aVar) {
        super(j, aVar);
    }

    public MutableDateTime(Object obj) {
        super(obj, (C10142a) null);
    }

    public MutableDateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public MutableDateTime(Object obj, C10142a aVar) {
        super(obj, C10149c.m25337b(aVar));
    }

    public MutableDateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public MutableDateTime(C10142a aVar) {
        super(aVar);
    }

    public static MutableDateTime now() {
        return new MutableDateTime();
    }

    public static MutableDateTime now(DateTimeZone dateTimeZone) {
        Objects.requireNonNull(dateTimeZone, "Zone must not be null");
        return new MutableDateTime(dateTimeZone);
    }

    public static MutableDateTime now(C10142a aVar) {
        Objects.requireNonNull(aVar, "Chronology must not be null");
        return new MutableDateTime(aVar);
    }

    @FromString
    public static MutableDateTime parse(String str) {
        return parse(str, C10206f.m25540i().mo41445u());
    }

    public static MutableDateTime parse(String str, C10199a aVar) {
        return aVar.mo41433e(str).toMutableDateTime();
    }

    public void add(long j) {
        setMillis(C10179e.m25389e(getMillis(), j));
    }

    public void add(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            setMillis(durationFieldType.getField(getChronology()).add(getMillis(), i));
            return;
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public void add(C10221h hVar) {
        add(hVar, 1);
    }

    public void add(C10221h hVar, int i) {
        if (hVar != null) {
            add(C10179e.m25391g(hVar.getMillis(), i));
        }
    }

    public void add(C10225l lVar) {
        add(lVar, 1);
    }

    public void add(C10225l lVar, int i) {
        if (lVar != null) {
            setMillis(getChronology().add(lVar, getMillis(), i));
        }
    }

    public void addDays(int i) {
        setMillis(getChronology().days().add(getMillis(), i));
    }

    public void addHours(int i) {
        setMillis(getChronology().hours().add(getMillis(), i));
    }

    public void addMillis(int i) {
        setMillis(getChronology().millis().add(getMillis(), i));
    }

    public void addMinutes(int i) {
        setMillis(getChronology().minutes().add(getMillis(), i));
    }

    public void addMonths(int i) {
        setMillis(getChronology().months().add(getMillis(), i));
    }

    public void addSeconds(int i) {
        setMillis(getChronology().seconds().add(getMillis(), i));
    }

    public void addWeeks(int i) {
        setMillis(getChronology().weeks().add(getMillis(), i));
    }

    public void addWeekyears(int i) {
        setMillis(getChronology().weekyears().add(getMillis(), i));
    }

    public void addYears(int i) {
        setMillis(getChronology().years().add(getMillis(), i));
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutableDateTime copy() {
        return (MutableDateTime) clone();
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

    public C10143b getRoundingField() {
        return this.iRoundingField;
    }

    public int getRoundingMode() {
        return this.iRoundingMode;
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

    public Property minuteOfDay() {
        return new Property(this, getChronology().minuteOfDay());
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
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

    public void set(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            setMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i));
            return;
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public void setChronology(C10142a aVar) {
        super.setChronology(aVar);
    }

    public void setDate(int i, int i2, int i3) {
        setDate(getChronology().getDateTimeMillis(i, i2, i3, 0));
    }

    public void setDate(long j) {
        setMillis(getChronology().millisOfDay().set(j, getMillisOfDay()));
    }

    public void setDate(C10222i iVar) {
        DateTimeZone zone;
        long g = C10149c.m25342g(iVar);
        if ((iVar instanceof C10220g) && (zone = C10149c.m25337b(((C10220g) iVar).getChronology()).getZone()) != null) {
            g = zone.getMillisKeepLocal(getZone(), g);
        }
        setDate(g);
    }

    public void setDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        setMillis(getChronology().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7));
    }

    public void setDayOfMonth(int i) {
        setMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    public void setDayOfWeek(int i) {
        setMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    public void setDayOfYear(int i) {
        setMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    public void setHourOfDay(int i) {
        setMillis(getChronology().hourOfDay().set(getMillis(), i));
    }

    public void setMillis(long j) {
        int i = this.iRoundingMode;
        if (i == 1) {
            j = this.iRoundingField.roundFloor(j);
        } else if (i == 2) {
            j = this.iRoundingField.roundCeiling(j);
        } else if (i == 3) {
            j = this.iRoundingField.roundHalfFloor(j);
        } else if (i == 4) {
            j = this.iRoundingField.roundHalfCeiling(j);
        } else if (i == 5) {
            j = this.iRoundingField.roundHalfEven(j);
        }
        super.setMillis(j);
    }

    public void setMillis(C10222i iVar) {
        setMillis(C10149c.m25342g(iVar));
    }

    public void setMillisOfDay(int i) {
        setMillis(getChronology().millisOfDay().set(getMillis(), i));
    }

    public void setMillisOfSecond(int i) {
        setMillis(getChronology().millisOfSecond().set(getMillis(), i));
    }

    public void setMinuteOfDay(int i) {
        setMillis(getChronology().minuteOfDay().set(getMillis(), i));
    }

    public void setMinuteOfHour(int i) {
        setMillis(getChronology().minuteOfHour().set(getMillis(), i));
    }

    public void setMonthOfYear(int i) {
        setMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public void setRounding(C10143b bVar) {
        setRounding(bVar, 1);
    }

    public void setRounding(C10143b bVar, int i) {
        if (bVar == null || (i >= 0 && i <= 5)) {
            this.iRoundingField = i == 0 ? null : bVar;
            if (bVar == null) {
                i = 0;
            }
            this.iRoundingMode = i;
            setMillis(getMillis());
            return;
        }
        throw new IllegalArgumentException("Illegal rounding mode: " + i);
    }

    public void setSecondOfDay(int i) {
        setMillis(getChronology().secondOfDay().set(getMillis(), i));
    }

    public void setSecondOfMinute(int i) {
        setMillis(getChronology().secondOfMinute().set(getMillis(), i));
    }

    public void setTime(int i, int i2, int i3, int i4) {
        setMillis(getChronology().getDateTimeMillis(getMillis(), i, i2, i3, i4));
    }

    public void setTime(long j) {
        setMillis(getChronology().millisOfDay().set(getMillis(), ISOChronology.getInstanceUTC().millisOfDay().get(j)));
    }

    public void setTime(C10222i iVar) {
        long g = C10149c.m25342g(iVar);
        DateTimeZone zone = C10149c.m25341f(iVar).getZone();
        if (zone != null) {
            g = zone.getMillisKeepLocal(DateTimeZone.UTC, g);
        }
        setTime(g);
    }

    public void setWeekOfWeekyear(int i) {
        setMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    public void setWeekyear(int i) {
        setMillis(getChronology().weekyear().set(getMillis(), i));
    }

    public void setYear(int i) {
        setMillis(getChronology().year().set(getMillis(), i));
    }

    public void setZone(DateTimeZone dateTimeZone) {
        DateTimeZone l = C10149c.m25347l(dateTimeZone);
        C10142a chronology = getChronology();
        if (chronology.getZone() != l) {
            setChronology(chronology.withZone(l));
        }
    }

    public void setZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone l = C10149c.m25347l(dateTimeZone);
        DateTimeZone l2 = C10149c.m25347l(getZone());
        if (l != l2) {
            long millisKeepLocal = l2.getMillisKeepLocal(l, getMillis());
            setChronology(getChronology().withZone(l));
            setMillis(millisKeepLocal);
        }
    }

    @ToString
    public String toString() {
        return C10206f.m25539h().mo41438j(this);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
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
