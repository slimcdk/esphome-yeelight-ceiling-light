package p092r5;

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
import okhttp3.Protocol;
import p056k5.C3300c;
import p213t5.C10398c;
import p213t5.C10400e;

/* renamed from: r5.a */
class C3628a extends C3636f {

    /* renamed from: c */
    private final C10297e<Socket> f6051c;

    /* renamed from: d */
    private final C10297e<Socket> f6052d;

    /* renamed from: e */
    private final C10297e<Socket> f6053e;

    /* renamed from: f */
    private final C10297e<Socket> f6054f;

    /* renamed from: g */
    private final C3631c f6055g = C3631c.m10349b();

    /* renamed from: r5.a$a */
    static final class C3629a extends C10398c {

        /* renamed from: a */
        private final Object f6056a;

        /* renamed from: b */
        private final Method f6057b;

        C3629a(Object obj, Method method) {
            this.f6056a = obj;
            this.f6057b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo25945a(List<Certificate> list, String str) {
            try {
                return (List) this.f6057b.invoke(this.f6056a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C3629a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: r5.a$b */
    static final class C3630b implements C10400e {

        /* renamed from: a */
        private final X509TrustManager f6058a;

        /* renamed from: b */
        private final Method f6059b;

        C3630b(X509TrustManager x509TrustManager, Method method) {
            this.f6059b = method;
            this.f6058a = x509TrustManager;
        }

        /* renamed from: a */
        public X509Certificate mo25948a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f6059b.invoke(this.f6058a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw C3300c.m8917b("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3630b)) {
                return false;
            }
            C3630b bVar = (C3630b) obj;
            return this.f6058a.equals(bVar.f6058a) && this.f6059b.equals(bVar.f6059b);
        }

        public int hashCode() {
            return this.f6058a.hashCode() + (this.f6059b.hashCode() * 31);
        }
    }

    /* renamed from: r5.a$c */
    static final class C3631c {

        /* renamed from: a */
        private final Method f6060a;

        /* renamed from: b */
        private final Method f6061b;

        /* renamed from: c */
        private final Method f6062c;

        C3631c(Method method, Method method2, Method method3) {
            this.f6060a = method;
            this.f6061b = method2;
            this.f6062c = method3;
        }

        /* renamed from: b */
        static C3631c m10349b() {
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
            return new C3631c(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo25951a(String str) {
            Method method = this.f6060a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f6061b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo25952c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f6062c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    C3628a(Class<?> cls, C10297e<Socket> eVar, C10297e<Socket> eVar2, C10297e<Socket> eVar3, C10297e<Socket> eVar4) {
        this.f6051c = eVar;
        this.f6052d = eVar2;
        this.f6053e = eVar3;
        this.f6054f = eVar4;
    }

    /* renamed from: s */
    private boolean m10333s(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo25942o(str);
        }
    }

    /* renamed from: t */
    private boolean m10334t(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m10333s(str, cls, obj);
        }
    }

    /* renamed from: u */
    public static C3636f m10335u() {
        Class<?> cls;
        C10297e eVar;
        C10297e eVar2;
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
        C10297e eVar3 = new C10297e((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        C10297e eVar4 = new C10297e((Class<?>) null, "setHostname", String.class);
        if (m10336v()) {
            C10297e eVar5 = new C10297e(cls2, "getAlpnSelectedProtocol", new Class[0]);
            eVar = new C10297e((Class<?>) null, "setAlpnProtocols", cls2);
            eVar2 = eVar5;
        } else {
            eVar2 = null;
            eVar = null;
        }
        return new C3628a(cls3, eVar3, eVar4, eVar2, eVar);
    }

    /* renamed from: v */
    private static boolean m10336v() {
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
    public C10398c mo25935c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C3629a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.mo25935c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public C10400e mo25936d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C3630b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo25936d(x509TrustManager);
        }
    }

    /* renamed from: g */
    public void mo25937g(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.f6051c.mo41835e(sSLSocket, Boolean.TRUE);
            this.f6052d.mo41835e(sSLSocket, str);
        }
        C10297e<Socket> eVar = this.f6054f;
        if (eVar != null && eVar.mo41837g(sSLSocket)) {
            this.f6054f.mo41836f(sSLSocket, C3636f.m10366e(list));
        }
    }

    /* renamed from: h */
    public void mo25938h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C3300c.m8941z(e)) {
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
    public SSLContext mo25939l() {
        boolean z = true;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 16 || i >= 22) {
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
    public String mo25940m(SSLSocket sSLSocket) {
        byte[] bArr;
        C10297e<Socket> eVar = this.f6053e;
        if (eVar == null || !eVar.mo41837g(sSLSocket) || (bArr = (byte[]) this.f6053e.mo41836f(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, C3300c.f5335d);
    }

    /* renamed from: n */
    public Object mo25941n(String str) {
        return this.f6055g.mo25951a(str);
    }

    /* renamed from: o */
    public boolean mo25942o(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m10334t(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo25942o(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C3300c.m8917b("unable to determine cleartext support", e);
        }
    }

    /* renamed from: q */
    public void mo25943q(int i, String str, @Nullable Throwable th) {
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
    public void mo25944r(String str, Object obj) {
        if (!this.f6055g.mo25952c(obj)) {
            mo25943q(5, str, (Throwable) null);
        }
    }
}
