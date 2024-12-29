package com.squareup.okhttp;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.a */
public final class C4268a {

    /* renamed from: a */
    final Proxy f6879a;

    /* renamed from: b */
    final String f6880b;

    /* renamed from: c */
    final int f6881c;

    /* renamed from: d */
    final SocketFactory f6882d;

    /* renamed from: e */
    final SSLSocketFactory f6883e;

    /* renamed from: f */
    final HostnameVerifier f6884f;

    /* renamed from: g */
    final C4285g f6885g;

    /* renamed from: h */
    final C4269b f6886h;

    /* renamed from: i */
    final List<Protocol> f6887i;

    /* renamed from: j */
    final List<C4292k> f6888j;

    /* renamed from: k */
    final ProxySelector f6889k;

    public C4268a(String str, int i, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C4285g gVar, C4269b bVar, Proxy proxy, List<Protocol> list, List<C4292k> list2, ProxySelector proxySelector) {
        Objects.requireNonNull(str, "uriHost == null");
        if (i <= 0) {
            throw new IllegalArgumentException("uriPort <= 0: " + i);
        } else if (bVar == null) {
            throw new IllegalArgumentException("authenticator == null");
        } else if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        } else if (proxySelector != null) {
            this.f6879a = proxy;
            this.f6880b = str;
            this.f6881c = i;
            this.f6882d = socketFactory;
            this.f6883e = sSLSocketFactory;
            this.f6884f = hostnameVerifier;
            this.f6885g = gVar;
            this.f6886h = bVar;
            this.f6887i = C12033k.m31048h(list);
            this.f6888j = C12033k.m31048h(list2);
            this.f6889k = proxySelector;
        } else {
            throw new IllegalArgumentException("proxySelector == null");
        }
    }

    /* renamed from: a */
    public C4269b mo27812a() {
        return this.f6886h;
    }

    /* renamed from: b */
    public C4285g mo27813b() {
        return this.f6885g;
    }

    /* renamed from: c */
    public List<C4292k> mo27814c() {
        return this.f6888j;
    }

    /* renamed from: d */
    public HostnameVerifier mo27815d() {
        return this.f6884f;
    }

    /* renamed from: e */
    public List<Protocol> mo27816e() {
        return this.f6887i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4268a)) {
            return false;
        }
        C4268a aVar = (C4268a) obj;
        return C12033k.m31046f(this.f6879a, aVar.f6879a) && this.f6880b.equals(aVar.f6880b) && this.f6881c == aVar.f6881c && C12033k.m31046f(this.f6883e, aVar.f6883e) && C12033k.m31046f(this.f6884f, aVar.f6884f) && C12033k.m31046f(this.f6885g, aVar.f6885g) && C12033k.m31046f(this.f6886h, aVar.f6886h) && C12033k.m31046f(this.f6887i, aVar.f6887i) && C12033k.m31046f(this.f6888j, aVar.f6888j) && C12033k.m31046f(this.f6889k, aVar.f6889k);
    }

    /* renamed from: f */
    public Proxy mo27818f() {
        return this.f6879a;
    }

    /* renamed from: g */
    public ProxySelector mo27819g() {
        return this.f6889k;
    }

    /* renamed from: h */
    public SocketFactory mo27820h() {
        return this.f6882d;
    }

    public int hashCode() {
        Proxy proxy = this.f6879a;
        int i = 0;
        int hashCode = (((((527 + (proxy != null ? proxy.hashCode() : 0)) * 31) + this.f6880b.hashCode()) * 31) + this.f6881c) * 31;
        SSLSocketFactory sSLSocketFactory = this.f6883e;
        int hashCode2 = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f6884f;
        int hashCode3 = (hashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C4285g gVar = this.f6885g;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return ((((((((hashCode3 + i) * 31) + this.f6886h.hashCode()) * 31) + this.f6887i.hashCode()) * 31) + this.f6888j.hashCode()) * 31) + this.f6889k.hashCode();
    }

    /* renamed from: i */
    public SSLSocketFactory mo27822i() {
        return this.f6883e;
    }

    /* renamed from: j */
    public String mo27823j() {
        return this.f6880b;
    }

    /* renamed from: k */
    public int mo27824k() {
        return this.f6881c;
    }
}
