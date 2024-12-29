package p011c.p012a.p053e.p069x.p070d;

import java.util.Formatter;

/* renamed from: c.a.e.x.d.f */
final class C0934f {

    /* renamed from: a */
    private final C0927a f1059a;

    /* renamed from: b */
    private final C0935g[] f1060b;

    /* renamed from: c */
    private C0929c f1061c;

    /* renamed from: d */
    private final int f1062d;

    C0934f(C0927a aVar, C0929c cVar) {
        this.f1059a = aVar;
        int a = aVar.mo9229a();
        this.f1062d = a;
        this.f1061c = cVar;
        this.f1060b = new C0935g[(a + 2)];
    }

    /* renamed from: a */
    private void m1606a(C0935g gVar) {
        if (gVar != null) {
            ((C0936h) gVar).mo9272g(this.f1059a);
        }
    }

    /* renamed from: b */
    private static boolean m1607b(C0930d dVar, C0930d dVar2) {
        if (dVar2 == null || !dVar2.mo9251g() || dVar2.mo9245a() != dVar.mo9245a()) {
            return false;
        }
        dVar.mo9253i(dVar2.mo9247c());
        return true;
    }

    /* renamed from: c */
    private static int m1608c(int i, int i2, C0930d dVar) {
        if (dVar == null || dVar.mo9251g()) {
            return i2;
        }
        if (!dVar.mo9252h(i)) {
            return i2 + 1;
        }
        dVar.mo9253i(i);
        return 0;
    }

    /* renamed from: d */
    private int m1609d() {
        int f = m1611f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f1062d + 1; i++) {
            C0930d[] d = this.f1060b[i].mo9268d();
            for (int i2 = 0; i2 < d.length; i2++) {
                if (d[i2] != null && !d[i2].mo9251g()) {
                    m1610e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    private void m1610e(int i, int i2, C0930d[] dVarArr) {
        C0930d dVar = dVarArr[i2];
        C0930d[] d = this.f1060b[i - 1].mo9268d();
        C0935g[] gVarArr = this.f1060b;
        int i3 = i + 1;
        C0930d[] d2 = gVarArr[i3] != null ? gVarArr[i3].mo9268d() : d;
        C0930d[] dVarArr2 = new C0930d[14];
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
        while (i4 < 14 && !m1607b(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    /* renamed from: f */
    private int m1611f() {
        m1612g();
        return m1613h() + m1614i();
    }

    /* renamed from: g */
    private void m1612g() {
        C0935g[] gVarArr = this.f1060b;
        if (gVarArr[0] != null && gVarArr[this.f1062d + 1] != null) {
            C0930d[] d = gVarArr[0].mo9268d();
            C0930d[] d2 = this.f1060b[this.f1062d + 1].mo9268d();
            for (int i = 0; i < d.length; i++) {
                if (!(d[i] == null || d2[i] == null || d[i].mo9247c() != d2[i].mo9247c())) {
                    for (int i2 = 1; i2 <= this.f1062d; i2++) {
                        C0930d dVar = this.f1060b[i2].mo9268d()[i];
                        if (dVar != null) {
                            dVar.mo9253i(d[i].mo9247c());
                            if (!dVar.mo9251g()) {
                                this.f1060b[i2].mo9268d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m1613h() {
        C0935g[] gVarArr = this.f1060b;
        if (gVarArr[0] == null) {
            return 0;
        }
        C0930d[] d = gVarArr[0].mo9268d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            if (d[i2] != null) {
                int c = d[i2].mo9247c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f1062d + 1 && i3 < 2; i4++) {
                    C0930d dVar = this.f1060b[i4].mo9268d()[i2];
                    if (dVar != null) {
                        i3 = m1608c(c, i3, dVar);
                        if (!dVar.mo9251g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m1614i() {
        C0935g[] gVarArr = this.f1060b;
        int i = this.f1062d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        C0930d[] d = gVarArr[i + 1].mo9268d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            if (d[i3] != null) {
                int c = d[i3].mo9247c();
                int i4 = 0;
                for (int i5 = this.f1062d + 1; i5 > 0 && i4 < 2; i5--) {
                    C0930d dVar = this.f1060b[i5].mo9268d()[i3];
                    if (dVar != null) {
                        i4 = m1608c(c, i4, dVar);
                        if (!dVar.mo9251g()) {
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
    public int mo9256j() {
        return this.f1062d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo9257k() {
        return this.f1059a.mo9230b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo9258l() {
        return this.f1059a.mo9231c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0929c mo9259m() {
        return this.f1061c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0935g mo9260n(int i) {
        return this.f1060b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0935g[] mo9261o() {
        m1606a(this.f1060b[0]);
        m1606a(this.f1060b[this.f1062d + 1]);
        int i = 928;
        while (true) {
            int d = m1609d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f1060b;
    }

    /* renamed from: p */
    public void mo9262p(C0929c cVar) {
        this.f1061c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo9263q(int i, C0935g gVar) {
        this.f1060b[i] = gVar;
    }

    public String toString() {
        C0935g[] gVarArr = this.f1060b;
        C0935g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f1062d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < gVar.mo9268d().length; i++) {
            formatter.format("CW %3d:", new Object[]{Integer.valueOf(i)});
            for (int i2 = 0; i2 < this.f1062d + 2; i2++) {
                C0935g[] gVarArr2 = this.f1060b;
                if (gVarArr2[i2] == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    C0930d dVar = gVarArr2[i2].mo9268d()[i];
                    if (dVar == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(dVar.mo9247c()), Integer.valueOf(dVar.mo9249e())});
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
