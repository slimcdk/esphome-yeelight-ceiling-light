package com.google.zxing.pdf417.decoder;

import com.google.zxing.C2564h;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2549b;

/* renamed from: com.google.zxing.pdf417.decoder.c */
final class C2606c {

    /* renamed from: a */
    private C2549b f4437a;

    /* renamed from: b */
    private C2564h f4438b;

    /* renamed from: c */
    private C2564h f4439c;

    /* renamed from: d */
    private C2564h f4440d;

    /* renamed from: e */
    private C2564h f4441e;

    /* renamed from: f */
    private int f4442f;

    /* renamed from: g */
    private int f4443g;

    /* renamed from: h */
    private int f4444h;

    /* renamed from: i */
    private int f4445i;

    C2606c(C2549b bVar, C2564h hVar, C2564h hVar2, C2564h hVar3, C2564h hVar4) {
        if (!(hVar == null && hVar3 == null) && (!(hVar2 == null && hVar4 == null) && ((hVar == null || hVar2 != null) && (hVar3 == null || hVar4 != null)))) {
            m7164k(bVar, hVar, hVar2, hVar3, hVar4);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    C2606c(C2606c cVar) {
        m7164k(cVar.f4437a, cVar.f4438b, cVar.f4439c, cVar.f4440d, cVar.f4441e);
    }

    /* renamed from: b */
    private void m7163b() {
        if (this.f4438b == null) {
            this.f4438b = new C2564h(0.0f, this.f4440d.mo19547d());
            this.f4439c = new C2564h(0.0f, this.f4441e.mo19547d());
        } else if (this.f4440d == null) {
            this.f4440d = new C2564h((float) (this.f4437a.mo19501j() - 1), this.f4438b.mo19547d());
            this.f4441e = new C2564h((float) (this.f4437a.mo19501j() - 1), this.f4439c.mo19547d());
        }
        this.f4442f = (int) Math.min(this.f4438b.mo19546c(), this.f4439c.mo19546c());
        this.f4443g = (int) Math.max(this.f4440d.mo19546c(), this.f4441e.mo19546c());
        this.f4444h = (int) Math.min(this.f4438b.mo19547d(), this.f4440d.mo19547d());
        this.f4445i = (int) Math.max(this.f4439c.mo19547d(), this.f4441e.mo19547d());
    }

    /* renamed from: k */
    private void m7164k(C2549b bVar, C2564h hVar, C2564h hVar2, C2564h hVar3, C2564h hVar4) {
        this.f4437a = bVar;
        this.f4438b = hVar;
        this.f4439c = hVar2;
        this.f4440d = hVar3;
        this.f4441e = hVar4;
        m7163b();
    }

    /* renamed from: l */
    static C2606c m7165l(C2606c cVar, C2606c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new C2606c(cVar.f4437a, cVar.f4438b, cVar.f4439c, cVar2.f4440d, cVar2.f4441e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.pdf417.decoder.C2606c mo19604a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            com.google.zxing.h r0 = r12.f4438b
            com.google.zxing.h r1 = r12.f4439c
            com.google.zxing.h r2 = r12.f4440d
            com.google.zxing.h r3 = r12.f4441e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo19547d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            com.google.zxing.h r13 = new com.google.zxing.h
            float r4 = r4.mo19546c()
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
            com.google.zxing.h r13 = r12.f4439c
            goto L_0x0034
        L_0x0032:
            com.google.zxing.h r13 = r12.f4441e
        L_0x0034:
            float r0 = r13.mo19547d()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.google.zxing.common.b r14 = r12.f4437a
            int r14 = r14.mo19497g()
            if (r0 < r14) goto L_0x004a
            com.google.zxing.common.b r14 = r12.f4437a
            int r14 = r14.mo19497g()
            int r0 = r14 + -1
        L_0x004a:
            com.google.zxing.h r14 = new com.google.zxing.h
            float r13 = r13.mo19546c()
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
            r12.m7163b()
            com.google.zxing.pdf417.decoder.c r13 = new com.google.zxing.pdf417.decoder.c
            com.google.zxing.common.b r7 = r12.f4437a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.C2606c.mo19604a(int, int, boolean):com.google.zxing.pdf417.decoder.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2564h mo19605c() {
        return this.f4439c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2564h mo19606d() {
        return this.f4441e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo19607e() {
        return this.f4443g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo19608f() {
        return this.f4445i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo19609g() {
        return this.f4442f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo19610h() {
        return this.f4444h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2564h mo19611i() {
        return this.f4438b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C2564h mo19612j() {
        return this.f4440d;
    }
}
