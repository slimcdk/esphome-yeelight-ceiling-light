package com.yeelight.yeelib.p187h.p188c;

import com.yeelight.yeelib.p152f.C4201a;
import p156f.C10833u;
import p156f.C4318a0;
import p156f.C4332c0;

/* renamed from: com.yeelight.yeelib.h.c.a */
public class C9861a implements C10833u {
    /* renamed from: a */
    public C4332c0 mo31916a(C10833u.C10834a aVar) {
        C4318a0.C4319a h = aVar.mo34023a().mo23814h();
        h.mo23817a("client-type", "android");
        h.mo23817a("Authorization", "Bearer " + C4201a.m11607r().mo23448o());
        if (C4201a.m11607r().mo23450q() != null) {
            h.mo23817a("expires", C4201a.m11607r().mo23450q().toString());
        }
        return aVar.mo34026d(h.mo23818b());
    }
}
