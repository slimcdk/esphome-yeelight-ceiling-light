package com.miot.service.common.miotcloud;

import p011c.p083d.p084a.C1136s;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;

public class UserAgentInterceptor implements C1136s {
    private final String userAgent;

    public UserAgentInterceptor(String str) {
        this.userAgent = str;
    }

    public C1150z intercept(C1136s.C1137a aVar) {
        C1144x.C1146b n = aVar.mo9643a().mo9841n();
        n.mo9850i("User-Agent", this.userAgent);
        return aVar.mo9644b(n.mo9848g());
    }
}
