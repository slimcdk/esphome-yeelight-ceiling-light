package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* renamed from: com.google.zxing.pdf417.decoder.f */
class C2609f {

    /* renamed from: a */
    private final C2606c f4455a;

    /* renamed from: b */
    private final C2607d[] f4456b;

    C2609f(C2606c cVar) {
        this.f4455a = new C2606c(cVar);
        this.f4456b = new C2607d[((cVar.mo19608f() - cVar.mo19610h()) + 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2606c mo19633a() {
        return this.f4455a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2607d mo19634b(int i) {
        return this.f4456b[mo19637e(i)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C2607d mo19635c(int i) {
        C2607d dVar;
        C2607d dVar2;
        C2607d b = mo19634b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo19637e(i) - i2;
            if (e >= 0 && (dVar2 = this.f4456b[e]) != null) {
                return dVar2;
            }
            int e2 = mo19637e(i) + i2;
            C2607d[] dVarArr = this.f4456b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C2607d[] mo19636d() {
        return this.f4456b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo19637e(int i) {
        return i - this.f4455a.mo19610h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo19638f(int i, C2607d dVar) {
        this.f4456b[mo19637e(i)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i = 0;
        for (C2607d dVar : this.f4456b) {
            if (dVar == null) {
                formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i)});
                i++;
            } else {
                formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i), Integer.valueOf(dVar.mo19615c()), Integer.valueOf(dVar.mo19617e())});
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
