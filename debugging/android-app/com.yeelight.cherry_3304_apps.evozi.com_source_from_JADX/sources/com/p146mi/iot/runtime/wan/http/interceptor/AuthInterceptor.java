package com.p146mi.iot.runtime.wan.http.interceptor;

import com.p146mi.iot.runtime.CtrlRuntimeManager;
import java.util.Map;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1136s;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;

/* renamed from: com.mi.iot.runtime.wan.http.interceptor.AuthInterceptor */
public class AuthInterceptor implements C1136s {
    private String mAccessToken;
    private String mAppId;

    private C1130q getHeaders() {
        Map<String, String> auth = CtrlRuntimeManager.getInstance().getAuth();
        C1130q.C1132b bVar = new C1130q.C1132b();
        for (Map.Entry next : auth.entrySet()) {
            bVar.mo9752b((String) next.getKey(), (String) next.getValue());
        }
        return bVar.mo9755e();
    }

    public C1150z intercept(C1136s.C1137a aVar) {
        C1144x.C1146b n = aVar.mo9643a().mo9841n();
        n.mo9851j(getHeaders());
        return aVar.mo9644b(n.mo9848g());
    }
}
