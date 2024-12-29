package org.eclipse.jetty.client;

import p225w5.C11940d;

/* renamed from: org.eclipse.jetty.client.i */
public class C9876i implements C9875h {

    /* renamed from: a */
    C9875h f17938a;

    /* renamed from: b */
    boolean f17939b;

    /* renamed from: c */
    boolean f17940c;

    /* renamed from: d */
    boolean f17941d = true;

    /* renamed from: e */
    private C11940d f17942e;

    /* renamed from: f */
    private int f17943f;

    /* renamed from: g */
    private C11940d f17944g;

    public C9876i(C9875h hVar, boolean z) {
        this.f17938a = hVar;
        this.f17939b = z;
        this.f17940c = z;
    }

    /* renamed from: a */
    public void mo39539a(C11940d dVar, int i, C11940d dVar2) {
        if (this.f17940c) {
            this.f17938a.mo39539a(dVar, i, dVar2);
            return;
        }
        this.f17942e = dVar;
        this.f17943f = i;
        this.f17944g = dVar2;
    }

    /* renamed from: b */
    public void mo39540b(Throwable th) {
        if (this.f17939b) {
            this.f17938a.mo39540b(th);
        }
    }

    /* renamed from: c */
    public void mo39541c() {
        if (this.f17939b || this.f17940c) {
            this.f17938a.mo39541c();
        }
    }

    /* renamed from: d */
    public void mo39542d(C11940d dVar, C11940d dVar2) {
        if (this.f17940c) {
            this.f17938a.mo39542d(dVar, dVar2);
        }
    }

    /* renamed from: e */
    public void mo39543e(C11940d dVar) {
        if (this.f17940c) {
            this.f17938a.mo39543e(dVar);
        }
    }

    /* renamed from: f */
    public void mo39544f() {
        if (this.f17939b) {
            this.f17938a.mo39544f();
        }
    }

    /* renamed from: g */
    public void mo39545g() {
        if (this.f17940c) {
            if (!this.f17941d) {
                this.f17938a.mo39539a(this.f17942e, this.f17943f, this.f17944g);
            }
            this.f17938a.mo39545g();
        }
    }

    /* renamed from: h */
    public void mo39546h() {
        if (this.f17939b) {
            this.f17938a.mo39546h();
        }
    }

    /* renamed from: i */
    public void mo39547i(Throwable th) {
        if (this.f17939b || this.f17940c) {
            this.f17938a.mo39547i(th);
        }
    }

    /* renamed from: j */
    public void mo39548j() {
        if (this.f17940c) {
            this.f17938a.mo39548j();
        }
    }

    /* renamed from: k */
    public void mo39549k() {
        if (this.f17939b) {
            this.f17938a.mo39549k();
        }
    }

    /* renamed from: l */
    public boolean mo39595l() {
        return this.f17940c;
    }

    /* renamed from: m */
    public void mo39596m(boolean z) {
        this.f17939b = z;
    }

    /* renamed from: n */
    public void mo39597n(boolean z) {
        this.f17940c = z;
    }
}
