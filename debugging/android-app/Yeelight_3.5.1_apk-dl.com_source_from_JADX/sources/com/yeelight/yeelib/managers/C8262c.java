package com.yeelight.yeelib.managers;

import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.yeelight.yeelib.managers.c */
public class C8262c implements X509TrustManager {

    /* renamed from: a */
    private ArrayList<X509TrustManager> f14168a = new ArrayList<>();

    public C8262c(KeyStore... keyStoreArr) {
        ArrayList arrayList = new ArrayList();
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            arrayList.add(instance);
            for (KeyStore init : keyStoreArr) {
                TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance2.init(init);
                arrayList.add(instance2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (TrustManager trustManager : ((TrustManagerFactory) it.next()).getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f14168a.add((X509TrustManager) trustManager);
                    }
                }
            }
            if (this.f14168a.size() == 0) {
                throw new RuntimeException("Couldn't find any X509TrustManagers");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f14168a.get(0).checkClientTrusted(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        Iterator<X509TrustManager> it = this.f14168a.iterator();
        while (it.hasNext()) {
            try {
                it.next().checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException();
    }

    public X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = new ArrayList();
        Iterator<X509TrustManager> it = this.f14168a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }
}
