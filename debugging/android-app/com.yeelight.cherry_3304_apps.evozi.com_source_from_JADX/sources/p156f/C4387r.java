package p156f;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p156f.p157g0.C4345c;

/* renamed from: f.r */
public final class C4387r {

    /* renamed from: a */
    private final C10749f0 f7826a;

    /* renamed from: b */
    private final C10827h f7827b;

    /* renamed from: c */
    private final List<Certificate> f7828c;

    /* renamed from: d */
    private final List<Certificate> f7829d;

    private C4387r(C10749f0 f0Var, C10827h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f7826a = f0Var;
        this.f7827b = hVar;
        this.f7828c = list;
        this.f7829d = list2;
    }

    /* renamed from: b */
    public static C4387r m12593b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C10827h a = C10827h.m26955a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C10749f0 a2 = C10749f0.m26610a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List u = certificateArr != null ? C4345c.m12374u(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new C4387r(a2, a, u, localCertificates != null ? C4345c.m12374u(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: c */
    public static C4387r m12594c(C10749f0 f0Var, C10827h hVar, List<Certificate> list, List<Certificate> list2) {
        if (f0Var == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (hVar != null) {
            return new C4387r(f0Var, hVar, C4345c.m12373t(list), C4345c.m12373t(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    /* renamed from: a */
    public C10827h mo24079a() {
        return this.f7827b;
    }

    /* renamed from: d */
    public List<Certificate> mo24080d() {
        return this.f7829d;
    }

    /* renamed from: e */
    public List<Certificate> mo24081e() {
        return this.f7828c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C4387r)) {
            return false;
        }
        C4387r rVar = (C4387r) obj;
        return this.f7826a.equals(rVar.f7826a) && this.f7827b.equals(rVar.f7827b) && this.f7828c.equals(rVar.f7828c) && this.f7829d.equals(rVar.f7829d);
    }

    /* renamed from: f */
    public C10749f0 mo24083f() {
        return this.f7826a;
    }

    public int hashCode() {
        return ((((((527 + this.f7826a.hashCode()) * 31) + this.f7827b.hashCode()) * 31) + this.f7828c.hashCode()) * 31) + this.f7829d.hashCode();
    }
}
