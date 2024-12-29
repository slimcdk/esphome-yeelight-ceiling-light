package com.xiaomi.push;

/* renamed from: com.xiaomi.push.dq */
public class C4610dq {

    /* renamed from: a */
    private static volatile C4610dq f8423a;

    /* renamed from: a */
    private C4609dp f8424a;

    /* renamed from: a */
    public static C4610dq mo24924a() {
        if (f8423a == null) {
            synchronized (C4610dq.class) {
                if (f8423a == null) {
                    f8423a = new C4610dq();
                }
            }
        }
        return f8423a;
    }

    /* renamed from: a */
    public C4609dp m13752a() {
        return this.f8424a;
    }

    /* renamed from: a */
    public void mo24925a(C4609dp dpVar) {
        this.f8424a = dpVar;
    }
}
