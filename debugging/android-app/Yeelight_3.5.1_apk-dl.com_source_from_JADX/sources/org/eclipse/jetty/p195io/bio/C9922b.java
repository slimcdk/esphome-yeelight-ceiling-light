package org.eclipse.jetty.p195io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import p225w5.C11940d;
import p225w5.C11950k;

/* renamed from: org.eclipse.jetty.io.bio.b */
public class C9922b implements C11950k {

    /* renamed from: a */
    InputStream f18171a;

    /* renamed from: b */
    OutputStream f18172b;

    /* renamed from: c */
    int f18173c;

    /* renamed from: d */
    boolean f18174d;

    /* renamed from: e */
    boolean f18175e;

    public C9922b(InputStream inputStream, OutputStream outputStream) {
        this.f18171a = inputStream;
        this.f18172b = outputStream;
    }

    /* renamed from: B */
    public InputStream mo39876B() {
        return this.f18171a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo39872D() {
        InputStream inputStream = this.f18171a;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: E */
    public final boolean mo39877E() {
        return !isOpen();
    }

    public void close() {
        InputStream inputStream = this.f18171a;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f18171a = null;
        OutputStream outputStream = this.f18172b;
        if (outputStream != null) {
            outputStream.close();
        }
        this.f18172b = null;
    }

    /* renamed from: e */
    public int mo39654e() {
        return 0;
    }

    /* renamed from: f */
    public int mo39655f() {
        return this.f18173c;
    }

    public void flush() {
        OutputStream outputStream = this.f18172b;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    /* renamed from: h */
    public String mo39658h() {
        return null;
    }

    /* renamed from: i */
    public void mo39659i(int i) {
        this.f18173c = i;
    }

    public boolean isOpen() {
        return this.f18171a != null;
    }

    /* renamed from: k */
    public int mo39662k(C11940d dVar, C11940d dVar2, C11940d dVar3) {
        int i;
        int length;
        int length2;
        if (dVar == null || (length2 = dVar.length()) <= 0) {
            i = 0;
        } else {
            i = mo39674x(dVar);
            if (i < length2) {
                return i;
            }
        }
        if (dVar2 != null && (length = dVar2.length()) > 0) {
            int x = mo39674x(dVar2);
            if (x < 0) {
                return i > 0 ? i : x;
            }
            i += x;
            if (x < length) {
                return i;
            }
        }
        if (dVar3 == null || dVar3.length() <= 0) {
            return i;
        }
        int x2 = mo39674x(dVar3);
        return x2 < 0 ? i > 0 ? i : x2 : i + x2;
    }

    /* renamed from: l */
    public void mo39663l() {
        InputStream inputStream;
        this.f18174d = true;
        if (this.f18175e && (inputStream = this.f18171a) != null) {
            inputStream.close();
        }
    }

    /* renamed from: m */
    public String mo39664m() {
        return null;
    }

    /* renamed from: n */
    public boolean mo39665n(long j) {
        return true;
    }

    /* renamed from: o */
    public boolean mo39666o() {
        return true;
    }

    /* renamed from: q */
    public String mo39667q() {
        return null;
    }

    /* renamed from: r */
    public boolean mo39668r() {
        return this.f18175e;
    }

    /* renamed from: s */
    public boolean mo39669s() {
        return this.f18174d;
    }

    /* renamed from: t */
    public void mo39670t() {
        OutputStream outputStream;
        this.f18175e = true;
        if (this.f18174d && (outputStream = this.f18172b) != null) {
            outputStream.close();
        }
    }

    /* renamed from: u */
    public boolean mo39672u(long j) {
        return true;
    }

    /* renamed from: x */
    public int mo39674x(C11940d dVar) {
        if (this.f18175e) {
            return -1;
        }
        if (this.f18172b == null) {
            return 0;
        }
        int length = dVar.length();
        if (length > 0) {
            dVar.mo42433l(this.f18172b);
        }
        if (!dVar.mo42438r0()) {
            dVar.clear();
        }
        return length;
    }

    /* renamed from: z */
    public int mo26552z(C11940d dVar) {
        if (this.f18174d) {
            return -1;
        }
        if (this.f18171a == null) {
            return 0;
        }
        int M0 = dVar.mo42410M0();
        if (M0 > 0) {
            try {
                int y0 = dVar.mo42444y0(this.f18171a, M0);
                if (y0 < 0) {
                    mo39663l();
                }
                return y0;
            } catch (SocketTimeoutException unused) {
                mo39872D();
                return -1;
            }
        } else if (dVar.mo42408J0()) {
            return 0;
        } else {
            throw new IOException("FULL");
        }
    }
}
