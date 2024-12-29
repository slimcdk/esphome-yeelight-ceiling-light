package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.j */
public abstract class C2594j {

    /* renamed from: a */
    private final C2548a f4407a;

    /* renamed from: b */
    private final C2602r f4408b;

    C2594j(C2548a aVar) {
        this.f4407a = aVar;
        this.f4408b = new C2602r(aVar);
    }

    /* renamed from: a */
    public static C2594j m7112a(C2548a aVar) {
        if (aVar.mo19476f(1)) {
            return new C2591g(aVar);
        }
        if (!aVar.mo19476f(2)) {
            return new C2595k(aVar);
        }
        int g = C2602r.m7135g(aVar, 1, 4);
        if (g == 4) {
            return new C2585a(aVar);
        }
        if (g == 5) {
            return new C2586b(aVar);
        }
        int g2 = C2602r.m7135g(aVar, 1, 5);
        if (g2 == 12) {
            return new C2587c(aVar);
        }
        if (g2 == 13) {
            return new C2588d(aVar);
        }
        switch (C2602r.m7135g(aVar, 1, 7)) {
            case 56:
                return new C2589e(aVar, "310", "11");
            case 57:
                return new C2589e(aVar, "320", "11");
            case 58:
                return new C2589e(aVar, "310", "13");
            case 59:
                return new C2589e(aVar, "320", "13");
            case 60:
                return new C2589e(aVar, "310", "15");
            case 61:
                return new C2589e(aVar, "320", "15");
            case 62:
                return new C2589e(aVar, "310", "17");
            case 63:
                return new C2589e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C2602r mo19580b() {
        return this.f4408b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C2548a mo19581c() {
        return this.f4407a;
    }

    /* renamed from: d */
    public abstract String mo19576d();
}
