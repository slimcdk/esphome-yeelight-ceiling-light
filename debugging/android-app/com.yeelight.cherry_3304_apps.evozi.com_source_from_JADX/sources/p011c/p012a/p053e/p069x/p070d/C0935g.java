package p011c.p012a.p053e.p069x.p070d;

import java.util.Formatter;

/* renamed from: c.a.e.x.d.g */
class C0935g {

    /* renamed from: a */
    private final C0929c f1063a;

    /* renamed from: b */
    private final C0930d[] f1064b;

    C0935g(C0929c cVar) {
        this.f1063a = new C0929c(cVar);
        this.f1064b = new C0930d[((cVar.mo9240f() - cVar.mo9242h()) + 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0929c mo9265a() {
        return this.f1063a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0930d mo9266b(int i) {
        return this.f1064b[mo9269e(i)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0930d mo9267c(int i) {
        C0930d dVar;
        C0930d dVar2;
        C0930d b = mo9266b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo9269e(i) - i2;
            if (e >= 0 && (dVar2 = this.f1064b[e]) != null) {
                return dVar2;
            }
            int e2 = mo9269e(i) + i2;
            C0930d[] dVarArr = this.f1064b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C0930d[] mo9268d() {
        return this.f1064b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo9269e(int i) {
        return i - this.f1063a.mo9242h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo9270f(int i, C0930d dVar) {
        this.f1064b[mo9269e(i)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i = 0;
        for (C0930d dVar : this.f1064b) {
            if (dVar == null) {
                formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i)});
                i++;
            } else {
                formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i), Integer.valueOf(dVar.mo9247c()), Integer.valueOf(dVar.mo9249e())});
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
