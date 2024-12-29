package p164h.p211a.p212a.p222f;

import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p216c.C10906j;
import p164h.p211a.p212a.p216c.C10918r;
import p164h.p211a.p212a.p222f.C11015c;
import p164h.p211a.p212a.p222f.p224w.C11059g;
import p164h.p211a.p212a.p228h.C11100b;
import p164h.p211a.p212a.p228h.C11104c;
import p164h.p211a.p212a.p228h.C11126j;
import p164h.p211a.p212a.p228h.C11128l;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.p232d0.C11109b;
import p164h.p211a.p212a.p228h.p232d0.C11113c;
import p164h.p211a.p212a.p228h.p232d0.C11114d;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11148c;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.p */
public class C11040p extends C11059g implements C11100b {

    /* renamed from: w */
    private static final C11158c f21687w;

    /* renamed from: x */
    private static final String f21688x;

    /* renamed from: k */
    private final C11148c f21689k = new C11148c();

    /* renamed from: l */
    private final C11104c f21690l = new C11104c();

    /* renamed from: m */
    private C11114d f21691m;

    /* renamed from: n */
    private C11028f[] f21692n;

    /* renamed from: o */
    private C11044s f21693o;

    /* renamed from: p */
    private boolean f21694p = true;

    /* renamed from: q */
    private boolean f21695q = false;

    /* renamed from: r */
    private int f21696r = 0;

    /* renamed from: s */
    private boolean f21697s;

    /* renamed from: t */
    private boolean f21698t = false;

    /* renamed from: u */
    private boolean f21699u = false;

    /* renamed from: v */
    private boolean f21700v = false;

    /* renamed from: h.a.a.f.p$a */
    public interface C11041a extends C11032i {
        /* renamed from: z */
        void mo35021z(boolean z);
    }

    static {
        Class<C11040p> cls = C11040p.class;
        f21687w = C11156b.m29015a(cls);
        f21688x = (cls.getPackage() == null || !"Eclipse.org - Jetty".equals(cls.getPackage().getImplementationVendor()) || cls.getPackage().getImplementationVersion() == null) ? System.getProperty("jetty.version", "8.y.z-SNAPSHOT") : cls.getPackage().getImplementationVersion();
    }

    public C11040p() {
        mo34901i(this);
    }

    /* renamed from: I0 */
    public boolean mo35000I0(Object obj) {
        if (!super.mo35000I0(obj)) {
            return false;
        }
        this.f21689k.mo35465d(obj);
        return true;
    }

    /* renamed from: O0 */
    public void mo35001O0(C11028f fVar) {
        mo35015c1((C11028f[]) C11126j.m28881d(mo35002P0(), fVar, C11028f.class));
    }

    /* renamed from: P0 */
    public C11028f[] mo35002P0() {
        return this.f21692n;
    }

    /* renamed from: Q0 */
    public C11148c mo35003Q0() {
        return this.f21689k;
    }

    /* renamed from: R0 */
    public boolean mo35004R0() {
        return this.f21695q;
    }

    /* renamed from: S0 */
    public boolean mo35005S0() {
        return this.f21694p;
    }

    /* renamed from: T0 */
    public C11044s mo35006T0() {
        return this.f21693o;
    }

    /* renamed from: U0 */
    public boolean mo35007U0() {
        return this.f21697s;
    }

    /* renamed from: V0 */
    public C11114d mo35008V0() {
        return this.f21691m;
    }

    /* renamed from: W0 */
    public void mo35009W0(C11010b bVar) {
        String h = bVar.mo34849v().mo33920h();
        C11037n v = bVar.mo34849v();
        C11039o z = bVar.mo34853z();
        if (f21687w.mo35485a()) {
            C11158c cVar = f21687w;
            cVar.mo35489e("REQUEST " + h + " on " + bVar, new Object[0]);
            mo34757L(h, v, v, z);
            C11158c cVar2 = f21687w;
            cVar2.mo35489e("RESPONSE " + h + "  " + bVar.mo34853z().mo34994u() + " handled=" + v.mo34954Z(), new Object[0]);
            return;
        }
        mo34757L(h, v, v, z);
    }

