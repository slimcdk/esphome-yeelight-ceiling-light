package p123a3;

import com.squareup.okhttp.C4268a;
import com.squareup.okhttp.C4302q;
import com.squareup.okhttp.C4310u;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4323z;
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
import p231y2.C12022d;
import p231y2.C12025g;
import p231y2.C12032j;

/* renamed from: a3.o */
public final class C3960o {

    /* renamed from: a */
    private final C4268a f6675a;

    /* renamed from: b */
    private final C4302q f6676b;

    /* renamed from: c */
    private final C12025g f6677c;

    /* renamed from: d */
    private final C4310u f6678d;

    /* renamed from: e */
    private final C12032j f6679e;

    /* renamed from: f */
    private Proxy f6680f;

    /* renamed from: g */
    private InetSocketAddress f6681g;

    /* renamed from: h */
    private List<Proxy> f6682h = Collections.emptyList();

    /* renamed from: i */
    private int f6683i;

    /* renamed from: j */
    private List<InetSocketAddress> f6684j = Collections.emptyList();

    /* renamed from: k */
    private int f6685k;

    /* renamed from: l */
    private final List<C4323z> f6686l = new ArrayList();

    private C3960o(C4268a aVar, C4302q qVar, C4310u uVar) {
        this.f6675a = aVar;
        this.f6676b = qVar;
        this.f6678d = uVar;
        this.f6679e = C12022d.f22043b.mo28029l(uVar);
        this.f6677c = C12022d.f22043b.mo28025h(uVar);
        m11417m(qVar, aVar.mo27818f());
    }

    /* renamed from: b */
    public static C3960o m11408b(C4268a aVar, C4312v vVar, C4310u uVar) {
        return new C3960o(aVar, vVar.mo28037k(), uVar);
    }

    /* renamed from: c */
    static String m11409c(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* renamed from: e */
    private boolean m11410e() {
        return this.f6685k < this.f6684j.size();
    }

    /* renamed from: f */
    private boolean m11411f() {
        return !this.f6686l.isEmpty();
    }

    /* renamed from: g */
    private boolean m11412g() {
        return this.f6683i < this.f6682h.size();
    }

    /* renamed from: i */
    private InetSocketAddress m11413i() {
        if (m11410e()) {
            List<InetSocketAddress> list = this.f6684j;
            int i = this.f6685k;
            this.f6685k = i + 1;
            return list.get(i);
        }
        throw new SocketException("No route to " + this.f6675a.mo27823j() + "; exhausted inet socket addresses: " + this.f6684j);
    }

    /* renamed from: j */
    private C4323z m11414j() {
        return this.f6686l.remove(0);
    }

    /* renamed from: k */
    private Proxy m11415k() {
        if (m11412g()) {
            List<Proxy> list = this.f6682h;
            int i = this.f6683i;
            this.f6683i = i + 1;
            Proxy proxy = list.get(i);
            m11416l(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f6675a.mo27823j() + "; exhausted proxy configurations: " + this.f6682h);
    }

    /* renamed from: l */
    private void m11416l(Proxy proxy) {
        int i;
        String str;
        this.f6684j = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f6675a.mo27823j();
            i = this.f6675a.mo27824k();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m11409c(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + Constants.COLON_SEPARATOR + i + "; port is out of range");
        }
        for (InetAddress inetSocketAddress2 : this.f6677c.mo42643a(str)) {
            this.f6684j.add(new InetSocketAddress(inetSocketAddress2, i));
        }
        this.f6685k = 0;
    }

    /* renamed from: m */
    private void m11417m(C4302q qVar, Proxy proxy) {
        if (proxy != null) {
            this.f6682h = Collections.singletonList(proxy);
        } else {
            this.f6682h = new ArrayList();
            List<Proxy> select = this.f6678d.mo28014u().select(qVar.mo27949F());
            if (select != null) {
                this.f6682h.addAll(select);
            }
            this.f6682h.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f6682h.add(Proxy.NO_PROXY);
        }
        this.f6683i = 0;
    }

    /* renamed from: a */
    public void mo26489a(C4323z zVar, IOException iOException) {
        if (!(zVar.mo28091b().type() == Proxy.Type.DIRECT || this.f6675a.mo27819g() == null)) {
            this.f6675a.mo27819g().connectFailed(this.f6676b.mo27949F(), zVar.mo28091b().address(), iOException);
        }
        this.f6679e.mo42659b(zVar);
    }

    /* renamed from: d */
    public boolean mo26490d() {
        return m11410e() || m11412g() || m11411f();
    }

    /* renamed from: h */
    public C4323z mo26491h() {
        if (!m11410e()) {
            if (m11412g()) {
                this.f6680f = m11415k();
            } else if (m11411f()) {
                return m11414j();
            } else {
                throw new NoSuchElementException();
            }
        }
        InetSocketAddress i = m11413i();
        this.f6681g = i;
        C4323z zVar = new C4323z(this.f6675a, this.f6680f, i);
        if (!this.f6679e.mo42660c(zVar)) {
            return zVar;
        }
        this.f6686l.add(zVar);
        return mo26491h();
    }
}
