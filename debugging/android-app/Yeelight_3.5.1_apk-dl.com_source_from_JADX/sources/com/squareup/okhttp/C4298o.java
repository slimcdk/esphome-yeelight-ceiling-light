package com.squareup.okhttp;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.o */
public final class C4298o {

    /* renamed from: a */
    private final String f6993a;

    /* renamed from: b */
    private final List<Certificate> f6994b;

    /* renamed from: c */
    private final List<Certificate> f6995c;

    private C4298o(String str, List<Certificate> list, List<Certificate> list2) {
        this.f6993a = str;
        this.f6994b = list;
        this.f6995c = list2;
    }

    /* renamed from: b */
    public static C4298o m11980b(String str, List<Certificate> list, List<Certificate> list2) {
        if (str != null) {
            return new C4298o(str, C12033k.m31048h(list), C12033k.m31048h(list2));
        }
        throw new IllegalArgumentException("cipherSuite == null");
    }

    /* renamed from: c */
    public static C4298o m11981c(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
                certificateArr = null;
            }
            List i = certificateArr != null ? C12033k.m31049i(certificateArr) : Collections.emptyList();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new C4298o(cipherSuite, i, localCertificates != null ? C12033k.m31049i(localCertificates) : Collections.emptyList());
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    /* renamed from: a */
    public String mo27926a() {
        return this.f6993a;
    }

    /* renamed from: d */
    public List<Certificate> mo27927d() {
        return this.f6995c;
    }

    /* renamed from: e */
    public List<Certificate> mo27928e() {
        return this.f6994b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4298o)) {
            return false;
        }
        C4298o oVar = (C4298o) obj;
        return this.f6993a.equals(oVar.f6993a) && this.f6994b.equals(oVar.f6994b) && this.f6995c.equals(oVar.f6995c);
    }

    public int hashCode() {
        return ((((527 + this.f6993a.hashCode()) * 31) + this.f6994b.hashCode()) * 31) + this.f6995c.hashCode();
    }
}
