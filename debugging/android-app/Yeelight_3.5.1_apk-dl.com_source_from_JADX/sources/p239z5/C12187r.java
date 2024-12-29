package p239z5;

import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import org.eclipse.jetty.http.C9904i;
import org.eclipse.jetty.http.C9914p;
import org.eclipse.jetty.server.handler.C9950h;
import org.eclipse.jetty.util.C9978b;
import org.eclipse.jetty.util.C9979c;
import org.eclipse.jetty.util.C9996o;
import org.eclipse.jetty.util.C9997p;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import p147d6.C8942b;
import p147d6.C8944c;
import p152e6.C9001b;
import p152e6.C9003c;
import p172i6.C9122b;
import p172i6.C9126c;
import p172i6.C9127d;
import p239z5.C12156c;

/* renamed from: z5.r */
public class C12187r extends C9950h implements C9978b {

    /* renamed from: w */
    private static final C9003c f22511w;

    /* renamed from: x */
    private static final String f22512x;

    /* renamed from: k */
    private final C8944c f22513k = new C8944c();

    /* renamed from: l */
    private final C9979c f22514l = new C9979c();

    /* renamed from: m */
    private C9127d f22515m;

    /* renamed from: n */
    private C12170f[] f22516n;

    /* renamed from: o */
    private C12191u f22517o;

    /* renamed from: p */
    private boolean f22518p = true;

    /* renamed from: q */
    private boolean f22519q = false;

    /* renamed from: r */
    private int f22520r = 0;

    /* renamed from: s */
    private boolean f22521s;

    /* renamed from: t */
    private boolean f22522t = false;

    /* renamed from: u */
    private boolean f22523u = false;

    /* renamed from: v */
    private boolean f22524v = false;

    /* renamed from: z5.r$a */
    public interface C12188a extends C12175i {
        /* renamed from: C */
        void mo39927C(boolean z);
    }

    static {
        Class<C12187r> cls = C12187r.class;
        f22511w = C9001b.m21450a(cls);
        f22512x = (cls.getPackage() == null || !"Eclipse.org - Jetty".equals(cls.getPackage().getImplementationVendor()) || cls.getPackage().getImplementationVersion() == null) ? System.getProperty("jetty.version", "8.y.z-SNAPSHOT") : cls.getPackage().getImplementationVersion();
    }

    public C12187r() {
        mo26716i(this);
    }

    /* renamed from: D0 */
    public boolean mo36753D0(Object obj) {
        if (!super.mo36753D0(obj)) {
            return false;
        }
        this.f22513k.mo36763b(obj);
        return true;
    }

    /* renamed from: N0 */
    public boolean mo36761N0(Object obj) {
        if (!super.mo36761N0(obj)) {
            return false;
        }
        this.f22513k.mo36764d(obj);
        return true;
    }

    /* renamed from: T0 */
    public void mo43167T0(C12170f fVar) {
        mo43181h1((C12170f[]) LazyList.addToArray(mo43168U0(), fVar, C12170f.class));
    }

    /* renamed from: U0 */
    public C12170f[] mo43168U0() {
        return this.f22516n;
    }

    /* renamed from: V0 */
    public C8944c mo43169V0() {
        return this.f22513k;
    }

    /* renamed from: W0 */
    public boolean mo43170W0() {
        return this.f22519q;
    }

    /* renamed from: X0 */
    public boolean mo43171X0() {
        return this.f22518p;
    }

    /* renamed from: Y0 */
    public C12191u mo43172Y0() {
        return this.f22517o;
    }

    /* renamed from: Z0 */
    public boolean mo43173Z0() {
        return this.f22521s;
    }

    /* renamed from: a */
    public Object mo39576a(String str) {
        return this.f22514l.mo39576a(str);
    }

    /* renamed from: a1 */
    public C9127d mo43174a1() {
        return this.f22515m;
    }

    /* renamed from: b */
    public void mo39578b(String str, Object obj) {
        this.f22514l.mo39578b(str, obj);
    }

