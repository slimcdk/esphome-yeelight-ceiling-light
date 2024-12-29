package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.C10224k;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDurationField;
import org.joda.time.field.C10176b;

public final class ZonedChronology extends AssembledChronology {
    private static final long serialVersionUID = -1079258847191166848L;

    static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final C10172d iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        ZonedDurationField(C10172d dVar, DateTimeZone dateTimeZone) {
            super(dVar.getType());
            if (dVar.isSupported()) {
                this.iField = dVar;
                this.iTimeField = ZonedChronology.useTimeArithmetic(dVar);
                this.iZone = dateTimeZone;
                return;
            }
            throw new IllegalArgumentException();
        }

        private long addOffset(long j) {
            return this.iZone.convertUTCToLocal(j);
        }

        private int getOffsetFromLocalToSubtract(long j) {
            int offsetFromLocal = this.iZone.getOffsetFromLocal(j);
            long j2 = (long) offsetFromLocal;
            if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
                return offsetFromLocal;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        private int getOffsetToAdd(long j) {
            int offset = this.iZone.getOffset(j);
            long j2 = (long) offset;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        public long add(long j, int i) {
            int offsetToAdd = getOffsetToAdd(j);
            long add = this.iField.add(j + ((long) offsetToAdd), i);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(add);
            }
            return add - ((long) offsetToAdd);
        }

        public long add(long j, long j2) {
            int offsetToAdd = getOffsetToAdd(j);
            long add = this.iField.add(j + ((long) offsetToAdd), j2);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(add);
            }
            return add - ((long) offsetToAdd);
        }

