package p011c.p012a.p053e.p065w;

import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0816c;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.l */
public final class C0888l extends C0892p {

    /* renamed from: h */
    private final C0892p f940h = new C0881e();

    /* renamed from: q */
    private static C0827n m1405q(C0827n nVar) {
        String f = nVar.mo9016f();
        if (f.charAt(0) == '0') {
            return new C0827n(f.substring(1), (byte[]) null, nVar.mo9015e(), C0814a.UPC_A);
        }
        throw C0820g.m1114a();
    }

    /* renamed from: a */
    public C0827n mo9003a(C0816c cVar, Map<C0818e, ?> map) {
        return m1405q(this.f940h.mo9003a(cVar, map));
    }

    /* renamed from: b */
    public C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map) {
        return m1405q(this.f940h.mo9149b(i, aVar, map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo9150k(C0839a aVar, int[] iArr, StringBuilder sb) {
        return this.f940h.mo9150k(aVar, iArr, sb);
    }

    /* renamed from: l */
    public C0827n mo9153l(int i, C0839a aVar, int[] iArr, Map<C0818e, ?> map) {
        return m1405q(this.f940h.mo9153l(i, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0814a mo9151p() {
        return C0814a.UPC_A;
    }
}