    /* renamed from: b0 */
    public void mo39579b0() {
        this.f22514l.mo39579b0();
    }

    /* renamed from: b1 */
    public void mo43175b1(C12151b bVar) {
        String g = bVar.mo42994v().mo37763g();
        C12181o v = bVar.mo42994v();
        C12186q z = bVar.mo42998z();
        C9003c cVar = f22511w;
        if (cVar.mo36846a()) {
            cVar.mo36850e("REQUEST " + g + " on " + bVar, new Object[0]);
            mo39972q(g, v, v, z);
            cVar.mo36850e("RESPONSE " + g + "  " + bVar.mo42998z().mo43149B() + " handled=" + v.mo43100Z(), new Object[0]);
            return;
        }
        mo39972q(g, v, v, z);
    }

    /* renamed from: c1 */
    public void mo43176c1(C12151b bVar) {
        C12156c z = bVar.mo42994v().mo43129z();
        C12156c.C12157a l = z.mo43012l();
        C12181o v = bVar.mo42994v();
        String g = l.mo43028g();
        if (g != null) {
            C9914p pVar = new C9914p(C9997p.m24723a(l.mo43029h().mo39961e(), g));
            v.mo43080H0(pVar);
            v.mo43126x0((String) null);
            v.mo43118r0(v.mo37774w());
            if (pVar.mo39749l() != null) {
                v.mo43102b0(pVar.mo39749l());
            }
        }
        String g2 = v.mo37763g();
        C9277a aVar = (C9277a) z.mo43015o();
        C9279c cVar = (C9279c) z.mo41933d();
        C9003c cVar2 = f22511w;
        if (cVar2.mo36846a()) {
            cVar2.mo36850e("REQUEST " + g2 + " on " + bVar, new Object[0]);
            mo39972q(g2, v, aVar, cVar);
            cVar2.mo36850e("RESPONSE " + g2 + "  " + bVar.mo42998z().mo43149B(), new Object[0]);
            return;
        }
        mo39972q(g2, v, aVar, cVar);
    }

    /* renamed from: d */
    public void mo39582d(String str) {
        this.f22514l.mo39582d(str);
    }

    /* renamed from: d1 */
    public boolean mo43177d1() {
        return this.f22522t;
    }

    /* renamed from: e1 */
    public boolean mo43178e1() {
        return this.f22523u;
    }

    /* renamed from: f1 */
    public boolean mo43179f1() {
        return this.f22524v;
    }

    /* renamed from: g1 */
    public void mo43180g1(C12170f fVar) {
        mo43181h1((C12170f[]) LazyList.removeFromArray(mo43168U0(), fVar));
    }

    /* renamed from: h1 */
    public void mo43181h1(C12170f[] fVarArr) {
        if (fVarArr != null) {
            for (C12170f i : fVarArr) {
                i.mo42950i(this);
            }
        }
        this.f22513k.mo36767g(this, this.f22516n, fVarArr, "connector");
        this.f22516n = fVarArr;
    }

    /* renamed from: i1 */
    public void mo43182i1(int i) {
        this.f22520r = i;
    }

    /* renamed from: j1 */
    public void mo43183j1(C12191u uVar) {
        C12191u uVar2 = this.f22517o;
        if (uVar2 != null) {
            mo36761N0(uVar2);
        }
        this.f22513k.mo36766f(this, this.f22517o, uVar, "sessionIdManager", false);
        this.f22517o = uVar;
        if (uVar != null) {
            mo36753D0(uVar);
        }
    }

    /* renamed from: k1 */
    public void mo43184k1(C9127d dVar) {
        C9127d dVar2 = this.f22515m;
        if (dVar2 != null) {
            mo36761N0(dVar2);
        }
        this.f22513k.mo36766f(this, this.f22515m, dVar, "threadpool", false);
        this.f22515m = dVar;
        if (dVar != null) {
            mo36753D0(dVar);
        }
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        mo36757J0(appendable);
        C8942b.m21357G0(appendable, str, C9996o.m24714a(mo39981o()), mo36759L0(), C9996o.m24714a(this.f22516n));
    }

