package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.eclipse.jetty.util.security.Constraint;
import p056k5.C3300c;

/* renamed from: okhttp3.r */
public final class C3543r {

    /* renamed from: a */
    private final TlsVersion f5799a;

    /* renamed from: b */
    private final C9799h f5800b;

    /* renamed from: c */
    private final List<Certificate> f5801c;

    /* renamed from: d */
    private final List<Certificate> f5802d;

    private C3543r(TlsVersion tlsVersion, C9799h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f5799a = tlsVersion;
        this.f5800b = hVar;
        this.f5801c = list;
        this.f5802d = list2;
    }

    /* renamed from: b */
    public static C3543r m9794b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C9799h a = C9799h.m23502a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!Constraint.NONE.equals(protocol)) {
                TlsVersion forJavaName = TlsVersion.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List t = certificateArr != null ? C3300c.m8935t(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new C3543r(forJavaName, a, t, localCertificates != null ? C3300c.m8935t(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: c */
    public static C3543r m9795c(TlsVersion tlsVersion, C9799h hVar, List<Certificate> list, List<Certificate> list2) {
        Objects.requireNonNull(tlsVersion, "tlsVersion == null");
        Objects.requireNonNull(hVar, "cipherSuite == null");
        return new C3543r(tlsVersion, hVar, C3300c.m8934s(list), C3300c.m8934s(list2));
    }

    /* renamed from: a */
    public C9799h mo24538a() {
        return this.f5800b;
    }

    /* renamed from: d */
    public List<Certificate> mo24539d() {
        return this.f5802d;
    }

    /* renamed from: e */
    public List<Certificate> mo24540e() {
        return this.f5801c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C3543r)) {
            return false;
        }
        C3543r rVar = (C3543r) obj;
        return this.f5799a.equals(rVar.f5799a) && this.f5800b.equals(rVar.f5800b) && this.f5801c.equals(rVar.f5801c) && this.f5802d.equals(rVar.f5802d);
    }

    /* renamed from: f */
    public TlsVersion mo24542f() {
        return this.f5799a;
    }

    public int hashCode() {
        return ((((((527 + this.f5799a.hashCode()) * 31) + this.f5800b.hashCode()) * 31) + this.f5801c.hashCode()) * 31) + this.f5802d.hashCode();
    }
}
