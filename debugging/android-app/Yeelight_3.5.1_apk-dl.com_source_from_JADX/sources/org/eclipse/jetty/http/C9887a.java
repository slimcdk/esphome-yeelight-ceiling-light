package org.eclipse.jetty.http;

import java.io.IOException;
import org.eclipse.jetty.p195io.Buffers;
import org.eclipse.jetty.p195io.EofException;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;
import p225w5.C11946h;
import p225w5.C11950k;
import p225w5.C11952m;

/* renamed from: org.eclipse.jetty.http.a */
public abstract class C9887a implements C9889c {

    /* renamed from: t */
    private static final C9003c f17989t = C9001b.m21450a(C9887a.class);

    /* renamed from: a */
    protected final Buffers f17990a;

    /* renamed from: b */
    protected final C11950k f17991b;

    /* renamed from: c */
    protected int f17992c = 0;

    /* renamed from: d */
    protected int f17993d = 0;

    /* renamed from: e */
    protected int f17994e = 11;

    /* renamed from: f */
    protected C11940d f17995f;

    /* renamed from: g */
    protected C11940d f17996g;

    /* renamed from: h */
    protected String f17997h;

    /* renamed from: i */
    protected long f17998i = 0;

    /* renamed from: j */
    protected long f17999j = -3;

    /* renamed from: k */
    protected boolean f18000k = false;

    /* renamed from: l */
    protected boolean f18001l = false;

    /* renamed from: m */
    protected boolean f18002m = false;

    /* renamed from: n */
    protected Boolean f18003n = null;

    /* renamed from: o */
    protected C11940d f18004o;

    /* renamed from: p */
    protected C11940d f18005p;

    /* renamed from: q */
    protected C11940d f18006q;

    /* renamed from: r */
    protected C11940d f18007r;

    /* renamed from: s */
    private boolean f18008s;

    public C9887a(Buffers buffers, C11950k kVar) {
        this.f17990a = buffers;
        this.f17991b = kVar;
    }

    /* renamed from: A */
    public boolean mo39707A() {
        C11940d dVar = this.f18005p;
        if (dVar == null || dVar.mo42410M0() != 0) {
            C11940d dVar2 = this.f18006q;
            return dVar2 != null && dVar2.length() > 0;
        }
        if (this.f18005p.length() == 0 && !this.f18005p.mo42438r0()) {
            this.f18005p.mo42407H0();
        }
        return this.f18005p.mo42410M0() == 0;
    }

    /* renamed from: B */
    public boolean mo39708B() {
        return this.f17991b.isOpen();
    }

    /* renamed from: C */
    public abstract boolean mo39709C();

    /* renamed from: D */
    public boolean mo39710D(int i) {
        return this.f17992c == i;
    }

    /* renamed from: E */
    public abstract int mo39711E();

    /* renamed from: F */
    public void mo39712F(String str, String str2) {
        this.f17996g = (str == null || "GET".equals(str)) ? C9909l.f18098b : C9909l.f18097a.mo42460g(str);
        this.f17997h = str2;
        if (this.f17994e == 9) {
            this.f18002m = true;
        }
    }

    /* renamed from: a */
    public boolean mo39713a() {
        return this.f17992c == 0 && this.f17996g == null && this.f17993d == 0;
    }

    /* renamed from: b */
    public void mo39714b() {
        if (this.f17992c < 3) {
            this.f18000k = false;
            this.f18003n = null;
            this.f17998i = 0;
            this.f17999j = -3;
            this.f18006q = null;
            C11940d dVar = this.f18005p;
            if (dVar != null) {
                dVar.clear();
                return;
            }
            return;
        }
        throw new IllegalStateException("Flushed");
    }

    /* renamed from: c */
    public void mo39715c(boolean z) {
        this.f18003n = Boolean.valueOf(z);
    }

    public void complete() {
        if (this.f17992c != 0) {
            long j = this.f17999j;
            if (j >= 0 && j != this.f17998i && !this.f18001l) {
                C9003c cVar = f17989t;
                if (cVar.mo36846a()) {
                    cVar.mo36850e("ContentLength written==" + this.f17998i + " != contentLength==" + this.f17999j, new Object[0]);
                }
                this.f18003n = Boolean.FALSE;
                return;
            }
            return;
        }
        throw new IllegalStateException("State==HEADER");
    }

    /* renamed from: d */
    public void mo39717d() {
        C11940d dVar = this.f18005p;
        if (dVar != null && dVar.length() == 0) {
            this.f17990a.mo39862b(this.f18005p);
            this.f18005p = null;
        }
        C11940d dVar2 = this.f18004o;
        if (dVar2 != null && dVar2.length() == 0) {
            this.f17990a.mo39862b(this.f18004o);
            this.f18004o = null;
        }
    }

    /* renamed from: e */
    public boolean mo39718e() {
        return this.f17992c == 4;
    }