    /* renamed from: X0 */
    public void mo35010X0(C11010b bVar) {
        C11015c y = bVar.mo34849v().mo34982y();
        C11015c.C11016a j = y.mo34864j();
        C11037n v = bVar.mo34849v();
        String g = j.mo34881g();
        if (g != null) {
            C10918r rVar = new C10918r(C11139s.m28935a(j.mo34882h().mo33959e(), g));
            v.mo34934H0(rVar);
            v.mo34981x0((String) null);
            v.mo34972r0(v.mo33929v());
            if (rVar.mo34428l() != null) {
                v.mo34956b0(rVar.mo34428l());
            }
        }
        String h = v.mo33920h();
        C10709c cVar = (C10709c) y.mo34866l();
        C10711e eVar = (C10711e) y.mo33881b();
        if (f21687w.mo35485a()) {
            C11158c cVar2 = f21687w;
            cVar2.mo35489e("REQUEST " + h + " on " + bVar, new Object[0]);
            mo34757L(h, v, cVar, eVar);
            C11158c cVar3 = f21687w;
            cVar3.mo35489e("RESPONSE " + h + "  " + bVar.mo34853z().mo34994u(), new Object[0]);
            return;
        }
        mo34757L(h, v, cVar, eVar);
    }

    /* renamed from: Y0 */
    public boolean mo35011Y0() {
        return this.f21698t;
    }

    /* renamed from: Z */
    public void mo34249Z() {
        this.f21690l.mo34249Z();
    }

    /* renamed from: Z0 */
    public boolean mo35012Z0() {
        return this.f21699u;
    }

    /* renamed from: a */
    public Object mo34251a(String str) {
        return this.f21690l.mo34251a(str);
    }

    /* renamed from: a1 */
    public boolean mo35013a1() {
        return this.f21700v;
    }

    /* renamed from: b */
    public void mo34253b(String str, Object obj) {
        this.f21690l.mo34253b(str, obj);
    }

    /* renamed from: b1 */
    public void mo35014b1(C11028f fVar) {
        mo35015c1((C11028f[]) C11126j.m28889p(mo35002P0(), fVar));
    }

    /* renamed from: c1 */
    public void mo35015c1(C11028f[] fVarArr) {
        if (fVarArr != null) {
            for (C11028f i : fVarArr) {
                i.mo34816i(this);
            }
        }
        this.f21689k.mo35468g(this, this.f21692n, fVarArr, "connector");
        this.f21692n = fVarArr;
    }

    /* renamed from: d1 */
    public void mo35016d1(int i) {
        this.f21696r = i;
    }

    /* renamed from: e */
    public void mo34256e(String str) {
        this.f21690l.mo34256e(str);
    }

    /* renamed from: e1 */
    public void mo35017e1(C11044s sVar) {
        C11044s sVar2 = this.f21693o;
        if (sVar2 != null) {
            mo35000I0(sVar2);
        }
        this.f21689k.mo35467f(this, this.f21693o, sVar, "sessionIdManager", false);
        this.f21693o = sVar;
        if (sVar != null) {
            mo35020y0(sVar);
        }
    }

