package p129b4;

import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8261b;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: b4.e */
public class C3997e {

    /* renamed from: b4.e$a */
    class C3998a implements HostnameVerifier {
        C3998a() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            return str.endsWith("yeedev.com") || defaultHostnameVerifier.verify("*.yeelight.com", sSLSession) || defaultHostnameVerifier.verify("account.xiaomi.com", sSLSession);
        }
    }

    /* renamed from: a */
    public static C8261b m11613a() {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load((InputStream) null, (char[]) null);
            CertificateFactory instance2 = CertificateFactory.getInstance("X.509");
            instance.setCertificateEntry("ca1", instance2.generateCertificate(C3108x.f4951e.getAssets().open("yeelight.crt")));
            instance.setCertificateEntry("ca2", instance2.generateCertificate(C3108x.f4951e.getAssets().open("yeelight2.crt")));
            instance.setCertificateEntry("ca3", instance2.generateCertificate(C3108x.f4951e.getAssets().open("server.crt")));
            return new C8261b(instance);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static HostnameVerifier m11614b() {
        return new C3998a();
    }
}
