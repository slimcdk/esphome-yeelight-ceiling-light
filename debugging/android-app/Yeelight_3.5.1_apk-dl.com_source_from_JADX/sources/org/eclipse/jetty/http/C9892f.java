package org.eclipse.jetty.http;

import java.io.IOException;
import java.io.InputStream;
import p152e6.C9001b;
import p152e6.C9003c;
import p157f6.C9042e;
import p225w5.C11940d;
import p225w5.C11946h;

/* renamed from: org.eclipse.jetty.http.f */
public interface C9892f {

    /* renamed from: org.eclipse.jetty.http.f$a */
    public static class C9893a implements C9892f {

        /* renamed from: d */
        private static final C9003c f18021d = C9001b.m21450a(C9893a.class);

        /* renamed from: a */
        final C9042e f18022a;

        /* renamed from: b */
        final C11940d f18023b;

        /* renamed from: c */
        final int f18024c;

        public C9893a(C9042e eVar, C11940d dVar) {
            this.f18022a = eVar;
            this.f18023b = dVar;
            this.f18024c = -1;
        }

        public C9893a(C9042e eVar, C11940d dVar, int i) {
            this.f18022a = eVar;
            this.f18023b = dVar;
            this.f18024c = i;
        }

        /* renamed from: d */
        public InputStream mo39760d() {
            return this.f18022a.mo36921f();
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [w5.d, java.io.InputStream] */
        /* renamed from: e */
        public C11940d mo39761e() {
            ? r1 = 0;
            try {
                if (this.f18022a.mo36924l() > 0) {
                    if (((long) this.f18024c) >= this.f18022a.mo36924l()) {
                        C11946h hVar = new C11946h((int) this.f18022a.mo36924l());
                        InputStream f = this.f18022a.mo36921f();
                        hVar.mo42444y0(f, (int) this.f18022a.mo36924l());
                        if (f != null) {
                            try {
                                f.close();
                            } catch (IOException e) {
                                f18021d.mo36852g("Couldn't close inputStream. Possible file handle leak", e);
                            }
                        }
                        return hVar;
                    }
                }
                return r1;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            } catch (Throwable th) {
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e3) {
                        f18021d.mo36852g("Couldn't close inputStream. Possible file handle leak", e3);
                    }
                }
                throw th;
            }
        }

        /* renamed from: f */
        public C11940d mo39762f() {
            return null;
        }

        /* renamed from: g */
        public C9042e mo39763g() {
            return this.f18022a;
        }

        public C11940d getContentType() {
            return this.f18023b;
        }

        public C11940d getLastModified() {
            return null;
        }

        /* renamed from: h */
        public long mo39766h() {
            return this.f18022a.mo36924l();
        }

        public void release() {
            this.f18022a.mo36931r();
        }
    }

    /* renamed from: d */
    InputStream mo39760d();

    /* renamed from: e */
    C11940d mo39761e();

    /* renamed from: f */
    C11940d mo39762f();

    /* renamed from: g */
    C9042e mo39763g();

    C11940d getContentType();

    C11940d getLastModified();

    /* renamed from: h */
    long mo39766h();

    void release();
}
