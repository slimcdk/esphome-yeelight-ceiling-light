package com.miot.service.common.miotcloud;

import java.io.IOException;
import java.net.URLDecoder;
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1136s;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;
import p163g.C4406c;

public class OkHttpLogingInterceptor implements C1136s {
    private static final String TAG = "OkHttpLogingInterceptor";

    private static String bodyToString(C1144x xVar) {
        try {
            C1144x g = xVar.mo9841n().mo9848g();
            C4406c cVar = new C4406c();
            g.mo9833f().mo9798g(cVar);
            return URLDecoder.decode(cVar.mo24228d0(), "UTF-8");
        } catch (IOException unused) {
            return "did not work";
        }
    }

    public C1150z intercept(C1136s.C1137a aVar) {
        C1144x.C1146b n = aVar.mo9643a().mo9841n();
        n.mo9850i("Accept-Encoding", "identity");
        C1144x g = n.mo9848g();
        "REQUEST Url:" + g.mo9845r();
        "REQUEST Body:" + bodyToString(g);
        "REQUEST Headers:" + g.mo9836i().toString();
        C1150z b = aVar.mo9644b(g);
        "RESPONSE Headers:" + b.mo9865s().toString();
        int o = b.mo9861o();
        String t = b.mo9857k().mo9391t();
        "RESPONSE code:" + o;
        "RESPONSE Body:" + t;
        C1150z.C1152b w = b.mo9870w();
        w.mo9874l(C0988a0.m1901o(b.mo9857k().mo9389j(), t));
        return w.mo9875m();
    }
}
