package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
final class C2356v9 extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f4672a;

    C2356v9() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C2356v9(SSLSocketFactory sSLSocketFactory) {
        this.f4672a = sSLSocketFactory;
    }

    /* renamed from: a */
    private final SSLSocket m7685a(SSLSocket sSLSocket) {
        return new C2345u9(this, sSLSocket);
    }

    public final Socket createSocket() {
        return m7685a((SSLSocket) this.f4672a.createSocket());
    }

    public final Socket createSocket(String str, int i) {
        return m7685a((SSLSocket) this.f4672a.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m7685a((SSLSocket) this.f4672a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m7685a((SSLSocket) this.f4672a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m7685a((SSLSocket) this.f4672a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m7685a((SSLSocket) this.f4672a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f4672a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f4672a.getSupportedCipherSuites();
    }
}
