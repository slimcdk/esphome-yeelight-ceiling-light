package com.squareup.okhttp;

import com.squareup.okhttp.C4299p;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p123a3.C3932a;
import p123a3.C3949h;
import p123a3.C3962q;
import p133c3.C4005b;
import p231y2.C12022d;
import p231y2.C12023e;
import p231y2.C12025g;
import p231y2.C12032j;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.u */
public class C4310u implements Cloneable {

    /* renamed from: A */
    private static SSLSocketFactory f7035A;

    /* renamed from: y */
    private static final List<Protocol> f7036y = C12033k.m31049i(Protocol.HTTP_2, Protocol.SPDY_3, Protocol.HTTP_1_1);

    /* renamed from: z */
    private static final List<C4292k> f7037z = C12033k.m31049i(C4292k.f6974f, C4292k.f6975g, C4292k.f6976h);

    /* renamed from: a */
    private final C12032j f7038a;

    /* renamed from: b */
    private C4296m f7039b;

    /* renamed from: c */
    private Proxy f7040c;

    /* renamed from: d */
    private List<Protocol> f7041d;

    /* renamed from: e */
    private List<C4292k> f7042e;

    /* renamed from: f */
    private final List<C4305r> f7043f;

    /* renamed from: g */
    private final List<C4305r> f7044g;

    /* renamed from: h */
    private ProxySelector f7045h;

    /* renamed from: i */
    private CookieHandler f7046i;

    /* renamed from: j */
    private C12023e f7047j;

    /* renamed from: k */
    private C4270c f7048k;

    /* renamed from: l */
    private SocketFactory f7049l;

    /* renamed from: m */
    private SSLSocketFactory f7050m;

    /* renamed from: n */
    private HostnameVerifier f7051n;

    /* renamed from: o */
    private C4285g f7052o;

    /* renamed from: p */
    private C4269b f7053p;

    /* renamed from: q */
    private C4290j f7054q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C12025g f7055r;

    /* renamed from: s */
    private boolean f7056s;

    /* renamed from: t */
    private boolean f7057t;

    /* renamed from: u */
    private boolean f7058u;

    /* renamed from: v */
    private int f7059v;

    /* renamed from: w */
    private int f7060w;

    /* renamed from: x */
    private int f7061x;

    /* renamed from: com.squareup.okhttp.u$a */
    static class C4311a extends C12022d {
        C4311a() {
        }

        /* renamed from: a */
        public void mo28018a(C4299p.C4301b bVar, String str) {
            bVar.mo27940c(str);
        }

        /* renamed from: b */
        public void mo28019b(C4292k kVar, SSLSocket sSLSocket, boolean z) {
            kVar.mo27903c(sSLSocket, z);
        }

        /* renamed from: c */
        public boolean mo28020c(C4289i iVar) {
            return iVar.mo27869a();
        }

        /* renamed from: d */
        public void mo28021d(C4289i iVar, Object obj) {
            iVar.mo27870b(obj);
        }

        /* renamed from: e */
        public void mo28022e(C4310u uVar, C4289i iVar, C3949h hVar, C4312v vVar) {
            iVar.mo27872d(uVar, hVar, vVar);
        }

        /* renamed from: f */
        public C12023e mo28023f(C4310u uVar) {
            return uVar.mo27988K();
        }

        /* renamed from: g */
        public boolean mo28024g(C4289i iVar) {
            return iVar.mo27883s();
        }

        /* renamed from: h */
        public C12025g mo28025h(C4310u uVar) {
            return uVar.f7055r;
        }

        /* renamed from: i */
        public C3962q mo28026i(C4289i iVar, C3949h hVar) {
            return iVar.mo27884t(hVar);
        }

        /* renamed from: j */
        public void mo28027j(C4290j jVar, C4289i iVar) {
            jVar.mo27900f(iVar);
        }

        /* renamed from: k */
        public int mo28028k(C4289i iVar) {
            return iVar.mo27886u();
        }

        /* renamed from: l */
        public C12032j mo28029l(C4310u uVar) {
            return uVar.mo27991O();
        }

        /* renamed from: m */
        public void mo28030m(C4289i iVar, C3949h hVar) {
            iVar.mo27888w(hVar);
        }

        /* renamed from: n */
        public void mo28031n(C4289i iVar, Protocol protocol) {
            iVar.mo27889x(protocol);
        }
    }

    static {
        C12022d.f22043b = new C4311a();
    }

    public C4310u() {
        this.f7043f = new ArrayList();
        this.f7044g = new ArrayList();
        this.f7056s = true;
        this.f7057t = true;
        this.f7058u = true;
        this.f7059v = 10000;
        this.f7060w = 10000;
        this.f7061x = 10000;
        this.f7038a = new C12032j();
        this.f7039b = new C4296m();
    }

