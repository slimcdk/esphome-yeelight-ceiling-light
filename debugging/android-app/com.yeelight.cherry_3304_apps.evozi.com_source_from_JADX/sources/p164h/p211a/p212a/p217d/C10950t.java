package p164h.p211a.p212a.p217d;

import p164h.p211a.p212a.p217d.C10929e;

/* renamed from: h.a.a.d.t */
public class C10950t extends C10924a {

    /* renamed from: l */
    C10929e f21340l;

    /* renamed from: h.a.a.d.t$a */
    public static class C10951a extends C10950t implements C10929e.C10930a {
        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof C10929e) && ((C10929e) obj).mo34585m0(this)) || C10950t.super.equals(obj);
        }
    }

    public C10950t() {
        super(2, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10950t(C10929e eVar) {
        super(2, !eVar.mo34588r0());
        int i = 1;
        this.f21340l = eVar.mo34557H();
        mo34575f0(eVar.mo34562S0());
        mo34592v0(eVar.getIndex());
        mo34573e1(eVar.mo34571c0());
        this.f21290a = !eVar.mo34564V() ? 2 : i;
    }

    public C10950t(C10929e eVar, int i, int i2, int i3, int i4) {
        super(2, !eVar.mo34588r0());
        this.f21340l = eVar.mo34557H();
        mo34575f0(i3);
        mo34592v0(i2);
        mo34573e1(i);
        this.f21290a = i4;
    }

    /* renamed from: D0 */
    public void mo34555D0() {
    }

    /* renamed from: H */
    public C10929e mo34557H() {
        return this.f21340l.mo34557H();
    }

    /* renamed from: V */
    public boolean mo34564V() {
        return this.f21340l.mo34564V();
    }

    /* renamed from: X */
    public byte mo34606X(int i) {
        return this.f21340l.mo34606X(i);
    }

    public int capacity() {
        return this.f21340l.capacity();
    }

    public void clear() {
        mo34573e1(-1);
        mo34592v0(0);
        mo34575f0(this.f21340l.getIndex());
        mo34592v0(this.f21340l.getIndex());
    }

    /* renamed from: d */
    public void mo34660d(int i, int i2) {
        int i3 = this.f21290a;
        this.f21290a = 2;
        mo34592v0(0);
        mo34575f0(i2);
        mo34592v0(i);
        mo34573e1(-1);
        this.f21290a = i3;
    }

    /* renamed from: e */
    public void mo34661e(C10929e eVar) {
        int i = 2;
        this.f21290a = 2;
        this.f21340l = eVar.mo34557H();
        mo34592v0(0);
        mo34575f0(eVar.mo34562S0());
        mo34592v0(eVar.getIndex());
        mo34573e1(eVar.mo34571c0());
        if (eVar.mo34564V()) {
            i = 1;
        }
        this.f21290a = i;
    }

    /* renamed from: e0 */
    public byte[] mo34608e0() {
        return this.f21340l.mo34608e0();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C10929e) && obj.equals(this)) || super.equals(obj);
    }

    /* renamed from: g */
    public int mo34576g(int i, C10929e eVar) {
        return this.f21340l.mo34576g(i, eVar);
    }

    /* renamed from: h */
    public int mo34580h(int i, byte[] bArr, int i2, int i3) {
        return this.f21340l.mo34580h(i, bArr, i2, i3);
    }

    /* renamed from: i */
    public C10929e mo34582i(int i, int i2) {
        return this.f21340l.mo34582i(i, i2);
    }

    /* renamed from: j0 */
    public boolean mo34583j0() {
        return true;
    }

    /* renamed from: o0 */
    public void mo34609o0(int i, byte b) {
        this.f21340l.mo34609o0(i, b);
    }

    public String toString() {
        return this.f21340l == null ? "INVALID" : super.toString();
    }

    /* renamed from: x0 */
    public int mo34610x0(int i, byte[] bArr, int i2, int i3) {
        return this.f21340l.mo34610x0(i, bArr, i2, i3);
    }
}
