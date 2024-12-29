package p164h.p211a.p212a.p228h.p232d0;

import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.d0.e */
public class C11115e {

    /* renamed from: e */
    private static final C11158c f21987e = C11156b.m29015a(C11115e.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Object f21988a;

    /* renamed from: b */
    private long f21989b;

    /* renamed from: c */
    private volatile long f21990c;

    /* renamed from: d */
    private C11116a f21991d;

    /* renamed from: h.a.a.h.d0.e$a */
    public static class C11116a {

        /* renamed from: a */
        C11116a f21992a = this;

        /* renamed from: b */
        C11116a f21993b = this;

        /* renamed from: c */
        C11115e f21994c;

        /* renamed from: d */
        long f21995d;

        /* renamed from: e */
        long f21996e = 0;

        /* renamed from: f */
        boolean f21997f;

        protected C11116a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m28850g(C11116a aVar) {
            C11116a aVar2 = this.f21992a;
            aVar2.f21993b = aVar;
            this.f21992a = aVar;
            aVar.f21992a = aVar2;
            this.f21992a.f21993b = this;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m28851h() {
            C11116a aVar = this.f21992a;
            aVar.f21993b = this.f21993b;
            this.f21993b.f21992a = aVar;
            this.f21993b = this;
            this.f21992a = this;
        }

        /* renamed from: d */
        public void mo35320d() {
            C11115e eVar = this.f21994c;
            if (eVar != null) {
                synchronized (eVar.f21988a) {
                    m28851h();
                    this.f21996e = 0;
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo35321e() {
        }

        /* renamed from: f */
        public void mo34200f() {
        }
    }

    public C11115e() {
        this.f21990c = System.currentTimeMillis();
        this.f21991d = new C11116a();
        this.f21988a = new Object();
        this.f21991d.f21994c = this;
    }

    public C11115e(Object obj) {
        this.f21990c = System.currentTimeMillis();
        C11116a aVar = new C11116a();
        this.f21991d = aVar;
        this.f21988a = obj;
        aVar.f21994c = this;
    }

    /* renamed from: b */
    public void mo35307b() {
        synchronized (this.f21988a) {
            C11116a aVar = this.f21991d;
            C11116a aVar2 = this.f21991d;
            C11116a aVar3 = this.f21991d;
            aVar2.f21993b = aVar3;
            aVar.f21992a = aVar3;
        }
    }

    /* renamed from: c */
    public C11116a mo35308c() {
        synchronized (this.f21988a) {
            long j = this.f21990c - this.f21989b;
            if (this.f21991d.f21992a == this.f21991d) {
                return null;
            }
            C11116a aVar = this.f21991d.f21992a;
            if (aVar.f21996e > j) {
                return null;
            }
            aVar.m28851h();
            aVar.f21997f = true;
            return aVar;
        }
    }

    /* renamed from: d */
    public long mo35309d() {
        return this.f21989b;
    }

    /* renamed from: e */
    public long mo35310e() {
        return this.f21990c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return r1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo35311f() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f21988a
            monitor-enter(r0)
            h.a.a.h.d0.e$a r1 = r6.f21991d     // Catch:{ all -> 0x0024 }
            h.a.a.h.d0.e$a r1 = r1.f21992a     // Catch:{ all -> 0x0024 }
            h.a.a.h.d0.e$a r2 = r6.f21991d     // Catch:{ all -> 0x0024 }
            if (r1 != r2) goto L_0x000f
            r1 = -1
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r1
        L_0x000f:
            long r1 = r6.f21989b     // Catch:{ all -> 0x0024 }
            h.a.a.h.d0.e$a r3 = r6.f21991d     // Catch:{ all -> 0x0024 }
            h.a.a.h.d0.e$a r3 = r3.f21992a     // Catch:{ all -> 0x0024 }
            long r3 = r3.f21996e     // Catch:{ all -> 0x0024 }
            long r1 = r1 + r3
            long r3 = r6.f21990c     // Catch:{ all -> 0x0024 }
            long r1 = r1 - r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0022
            r1 = r3
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r1
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.p232d0.C11115e.mo35311f():long");
    }

    /* renamed from: g */
    public void mo35312g(C11116a aVar) {
        mo35313h(aVar, 0);
    }

    /* renamed from: h */
    public void mo35313h(C11116a aVar, long j) {
        synchronized (this.f21988a) {
            if (aVar.f21996e != 0) {
                aVar.m28851h();
                aVar.f21996e = 0;
            }
            aVar.f21994c = this;
            aVar.f21997f = false;
            aVar.f21995d = j;
            aVar.f21996e = this.f21990c + j;
            C11116a aVar2 = this.f21991d;
            do {
                aVar2 = aVar2.f21993b;
                if (aVar2 == this.f21991d || aVar2.f21996e <= aVar.f21996e) {
                    aVar2.m28850g(aVar);
                }
                aVar2 = aVar2.f21993b;
                break;
            } while (aVar2.f21996e <= aVar.f21996e);
            aVar2.m28850g(aVar);
        }
    }

    /* renamed from: i */
    public void mo35314i(long j) {
        this.f21989b = j;
    }

    /* renamed from: j */
    public long mo35315j() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f21990c = currentTimeMillis;
        return currentTimeMillis;
    }

    /* renamed from: k */
    public void mo35316k(long j) {
        this.f21990c = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.mo34200f();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35317l() {
        /*
            r7 = this;
            long r0 = r7.f21990c
            long r2 = r7.f21989b
            long r0 = r0 - r2
        L_0x0005:
            java.lang.Object r2 = r7.f21988a     // Catch:{ all -> 0x002a }
            monitor-enter(r2)     // Catch:{ all -> 0x002a }
            h.a.a.h.d0.e$a r3 = r7.f21991d     // Catch:{ all -> 0x0027 }
            h.a.a.h.d0.e$a r3 = r3.f21992a     // Catch:{ all -> 0x0027 }
            h.a.a.h.d0.e$a r4 = r7.f21991d     // Catch:{ all -> 0x0027 }
            if (r3 == r4) goto L_0x0025
            long r4 = r3.f21996e     // Catch:{ all -> 0x0027 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0017
            goto L_0x0025
        L_0x0017:
            r3.m28851h()     // Catch:{ all -> 0x0027 }
            r4 = 1
            r3.f21997f = r4     // Catch:{ all -> 0x0027 }
            r3.mo35321e()     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            r3.mo34200f()     // Catch:{ all -> 0x002a }
            goto L_0x0005
        L_0x0025:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x002a:
            r2 = move-exception
            h.a.a.h.y.c r3 = f21987e
            java.lang.String r4 = "EXCEPTION "
            r3.mo35492h(r4, r2)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.p232d0.C11115e.mo35317l():void");
    }

    /* renamed from: m */
    public void mo35318m(long j) {
        this.f21990c = j;
        mo35317l();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        C11116a aVar = this.f21991d;
        while (true) {
            aVar = aVar.f21992a;
            if (aVar == this.f21991d) {
                return stringBuffer.toString();
            }
            stringBuffer.append("-->");
            stringBuffer.append(aVar);
        }
    }
}
