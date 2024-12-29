package p186m5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import okhttp3.C3533k;
import p056k5.C3299a;

/* renamed from: m5.b */
public final class C9550b {

    /* renamed from: a */
    private final List<C3533k> f17426a;

    /* renamed from: b */
    private int f17427b = 0;

    /* renamed from: c */
    private boolean f17428c;

    /* renamed from: d */
    private boolean f17429d;

    public C9550b(List<C3533k> list) {
        this.f17426a = list;
    }

    /* renamed from: c */
    private boolean m23221c(SSLSocket sSLSocket) {
        for (int i = this.f17427b; i < this.f17426a.size(); i++) {
            if (this.f17426a.get(i).mo24491c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C3533k mo38510a(SSLSocket sSLSocket) {
        C3533k kVar;
        int i = this.f17427b;
        int size = this.f17426a.size();
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = this.f17426a.get(i);
            i++;
            if (kVar.mo24491c(sSLSocket)) {
                this.f17427b = i;
                break;
            }
        }
        if (kVar != null) {
            this.f17428c = m23221c(sSLSocket);
            C3299a.f5331a.mo23926c(kVar, sSLSocket, this.f17429d);
            return kVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f17429d + ", modes=" + this.f17426a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* renamed from: b */
    public boolean mo38511b(IOException iOException) {
        this.f17429d = true;
        if (!this.f17428c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((!z || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
        }
        return false;
    }
}
