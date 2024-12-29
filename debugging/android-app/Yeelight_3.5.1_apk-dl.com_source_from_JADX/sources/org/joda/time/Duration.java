package org.joda.time;

import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.C10179e;

public final class Duration extends BaseDuration {
    public static final Duration ZERO = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j) {
        super(j);
    }

    public Duration(long j, long j2) {
        super(j, j2);
    }

    public Duration(Object obj) {
        super(obj);
    }

    public Duration(C10222i iVar, C10222i iVar2) {
        super(iVar, iVar2);
    }

    public static Duration millis(long j) {
        return j == 0 ? ZERO : new Duration(j);
    }

    @FromString
    public static Duration parse(String str) {
        return new Duration((Object) str);
    }

    public static Duration standardDays(long j) {
        return j == 0 ? ZERO : new Duration(C10179e.m25391g(j, 86400000));
    }

    public static Duration standardHours(long j) {
        return j == 0 ? ZERO : new Duration(C10179e.m25391g(j, 3600000));
    }

    public static Duration standardMinutes(long j) {
        return j == 0 ? ZERO : new Duration(C10179e.m25391g(j, 60000));
    }

    public static Duration standardSeconds(long j) {
        return j == 0 ? ZERO : new Duration(C10179e.m25391g(j, 1000));
    }

    public long getStandardDays() {
        return getMillis() / 86400000;
    }

    public long getStandardHours() {
        return getMillis() / 3600000;
    }

    public long getStandardMinutes() {
        return getMillis() / 60000;
    }

    public long getStandardSeconds() {
        return getMillis() / 1000;
    }

    public Duration minus(long j) {
        return withDurationAdded(j, -1);
    }

    public Duration minus(C10221h hVar) {
        return hVar == null ? this : withDurationAdded(hVar.getMillis(), -1);
    }

    public Duration plus(long j) {
        return withDurationAdded(j, 1);
    }

    public Duration plus(C10221h hVar) {
        return hVar == null ? this : withDurationAdded(hVar.getMillis(), 1);
    }

    public Duration toDuration() {
        return this;
    }

    public Days toStandardDays() {
        return Days.days(C10179e.m25395k(getStandardDays()));
    }

    public Hours toStandardHours() {
        return Hours.hours(C10179e.m25395k(getStandardHours()));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(C10179e.m25395k(getStandardMinutes()));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(C10179e.m25395k(getStandardSeconds()));
    }

    public Duration withDurationAdded(long j, int i) {
        if (j == 0 || i == 0) {
            return this;
        }
        return new Duration(C10179e.m25389e(getMillis(), C10179e.m25391g(j, i)));
    }

    public Duration withDurationAdded(C10221h hVar, int i) {
        return (hVar == null || i == 0) ? this : withDurationAdded(hVar.getMillis(), i);
    }

    public Duration withMillis(long j) {
        return j == getMillis() ? this : new Duration(j);
    }
}
