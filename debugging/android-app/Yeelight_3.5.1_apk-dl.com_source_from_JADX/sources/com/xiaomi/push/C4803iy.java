package com.xiaomi.push;

import com.xiaomi.push.C4807jb;

/* renamed from: com.xiaomi.push.iy */
public class C4803iy {

    /* renamed from: a */
    private final C4812jf f9259a;

    /* renamed from: a */
    private final C4822jo f9260a;

    public C4803iy() {
        this(new C4807jb.C4808a());
    }

    public C4803iy(C4814jh jhVar) {
        C4822jo joVar = new C4822jo();
        this.f9260a = joVar;
        this.f9259a = jhVar.mo29873a(joVar);
    }

    /* renamed from: a */
    public void mo29848a(C4798iu iuVar, byte[] bArr) {
        try {
            this.f9260a.mo29880a(bArr);
            iuVar.mo29095a(this.f9259a);
        } finally {
            this.f9259a.mo29875k();
        }
    }
}
