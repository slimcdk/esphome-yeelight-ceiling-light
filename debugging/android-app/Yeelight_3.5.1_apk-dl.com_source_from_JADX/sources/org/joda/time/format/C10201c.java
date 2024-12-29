package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10149c;
import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/* renamed from: org.joda.time.format.c */
public class C10201c {

    /* renamed from: a */
    private final C10142a f18888a;

    /* renamed from: b */
    private final long f18889b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public DateTimeZone f18890c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Integer f18891d;

    /* renamed from: e */
    private Locale f18892e;

    /* renamed from: f */
    private Integer f18893f;

    /* renamed from: g */
    private int f18894g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10202a[] f18895h = new C10202a[8];
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f18896i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f18897j;

    /* renamed from: k */
    private Object f18898k;

    /* renamed from: org.joda.time.format.c$a */
    static class C10202a implements Comparable<C10202a> {

        /* renamed from: a */
        final C10143b f18899a;

        /* renamed from: b */
        final int f18900b;

        /* renamed from: c */
        final String f18901c;

        /* renamed from: d */
        final Locale f18902d;

        C10202a(C10143b bVar, int i) {
            this.f18899a = bVar;
            this.f18900b = i;
            this.f18901c = null;
            this.f18902d = null;
        }

        C10202a(C10143b bVar, String str, Locale locale) {
            this.f18899a = bVar;
            this.f18900b = 0;
            this.f18901c = str;
            this.f18902d = locale;
        }

        /* renamed from: a */
        public int compareTo(C10202a aVar) {
            C10143b bVar = aVar.f18899a;
            int j = C10201c.m25507j(this.f18899a.getRangeDurationField(), bVar.getRangeDurationField());
            return j != 0 ? j : C10201c.m25507j(this.f18899a.getDurationField(), bVar.getDurationField());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo41462b(long j, boolean z) {
            String str = this.f18901c;
            long j2 = str == null ? this.f18899a.set(j, this.f18900b) : this.f18899a.set(j, str, this.f18902d);
            return z ? this.f18899a.roundFloor(j2) : j2;
        }
    }

    /* renamed from: org.joda.time.format.c$b */
    class C10203b {

        /* renamed from: a */
        final DateTimeZone f18903a;

        /* renamed from: b */
        final Integer f18904b;

        /* renamed from: c */
        final C10202a[] f18905c;

        /* renamed from: d */
        final int f18906d;

        C10203b() {
            this.f18903a = C10201c.this.f18890c;
            this.f18904b = C10201c.this.f18891d;
            this.f18905c = C10201c.this.f18895h;
            this.f18906d = C10201c.this.f18896i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo41464a(C10201c cVar) {
            if (cVar != C10201c.this) {
                return false;
            }
            DateTimeZone unused = cVar.f18890c = this.f18903a;
            Integer unused2 = cVar.f18891d = this.f18904b;
            C10202a[] unused3 = cVar.f18895h = this.f18905c;
            if (this.f18906d < cVar.f18896i) {
                boolean unused4 = cVar.f18897j = true;
            }
            int unused5 = cVar.f18896i = this.f18906d;
            return true;
        }
    }

    public C10201c(long j, C10142a aVar, Locale locale, Integer num, int i) {
        C10142a b = C10149c.m25337b(aVar);
        this.f18889b = j;
        this.f18890c = b.getZone();
        this.f18888a = b.withUTC();
        this.f18892e = locale == null ? Locale.getDefault() : locale;
        this.f18893f = num;
        this.f18894g = i;
    }

    /* renamed from: j */
    static int m25507j(C10172d dVar, C10172d dVar2) {
        if (dVar == null || !dVar.isSupported()) {
            return (dVar2 == null || !dVar2.isSupported()) ? 0 : -1;
        }
        if (dVar2 == null || !dVar2.isSupported()) {
            return 1;
        }
        return -dVar.compareTo(dVar2);
    }

