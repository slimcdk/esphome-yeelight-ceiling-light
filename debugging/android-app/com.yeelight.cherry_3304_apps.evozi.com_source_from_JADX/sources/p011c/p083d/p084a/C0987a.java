package p011c.p083d.p084a;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p011c.p083d.p084a.p085d0.C1024k;

/* renamed from: c.d.a.a */
public final class C0987a {

    /* renamed from: a */
    final Proxy f1203a;

    /* renamed from: b */
    final String f1204b;

    /* renamed from: c */
    final int f1205c;

    /* renamed from: d */
    final SocketFactory f1206d;

    /* renamed from: e */
    final SSLSocketFactory f1207e;

    /* renamed from: f */
    final HostnameVerifier f1208f;

    /* renamed from: g */
    final C1115g f1209g;

    /* renamed from: h */
    final C0990b f1210h;

    /* renamed from: i */
    final List<C1143w> f1211i;

    /* renamed from: j */
    final List<C1123l> f1212j;

    /* renamed from: k */
    final ProxySelector f1213k;

    public C0987a(String str, int i, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1115g gVar, C0990b bVar, Proxy proxy, List<C1143w> list, List<C1123l> list2, ProxySelector proxySelector) {
        if (str == null) {
            throw new NullPointerException("uriHost == null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("uriPort <= 0: " + i);
        } else if (bVar == null) {
            throw new IllegalArgumentException("authenticator == null");
        } else if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        } else if (proxySelector != null) {
            this.f1203a = proxy;
            this.f1204b = str;
            this.f1205c = i;
            this.f1206d = socketFactory;
            this.f1207e = sSLSocketFactory;
            this.f1208f = hostnameVerifier;
            this.f1209g = gVar;
            this.f1210h = bVar;
            this.f1211i = C1024k.m2097h(list);
            this.f1212j = C1024k.m2097h(list2);
            this.f1213k = proxySelector;
        } else {
            throw new IllegalArgumentException("proxySelector == null");
        }
    }

    /* renamed from: a */
    public C0990b mo9371a() {
        return this.f1210h;
    }

    /* renamed from: b */
    public C1115g mo9372b() {
        return this.f1209g;
    }

    /* renamed from: c */
    public List<C1123l> mo9373c() {
        return this.f1212j;
    }

    /* renamed from: d */
    public HostnameVerifier mo9374d() {
        return this.f1208f;
    }

    /* renamed from: e */
    public List<C1143w> mo9375e() {
        return this.f1211i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0987a)) {
            return false;
        }
        C0987a aVar = (C0987a) obj;
        return C1024k.m2095f(this.f1203a, aVar.f1203a) && this.f1204b.equals(aVar.f1204b) && this.f1205c == aVar.f1205c && C1024k.m2095f(this.f1207e, aVar.f1207e) && C1024k.m2095f(this.f1208f, aVar.f1208f) && C1024k.m2095f(this.f1209g, aVar.f1209g) && C1024k.m2095f(this.f1210h, aVar.f1210h) && C1024k.m2095f(this.f1211i, aVar.f1211i) && C1024k.m2095f(this.f1212j, aVar.f1212j) && C1024k.m2095f(this.f1213k, aVar.f1213k);
    }

    /* renamed from: f */
    public Proxy mo9377f() {
        return this.f1203a;
    }

    /* renamed from: g */
    public ProxySelector mo9378g() {
        return this.f1213k;
    }

    /* renamed from: h */
    public SocketFactory mo9379h() {
        return this.f1206d;
    }

    public int hashCode() {
        Proxy proxy = this.f1203a;
        int i = 0;
        int hashCode = (((((527 + (proxy != null ? proxy.hashCode() : 0)) * 31) + this.f1204b.hashCode()) * 31) + this.f1205c) * 31;
        SSLSocketFactory sSLSocketFactory = this.f1207e;
        int hashCode2 = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f1208f;
        int hashCode3 = (hashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C1115g gVar = this.f1209g;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return ((((((((hashCode3 + i) * 31) + this.f1210h.hashCode()) * 31) + this.f1211i.hashCode()) * 31) + this.f1212j.hashCode()) * 31) + this.f1213k.hashCode();
    }

    /* renamed from: i */
    public SSLSocketFactory mo9381i() {
        return this.f1207e;
    }

    /* renamed from: j */
    public String mo9382j() {
        return this.f1204b;
    }

    /* renamed from: k */
    public int mo9383k() {
        return this.f1205c;
    }
}
