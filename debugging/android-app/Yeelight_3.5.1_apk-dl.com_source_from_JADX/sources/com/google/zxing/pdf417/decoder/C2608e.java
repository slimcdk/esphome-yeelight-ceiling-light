package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* renamed from: com.google.zxing.pdf417.decoder.e */
final class C2608e {

    /* renamed from: a */
    private final C2604a f4451a;

    /* renamed from: b */
    private final C2609f[] f4452b;

    /* renamed from: c */
    private C2606c f4453c;

    /* renamed from: d */
    private final int f4454d;

    C2608e(C2604a aVar, C2606c cVar) {
        this.f4451a = aVar;
        int a = aVar.mo19597a();
        this.f4454d = a;
        this.f4453c = cVar;
        this.f4452b = new C2609f[(a + 2)];
    }

    /* renamed from: a */
    private void m7185a(C2609f fVar) {
        if (fVar != null) {
            ((C2610g) fVar).mo19640g(this.f4451a);
        }
    }

    /* renamed from: b */
    private static boolean m7186b(C2607d dVar, C2607d dVar2) {
        if (dVar2 == null || !dVar2.mo19619g() || dVar2.mo19613a() != dVar.mo19613a()) {
            return false;
        }
        dVar.mo19621i(dVar2.mo19615c());
        return true;
    }

    /* renamed from: c */
    private static int m7187c(int i, int i2, C2607d dVar) {
        if (dVar == null || dVar.mo19619g()) {
            return i2;
        }
        if (!dVar.mo19620h(i)) {
            return i2 + 1;
        }
        dVar.mo19621i(i);
        return 0;
    }

    /* renamed from: d */
    private int m7188d() {
        int f = m7190f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f4454d + 1; i++) {
            C2607d[] d = this.f4452b[i].mo19636d();
            for (int i2 = 0; i2 < d.length; i2++) {
                if (d[i2] != null && !d[i2].mo19619g()) {
                    m7189e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    private void m7189e(int i, int i2, C2607d[] dVarArr) {
        C2607d dVar = dVarArr[i2];
        C2607d[] d = this.f4452b[i - 1].mo19636d();
        C2609f[] fVarArr = this.f4452b;
        int i3 = i + 1;
        C2607d[] d2 = fVarArr[i3] != null ? fVarArr[i3].mo19636d() : d;
        C2607d[] dVarArr2 = new C2607d[14];
        dVarArr2[2] = d[i2];
        dVarArr2[3] = d2[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            dVarArr2[0] = dVarArr[i5];
            dVarArr2[4] = d[i5];
            dVarArr2[5] = d2[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            dVarArr2[8] = dVarArr[i6];
            dVarArr2[10] = d[i6];
            dVarArr2[11] = d2[i6];
        }
        if (i2 < dVarArr.length - 1) {
            int i7 = i2 + 1;
            dVarArr2[1] = dVarArr[i7];
            dVarArr2[6] = d[i7];
            dVarArr2[7] = d2[i7];
        }
        if (i2 < dVarArr.length - 2) {
            int i8 = i2 + 2;
            dVarArr2[9] = dVarArr[i8];
            dVarArr2[12] = d[i8];
            dVarArr2[13] = d2[i8];
        }
        while (i4 < 14 && !m7186b(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    /* renamed from: f */
    private int m7190f() {
        m7191g();
        return m7192h() + m7193i();
    }

    /* renamed from: g */
    private void m7191g() {
        C2609f[] fVarArr = this.f4452b;
        if (fVarArr[0] != null && fVarArr[this.f4454d + 1] != null) {
            C2607d[] d = fVarArr[0].mo19636d();
            C2607d[] d2 = this.f4452b[this.f4454d + 1].mo19636d();
            for (int i = 0; i < d.length; i++) {
                if (!(d[i] == null || d2[i] == null || d[i].mo19615c() != d2[i].mo19615c())) {
                    for (int i2 = 1; i2 <= this.f4454d; i2++) {
                        C2607d dVar = this.f4452b[i2].mo19636d()[i];
                        if (dVar != null) {
                            dVar.mo19621i(d[i].mo19615c());
                            if (!dVar.mo19619g()) {
                                this.f4452b[i2].mo19636d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m7192h() {
        C2609f[] fVarArr = this.f4452b;
        if (fVarArr[0] == null) {
            return 0;
        }
        C2607d[] d = fVarArr[0].mo19636d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            if (d[i2] != null) {
                int c = d[i2].mo19615c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f4454d + 1 && i3 < 2; i4++) {
                    C2607d dVar = this.f4452b[i4].mo19636d()[i2];
                    if (dVar != null) {
                        i3 = m7187c(c, i3, dVar);
                        if (!dVar.mo19619g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m7193i() {
        C2609f[] fVarArr = this.f4452b;
        int i = this.f4454d;
        if (fVarArr[i + 1] == null) {
            return 0;
        }
        C2607d[] d = fVarArr[i + 1].mo19636d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            if (d[i3] != null) {
                int c = d[i3].mo19615c();
                int i4 = 0;
                for (int i5 = this.f4454d + 1; i5 > 0 && i4 < 2; i5--) {
                    C2607d dVar = this.f4452b[i5].mo19636d()[i3];
                    if (dVar != null) {
                        i4 = m7187c(c, i4, dVar);
                        if (!dVar.mo19619g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo19624j() {
        return this.f4454d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo19625k() {
        return this.f4451a.mo19598b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo19626l() {
        return this.f4451a.mo19599c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C2606c mo19627m() {
        return this.f4453c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C2609f mo19628n(int i) {
        return this.f4452b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C2609f[] mo19629o() {
        m7185a(this.f4452b[0]);
        m7185a(this.f4452b[this.f4454d + 1]);
        int i = 928;
        while (true) {
            int d = m7188d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f4452b;
    }

    /* renamed from: p */
    public void mo19630p(C2606c cVar) {
        this.f4453c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo19631q(int i, C2609f fVar) {
        this.f4452b[i] = fVar;
    }

    public String toString() {
        C2609f[] fVarArr = this.f4452b;
        C2609f fVar = fVarArr[0];
        if (fVar == null) {
            fVar = fVarArr[this.f4454d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < fVar.mo19636d().length; i++) {
            formatter.format("CW %3d:", new Object[]{Integer.valueOf(i)});
            for (int i2 = 0; i2 < this.f4454d + 2; i2++) {
                C2609f[] fVarArr2 = this.f4452b;
                if (fVarArr2[i2] == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    C2607d dVar = fVarArr2[i2].mo19636d()[i];
                    if (dVar == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(dVar.mo19615c()), Integer.valueOf(dVar.mo19617e())});
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
