package p092r5;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

/* renamed from: r5.b */
public class C3632b extends C3636f {
    private C3632b() {
    }

    /* renamed from: s */
    public static C3632b m10352s() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C3632b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t */
    private Provider m10353t() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: f */
    public void mo25953f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    /* renamed from: g */
    public void mo25937g(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C3636f.m10365b(list).toArray(new String[0]));
            return;
        }
        super.mo25937g(sSLSocket, str, list);
    }

    /* renamed from: l */
    public SSLContext mo25939l() {
        try {
            return SSLContext.getInstance("TLSv1.3", m10353t());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m10353t());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Nullable
    /* renamed from: m */
    public String mo25940m(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo25940m(sSLSocket);
    }
}
