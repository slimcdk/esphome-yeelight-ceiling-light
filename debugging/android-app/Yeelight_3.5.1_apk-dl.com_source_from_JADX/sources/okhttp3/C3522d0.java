package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;
import javax.annotation.Nullable;

/* renamed from: okhttp3.d0 */
public final class C3522d0 {

    /* renamed from: a */
    final C3504a f5703a;

    /* renamed from: b */
    final Proxy f5704b;

    /* renamed from: c */
    final InetSocketAddress f5705c;

    public C3522d0(C3504a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f5703a = aVar;
        this.f5704b = proxy;
        this.f5705c = inetSocketAddress;
    }

    /* renamed from: a */
    public C3504a mo24426a() {
        return this.f5703a;
    }

    /* renamed from: b */
    public Proxy mo24427b() {
        return this.f5704b;
    }

    /* renamed from: c */
    public boolean mo24428c() {
        return this.f5703a.f5614i != null && this.f5704b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress mo24429d() {
        return this.f5705c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C3522d0) {
            C3522d0 d0Var = (C3522d0) obj;
            return d0Var.f5703a.equals(this.f5703a) && d0Var.f5704b.equals(this.f5704b) && d0Var.f5705c.equals(this.f5705c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f5703a.hashCode()) * 31) + this.f5704b.hashCode()) * 31) + this.f5705c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f5705c + "}";
    }
}
