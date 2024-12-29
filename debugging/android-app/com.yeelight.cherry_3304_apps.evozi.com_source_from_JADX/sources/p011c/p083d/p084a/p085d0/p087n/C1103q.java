package p011c.p083d.p084a.p085d0.p087n;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p011c.p083d.p084a.C0987a;
import p011c.p083d.p084a.C0991b0;
import p011c.p083d.p084a.C1133r;
import p011c.p083d.p084a.C1141v;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.p085d0.C1013d;
import p011c.p083d.p084a.p085d0.C1016g;
import p011c.p083d.p084a.p085d0.C1023j;

/* renamed from: c.d.a.d0.n.q */
public final class C1103q {

    /* renamed from: a */
    private final C0987a f1620a;

    /* renamed from: b */
    private final C1133r f1621b;

    /* renamed from: c */
    private final C1016g f1622c;

    /* renamed from: d */
    private final C1141v f1623d;

    /* renamed from: e */
    private final C1023j f1624e;

    /* renamed from: f */
    private Proxy f1625f;

    /* renamed from: g */
    private InetSocketAddress f1626g;

    /* renamed from: h */
    private List<Proxy> f1627h = Collections.emptyList();

    /* renamed from: i */
    private int f1628i;

    /* renamed from: j */
    private List<InetSocketAddress> f1629j = Collections.emptyList();

    /* renamed from: k */
    private int f1630k;

    /* renamed from: l */
    private final List<C0991b0> f1631l = new ArrayList();

    private C1103q(C0987a aVar, C1133r rVar, C1141v vVar) {
        this.f1620a = aVar;
        this.f1621b = rVar;
        this.f1623d = vVar;
        this.f1624e = C1013d.f1321b.mo9462l(vVar);
        this.f1622c = C1013d.f1321b.mo9458h(vVar);
        m2563m(rVar, aVar.mo9377f());
    }

    /* renamed from: b */
    public static C1103q m2554b(C0987a aVar, C1144x xVar, C1141v vVar) {
        return new C1103q(aVar, xVar.mo9838k(), vVar);
    }

    /* renamed from: c */
    static String m2555c(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* renamed from: e */
    private boolean m2556e() {
        return this.f1630k < this.f1629j.size();
    }

    /* renamed from: f */
    private boolean m2557f() {
        return !this.f1631l.isEmpty();
    }

    /* renamed from: g */
    private boolean m2558g() {
        return this.f1628i < this.f1627h.size();
    }

    /* renamed from: i */
    private InetSocketAddress m2559i() {
        if (m2556e()) {
            List<InetSocketAddress> list = this.f1629j;
            int i = this.f1630k;
            this.f1630k = i + 1;
            return list.get(i);
        }
        throw new SocketException("No route to " + this.f1620a.mo9382j() + "; exhausted inet socket addresses: " + this.f1629j);
    }

    /* renamed from: j */
    private C0991b0 m2560j() {
        return this.f1631l.remove(0);
    }

    /* renamed from: k */
    private Proxy m2561k() {
        if (m2558g()) {
            List<Proxy> list = this.f1627h;
            int i = this.f1628i;
            this.f1628i = i + 1;
            Proxy proxy = list.get(i);
            m2562l(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f1620a.mo9382j() + "; exhausted proxy configurations: " + this.f1627h);
    }

    /* renamed from: l */
    private void m2562l(Proxy proxy) {
        int i;
        String str;
        this.f1629j = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f1620a.mo9382j();
            i = this.f1620a.mo9383k();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m2555c(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + Constants.COLON_SEPARATOR + i + "; port is out of range");
        }
        for (InetAddress inetSocketAddress2 : this.f1622c.mo9467a(str)) {
            this.f1629j.add(new InetSocketAddress(inetSocketAddress2, i));
        }
        this.f1630k = 0;
    }

    /* renamed from: m */
    private void m2563m(C1133r rVar, Proxy proxy) {
        if (proxy != null) {
            this.f1627h = Collections.singletonList(proxy);
        } else {
            this.f1627h = new ArrayList();
            List<Proxy> select = this.f1623d.mo9827v().select(rVar.mo9762F());
            if (select != null) {
                this.f1627h.addAll(select);
            }
            this.f1627h.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f1627h.add(Proxy.NO_PROXY);
        }
        this.f1628i = 0;
    }

    /* renamed from: a */
    public void mo9654a(C0991b0 b0Var, IOException iOException) {
        if (!(b0Var.mo9395b().type() == Proxy.Type.DIRECT || this.f1620a.mo9378g() == null)) {
            this.f1620a.mo9378g().connectFailed(this.f1621b.mo9762F(), b0Var.mo9395b().address(), iOException);
        }
        this.f1624e.mo9483b(b0Var);
    }

    /* renamed from: d */
    public boolean mo9655d() {
        return m2556e() || m2558g() || m2557f();
    }

    /* renamed from: h */
    public C0991b0 mo9656h() {
        if (!m2556e()) {
            if (m2558g()) {
                this.f1625f = m2561k();
            } else if (m2557f()) {
                return m2560j();
            } else {
                throw new NoSuchElementException();
            }
        }
        InetSocketAddress i = m2559i();
        this.f1626g = i;
        C0991b0 b0Var = new C0991b0(this.f1620a, this.f1625f, i);
        if (!this.f1624e.mo9484c(b0Var)) {
            return b0Var;
        }
        this.f1631l.add(b0Var);
        return mo9656h();
    }
}
