package okhttp3;

import com.xiaomi.mipush.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C3546t;
import p056k5.C3300c;

/* renamed from: okhttp3.a */
public final class C3504a {

    /* renamed from: a */
    final C3546t f5606a;

    /* renamed from: b */
    final C9832o f5607b;

    /* renamed from: c */
    final SocketFactory f5608c;

    /* renamed from: d */
    final C3507b f5609d;

    /* renamed from: e */
    final List<Protocol> f5610e;

    /* renamed from: f */
    final List<C3533k> f5611f;

    /* renamed from: g */
    final ProxySelector f5612g;
    @Nullable

    /* renamed from: h */
    final Proxy f5613h;
    @Nullable

    /* renamed from: i */
    final SSLSocketFactory f5614i;
    @Nullable

    /* renamed from: j */
    final HostnameVerifier f5615j;
    @Nullable

    /* renamed from: k */
    final C3523g f5616k;

    public C3504a(String str, int i, C9832o oVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C3523g gVar, C3507b bVar, @Nullable Proxy proxy, List<Protocol> list, List<C3533k> list2, ProxySelector proxySelector) {
        this.f5606a = new C3546t.C3547a().mo24590s(sSLSocketFactory != null ? "https" : "http").mo24585g(str).mo24588n(i).mo24582c();
        Objects.requireNonNull(oVar, "dns == null");
        this.f5607b = oVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f5608c = socketFactory;
        Objects.requireNonNull(bVar, "proxyAuthenticator == null");
        this.f5609d = bVar;
        Objects.requireNonNull(list, "protocols == null");
        this.f5610e = C3300c.m8934s(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f5611f = C3300c.m8934s(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f5612g = proxySelector;
        this.f5613h = proxy;
        this.f5614i = sSLSocketFactory;
        this.f5615j = hostnameVerifier;
        this.f5616k = gVar;
    }

    @Nullable
    /* renamed from: a */
    public C3523g mo24336a() {
        return this.f5616k;
    }

    /* renamed from: b */
    public List<C3533k> mo24337b() {
        return this.f5611f;
    }

    /* renamed from: c */
    public C9832o mo24338c() {
        return this.f5607b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo24339d(C3504a aVar) {
        return this.f5607b.equals(aVar.f5607b) && this.f5609d.equals(aVar.f5609d) && this.f5610e.equals(aVar.f5610e) && this.f5611f.equals(aVar.f5611f) && this.f5612g.equals(aVar.f5612g) && C3300c.m8931p(this.f5613h, aVar.f5613h) && C3300c.m8931p(this.f5614i, aVar.f5614i) && C3300c.m8931p(this.f5615j, aVar.f5615j) && C3300c.m8931p(this.f5616k, aVar.f5616k) && mo24349l().mo24579z() == aVar.mo24349l().mo24579z();
    }

    @Nullable
    /* renamed from: e */
    public HostnameVerifier mo24340e() {
        return this.f5615j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C3504a) {
            C3504a aVar = (C3504a) obj;
            return this.f5606a.equals(aVar.f5606a) && mo24339d(aVar);
        }
    }

    /* renamed from: f */
    public List<Protocol> mo24342f() {
        return this.f5610e;
    }

    @Nullable
    /* renamed from: g */
    public Proxy mo24343g() {
        return this.f5613h;
    }

    /* renamed from: h */
    public C3507b mo24344h() {
        return this.f5609d;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f5606a.hashCode()) * 31) + this.f5607b.hashCode()) * 31) + this.f5609d.hashCode()) * 31) + this.f5610e.hashCode()) * 31) + this.f5611f.hashCode()) * 31) + this.f5612g.hashCode()) * 31;
        Proxy proxy = this.f5613h;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f5614i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f5615j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C3523g gVar = this.f5616k;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public ProxySelector mo24346i() {
        return this.f5612g;
    }

    /* renamed from: j */
    public SocketFactory mo24347j() {
        return this.f5608c;
    }

    @Nullable
    /* renamed from: k */
    public SSLSocketFactory mo24348k() {
        return this.f5614i;
    }

    /* renamed from: l */
    public C3546t mo24349l() {
        return this.f5606a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f5606a.mo24573m());
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(this.f5606a.mo24579z());
        if (this.f5613h != null) {
            sb.append(", proxy=");
            obj = this.f5613h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f5612g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
