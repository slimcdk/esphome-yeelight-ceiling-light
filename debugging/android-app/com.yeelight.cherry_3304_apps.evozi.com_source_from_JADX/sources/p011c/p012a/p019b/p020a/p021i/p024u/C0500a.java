package p011c.p012a.p019b.p020a.p021i.p024u;

import p011c.p012a.p019b.p020a.C0465h;
import p011c.p012a.p019b.p020a.p021i.C0481h;
import p011c.p012a.p019b.p020a.p021i.C0487l;

/* renamed from: c.a.b.a.i.u.a */
final /* synthetic */ class C0500a implements Runnable {

    /* renamed from: a */
    private final C0502c f117a;

    /* renamed from: b */
    private final C0487l f118b;

    /* renamed from: c */
    private final C0465h f119c;

    /* renamed from: d */
    private final C0481h f120d;

    private C0500a(C0502c cVar, C0487l lVar, C0465h hVar, C0481h hVar2) {
        this.f117a = cVar;
        this.f118b = lVar;
        this.f119c = hVar;
        this.f120d = hVar2;
    }

    /* renamed from: b */
    public static Runnable m163b(C0502c cVar, C0487l lVar, C0465h hVar, C0481h hVar2) {
        return new C0500a(cVar, lVar, hVar, hVar2);
    }

    public void run() {
        C0502c.m167c(this.f117a, this.f118b, this.f119c, this.f120d);
    }
}