    public String toString() {
        return C12187r.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        int i = 0;
        if (mo43173Z0()) {
            C9126c.m21936d(this);
        }
        C9003c cVar = f22511w;
        StringBuilder sb = new StringBuilder();
        sb.append("jetty-");
        String str = f22512x;
        sb.append(str);
        cVar.mo36855i(sb.toString(), new Object[0]);
        C9904i.m24225M(str);
        MultiException multiException = new MultiException();
        if (this.f22515m == null) {
            mo43184k1(new C9122b());
        }
        try {
            super.mo26547u0();
        } catch (Throwable th) {
            multiException.add(th);
        }
        if (this.f22516n != null && multiException.size() == 0) {
            while (true) {
                C12170f[] fVarArr = this.f22516n;
                if (i >= fVarArr.length) {
                    break;
                }
                try {
                    fVarArr[i].start();
                } catch (Throwable th2) {
                    multiException.add(th2);
                }
                i++;
            }
        }
        if (mo43177d1()) {
            mo36756I0();
        }
        multiException.ifExceptionThrow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26548v0() {
        /*
            r9 = this;
            boolean r0 = r9.mo43178e1()
            if (r0 == 0) goto L_0x0009
            r9.mo36756I0()
        L_0x0009:
            org.eclipse.jetty.util.MultiException r0 = new org.eclipse.jetty.util.MultiException
            r0.<init>()
            int r1 = r9.f22520r
            if (r1 <= 0) goto L_0x005d
            z5.f[] r1 = r9.f22516n
            java.lang.String r2 = "Graceful shutdown {}"
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x003a
            int r1 = r1.length
        L_0x001b:
            int r5 = r1 + -1
            if (r1 <= 0) goto L_0x003a
            e6.c r1 = f22511w
            java.lang.Object[] r6 = new java.lang.Object[r4]
            z5.f[] r7 = r9.f22516n
            r7 = r7[r5]
            r6[r3] = r7
            r1.mo36855i(r2, r6)
            z5.f[] r1 = r9.f22516n     // Catch:{ all -> 0x0034 }
            r1 = r1[r5]     // Catch:{ all -> 0x0034 }
            r1.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r1 = move-exception
            r0.add(r1)
        L_0x0038:
            r1 = r5
            goto L_0x001b
        L_0x003a:
            java.lang.Class<z5.r$a> r1 = p239z5.C12187r.C12188a.class
            z5.i[] r1 = r9.mo39921P(r1)
            r5 = 0
        L_0x0041:
            int r6 = r1.length
            if (r5 >= r6) goto L_0x0057
            r6 = r1[r5]
            z5.r$a r6 = (p239z5.C12187r.C12188a) r6
            e6.c r7 = f22511w
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r3] = r6
            r7.mo36855i(r2, r8)
            r6.mo39927C(r4)
            int r5 = r5 + 1
            goto L_0x0041
        L_0x0057:
            int r1 = r9.f22520r
            long r1 = (long) r1
            java.lang.Thread.sleep(r1)
        L_0x005d:
            z5.f[] r1 = r9.f22516n
            if (r1 == 0) goto L_0x0074
            int r1 = r1.length
        L_0x0062:
            int r2 = r1 + -1
            if (r1 <= 0) goto L_0x0074
            z5.f[] r1 = r9.f22516n     // Catch:{ all -> 0x006e }
            r1 = r1[r2]     // Catch:{ all -> 0x006e }
            r1.stop()     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r1 = move-exception
            r0.add(r1)
        L_0x0072:
            r1 = r2
            goto L_0x0062
        L_0x0074:
            super.mo26548v0()     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r1 = move-exception
            r0.add(r1)
        L_0x007c:
            r0.ifExceptionThrow()
            boolean r0 = r9.mo43173Z0()
            if (r0 == 0) goto L_0x0088
            p172i6.C9126c.m21934b(r9)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12187r.mo26548v0():void");
    }
}