    /* renamed from: u */
    private void m25508u(C10202a aVar) {
        C10202a[] aVarArr = this.f18895h;
        int i = this.f18896i;
        if (i == aVarArr.length || this.f18897j) {
            C10202a[] aVarArr2 = new C10202a[(i == aVarArr.length ? i * 2 : aVarArr.length)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
            this.f18895h = aVarArr2;
            this.f18897j = false;
            aVarArr = aVarArr2;
        }
        this.f18898k = null;
        aVarArr[i] = aVar;
        this.f18896i = i + 1;
    }

    /* renamed from: y */
    private static void m25509y(C10202a[] aVarArr, int i) {
        if (i > 10) {
            Arrays.sort(aVarArr, 0, i);
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = i2; i3 > 0; i3--) {
                int i4 = i3 - 1;
                if (aVarArr[i4].compareTo(aVarArr[i3]) <= 0) {
                    break;
                }
                C10202a aVar = aVarArr[i3];
                aVarArr[i3] = aVarArr[i4];
                aVarArr[i4] = aVar;
            }
        }
    }

    /* renamed from: k */
    public long mo41448k(boolean z, String str) {
        C10202a[] aVarArr = this.f18895h;
        int i = this.f18896i;
        if (this.f18897j) {
            aVarArr = (C10202a[]) aVarArr.clone();
            this.f18895h = aVarArr;
            this.f18897j = false;
        }
        m25509y(aVarArr, i);
        if (i > 0) {
            C10172d field = DurationFieldType.months().getField(this.f18888a);
            C10172d field2 = DurationFieldType.days().getField(this.f18888a);
            C10172d durationField = aVarArr[0].f18899a.getDurationField();
            if (m25507j(durationField, field) >= 0 && m25507j(durationField, field2) <= 0) {
                mo41456s(DateTimeFieldType.year(), this.f18894g);
                return mo41448k(z, str);
            }
        }
        long j = this.f18889b;
        int i2 = 0;
        while (i2 < i) {
            try {
                j = aVarArr[i2].mo41462b(j, z);
                i2++;
            } catch (IllegalFieldValueException e) {
                if (str != null) {
                    e.prependMessage("Cannot parse \"" + str + '\"');
                }
                throw e;
            }
        }
        if (z) {
            int i3 = 0;
            while (i3 < i) {
                j = aVarArr[i3].mo41462b(j, i3 == i + -1);
                i3++;
            }
        }
        Integer num = this.f18891d;
        if (num != null) {
            return j - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.f18890c;
        if (dateTimeZone == null) {
            return j;
        }
        int offsetFromLocal = dateTimeZone.getOffsetFromLocal(j);
        long j2 = j - ((long) offsetFromLocal);
        if (offsetFromLocal == this.f18890c.getOffset(j2)) {
            return j2;
        }
        String str2 = "Illegal instant due to time zone offset transition (" + this.f18890c + ')';
        if (str != null) {
            str2 = "Cannot parse \"" + str + "\": " + str2;
        }
        throw new IllegalInstantException(str2);
    }

    /* renamed from: l */
    public C10142a mo41449l() {
        return this.f18888a;
    }

    /* renamed from: m */
    public Locale mo41450m() {
        return this.f18892e;
    }

    /* renamed from: n */
    public Integer mo41451n() {
        return this.f18891d;
    }

    /* renamed from: o */
    public Integer mo41452o() {
        return this.f18893f;
    }

    /* renamed from: p */
    public DateTimeZone mo41453p() {
        return this.f18890c;
    }

    /* renamed from: q */
    public boolean mo41454q(Object obj) {
        if (!(obj instanceof C10203b) || !((C10203b) obj).mo41464a(this)) {
            return false;
        }
        this.f18898k = obj;
        return true;
    }

    /* renamed from: r */
    public void mo41455r(C10143b bVar, int i) {
        m25508u(new C10202a(bVar, i));
    }

    /* renamed from: s */
    public void mo41456s(DateTimeFieldType dateTimeFieldType, int i) {
        m25508u(new C10202a(dateTimeFieldType.getField(this.f18888a), i));
    }

    /* renamed from: t */
    public void mo41457t(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        m25508u(new C10202a(dateTimeFieldType.getField(this.f18888a), str, locale));
    }

    /* renamed from: v */
    public Object mo41458v() {
        if (this.f18898k == null) {
            this.f18898k = new C10203b();
        }
        return this.f18898k;
    }

    /* renamed from: w */
    public void mo41459w(Integer num) {
        this.f18898k = null;
        this.f18891d = num;
    }

    /* renamed from: x */
    public void mo41460x(DateTimeZone dateTimeZone) {
        this.f18898k = null;
        this.f18890c = dateTimeZone;
    }
}
