package p156f.p157g0.p160g;

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
import p156f.C10833u;
import p156f.C4317a;
import p156f.C4318a0;
import p156f.C4322b0;
import p156f.C4332c0;
import p156f.C4336d0;
import p156f.C4338e;
import p156f.C4340e0;
import p156f.C4341g;
import p156f.C4381p;
import p156f.C4390t;
import p156f.C4396x;
import p156f.p157g0.C4345c;
import p156f.p157g0.p159f.C10760e;
import p156f.p157g0.p159f.C10763g;
import p156f.p157g0.p159f.C4357c;
import p156f.p157g0.p161i.C10785a;

/* renamed from: f.g0.g.j */
public final class C10775j implements C10833u {

    /* renamed from: a */
    private final C4396x f20687a;

    /* renamed from: b */
    private volatile C10763g f20688b;

    /* renamed from: c */
    private Object f20689c;

    /* renamed from: d */
    private volatile boolean f20690d;

    public C10775j(C4396x xVar, boolean z) {
        this.f20687a = xVar;
    }

    /* renamed from: c */
    private C4317a m26719c(C4390t tVar) {
        C4341g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (tVar.mo24115n()) {
            SSLSocketFactory G = this.f20687a.mo24151G();
            hostnameVerifier = this.f20687a.mo24165r();
            sSLSocketFactory = G;
            gVar = this.f20687a.mo24155d();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C4317a(tVar.mo24114m(), tVar.mo24120z(), this.f20687a.mo24161m(), this.f20687a.mo24150F(), sSLSocketFactory, hostnameVerifier, gVar, this.f20687a.mo24146A(), this.f20687a.mo24172z(), this.f20687a.mo24171y(), this.f20687a.mo24158j(), this.f20687a.mo24147B());
    }

    /* renamed from: d */
    private C4318a0 m26720d(C4332c0 c0Var, C4340e0 e0Var) {
        String i;
        C4390t D;
        if (c0Var != null) {
            int g = c0Var.mo23860g();
            String g2 = c0Var.mo23855I().mo23813g();
            C4322b0 b0Var = null;
            if (g == 307 || g == 308) {
                if (!g2.equals("GET") && !g2.equals("HEAD")) {
                    return null;
                }
            } else if (g == 401) {
                return this.f20687a.mo24153b().mo23826a(e0Var, c0Var);
            } else {
                if (g != 503) {
                    if (g == 407) {
                        if ((e0Var != null ? e0Var.mo23909b() : this.f20687a.mo24172z()).type() == Proxy.Type.HTTP) {
                            return this.f20687a.mo24146A().mo23826a(e0Var, c0Var);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (g != 408) {
                        switch (g) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f20687a.mo24149E()) {
                        return null;
                    } else {
                        c0Var.mo23855I().mo23807a();
                        if ((c0Var.mo23852C() == null || c0Var.mo23852C().mo23860g() != 408) && m26723h(c0Var, 0) <= 0) {
                            return c0Var.mo23855I();
                        }
                        return null;
                    }
                } else if ((c0Var.mo23852C() == null || c0Var.mo23852C().mo23860g() != 503) && m26723h(c0Var, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) == 0) {
                    return c0Var.mo23855I();
                } else {
                    return null;
                }
            }
            if (!this.f20687a.mo24163p() || (i = c0Var.mo23862i("Location")) == null || (D = c0Var.mo23855I().mo23815i().mo24103D(i)) == null) {
                return null;
            }
            if (!D.mo24104E().equals(c0Var.mo23855I().mo23815i().mo24104E()) && !this.f20687a.mo24164q()) {
                return null;
            }
            C4318a0.C4319a h = c0Var.mo23855I().mo23814h();
            if (C10772f.m26701b(g2)) {
                boolean d = C10772f.m26703d(g2);
                if (C10772f.m26702c(g2)) {
                    h.mo23822f("GET", (C4322b0) null);
                } else {
                    if (d) {
                        b0Var = c0Var.mo23855I().mo23807a();
                    }
                    h.mo23822f(g2, b0Var);
                }
                if (!d) {
                    h.mo23823g("Transfer-Encoding");
                    h.mo23823g("Content-Length");
                    h.mo23823g("Content-Type");
                }
            }
            if (!m26724i(c0Var, D)) {
                h.mo23823g("Authorization");
            }
            h.mo23825i(D);
            return h.mo23818b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    private boolean m26721f(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    /* renamed from: g */
    private boolean m26722g(IOException iOException, C10763g gVar, boolean z, C4318a0 a0Var) {
        gVar.mo34011q(iOException);
        if (!this.f20687a.mo24149E()) {
            return false;
        }
        if (z) {
            a0Var.mo23807a();
        }
        return m26721f(iOException, z) && gVar.mo34005h();
    }

    /* renamed from: h */
    private int m26723h(C4332c0 c0Var, int i) {
        String i2 = c0Var.mo23862i("Retry-After");
        return i2 == null ? i : i2.matches("\\d+") ? Integer.valueOf(i2).intValue() : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: i */
    private boolean m26724i(C4332c0 c0Var, C4390t tVar) {
        C4390t i = c0Var.mo23855I().mo23815i();
        return i.mo24114m().equals(tVar.mo24114m()) && i.mo24120z() == tVar.mo24120z() && i.mo24104E().equals(tVar.mo24104E());
    }

    /* renamed from: a */
    public C4332c0 mo31916a(C10833u.C10834a aVar) {
        C4318a0 a = aVar.mo34023a();
        C10773g gVar = (C10773g) aVar;
        C4338e f = gVar.mo34028f();
        C4381p h = gVar.mo34030h();
        C10763g gVar2 = new C10763g(this.f20687a.mo24157f(), m26719c(a.mo23815i()), f, h, this.f20689c);
        this.f20688b = gVar2;
        C4332c0 c0Var = null;
        int i = 0;
        while (!this.f20690d) {
            try {
                C4332c0 j = gVar.mo34032j(a, gVar2, (C10768c) null, (C4357c) null);
                if (c0Var != null) {
                    C4332c0.C4333a u = j.mo23869u();
                    C4332c0.C4333a u2 = c0Var.mo23869u();
                    u2.mo23871b((C4336d0) null);
                    u.mo23880m(u2.mo23872c());
                    j = u.mo23872c();
                }
                try {
                    C4318a0 d = m26720d(j, gVar2.mo34010o());
                    if (d == null) {
                        gVar2.mo34008k();
                        return j;
                    }
                    C4345c.m12360g(j.mo23857a());
                    int i2 = i + 1;
                    if (i2 <= 20) {
                        d.mo23807a();
                        if (!m26724i(j, d.mo23815i())) {
                            gVar2.mo34008k();
                            gVar2 = new C10763g(this.f20687a.mo24157f(), m26719c(d.mo23815i()), f, h, this.f20689c);
                            this.f20688b = gVar2;
                        } else if (gVar2.mo34003c() != null) {
                            throw new IllegalStateException("Closing the body of " + j + " didn't close its backing stream. Bad interceptor?");
                        }
                        c0Var = j;
                        a = d;
                        i = i2;
                    } else {
                        gVar2.mo34008k();
                        throw new ProtocolException("Too many follow-up requests: " + i2);
                    }
                } catch (IOException e) {
                    gVar2.mo34008k();
                    throw e;
                }
            } catch (C10760e e2) {
                if (!m26722g(e2.mo33994c(), gVar2, false, a)) {
                    throw e2.mo33993b();
                }
            } catch (IOException e3) {
                if (!m26722g(e3, gVar2, !(e3 instanceof C10785a), a)) {
                    throw e3;
                }
            } catch (Throwable th) {
                gVar2.mo34011q((IOException) null);
                gVar2.mo34008k();
                throw th;
            }
        }
        gVar2.mo34008k();
        throw new IOException("Canceled");
    }

    /* renamed from: b */
    public void mo34034b() {
        this.f20690d = true;
        C10763g gVar = this.f20688b;
        if (gVar != null) {
            gVar.mo34002b();
        }
    }

    /* renamed from: e */
    public boolean mo34035e() {
        return this.f20690d;
    }

    /* renamed from: j */
    public void mo34036j(Object obj) {
        this.f20689c = obj;
    }
}
