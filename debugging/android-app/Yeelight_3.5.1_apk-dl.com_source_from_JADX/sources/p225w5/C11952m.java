package p225w5;

import p225w5.C11940d;

/* renamed from: w5.m */
public class C11952m extends C11937a {

    /* renamed from: l */
    C11940d f21838l;

    /* renamed from: w5.m$a */
    public static class C11953a extends C11952m implements C11940d.C11941a {
        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof C11940d) && ((C11940d) obj).mo42418Z0(this)) || C11952m.super.equals(obj);
        }
    }

    public C11952m() {
        super(2, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11952m(C11940d dVar) {
        super(2, !dVar.mo42438r0());
        int i = 1;
        this.f21838l = dVar.mo42406F();
        mo42430h0(dVar.mo42416U0());
        mo42442v0(dVar.mo42409L0());
        mo42427g1(dVar.mo42424d0());
        this.f21809a = !dVar.mo42415T() ? 2 : i;
    }

    public C11952m(C11940d dVar, int i, int i2, int i3, int i4) {
        super(2, !dVar.mo42438r0());
        this.f21838l = dVar.mo42406F();
        mo42430h0(i3);
        mo42442v0(i2);
        mo42427g1(i);
        this.f21809a = i4;
    }

    /* renamed from: F */
    public C11940d mo42406F() {
        return this.f21838l.mo42406F();
    }

    /* renamed from: H0 */
    public void mo42407H0() {
    }

    /* renamed from: T */
    public boolean mo42415T() {
        return this.f21838l.mo42415T();
    }

    /* renamed from: W */
    public byte mo42449W(int i) {
        return this.f21838l.mo42449W(i);
    }

    public int capacity() {
        return this.f21838l.capacity();
    }

    public void clear() {
        mo42427g1(-1);
        mo42442v0(0);
        mo42430h0(this.f21838l.mo42409L0());
        mo42442v0(this.f21838l.mo42409L0());
    }

    /* renamed from: d */
    public void mo42495d(int i, int i2) {
        int i3 = this.f21809a;
        this.f21809a = 2;
        mo42442v0(0);
        mo42430h0(i2);
        mo42442v0(i);
        mo42427g1(-1);
        this.f21809a = i3;
    }

    /* renamed from: e */
    public void mo42496e(C11940d dVar) {
        int i = 2;
        this.f21809a = 2;
        this.f21838l = dVar.mo42406F();
        mo42442v0(0);
        mo42430h0(dVar.mo42416U0());
        mo42442v0(dVar.mo42409L0());
        mo42427g1(dVar.mo42424d0());
        if (dVar.mo42415T()) {
            i = 1;
        }
        this.f21809a = i;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C11940d) && obj.equals(this)) || super.equals(obj);
    }

    /* renamed from: f0 */
    public int mo42426f0(int i, C11940d dVar) {
        return this.f21838l.mo42426f0(i, dVar);
    }

    /* renamed from: g0 */
    public byte[] mo42451g0() {
        return this.f21838l.mo42451g0();
    }

    /* renamed from: k0 */
    public boolean mo42432k0() {
        return true;
    }

    /* renamed from: m */
    public int mo42435m(int i, byte[] bArr, int i2, int i3) {
        return this.f21838l.mo42435m(i, bArr, i2, i3);
    }

    /* renamed from: p0 */
    public void mo42452p0(int i, byte b) {
        this.f21838l.mo42452p0(i, b);
    }

    public String toString() {
        return this.f21838l == null ? "INVALID" : super.toString();
    }

    /* renamed from: x0 */
    public int mo42453x0(int i, byte[] bArr, int i2, int i3) {
        return this.f21838l.mo42453x0(i, bArr, i2, i3);
    }

    /* renamed from: z */
    public C11940d mo42445z(int i, int i2) {
        return this.f21838l.mo42445z(i, i2);
    }
}
