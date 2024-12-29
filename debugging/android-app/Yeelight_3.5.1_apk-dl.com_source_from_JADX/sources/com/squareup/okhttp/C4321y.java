package com.squareup.okhttp;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Objects;
import okio.C3564c;
import okio.C9838e;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.y */
public abstract class C4321y implements Closeable {

    /* renamed from: a */
    private Reader f7102a;

    /* renamed from: com.squareup.okhttp.y$a */
    static class C4322a extends C4321y {

        /* renamed from: b */
        final /* synthetic */ C4307s f7103b;

        /* renamed from: c */
        final /* synthetic */ long f7104c;

        /* renamed from: d */
        final /* synthetic */ C9838e f7105d;

        C4322a(C4307s sVar, long j, C9838e eVar) {
            this.f7103b = sVar;
            this.f7104c = j;
            this.f7105d = eVar;
        }

        /* renamed from: h */
        public long mo26479h() {
            return this.f7104c;
        }

        /* renamed from: i */
        public C4307s mo26480i() {
            return this.f7103b;
        }

        /* renamed from: m */
        public C9838e mo26481m() {
            return this.f7105d;
        }
    }

    /* renamed from: f */
    private Charset m12220f() {
        C4307s i = mo26480i();
        return i != null ? i.mo27974b(C12033k.f22067c) : C12033k.f22067c;
    }

    /* renamed from: k */
    public static C4321y m12221k(C4307s sVar, long j, C9838e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        return new C4322a(sVar, j, eVar);
    }

    /* renamed from: l */
    public static C4321y m12222l(C4307s sVar, String str) {
        Charset charset = C12033k.f22067c;
        if (sVar != null) {
            Charset a = sVar.mo27973a();
            if (a == null) {
                sVar = C4307s.m12062c(sVar + "; charset=utf-8");
            } else {
                charset = a;
            }
        }
        C3564c v1 = new C3564c().mo24788v1(str, charset);
        return m12221k(sVar, v1.mo24758i1(), v1);
    }

    /* renamed from: a */
    public final InputStream mo28085a() {
        return mo26481m().mo24752f1();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final byte[] mo28086c() {
        long h = mo26479h();
        if (h <= 2147483647L) {
            C9838e m = mo26481m();
            try {
                byte[] O = m.mo24731O();
                C12033k.m31043c(m);
                if (h == -1 || h == ((long) O.length)) {
                    return O;
                }
                throw new IOException("Content-Length and stream length disagree");
            } catch (Throwable th) {
                C12033k.m31043c(m);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + h);
        }
    }

    public void close() {
        mo26481m().close();
    }

    /* renamed from: d */
    public final Reader mo28088d() {
        Reader reader = this.f7102a;
        if (reader != null) {
            return reader;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(mo28085a(), m12220f());
        this.f7102a = inputStreamReader;
        return inputStreamReader;
    }

    /* renamed from: h */
    public abstract long mo26479h();

    /* renamed from: i */
    public abstract C4307s mo26480i();

    /* renamed from: m */
    public abstract C9838e mo26481m();

    /* renamed from: n */
    public final String mo28089n() {
        return new String(mo28086c(), m12220f().name());
    }
}
