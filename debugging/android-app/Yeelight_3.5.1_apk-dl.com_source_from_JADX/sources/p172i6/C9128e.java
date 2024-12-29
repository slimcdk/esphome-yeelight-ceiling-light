package p172i6;

import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: i6.e */
public class C9128e {

    /* renamed from: e */
    private static final C9003c f16892e = C9001b.m21450a(C9128e.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Object f16893a;

    /* renamed from: b */
    private long f16894b;

    /* renamed from: c */
    private volatile long f16895c = System.currentTimeMillis();

    /* renamed from: d */
    private C9129a f16896d;

    /* renamed from: i6.e$a */
    public static class C9129a {

        /* renamed from: a */
        C9129a f16897a = this;

        /* renamed from: b */
        C9129a f16898b = this;

        /* renamed from: c */
        C9128e f16899c;

        /* renamed from: d */
        long f16900d = 0;

        protected C9129a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m21955g(C9129a aVar) {
            C9129a aVar2 = this.f16897a;
            aVar2.f16898b = aVar;
            this.f16897a = aVar;
            aVar.f16897a = aVar2;
            this.f16897a.f16898b = this;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m21956h() {
            C9129a aVar = this.f16897a;
            aVar.f16898b = this.f16898b;
            this.f16898b.f16897a = aVar;
            this.f16898b = this;
            this.f16897a = this;
        }

        /* renamed from: d */
        public void mo37215d() {
            C9128e eVar = this.f16899c;
            if (eVar != null) {
                synchronized (eVar.f16893a) {
                    m21956h();
                    this.f16900d = 0;
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo37216e() {
        }

        /* renamed from: f */
        public void mo37217f() {
        }
    }

    public C9128e() {
        C9129a aVar = new C9129a();
        this.f16896d = aVar;
        this.f16893a = new Object();
        aVar.f16899c = this;
    }

    public C9128e(Object obj) {
        C9129a aVar = new C9129a();
        this.f16896d = aVar;
        this.f16893a = obj;
        aVar.f16899c = this;
    }

    /* renamed from: b */
    public void mo37202b() {
        synchronized (this.f16893a) {
            C9129a aVar = this.f16896d;
            aVar.f16898b = aVar;
            aVar.f16897a = aVar;
        }
    }

    /* renamed from: c */
    public C9129a mo37203c() {
        synchronized (this.f16893a) {
            long j = this.f16895c - this.f16894b;
            C9129a aVar = this.f16896d;
            C9129a aVar2 = aVar.f16897a;
            if (aVar2 == aVar) {
                return null;
            }
            if (aVar2.f16900d > j) {
                return null;
            }
            aVar2.m21956h();
            return aVar2;
        }
    }

    /* renamed from: d */
    public long mo37204d() {
        return this.f16894b;
    }

    /* renamed from: e */
    public long mo37205e() {
        return this.f16895c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo37206f() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f16893a
            monitor-enter(r0)
            i6.e$a r1 = r6.f16896d     // Catch:{ all -> 0x001e }
            i6.e$a r2 = r1.f16897a     // Catch:{ all -> 0x001e }
            if (r2 != r1) goto L_0x000d
            r1 = -1
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return r1
        L_0x000d:
            long r3 = r6.f16894b     // Catch:{ all -> 0x001e }
            long r1 = r2.f16900d     // Catch:{ all -> 0x001e }
            long r3 = r3 + r1
            long r1 = r6.f16895c     // Catch:{ all -> 0x001e }
            long r3 = r3 - r1
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x001c
            r3 = r1
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return r3
        L_0x001e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p172i6.C9128e.mo37206f():long");
    }

    /* renamed from: g */
    public void mo37207g(C9129a aVar) {
        mo37208h(aVar, 0);
    }

    /* renamed from: h */
    public void mo37208h(C9129a aVar, long j) {
        synchronized (this.f16893a) {
            if (aVar.f16900d != 0) {
                aVar.m21956h();
                aVar.f16900d = 0;
            }
            aVar.f16899c = this;
            aVar.f16900d = this.f16895c + j;
            C9129a aVar2 = this.f16896d;
            do {
                aVar2 = aVar2.f16898b;
                if (aVar2 == this.f16896d || aVar2.f16900d <= aVar.f16900d) {
                    aVar2.m21955g(aVar);
                }
                aVar2 = aVar2.f16898b;
                break;
            } while (aVar2.f16900d <= aVar.f16900d);
            aVar2.m21955g(aVar);
        }
    }

    /* renamed from: i */
    public void mo37209i(long j) {
        this.f16894b = j;
    }

    /* renamed from: j */
    public long mo37210j() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f16895c = currentTimeMillis;
        return currentTimeMillis;
    }

    /* renamed from: k */
    public void mo37211k(long j) {
        this.f16895c = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.mo37217f();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37212l() {
        /*
            r7 = this;
            long r0 = r7.f16895c
            long r2 = r7.f16894b
            long r0 = r0 - r2
        L_0x0005:
            java.lang.Object r2 = r7.f16893a     // Catch:{ all -> 0x0025 }
            monitor-enter(r2)     // Catch:{ all -> 0x0025 }
            i6.e$a r3 = r7.f16896d     // Catch:{ all -> 0x0022 }
            i6.e$a r4 = r3.f16897a     // Catch:{ all -> 0x0022 }
            if (r4 == r3) goto L_0x0020
            long r5 = r4.f16900d     // Catch:{ all -> 0x0022 }
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            r4.m21956h()     // Catch:{ all -> 0x0022 }
            r4.mo37216e()     // Catch:{ all -> 0x0022 }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r4.mo37217f()     // Catch:{ all -> 0x0025 }
            goto L_0x0005
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r2 = move-exception
            e6.c r3 = f16892e
            java.lang.String r4 = "EXCEPTION "
            r3.mo36852g(r4, r2)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: p172i6.C9128e.mo37212l():void");
    }

    /* renamed from: m */
    public void mo37213m(long j) {
        this.f16895c = j;
        mo37212l();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        C9129a aVar = this.f16896d;
        while (true) {
            aVar = aVar.f16897a;
            if (aVar == this.f16896d) {
                return stringBuffer.toString();
            }
            stringBuffer.append("-->");
            stringBuffer.append(aVar);
        }
    }
}
