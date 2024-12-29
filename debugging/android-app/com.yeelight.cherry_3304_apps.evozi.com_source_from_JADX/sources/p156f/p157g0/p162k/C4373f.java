package p156f.p157g0.p162k;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p156f.C10835y;
import p156f.C4396x;
import p156f.p157g0.p210m.C10822a;
import p156f.p157g0.p210m.C10823b;
import p156f.p157g0.p210m.C10824c;
import p156f.p157g0.p210m.C10826e;
import p163g.C4406c;

/* renamed from: f.g0.k.f */
public class C4373f {

    /* renamed from: a */
    private static final C4373f f7776a = m12508i();

    /* renamed from: b */
    private static final Logger f7777b = Logger.getLogger(C4396x.class.getName());

    /* renamed from: b */
    public static List<String> m12506b(List<C10835y> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C10835y yVar = list.get(i);
            if (yVar != C10835y.HTTP_1_0) {
                arrayList.add(yVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static byte[] m12507e(List<C10835y> list) {
        C4406c cVar = new C4406c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C10835y yVar = list.get(i);
            if (yVar != C10835y.HTTP_1_0) {
                cVar.mo24247n1(yVar.toString().length());
                cVar.mo24269u1(yVar.toString());
            }
        }
        return cVar.mo24270v();
    }

    /* renamed from: i */
    private static C4373f m12508i() {
        C4369b s;
        C4373f u = C4365a.m12476u();
        if (u != null) {
            return u;
        }
        if (m12510p() && (s = C4369b.m12493s()) != null) {
            return s;
        }
        C4370c s2 = C4370c.m12499s();
        if (s2 != null) {
            return s2;
        }
        C4373f s3 = C4371d.m12502s();
        return s3 != null ? s3 : new C4373f();
    }

    /* renamed from: j */
    public static C4373f m12509j() {
        return f7776a;
    }

    /* renamed from: p */
    public static boolean m12510p() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public void mo24018a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public C10824c mo23999c(X509TrustManager x509TrustManager) {
        return new C10822a(mo24000d(x509TrustManager));
    }

    /* renamed from: d */
    public C10826e mo24000d(X509TrustManager x509TrustManager) {
        return new C10823b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo24017f(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: g */
    public void mo24001g(SSLSocket sSLSocket, @Nullable String str, List<C10835y> list) {
    }

    /* renamed from: h */
    public void mo24002h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: k */
    public String mo24020k() {
        return "OkHttp";
    }

    /* renamed from: l */
    public SSLContext mo24003l() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
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
        return null;
    }

    /* renamed from: n */
    public Object mo24005n(String str) {
        if (f7777b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: o */
    public boolean mo24006o(String str) {
        return true;
    }

    /* renamed from: q */
    public void mo24007q(int i, String str, @Nullable Throwable th) {
        f7777b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: r */
    public void mo24008r(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo24007q(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
