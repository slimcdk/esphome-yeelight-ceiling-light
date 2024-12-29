package p164h.p211a.p212a.p217d.p218u;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10942n;

/* renamed from: h.a.a.d.u.b */
public class C10953b implements C10942n {

    /* renamed from: a */
    InputStream f21345a;

    /* renamed from: b */
    OutputStream f21346b;

    /* renamed from: c */
    int f21347c;

    /* renamed from: d */
    boolean f21348d;

    /* renamed from: e */
    boolean f21349e;

    public C10953b(InputStream inputStream, OutputStream outputStream) {
        this.f21345a = inputStream;
        this.f21346b = outputStream;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo34662A() {
        InputStream inputStream = this.f21345a;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: B */
    public final boolean mo34666B() {
        return !isOpen();
    }

    public void close() {
        InputStream inputStream = this.f21345a;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f21345a = null;
        OutputStream outputStream = this.f21346b;
        if (outputStream != null) {
            outputStream.close();
        }
        this.f21346b = null;
    }

    /* renamed from: f */
    public int mo34354f() {
        return 0;
    }

    public void flush() {
        OutputStream outputStream = this.f21346b;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    /* renamed from: g */
    public int mo34356g() {
        return this.f21347c;
    }

    /* renamed from: i */
    public String mo34358i() {
        return null;
    }

    public boolean isOpen() {
        return this.f21345a != null;
    }

    /* renamed from: j */
    public void mo34360j(int i) {
        this.f21347c = i;
    }

    /* renamed from: l */
    public void mo34362l() {
        InputStream inputStream;
        this.f21348d = true;
        if (this.f21349e && (inputStream = this.f21345a) != null) {
            inputStream.close();
        }
    }

    /* renamed from: m */
    public String mo34363m() {
        return null;
    }

    /* renamed from: n */
    public boolean mo34364n(long j) {
        return true;
    }

    /* renamed from: o */
    public boolean mo34365o() {
        return true;
    }

    /* renamed from: p */
    public int mo34366p(C10929e eVar, C10929e eVar2, C10929e eVar3) {
        int i;
        int length;
        int length2;
        if (eVar == null || (length2 = eVar.length()) <= 0) {
            i = 0;
        } else {
            i = mo34372u(eVar);
            if (i < length2) {
                return i;
            }
        }
        if (eVar2 != null && (length = eVar2.length()) > 0) {
            int u = mo34372u(eVar2);
            if (u < 0) {
                return i > 0 ? i : u;
            }
            i += u;
            if (u < length) {
                return i;
            }
        }
        if (eVar3 == null || eVar3.length() <= 0) {
            return i;
        }
        int u2 = mo34372u(eVar3);
        return u2 < 0 ? i > 0 ? i : u2 : i + u2;
    }

    /* renamed from: q */
    public String mo34367q() {
        return null;
    }

    /* renamed from: r */
    public boolean mo34368r() {
        return this.f21349e;
    }

    /* renamed from: s */
    public boolean mo34369s() {
        return this.f21348d;
    }

    /* renamed from: t */
    public void mo34370t() {
        OutputStream outputStream;
        this.f21349e = true;
        if (this.f21348d && (outputStream = this.f21346b) != null) {
            outputStream.close();
        }
    }

    /* renamed from: u */
    public int mo34372u(C10929e eVar) {
        if (this.f21349e) {
            return -1;
        }
        if (this.f21346b == null) {
            return 0;
        }
        int length = eVar.length();
        if (length > 0) {
            eVar.writeTo(this.f21346b);
        }
        if (!eVar.mo34588r0()) {
            eVar.clear();
        }
        return length;
    }

    /* renamed from: v */
    public boolean mo34373v(long j) {
        return true;
    }

    /* renamed from: w */
    public int mo34374w(C10929e eVar) {
        if (this.f21348d) {
            return -1;
        }
        if (this.f21345a == null) {
            return 0;
        }
        int I0 = eVar.mo34558I0();
        if (I0 > 0) {
            try {
                int y0 = eVar.mo34595y0(this.f21345a, I0);
                if (y0 < 0) {
                    mo34362l();
                }
                return y0;
            } catch (SocketTimeoutException unused) {
                mo34662A();
                return -1;
            }
        } else if (eVar.mo34556F0()) {
            return 0;
        } else {
            throw new IOException("FULL");
        }
    }

    /* renamed from: x */
    public int mo34375x() {
        return 0;
    }

    /* renamed from: z */
    public InputStream mo34667z() {
        return this.f21345a;
    }
}
