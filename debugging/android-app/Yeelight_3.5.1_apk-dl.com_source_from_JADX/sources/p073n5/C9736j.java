package p073n5;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C3504a;
import okhttp3.C3505a0;
import okhttp3.C3509b0;
import okhttp3.C3518c0;
import okhttp3.C3522d0;
import okhttp3.C3523g;
import okhttp3.C3537p;
import okhttp3.C3546t;
import okhttp3.C3552x;
import okhttp3.C3558z;
import okhttp3.C9796e;
import okhttp3.C9834u;
import okhttp3.internal.connection.C3526a;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import p056k5.C3300c;
import p186m5.C9554e;

/* renamed from: n5.j */
public final class C9736j implements C9834u {

    /* renamed from: a */
    private final C3552x f17561a;

    /* renamed from: b */
    private volatile C9554e f17562b;

    /* renamed from: c */
    private Object f17563c;

    /* renamed from: d */
    private volatile boolean f17564d;

    public C9736j(C3552x xVar, boolean z) {
        this.f17561a = xVar;
    }

    /* renamed from: c */
    private C3504a m23389c(C3546t tVar) {
        C3523g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (tVar.mo24574n()) {
            SSLSocketFactory M = this.f17561a.mo24608M();
            hostnameVerifier = this.f17561a.mo24623q();
            sSLSocketFactory = M;
            gVar = this.f17561a.mo24613d();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C3504a(tVar.mo24573m(), tVar.mo24579z(), this.f17561a.mo24619j(), this.f17561a.mo24607L(), sSLSocketFactory, hostnameVerifier, gVar, this.f17561a.mo24603C(), this.f17561a.mo24629y(), this.f17561a.mo24628x(), this.f17561a.mo24616g(), this.f17561a.mo24604D());
    }

    /* renamed from: d */
    private C3558z m23390d(C3509b0 b0Var, C3522d0 d0Var) {
        String h;
        C3546t D;
        if (b0Var != null) {
            int d = b0Var.mo24359d();
            String g = b0Var.mo24372z().mo24658g();
            C3505a0 a0Var = null;
            if (d == 307 || d == 308) {
                if (!g.equals("GET") && !g.equals("HEAD")) {
                    return null;
                }
            } else if (d == 401) {
                return this.f17561a.mo24611b().mo24354a(d0Var, b0Var);
            } else {
                if (d != 503) {
                    if (d == 407) {
                        if ((d0Var != null ? d0Var.mo24427b() : this.f17561a.mo24629y()).type() == Proxy.Type.HTTP) {
                            return this.f17561a.mo24603C().mo24354a(d0Var, b0Var);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (d != 408) {
                        switch (d) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f17561a.mo24606K()) {
                        return null;
                    } else {
                        b0Var.mo24372z().mo24652a();
                        if ((b0Var.mo24368q() == null || b0Var.mo24368q().mo24359d() != 408) && m23393h(b0Var, 0) <= 0) {
                            return b0Var.mo24372z();
                        }
                        return null;
                    }
                } else if ((b0Var.mo24368q() == null || b0Var.mo24368q().mo24359d() != 503) && m23393h(b0Var, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) == 0) {
                    return b0Var.mo24372z();
                } else {
                    return null;
                }
            }
            if (!this.f17561a.mo24621o() || (h = b0Var.mo24361h("Location")) == null || (D = b0Var.mo24372z().mo24660i().mo24562D(h)) == null) {
                return null;
            }
            if (!D.mo24563E().equals(b0Var.mo24372z().mo24660i().mo24563E()) && !this.f17561a.mo24622p()) {
                return null;
            }
            C3558z.C3559a h2 = b0Var.mo24372z().mo24659h();
            if (C9733f.m23371b(g)) {
                boolean d2 = C9733f.m23373d(g);
                if (C9733f.m23372c(g)) {
                    h2.mo24666e("GET", (C3505a0) null);
                } else {
                    if (d2) {
                        a0Var = b0Var.mo24372z().mo24652a();
                    }
                    h2.mo24666e(g, a0Var);
                }
                if (!d2) {
                    h2.mo24667f("Transfer-Encoding");
                    h2.mo24667f("Content-Length");
                    h2.mo24667f("Content-Type");
                }
            }
            if (!m23394i(b0Var, D)) {
                h2.mo24667f("Authorization");
            }
            return h2.mo24669h(D).mo24663b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    private boolean m23391f(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    /* renamed from: g */
    private boolean m23392g(IOException iOException, C9554e eVar, boolean z, C3558z zVar) {
        eVar.mo38531q(iOException);
        if (!this.f17561a.mo24606K()) {
            return false;
        }
        if (z) {
            zVar.mo24652a();
        }
        return m23391f(iOException, z) && eVar.mo38525h();
    }

    /* renamed from: h */
    private int m23393h(C3509b0 b0Var, int i) {
        String h = b0Var.mo24361h("Retry-After");
        return h == null ? i : h.matches("\\d+") ? Integer.valueOf(h).intValue() : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: i */
    private boolean m23394i(C3509b0 b0Var, C3546t tVar) {
        C3546t i = b0Var.mo24372z().mo24660i();
        return i.mo24573m().equals(tVar.mo24573m()) && i.mo24579z() == tVar.mo24579z() && i.mo24563E().equals(tVar.mo24563E());
    }

    /* renamed from: a */
    public C3509b0 mo35530a(C9834u.C9835a aVar) {
        C3558z a = aVar.mo38901a();
        C9734g gVar = (C9734g) aVar;
        C9796e f = gVar.mo38906f();
        C3537p h = gVar.mo38908h();
        C9554e eVar = new C9554e(this.f17561a.mo24615f(), m23389c(a.mo24660i()), f, h, this.f17563c);
        this.f17562b = eVar;
        C3509b0 b0Var = null;
        int i = 0;
        while (!this.f17564d) {
            try {
                C3509b0 j = gVar.mo38910j(a, eVar, (C9729c) null, (C3526a) null);
                if (b0Var != null) {
                    j = j.mo24367p().mo24383m(b0Var.mo24367p().mo24374b((C3518c0) null).mo24375c()).mo24375c();
                }
                try {
                    C3558z d = m23390d(j, eVar.mo38530o());
                    if (d == null) {
                        eVar.mo38528k();
                        return j;
                    }
                    C3300c.m8921f(j.mo24356a());
                    int i2 = i + 1;
                    if (i2 <= 20) {
                        d.mo24652a();
                        if (!m23394i(j, d.mo24660i())) {
                            eVar.mo38528k();
                            eVar = new C9554e(this.f17561a.mo24615f(), m23389c(d.mo24660i()), f, h, this.f17563c);
                            this.f17562b = eVar;
                        } else if (eVar.mo38523c() != null) {
                            throw new IllegalStateException("Closing the body of " + j + " didn't close its backing stream. Bad interceptor?");
                        }
                        b0Var = j;
                        a = d;
                        i = i2;
                    } else {
                        eVar.mo38528k();
                        throw new ProtocolException("Too many follow-up requests: " + i2);
                    }
                } catch (IOException e) {
                    eVar.mo38528k();
                    throw e;
                }
            } catch (RouteException e2) {
                if (!m23392g(e2.getLastConnectException(), eVar, false, a)) {
                    throw e2.getFirstConnectException();
                }
            } catch (IOException e3) {
                if (!m23392g(e3, eVar, !(e3 instanceof ConnectionShutdownException), a)) {
                    throw e3;
                }
            } catch (Throwable th) {
                eVar.mo38531q((IOException) null);
                eVar.mo38528k();
                throw th;
            }
        }
        eVar.mo38528k();
        throw new IOException("Canceled");
    }

    /* renamed from: b */
    public void mo38912b() {
        this.f17564d = true;
        C9554e eVar = this.f17562b;
        if (eVar != null) {
            eVar.mo38522b();
        }
    }

    /* renamed from: e */
    public boolean mo38913e() {
        return this.f17564d;
    }

    /* renamed from: j */
    public void mo38914j(Object obj) {
        this.f17563c = obj;
    }
}
