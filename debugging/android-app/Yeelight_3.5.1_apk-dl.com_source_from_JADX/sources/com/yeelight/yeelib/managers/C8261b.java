package com.yeelight.yeelib.managers;

import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.yeelight.yeelib.managers.b */
public class C8261b extends SSLSocketFactory {

    /* renamed from: a */
    protected SSLContext f14166a = SSLContext.getInstance("TLS");

    /* renamed from: b */
    protected X509TrustManager f14167b;

    public C8261b(KeyStore... keyStoreArr) {
        C8262c cVar = new C8262c(keyStoreArr);
        this.f14167b = cVar;
        this.f14166a.init((KeyManager[]) null, new TrustManager[]{cVar}, (SecureRandom) null);
    }

    /* renamed from: a */
    public X509TrustManager mo35177a() {
        return this.f14167b;
    }

    public Socket createSocket() {
        return this.f14166a.getSocketFactory().createSocket();
    }

    public Socket createSocket(String str, int i) {
        return this.f14166a.getSocketFactory().createSocket(str, i);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return this.f14166a.getSocketFactory().createSocket(str, i, inetAddress, i2);
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return this.f14166a.getSocketFactory().createSocket(inetAddress, i);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress, i, inetAddress2, i2);
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f14166a.getSocketFactory().createSocket(socket, str, i, z);
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
