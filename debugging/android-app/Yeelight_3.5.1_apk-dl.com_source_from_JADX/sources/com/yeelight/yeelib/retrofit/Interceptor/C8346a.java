package com.yeelight.yeelib.retrofit.Interceptor;

import com.yeelight.yeelib.managers.C3051a;
import okhttp3.C3509b0;
import okhttp3.C3558z;
import okhttp3.C9834u;

/* renamed from: com.yeelight.yeelib.retrofit.Interceptor.a */
public class C8346a implements C9834u {
    /* renamed from: a */
    public C3509b0 mo35530a(C9834u.C9835a aVar) {
        C3558z.C3559a h = aVar.mo38901a().mo24659h();
        C3558z.C3559a a = h.mo24662a("client-type", "android");
        a.mo24662a("Authorization", "Bearer " + C3051a.m7925r().mo23362o());
        if (C3051a.m7925r().mo23364q() != null) {
            h.mo24662a("expires", C3051a.m7925r().mo23364q().toString());
        }
        return aVar.mo38904d(h.mo24663b());
    }
}
