package p092r5;

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
import okhttp3.C3552x;
import okhttp3.Protocol;
import okio.C3564c;
import p213t5.C10396a;
import p213t5.C10397b;
import p213t5.C10398c;
import p213t5.C10400e;

/* renamed from: r5.f */
public class C3636f {

    /* renamed from: a */
    private static final C3636f f6073a = m10367i();

    /* renamed from: b */
    private static final Logger f6074b = Logger.getLogger(C3552x.class.getName());

    /* renamed from: b */
    public static List<String> m10365b(List<Protocol> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static byte[] m10366e(List<Protocol> list) {
        C3564c cVar = new C3564c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                cVar.mo24736R(protocol.toString().length());
                cVar.mo24757i0(protocol.toString());
            }
        }
        return cVar.mo24731O();
    }

    /* renamed from: i */
    private static C3636f m10367i() {
        C3632b s;
        C3636f u = C3628a.m10335u();
        if (u != null) {
            return u;
        }
        if (m10369p() && (s = C3632b.m10352s()) != null) {
            return s;
        }
        C3633c s2 = C3633c.m10358s();
        if (s2 != null) {
            return s2;
        }
        C3636f s3 = C3634d.m10361s();
        return s3 != null ? s3 : new C3636f();
    }

    /* renamed from: j */
    public static C3636f m10368j() {
        return f6073a;
    }

    /* renamed from: p */
    public static boolean m10369p() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public void mo25954a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public C10398c mo25935c(X509TrustManager x509TrustManager) {
        return new C10396a(mo25936d(x509TrustManager));
    }

    /* renamed from: d */
    public C10400e mo25936d(X509TrustManager x509TrustManager) {
        return new C10397b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo25953f(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: g */
    public void mo25937g(SSLSocket sSLSocket, @Nullable String str, List<Protocol> list) {
    }

    /* renamed from: h */
    public void mo25938h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: k */
    public String mo25956k() {
        return "OkHttp";
    }

    /* renamed from: l */
    public SSLContext mo25939l() {
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
    public String mo25940m(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: n */
    public Object mo25941n(String str) {
        if (f6074b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: o */
    public boolean mo25942o(String str) {
        return true;
    }

    /* renamed from: q */
    public void mo25943q(int i, String str, @Nullable Throwable th) {
        f6074b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: r */
    public void mo25944r(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo25943q(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
