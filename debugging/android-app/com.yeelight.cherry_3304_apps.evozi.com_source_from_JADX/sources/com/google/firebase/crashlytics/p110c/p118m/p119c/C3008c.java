package com.google.firebase.crashlytics.p110c.p118m.p119c;

import java.io.File;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.c.m.c.c */
public interface C3008c {

    /* renamed from: com.google.firebase.crashlytics.c.m.c.c$a */
    public enum C3009a {
        JAVA,
        NATIVE
    }

    /* renamed from: a */
    Map<String, String> mo17400a();

    /* renamed from: b */
    String mo17401b();

    /* renamed from: c */
    File mo17402c();

    /* renamed from: d */
    File[] mo17403d();

    /* renamed from: e */
    String mo17404e();

    C3009a getType();

    void remove();
}
