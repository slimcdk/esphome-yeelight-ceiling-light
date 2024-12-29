package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* renamed from: com.squareup.okhttp.z */
public final class C4323z {

    /* renamed from: a */
    final C4268a f7106a;

    /* renamed from: b */
    final Proxy f7107b;

    /* renamed from: c */
    final InetSocketAddress f7108c;

    public C4323z(C4268a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f7106a = aVar;
        this.f7107b = proxy;
        this.f7108c = inetSocketAddress;
    }

    /* renamed from: a */
    public C4268a mo28090a() {
        return this.f7106a;
    }

    /* renamed from: b */
    public Proxy mo28091b() {
        return this.f7107b;
    }

    /* renamed from: c */
    public InetSocketAddress mo28092c() {
        return this.f7108c;
    }

    /* renamed from: d */
    public boolean mo28093d() {
        return this.f7106a.f6883e != null && this.f7107b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4323z)) {
            return false;
        }
        C4323z zVar = (C4323z) obj;
        return this.f7106a.equals(zVar.f7106a) && this.f7107b.equals(zVar.f7107b) && this.f7108c.equals(zVar.f7108c);
    }

    public int hashCode() {
        return ((((527 + this.f7106a.hashCode()) * 31) + this.f7107b.hashCode()) * 31) + this.f7108c.hashCode();
    }
}