    /* renamed from: f */
    public boolean mo39719f() {
        Boolean bool = this.f18003n;
        return bool != null ? bool.booleanValue() : mo39709C() || this.f17994e > 10;
    }

    /* renamed from: g */
    public boolean mo39720g() {
        return this.f17992c != 0;
    }

    /* renamed from: h */
    public void mo39721h(C11940d dVar) {
        this.f18007r = dVar;
    }

    /* renamed from: i */
    public void mo39722i(int i) {
        if (this.f17992c == 0) {
            this.f17994e = i;
            if (i == 9 && this.f17996g != null) {
                this.f18002m = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("STATE!=START " + this.f17992c);
    }

    /* renamed from: j */
    public boolean mo39723j() {
        long j = this.f17999j;
        return j >= 0 && this.f17998i >= j;
    }

    /* renamed from: k */
    public abstract int mo39724k();

    /* renamed from: m */
    public void mo39725m(int i, String str) {
        if (this.f17992c == 0) {
            this.f17996g = null;
            this.f17993d = i;
            if (str != null) {
                int length = str.length();
                if (length > 1024) {
                    length = 1024;
                }
                this.f17995f = new C11946h(length);
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt == 13 || charAt == 10) {
                        this.f17995f.mo42414S0((byte) 32);
                    } else {
                        this.f17995f.mo42414S0((byte) charAt);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("STATE!=START");
    }

    /* renamed from: n */
    public abstract void mo39726n(C9895h hVar, boolean z);

    /* renamed from: o */
    public void mo39727o(int i, String str, String str2, boolean z) {
        if (z) {
            this.f18003n = Boolean.FALSE;
        }
        if (mo39720g()) {
            f17989t.mo36850e("sendError on committed: {} {}", Integer.valueOf(i), str);
            return;
        }
        f17989t.mo36850e("sendError: {} {}", Integer.valueOf(i), str);
        mo39725m(i, str);
        if (str2 != null) {
            mo39726n((C9895h) null, false);
            mo39753l(new C11952m(new C11946h(str2)), true);
        } else {
            mo39726n((C9895h) null, true);
        }
        complete();
    }

    /* renamed from: p */
    public void mo39728p(boolean z) {
        this.f18001l = z;
    }

    /* renamed from: q */
    public void mo39729q(boolean z) {
        this.f18008s = z;
    }

    /* renamed from: r */
    public void mo39730r(long j) {
        if (j < 0) {
            j = -3;
        }
        this.f17999j = j;
    }

    public void reset() {
        this.f17992c = 0;
        this.f17993d = 0;
        this.f17994e = 11;
        this.f17995f = null;
        this.f18000k = false;
        this.f18001l = false;
        this.f18002m = false;
        this.f18003n = null;
        this.f17998i = 0;
        this.f17999j = -3;
        this.f18007r = null;
        this.f18006q = null;
        this.f17996g = null;
    }

    /* renamed from: s */
    public boolean mo39732s() {
        return this.f17998i > 0;
    }

    /* renamed from: t */
    public long mo39733t() {
        return this.f17998i;
    }

    /* renamed from: u */
    public int mo39734u() {
        if (this.f18005p == null) {
            this.f18005p = this.f17990a.mo39861a();
        }
        return this.f18005p.capacity();
    }

    /* renamed from: v */
    public void mo39735v(long j) {
        if (this.f17991b.mo39666o()) {
            try {
                mo39724k();
            } catch (IOException e) {
                this.f17991b.close();
                throw e;
            }
        } else if (this.f17991b.mo39672u(j)) {
            mo39724k();
        } else {
            this.f17991b.close();
            throw new EofException("timeout");
        }
    }

    /* renamed from: w */
    public void mo39736w() {
        C11940d dVar;
        if (this.f18002m) {
            dVar = this.f18005p;
            if (dVar == null) {
                return;
            }
        } else {
            this.f17998i += (long) this.f18005p.length();
            if (this.f18001l) {
                dVar = this.f18005p;
            } else {
                return;
            }
        }
        dVar.clear();
    }

    /* renamed from: x */
    public void mo39737x(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = j + currentTimeMillis;
        C11940d dVar = this.f18006q;
        C11940d dVar2 = this.f18005p;
        if ((dVar != null && dVar.length() > 0) || ((dVar2 != null && dVar2.length() > 0) || mo39707A())) {
            mo39724k();
            while (currentTimeMillis < j2) {
                if (((dVar != null && dVar.length() > 0) || (dVar2 != null && dVar2.length() > 0)) && this.f17991b.isOpen() && !this.f17991b.mo39668r()) {
                    mo39735v(j2 - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: y */
    public boolean mo39738y() {
        return this.f18008s;
    }

    /* renamed from: z */
    public C11940d mo39739z() {
        return this.f18005p;
    }
}
