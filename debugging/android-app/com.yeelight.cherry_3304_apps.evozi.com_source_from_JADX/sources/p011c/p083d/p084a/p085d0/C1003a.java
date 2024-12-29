package p011c.p083d.p084a.p085d0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import p011c.p083d.p084a.C1123l;

/* renamed from: c.d.a.d0.a */
public final class C1003a {

    /* renamed from: a */
    private final List<C1123l> f1276a;

    /* renamed from: b */
    private int f1277b = 0;

    /* renamed from: c */
    private boolean f1278c;

    /* renamed from: d */
    private boolean f1279d;

    public C1003a(List<C1123l> list) {
        this.f1276a = list;
    }

    /* renamed from: c */
    private boolean m1972c(SSLSocket sSLSocket) {
        for (int i = this.f1277b; i < this.f1276a.size(); i++) {
            if (this.f1276a.get(i).mo9719f(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C1123l mo9429a(SSLSocket sSLSocket) {
        C1123l lVar;
        int i = this.f1277b;
        int size = this.f1276a.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = this.f1276a.get(i);
            i++;
            if (lVar.mo9719f(sSLSocket)) {
                this.f1277b = i;
                break;
            }
        }
        if (lVar != null) {
            this.f1278c = m1972c(sSLSocket);
            C1013d.f1321b.mo9452b(lVar, sSLSocket, this.f1279d);
            return lVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f1279d + ", modes=" + this.f1276a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* renamed from: b */
    public boolean mo9430b(IOException iOException) {
        this.f1279d = true;
        if ((iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((!z || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return (z || (iOException instanceof SSLProtocolException)) && this.f1278c;
        }
        return false;
    }
}
