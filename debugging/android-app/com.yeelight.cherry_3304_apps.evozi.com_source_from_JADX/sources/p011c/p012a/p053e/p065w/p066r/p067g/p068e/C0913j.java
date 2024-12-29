package p011c.p012a.p053e.p065w.p066r.p067g.p068e;

import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.r.g.e.j */
public abstract class C0913j {

    /* renamed from: a */
    private final C0839a f999a;

    /* renamed from: b */
    private final C0923s f1000b;

    C0913j(C0839a aVar) {
        this.f999a = aVar;
        this.f1000b = new C0923s(aVar);
    }

    /* renamed from: a */
    public static C0913j m1513a(C0839a aVar) {
        if (aVar.mo9042f(1)) {
            return new C0910g(aVar);
        }
        if (!aVar.mo9042f(2)) {
            return new C0914k(aVar);
        }
        int g = C0923s.m1544g(aVar, 1, 4);
        if (g == 4) {
            return new C0904a(aVar);
        }
        if (g == 5) {
            return new C0905b(aVar);
        }
        int g2 = C0923s.m1544g(aVar, 1, 5);
        if (g2 == 12) {
            return new C0906c(aVar);
        }
        if (g2 == 13) {
            return new C0907d(aVar);
        }
        switch (C0923s.m1544g(aVar, 1, 7)) {
            case 56:
                return new C0908e(aVar, "310", "11");
            case 57:
                return new C0908e(aVar, "320", "11");
            case 58:
                return new C0908e(aVar, "310", "13");
            case 59:
                return new C0908e(aVar, "320", "13");
            case 60:
                return new C0908e(aVar, "310", "15");
            case 61:
                return new C0908e(aVar, "320", "15");
            case 62:
                return new C0908e(aVar, "310", "17");
            case 63:
                return new C0908e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0923s mo9200b() {
        return this.f1000b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C0839a mo9201c() {
        return this.f999a;
    }

    /* renamed from: d */
    public abstract String mo9196d();
}
