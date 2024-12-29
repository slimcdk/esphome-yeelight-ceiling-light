package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.C10220g;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C10177c;
import org.joda.time.field.C10179e;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.C10199a;
import org.joda.time.format.C10206f;

public final class LimitChronology extends AssembledChronology {
    private static final long serialVersionUID = 7670866536893052522L;
    final DateTime iLowerLimit;
    final DateTime iUpperLimit;
    private transient LimitChronology iWithUTC;

    private class LimitDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 8049297699408782284L;

        LimitDurationField(C10172d dVar) {
            super(dVar, dVar.getType());
        }

        public long add(long j, int i) {
            LimitChronology.this.checkLimits(j, (String) null);
            long add = getWrappedField().add(j, i);
            LimitChronology.this.checkLimits(add, "resulting");
            return add;
        }

        public long add(long j, long j2) {
            LimitChronology.this.checkLimits(j, (String) null);
            long add = getWrappedField().add(j, j2);
            LimitChronology.this.checkLimits(add, "resulting");
            return add;
        }

        public int getDifference(long j, long j2) {
            LimitChronology.this.checkLimits(j, "minuend");
            LimitChronology.this.checkLimits(j2, "subtrahend");
            return getWrappedField().getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            LimitChronology.this.checkLimits(j, "minuend");
            LimitChronology.this.checkLimits(j2, "subtrahend");
            return getWrappedField().getDifferenceAsLong(j, j2);
        }

        public long getMillis(int i, long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            return getWrappedField().getMillis(i, j);
        }

        public long getMillis(long j, long j2) {
            LimitChronology.this.checkLimits(j2, (String) null);
            return getWrappedField().getMillis(j, j2);
        }

        public int getValue(long j, long j2) {
            LimitChronology.this.checkLimits(j2, (String) null);
            return getWrappedField().getValue(j, j2);
        }

