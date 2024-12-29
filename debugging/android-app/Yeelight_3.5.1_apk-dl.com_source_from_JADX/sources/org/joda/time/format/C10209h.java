package org.joda.time.format;

import java.util.Locale;
import org.joda.time.C10174f;
import org.joda.time.C10225l;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/* renamed from: org.joda.time.format.h */
public class C10209h {

    /* renamed from: a */
    private final C10219k f18969a;

    /* renamed from: b */
    private final C10218j f18970b;

    /* renamed from: c */
    private final Locale f18971c;

    /* renamed from: d */
    private final PeriodType f18972d;

    public C10209h(C10219k kVar, C10218j jVar) {
        this.f18969a = kVar;
        this.f18970b = jVar;
        this.f18971c = null;
        this.f18972d = null;
    }

    private C10209h(C10219k kVar, C10218j jVar, Locale locale, PeriodType periodType) {
        this.f18969a = kVar;
        this.f18970b = jVar;
        this.f18971c = locale;
        this.f18972d = periodType;
    }

    /* renamed from: a */
    private void m25628a() {
        if (this.f18970b == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
    }

    /* renamed from: b */
    private void m25629b(C10225l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Period must not be null");
        }
    }

    /* renamed from: c */
    private void m25630c() {
        if (this.f18969a == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
    }

    /* renamed from: d */
    public C10218j mo41465d() {
        return this.f18970b;
    }

    /* renamed from: e */
    public C10219k mo41466e() {
        return this.f18969a;
    }

    /* renamed from: f */
    public int mo41467f(C10174f fVar, String str, int i) {
        m25628a();
        m25629b(fVar);
        return mo41465d().mo41486c(fVar, str, i, this.f18971c);
    }

    /* renamed from: g */
    public MutablePeriod mo41468g(String str) {
        m25628a();
        MutablePeriod mutablePeriod = new MutablePeriod(0, this.f18972d);
        int c = mo41465d().mo41486c(mutablePeriod, str, 0, this.f18971c);
        if (c < 0) {
            c ^= -1;
        } else if (c >= str.length()) {
            return mutablePeriod;
        }
        throw new IllegalArgumentException(C10205e.m25530e(str, c));
    }

    /* renamed from: h */
    public Period mo41469h(String str) {
        m25628a();
        return mo41468g(str).toPeriod();
    }

    /* renamed from: i */
    public String mo41470i(C10225l lVar) {
        m25630c();
        m25629b(lVar);
        C10219k e = mo41466e();
        StringBuffer stringBuffer = new StringBuffer(e.mo41485b(lVar, this.f18971c));
        e.mo41484a(stringBuffer, lVar, this.f18971c);
        return stringBuffer.toString();
    }

    /* renamed from: j */
    public C10209h mo41471j(PeriodType periodType) {
        return periodType == this.f18972d ? this : new C10209h(this.f18969a, this.f18970b, this.f18971c, periodType);
    }
}
