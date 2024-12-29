package p011c.p012a.p053e.p073y.p075c;

import p011c.p012a.p053e.C0829p;

/* renamed from: c.a.e.y.c.a */
public final class C0965a extends C0829p {

    /* renamed from: c */
    private final float f1136c;

    C0965a(float f, float f2, float f3) {
        super(f, f2);
        this.f1136c = f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9332f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo9021d()) > f || Math.abs(f3 - mo9020c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f1136c);
        return abs <= 1.0f || abs <= this.f1136c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0965a mo9333g(float f, float f2, float f3) {
        return new C0965a((mo9020c() + f2) / 2.0f, (mo9021d() + f) / 2.0f, (this.f1136c + f3) / 2.0f);
    }
}
