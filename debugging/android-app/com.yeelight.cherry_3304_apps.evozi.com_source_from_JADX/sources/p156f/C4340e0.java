package p156f;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* renamed from: f.e0 */
public final class C4340e0 {

    /* renamed from: a */
    final C4317a f7628a;

    /* renamed from: b */
    final Proxy f7629b;

    /* renamed from: c */
    final InetSocketAddress f7630c;

    public C4340e0(C4317a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f7628a = aVar;
            this.f7629b = proxy;
            this.f7630c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a */
    public C4317a mo23908a() {
        return this.f7628a;
    }

    /* renamed from: b */
    public Proxy mo23909b() {
        return this.f7629b;
    }

    /* renamed from: c */
    public boolean mo23910c() {
        return this.f7628a.f7524i != null && this.f7629b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress mo23911d() {
        return this.f7630c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C4340e0) {
            C4340e0 e0Var = (C4340e0) obj;
            return e0Var.f7628a.equals(this.f7628a) && e0Var.f7629b.equals(this.f7629b) && e0Var.f7630c.equals(this.f7630c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f7628a.hashCode()) * 31) + this.f7629b.hashCode()) * 31) + this.f7630c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f7630c + "}";
    }
}
