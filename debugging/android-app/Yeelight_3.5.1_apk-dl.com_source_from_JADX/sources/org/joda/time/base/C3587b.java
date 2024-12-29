package org.joda.time.base;

import com.miot.service.manager.timer.TimerCodec;
import org.joda.convert.ToString;
import org.joda.time.C10221h;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.format.C10205e;

/* renamed from: org.joda.time.base.b */
public abstract class C3587b implements C10221h {
    protected C3587b() {
    }

    public int compareTo(C10221h hVar) {
        long millis = getMillis();
        long millis2 = hVar.getMillis();
        if (millis < millis2) {
            return -1;
        }
        return millis > millis2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10221h) && getMillis() == ((C10221h) obj).getMillis();
    }

    public int hashCode() {
        long millis = getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    public boolean isEqual(C10221h hVar) {
        if (hVar == null) {
            hVar = Duration.ZERO;
        }
        return compareTo(hVar) == 0;
    }

    public boolean isLongerThan(C10221h hVar) {
        if (hVar == null) {
            hVar = Duration.ZERO;
        }
        return compareTo(hVar) > 0;
    }

    public boolean isShorterThan(C10221h hVar) {
        if (hVar == null) {
            hVar = Duration.ZERO;
        }
        return compareTo(hVar) < 0;
    }

    public Duration toDuration() {
        return new Duration(getMillis());
    }

    public Period toPeriod() {
        return new Period(getMillis());
    }

    @ToString
    public String toString() {
        long millis = getMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        boolean z = millis < 0;
        C10205e.m25528c(stringBuffer, millis);
        while (true) {
            int i = 3;
            if (stringBuffer.length() >= (z ? 7 : 6)) {
                break;
            }
            if (!z) {
                i = 2;
            }
            stringBuffer.insert(i, TimerCodec.DISENABLE);
        }
        int i2 = (((millis / 1000) * 1000) > millis ? 1 : (((millis / 1000) * 1000) == millis ? 0 : -1));
        int length = stringBuffer.length() - 3;
        if (i2 == 0) {
            stringBuffer.setLength(length);
        } else {
            stringBuffer.insert(length, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
