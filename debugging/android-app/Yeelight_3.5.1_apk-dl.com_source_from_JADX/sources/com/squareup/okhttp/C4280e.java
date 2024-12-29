package com.squareup.okhttp;

import androidx.core.app.NotificationCompat;
import com.squareup.okhttp.C4305r;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.C9852q;
import p123a3.C3949h;
import p123a3.C3959n;
import p123a3.C3960o;
import p231y2.C12024f;

/* renamed from: com.squareup.okhttp.e */
public class C4280e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4310u f6938a;

    /* renamed from: b */
    private boolean f6939b;

    /* renamed from: c */
    volatile boolean f6940c;

    /* renamed from: d */
    C4312v f6941d;

    /* renamed from: e */
    C3949h f6942e;

    /* renamed from: com.squareup.okhttp.e$b */
    class C4282b implements C4305r.C4306a {

        /* renamed from: a */
        private final int f6943a;

        /* renamed from: b */
        private final C4312v f6944b;

        /* renamed from: c */
        private final boolean f6945c;

        C4282b(int i, C4312v vVar, boolean z) {
            this.f6943a = i;
            this.f6944b = vVar;
            this.f6945c = z;
        }

        /* renamed from: a */
        public C4312v mo26482a() {
            return this.f6944b;
        }

        /* renamed from: b */
        public C4318x mo26483b(C4312v vVar) {
            if (this.f6943a >= C4280e.this.f6938a.mo27987E().size()) {
                return C4280e.this.mo27854h(vVar, this.f6945c);
            }
            return C4280e.this.f6938a.mo27987E().get(this.f6943a).intercept(new C4282b(this.f6943a + 1, vVar, this.f6945c));
        }
    }

    /* renamed from: com.squareup.okhttp.e$c */
    final class C4283c extends C12024f {

        /* renamed from: b */
        private final C4284f f6947b;

        /* renamed from: c */
        private final boolean f6948c;

        private C4283c(C4284f fVar, boolean z) {
            super("OkHttp %s", C4280e.this.f6941d.mo28044r());
            this.f6947b = fVar;
            this.f6948c = z;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0030 A[SYNTHETIC, Splitter:B:12:0x0030] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004f A[Catch:{ all -> 0x0029 }] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo27856c() {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                com.squareup.okhttp.e r2 = com.squareup.okhttp.C4280e.this     // Catch:{ IOException -> 0x002b }
                boolean r3 = r5.f6948c     // Catch:{ IOException -> 0x002b }
                com.squareup.okhttp.x r2 = r2.m11892i(r3)     // Catch:{ IOException -> 0x002b }
                com.squareup.okhttp.e r3 = com.squareup.okhttp.C4280e.this     // Catch:{ IOException -> 0x002b }
                boolean r1 = r3.f6940c     // Catch:{ IOException -> 0x002b }
                if (r1 == 0) goto L_0x0021
                com.squareup.okhttp.f r1 = r5.f6947b     // Catch:{ IOException -> 0x0027 }
                com.squareup.okhttp.e r2 = com.squareup.okhttp.C4280e.this     // Catch:{ IOException -> 0x0027 }
                com.squareup.okhttp.v r2 = r2.f6941d     // Catch:{ IOException -> 0x0027 }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0027 }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ IOException -> 0x0027 }
                r1.onFailure(r2, r3)     // Catch:{ IOException -> 0x0027 }
                goto L_0x005c
            L_0x0021:
                com.squareup.okhttp.f r1 = r5.f6947b     // Catch:{ IOException -> 0x0027 }
                r1.onResponse(r2)     // Catch:{ IOException -> 0x0027 }
                goto L_0x005c
            L_0x0027:
                r1 = move-exception
                goto L_0x002e
            L_0x0029:
                r0 = move-exception
                goto L_0x006a
            L_0x002b:
                r0 = move-exception
                r1 = r0
                r0 = 0
            L_0x002e:
                if (r0 == 0) goto L_0x004f
                java.util.logging.Logger r0 = p231y2.C12022d.f22042a     // Catch:{ all -> 0x0029 }
                java.util.logging.Level r2 = java.util.logging.Level.INFO     // Catch:{ all -> 0x0029 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
                r3.<init>()     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0029 }
                com.squareup.okhttp.e r4 = com.squareup.okhttp.C4280e.this     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.m11893k()     // Catch:{ all -> 0x0029 }
                r3.append(r4)     // Catch:{ all -> 0x0029 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0029 }
                r0.log(r2, r3, r1)     // Catch:{ all -> 0x0029 }
                goto L_0x005c
            L_0x004f:
                com.squareup.okhttp.f r0 = r5.f6947b     // Catch:{ all -> 0x0029 }
                com.squareup.okhttp.e r2 = com.squareup.okhttp.C4280e.this     // Catch:{ all -> 0x0029 }
                a3.h r2 = r2.f6942e     // Catch:{ all -> 0x0029 }
                com.squareup.okhttp.v r2 = r2.mo26473o()     // Catch:{ all -> 0x0029 }
                r0.onFailure(r2, r1)     // Catch:{ all -> 0x0029 }
            L_0x005c:
                com.squareup.okhttp.e r0 = com.squareup.okhttp.C4280e.this
                com.squareup.okhttp.u r0 = r0.f6938a
                com.squareup.okhttp.m r0 = r0.mo28008o()
                r0.mo27920d(r5)
                return
            L_0x006a:
                com.squareup.okhttp.e r1 = com.squareup.okhttp.C4280e.this
                com.squareup.okhttp.u r1 = r1.f6938a
                com.squareup.okhttp.m r1 = r1.mo28008o()
                r1.mo27920d(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.C4280e.C4283c.mo27856c():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo27857d() {
            C4280e.this.mo27850d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C4280e mo27858f() {
            return C4280e.this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public String mo27859k() {
            return C4280e.this.f6941d.mo28037k().mo27959q();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Object mo27860l() {
            return C4280e.this.f6941d.mo28041o();
        }
    }

    protected C4280e(C4310u uVar, C4312v vVar) {
        this.f6938a = uVar.mo28001d();
        this.f6941d = vVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C4318x m11892i(boolean z) {
        return new C4282b(0, this.f6941d, z).mo26483b(this.f6941d);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public String m11893k() {
        String str = this.f6940c ? "canceled call" : NotificationCompat.CATEGORY_CALL;
        C4302q D = this.f6941d.mo28037k().mo27947D("/...");
        return str + " to " + D;
    }

    /* renamed from: d */
    public void mo27850d() {
        this.f6940c = true;
        C3949h hVar = this.f6942e;
        if (hVar != null) {
            hVar.mo26470l();
        }
    }

    /* renamed from: e */
    public void mo27851e(C4284f fVar) {
        mo27852f(fVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo27852f(C4284f fVar, boolean z) {
        synchronized (this) {
            if (!this.f6939b) {
                this.f6939b = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f6938a.mo28008o().mo27918b(new C4283c(fVar, z));
    }

    /* renamed from: g */
    public C4318x mo27853g() {
        synchronized (this) {
            if (!this.f6939b) {
                this.f6939b = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            this.f6938a.mo28008o().mo27919c(this);
            C4318x i = m11892i(false);
            if (i != null) {
                return i;
            }
            throw new IOException("Canceled");
        } finally {
            this.f6938a.mo28008o().mo27921e(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C4318x mo27854h(C4312v vVar, boolean z) {
        C3949h hVar;
        C4315w f = vVar.mo28032f();
        if (f != null) {
            C4312v.C4314b n = vVar.mo28040n();
            C4307s b = f.mo27983b();
            if (b != null) {
                n.mo28049i("Content-Type", b.toString());
            }
            long a = f.mo27982a();
            if (a != -1) {
                n.mo28049i("Content-Length", Long.toString(a));
                n.mo28053m("Transfer-Encoding");
            } else {
                n.mo28049i("Transfer-Encoding", "chunked");
                n.mo28053m("Content-Length");
            }
            vVar = n.mo28047g();
        }
        this.f6942e = new C3949h(this.f6938a, vVar, false, false, z, (C4289i) null, (C3960o) null, (C3959n) null, (C4318x) null);
        int i = 0;
        while (!this.f6940c) {
            try {
                this.f6942e.mo26467E();
                this.f6942e.mo26477y();
                C4318x p = this.f6942e.mo26474p();
                C4312v m = this.f6942e.mo26471m();
                if (m == null) {
                    if (!z) {
                        this.f6942e.mo26465C();
                    }
                    return p;
                }
                i++;
                if (i <= 20) {
                    if (!this.f6942e.mo26466D(m.mo28037k())) {
                        this.f6942e.mo26465C();
                    }
                    this.f6942e = new C3949h(this.f6938a, m, false, false, z, this.f6942e.mo26469f(), (C3960o) null, (C3959n) null, p);
                } else {
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
            } catch (RequestException e) {
                throw e.getCause();
            } catch (RouteException e2) {
                hVar = this.f6942e.mo26463A(e2);
                if (hVar == null) {
                    throw e2.getLastConnectException();
                }
                this.f6942e = hVar;
            } catch (IOException e3) {
                hVar = this.f6942e.mo26464B(e3, (C9852q) null);
                if (hVar == null) {
                    throw e3;
                }
                this.f6942e = hVar;
            }
        }
        this.f6942e.mo26465C();
        throw new IOException("Canceled");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Object mo27855j() {
        return this.f6941d.mo28041o();
    }
}
