package p156f.p157g0.p162k;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p156f.C10835y;
import p156f.p157g0.C4345c;
import p156f.p157g0.p210m.C10824c;
import p156f.p157g0.p210m.C10826e;

/* renamed from: f.g0.k.a */
class C4365a extends C4373f {

    /* renamed from: c */
    private final C10820e<Socket> f7754c;

    /* renamed from: d */
    private final C10820e<Socket> f7755d;

    /* renamed from: e */
    private final C10820e<Socket> f7756e;

    /* renamed from: f */
    private final C10820e<Socket> f7757f;

    /* renamed from: g */
    private final C4368c f7758g = C4368c.m12490b();

    /* renamed from: f.g0.k.a$a */
    static final class C4366a extends C10824c {

        /* renamed from: a */
        private final Object f7759a;

        /* renamed from: b */
        private final Method f7760b;

        C4366a(Object obj, Method method) {
            this.f7759a = obj;
            this.f7760b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo24009a(List<Certificate> list, String str) {
            try {
                return (List) this.f7760b.invoke(this.f7759a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C4366a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: f.g0.k.a$b */
    static final class C4367b implements C10826e {

        /* renamed from: a */
        private final X509TrustManager f7761a;

        /* renamed from: b */
        private final Method f7762b;

        C4367b(X509TrustManager x509TrustManager, Method method) {
            this.f7762b = method;
            this.f7761a = x509TrustManager;
        }

        /* renamed from: a */
        public X509Certificate mo24012a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f7762b.invoke(this.f7761a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw C4345c.m12355b("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4367b)) {
                return false;
            }
            C4367b bVar = (C4367b) obj;
            return this.f7761a.equals(bVar.f7761a) && this.f7762b.equals(bVar.f7762b);
        }

        public int hashCode() {
            return this.f7761a.hashCode() + (this.f7762b.hashCode() * 31);
        }
    }

    /* renamed from: f.g0.k.a$c */
    static final class C4368c {

        /* renamed from: a */
        private final Method f7763a;

        /* renamed from: b */
        private final Method f7764b;

        /* renamed from: c */
        private final Method f7765c;

        C4368c(Method method, Method method2, Method method3) {
            this.f7763a = method;
            this.f7764b = method2;
            this.f7765c = method3;
        }

        /* renamed from: b */
        static C4368c m12490b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C4368c(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo24015a(String str) {
            Method method = this.f7763a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f7764b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo24016c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f7765c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    C4365a(Class<?> cls, C10820e<Socket> eVar, C10820e<Socket> eVar2, C10820e<Socket> eVar3, C10820e<Socket> eVar4) {
        this.f7754c = eVar;
        this.f7755d = eVar2;
        this.f7756e = eVar3;
        this.f7757f = eVar4;
    }

    /* renamed from: s */
    private boolean m12474s(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo24006o(str);
        }
    }

    /* renamed from: t */
    private boolean m12475t(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m12474s(str, cls, obj);
        }
    }

    /* renamed from: u */
    public static C4373f m12476u() {
        Class<?> cls;
        C10820e eVar;
        C10820e eVar2;
        Class<byte[]> cls2 = byte[].class;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class<?> cls3 = cls;
        C10820e eVar3 = new C10820e((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        C10820e eVar4 = new C10820e((Class<?>) null, "setHostname", String.class);
        if (m12477v()) {
            C10820e eVar5 = new C10820e(cls2, "getAlpnSelectedProtocol", new Class[0]);
            eVar = new C10820e((Class<?>) null, "setAlpnProtocols", cls2);
            eVar2 = eVar5;
        } else {
            eVar2 = null;
            eVar = null;
        }
        return new C4365a(cls3, eVar3, eVar4, eVar2, eVar);
    }

    /* renamed from: v */
    private static boolean m12477v() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public C10824c mo23999c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C4366a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.mo23999c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public C10826e mo24000d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C4367b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo24000d(x509TrustManager);
        }
    }

    /* renamed from: g */
    public void mo24001g(SSLSocket sSLSocket, String str, List<C10835y> list) {
        if (str != null) {
            this.f7754c.mo34141e(sSLSocket, Boolean.TRUE);
            this.f7755d.mo34141e(sSLSocket, str);
        }
        C10820e<Socket> eVar = this.f7757f;
        if (eVar != null && eVar.mo34143g(sSLSocket)) {
            this.f7757f.mo34142f(sSLSocket, C4373f.m12507e(list));
        }
    }

    /* renamed from: h */
    public void mo24002h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C4345c.m12344A(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        }
    }

    /* renamed from: l */
    public SSLContext mo24003l() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Nullable
    /* renamed from: m */
    public String mo24004m(SSLSocket sSLSocket) {
        byte[] bArr;
        C10820e<Socket> eVar = this.f7756e;
        if (eVar == null || !eVar.mo34143g(sSLSocket) || (bArr = (byte[]) this.f7756e.mo34142f(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, C4345c.f7648i);
    }

    /* renamed from: n */
    public Object mo24005n(String str) {
        return this.f7758g.mo24015a(str);
    }

    /* renamed from: o */
    public boolean mo24006o(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m12475t(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo24006o(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C4345c.m12355b("unable to determine cleartext support", e);
        }
    }

    /* renamed from: q */
    public void mo24007q(int i, String str, @Nullable Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: r */
    public void mo24008r(String str, Object obj) {
        if (!this.f7758g.mo24016c(obj)) {
            mo24007q(5, str, (Throwable) null);
        }
    }
}
