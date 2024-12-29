package org.joda.time.base;

import java.util.Date;
import org.joda.convert.ToString;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10149c;
import org.joda.time.C10222i;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;

/* renamed from: org.joda.time.base.c */
public abstract class C3588c implements C10222i {
    protected C3588c() {
    }

    public int compareTo(C10222i iVar) {
        if (this == iVar) {
            return 0;
        }
        long millis = iVar.getMillis();
        long millis2 = getMillis();
        if (millis2 == millis) {
            return 0;
        }
        return millis2 < millis ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10222i)) {
            return false;
        }
        C10222i iVar = (C10222i) obj;
        return getMillis() == iVar.getMillis() && C10179e.m25385a(getChronology(), iVar.getChronology());
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.getField(getChronology()).get(getMillis());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public int get(C10143b bVar) {
        if (bVar != null) {
            return bVar.get(getMillis());
        }
        throw new IllegalArgumentException("The DateTimeField must not be null");
    }

    public DateTimeZone getZone() {
        return getChronology().getZone();
    }

    public int hashCode() {
        return ((int) (getMillis() ^ (getMillis() >>> 32))) + getChronology().hashCode();
    }

    public boolean isAfter(long j) {
        return getMillis() > j;
    }

    public boolean isAfter(C10222i iVar) {
        return isAfter(C10149c.m25342g(iVar));
    }

    public boolean isAfterNow() {
        return isAfter(C10149c.m25336a());
    }

    public boolean isBefore(long j) {
        return getMillis() < j;
    }

    public boolean isBefore(C10222i iVar) {
        return isBefore(C10149c.m25342g(iVar));
    }

    public boolean isBeforeNow() {
        return isBefore(C10149c.m25336a());
    }

    public boolean isEqual(long j) {
        return getMillis() == j;
    }

    public boolean isEqual(C10222i iVar) {
        return isEqual(C10149c.m25342g(iVar));
    }

    public boolean isEqualNow() {
        return isEqual(C10149c.m25336a());
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.getField(getChronology()).isSupported();
    }

    public Date toDate() {
        return new Date(getMillis());
    }

    public DateTime toDateTime() {
        return new DateTime(getMillis(), getZone());
    }

    public DateTime toDateTime(DateTimeZone dateTimeZone) {
        return new DateTime(getMillis(), C10149c.m25337b(getChronology()).withZone(dateTimeZone));
    }

    public DateTime toDateTime(C10142a aVar) {
        return new DateTime(getMillis(), aVar);
    }

    public DateTime toDateTimeISO() {
        return new DateTime(getMillis(), (C10142a) ISOChronology.getInstance(getZone()));
    }

    public Instant toInstant() {
        return new Instant(getMillis());
    }

    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), getZone());
    }

    public MutableDateTime toMutableDateTime(DateTimeZone dateTimeZone) {
        return new MutableDateTime(getMillis(), C10149c.m25337b(getChronology()).withZone(dateTimeZone));
    }

    public MutableDateTime toMutableDateTime(C10142a aVar) {
        return new MutableDateTime(getMillis(), aVar);
    }

    public MutableDateTime toMutableDateTimeISO() {
        return new MutableDateTime(getMillis(), (C10142a) ISOChronology.getInstance(getZone()));
    }

    @ToString
    public String toString() {
        return C10206f.m25539h().mo41438j(this);
    }

    public String toString(C10199a aVar) {
        return aVar == null ? toString() : aVar.mo41438j(this);
    }
}
