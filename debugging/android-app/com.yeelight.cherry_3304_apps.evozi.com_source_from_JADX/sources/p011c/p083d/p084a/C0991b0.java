package p011c.p083d.p084a;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: c.d.a.b0 */
public final class C0991b0 {

    /* renamed from: a */
    final C0987a f1218a;

    /* renamed from: b */
    final Proxy f1219b;

    /* renamed from: c */
    final InetSocketAddress f1220c;

    public C0991b0(C0987a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f1218a = aVar;
            this.f1219b = proxy;
            this.f1220c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a */
    public C0987a mo9394a() {
        return this.f1218a;
    }

    /* renamed from: b */
    public Proxy mo9395b() {
        return this.f1219b;
    }

    /* renamed from: c */
    public InetSocketAddress mo9396c() {
        return this.f1220c;
    }

    /* renamed from: d */
    public boolean mo9397d() {
        return this.f1218a.f1207e != null && this.f1219b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0991b0)) {
            return false;
        }
        C0991b0 b0Var = (C0991b0) obj;
        return this.f1218a.equals(b0Var.f1218a) && this.f1219b.equals(b0Var.f1219b) && this.f1220c.equals(b0Var.f1220c);
    }

    public int hashCode() {
        return ((((527 + this.f1218a.hashCode()) * 31) + this.f1219b.hashCode()) * 31) + this.f1220c.hashCode();
    }
}
