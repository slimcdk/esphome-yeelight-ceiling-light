package org.joda.time.chrono;

import androidx.core.location.LocationRequestCompat;
import com.miot.service.manager.timer.TimerCodec;
import java.util.Locale;
import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.C10176b;
import org.joda.time.field.C10179e;
import org.joda.time.field.UnsupportedDurationField;

/* renamed from: org.joda.time.chrono.d */
final class C10162d extends C10176b {

    /* renamed from: b */
    private final String f18806b;

    C10162d(String str) {
        super(DateTimeFieldType.era());
        this.f18806b = str;
    }

    public int get(long j) {
        return 1;
    }

    public String getAsText(int i, Locale locale) {
        return this.f18806b;
    }

    public C10172d getDurationField() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    public int getMaximumTextLength(Locale locale) {
        return this.f18806b.length();
    }

    public int getMaximumValue() {
        return 1;
    }

    public int getMinimumValue() {
        return 1;
    }

    public C10172d getRangeDurationField() {
        return null;
    }

    public boolean isLenient() {
        return false;
    }

    public long roundCeiling(long j) {
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    public long roundFloor(long j) {
        return Long.MIN_VALUE;
    }

    public long roundHalfCeiling(long j) {
        return Long.MIN_VALUE;
    }

    public long roundHalfEven(long j) {
        return Long.MIN_VALUE;
    }

    public long roundHalfFloor(long j) {
        return Long.MIN_VALUE;
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, 1, 1);
        return j;
    }

    public long set(long j, String str, Locale locale) {
        if (this.f18806b.equals(str) || TimerCodec.ENABLE.equals(str)) {
            return j;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }
}
