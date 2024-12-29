package com.yeelight.yeelib.p187h;

import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9773b;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: com.yeelight.yeelib.h.g */
public class C9871g {

    /* renamed from: com.yeelight.yeelib.h.g$a */
    static class C9872a implements HostnameVerifier {
        C9872a() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            return defaultHostnameVerifier.verify("*.yeelight.com", sSLSession) || defaultHostnameVerifier.verify("account.xiaomi.com", sSLSession);
        }
    }

    /* renamed from: a */
    public static C9773b m24179a() {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load((InputStream) null, (char[]) null);
            CertificateFactory instance2 = CertificateFactory.getInstance("X.509");
            instance.setCertificateEntry("ca1", instance2.generateCertificate(C4297y.f7456e.getAssets().open("yeelight.crt")));
            instance.setCertificateEntry("ca2", instance2.generateCertificate(C4297y.f7456e.getAssets().open("yeelight2.crt")));
            return new C9773b(instance);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static HostnameVerifier m24180b() {
        return new C9872a();
    }
}
