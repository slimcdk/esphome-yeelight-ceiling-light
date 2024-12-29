package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.o3 */
class C1924o3 extends C1938p3 {

    /* renamed from: d */
    protected final byte[] f3608d;

    C1924o3(byte[] bArr) {
        if (bArr != null) {
            this.f3608d = bArr;
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public byte mo11637c(int i) {
        return this.f3608d[i];
    }

    /* renamed from: d */
    public int mo11638d() {
        return this.f3608d.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo11639e(int i, int i2, int i3) {
        return C1925o4.m5639a(i, this.f3608d, mo11792r(), i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1779f3) || mo11638d() != ((C1779f3) obj).mo11638d()) {
            return false;
        }
        if (mo11638d() == 0) {
            return true;
        }
        if (!(obj instanceof C1924o3)) {
            return obj.equals(this);
        }
        C1924o3 o3Var = (C1924o3) obj;
        int p = mo11649p();
        int p2 = o3Var.mo11649p();
        if (p == 0 || p2 == 0 || p == p2) {
            return mo11895q(o3Var, 0, mo11638d());
        }
        return false;
    }

    /* renamed from: f */
    public final C1779f3 mo11641f(int i, int i2) {
        int l = C1779f3.m5075l(0, i2, mo11638d());
        return l == 0 ? C1779f3.f3341b : new C1873l3(this.f3608d, mo11792r(), l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo11643i(Charset charset) {
        return new String(this.f3608d, mo11792r(), mo11638d(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo11645j(C1794g3 g3Var) {
        g3Var.mo11679a(this.f3608d, mo11792r(), mo11638d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public byte mo11646k(int i) {
        return this.f3608d[i];
    }

    /* renamed from: o */
    public final boolean mo11648o() {
        int r = mo11792r();
        return C1913n7.m5604g(this.f3608d, r, mo11638d() + r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo11895q(C1779f3 f3Var, int i, int i2) {
        if (i2 > f3Var.mo11638d()) {
            int d = mo11638d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > f3Var.mo11638d()) {
            int d2 = f3Var.mo11638d();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(f3Var instanceof C1924o3)) {
            return f3Var.mo11641f(0, i2).equals(mo11641f(0, i2));
        } else {
            C1924o3 o3Var = (C1924o3) f3Var;
            byte[] bArr = this.f3608d;
            byte[] bArr2 = o3Var.f3608d;
            int r = mo11792r() + i2;
            int r2 = mo11792r();
            int r3 = o3Var.mo11792r();
            while (r2 < r) {
                if (bArr[r2] != bArr2[r3]) {
                    return false;
                }
                r2++;
                r3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int mo11792r() {
        return 0;
    }
}
