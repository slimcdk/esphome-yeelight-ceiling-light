package p011c.p083d.p084a;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.ProtocolException;
import p011c.p083d.p084a.C1136s;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.p085d0.C1015f;
import p011c.p083d.p084a.p085d0.p087n.C1090h;
import p011c.p083d.p084a.p085d0.p087n.C1099m;
import p011c.p083d.p084a.p085d0.p087n.C1101o;
import p011c.p083d.p084a.p085d0.p087n.C1102p;
import p011c.p083d.p084a.p085d0.p087n.C1103q;
import p163g.C4415s;

/* renamed from: c.d.a.e */
public class C1110e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1141v f1645a;

    /* renamed from: b */
    private boolean f1646b;

    /* renamed from: c */
    volatile boolean f1647c;

    /* renamed from: d */
    C1144x f1648d;

    /* renamed from: e */
    C1090h f1649e;

    /* renamed from: c.d.a.e$b */
    class C1112b implements C1136s.C1137a {

        /* renamed from: a */
        private final int f1650a;

        /* renamed from: b */
        private final C1144x f1651b;

        /* renamed from: c */
        private final boolean f1652c;

        C1112b(int i, C1144x xVar, boolean z) {
            this.f1650a = i;
            this.f1651b = xVar;
            this.f1652c = z;
        }

        /* renamed from: a */
        public C1144x mo9643a() {
            return this.f1651b;
        }

        /* renamed from: b */
        public C1150z mo9644b(C1144x xVar) {
            if (this.f1650a >= C1110e.this.f1645a.mo9800B().size()) {
                return C1110e.this.mo9673h(xVar, this.f1652c);
            }
            return C1110e.this.f1645a.mo9800B().get(this.f1650a).intercept(new C1112b(this.f1650a + 1, xVar, this.f1652c));
        }
    }

    /* renamed from: c.d.a.e$c */
    final class C1113c extends C1015f {

        /* renamed from: b */
        private final C1114f f1654b;

        /* renamed from: c */
        private final boolean f1655c;

        private C1113c(C1114f fVar, boolean z) {
            super("OkHttp %s", C1110e.this.f1648d.mo9845r());
            this.f1654b = fVar;
            this.f1655c = z;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0030 A[SYNTHETIC, Splitter:B:12:0x0030] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004f A[Catch:{ all -> 0x0029 }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9465b() {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                c.d.a.e r2 = p011c.p083d.p084a.C1110e.this     // Catch:{ IOException -> 0x002b }
                boolean r3 = r5.f1655c     // Catch:{ IOException -> 0x002b }
                c.d.a.z r2 = r2.m2611i(r3)     // Catch:{ IOException -> 0x002b }
                c.d.a.e r3 = p011c.p083d.p084a.C1110e.this     // Catch:{ IOException -> 0x002b }
                boolean r1 = r3.f1647c     // Catch:{ IOException -> 0x002b }
                if (r1 == 0) goto L_0x0021
                c.d.a.f r1 = r5.f1654b     // Catch:{ IOException -> 0x0027 }
                c.d.a.e r2 = p011c.p083d.p084a.C1110e.this     // Catch:{ IOException -> 0x0027 }
                c.d.a.x r2 = r2.f1648d     // Catch:{ IOException -> 0x0027 }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0027 }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ IOException -> 0x0027 }
                r1.onFailure(r2, r3)     // Catch:{ IOException -> 0x0027 }
                goto L_0x005c
            L_0x0021:
                c.d.a.f r1 = r5.f1654b     // Catch:{ IOException -> 0x0027 }
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
                java.util.logging.Logger r0 = p011c.p083d.p084a.p085d0.C1013d.f1320a     // Catch:{ all -> 0x0029 }
                java.util.logging.Level r2 = java.util.logging.Level.INFO     // Catch:{ all -> 0x0029 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
                r3.<init>()     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0029 }
                c.d.a.e r4 = p011c.p083d.p084a.C1110e.this     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.m2612k()     // Catch:{ all -> 0x0029 }
                r3.append(r4)     // Catch:{ all -> 0x0029 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0029 }
                r0.log(r2, r3, r1)     // Catch:{ all -> 0x0029 }
                goto L_0x005c
            L_0x004f:
                c.d.a.f r0 = r5.f1654b     // Catch:{ all -> 0x0029 }
                c.d.a.e r2 = p011c.p083d.p084a.C1110e.this     // Catch:{ all -> 0x0029 }
                c.d.a.d0.n.h r2 = r2.f1649e     // Catch:{ all -> 0x0029 }
                c.d.a.x r2 = r2.mo9637o()     // Catch:{ all -> 0x0029 }
                r0.onFailure(r2, r1)     // Catch:{ all -> 0x0029 }
            L_0x005c:
                c.d.a.e r0 = p011c.p083d.p084a.C1110e.this
                c.d.a.v r0 = r0.f1645a
                c.d.a.n r0 = r0.mo9821p()
                r0.mo9733d(r5)
                return
            L_0x006a:
                c.d.a.e r1 = p011c.p083d.p084a.C1110e.this
                c.d.a.v r1 = r1.f1645a
                c.d.a.n r1 = r1.mo9821p()
                r1.mo9733d(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C1110e.C1113c.mo9465b():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo9675g() {
            C1110e.this.mo9669d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1110e mo9676h() {
            return C1110e.this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public String mo9677i() {
            return C1110e.this.f1648d.mo9838k().mo9772q();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public Object mo9678j() {
            return C1110e.this.f1648d.mo9842o();
        }
    }

    protected C1110e(C1141v vVar, C1144x xVar) {
        this.f1645a = vVar.mo9814d();
        this.f1648d = xVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C1150z m2611i(boolean z) {
        return new C1112b(0, this.f1648d, z).mo9644b(this.f1648d);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public String m2612k() {
        String str = this.f1647c ? "canceled call" : NotificationCompat.CATEGORY_CALL;
        C1133r D = this.f1648d.mo9838k().mo9760D("/...");
        return str + " to " + D;
    }

    /* renamed from: d */
    public void mo9669d() {
        this.f1647c = true;
        C1090h hVar = this.f1649e;
        if (hVar != null) {
            hVar.mo9634l();
        }
    }

    /* renamed from: e */
    public void mo9670e(C1114f fVar) {
        mo9671f(fVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9671f(C1114f fVar, boolean z) {
        synchronized (this) {
            if (!this.f1646b) {
                this.f1646b = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f1645a.mo9821p().mo9731b(new C1113c(fVar, z));
    }

    /* renamed from: g */
    public C1150z mo9672g() {
        synchronized (this) {
            if (!this.f1646b) {
                this.f1646b = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            this.f1645a.mo9821p().mo9732c(this);
            C1150z i = m2611i(false);
            if (i != null) {
                return i;
            }
            throw new IOException("Canceled");
        } finally {
            this.f1645a.mo9821p().mo9734e(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1150z mo9673h(C1144x xVar, boolean z) {
        C1090h hVar;
        C1147y f = xVar.mo9833f();
        if (f != null) {
            C1144x.C1146b n = xVar.mo9841n();
            C1138t b = f.mo9797b();
            if (b != null) {
                n.mo9850i("Content-Type", b.toString());
            }
            long a = f.mo9796a();
            if (a != -1) {
                n.mo9850i("Content-Length", Long.toString(a));
                n.mo9854m("Transfer-Encoding");
            } else {
                n.mo9850i("Transfer-Encoding", "chunked");
                n.mo9854m("Content-Length");
            }
            xVar = n.mo9848g();
        }
        this.f1649e = new C1090h(this.f1645a, xVar, false, false, z, (C1120j) null, (C1103q) null, (C1101o) null, (C1150z) null);
        int i = 0;
        while (!this.f1647c) {
            try {
                this.f1649e.mo9631E();
                this.f1649e.mo9641y();
                C1150z p = this.f1649e.mo9638p();
                C1144x m = this.f1649e.mo9635m();
                if (m == null) {
                    if (!z) {
                        this.f1649e.mo9629C();
                    }
                    return p;
                }
                i++;
                if (i <= 20) {
                    if (!this.f1649e.mo9630D(m.mo9838k())) {
                        this.f1649e.mo9629C();
                    }
                    this.f1649e = new C1090h(this.f1645a, m, false, false, z, this.f1649e.mo9633f(), (C1103q) null, (C1101o) null, p);
                } else {
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
            } catch (C1099m e) {
                throw e.getCause();
            } catch (C1102p e2) {
                hVar = this.f1649e.mo9627A(e2);
                if (hVar == null) {
                    throw e2.mo9653c();
                }
                this.f1649e = hVar;
            } catch (IOException e3) {
                hVar = this.f1649e.mo9628B(e3, (C4415s) null);
                if (hVar == null) {
                    throw e3;
                }
                this.f1649e = hVar;
            }
        }
        this.f1649e.mo9629C();
        throw new IOException("Canceled");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Object mo9674j() {
        return this.f1648d.mo9842o();
    }
}
