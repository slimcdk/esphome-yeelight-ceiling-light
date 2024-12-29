package p164h.p211a.p212a.p228h.p229a0;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CRL;
import java.security.cert.CertificateFactory;
import java.util.Collection;
import p164h.p211a.p212a.p228h.p235z.C11165e;

/* renamed from: h.a.a.h.a0.a */
public class C11095a {
    /* renamed from: a */
    public static KeyStore m28755a(InputStream inputStream, String str, String str2, String str3, String str4) {
        char[] cArr = null;
        if (inputStream == null && str == null) {
            return null;
        }
        if (inputStream == null) {
            try {
                inputStream = C11165e.m29075e(str).mo35502c();
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
        KeyStore instance = str3 != null ? KeyStore.getInstance(str2, str3) : KeyStore.getInstance(str2);
        if (str4 != null) {
            cArr = str4.toCharArray();
        }
        instance.load(inputStream, cArr);
        if (inputStream != null) {
            inputStream.close();
        }
        return instance;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Collection<? extends java.security.cert.CRL>, java.io.InputStream] */
    /* renamed from: b */
    public static Collection<? extends CRL> m28756b(String str) {
        InputStream inputStream = 0;
        if (str == null) {
            return inputStream;
        }
        try {
            inputStream = C11165e.m29075e(str).mo35502c();
            return CertificateFactory.getInstance("X.509").generateCRLs(inputStream);
        } finally {
            if (inputStream != 0) {
                inputStream.close();
            }
        }
    }
}
