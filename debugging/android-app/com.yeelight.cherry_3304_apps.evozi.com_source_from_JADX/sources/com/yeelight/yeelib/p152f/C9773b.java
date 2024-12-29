package com.yeelight.yeelib.p152f;

import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.yeelight.yeelib.f.b */
public class C9773b extends SSLSocketFactory {

    /* renamed from: a */
    protected SSLContext f17672a = SSLContext.getInstance("TLS");

    /* renamed from: b */
    protected X509TrustManager f17673b;

    public C9773b(KeyStore... keyStoreArr) {
        C9774c cVar = new C9774c(keyStoreArr);
        this.f17673b = cVar;
        this.f17672a.init((KeyManager[]) null, new TrustManager[]{cVar}, (SecureRandom) null);
    }

    /* renamed from: a */
    public X509TrustManager mo31601a() {
        return this.f17673b;
    }

    public Socket createSocket() {
        return this.f17672a.getSocketFactory().createSocket();
    }

    public Socket createSocket(String str, int i) {
        return this.f17672a.getSocketFactory().createSocket(str, i);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return this.f17672a.getSocketFactory().createSocket(str, i, inetAddress, i2);
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return this.f17672a.getSocketFactory().createSocket(inetAddress, i);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress, i, inetAddress2, i2);
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f17672a.getSocketFactory().createSocket(socket, str, i, z);
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
