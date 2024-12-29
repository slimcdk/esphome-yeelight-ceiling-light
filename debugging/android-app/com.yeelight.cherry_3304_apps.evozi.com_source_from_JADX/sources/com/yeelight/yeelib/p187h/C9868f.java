package com.yeelight.yeelib.p187h;

import com.yeelight.yeelib.p187h.p189h.C9873a;
import com.yeelight.yeelib.utils.C10543g;
import p173j.C4477m;

/* renamed from: com.yeelight.yeelib.h.f */
public class C9868f {

    /* renamed from: c */
    private static final String f17936c = "f";

    /* renamed from: a */
    private C4477m f17937a;

    /* renamed from: b */
    private C9873a f17938b;

    /* renamed from: com.yeelight.yeelib.h.f$b */
    private static class C9870b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C9868f f17939a = new C9868f();
    }

    private C9868f() {
        m24176c();
    }

    /* renamed from: b */
    public static C9868f m24175b() {
        return C9870b.f17939a;
    }

    /* renamed from: c */
    private void m24176c() {
        try {
            C4477m.C4479b bVar = new C4477m.C4479b();
            bVar.mo24579a("https://www.yeelight.com");
            bVar.mo24583e(C9860b.m24128c().mo31915a());
            C4477m c = bVar.mo24581c();
            this.f17937a = c;
            this.f17938b = (C9873a) c.mo24570d(C9873a.class);
        } catch (Exception e) {
            String str = f17936c;
            C10543g.m25741b(str, "create failure：" + e.getMessage());
        }
    }

    /* renamed from: a */
    public C9873a mo31931a() {
        return this.f17938b;
    }
}
