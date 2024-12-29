package org.joda.time.format;

import java.util.Locale;
import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10222i;
import org.joda.time.C10224k;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

/* renamed from: org.joda.time.format.a */
public class C10199a {

    /* renamed from: a */
    private final C10204d f18880a;

    /* renamed from: b */
    private final C10200b f18881b;

    /* renamed from: c */
    private final Locale f18882c;

    /* renamed from: d */
    private final boolean f18883d;

    /* renamed from: e */
    private final C10142a f18884e;

    /* renamed from: f */
    private final DateTimeZone f18885f;

    /* renamed from: g */
    private final Integer f18886g;

    /* renamed from: h */
    private final int f18887h;

    public C10199a(C10204d dVar, C10200b bVar) {
        this.f18880a = dVar;
        this.f18881b = bVar;
        this.f18882c = null;
        this.f18883d = false;
        this.f18884e = null;
        this.f18885f = null;
        this.f18886g = null;
        this.f18887h = 2000;
    }

    private C10199a(C10204d dVar, C10200b bVar, Locale locale, boolean z, C10142a aVar, DateTimeZone dateTimeZone, Integer num, int i) {
        this.f18880a = dVar;
        this.f18881b = bVar;
        this.f18882c = locale;
        this.f18883d = z;
        this.f18884e = aVar;
        this.f18885f = dateTimeZone;
        this.f18886g = num;
        this.f18887h = i;
    }

    /* renamed from: m */
    private void m25475m(StringBuffer stringBuffer, long j, C10142a aVar) {
        long j2 = j;
        C10204d q = m25477q();
        C10142a r = m25478r(aVar);
        DateTimeZone zone = r.getZone();
        int offset = zone.getOffset(j2);
        long j3 = (long) offset;
        long j4 = j2 + j3;
        if ((j2 ^ j4) < 0 && (j3 ^ j2) >= 0) {
            zone = DateTimeZone.UTC;
            offset = 0;
            j4 = j2;
        }
        C10204d dVar = q;
        StringBuffer stringBuffer2 = stringBuffer;
        long j5 = j4;
        dVar.printTo(stringBuffer2, j5, r.withUTC(), offset, zone, this.f18882c);
    }

