package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.C3588c;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;
import p153e7.C9008d;

public final class Instant extends C3588c implements Serializable {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    public Instant() {
        this.iMillis = C10149c.m25336a();
    }

    public Instant(long j) {
        this.iMillis = j;
    }

    public Instant(Object obj) {
        this.iMillis = C9008d.m21502b().mo36871c(obj).mo36864d(obj, ISOChronology.getInstanceUTC());
    }

    public static Instant now() {
        return new Instant();
    }

    @FromString
    public static Instant parse(String str) {
        return parse(str, C10206f.m25540i());
    }

    public static Instant parse(String str, C10199a aVar) {
        return aVar.mo41433e(str).toInstant();
    }

    public C10142a getChronology() {
        return ISOChronology.getInstanceUTC();
    }

    public long getMillis() {
        return this.iMillis;
    }

    public Instant minus(long j) {
        return withDurationAdded(j, -1);
    }

    public Instant minus(C10221h hVar) {
        return withDurationAdded(hVar, -1);
    }

    public Instant plus(long j) {
        return withDurationAdded(j, 1);
    }

    public Instant plus(C10221h hVar) {
        return withDurationAdded(hVar, 1);
    }

    public DateTime toDateTime() {
        return new DateTime(getMillis(), (C10142a) ISOChronology.getInstance());
    }

    @Deprecated
    public DateTime toDateTimeISO() {
        return toDateTime();
    }

    public Instant toInstant() {
        return this;
    }

    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), (C10142a) ISOChronology.getInstance());
    }

    @Deprecated
    public MutableDateTime toMutableDateTimeISO() {
        return toMutableDateTime();
    }

    public Instant withDurationAdded(long j, int i) {
        return (j == 0 || i == 0) ? this : withMillis(getChronology().add(getMillis(), j, i));
    }

    public Instant withDurationAdded(C10221h hVar, int i) {
        return (hVar == null || i == 0) ? this : withDurationAdded(hVar.getMillis(), i);
    }

    public Instant withMillis(long j) {
        return j == this.iMillis ? this : new Instant(j);
    }
}