        public int getDifference(long j, long j2) {
            int offsetToAdd = getOffsetToAdd(j2);
            return this.iField.getDifference(j + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j))), j2 + ((long) offsetToAdd));
        }

        public long getDifferenceAsLong(long j, long j2) {
            int offsetToAdd = getOffsetToAdd(j2);
            return this.iField.getDifferenceAsLong(j + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j))), j2 + ((long) offsetToAdd));
        }

        public long getMillis(int i, long j) {
            return this.iField.getMillis(i, addOffset(j));
        }

        public long getMillis(long j, long j2) {
            return this.iField.getMillis(j, addOffset(j2));
        }

        public long getUnitMillis() {
            return this.iField.getUnitMillis();
        }

        public int getValue(long j, long j2) {
            return this.iField.getValue(j, addOffset(j2));
        }

        public long getValueAsLong(long j, long j2) {
            return this.iField.getValueAsLong(j, addOffset(j2));
        }

        public boolean isPrecise() {
            return this.iTimeField ? this.iField.isPrecise() : this.iField.isPrecise() && this.iZone.isFixed();
        }
    }

    /* renamed from: org.joda.time.chrono.ZonedChronology$a */
    static final class C10158a extends C10176b {

        /* renamed from: b */
        final C10143b f18795b;

        /* renamed from: c */
        final DateTimeZone f18796c;

        /* renamed from: d */
        final C10172d f18797d;

        /* renamed from: e */
        final boolean f18798e;

        /* renamed from: f */
        final C10172d f18799f;

        /* renamed from: g */
        final C10172d f18800g;

        C10158a(C10143b bVar, DateTimeZone dateTimeZone, C10172d dVar, C10172d dVar2, C10172d dVar3) {
            super(bVar.getType());
            if (bVar.isSupported()) {
                this.f18795b = bVar;
                this.f18796c = dateTimeZone;
                this.f18797d = dVar;
                this.f18798e = ZonedChronology.useTimeArithmetic(dVar);
                this.f18799f = dVar2;
                this.f18800g = dVar3;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: b */
        private int m25355b(long j) {
            int offset = this.f18796c.getOffset(j);
            long j2 = (long) offset;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        public long add(long j, int i) {
            if (this.f18798e) {
                long b = (long) m25355b(j);
                return this.f18795b.add(j + b, i) - b;
            }
            return this.f18796c.convertLocalToUTC(this.f18795b.add(this.f18796c.convertUTCToLocal(j), i), false, j);
        }

        public long add(long j, long j2) {
            if (this.f18798e) {
                long b = (long) m25355b(j);
                return this.f18795b.add(j + b, j2) - b;
            }
            return this.f18796c.convertLocalToUTC(this.f18795b.add(this.f18796c.convertUTCToLocal(j), j2), false, j);
        }

        public long addWrapField(long j, int i) {
            if (this.f18798e) {
                long b = (long) m25355b(j);
                return this.f18795b.addWrapField(j + b, i) - b;
            }
            return this.f18796c.convertLocalToUTC(this.f18795b.addWrapField(this.f18796c.convertUTCToLocal(j), i), false, j);
        }

        public int get(long j) {
            return this.f18795b.get(this.f18796c.convertUTCToLocal(j));
        }

        public String getAsShortText(int i, Locale locale) {
            return this.f18795b.getAsShortText(i, locale);
        }

        public String getAsShortText(long j, Locale locale) {
            return this.f18795b.getAsShortText(this.f18796c.convertUTCToLocal(j), locale);
        }

        public String getAsText(int i, Locale locale) {
            return this.f18795b.getAsText(i, locale);
        }

        public String getAsText(long j, Locale locale) {
            return this.f18795b.getAsText(this.f18796c.convertUTCToLocal(j), locale);
        }

        public int getDifference(long j, long j2) {
            int b = m25355b(j2);
            return this.f18795b.getDifference(j + ((long) (this.f18798e ? b : m25355b(j))), j2 + ((long) b));
        }

        public long getDifferenceAsLong(long j, long j2) {
            int b = m25355b(j2);
            return this.f18795b.getDifferenceAsLong(j + ((long) (this.f18798e ? b : m25355b(j))), j2 + ((long) b));
        }

        public final C10172d getDurationField() {
            return this.f18797d;
        }

        public int getLeapAmount(long j) {
            return this.f18795b.getLeapAmount(this.f18796c.convertUTCToLocal(j));
        }

        public final C10172d getLeapDurationField() {
            return this.f18800g;
        }

        public int getMaximumShortTextLength(Locale locale) {
            return this.f18795b.getMaximumShortTextLength(locale);
        }

        public int getMaximumTextLength(Locale locale) {
            return this.f18795b.getMaximumTextLength(locale);
        }

        public int getMaximumValue() {
            return this.f18795b.getMaximumValue();
        }

        public int getMaximumValue(long j) {
            return this.f18795b.getMaximumValue(this.f18796c.convertUTCToLocal(j));
        }

        public int getMaximumValue(C10224k kVar) {
            return this.f18795b.getMaximumValue(kVar);
        }

        public int getMaximumValue(C10224k kVar, int[] iArr) {
            return this.f18795b.getMaximumValue(kVar, iArr);
        }

        public int getMinimumValue() {
            return this.f18795b.getMinimumValue();
        }

        public int getMinimumValue(long j) {
            return this.f18795b.getMinimumValue(this.f18796c.convertUTCToLocal(j));
        }

        public int getMinimumValue(C10224k kVar) {
            return this.f18795b.getMinimumValue(kVar);
        }

        public int getMinimumValue(C10224k kVar, int[] iArr) {
            return this.f18795b.getMinimumValue(kVar, iArr);
        }

        public final C10172d getRangeDurationField() {
            return this.f18799f;
        }

        public boolean isLeap(long j) {
            return this.f18795b.isLeap(this.f18796c.convertUTCToLocal(j));
        }

        public boolean isLenient() {
            return this.f18795b.isLenient();
        }

        public long remainder(long j) {
            return this.f18795b.remainder(this.f18796c.convertUTCToLocal(j));
        }

        public long roundCeiling(long j) {
            if (this.f18798e) {
                long b = (long) m25355b(j);
                return this.f18795b.roundCeiling(j + b) - b;
            }
            return this.f18796c.convertLocalToUTC(this.f18795b.roundCeiling(this.f18796c.convertUTCToLocal(j)), false, j);
        }

        public long roundFloor(long j) {
            if (this.f18798e) {
                long b = (long) m25355b(j);
                return this.f18795b.roundFloor(j + b) - b;
            }
            return this.f18796c.convertLocalToUTC(this.f18795b.roundFloor(this.f18796c.convertUTCToLocal(j)), false, j);
        }

        public long set(long j, int i) {
            long j2 = this.f18795b.set(this.f18796c.convertUTCToLocal(j), i);
            long convertLocalToUTC = this.f18796c.convertLocalToUTC(j2, false, j);
            if (get(convertLocalToUTC) == i) {
                return convertLocalToUTC;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(j2, this.f18796c.getID());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(this.f18795b.getType(), Integer.valueOf(i), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        public long set(long j, String str, Locale locale) {
            return this.f18796c.convertLocalToUTC(this.f18795b.set(this.f18796c.convertUTCToLocal(j), str, locale), false, j);
        }
    }

    private ZonedChronology(C10142a aVar, DateTimeZone dateTimeZone) {
        super(aVar, dateTimeZone);
    }

    private C10143b convertField(C10143b bVar, HashMap<Object, Object> hashMap) {
        if (bVar == null || !bVar.isSupported()) {
            return bVar;
        }
        if (hashMap.containsKey(bVar)) {
            return (C10143b) hashMap.get(bVar);
        }
        C10158a aVar = new C10158a(bVar, getZone(), convertField(bVar.getDurationField(), hashMap), convertField(bVar.getRangeDurationField(), hashMap), convertField(bVar.getLeapDurationField(), hashMap));
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
        ZonedDurationField zonedDurationField = new ZonedDurationField(dVar, getZone());
        hashMap.put(dVar, zonedDurationField);
        return zonedDurationField;
    }

    public static ZonedChronology getInstance(C10142a aVar, DateTimeZone dateTimeZone) {
        if (aVar != null) {
            C10142a withUTC = aVar.withUTC();
            if (withUTC == null) {
                throw new IllegalArgumentException("UTC chronology must not be null");
            } else if (dateTimeZone != null) {
                return new ZonedChronology(withUTC, dateTimeZone);
            } else {
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
        } else {
            throw new IllegalArgumentException("Must supply a chronology");
        }
    }

    private long localToUTC(long j) {
        DateTimeZone zone = getZone();
        int offsetFromLocal = zone.getOffsetFromLocal(j);
        long j2 = j - ((long) offsetFromLocal);
        if (offsetFromLocal == zone.getOffset(j2)) {
            return j2;
        }
        throw new IllegalInstantException(j2, zone.getID());
    }

    static boolean useTimeArithmetic(C10172d dVar) {
        return dVar != null && dVar.getUnitMillis() < 43200000;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        return getBase().equals(zonedChronology.getBase()) && getZone().equals(zonedChronology.getZone());
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) {
        return localToUTC(getBase().getDateTimeMillis(i, i2, i3, i4));
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return localToUTC(getBase().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7));
    }

    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) {
        return localToUTC(getBase().getDateTimeMillis(((long) getZone().getOffset(j)) + j, i, i2, i3, i4));
    }

    public DateTimeZone getZone() {
        return (DateTimeZone) getParam();
    }

    public int hashCode() {
        return (getZone().hashCode() * 11) + 326565 + (getBase().hashCode() * 7);
    }

    public String toString() {
        return "ZonedChronology[" + getBase() + ", " + getZone().getID() + ']';
    }

    public C10142a withUTC() {
        return getBase();
    }

    public C10142a withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getParam() ? this : dateTimeZone == DateTimeZone.UTC ? getBase() : new ZonedChronology(getBase(), dateTimeZone);
    }
}
