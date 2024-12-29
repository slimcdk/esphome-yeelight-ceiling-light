package com.p022mi.iot.runtime.wan.http.interceptor;

import com.squareup.okhttp.C4305r;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4318x;
import com.squareup.okhttp.C4321y;
import java.io.IOException;
import java.net.URLDecoder;
import okio.C3564c;

/* renamed from: com.mi.iot.runtime.wan.http.interceptor.LoggingInterceptor */
public class LoggingInterceptor implements C4305r {
    private static final String TAG = "LoggingInterceptor";

    private static String bodyToString(C4312v vVar) {
        try {
            C4312v g = vVar.mo28040n().mo28047g();
            if (g.mo28032f() == null) {
                return "";
            }
            C3564c cVar = new C3564c();
            g.mo28032f().mo27984g(cVar);
            return URLDecoder.decode(cVar.mo24722D(), "UTF-8");
        } catch (IOException unused) {
            return "did not work";
        }
    }

    public C4318x intercept(C4305r.C4306a aVar) {
        C4312v g = aVar.mo26482a().mo28040n().mo28049i("Accept-Encoding", "identity").mo28047g();
        String url = g.mo28043q().toString();
        StringBuilder sb = new StringBuilder();
        sb.append("REQUEST Url:");
        sb.append(url);
        String bodyToString = bodyToString(g);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("REQUEST Body:");
        sb2.append(bodyToString);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("REQUEST Headers:");
        sb3.append(g.mo28035i().toString());
        C4318x b = aVar.mo26483b(g);
        int o = b.mo28060o();
        String n = b.mo28056k().mo28089n();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("RESPONSE code:");
        sb4.append(o);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("RESPONSE Body:");
        sb5.append(n);
        return b.mo28069w().mo28073l(C4321y.m12222l(b.mo28056k().mo26480i(), n)).mo28074m();
    }
}
