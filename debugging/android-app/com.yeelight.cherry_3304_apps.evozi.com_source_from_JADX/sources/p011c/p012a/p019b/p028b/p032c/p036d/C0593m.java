package p011c.p012a.p019b.p028b.p032c.p036d;

import p011c.p012a.p019b.p028b.p032c.p036d.C0593m;

/* renamed from: c.a.b.b.c.d.m */
public abstract class C0593m<M extends C0593m<M>> extends C0599s {

    /* renamed from: b */
    protected C0595o f268b;

    /* renamed from: c */
    public void mo8562c(C0591k kVar) {
        if (this.f268b != null) {
            for (int i = 0; i < this.f268b.mo8604c(); i++) {
                this.f268b.mo8609f(i).mo8611b(kVar);
            }
        }
    }

    public /* synthetic */ Object clone() {
        C0593m mVar = (C0593m) super.clone();
        C0597q.m450g(this, mVar);
        return mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo8563e() {
        if (this.f268b == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f268b.mo8604c(); i2++) {
            i += this.f268b.mo8609f(i2).mo8614d();
        }
        return i;
    }

    /* renamed from: f */
    public final /* synthetic */ C0599s mo8601f() {
        return (C0593m) clone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo8602h(C0590j jVar, int i) {
        int a = jVar.mo8572a();
        if (!jVar.mo8579i(i)) {
            return false;
        }
        int i2 = i >>> 3;
        C0601u uVar = new C0601u(i, jVar.mo8576f(a, jVar.mo8572a() - a));
        C0596p pVar = null;
        C0595o oVar = this.f268b;
        if (oVar == null) {
            this.f268b = new C0595o();
        } else {
            pVar = oVar.mo8607e(i2);
        }
        if (pVar == null) {
            pVar = new C0596p();
            this.f268b.mo8606d(i2, pVar);
        }
        pVar.mo8612c(uVar);
        return true;
    }
}
