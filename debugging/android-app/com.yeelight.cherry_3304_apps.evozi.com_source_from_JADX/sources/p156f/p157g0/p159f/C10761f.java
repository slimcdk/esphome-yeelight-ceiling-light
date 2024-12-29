package p156f.p157g0.p159f;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p156f.C4317a;
import p156f.C4338e;
import p156f.C4340e0;
import p156f.C4381p;
import p156f.C4390t;
import p156f.p157g0.C4345c;

/* renamed from: f.g0.f.f */
public final class C10761f {

    /* renamed from: a */
    private final C4317a f20644a;

    /* renamed from: b */
    private final C10759d f20645b;

    /* renamed from: c */
    private final C4338e f20646c;

    /* renamed from: d */
    private final C4381p f20647d;

    /* renamed from: e */
    private List<Proxy> f20648e = Collections.emptyList();

    /* renamed from: f */
    private int f20649f;

    /* renamed from: g */
    private List<InetSocketAddress> f20650g = Collections.emptyList();

    /* renamed from: h */
    private final List<C4340e0> f20651h = new ArrayList();

    /* renamed from: f.g0.f.f$a */
    public static final class C10762a {

        /* renamed from: a */
        private final List<C4340e0> f20652a;

        /* renamed from: b */
        private int f20653b = 0;

        C10762a(List<C4340e0> list) {
            this.f20652a = list;
        }

        /* renamed from: a */
        public List<C4340e0> mo33998a() {
            return new ArrayList(this.f20652a);
        }

        /* renamed from: b */
        public boolean mo33999b() {
            return this.f20653b < this.f20652a.size();
        }

        /* renamed from: c */
        public C4340e0 mo34000c() {
            if (mo33999b()) {
                List<C4340e0> list = this.f20652a;
                int i = this.f20653b;
                this.f20653b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public C10761f(C4317a aVar, C10759d dVar, C4338e eVar, C4381p pVar) {
        this.f20644a = aVar;
        this.f20645b = dVar;
        this.f20646c = eVar;
        this.f20647d = pVar;
        m26647h(aVar.mo23805l(), aVar.mo23799g());
    }

    /* renamed from: b */
    static String m26643b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* renamed from: d */
    private boolean m26644d() {
        return this.f20649f < this.f20648e.size();
    }

    /* renamed from: f */
    private Proxy m26645f() {
        if (m26644d()) {
            List<Proxy> list = this.f20648e;
            int i = this.f20649f;
            this.f20649f = i + 1;
            Proxy proxy = list.get(i);
            m26646g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f20644a.mo23805l().mo24114m() + "; exhausted proxy configurations: " + this.f20648e);
    }

    /* renamed from: g */
    private void m26646g(Proxy proxy) {
        String str;
        int i;
        this.f20650g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f20644a.mo23805l().mo24114m();
            i = this.f20644a.mo23805l().mo24120z();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m26643b(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + Constants.COLON_SEPARATOR + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f20650g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f20647d.mo24064j(this.f20646c, str);
            List<InetAddress> a = this.f20644a.mo23794c().mo34159a(str);
            if (!a.isEmpty()) {
                this.f20647d.mo24063i(this.f20646c, str, a);
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f20650g.add(new InetSocketAddress(a.get(i2), i));
                }
                return;
            }
            throw new UnknownHostException(this.f20644a.mo23794c() + " returned no addresses for " + str);
        }
    }

    /* renamed from: h */
    private void m26647h(C4390t tVar, Proxy proxy) {
        List<Proxy> u;
        if (proxy != null) {
            u = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f20644a.mo23802i().select(tVar.mo24105F());
            if (select == null || select.isEmpty()) {
                u = C4345c.m12374u(Proxy.NO_PROXY);
            } else {
                u = C4345c.m12373t(select);
            }
        }
        this.f20648e = u;
        this.f20649f = 0;
    }

    /* renamed from: a */
    public void mo33995a(C4340e0 e0Var, IOException iOException) {
        if (!(e0Var.mo23909b().type() == Proxy.Type.DIRECT || this.f20644a.mo23802i() == null)) {
            this.f20644a.mo23802i().connectFailed(this.f20644a.mo23805l().mo24105F(), e0Var.mo23909b().address(), iOException);
        }
        this.f20645b.mo33990b(e0Var);
    }

    /* renamed from: c */
    public boolean mo33996c() {
        return m26644d() || !this.f20651h.isEmpty();
    }

    /* renamed from: e */
    public C10762a mo33997e() {
        if (mo33996c()) {
            ArrayList arrayList = new ArrayList();
            while (m26644d()) {
                Proxy f = m26645f();
                int size = this.f20650g.size();
                for (int i = 0; i < size; i++) {
                    C4340e0 e0Var = new C4340e0(this.f20644a, f, this.f20650g.get(i));
                    if (this.f20645b.mo33991c(e0Var)) {
                        this.f20651h.add(e0Var);
                    } else {
                        arrayList.add(e0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f20651h);
                this.f20651h.clear();
            }
            return new C10762a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
