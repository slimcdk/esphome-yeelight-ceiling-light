package okhttp3;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.C3509b0;
import okhttp3.C3537p;
import okhttp3.C3544s;
import okhttp3.C9796e;
import okhttp3.internal.connection.C3526a;
import p056k5.C3299a;
import p056k5.C3300c;
import p063l5.C9534f;
import p092r5.C3636f;
import p186m5.C9551c;
import p186m5.C9554e;
import p209s5.C10372a;
import p213t5.C10398c;
import p213t5.C10399d;

/* renamed from: okhttp3.x */
public class C3552x implements Cloneable, C9796e.C9797a {

    /* renamed from: C */
    static final List<Protocol> f5842C = C3300c.m8935t(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: Q */
    static final List<C3533k> f5843Q = C3300c.m8935t(C3533k.f5761g, C3533k.f5762h);

    /* renamed from: A */
    final int f5844A;

    /* renamed from: B */
    final int f5845B;

    /* renamed from: a */
    final C3536n f5846a;
    @Nullable

    /* renamed from: b */
    final Proxy f5847b;

    /* renamed from: c */
    final List<Protocol> f5848c;

    /* renamed from: d */
    final List<C3533k> f5849d;

    /* renamed from: e */
    final List<C9834u> f5850e;

    /* renamed from: f */
    final List<C9834u> f5851f;

    /* renamed from: g */
    final C3537p.C3540c f5852g;

    /* renamed from: h */
    final ProxySelector f5853h;

    /* renamed from: i */
    final C9830m f5854i;
    @Nullable

    /* renamed from: j */
    final C3511c f5855j;
    @Nullable

    /* renamed from: k */
    final C9534f f5856k;

    /* renamed from: l */
    final SocketFactory f5857l;

    /* renamed from: m */
    final SSLSocketFactory f5858m;

    /* renamed from: n */
    final C10398c f5859n;

    /* renamed from: o */
    final HostnameVerifier f5860o;

    /* renamed from: p */
    final C3523g f5861p;

    /* renamed from: q */
    final C3507b f5862q;

    /* renamed from: r */
    final C3507b f5863r;

    /* renamed from: s */
    final C3531j f5864s;

    /* renamed from: t */
    final C9832o f5865t;

    /* renamed from: u */
    final boolean f5866u;

    /* renamed from: v */
    final boolean f5867v;

    /* renamed from: w */
    final boolean f5868w;

    /* renamed from: x */
    final int f5869x;

    /* renamed from: y */
    final int f5870y;

    /* renamed from: z */
    final int f5871z;

    /* renamed from: okhttp3.x$a */
    class C3553a extends C3299a {
        C3553a() {
        }

        /* renamed from: a */
        public void mo23924a(C3544s.C3545a aVar, String str) {
            aVar.mo24554b(str);
        }

        /* renamed from: b */
        public void mo23925b(C3544s.C3545a aVar, String str, String str2) {
            aVar.mo24555c(str, str2);
        }

        /* renamed from: c */
        public void mo23926c(C3533k kVar, SSLSocket sSLSocket, boolean z) {
            kVar.mo24489a(sSLSocket, z);
        }

        /* renamed from: d */
        public int mo23927d(C3509b0.C3510a aVar) {
            return aVar.f5637c;
        }

        /* renamed from: e */
        public boolean mo23928e(C3531j jVar, C3526a aVar) {
            return jVar.mo24484b(aVar);
        }

        /* renamed from: f */
        public Socket mo23929f(C3531j jVar, C3504a aVar, C9554e eVar) {
            return jVar.mo24485c(aVar, eVar);
        }

        /* renamed from: g */
        public boolean mo23930g(C3504a aVar, C3504a aVar2) {
            return aVar.mo24339d(aVar2);
        }

        /* renamed from: h */
        public C3526a mo23931h(C3531j jVar, C3504a aVar, C9554e eVar, C3522d0 d0Var) {
            return jVar.mo24486d(aVar, eVar, d0Var);
        }

        /* renamed from: i */
        public void mo23932i(C3531j jVar, C3526a aVar) {
            jVar.mo24487f(aVar);
        }

        /* renamed from: j */
        public C9551c mo23933j(C3531j jVar) {
            return jVar.f5756e;
        }

        @Nullable
        /* renamed from: k */
        public IOException mo23934k(C9796e eVar, @Nullable IOException iOException) {
            return ((C3555y) eVar).mo24645g(iOException);
        }
    }

    /* renamed from: okhttp3.x$b */
    public static final class C3554b {

        /* renamed from: A */
        int f5872A;

        /* renamed from: B */
        int f5873B;

        /* renamed from: a */
        C3536n f5874a = new C3536n();
        @Nullable

        /* renamed from: b */
        Proxy f5875b;

        /* renamed from: c */
        List<Protocol> f5876c = C3552x.f5842C;

        /* renamed from: d */
        List<C3533k> f5877d = C3552x.f5843Q;

        /* renamed from: e */
        final List<C9834u> f5878e = new ArrayList();

        /* renamed from: f */
        final List<C9834u> f5879f = new ArrayList();

        /* renamed from: g */
        C3537p.C3540c f5880g = C3537p.m9764k(C3537p.f5791a);

        /* renamed from: h */
        ProxySelector f5881h;

        /* renamed from: i */
        C9830m f5882i;
        @Nullable

        /* renamed from: j */
        C3511c f5883j;
        @Nullable

        /* renamed from: k */
        C9534f f5884k;

        /* renamed from: l */
        SocketFactory f5885l;
        @Nullable

        /* renamed from: m */
        SSLSocketFactory f5886m;
        @Nullable

        /* renamed from: n */
        C10398c f5887n;

        /* renamed from: o */
        HostnameVerifier f5888o;

        /* renamed from: p */
        C3523g f5889p;

        /* renamed from: q */
        C3507b f5890q;

        /* renamed from: r */
        C3507b f5891r;

        /* renamed from: s */
        C3531j f5892s;

        /* renamed from: t */
        C9832o f5893t;

        /* renamed from: u */
        boolean f5894u;

        /* renamed from: v */
        boolean f5895v;

        /* renamed from: w */
        boolean f5896w;

        /* renamed from: x */
        int f5897x;

        /* renamed from: y */
        int f5898y;

        /* renamed from: z */
        int f5899z;

        public C3554b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f5881h = proxySelector;
            if (proxySelector == null) {
                this.f5881h = new C10372a();
            }
            this.f5882i = C9830m.f17822a;
            this.f5885l = SocketFactory.getDefault();
            this.f5888o = C10399d.f19463a;
            this.f5889p = C3523g.f5706c;
            C3507b bVar = C3507b.f5621a;
            this.f5890q = bVar;
            this.f5891r = bVar;
            this.f5892s = new C3531j();
            this.f5893t = C9832o.f17823a;
            this.f5894u = true;
            this.f5895v = true;
            this.f5896w = true;
            this.f5897x = 0;
            this.f5898y = 10000;
            this.f5899z = 10000;
            this.f5872A = 10000;
            this.f5873B = 0;
        }

        /* renamed from: a */
        public C3554b mo24630a(C9834u uVar) {
            if (uVar != null) {
                this.f5878e.add(uVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: b */
        public C3552x mo24631b() {
            return new C3552x(this);
        }

        /* renamed from: c */
        public C3554b mo24632c(@Nullable C3511c cVar) {
            this.f5883j = cVar;
            this.f5884k = null;
            return this;
        }

        /* renamed from: d */
        public C3554b mo24633d(long j, TimeUnit timeUnit) {
            this.f5898y = C3300c.m8919d("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: e */
        public C3554b mo24634e(HostnameVerifier hostnameVerifier) {
            Objects.requireNonNull(hostnameVerifier, "hostnameVerifier == null");
            this.f5888o = hostnameVerifier;
            return this;
        }

        /* renamed from: f */
        public C3554b mo24635f(long j, TimeUnit timeUnit) {
            this.f5899z = C3300c.m8919d("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: g */
        public C3554b mo24636g(boolean z) {
            this.f5896w = z;
            return this;
        }

        /* renamed from: h */
        public C3554b mo24637h(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            Objects.requireNonNull(sSLSocketFactory, "sslSocketFactory == null");
            Objects.requireNonNull(x509TrustManager, "trustManager == null");
            this.f5886m = sSLSocketFactory;
            this.f5887n = C10398c.m26330b(x509TrustManager);
            return this;
        }

        /* renamed from: i */
        public C3554b mo24638i(long j, TimeUnit timeUnit) {
            this.f5872A = C3300c.m8919d("timeout", j, timeUnit);
            return this;
        }
    }

    static {
        C3299a.f5331a = new C3553a();
    }

    public C3552x() {
        this(new C3554b());
    }

    C3552x(C3554b bVar) {
        boolean z;
        C10398c cVar;
        this.f5846a = bVar.f5874a;
        this.f5847b = bVar.f5875b;
        this.f5848c = bVar.f5876c;
        List<C3533k> list = bVar.f5877d;
        this.f5849d = list;
        this.f5850e = C3300c.m8934s(bVar.f5878e);
        this.f5851f = C3300c.m8934s(bVar.f5879f);
        this.f5852g = bVar.f5880g;
        this.f5853h = bVar.f5881h;
        this.f5854i = bVar.f5882i;
        this.f5855j = bVar.f5883j;
        this.f5856k = bVar.f5884k;
        this.f5857l = bVar.f5885l;
        Iterator<C3533k> it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C3533k next = it.next();
                if (z || next.mo24492d()) {
                    z = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f5886m;
        if (sSLSocketFactory != null || !z) {
            this.f5858m = sSLSocketFactory;
            cVar = bVar.f5887n;
        } else {
            X509TrustManager B = C3300c.m8908B();
            this.f5858m = m9885u(B);
            cVar = C10398c.m26330b(B);
        }
        this.f5859n = cVar;
        if (this.f5858m != null) {
            C3636f.m10368j().mo25953f(this.f5858m);
        }
        this.f5860o = bVar.f5888o;
        this.f5861p = bVar.f5889p.mo24436f(this.f5859n);
        this.f5862q = bVar.f5890q;
        this.f5863r = bVar.f5891r;
        this.f5864s = bVar.f5892s;
        this.f5865t = bVar.f5893t;
        this.f5866u = bVar.f5894u;
        this.f5867v = bVar.f5895v;
        this.f5868w = bVar.f5896w;
        this.f5869x = bVar.f5897x;
        this.f5870y = bVar.f5898y;
        this.f5871z = bVar.f5899z;
        this.f5844A = bVar.f5872A;
        this.f5845B = bVar.f5873B;
        if (this.f5850e.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f5850e);
        } else if (this.f5851f.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f5851f);
        }
    }

    /* renamed from: u */
    private static SSLSocketFactory m9885u(X509TrustManager x509TrustManager) {
        try {
            SSLContext l = C3636f.m10368j().mo25939l();
            l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return l.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C3300c.m8917b("No System TLS", e);
        }
    }

    /* renamed from: C */
    public C3507b mo24603C() {
        return this.f5862q;
    }

    /* renamed from: D */
    public ProxySelector mo24604D() {
        return this.f5853h;
    }

    /* renamed from: E */
    public int mo24605E() {
        return this.f5871z;
    }

    /* renamed from: K */
    public boolean mo24606K() {
        return this.f5868w;
    }

    /* renamed from: L */
    public SocketFactory mo24607L() {
        return this.f5857l;
    }

    /* renamed from: M */
    public SSLSocketFactory mo24608M() {
        return this.f5858m;
    }

    /* renamed from: O */
    public int mo24609O() {
        return this.f5844A;
    }

    /* renamed from: a */
    public C9796e mo24610a(C3558z zVar) {
        return C3555y.m9935e(this, zVar, false);
    }

    /* renamed from: b */
    public C3507b mo24611b() {
        return this.f5863r;
    }

    /* renamed from: c */
    public int mo24612c() {
        return this.f5869x;
    }

    /* renamed from: d */
    public C3523g mo24613d() {
        return this.f5861p;
    }

    /* renamed from: e */
    public int mo24614e() {
        return this.f5870y;
    }

    /* renamed from: f */
    public C3531j mo24615f() {
        return this.f5864s;
    }

    /* renamed from: g */
    public List<C3533k> mo24616g() {
        return this.f5849d;
    }

    /* renamed from: h */
    public C9830m mo24617h() {
        return this.f5854i;
    }

    /* renamed from: i */
    public C3536n mo24618i() {
        return this.f5846a;
    }

    /* renamed from: j */
    public C9832o mo24619j() {
        return this.f5865t;
    }

    /* renamed from: k */
    public C3537p.C3540c mo24620k() {
        return this.f5852g;
    }

    /* renamed from: o */
    public boolean mo24621o() {
        return this.f5867v;
    }

    /* renamed from: p */
    public boolean mo24622p() {
        return this.f5866u;
    }

    /* renamed from: q */
    public HostnameVerifier mo24623q() {
        return this.f5860o;
    }

    /* renamed from: r */
    public List<C9834u> mo24624r() {
        return this.f5850e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C9534f mo24625s() {
        C3511c cVar = this.f5855j;
        return cVar != null ? cVar.f5647a : this.f5856k;
    }

    /* renamed from: t */
    public List<C9834u> mo24626t() {
        return this.f5851f;
    }

    /* renamed from: w */
    public int mo24627w() {
        return this.f5845B;
    }

    /* renamed from: x */
    public List<Protocol> mo24628x() {
        return this.f5848c;
    }

    @Nullable
    /* renamed from: y */
    public Proxy mo24629y() {
        return this.f5847b;
    }
}