    private C4310u(C4310u uVar) {
        ArrayList arrayList = new ArrayList();
        this.f7043f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f7044g = arrayList2;
        this.f7056s = true;
        this.f7057t = true;
        this.f7058u = true;
        this.f7059v = 10000;
        this.f7060w = 10000;
        this.f7061x = 10000;
        this.f7038a = uVar.f7038a;
        this.f7039b = uVar.f7039b;
        this.f7040c = uVar.f7040c;
        this.f7041d = uVar.f7041d;
        this.f7042e = uVar.f7042e;
        arrayList.addAll(uVar.f7043f);
        arrayList2.addAll(uVar.f7044g);
        this.f7045h = uVar.f7045h;
        this.f7046i = uVar.f7046i;
        C4270c cVar = uVar.f7048k;
        this.f7048k = cVar;
        this.f7047j = cVar != null ? cVar.f6890a : uVar.f7047j;
        this.f7049l = uVar.f7049l;
        this.f7050m = uVar.f7050m;
        this.f7051n = uVar.f7051n;
        this.f7052o = uVar.f7052o;
        this.f7053p = uVar.f7053p;
        this.f7054q = uVar.f7054q;
        this.f7055r = uVar.f7055r;
        this.f7056s = uVar.f7056s;
        this.f7057t = uVar.f7057t;
        this.f7058u = uVar.f7058u;
        this.f7059v = uVar.f7059v;
        this.f7060w = uVar.f7060w;
        this.f7061x = uVar.f7061x;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized javax.net.ssl.SSLSocketFactory m12077k() {
        /*
            r2 = this;
            monitor-enter(r2)
            javax.net.ssl.SSLSocketFactory r0 = f7035A     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x0016 }
            r1 = 0
            r0.init(r1, r1, r1)     // Catch:{ GeneralSecurityException -> 0x0016 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ GeneralSecurityException -> 0x0016 }
            f7035A = r0     // Catch:{ GeneralSecurityException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0020 }
            r0.<init>()     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x001c:
            javax.net.ssl.SSLSocketFactory r0 = f7035A     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.C4310u.m12077k():javax.net.ssl.SSLSocketFactory");
    }

    /* renamed from: C */
    public SSLSocketFactory mo27985C() {
        return this.f7050m;
    }

    /* renamed from: D */
    public int mo27986D() {
        return this.f7061x;
    }

    /* renamed from: E */
    public List<C4305r> mo27987E() {
        return this.f7043f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public C12023e mo27988K() {
        return this.f7047j;
    }

    /* renamed from: L */
    public List<C4305r> mo27989L() {
        return this.f7044g;
    }

    /* renamed from: M */
    public C4280e mo27990M(C4312v vVar) {
        return new C4280e(this, vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public C12032j mo27991O() {
        return this.f7038a;
    }

    /* renamed from: Q */
    public C4310u mo27992Q(C4270c cVar) {
        this.f7048k = cVar;
        this.f7047j = null;
        return this;
    }

    /* renamed from: R */
    public void mo27993R(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || j <= 0) {
                this.f7059v = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: S */
    public C4310u mo27994S(CookieHandler cookieHandler) {
        this.f7046i = cookieHandler;
        return this;
    }

    /* renamed from: U */
    public void mo27995U(boolean z) {
        this.f7057t = z;
    }

    /* renamed from: X */
    public void mo27996X(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || j <= 0) {
                this.f7060w = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: Y */
    public void mo27997Y(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || j <= 0) {
                this.f7061x = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: b */
    public C4310u mo27998b(Object obj) {
        mo28008o().mo27917a(obj);
        return this;
    }

    /* renamed from: c */
    public C4310u clone() {
        return new C4310u(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4310u mo28001d() {
        C4310u uVar = new C4310u(this);
        if (uVar.f7045h == null) {
            uVar.f7045h = ProxySelector.getDefault();
        }
        if (uVar.f7046i == null) {
            uVar.f7046i = CookieHandler.getDefault();
        }
        if (uVar.f7049l == null) {
            uVar.f7049l = SocketFactory.getDefault();
        }
        if (uVar.f7050m == null) {
            uVar.f7050m = m12077k();
        }
        if (uVar.f7051n == null) {
            uVar.f7051n = C4005b.f6764a;
        }
        if (uVar.f7052o == null) {
            uVar.f7052o = C4285g.f6950b;
        }
        if (uVar.f7053p == null) {
            uVar.f7053p = C3932a.f6585a;
        }
        if (uVar.f7054q == null) {
            uVar.f7054q = C4290j.m11942d();
        }
        if (uVar.f7041d == null) {
            uVar.f7041d = f7036y;
        }
        if (uVar.f7042e == null) {
            uVar.f7042e = f7037z;
        }
        if (uVar.f7055r == null) {
            uVar.f7055r = C12025g.f22045a;
        }
        return uVar;
    }

    /* renamed from: e */
    public C4269b mo28002e() {
        return this.f7053p;
    }

    /* renamed from: f */
    public C4285g mo28003f() {
        return this.f7052o;
    }

    /* renamed from: g */
    public int mo28004g() {
        return this.f7059v;
    }

    /* renamed from: h */
    public C4290j mo28005h() {
        return this.f7054q;
    }

    /* renamed from: i */
    public List<C4292k> mo28006i() {
        return this.f7042e;
    }

    /* renamed from: j */
    public CookieHandler mo28007j() {
        return this.f7046i;
    }

    /* renamed from: o */
    public C4296m mo28008o() {
        return this.f7039b;
    }

    /* renamed from: p */
    public boolean mo28009p() {
        return this.f7057t;
    }

    /* renamed from: q */
    public boolean mo28010q() {
        return this.f7056s;
    }

    /* renamed from: r */
    public HostnameVerifier mo28011r() {
        return this.f7051n;
    }

    /* renamed from: s */
    public List<Protocol> mo28012s() {
        return this.f7041d;
    }

    /* renamed from: t */
    public Proxy mo28013t() {
        return this.f7040c;
    }

    /* renamed from: u */
    public ProxySelector mo28014u() {
        return this.f7045h;
    }

    /* renamed from: w */
    public int mo28015w() {
        return this.f7060w;
    }

    /* renamed from: x */
    public boolean mo28016x() {
        return this.f7058u;
    }

    /* renamed from: y */
    public SocketFactory mo28017y() {
        return this.f7049l;
    }
}