    /* renamed from: f1 */
    public void mo35018f1(C11114d dVar) {
        C11114d dVar2 = this.f21691m;
        if (dVar2 != null) {
            mo35000I0(dVar2);
        }
        this.f21689k.mo35467f(this, this.f21691m, dVar, "threadpool", false);
        this.f21691m = dVar;
        if (dVar != null) {
            mo35020y0(dVar);
        }
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        mo35048E0(appendable);
        C11146b.m28976B0(appendable, str, C11138r.m28927a(mo34903n()), mo35460G0(), C11138r.m28927a(this.f21692n));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        int i = 0;
        if (mo35007U0()) {
            C11113c.m28831d(this);
        }
        C11158c cVar = f21687w;
        cVar.mo35494j("jetty-" + f21688x, new Object[0]);
        C10906j.m27498K(f21688x);
        C11128l lVar = new C11128l();
        if (this.f21691m == null) {
            mo35018f1(new C11109b());
        }
        try {
            super.mo34262p0();
        } catch (Throwable th) {
            lVar.mo35374a(th);
        }
        if (this.f21692n != null && lVar.mo35379f() == 0) {
            while (true) {
                C11028f[] fVarArr = this.f21692n;
                if (i >= fVarArr.length) {
                    break;
                }
                try {
                    fVarArr[i].start();
                } catch (Throwable th2) {
                    lVar.mo35374a(th2);
                }
                i++;
            }
        }
        if (mo35011Y0()) {
            mo35458D0();
        }
        lVar.mo35376c();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34263q0() {
        /*
            r9 = this;
            boolean r0 = r9.mo35012Z0()
            if (r0 == 0) goto L_0x0009
            r9.mo35458D0()
        L_0x0009:
            h.a.a.h.l r0 = new h.a.a.h.l
            r0.<init>()
            int r1 = r9.f21696r
            if (r1 <= 0) goto L_0x005d
            h.a.a.f.f[] r1 = r9.f21692n
            java.lang.String r2 = "Graceful shutdown {}"
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x003a
            int r1 = r1.length
        L_0x001b:
            int r5 = r1 + -1
            if (r1 <= 0) goto L_0x003a
            h.a.a.h.y.c r1 = f21687w
            java.lang.Object[] r6 = new java.lang.Object[r4]
            h.a.a.f.f[] r7 = r9.f21692n
            r7 = r7[r5]
            r6[r3] = r7
            r1.mo35494j(r2, r6)
            h.a.a.f.f[] r1 = r9.f21692n     // Catch:{ all -> 0x0034 }
            r1 = r1[r5]     // Catch:{ all -> 0x0034 }
            r1.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r1 = move-exception
            r0.mo35374a(r1)
        L_0x0038:
            r1 = r5
            goto L_0x001b
        L_0x003a:
            java.lang.Class<h.a.a.f.p$a> r1 = p164h.p211a.p212a.p222f.C11040p.C11041a.class
            h.a.a.f.i[] r1 = r9.mo34902O(r1)
            r5 = 0
        L_0x0041:
            int r6 = r1.length
            if (r5 >= r6) goto L_0x0057
            r6 = r1[r5]
            h.a.a.f.p$a r6 = (p164h.p211a.p212a.p222f.C11040p.C11041a) r6
            h.a.a.h.y.c r7 = f21687w
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r3] = r6
            r7.mo35494j(r2, r8)
            r6.mo35021z(r4)
            int r5 = r5 + 1
            goto L_0x0041
        L_0x0057:
            int r1 = r9.f21696r
            long r1 = (long) r1
            java.lang.Thread.sleep(r1)
        L_0x005d:
            h.a.a.f.f[] r1 = r9.f21692n
            if (r1 == 0) goto L_0x0074
            int r1 = r1.length
        L_0x0062:
            int r2 = r1 + -1
            if (r1 <= 0) goto L_0x0074
            h.a.a.f.f[] r1 = r9.f21692n     // Catch:{ all -> 0x006e }
            r1 = r1[r2]     // Catch:{ all -> 0x006e }
            r1.stop()     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r1 = move-exception
            r0.mo35374a(r1)
        L_0x0072:
            r1 = r2
            goto L_0x0062
        L_0x0074:
            super.mo34263q0()     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r1 = move-exception
            r0.mo35374a(r1)
        L_0x007c:
            r0.mo35376c()
            boolean r0 = r9.mo35007U0()
            if (r0 == 0) goto L_0x0088
            p164h.p211a.p212a.p228h.p232d0.C11113c.m28829b(r9)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11040p.mo34263q0():void");
    }

    public String toString() {
        return C11040p.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    /* renamed from: y0 */
    public boolean mo35020y0(Object obj) {
        if (!super.mo35020y0(obj)) {
            return false;
        }
        this.f21689k.mo35464b(obj);
        return true;
    }
}
