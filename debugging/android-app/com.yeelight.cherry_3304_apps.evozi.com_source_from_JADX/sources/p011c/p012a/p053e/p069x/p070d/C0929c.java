package p011c.p012a.p053e.p069x.p070d;

import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0840b;

/* renamed from: c.a.e.x.d.c */
final class C0929c {

    /* renamed from: a */
    private C0840b f1033a;

    /* renamed from: b */
    private C0829p f1034b;

    /* renamed from: c */
    private C0829p f1035c;

    /* renamed from: d */
    private C0829p f1036d;

    /* renamed from: e */
    private C0829p f1037e;

    /* renamed from: f */
    private int f1038f;

    /* renamed from: g */
    private int f1039g;

    /* renamed from: h */
    private int f1040h;

    /* renamed from: i */
    private int f1041i;

    C0929c(C0840b bVar, C0829p pVar, C0829p pVar2, C0829p pVar3, C0829p pVar4) {
        if (!(pVar == null && pVar3 == null) && (!(pVar2 == null && pVar4 == null) && ((pVar == null || pVar2 != null) && (pVar3 == null || pVar4 != null)))) {
            m1578k(bVar, pVar, pVar2, pVar3, pVar4);
            return;
        }
        throw C0823j.m1126a();
    }

    C0929c(C0929c cVar) {
        m1578k(cVar.f1033a, cVar.f1034b, cVar.f1035c, cVar.f1036d, cVar.f1037e);
    }

    /* renamed from: b */
    private void m1577b() {
        if (this.f1034b == null) {
            this.f1034b = new C0829p(0.0f, this.f1036d.mo9021d());
            this.f1035c = new C0829p(0.0f, this.f1037e.mo9021d());
        } else if (this.f1036d == null) {
            this.f1036d = new C0829p((float) (this.f1033a.mo9067m() - 1), this.f1034b.mo9021d());
            this.f1037e = new C0829p((float) (this.f1033a.mo9067m() - 1), this.f1035c.mo9021d());
        }
        this.f1038f = (int) Math.min(this.f1034b.mo9020c(), this.f1035c.mo9020c());
        this.f1039g = (int) Math.max(this.f1036d.mo9020c(), this.f1037e.mo9020c());
        this.f1040h = (int) Math.min(this.f1034b.mo9021d(), this.f1036d.mo9021d());
        this.f1041i = (int) Math.max(this.f1035c.mo9021d(), this.f1037e.mo9021d());
    }

    /* renamed from: k */
    private void m1578k(C0840b bVar, C0829p pVar, C0829p pVar2, C0829p pVar3, C0829p pVar4) {
        this.f1033a = bVar;
        this.f1034b = pVar;
        this.f1035c = pVar2;
        this.f1036d = pVar3;
        this.f1037e = pVar4;
        m1577b();
    }

    /* renamed from: l */
    static C0929c m1579l(C0929c cVar, C0929c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new C0929c(cVar.f1033a, cVar.f1034b, cVar.f1035c, cVar2.f1036d, cVar2.f1037e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p011c.p012a.p053e.p069x.p070d.C0929c mo9236a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            c.a.e.p r0 = r12.f1034b
            c.a.e.p r1 = r12.f1035c
            c.a.e.p r2 = r12.f1036d
            c.a.e.p r3 = r12.f1037e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo9021d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            c.a.e.p r13 = new c.a.e.p
            float r4 = r4.mo9020c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            c.a.e.p r13 = r12.f1035c
            goto L_0x0034
        L_0x0032:
            c.a.e.p r13 = r12.f1037e
        L_0x0034:
            float r0 = r13.mo9021d()
            int r0 = (int) r0
            int r0 = r0 + r14
            c.a.e.t.b r14 = r12.f1033a
            int r14 = r14.mo9064j()
            if (r0 < r14) goto L_0x004a
            c.a.e.t.b r14 = r12.f1033a
            int r14 = r14.mo9064j()
            int r0 = r14 + -1
        L_0x004a:
            c.a.e.p r14 = new c.a.e.p
            float r13 = r13.mo9020c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            r12.m1577b()
            c.a.e.x.d.c r13 = new c.a.e.x.d.c
            c.a.e.t.b r7 = r12.f1033a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p069x.p070d.C0929c.mo9236a(int, int, boolean):c.a.e.x.d.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0829p mo9237c() {
        return this.f1035c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0829p mo9238d() {
        return this.f1037e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9239e() {
        return this.f1039g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9240f() {
        return this.f1041i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo9241g() {
        return this.f1038f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo9242h() {
        return this.f1040h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0829p mo9243i() {
        return this.f1034b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0829p mo9244j() {
        return this.f1036d;
    }
}
