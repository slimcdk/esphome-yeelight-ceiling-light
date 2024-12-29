package com.p022mi.iot.runtime.wan.http.interceptor;

import com.p022mi.iot.runtime.CtrlRuntimeManager;
import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4305r;
import com.squareup.okhttp.C4318x;
import java.util.Map;

/* renamed from: com.mi.iot.runtime.wan.http.interceptor.AuthInterceptorV2 */
public class AuthInterceptorV2 implements C4305r {
    private String mAccessToken;
    private String mAppId;

    private C4299p getHeaders() {
        Map<String, String> auth = CtrlRuntimeManager.getInstance().getAuth();
        C4299p.C4301b bVar = new C4299p.C4301b();
        for (Map.Entry next : auth.entrySet()) {
            bVar.mo27939b((String) next.getKey(), (String) next.getValue());
        }
        bVar.mo27939b("Spec-NS", "miot-spec-v2");
        return bVar.mo27942e();
    }

    public C4318x intercept(C4305r.C4306a aVar) {
        return aVar.mo26483b(aVar.mo26482a().mo28040n().mo28050j(getHeaders()).mo28047g());
    }
}
