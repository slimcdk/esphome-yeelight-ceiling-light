package com.xiaomi.push;

/* renamed from: com.xiaomi.push.dn */
public class C4625dn {

    /* renamed from: a */
    private static volatile C4625dn f7826a;

    /* renamed from: a */
    private C4624dm f7827a;

    /* renamed from: a */
    public static C4625dn mo28915a() {
        if (f7826a == null) {
            synchronized (C4625dn.class) {
                if (f7826a == null) {
                    f7826a = new C4625dn();
                }
            }
        }
        return f7826a;
    }

    /* renamed from: a */
    public C4624dm m13329a() {
        return this.f7827a;
    }

    /* renamed from: a */
    public void mo28916a(C4624dm dmVar) {
        this.f7827a = dmVar;
    }
}
