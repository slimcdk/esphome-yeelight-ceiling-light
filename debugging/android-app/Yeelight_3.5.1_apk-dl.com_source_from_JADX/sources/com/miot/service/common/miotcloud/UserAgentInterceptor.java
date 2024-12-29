package com.miot.service.common.miotcloud;

import com.squareup.okhttp.C4305r;
import com.squareup.okhttp.C4318x;

public class UserAgentInterceptor implements C4305r {
    private final String userAgent;

    public UserAgentInterceptor(String str) {
        this.userAgent = str;
    }

    public C4318x intercept(C4305r.C4306a aVar) {
        return aVar.mo26483b(aVar.mo26482a().mo28040n().mo28049i("User-Agent", this.userAgent).mo28047g());
    }
}
