package p156f;

import com.xiaomi.mipush.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p156f.C4390t;
import p156f.p157g0.C4345c;

/* renamed from: f.a */
public final class C4317a {

    /* renamed from: a */
    final C4390t f7516a;

    /* renamed from: b */
    final C10831o f7517b;

    /* renamed from: c */
    final SocketFactory f7518c;

    /* renamed from: d */
    final C4320b f7519d;

    /* renamed from: e */
    final List<C10835y> f7520e;

    /* renamed from: f */
    final List<C4377k> f7521f;

    /* renamed from: g */
    final ProxySelector f7522g;
    @Nullable

    /* renamed from: h */
    final Proxy f7523h;
    @Nullable

    /* renamed from: i */
    final SSLSocketFactory f7524i;
    @Nullable

    /* renamed from: j */
    final HostnameVerifier f7525j;
    @Nullable

    /* renamed from: k */
    final C4341g f7526k;

    public C4317a(String str, int i, C10831o oVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C4341g gVar, C4320b bVar, @Nullable Proxy proxy, List<C10835y> list, List<C4377k> list2, ProxySelector proxySelector) {
        C4390t.C4391a aVar = new C4390t.C4391a();
        aVar.mo24131s(sSLSocketFactory != null ? "https" : "http");
        aVar.mo24126g(str);
        aVar.mo24129n(i);
        this.f7516a = aVar.mo24123c();
        if (oVar != null) {
            this.f7517b = oVar;
            if (socketFactory != null) {
                this.f7518c = socketFactory;
                if (bVar != null) {
                    this.f7519d = bVar;
                    if (list != null) {
                        this.f7520e = C4345c.m12373t(list);
                        if (list2 != null) {
                            this.f7521f = C4345c.m12373t(list2);
                            if (proxySelector != null) {
                                this.f7522g = proxySelector;
                                this.f7523h = proxy;
                                this.f7524i = sSLSocketFactory;
                                this.f7525j = hostnameVerifier;
                                this.f7526k = gVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    @Nullable
    /* renamed from: a */
    public C4341g mo23792a() {
        return this.f7526k;
    }

    /* renamed from: b */
    public List<C4377k> mo23793b() {
        return this.f7521f;
    }

    /* renamed from: c */
    public C10831o mo23794c() {
        return this.f7517b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo23795d(C4317a aVar) {
        return this.f7517b.equals(aVar.f7517b) && this.f7519d.equals(aVar.f7519d) && this.f7520e.equals(aVar.f7520e) && this.f7521f.equals(aVar.f7521f) && this.f7522g.equals(aVar.f7522g) && C4345c.m12370q(this.f7523h, aVar.f7523h) && C4345c.m12370q(this.f7524i, aVar.f7524i) && C4345c.m12370q(this.f7525j, aVar.f7525j) && C4345c.m12370q(this.f7526k, aVar.f7526k) && mo23805l().mo24120z() == aVar.mo23805l().mo24120z();
    }

    @Nullable
    /* renamed from: e */
    public HostnameVerifier mo23796e() {
        return this.f7525j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C4317a) {
            C4317a aVar = (C4317a) obj;
            return this.f7516a.equals(aVar.f7516a) && mo23795d(aVar);
        }
    }

    /* renamed from: f */
    public List<C10835y> mo23798f() {
        return this.f7520e;
    }

    @Nullable
    /* renamed from: g */
    public Proxy mo23799g() {
        return this.f7523h;
    }

    /* renamed from: h */
    public C4320b mo23800h() {
        return this.f7519d;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f7516a.hashCode()) * 31) + this.f7517b.hashCode()) * 31) + this.f7519d.hashCode()) * 31) + this.f7520e.hashCode()) * 31) + this.f7521f.hashCode()) * 31) + this.f7522g.hashCode()) * 31;
        Proxy proxy = this.f7523h;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f7524i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f7525j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C4341g gVar = this.f7526k;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public ProxySelector mo23802i() {
        return this.f7522g;
    }

    /* renamed from: j */
    public SocketFactory mo23803j() {
        return this.f7518c;
    }

    @Nullable
    /* renamed from: k */
    public SSLSocketFactory mo23804k() {
        return this.f7524i;
    }

    /* renamed from: l */
    public C4390t mo23805l() {
        return this.f7516a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f7516a.mo24114m());
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(this.f7516a.mo24120z());
        if (this.f7523h != null) {
            sb.append(", proxy=");
            obj = this.f7523h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f7522g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
