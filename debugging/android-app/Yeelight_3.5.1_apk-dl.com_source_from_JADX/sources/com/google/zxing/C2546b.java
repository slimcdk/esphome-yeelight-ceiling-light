package com.google.zxing;

import com.google.zxing.common.C2548a;
import com.google.zxing.common.C2549b;

/* renamed from: com.google.zxing.b */
public final class C2546b {

    /* renamed from: a */
    private final C2544a f4301a;

    /* renamed from: b */
    private C2549b f4302b;

    public C2546b(C2544a aVar) {
        if (aVar != null) {
            this.f4301a = aVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C2549b mo19454a() {
        if (this.f4302b == null) {
            this.f4302b = this.f4301a.mo19448b();
        }
        return this.f4302b;
    }

    /* renamed from: b */
    public C2548a mo19455b(int i, C2548a aVar) {
        return this.f4301a.mo19449c(i, aVar);
    }

    /* renamed from: c */
    public int mo19456c() {
        return this.f4301a.mo19450d();
    }

    /* renamed from: d */
    public int mo19457d() {
        return this.f4301a.mo19452f();
    }

    /* renamed from: e */
    public boolean mo19458e() {
        return this.f4301a.mo19451e().mo19465e();
    }

    /* renamed from: f */
    public C2546b mo19459f() {
        return new C2546b(this.f4301a.mo19447a(this.f4301a.mo19451e().mo19466f()));
    }

    public String toString() {
        try {
            return mo19454a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
