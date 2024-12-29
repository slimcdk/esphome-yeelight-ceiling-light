package p231y2;

import com.squareup.okhttp.C4292k;
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

/* renamed from: y2.a */
public final class C12012a {

    /* renamed from: a */
    private final List<C4292k> f21998a;

    /* renamed from: b */
    private int f21999b = 0;

    /* renamed from: c */
    private boolean f22000c;

    /* renamed from: d */
    private boolean f22001d;

    public C12012a(List<C4292k> list) {
        this.f21998a = list;
    }

    /* renamed from: c */
    private boolean m30923c(SSLSocket sSLSocket) {
        for (int i = this.f21999b; i < this.f21998a.size(); i++) {
            if (this.f21998a.get(i).mo27906f(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C4292k mo42623a(SSLSocket sSLSocket) {
        C4292k kVar;
        int i = this.f21999b;
        int size = this.f21998a.size();
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = this.f21998a.get(i);
            i++;
            if (kVar.mo27906f(sSLSocket)) {
                this.f21999b = i;
                break;
            }
        }
        if (kVar != null) {
            this.f22000c = m30923c(sSLSocket);
            C12022d.f22043b.mo28019b(kVar, sSLSocket, this.f22001d);
            return kVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f22001d + ", modes=" + this.f21998a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* renamed from: b */
    public boolean mo42624b(IOException iOException) {
        this.f22001d = true;
        if ((iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((!z || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return (z || (iOException instanceof SSLProtocolException)) && this.f22000c;
        }
        return false;
    }
}
