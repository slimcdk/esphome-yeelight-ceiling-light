package org.joda.time.chrono;

import androidx.core.location.LocationRequestCompat;
import java.util.Locale;
import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.C10176b;
import org.joda.time.field.C10179e;
import org.joda.time.field.UnsupportedDurationField;

/* renamed from: org.joda.time.chrono.i */
final class C10167i extends C10176b {

    /* renamed from: b */
    private final BasicChronology f18811b;

    C10167i(BasicChronology basicChronology) {
        super(DateTimeFieldType.era());
        this.f18811b = basicChronology;
    }

    public int get(long j) {
        return this.f18811b.getYear(j) <= 0 ? 0 : 1;
    }

    public String getAsText(int i, Locale locale) {
        return C10168j.m25362h(locale).mo41277g(i);
    }

    public C10172d getDurationField() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    public int getMaximumTextLength(Locale locale) {
        return C10168j.m25362h(locale).mo41280k();
    }

    public int getMaximumValue() {
        return 1;
    }

    public int getMinimumValue() {
        return 0;
    }

    public C10172d getRangeDurationField() {
        return null;
    }

    public boolean isLenient() {
        return false;
    }

    public long roundCeiling(long j) {
        return get(j) == 0 ? this.f18811b.setYear(0, 1) : LocationRequestCompat.PASSIVE_INTERVAL;
    }

    public long roundFloor(long j) {
        if (get(j) == 1) {
            return this.f18811b.setYear(0, 1);
        }
        return Long.MIN_VALUE;
    }

    public long roundHalfCeiling(long j) {
        return roundFloor(j);
    }

    public long roundHalfEven(long j) {
        return roundFloor(j);
    }

    public long roundHalfFloor(long j) {
        return roundFloor(j);
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, 0, 1);
        if (get(j) == i) {
            return j;
        }
        return this.f18811b.setYear(j, -this.f18811b.getYear(j));
    }

    public long set(long j, String str, Locale locale) {
        return set(j, C10168j.m25362h(locale).mo41276f(str));
    }
}
