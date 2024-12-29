package p156f.p157g0.p159f;

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
import p156f.C4377k;
import p156f.p157g0.C4344a;

/* renamed from: f.g0.f.b */
public final class C10758b {

    /* renamed from: a */
    private final List<C4377k> f20637a;

    /* renamed from: b */
    private int f20638b = 0;

    /* renamed from: c */
    private boolean f20639c;

    /* renamed from: d */
    private boolean f20640d;

    public C10758b(List<C4377k> list) {
        this.f20637a = list;
    }

    /* renamed from: c */
    private boolean m26634c(SSLSocket sSLSocket) {
        for (int i = this.f20638b; i < this.f20637a.size(); i++) {
            if (this.f20637a.get(i).mo24030c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C4377k mo33987a(SSLSocket sSLSocket) {
        C4377k kVar;
        int i = this.f20638b;
        int size = this.f20637a.size();
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = this.f20637a.get(i);
            i++;
            if (kVar.mo24030c(sSLSocket)) {
                this.f20638b = i;
                break;
            }
        }
        if (kVar != null) {
            this.f20639c = m26634c(sSLSocket);
            C4344a.f7639a.mo23927c(kVar, sSLSocket, this.f20640d);
            return kVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f20640d + ", modes=" + this.f20637a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* renamed from: b */
    public boolean mo33988b(IOException iOException) {
        this.f20640d = true;
        if (!this.f20639c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((!z || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
        }
        return false;
    }
}
