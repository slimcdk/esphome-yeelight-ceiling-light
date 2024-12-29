package p186m5;

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
import okhttp3.C3504a;
import okhttp3.C3522d0;
import okhttp3.C3537p;
import okhttp3.C3546t;
import okhttp3.C9796e;
import p056k5.C3300c;

/* renamed from: m5.d */
public final class C9552d {

    /* renamed from: a */
    private final C3504a f17431a;

    /* renamed from: b */
    private final C9551c f17432b;

    /* renamed from: c */
    private final C9796e f17433c;

    /* renamed from: d */
    private final C3537p f17434d;

    /* renamed from: e */
    private List<Proxy> f17435e = Collections.emptyList();

    /* renamed from: f */
    private int f17436f;

    /* renamed from: g */
    private List<InetSocketAddress> f17437g = Collections.emptyList();

    /* renamed from: h */
    private final List<C3522d0> f17438h = new ArrayList();

    /* renamed from: m5.d$a */
    public static final class C9553a {

        /* renamed from: a */
        private final List<C3522d0> f17439a;

        /* renamed from: b */
        private int f17440b = 0;

        C9553a(List<C3522d0> list) {
            this.f17439a = list;
        }

        /* renamed from: a */
        public List<C3522d0> mo38518a() {
            return new ArrayList(this.f17439a);
        }

        /* renamed from: b */
        public boolean mo38519b() {
            return this.f17440b < this.f17439a.size();
        }

        /* renamed from: c */
        public C3522d0 mo38520c() {
            if (mo38519b()) {
                List<C3522d0> list = this.f17439a;
                int i = this.f17440b;
                this.f17440b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public C9552d(C3504a aVar, C9551c cVar, C9796e eVar, C3537p pVar) {
        this.f17431a = aVar;
        this.f17432b = cVar;
        this.f17433c = eVar;
        this.f17434d = pVar;
        m23231h(aVar.mo24349l(), aVar.mo24343g());
    }

    /* renamed from: b */
    static String m23227b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* renamed from: d */
    private boolean m23228d() {
        return this.f17436f < this.f17435e.size();
    }

    /* renamed from: f */
    private Proxy m23229f() {
        if (m23228d()) {
            List<Proxy> list = this.f17435e;
            int i = this.f17436f;
            this.f17436f = i + 1;
            Proxy proxy = list.get(i);
            m23230g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f17431a.mo24349l().mo24573m() + "; exhausted proxy configurations: " + this.f17435e);
    }

    /* renamed from: g */
    private void m23230g(Proxy proxy) {
        String str;
        int i;
        this.f17437g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f17431a.mo24349l().mo24573m();
            i = this.f17431a.mo24349l().mo24579z();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m23227b(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + Constants.COLON_SEPARATOR + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f17437g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f17434d.mo24523j(this.f17433c, str);
            List<InetAddress> a = this.f17431a.mo24338c().mo39079a(str);
            if (!a.isEmpty()) {
                this.f17434d.mo24522i(this.f17433c, str, a);
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f17437g.add(new InetSocketAddress(a.get(i2), i));
                }
                return;
            }
            throw new UnknownHostException(this.f17431a.mo24338c() + " returned no addresses for " + str);
        }
    }

    /* renamed from: h */
    private void m23231h(C3546t tVar, Proxy proxy) {
        List<Proxy> t;
        if (proxy != null) {
            t = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f17431a.mo24346i().select(tVar.mo24564F());
            if (select == null || select.isEmpty()) {
                t = C3300c.m8935t(Proxy.NO_PROXY);
            } else {
                t = C3300c.m8934s(select);
            }
        }
        this.f17435e = t;
        this.f17436f = 0;
    }

    /* renamed from: a */
    public void mo38515a(C3522d0 d0Var, IOException iOException) {
        if (!(d0Var.mo24427b().type() == Proxy.Type.DIRECT || this.f17431a.mo24346i() == null)) {
            this.f17431a.mo24346i().connectFailed(this.f17431a.mo24349l().mo24564F(), d0Var.mo24427b().address(), iOException);
        }
        this.f17432b.mo38513b(d0Var);
    }

    /* renamed from: c */
    public boolean mo38516c() {
        return m23228d() || !this.f17438h.isEmpty();
    }

    /* renamed from: e */
    public C9553a mo38517e() {
        if (mo38516c()) {
            ArrayList arrayList = new ArrayList();
            while (m23228d()) {
                Proxy f = m23229f();
                int size = this.f17437g.size();
                for (int i = 0; i < size; i++) {
                    C3522d0 d0Var = new C3522d0(this.f17431a, f, this.f17437g.get(i));
                    if (this.f17432b.mo38514c(d0Var)) {
                        this.f17438h.add(d0Var);
                    } else {
                        arrayList.add(d0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f17438h);
                this.f17438h.clear();
            }
            return new C9553a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