        public long getValueAsLong(long j, long j2) {
            LimitChronology.this.checkLimits(j2, (String) null);
            return getWrappedField().getValueAsLong(j, j2);
        }
    }

    private class LimitException extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;
        private final boolean iIsLow;

        LimitException(String str, boolean z) {
            super(str);
            this.iIsLow = z;
        }

        public String getMessage() {
            DateTime dateTime;
            StringBuffer stringBuffer = new StringBuffer(85);
            stringBuffer.append("The");
            String message = super.getMessage();
            if (message != null) {
                stringBuffer.append(' ');
                stringBuffer.append(message);
            }
            stringBuffer.append(" instant is ");
            C10199a s = C10206f.m25539h().mo41443s(LimitChronology.this.getBase());
            if (this.iIsLow) {
                stringBuffer.append("below the supported minimum of ");
                dateTime = LimitChronology.this.getLowerLimit();
            } else {
                stringBuffer.append("above the supported maximum of ");
                dateTime = LimitChronology.this.getUpperLimit();
            }
            s.mo41440l(stringBuffer, dateTime.getMillis());
            stringBuffer.append(" (");
            stringBuffer.append(LimitChronology.this.getBase());
            stringBuffer.append(')');
            return stringBuffer.toString();
        }

        public String toString() {
            return "IllegalArgumentException: " + getMessage();
        }
    }

    /* renamed from: org.joda.time.chrono.LimitChronology$a */
    private class C10157a extends C10177c {

        /* renamed from: c */
        private final C10172d f18791c;

        /* renamed from: d */
        private final C10172d f18792d;

        /* renamed from: e */
        private final C10172d f18793e;

        C10157a(C10143b bVar, C10172d dVar, C10172d dVar2, C10172d dVar3) {
            super(bVar, bVar.getType());
            this.f18791c = dVar;
            this.f18792d = dVar2;
            this.f18793e = dVar3;
        }

        public long add(long j, int i) {
            LimitChronology.this.checkLimits(j, (String) null);
            long add = getWrappedField().add(j, i);
            LimitChronology.this.checkLimits(add, "resulting");
            return add;
        }

        public long add(long j, long j2) {
            LimitChronology.this.checkLimits(j, (String) null);
            long add = getWrappedField().add(j, j2);
            LimitChronology.this.checkLimits(add, "resulting");
            return add;
        }

        public long addWrapField(long j, int i) {
            LimitChronology.this.checkLimits(j, (String) null);
            long addWrapField = getWrappedField().addWrapField(j, i);
            LimitChronology.this.checkLimits(addWrapField, "resulting");
            return addWrapField;
        }

        public int get(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            return getWrappedField().get(j);
        }

        public String getAsShortText(long j, Locale locale) {
            LimitChronology.this.checkLimits(j, (String) null);
            return getWrappedField().getAsShortText(j, locale);
        }

        public String getAsText(long j, Locale locale) {
            LimitChronology.this.checkLimits(j, (String) null);
            return getWrappedField().getAsText(j, locale);
        }

        public int getDifference(long j, long j2) {
            LimitChronology.this.checkLimits(j, "minuend");
            LimitChronology.this.checkLimits(j2, "subtrahend");
            return getWrappedField().getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            LimitChronology.this.checkLimits(j, "minuend");
            LimitChronology.this.checkLimits(j2, "subtrahend");
            return getWrappedField().getDifferenceAsLong(j, j2);
        }

        public final C10172d getDurationField() {
            return this.f18791c;
        }

        public int getLeapAmount(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            return getWrappedField().getLeapAmount(j);
        }

        public final C10172d getLeapDurationField() {
            return this.f18793e;
        }

        public int getMaximumShortTextLength(Locale locale) {
            return getWrappedField().getMaximumShortTextLength(locale);
        }

        public int getMaximumTextLength(Locale locale) {
            return getWrappedField().getMaximumTextLength(locale);
        }

        public int getMaximumValue(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            return getWrappedField().getMaximumValue(j);
        }

        public int getMinimumValue(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            return getWrappedField().getMinimumValue(j);
        }

        public final C10172d getRangeDurationField() {
            return this.f18792d;
        }

        public boolean isLeap(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            return getWrappedField().isLeap(j);
        }

        public long remainder(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            long remainder = getWrappedField().remainder(j);
            LimitChronology.this.checkLimits(remainder, "resulting");
            return remainder;
        }

        public long roundCeiling(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            long roundCeiling = getWrappedField().roundCeiling(j);
            LimitChronology.this.checkLimits(roundCeiling, "resulting");
            return roundCeiling;
        }

        public long roundFloor(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            long roundFloor = getWrappedField().roundFloor(j);
            LimitChronology.this.checkLimits(roundFloor, "resulting");
            return roundFloor;
        }

        public long roundHalfCeiling(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            long roundHalfCeiling = getWrappedField().roundHalfCeiling(j);
            LimitChronology.this.checkLimits(roundHalfCeiling, "resulting");
            return roundHalfCeiling;
        }

        public long roundHalfEven(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            long roundHalfEven = getWrappedField().roundHalfEven(j);
            LimitChronology.this.checkLimits(roundHalfEven, "resulting");
            return roundHalfEven;
        }

        public long roundHalfFloor(long j) {
            LimitChronology.this.checkLimits(j, (String) null);
            long roundHalfFloor = getWrappedField().roundHalfFloor(j);
            LimitChronology.this.checkLimits(roundHalfFloor, "resulting");
            return roundHalfFloor;
        }

        public long set(long j, int i) {
            LimitChronology.this.checkLimits(j, (String) null);
            long j2 = getWrappedField().set(j, i);
            LimitChronology.this.checkLimits(j2, "resulting");
            return j2;
        }

        public long set(long j, String str, Locale locale) {
            LimitChronology.this.checkLimits(j, (String) null);
            long j2 = getWrappedField().set(j, str, locale);
            LimitChronology.this.checkLimits(j2, "resulting");
            return j2;
        }
    }

    private LimitChronology(C10142a aVar, DateTime dateTime, DateTime dateTime2) {
        super(aVar, (Object) null);
        this.iLowerLimit = dateTime;
        this.iUpperLimit = dateTime2;
    }

    private C10143b convertField(C10143b bVar, HashMap<Object, Object> hashMap) {
        if (bVar == null || !bVar.isSupported()) {
            return bVar;
        }
        if (hashMap.containsKey(bVar)) {
            return (C10143b) hashMap.get(bVar);
        }
        C10157a aVar = new C10157a(bVar, convertField(bVar.getDurationField(), hashMap), convertField(bVar.getRangeDurationField(), hashMap), convertField(bVar.getLeapDurationField(), hashMap));
        hashMap.put(bVar, aVar);
        return aVar;
    }

    private C10172d convertField(C10172d dVar, HashMap<Object, Object> hashMap) {
        if (dVar == null || !dVar.isSupported()) {
            return dVar;
        }
        if (hashMap.containsKey(dVar)) {
            return (C10172d) hashMap.get(dVar);
        }
        LimitDurationField limitDurationField = new LimitDurationField(dVar);
        hashMap.put(dVar, limitDurationField);
        return limitDurationField;
    }

    public static LimitChronology getInstance(C10142a aVar, C10220g gVar, C10220g gVar2) {
        if (aVar != null) {
            DateTime dateTime = null;
            DateTime dateTime2 = gVar == null ? null : gVar.toDateTime();
            if (gVar2 != null) {
                dateTime = gVar2.toDateTime();
            }
            if (dateTime2 == null || dateTime == null || dateTime2.isBefore(dateTime)) {
                return new LimitChronology(aVar, dateTime2, dateTime);
            }
            throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    /* access modifiers changed from: protected */
    public void assemble(AssembledChronology.C10152a aVar) {
        HashMap hashMap = new HashMap();
        aVar.f18762l = convertField(aVar.f18762l, (HashMap<Object, Object>) hashMap);
        aVar.f18761k = convertField(aVar.f18761k, (HashMap<Object, Object>) hashMap);
        aVar.f18760j = convertField(aVar.f18760j, (HashMap<Object, Object>) hashMap);
        aVar.f18759i = convertField(aVar.f18759i, (HashMap<Object, Object>) hashMap);
        aVar.f18758h = convertField(aVar.f18758h, (HashMap<Object, Object>) hashMap);
        aVar.f18757g = convertField(aVar.f18757g, (HashMap<Object, Object>) hashMap);
        aVar.f18756f = convertField(aVar.f18756f, (HashMap<Object, Object>) hashMap);
        aVar.f18755e = convertField(aVar.f18755e, (HashMap<Object, Object>) hashMap);
        aVar.f18754d = convertField(aVar.f18754d, (HashMap<Object, Object>) hashMap);
        aVar.f18753c = convertField(aVar.f18753c, (HashMap<Object, Object>) hashMap);
        aVar.f18752b = convertField(aVar.f18752b, (HashMap<Object, Object>) hashMap);
        aVar.f18751a = convertField(aVar.f18751a, (HashMap<Object, Object>) hashMap);
        aVar.f18746E = convertField(aVar.f18746E, (HashMap<Object, Object>) hashMap);
        aVar.f18747F = convertField(aVar.f18747F, (HashMap<Object, Object>) hashMap);
        aVar.f18748G = convertField(aVar.f18748G, (HashMap<Object, Object>) hashMap);
        aVar.f18749H = convertField(aVar.f18749H, (HashMap<Object, Object>) hashMap);
        aVar.f18750I = convertField(aVar.f18750I, (HashMap<Object, Object>) hashMap);
        aVar.f18774x = convertField(aVar.f18774x, (HashMap<Object, Object>) hashMap);
        aVar.f18775y = convertField(aVar.f18775y, (HashMap<Object, Object>) hashMap);
        aVar.f18776z = convertField(aVar.f18776z, (HashMap<Object, Object>) hashMap);
        aVar.f18745D = convertField(aVar.f18745D, (HashMap<Object, Object>) hashMap);
        aVar.f18742A = convertField(aVar.f18742A, (HashMap<Object, Object>) hashMap);
        aVar.f18743B = convertField(aVar.f18743B, (HashMap<Object, Object>) hashMap);
        aVar.f18744C = convertField(aVar.f18744C, (HashMap<Object, Object>) hashMap);
        aVar.f18763m = convertField(aVar.f18763m, (HashMap<Object, Object>) hashMap);
        aVar.f18764n = convertField(aVar.f18764n, (HashMap<Object, Object>) hashMap);
        aVar.f18765o = convertField(aVar.f18765o, (HashMap<Object, Object>) hashMap);
        aVar.f18766p = convertField(aVar.f18766p, (HashMap<Object, Object>) hashMap);
        aVar.f18767q = convertField(aVar.f18767q, (HashMap<Object, Object>) hashMap);
        aVar.f18768r = convertField(aVar.f18768r, (HashMap<Object, Object>) hashMap);
        aVar.f18769s = convertField(aVar.f18769s, (HashMap<Object, Object>) hashMap);
        aVar.f18771u = convertField(aVar.f18771u, (HashMap<Object, Object>) hashMap);
        aVar.f18770t = convertField(aVar.f18770t, (HashMap<Object, Object>) hashMap);
        aVar.f18772v = convertField(aVar.f18772v, (HashMap<Object, Object>) hashMap);
        aVar.f18773w = convertField(aVar.f18773w, (HashMap<Object, Object>) hashMap);
    }

    /* access modifiers changed from: package-private */
    public void checkLimits(long j, String str) {
        DateTime dateTime = this.iLowerLimit;
        if (dateTime == null || j >= dateTime.getMillis()) {
            DateTime dateTime2 = this.iUpperLimit;
            if (dateTime2 != null && j >= dateTime2.getMillis()) {
                throw new LimitException(str, false);
            }
            return;
        }
        throw new LimitException(str, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitChronology)) {
            return false;
        }
        LimitChronology limitChronology = (LimitChronology) obj;
        return getBase().equals(limitChronology.getBase()) && C10179e.m25385a(getLowerLimit(), limitChronology.getLowerLimit()) && C10179e.m25385a(getUpperLimit(), limitChronology.getUpperLimit());
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) {
        long dateTimeMillis = getBase().getDateTimeMillis(i, i2, i3, i4);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long dateTimeMillis = getBase().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) {
        checkLimits(j, (String) null);
        long dateTimeMillis = getBase().getDateTimeMillis(j, i, i2, i3, i4);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    public DateTime getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTime getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (getLowerLimit() != null ? getLowerLimit().hashCode() : 0) + 317351877;
        if (getUpperLimit() != null) {
            i = getUpperLimit().hashCode();
        }
        return hashCode + i + (getBase().hashCode() * 7);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LimitChronology[");
        sb.append(getBase().toString());
        sb.append(", ");
        String str = "NoLimit";
        sb.append(getLowerLimit() == null ? str : getLowerLimit().toString());
        sb.append(", ");
        if (getUpperLimit() != null) {
            str = getUpperLimit().toString();
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public C10142a withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    public C10142a withZone(DateTimeZone dateTimeZone) {
        LimitChronology limitChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getZone()) {
            return this;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
        if (dateTimeZone == dateTimeZone2 && (limitChronology = this.iWithUTC) != null) {
            return limitChronology;
        }
        DateTime dateTime = this.iLowerLimit;
        if (dateTime != null) {
            MutableDateTime mutableDateTime = dateTime.toMutableDateTime();
            mutableDateTime.setZoneRetainFields(dateTimeZone);
            dateTime = mutableDateTime.toDateTime();
        }
        DateTime dateTime2 = this.iUpperLimit;
        if (dateTime2 != null) {
            MutableDateTime mutableDateTime2 = dateTime2.toMutableDateTime();
            mutableDateTime2.setZoneRetainFields(dateTimeZone);
            dateTime2 = mutableDateTime2.toDateTime();
        }
        LimitChronology instance = getInstance(getBase().withZone(dateTimeZone), dateTime, dateTime2);
        if (dateTimeZone == dateTimeZone2) {
            this.iWithUTC = instance;
        }
        return instance;
    }
}
