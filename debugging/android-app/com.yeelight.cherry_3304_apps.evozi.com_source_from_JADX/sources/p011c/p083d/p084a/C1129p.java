package p011c.p083d.p084a;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p011c.p083d.p084a.p085d0.C1024k;

/* renamed from: c.d.a.p */
public final class C1129p {

    /* renamed from: a */
    private final String f1798a;

    /* renamed from: b */
    private final List<Certificate> f1799b;

    /* renamed from: c */
    private final List<Certificate> f1800c;

    private C1129p(String str, List<Certificate> list, List<Certificate> list2) {
        this.f1798a = str;
        this.f1799b = list;
        this.f1800c = list2;
    }

    /* renamed from: b */
    public static C1129p m2700b(String str, List<Certificate> list, List<Certificate> list2) {
        if (str != null) {
            return new C1129p(str, C1024k.m2097h(list), C1024k.m2097h(list2));
        }
        throw new IllegalArgumentException("cipherSuite == null");
    }

    /* renamed from: c */
    public static C1129p m2701c(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
                certificateArr = null;
            }
            List i = certificateArr != null ? C1024k.m2098i(certificateArr) : Collections.emptyList();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new C1129p(cipherSuite, i, localCertificates != null ? C1024k.m2098i(localCertificates) : Collections.emptyList());
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    /* renamed from: a */
    public String mo9739a() {
        return this.f1798a;
    }

    /* renamed from: d */
    public List<Certificate> mo9740d() {
        return this.f1800c;
    }

    /* renamed from: e */
    public List<Certificate> mo9741e() {
        return this.f1799b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1129p)) {
            return false;
        }
        C1129p pVar = (C1129p) obj;
        return this.f1798a.equals(pVar.f1798a) && this.f1799b.equals(pVar.f1799b) && this.f1800c.equals(pVar.f1800c);
    }

    public int hashCode() {
        return ((((527 + this.f1798a.hashCode()) * 31) + this.f1799b.hashCode()) * 31) + this.f1800c.hashCode();
    }
}