    /* renamed from: p */
    private C10200b m25476p() {
        C10200b bVar = this.f18881b;
        if (bVar != null) {
            return bVar;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    /* renamed from: q */
    private C10204d m25477q() {
        C10204d dVar = this.f18880a;
        if (dVar != null) {
            return dVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    /* renamed from: r */
    private C10142a m25478r(C10142a aVar) {
        C10142a b = C10149c.m25337b(aVar);
        C10142a aVar2 = this.f18884e;
        if (aVar2 != null) {
            b = aVar2;
        }
        DateTimeZone dateTimeZone = this.f18885f;
        return dateTimeZone != null ? b.withZone(dateTimeZone) : b;
    }

    /* renamed from: a */
    public Locale mo41429a() {
        return this.f18882c;
    }

    /* renamed from: b */
    public C10200b mo41430b() {
        return this.f18881b;
    }

    /* renamed from: c */
    public C10204d mo41431c() {
        return this.f18880a;
    }

    /* renamed from: d */
    public DateTimeZone mo41432d() {
        return this.f18885f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.joda.time.DateTime mo41433e(java.lang.String r11) {
        /*
            r10 = this;
            org.joda.time.format.b r0 = r10.m25476p()
            r1 = 0
            org.joda.time.a r1 = r10.m25478r(r1)
            org.joda.time.format.c r9 = new org.joda.time.format.c
            java.util.Locale r6 = r10.f18882c
            java.lang.Integer r7 = r10.f18886g
            int r8 = r10.f18887h
            r3 = 0
            r2 = r9
            r5 = r1
            r2.<init>(r3, r5, r6, r7, r8)
            r2 = 0
            int r0 = r0.parseInto(r9, r11, r2)
            if (r0 < 0) goto L_0x005d
            int r2 = r11.length()
            if (r0 < r2) goto L_0x005f
            r0 = 1
            long r2 = r9.mo41448k(r0, r11)
            boolean r11 = r10.f18883d
            if (r11 == 0) goto L_0x0041
            java.lang.Integer r11 = r9.mo41451n()
            if (r11 == 0) goto L_0x0041
            java.lang.Integer r11 = r9.mo41451n()
            int r11 = r11.intValue()
            org.joda.time.DateTimeZone r11 = org.joda.time.DateTimeZone.forOffsetMillis(r11)
            goto L_0x004b
        L_0x0041:
            org.joda.time.DateTimeZone r11 = r9.mo41453p()
            if (r11 == 0) goto L_0x004f
            org.joda.time.DateTimeZone r11 = r9.mo41453p()
        L_0x004b:
            org.joda.time.a r1 = r1.withZone(r11)
        L_0x004f:
            org.joda.time.DateTime r11 = new org.joda.time.DateTime
            r11.<init>((long) r2, (org.joda.time.C10142a) r1)
            org.joda.time.DateTimeZone r0 = r10.f18885f
            if (r0 == 0) goto L_0x005c
            org.joda.time.DateTime r11 = r11.withZone(r0)
        L_0x005c:
            return r11
        L_0x005d:
            r0 = r0 ^ -1
        L_0x005f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r11 = org.joda.time.format.C10205e.m25530e(r11, r0)
            r1.<init>(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.C10199a.mo41433e(java.lang.String):org.joda.time.DateTime");
    }

    /* renamed from: f */
    public LocalDate mo41434f(String str) {
        return mo41435g(str).toLocalDate();
    }

    /* renamed from: g */
    public LocalDateTime mo41435g(String str) {
        DateTimeZone p;
        C10200b p2 = m25476p();
        C10142a withUTC = m25478r((C10142a) null).withUTC();
        C10201c cVar = new C10201c(0, withUTC, this.f18882c, this.f18886g, this.f18887h);
        int parseInto = p2.parseInto(cVar, str, 0);
        if (parseInto < 0) {
            parseInto ^= -1;
        } else if (parseInto >= str.length()) {
            long k = cVar.mo41448k(true, str);
            if (cVar.mo41451n() != null) {
                p = DateTimeZone.forOffsetMillis(cVar.mo41451n().intValue());
            } else {
                if (cVar.mo41453p() != null) {
                    p = cVar.mo41453p();
                }
                return new LocalDateTime(k, withUTC);
            }
            withUTC = withUTC.withZone(p);
            return new LocalDateTime(k, withUTC);
        }
        throw new IllegalArgumentException(C10205e.m25530e(str, parseInto));
    }

    /* renamed from: h */
    public LocalTime mo41436h(String str) {
        return mo41435g(str).toLocalTime();
    }

    /* renamed from: i */
    public long mo41437i(String str) {
        C10200b p = m25476p();
        C10201c cVar = new C10201c(0, m25478r(this.f18884e), this.f18882c, this.f18886g, this.f18887h);
        int parseInto = p.parseInto(cVar, str, 0);
        if (parseInto < 0) {
            parseInto ^= -1;
        } else if (parseInto >= str.length()) {
            return cVar.mo41448k(true, str);
        }
        throw new IllegalArgumentException(C10205e.m25530e(str, parseInto));
    }

    /* renamed from: j */
    public String mo41438j(C10222i iVar) {
        StringBuffer stringBuffer = new StringBuffer(m25477q().estimatePrintedLength());
        mo41441n(stringBuffer, iVar);
        return stringBuffer.toString();
    }

    /* renamed from: k */
    public String mo41439k(C10224k kVar) {
        StringBuffer stringBuffer = new StringBuffer(m25477q().estimatePrintedLength());
        mo41442o(stringBuffer, kVar);
        return stringBuffer.toString();
    }

    /* renamed from: l */
    public void mo41440l(StringBuffer stringBuffer, long j) {
        m25475m(stringBuffer, j, (C10142a) null);
    }

    /* renamed from: n */
    public void mo41441n(StringBuffer stringBuffer, C10222i iVar) {
        m25475m(stringBuffer, C10149c.m25342g(iVar), C10149c.m25341f(iVar));
    }

    /* renamed from: o */
    public void mo41442o(StringBuffer stringBuffer, C10224k kVar) {
        C10204d q = m25477q();
        if (kVar != null) {
            q.printTo(stringBuffer, kVar, this.f18882c);
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    /* renamed from: s */
    public C10199a mo41443s(C10142a aVar) {
        if (this.f18884e == aVar) {
            return this;
        }
        return new C10199a(this.f18880a, this.f18881b, this.f18882c, this.f18883d, aVar, this.f18885f, this.f18886g, this.f18887h);
    }

    /* renamed from: t */
    public C10199a mo41444t(Locale locale) {
        if (locale == mo41429a() || (locale != null && locale.equals(mo41429a()))) {
            return this;
        }
        return new C10199a(this.f18880a, this.f18881b, locale, this.f18883d, this.f18884e, this.f18885f, this.f18886g, this.f18887h);
    }

    /* renamed from: u */
    public C10199a mo41445u() {
        return this.f18883d ? this : new C10199a(this.f18880a, this.f18881b, this.f18882c, true, this.f18884e, (DateTimeZone) null, this.f18886g, this.f18887h);
    }

    /* renamed from: v */
    public C10199a mo41446v(DateTimeZone dateTimeZone) {
        if (this.f18885f == dateTimeZone) {
            return this;
        }
        return new C10199a(this.f18880a, this.f18881b, this.f18882c, false, this.f18884e, dateTimeZone, this.f18886g, this.f18887h);
    }

    /* renamed from: w */
    public C10199a mo41447w() {
        return mo41446v(DateTimeZone.UTC);
    }
}
