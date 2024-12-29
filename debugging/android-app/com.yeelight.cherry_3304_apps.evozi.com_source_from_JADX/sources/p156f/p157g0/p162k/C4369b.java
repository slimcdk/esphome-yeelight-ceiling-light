package p156f.p157g0.p162k;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import p156f.C10835y;

/* renamed from: f.g0.k.b */
public class C4369b extends C4373f {
    private C4369b() {
    }

    /* renamed from: s */
    public static C4369b m12493s() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C4369b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t */
    private Provider m12494t() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: f */
    public void mo24017f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    /* renamed from: g */
    public void mo24001g(SSLSocket sSLSocket, String str, List<C10835y> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C4373f.m12506b(list).toArray(new String[0]));
            return;
        }
        super.mo24001g(sSLSocket, str, list);
    }

    /* renamed from: l */
    public SSLContext mo24003l() {
        try {
            return SSLContext.getInstance("TLSv1.3", m12494t());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m12494t());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Nullable
    /* renamed from: m */
    public String mo24004m(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo24004m(sSLSocket);
    }
}
