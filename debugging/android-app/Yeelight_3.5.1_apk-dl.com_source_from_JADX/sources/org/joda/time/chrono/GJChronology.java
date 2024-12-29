package org.joda.time.chrono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10149c;
import org.joda.time.C10172d;
import org.joda.time.C10222i;
import org.joda.time.C10224k;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.C10176b;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.C10206f;

public final class GJChronology extends AssembledChronology {
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final Map<DateTimeZone, ArrayList<GJChronology>> cCache = new HashMap();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    /* access modifiers changed from: private */
    public long iGapDuration;
    /* access modifiers changed from: private */
    public GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    private static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final C10156b iField;

        LinkedDurationField(C10172d dVar, C10156b bVar) {
            super(dVar, dVar.getType());
            this.iField = bVar;
        }

        public long add(long j, int i) {
            return this.iField.add(j, i);
        }

        public long add(long j, long j2) {
            return this.iField.add(j, j2);
        }

        public int getDifference(long j, long j2) {
            return this.iField.getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            return this.iField.getDifferenceAsLong(j, j2);
        }
    }

    /* renamed from: org.joda.time.chrono.GJChronology$a */
    private class C10155a extends C10176b {

        /* renamed from: b */
        final C10143b f18782b;

        /* renamed from: c */
        final C10143b f18783c;

        /* renamed from: d */
        final long f18784d;

        /* renamed from: e */
        final boolean f18785e;

        /* renamed from: f */
        protected C10172d f18786f;

        /* renamed from: g */
        protected C10172d f18787g;

        C10155a(GJChronology gJChronology, C10143b bVar, C10143b bVar2, long j) {
            this(bVar, bVar2, j, false);
        }

        C10155a(C10143b bVar, C10143b bVar2, long j, boolean z) {
            super(bVar2.getType());
            this.f18782b = bVar;
            this.f18783c = bVar2;
            this.f18784d = j;
            this.f18785e = z;
            this.f18786f = bVar2.getDurationField();
            C10172d rangeDurationField = bVar2.getRangeDurationField();
            this.f18787g = rangeDurationField == null ? bVar.getRangeDurationField() : rangeDurationField;
        }

        public long add(long j, int i) {
            return this.f18783c.add(j, i);
        }

        public long add(long j, long j2) {
            return this.f18783c.add(j, j2);
        }

        public int[] add(C10224k kVar, int i, int[] iArr, int i2) {
            if (i2 == 0) {
                return iArr;
            }
            if (!C10149c.m25348m(kVar)) {
                return super.add(kVar, i, iArr, i2);
            }
            long j = 0;
            int size = kVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                j = kVar.getFieldType(i3).getField(GJChronology.this).set(j, iArr[i3]);
            }
            return GJChronology.this.get(kVar, add(j, i2));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo41244b(long j) {
            return this.f18785e ? GJChronology.this.gregorianToJulianByWeekyear(j) : GJChronology.this.gregorianToJulianByYear(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public long mo41245c(long j) {
            return this.f18785e ? GJChronology.this.julianToGregorianByWeekyear(j) : GJChronology.this.julianToGregorianByYear(j);
        }

        public int get(long j) {
            return (j >= this.f18784d ? this.f18783c : this.f18782b).get(j);
        }

        public String getAsShortText(int i, Locale locale) {
            return this.f18783c.getAsShortText(i, locale);
        }

        public String getAsShortText(long j, Locale locale) {
            return (j >= this.f18784d ? this.f18783c : this.f18782b).getAsShortText(j, locale);
        }

        public String getAsText(int i, Locale locale) {
            return this.f18783c.getAsText(i, locale);
        }

        public String getAsText(long j, Locale locale) {
            return (j >= this.f18784d ? this.f18783c : this.f18782b).getAsText(j, locale);
        }

        public int getDifference(long j, long j2) {
            return this.f18783c.getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            return this.f18783c.getDifferenceAsLong(j, j2);
        }

        public C10172d getDurationField() {
            return this.f18786f;
        }

        public int getLeapAmount(long j) {
            return (j >= this.f18784d ? this.f18783c : this.f18782b).getLeapAmount(j);
        }

        public C10172d getLeapDurationField() {
            return this.f18783c.getLeapDurationField();
        }

        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.f18782b.getMaximumShortTextLength(locale), this.f18783c.getMaximumShortTextLength(locale));
        }

        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.f18782b.getMaximumTextLength(locale), this.f18783c.getMaximumTextLength(locale));
        }

        public int getMaximumValue() {
            return this.f18783c.getMaximumValue();
        }

        public int getMaximumValue(long j) {
            if (j >= this.f18784d) {
                return this.f18783c.getMaximumValue(j);
            }
            int maximumValue = this.f18782b.getMaximumValue(j);
            long j2 = this.f18782b.set(j, maximumValue);
            long j3 = this.f18784d;
            if (j2 < j3) {
                return maximumValue;
            }
            C10143b bVar = this.f18782b;
            return bVar.get(bVar.add(j3, -1));
        }

        public int getMaximumValue(C10224k kVar) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(kVar, 0));
        }

        public int getMaximumValue(C10224k kVar, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = kVar.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                C10143b field = kVar.getFieldType(i).getField(instanceUTC);
                if (iArr[i] <= field.getMaximumValue(j)) {
                    j = field.set(j, iArr[i]);
                }
            }
            return getMaximumValue(j);
        }

        public int getMinimumValue() {
            return this.f18782b.getMinimumValue();
        }

        public int getMinimumValue(long j) {
            if (j < this.f18784d) {
                return this.f18782b.getMinimumValue(j);
            }
            int minimumValue = this.f18783c.getMinimumValue(j);
            long j2 = this.f18783c.set(j, minimumValue);
            long j3 = this.f18784d;
            return j2 < j3 ? this.f18783c.get(j3) : minimumValue;
        }

        public int getMinimumValue(C10224k kVar) {
            return this.f18782b.getMinimumValue(kVar);
        }

        public int getMinimumValue(C10224k kVar, int[] iArr) {
            return this.f18782b.getMinimumValue(kVar, iArr);
        }

        public C10172d getRangeDurationField() {
            return this.f18787g;
        }

        public boolean isLeap(long j) {
            return (j >= this.f18784d ? this.f18783c : this.f18782b).isLeap(j);
        }

        public boolean isLenient() {
            return false;
        }

        public long roundCeiling(long j) {
            if (j >= this.f18784d) {
                return this.f18783c.roundCeiling(j);
            }
            long roundCeiling = this.f18782b.roundCeiling(j);
            return (roundCeiling < this.f18784d || roundCeiling - GJChronology.this.iGapDuration < this.f18784d) ? roundCeiling : mo41245c(roundCeiling);
        }

        public long roundFloor(long j) {
            if (j < this.f18784d) {
                return this.f18782b.roundFloor(j);
            }
            long roundFloor = this.f18783c.roundFloor(j);
            return (roundFloor >= this.f18784d || GJChronology.this.iGapDuration + roundFloor >= this.f18784d) ? roundFloor : mo41244b(roundFloor);
        }

        public long set(long j, int i) {
            long j2;
            if (j >= this.f18784d) {
                j2 = this.f18783c.set(j, i);
                if (j2 < this.f18784d) {
                    if (GJChronology.this.iGapDuration + j2 < this.f18784d) {
                        j2 = mo41244b(j2);
                    }
                    if (get(j2) != i) {
                        throw new IllegalFieldValueException(this.f18783c.getType(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            } else {
                j2 = this.f18782b.set(j, i);
                if (j2 >= this.f18784d) {
                    if (j2 - GJChronology.this.iGapDuration >= this.f18784d) {
                        j2 = mo41245c(j2);
                    }
                    if (get(j2) != i) {
                        throw new IllegalFieldValueException(this.f18782b.getType(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            }
            return j2;
        }

        public long set(long j, String str, Locale locale) {
            if (j >= this.f18784d) {
                long j2 = this.f18783c.set(j, str, locale);
                return (j2 >= this.f18784d || GJChronology.this.iGapDuration + j2 >= this.f18784d) ? j2 : mo41244b(j2);
            }
            long j3 = this.f18782b.set(j, str, locale);
            return (j3 < this.f18784d || j3 - GJChronology.this.iGapDuration < this.f18784d) ? j3 : mo41245c(j3);
        }
    }

    /* renamed from: org.joda.time.chrono.GJChronology$b */
    private final class C10156b extends C10155a {
        C10156b(GJChronology gJChronology, C10143b bVar, C10143b bVar2, long j) {
            this(bVar, bVar2, (C10172d) null, j, false);
        }

        C10156b(GJChronology gJChronology, C10143b bVar, C10143b bVar2, C10172d dVar, long j) {
            this(bVar, bVar2, dVar, j, false);
        }

        C10156b(C10143b bVar, C10143b bVar2, C10172d dVar, long j, boolean z) {
            super(bVar, bVar2, j, z);
            this.f18786f = dVar == null ? new LinkedDurationField(this.f18786f, this) : dVar;
        }

        public long add(long j, int i) {
            C10143b bVar;
            if (j >= this.f18784d) {
                long add = this.f18783c.add(j, i);
                if (add >= this.f18784d || GJChronology.this.iGapDuration + add >= this.f18784d) {
                    return add;
                }
                if (this.f18785e) {
                    if (GJChronology.this.iGregorianChronology.weekyear().get(add) <= 0) {
                        bVar = GJChronology.this.iGregorianChronology.weekyear();
                    }
                    return mo41244b(add);
                }
                if (GJChronology.this.iGregorianChronology.year().get(add) <= 0) {
                    bVar = GJChronology.this.iGregorianChronology.year();
                }
                return mo41244b(add);
                add = bVar.add(add, -1);
                return mo41244b(add);
            }
            long add2 = this.f18782b.add(j, i);
            return (add2 < this.f18784d || add2 - GJChronology.this.iGapDuration < this.f18784d) ? add2 : mo41245c(add2);
        }

        public long add(long j, long j2) {
            C10143b bVar;
            if (j >= this.f18784d) {
                long add = this.f18783c.add(j, j2);
                if (add >= this.f18784d || GJChronology.this.iGapDuration + add >= this.f18784d) {
                    return add;
                }
                if (this.f18785e) {
                    if (GJChronology.this.iGregorianChronology.weekyear().get(add) <= 0) {
                        bVar = GJChronology.this.iGregorianChronology.weekyear();
                    }
                    return mo41244b(add);
                }
                if (GJChronology.this.iGregorianChronology.year().get(add) <= 0) {
                    bVar = GJChronology.this.iGregorianChronology.year();
                }
                return mo41244b(add);
                add = bVar.add(add, -1);
                return mo41244b(add);
            }
            long add2 = this.f18782b.add(j, j2);
            return (add2 < this.f18784d || add2 - GJChronology.this.iGapDuration < this.f18784d) ? add2 : mo41245c(add2);
        }

        public int getDifference(long j, long j2) {
            C10143b bVar;
            long j3 = this.f18784d;
            if (j < j3) {
                if (j2 >= j3) {
                    j = mo41245c(j);
                }
                bVar = this.f18782b;
                return bVar.getDifference(j, j2);
            } else if (j2 < j3) {
                j = mo41244b(j);
                bVar = this.f18782b;
                return bVar.getDifference(j, j2);
            }
            bVar = this.f18783c;
            return bVar.getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            C10143b bVar;
            long j3 = this.f18784d;
            if (j < j3) {
                if (j2 >= j3) {
                    j = mo41245c(j);
                }
                bVar = this.f18782b;
                return bVar.getDifferenceAsLong(j, j2);
            } else if (j2 < j3) {
                j = mo41244b(j);
                bVar = this.f18782b;
                return bVar.getDifferenceAsLong(j, j2);
            }
            bVar = this.f18783c;
            return bVar.getDifferenceAsLong(j, j2);
        }

        public int getMaximumValue(long j) {
            return (j >= this.f18784d ? this.f18783c : this.f18782b).getMaximumValue(j);
        }

        public int getMinimumValue(long j) {
            return (j >= this.f18784d ? this.f18783c : this.f18782b).getMinimumValue(j);
        }
    }

    private GJChronology(C10142a aVar, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(aVar, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super((C10142a) null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j, C10142a aVar, C10142a aVar2) {
        return aVar2.millisOfDay().set(aVar2.dayOfWeek().set(aVar2.weekOfWeekyear().set(aVar2.weekyear().set(0, aVar.weekyear().get(j)), aVar.weekOfWeekyear().get(j)), aVar.dayOfWeek().get(j)), aVar.millisOfDay().get(j));
    }

    private static long convertByYear(long j, C10142a aVar, C10142a aVar2) {
        return aVar2.getDateTimeMillis(aVar.year().get(j), aVar.monthOfYear().get(j), aVar.dayOfMonth().get(j), aVar.millisOfDay().get(j));
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), (C10222i) DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, (C10222i) DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j, int i) {
        return getInstance(dateTimeZone, (C10222i) j == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j), i);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, C10222i iVar) {
        return getInstance(dateTimeZone, iVar, 4);
    }

    public static synchronized GJChronology getInstance(DateTimeZone dateTimeZone, C10222i iVar, int i) {
        Instant instant;
        GJChronology gJChronology;
        synchronized (GJChronology.class) {
            DateTimeZone l = C10149c.m25347l(dateTimeZone);
            if (iVar == null) {
                instant = DEFAULT_CUTOVER;
            } else {
                instant = iVar.toInstant();
                if (new LocalDate(instant.getMillis(), (C10142a) GregorianChronology.getInstance(l)).getYear() <= 0) {
                    throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
                }
            }
            Map<DateTimeZone, ArrayList<GJChronology>> map = cCache;
            synchronized (map) {
                ArrayList arrayList = map.get(l);
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                    map.put(l, arrayList);
                } else {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            GJChronology gJChronology2 = (GJChronology) arrayList.get(size);
                            if (i == gJChronology2.getMinimumDaysInFirstWeek() && instant.equals(gJChronology2.getGregorianCutover())) {
                                return gJChronology2;
                            }
                        }
                    }
                }
                DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                if (l == dateTimeZone2) {
                    gJChronology = new GJChronology(JulianChronology.getInstance(l, i), GregorianChronology.getInstance(l, i), instant);
                } else {
                    GJChronology instance = getInstance(dateTimeZone2, (C10222i) instant, i);
                    gJChronology = new GJChronology(ZonedChronology.getInstance(instance, l), instance.iJulianChronology, instance.iGregorianChronology, instance.iCutoverInstant);
                }
                arrayList.add(gJChronology);
                return gJChronology;
            }
        }
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, (C10222i) DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), (C10222i) this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    /* access modifiers changed from: protected */
    public void assemble(AssembledChronology.C10152a aVar) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() == null) {
            if (julianChronology.getMinimumDaysInFirstWeek() == gregorianChronology.getMinimumDaysInFirstWeek()) {
                long j = this.iCutoverMillis;
                this.iGapDuration = j - julianToGregorianByYear(j);
                aVar.mo41187a(gregorianChronology);
                if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
                    aVar.f18763m = new C10155a(this, julianChronology.millisOfSecond(), aVar.f18763m, this.iCutoverMillis);
                    aVar.f18764n = new C10155a(this, julianChronology.millisOfDay(), aVar.f18764n, this.iCutoverMillis);
                    aVar.f18765o = new C10155a(this, julianChronology.secondOfMinute(), aVar.f18765o, this.iCutoverMillis);
                    aVar.f18766p = new C10155a(this, julianChronology.secondOfDay(), aVar.f18766p, this.iCutoverMillis);
                    aVar.f18767q = new C10155a(this, julianChronology.minuteOfHour(), aVar.f18767q, this.iCutoverMillis);
                    aVar.f18768r = new C10155a(this, julianChronology.minuteOfDay(), aVar.f18768r, this.iCutoverMillis);
                    aVar.f18769s = new C10155a(this, julianChronology.hourOfDay(), aVar.f18769s, this.iCutoverMillis);
                    aVar.f18771u = new C10155a(this, julianChronology.hourOfHalfday(), aVar.f18771u, this.iCutoverMillis);
                    aVar.f18770t = new C10155a(this, julianChronology.clockhourOfDay(), aVar.f18770t, this.iCutoverMillis);
                    aVar.f18772v = new C10155a(this, julianChronology.clockhourOfHalfday(), aVar.f18772v, this.iCutoverMillis);
                    aVar.f18773w = new C10155a(this, julianChronology.halfdayOfDay(), aVar.f18773w, this.iCutoverMillis);
                }
                aVar.f18750I = new C10155a(this, julianChronology.era(), aVar.f18750I, this.iCutoverMillis);
                aVar.f18776z = new C10155a(this, julianChronology.dayOfYear(), aVar.f18776z, gregorianChronology.year().roundCeiling(this.iCutoverMillis));
                aVar.f18742A = new C10155a(julianChronology.weekOfWeekyear(), aVar.f18742A, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
                C10156b bVar = new C10156b(this, julianChronology.year(), aVar.f18746E, this.iCutoverMillis);
                aVar.f18746E = bVar;
                aVar.f18760j = bVar.getDurationField();
                aVar.f18747F = new C10156b(this, julianChronology.yearOfEra(), aVar.f18747F, aVar.f18760j, this.iCutoverMillis);
                aVar.f18748G = new C10156b(this, julianChronology.yearOfCentury(), aVar.f18748G, aVar.f18760j, this.iCutoverMillis);
                C10156b bVar2 = new C10156b(this, julianChronology.centuryOfEra(), aVar.f18749H, this.iCutoverMillis);
                aVar.f18749H = bVar2;
                aVar.f18761k = bVar2.getDurationField();
                C10156b bVar3 = new C10156b(this, julianChronology.monthOfYear(), aVar.f18745D, this.iCutoverMillis);
                aVar.f18745D = bVar3;
                aVar.f18759i = bVar3.getDurationField();
                aVar.f18743B = new C10156b(julianChronology.weekyear(), aVar.f18743B, (C10172d) null, this.iCutoverMillis, true);
                aVar.f18744C = new C10156b(this, julianChronology.weekyearOfCentury(), aVar.f18744C, aVar.f18758h, this.iCutoverMillis);
                aVar.f18758h = aVar.f18743B.getDurationField();
                C10155a aVar2 = new C10155a(this, julianChronology.dayOfMonth(), aVar.f18775y, this.iCutoverMillis);
                aVar2.f18787g = aVar.f18759i;
                aVar.f18775y = aVar2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        return this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone());
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) {
        C10142a base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i2, i3, i4);
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i, i2, i3, i4);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long j;
        C10142a base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        try {
            j = this.iGregorianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
            int i8 = i2;
            int i9 = i3;
        } catch (IllegalFieldValueException e) {
            if (i2 == 2 && i3 == 29) {
                j = this.iGregorianChronology.getDateTimeMillis(i, i2, 28, i4, i5, i6, i7);
                if (j >= this.iCutoverMillis) {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        if (j < this.iCutoverMillis) {
            j = this.iJulianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
            if (j >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return j;
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    public DateTimeZone getZone() {
        C10142a base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    /* access modifiers changed from: package-private */
    public long gregorianToJulianByWeekyear(long j) {
        return convertByWeekyear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    /* access modifiers changed from: package-private */
    public long gregorianToJulianByYear(long j) {
        return convertByYear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return 25025 + getZone().hashCode() + getMinimumDaysInFirstWeek() + this.iCutoverInstant.hashCode();
    }

    /* access modifiers changed from: package-private */
    public long julianToGregorianByWeekyear(long j) {
        return convertByWeekyear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    /* access modifiers changed from: package-private */
    public long julianToGregorianByYear(long j) {
        return convertByYear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append('[');
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0 ? C10206f.m25534c() : C10206f.m25539h()).mo41443s(withUTC()).mo41440l(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public C10142a withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    public C10142a withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone, (C10222i) this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }
}
