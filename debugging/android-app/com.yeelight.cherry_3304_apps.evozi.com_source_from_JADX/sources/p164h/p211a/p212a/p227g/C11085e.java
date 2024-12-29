package p164h.p211a.p212a.p227g;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import p154d.p155b.C10704e;
import p154d.p155b.C10706f;
import p154d.p155b.C10725k;
import p154d.p155b.C10727m;
import p154d.p155b.C10734t;
import p154d.p155b.C10740z;
import p154d.p155b.C4316d;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p216c.C10922v;
import p164h.p211a.p212a.p220e.C10982f;
import p164h.p211a.p212a.p220e.C10987k;
import p164h.p211a.p212a.p222f.C11010b;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p222f.C11040p;
import p164h.p211a.p212a.p222f.p224w.C11052c;
import p164h.p211a.p212a.p222f.p224w.C11060h;
import p164h.p211a.p212a.p228h.C11126j;
import p164h.p211a.p212a.p228h.C11128l;
import p164h.p211a.p212a.p228h.C11129m;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.g.e */
public class C11085e extends C11060h {
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final C11158c f21856I = C11156b.m29015a(C11085e.class);

    /* renamed from: A */
    private final Map<String, C11088f> f21857A = new HashMap();

    /* renamed from: B */
    private C10922v f21858B;

    /* renamed from: G */
    protected final ConcurrentMap<String, C10706f>[] f21859G = new ConcurrentMap[31];

    /* renamed from: H */
    protected final Queue<String>[] f21860H = new Queue[31];

    /* renamed from: n */
    private C11082d f21861n;

    /* renamed from: o */
    private C11052c.C11054b f21862o;

    /* renamed from: p */
    private C11074a[] f21863p = new C11074a[0];

    /* renamed from: q */
    private C11076b[] f21864q;

    /* renamed from: r */
    private boolean f21865r = true;

    /* renamed from: s */
    private int f21866s = 512;

    /* renamed from: t */
    private boolean f21867t = true;

    /* renamed from: u */
    private C10982f f21868u;

    /* renamed from: v */
    private C11088f[] f21869v = new C11088f[0];

    /* renamed from: w */
    private C11093g[] f21870w;

    /* renamed from: x */
    private final Map<String, C11074a> f21871x = new HashMap();

    /* renamed from: y */
    private List<C11076b> f21872y;

    /* renamed from: z */
    private C11129m<String> f21873z;

    /* renamed from: h.a.a.g.e$a */
    private class C11086a implements C10706f {

        /* renamed from: a */
        C11074a f21874a;

        /* renamed from: b */
        C11086a f21875b;

        /* renamed from: c */
        C11088f f21876c;

        C11086a(Object obj, C11088f fVar) {
            if (C11126j.m28890q(obj) > 0) {
                this.f21874a = (C11074a) C11126j.m28884j(obj, 0);
                this.f21875b = new C11086a(C11126j.m28887m(obj, 0), fVar);
                return;
            }
            this.f21876c = fVar;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public void mo33907a(C10734t tVar, C10740z zVar) {
            C11037n v = tVar instanceof C11037n ? (C11037n) tVar : C11010b.m28113o().mo34849v();
            if (this.f21874a != null) {
                if (C11085e.f21856I.mo35485a()) {
                    C11158c T0 = C11085e.f21856I;
                    T0.mo35489e("call filter " + this.f21874a, new Object[0]);
                }
                C10704e I0 = this.f21874a.mo35170I0();
                if (!this.f21874a.mo35182B0() && v.mo34953Y()) {
                    try {
                        v.mo34961g0(false);
                        I0.mo33903b(tVar, zVar, this.f21875b);
                        v.mo34961g0(true);
                    } catch (Throwable th) {
                        v.mo34961g0(true);
                        throw th;
                    }
                } else {
                    I0.mo33903b(tVar, zVar, this.f21875b);
                }
            } else {
                C10709c cVar = (C10709c) tVar;
                if (this.f21876c != null) {
                    if (C11085e.f21856I.mo35485a()) {
                        C11158c T02 = C11085e.f21856I;
                        T02.mo35489e("call servlet " + this.f21876c, new Object[0]);
                    }
                    this.f21876c.mo35233O0(v, tVar, zVar);
                } else if (C11085e.this.mo35097M0() == null) {
                    C11085e.this.mo35220h1(cVar, (C10711e) zVar);
                } else {
                    C11085e.this.mo35100R0(C11139s.m28935a(cVar.mo33927s(), cVar.mo33920h()), v, cVar, (C10711e) zVar);
                }
            }
        }

        public String toString() {
            if (this.f21874a != null) {
                return this.f21874a + "->" + this.f21875b.toString();
            }
            C11088f fVar = this.f21876c;
            return fVar != null ? fVar.toString() : "null";
        }
    }

    /* renamed from: h.a.a.g.e$b */
    private class C11087b implements C10706f {

        /* renamed from: a */
        final C11037n f21878a;

        /* renamed from: b */
        final Object f21879b;

        /* renamed from: c */
        final C11088f f21880c;

        /* renamed from: d */
        int f21881d = 0;

        C11087b(C11037n nVar, Object obj, C11088f fVar) {
            this.f21878a = nVar;
            this.f21879b = obj;
            this.f21880c = fVar;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public void mo33907a(C10734t tVar, C10740z zVar) {
            if (C11085e.f21856I.mo35485a()) {
                C11158c T0 = C11085e.f21856I;
                T0.mo35489e("doFilter " + this.f21881d, new Object[0]);
            }
            if (this.f21881d < C11126j.m28890q(this.f21879b)) {
                Object obj = this.f21879b;
                int i = this.f21881d;
                this.f21881d = i + 1;
                C11074a aVar = (C11074a) C11126j.m28884j(obj, i);
                if (C11085e.f21856I.mo35485a()) {
                    C11158c T02 = C11085e.f21856I;
                    T02.mo35489e("call filter " + aVar, new Object[0]);
                }
                C10704e I0 = aVar.mo35170I0();
                if (aVar.mo35182B0() || !this.f21878a.mo34953Y()) {
                    I0.mo33903b(tVar, zVar, this);
                    return;
                }
                try {
                    this.f21878a.mo34961g0(false);
                    I0.mo33903b(tVar, zVar, this);
                    this.f21878a.mo34961g0(true);
                } catch (Throwable th) {
                    this.f21878a.mo34961g0(true);
                    throw th;
                }
            } else {
                C10709c cVar = (C10709c) tVar;
                if (this.f21880c != null) {
                    if (C11085e.f21856I.mo35485a()) {
                        C11158c T03 = C11085e.f21856I;
                        T03.mo35489e("call servlet " + this.f21880c, new Object[0]);
                    }
                    this.f21880c.mo35233O0(this.f21878a, tVar, zVar);
                } else if (C11085e.this.mo35097M0() == null) {
                    C11085e.this.mo35220h1(cVar, (C10711e) zVar);
                } else {
                    C11085e.this.mo35100R0(C11139s.m28935a(cVar.mo33927s(), cVar.mo33920h()), tVar instanceof C11037n ? (C11037n) tVar : C11010b.m28113o().mo34849v(), cVar, (C10711e) zVar);
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < C11126j.m28890q(this.f21879b); i++) {
                sb.append(C11126j.m28884j(this.f21879b, i).toString());
                sb.append("->");
            }
            sb.append(this.f21880c);
            return sb.toString();
        }
    }

    /* renamed from: X0 */
    private C10706f m28700X0(C11037n nVar, String str, C11088f fVar) {
        Object obj;
        C11129m<String> mVar;
        ConcurrentMap<String, C10706f>[] concurrentMapArr;
        C10706f fVar2;
        String name = str == null ? fVar.getName() : str;
        int c = C11076b.m28656c(nVar.mo34931G());
        if (this.f21865r && (concurrentMapArr = this.f21859G) != null && (fVar2 = (C10706f) concurrentMapArr[c].get(name)) != null) {
            return fVar2;
        }
        C11086a aVar = null;
        if (str == null || this.f21872y == null) {
            obj = null;
        } else {
            obj = null;
            for (int i = 0; i < this.f21872y.size(); i++) {
                C11076b bVar = this.f21872y.get(i);
                if (bVar.mo35173b(str, c)) {
                    obj = C11126j.m28879b(obj, bVar.mo35174d());
                }
            }
        }
        if (fVar != null && (mVar = this.f21873z) != null && mVar.size() > 0 && this.f21873z.size() > 0) {
            Object obj2 = this.f21873z.get(fVar.getName());
            for (int i2 = 0; i2 < C11126j.m28890q(obj2); i2++) {
                C11076b bVar2 = (C11076b) C11126j.m28884j(obj2, i2);
                if (bVar2.mo35172a(c)) {
                    obj = C11126j.m28879b(obj, bVar2.mo35174d());
                }
            }
            Object obj3 = this.f21873z.get("*");
            for (int i3 = 0; i3 < C11126j.m28890q(obj3); i3++) {
                C11076b bVar3 = (C11076b) C11126j.m28884j(obj3, i3);
                if (bVar3.mo35172a(c)) {
                    obj = C11126j.m28879b(obj, bVar3.mo35174d());
                }
            }
        }
        if (obj == null) {
            return null;
        }
        if (this.f21865r) {
            if (C11126j.m28890q(obj) > 0) {
                aVar = new C11086a(obj, fVar);
            }
            ConcurrentMap<String, C10706f> concurrentMap = this.f21859G[c];
            Queue<String> queue = this.f21860H[c];
            while (true) {
                if (this.f21866s <= 0 || concurrentMap.size() < this.f21866s) {
                    break;
                }
                String poll = queue.poll();
                if (poll == null) {
                    concurrentMap.clear();
                    break;
                }
                concurrentMap.remove(poll);
            }
            concurrentMap.put(name, aVar);
            queue.add(name);
            return aVar;
        } else if (C11126j.m28890q(obj) > 0) {
            return new C11087b(nVar, obj, fVar);
        } else {
            return null;
        }
    }

    /* renamed from: f1 */
    private void m28701f1() {
        Queue<String>[] queueArr = this.f21860H;
        if (queueArr[1] != null) {
            queueArr[1].clear();
            this.f21860H[2].clear();
            this.f21860H[4].clear();
            this.f21860H[8].clear();
            this.f21860H[16].clear();
            this.f21859G[1].clear();
            this.f21859G[2].clear();
            this.f21859G[4].clear();
            this.f21859G[8].clear();
            this.f21859G[16].clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0136, code lost:
        if (r0 != null) goto L_0x0138;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35053O0(java.lang.String r11, p164h.p211a.p212a.p222f.C11037n r12, p154d.p155b.p204f0.C10709c r13, p154d.p155b.p204f0.C10711e r14) {
        /*
            r10 = this;
            d.b.d r0 = r12.mo34931G()
            h.a.a.f.u$a r1 = r12.mo34952X()
            h.a.a.g.f r1 = (p164h.p211a.p212a.p227g.C11088f) r1
            java.lang.String r2 = "/"
            boolean r2 = r11.startsWith(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0021
            if (r1 == 0) goto L_0x002e
            h.a.a.g.b[] r2 = r10.f21864q
            if (r2 == 0) goto L_0x002e
            int r2 = r2.length
            if (r2 <= 0) goto L_0x002e
            d.b.f r3 = r10.m28700X0(r12, r11, r1)
            goto L_0x002e
        L_0x0021:
            if (r1 == 0) goto L_0x002e
            h.a.a.g.b[] r2 = r10.f21864q
            if (r2 == 0) goto L_0x002e
            int r2 = r2.length
            if (r2 <= 0) goto L_0x002e
            d.b.f r3 = r10.m28700X0(r12, r3, r1)
        L_0x002e:
            h.a.a.h.y.c r2 = f21856I
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r3
            java.lang.String r7 = "chain={}"
            r2.mo35489e(r7, r5)
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.String r5 = "javax.servlet.error.exception"
            java.lang.String r7 = "Response already committed for handling "
            java.lang.String r8 = "javax.servlet.error.exception_type"
            if (r1 != 0) goto L_0x0053
            h.a.a.f.i r3 = r10.mo35097M0()     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            if (r3 != 0) goto L_0x004f
            r10.mo35220h1(r13, r14)     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            goto L_0x0076
        L_0x004f:
            r10.mo35100R0(r11, r12, r13, r14)     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            goto L_0x0076
        L_0x0053:
            boolean r11 = r13 instanceof p164h.p211a.p212a.p222f.C11042q     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            if (r11 == 0) goto L_0x005f
            r11 = r13
            h.a.a.f.q r11 = (p164h.p211a.p212a.p222f.C11042q) r11     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            d.b.t r11 = r11.mo33981w()     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            goto L_0x0060
        L_0x005f:
            r11 = r13
        L_0x0060:
            boolean r9 = r14 instanceof p164h.p211a.p212a.p222f.C11043r     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            if (r9 == 0) goto L_0x006c
            r9 = r14
            h.a.a.f.r r9 = (p164h.p211a.p212a.p222f.C11043r) r9     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            d.b.z r9 = r9.mo33890o()     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            goto L_0x006d
        L_0x006c:
            r9 = r14
        L_0x006d:
            if (r3 == 0) goto L_0x0073
            r3.mo33907a(r11, r9)     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
            goto L_0x0076
        L_0x0073:
            r1.mo35233O0(r12, r11, r9)     // Catch:{ o -> 0x01dd, q -> 0x01db, c -> 0x01d9, Exception -> 0x00e0, Error -> 0x0080 }
        L_0x0076:
            if (r1 == 0) goto L_0x01cf
        L_0x0078:
            r12.mo34969o0(r4)
            goto L_0x01cf
        L_0x007d:
            r11 = move-exception
            goto L_0x01df
        L_0x0080:
            r11 = move-exception
            d.b.d r3 = p154d.p155b.C4316d.REQUEST     // Catch:{ all -> 0x007d }
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x007d }
            if (r3 != 0) goto L_0x0093
            d.b.d r3 = p154d.p155b.C4316d.ASYNC     // Catch:{ all -> 0x007d }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            throw r11     // Catch:{ all -> 0x007d }
        L_0x0093:
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r3.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r9 = "Error for "
            r3.append(r9)     // Catch:{ all -> 0x007d }
            java.lang.String r9 = r13.mo33929v()     // Catch:{ all -> 0x007d }
            r3.append(r9)     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007d }
            r0.mo35492h(r3, r11)     // Catch:{ all -> 0x007d }
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            boolean r0 = r0.mo35485a()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x00c0
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r13.toString()     // Catch:{ all -> 0x007d }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x007d }
            r0.mo35489e(r3, r6)     // Catch:{ all -> 0x007d }
        L_0x00c0:
            boolean r0 = r14.mo33885g()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x00d8
            java.lang.Class r0 = r11.getClass()     // Catch:{ all -> 0x007d }
            r13.mo33965b(r8, r0)     // Catch:{ all -> 0x007d }
            r13.mo33965b(r5, r11)     // Catch:{ all -> 0x007d }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x007d }
            r14.mo33931c(r2, r11)     // Catch:{ all -> 0x007d }
            goto L_0x00dd
        L_0x00d8:
            h.a.a.h.y.c r13 = f21856I     // Catch:{ all -> 0x007d }
            r13.mo35493i(r7, r11)     // Catch:{ all -> 0x007d }
        L_0x00dd:
            if (r1 == 0) goto L_0x01cf
            goto L_0x0078
        L_0x00e0:
            r11 = move-exception
            d.b.d r3 = p154d.p155b.C4316d.REQUEST     // Catch:{ all -> 0x007d }
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x007d }
            if (r3 != 0) goto L_0x0107
            d.b.d r3 = p154d.p155b.C4316d.ASYNC     // Catch:{ all -> 0x007d }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0107
            boolean r0 = r11 instanceof java.io.IOException     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0104
            boolean r0 = r11 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0101
            boolean r0 = r11 instanceof p154d.p155b.C10730p     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x00fe
            goto L_0x0107
        L_0x00fe:
            d.b.p r11 = (p154d.p155b.C10730p) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x0101:
            java.lang.RuntimeException r11 = (java.lang.RuntimeException) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x0104:
            java.io.IOException r11 = (java.io.IOException) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x0107:
            boolean r0 = r11 instanceof p154d.p155b.C10705e0     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0111
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            r0.mo35487c(r11)     // Catch:{ all -> 0x007d }
            goto L_0x0139
        L_0x0111:
            boolean r0 = r11 instanceof p154d.p155b.C10730p     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0124
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            r0.mo35487c(r11)     // Catch:{ all -> 0x007d }
            r0 = r11
            d.b.p r0 = (p154d.p155b.C10730p) r0     // Catch:{ all -> 0x007d }
            java.lang.Throwable r0 = r0.mo33963a()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0139
            goto L_0x0138
        L_0x0124:
            boolean r0 = r11 instanceof p164h.p211a.p212a.p217d.C10945q     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0139
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            r0.mo35487c(r11)     // Catch:{ all -> 0x007d }
            r0 = r11
            h.a.a.d.q r0 = (p164h.p211a.p212a.p217d.C10945q) r0     // Catch:{ all -> 0x007d }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x007d }
            java.io.IOException r0 = (java.io.IOException) r0     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0139
        L_0x0138:
            r11 = r0
        L_0x0139:
            boolean r0 = r11 instanceof p164h.p211a.p212a.p216c.C10896h     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r11 instanceof p164h.p211a.p212a.p217d.C10945q     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x01d3
            boolean r0 = r11 instanceof p164h.p211a.p212a.p217d.C10943o     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x01d0
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            boolean r0 = r0.mo35485a()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0163
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r13.mo33929v()     // Catch:{ all -> 0x007d }
            r0.mo35492h(r3, r11)     // Catch:{ all -> 0x007d }
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r13.toString()     // Catch:{ all -> 0x007d }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x007d }
            r0.mo35489e(r3, r9)     // Catch:{ all -> 0x007d }
            goto L_0x017f
        L_0x0163:
            boolean r0 = r11 instanceof java.io.IOException     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0176
            boolean r0 = r11 instanceof p154d.p155b.C10705e0     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x016c
            goto L_0x0176
        L_0x016c:
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r13.mo33929v()     // Catch:{ all -> 0x007d }
            r0.mo35492h(r3, r11)     // Catch:{ all -> 0x007d }
            goto L_0x017f
        L_0x0176:
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r13.mo33929v()     // Catch:{ all -> 0x007d }
            r0.mo35493i(r3, r11)     // Catch:{ all -> 0x007d }
        L_0x017f:
            boolean r0 = r14.mo33885g()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x01b5
            java.lang.Class r0 = r11.getClass()     // Catch:{ all -> 0x007d }
            r13.mo33965b(r8, r0)     // Catch:{ all -> 0x007d }
            r13.mo33965b(r5, r11)     // Catch:{ all -> 0x007d }
            boolean r13 = r11 instanceof p154d.p155b.C10705e0     // Catch:{ all -> 0x007d }
            if (r13 == 0) goto L_0x01ad
            r13 = r11
            d.b.e0 r13 = (p154d.p155b.C10705e0) r13     // Catch:{ all -> 0x007d }
            boolean r13 = r13.mo33906c()     // Catch:{ all -> 0x007d }
            if (r13 == 0) goto L_0x01a6
            r13 = 404(0x194, float:5.66E-43)
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x007d }
        L_0x01a2:
            r14.mo33931c(r13, r11)     // Catch:{ all -> 0x007d }
            goto L_0x01cb
        L_0x01a6:
            r13 = 503(0x1f7, float:7.05E-43)
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x007d }
            goto L_0x01a2
        L_0x01ad:
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x007d }
            r14.mo33931c(r2, r11)     // Catch:{ all -> 0x007d }
            goto L_0x01cb
        L_0x01b5:
            h.a.a.h.y.c r13 = f21856I     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r14.<init>()     // Catch:{ all -> 0x007d }
            r14.append(r7)     // Catch:{ all -> 0x007d }
            r14.append(r11)     // Catch:{ all -> 0x007d }
            java.lang.String r11 = r14.toString()     // Catch:{ all -> 0x007d }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x007d }
            r13.mo35489e(r11, r14)     // Catch:{ all -> 0x007d }
        L_0x01cb:
            if (r1 == 0) goto L_0x01cf
            goto L_0x0078
        L_0x01cf:
            return
        L_0x01d0:
            h.a.a.d.o r11 = (p164h.p211a.p212a.p217d.C10943o) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01d3:
            h.a.a.d.q r11 = (p164h.p211a.p212a.p217d.C10945q) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01d6:
            h.a.a.c.h r11 = (p164h.p211a.p212a.p216c.C10896h) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01d9:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01db:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01dd:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01df:
            if (r1 == 0) goto L_0x01e4
            r12.mo34969o0(r4)
        L_0x01e4:
            goto L_0x01e6
        L_0x01e5:
            throw r11
        L_0x01e6:
            goto L_0x01e5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p227g.C11085e.mo35053O0(java.lang.String, h.a.a.f.n, d.b.f0.c, d.b.f0.e):void");
    }

    /* renamed from: P0 */
    public void mo35054P0(String str, C11037n nVar, C10709c cVar, C10711e eVar) {
        C11088f fVar;
        String s = nVar.mo33927s();
        String h = nVar.mo33920h();
        C4316d G = nVar.mo34931G();
        C11088f fVar2 = null;
        if (str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            C10922v.C10923a a1 = mo35214a1(str);
            if (a1 != null) {
                fVar = (C11088f) a1.getValue();
                String str2 = (String) a1.getKey();
                String a = a1.mo34548a() != null ? a1.mo34548a() : C10922v.m27569j(str2, str);
                String f = C10922v.m27568f(str2, str);
                if (C4316d.INCLUDE.equals(G)) {
                    nVar.mo33965b("javax.servlet.include.servlet_path", a);
                    nVar.mo33965b("javax.servlet.include.path_info", f);
                } else {
                    nVar.mo34926D0(a);
                    nVar.mo34972r0(f);
                }
            } else {
                fVar = fVar2;
            }
        } else {
            fVar = this.f21857A.get(str);
        }
        if (f21856I.mo35485a()) {
            f21856I.mo35489e("servlet {}|{}|{} -> {}", nVar.mo33917e(), nVar.mo33927s(), nVar.mo33920h(), fVar);
        }
        try {
            fVar2 = nVar.mo34952X();
            nVar.mo34936I0(fVar);
            if (mo35099Q0()) {
                mo35101S0(str, nVar, cVar, eVar);
            } else if (this.f21756l != null) {
                this.f21756l.mo35054P0(str, nVar, cVar, eVar);
            } else if (this.f21755k != null) {
                this.f21755k.mo35053O0(str, nVar, cVar, eVar);
            } else {
                mo35053O0(str, nVar, cVar, eVar);
            }
        } finally {
            if (fVar2 != null) {
                nVar.mo34936I0(fVar2);
            }
            if (!C4316d.INCLUDE.equals(G)) {
                nVar.mo34926D0(s);
                nVar.mo34972r0(h);
            }
        }
    }

    /* renamed from: U0 */
    public void mo35209U0(C11088f fVar, String str) {
        C11088f[] d1 = mo35217d1();
        if (d1 != null) {
            d1 = (C11088f[]) d1.clone();
        }
        try {
            mo35223j1((C11088f[]) C11126j.m28881d(d1, fVar, C11088f.class));
            C11093g gVar = new C11093g();
            gVar.mo35246d(fVar.getName());
            gVar.mo35245c(str);
            mo35221i1((C11093g[]) C11126j.m28881d(mo35216c1(), gVar, C11093g.class));
        } catch (Exception e) {
            mo35223j1(d1);
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo35210V0(C10704e eVar) {
        C11082d dVar = this.f21861n;
        if (dVar != null) {
            dVar.mo35199y1(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo35211W0(C10725k kVar) {
        C11082d dVar = this.f21861n;
        if (dVar != null) {
            dVar.mo35200z1(kVar);
        }
    }

    /* renamed from: Y0 */
    public C11076b[] mo35212Y0() {
        return this.f21864q;
    }

    /* renamed from: Z0 */
    public C11074a[] mo35213Z0() {
        return this.f21863p;
    }

    /* renamed from: a1 */
    public C10922v.C10923a mo35214a1(String str) {
        C10922v vVar = this.f21858B;
        if (vVar == null) {
            return null;
        }
        return vVar.mo34541b(str);
    }

    /* renamed from: b1 */
    public C10727m mo35215b1() {
        return this.f21862o;
    }

    /* renamed from: c1 */
    public C11093g[] mo35216c1() {
        return this.f21870w;
    }

    /* renamed from: d1 */
    public C11088f[] mo35217d1() {
        return this.f21869v;
    }

    /* renamed from: e1 */
    public void mo35218e1() {
        C11128l lVar = new C11128l();
        if (this.f21863p != null) {
            int i = 0;
            while (true) {
                C11074a[] aVarArr = this.f21863p;
                if (i >= aVarArr.length) {
                    break;
                }
                aVarArr[i].start();
                i++;
            }
        }
        C11088f[] fVarArr = this.f21869v;
        if (fVarArr != null) {
            C11088f[] fVarArr2 = (C11088f[]) fVarArr.clone();
            Arrays.sort(fVarArr2);
            for (int i2 = 0; i2 < fVarArr2.length; i2++) {
                try {
                    if (fVarArr2[i2].mo35190y0() == null && fVarArr2[i2].mo35230L0() != null) {
                        C11088f fVar = (C11088f) this.f21858B.mo34543d(fVarArr2[i2].mo35230L0());
                        if (fVar != null) {
                            if (fVar.mo35190y0() != null) {
                                fVarArr2[i2].mo35183C0(fVar.mo35190y0());
                            }
                        }
                        lVar.mo35374a(new IllegalStateException("No forced path servlet for " + fVarArr2[i2].mo35230L0()));
                    }
                    fVarArr2[i2].start();
                } catch (Throwable th) {
                    f21856I.mo35493i("EXCEPTION ", th);
                    lVar.mo35374a(th);
                }
            }
            lVar.mo35376c();
        }
    }

    /* renamed from: g1 */
    public boolean mo35219g1() {
        return this.f21867t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public void mo35220h1(C10709c cVar, C10711e eVar) {
        if (f21856I.mo35485a()) {
            C11158c cVar2 = f21856I;
            cVar2.mo35489e("Not Found " + cVar.mo33929v(), new Object[0]);
        }
    }

    /* renamed from: i */
    public void mo34901i(C11040p pVar) {
        C11040p d = mo34900d();
        if (!(d == null || d == pVar)) {
            mo34900d().mo35003Q0().mo35469h(this, this.f21863p, (Object[]) null, "filter", true);
            mo34900d().mo35003Q0().mo35469h(this, this.f21864q, (Object[]) null, "filterMapping", true);
            mo34900d().mo35003Q0().mo35469h(this, this.f21869v, (Object[]) null, "servlet", true);
            mo34900d().mo35003Q0().mo35469h(this, this.f21870w, (Object[]) null, "servletMapping", true);
        }
        super.mo34901i(pVar);
        if (pVar != null && d != pVar) {
            pVar.mo35003Q0().mo35469h(this, (Object[]) null, this.f21863p, "filter", true);
            pVar.mo35003Q0().mo35469h(this, (Object[]) null, this.f21864q, "filterMapping", true);
            pVar.mo35003Q0().mo35469h(this, (Object[]) null, this.f21869v, "servlet", true);
            pVar.mo35003Q0().mo35469h(this, (Object[]) null, this.f21870w, "servletMapping", true);
        }
    }

    /* renamed from: i1 */
    public void mo35221i1(C11093g[] gVarArr) {
        if (mo34900d() != null) {
            mo34900d().mo35003Q0().mo35469h(this, this.f21870w, gVarArr, "servletMapping", true);
        }
        this.f21870w = gVarArr;
        mo35224k1();
        m28701f1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C10982f mo35222j() {
        return this.f21868u;
    }

    /* renamed from: j1 */
    public synchronized void mo35223j1(C11088f[] fVarArr) {
        if (mo34900d() != null) {
            mo34900d().mo35003Q0().mo35469h(this, this.f21869v, fVarArr, "servlet", true);
        }
        this.f21869v = fVarArr;
        mo35225l1();
        m28701f1();
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        super.mo35048E0(appendable);
        C11146b.m28976B0(appendable, str, C11138r.m28927a(mo34903n()), mo35460G0(), C11138r.m28927a(mo35212Y0()), C11138r.m28927a(mo35213Z0()), C11138r.m28927a(mo35216c1()), C11138r.m28927a(mo35217d1()));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012e A[Catch:{ Exception -> 0x01cb }] */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo35224k1() {
        /*
            r8 = this;
            monitor-enter(r8)
            h.a.a.g.b[] r0 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000d
            r8.f21872y = r1     // Catch:{ all -> 0x01d2 }
            r8.f21873z = r1     // Catch:{ all -> 0x01d2 }
            goto L_0x0097
        L_0x000d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01d2 }
            r0.<init>()     // Catch:{ all -> 0x01d2 }
            r8.f21872y = r0     // Catch:{ all -> 0x01d2 }
            h.a.a.h.m r0 = new h.a.a.h.m     // Catch:{ all -> 0x01d2 }
            r0.<init>()     // Catch:{ all -> 0x01d2 }
            r8.f21873z = r0     // Catch:{ all -> 0x01d2 }
            r0 = 0
        L_0x001c:
            h.a.a.g.b[] r3 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            int r3 = r3.length     // Catch:{ all -> 0x01d2 }
            if (r0 >= r3) goto L_0x0097
            java.util.Map<java.lang.String, h.a.a.g.a> r3 = r8.f21871x     // Catch:{ all -> 0x01d2 }
            h.a.a.g.b[] r4 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            r4 = r4[r0]     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = r4.mo35175e()     // Catch:{ all -> 0x01d2 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x01d2 }
            h.a.a.g.a r3 = (p164h.p211a.p212a.p227g.C11074a) r3     // Catch:{ all -> 0x01d2 }
            if (r3 == 0) goto L_0x0078
            h.a.a.g.b[] r4 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            r4 = r4[r0]     // Catch:{ all -> 0x01d2 }
            r4.mo35178h(r3)     // Catch:{ all -> 0x01d2 }
            h.a.a.g.b[] r3 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            r3 = r3[r0]     // Catch:{ all -> 0x01d2 }
            java.lang.String[] r3 = r3.mo35176f()     // Catch:{ all -> 0x01d2 }
            if (r3 == 0) goto L_0x004d
            java.util.List<h.a.a.g.b> r3 = r8.f21872y     // Catch:{ all -> 0x01d2 }
            h.a.a.g.b[] r4 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            r4 = r4[r0]     // Catch:{ all -> 0x01d2 }
            r3.add(r4)     // Catch:{ all -> 0x01d2 }
        L_0x004d:
            h.a.a.g.b[] r3 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            r3 = r3[r0]     // Catch:{ all -> 0x01d2 }
            java.lang.String[] r3 = r3.mo35177g()     // Catch:{ all -> 0x01d2 }
            if (r3 == 0) goto L_0x0075
            h.a.a.g.b[] r3 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            r3 = r3[r0]     // Catch:{ all -> 0x01d2 }
            java.lang.String[] r3 = r3.mo35177g()     // Catch:{ all -> 0x01d2 }
            r4 = 0
        L_0x0060:
            int r5 = r3.length     // Catch:{ all -> 0x01d2 }
            if (r4 >= r5) goto L_0x0075
            r5 = r3[r4]     // Catch:{ all -> 0x01d2 }
            if (r5 == 0) goto L_0x0072
            h.a.a.h.m<java.lang.String> r5 = r8.f21873z     // Catch:{ all -> 0x01d2 }
            r6 = r3[r4]     // Catch:{ all -> 0x01d2 }
            h.a.a.g.b[] r7 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            r7 = r7[r0]     // Catch:{ all -> 0x01d2 }
            r5.mo35384a(r6, r7)     // Catch:{ all -> 0x01d2 }
        L_0x0072:
            int r4 = r4 + 1
            goto L_0x0060
        L_0x0075:
            int r0 = r0 + 1
            goto L_0x001c
        L_0x0078:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r2.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "No filter named "
            r2.append(r3)     // Catch:{ all -> 0x01d2 }
            h.a.a.g.b[] r3 = r8.f21864q     // Catch:{ all -> 0x01d2 }
            r0 = r3[r0]     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r0.mo35175e()     // Catch:{ all -> 0x01d2 }
            r2.append(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d2 }
            throw r1     // Catch:{ all -> 0x01d2 }
        L_0x0097:
            h.a.a.g.g[] r0 = r8.f21870w     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x010a
            java.util.Map<java.lang.String, h.a.a.g.f> r0 = r8.f21857A     // Catch:{ all -> 0x01d2 }
            if (r0 != 0) goto L_0x00a0
            goto L_0x010a
        L_0x00a0:
            h.a.a.c.v r0 = new h.a.a.c.v     // Catch:{ all -> 0x01d2 }
            r0.<init>()     // Catch:{ all -> 0x01d2 }
            r1 = 0
        L_0x00a6:
            h.a.a.g.g[] r3 = r8.f21870w     // Catch:{ all -> 0x01d2 }
            int r3 = r3.length     // Catch:{ all -> 0x01d2 }
            if (r1 >= r3) goto L_0x0107
            java.util.Map<java.lang.String, h.a.a.g.f> r3 = r8.f21857A     // Catch:{ all -> 0x01d2 }
            h.a.a.g.g[] r4 = r8.f21870w     // Catch:{ all -> 0x01d2 }
            r4 = r4[r1]     // Catch:{ all -> 0x01d2 }
            java.lang.String r4 = r4.mo35244b()     // Catch:{ all -> 0x01d2 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x01d2 }
            h.a.a.g.f r3 = (p164h.p211a.p212a.p227g.C11088f) r3     // Catch:{ all -> 0x01d2 }
            if (r3 == 0) goto L_0x00e8
            boolean r4 = r3.mo35236S0()     // Catch:{ all -> 0x01d2 }
            if (r4 == 0) goto L_0x00e5
            h.a.a.g.g[] r4 = r8.f21870w     // Catch:{ all -> 0x01d2 }
            r4 = r4[r1]     // Catch:{ all -> 0x01d2 }
            java.lang.String[] r4 = r4.mo35243a()     // Catch:{ all -> 0x01d2 }
            if (r4 == 0) goto L_0x00e5
            h.a.a.g.g[] r4 = r8.f21870w     // Catch:{ all -> 0x01d2 }
            r4 = r4[r1]     // Catch:{ all -> 0x01d2 }
            java.lang.String[] r4 = r4.mo35243a()     // Catch:{ all -> 0x01d2 }
            r5 = 0
        L_0x00d6:
            int r6 = r4.length     // Catch:{ all -> 0x01d2 }
            if (r5 >= r6) goto L_0x00e5
            r6 = r4[r5]     // Catch:{ all -> 0x01d2 }
            if (r6 == 0) goto L_0x00e2
            r6 = r4[r5]     // Catch:{ all -> 0x01d2 }
            r0.put(r6, r3)     // Catch:{ all -> 0x01d2 }
        L_0x00e2:
            int r5 = r5 + 1
            goto L_0x00d6
        L_0x00e5:
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00e8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r2.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "No such servlet: "
            r2.append(r3)     // Catch:{ all -> 0x01d2 }
            h.a.a.g.g[] r3 = r8.f21870w     // Catch:{ all -> 0x01d2 }
            r1 = r3[r1]     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.mo35244b()     // Catch:{ all -> 0x01d2 }
            r2.append(r1)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01d2 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d2 }
            throw r0     // Catch:{ all -> 0x01d2 }
        L_0x0107:
            r8.f21858B = r0     // Catch:{ all -> 0x01d2 }
            goto L_0x010c
        L_0x010a:
            r8.f21858B = r1     // Catch:{ all -> 0x01d2 }
        L_0x010c:
            java.util.concurrent.ConcurrentMap<java.lang.String, d.b.f>[] r0 = r8.f21859G     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0126
            java.util.concurrent.ConcurrentMap<java.lang.String, d.b.f>[] r0 = r8.f21859G     // Catch:{ all -> 0x01d2 }
            int r0 = r0.length     // Catch:{ all -> 0x01d2 }
        L_0x0113:
            int r1 = r0 + -1
            if (r0 <= 0) goto L_0x0126
            java.util.concurrent.ConcurrentMap<java.lang.String, d.b.f>[] r0 = r8.f21859G     // Catch:{ all -> 0x01d2 }
            r0 = r0[r1]     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0124
            java.util.concurrent.ConcurrentMap<java.lang.String, d.b.f>[] r0 = r8.f21859G     // Catch:{ all -> 0x01d2 }
            r0 = r0[r1]     // Catch:{ all -> 0x01d2 }
            r0.clear()     // Catch:{ all -> 0x01d2 }
        L_0x0124:
            r0 = r1
            goto L_0x0113
        L_0x0126:
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x01d2 }
            boolean r0 = r0.mo35485a()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01b0
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "filterNameMap="
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            java.util.Map<java.lang.String, h.a.a.g.a> r3 = r8.f21871x     // Catch:{ all -> 0x01d2 }
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d2 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01d2 }
            r0.mo35489e(r1, r3)     // Catch:{ all -> 0x01d2 }
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "pathFilters="
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            java.util.List<h.a.a.g.b> r3 = r8.f21872y     // Catch:{ all -> 0x01d2 }
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d2 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01d2 }
            r0.mo35489e(r1, r3)     // Catch:{ all -> 0x01d2 }
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "servletFilterMap="
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            h.a.a.h.m<java.lang.String> r3 = r8.f21873z     // Catch:{ all -> 0x01d2 }
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d2 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01d2 }
            r0.mo35489e(r1, r3)     // Catch:{ all -> 0x01d2 }
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "servletPathMap="
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            h.a.a.c.v r3 = r8.f21858B     // Catch:{ all -> 0x01d2 }
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d2 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01d2 }
            r0.mo35489e(r1, r3)     // Catch:{ all -> 0x01d2 }
            h.a.a.h.y.c r0 = f21856I     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r3 = "servletNameMap="
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            java.util.Map<java.lang.String, h.a.a.g.f> r3 = r8.f21857A     // Catch:{ all -> 0x01d2 }
            r1.append(r3)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d2 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01d2 }
            r0.mo35489e(r1, r2)     // Catch:{ all -> 0x01d2 }
        L_0x01b0:
            h.a.a.g.d r0 = r8.f21861n     // Catch:{ Exception -> 0x01cb }
            if (r0 == 0) goto L_0x01bc
            h.a.a.g.d r0 = r8.f21861n     // Catch:{ Exception -> 0x01cb }
            boolean r0 = r0.mo35452j0()     // Catch:{ Exception -> 0x01cb }
            if (r0 != 0) goto L_0x01c6
        L_0x01bc:
            h.a.a.g.d r0 = r8.f21861n     // Catch:{ Exception -> 0x01cb }
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r8.mo35452j0()     // Catch:{ Exception -> 0x01cb }
            if (r0 == 0) goto L_0x01c9
        L_0x01c6:
            r8.mo35218e1()     // Catch:{ Exception -> 0x01cb }
        L_0x01c9:
            monitor-exit(r8)
            return
        L_0x01cb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x01d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d2 }
            throw r1     // Catch:{ all -> 0x01d2 }
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x01d6
        L_0x01d5:
            throw r0
        L_0x01d6:
            goto L_0x01d5
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p227g.C11085e.mo35224k1():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l1 */
    public synchronized void mo35225l1() {
        this.f21871x.clear();
        if (this.f21863p != null) {
            for (int i = 0; i < this.f21863p.length; i++) {
                this.f21871x.put(this.f21863p[i].getName(), this.f21863p[i]);
                this.f21863p[i].mo35187G0(this);
            }
        }
        this.f21857A.clear();
        if (this.f21869v != null) {
            for (int i2 = 0; i2 < this.f21869v.length; i2++) {
                this.f21857A.put(this.f21869v[i2].getName(), this.f21869v[i2]);
                this.f21869v[i2].mo35187G0(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public synchronized void mo34262p0() {
        C10987k kVar;
        C11052c.C11054b g1 = C11052c.m28456g1();
        this.f21862o = g1;
        C11082d dVar = (C11082d) (g1 == null ? null : g1.mo35080c());
        this.f21861n = dVar;
        if (!(dVar == null || (kVar = (C10987k) dVar.mo35051L0(C10987k.class)) == null)) {
            this.f21868u = kVar.mo34719j();
        }
        mo35225l1();
        mo35224k1();
        if (this.f21865r) {
            this.f21859G[1] = new ConcurrentHashMap();
            this.f21859G[2] = new ConcurrentHashMap();
            this.f21859G[4] = new ConcurrentHashMap();
            this.f21859G[8] = new ConcurrentHashMap();
            this.f21859G[16] = new ConcurrentHashMap();
            this.f21860H[1] = new ConcurrentLinkedQueue();
            this.f21860H[2] = new ConcurrentLinkedQueue();
            this.f21860H[4] = new ConcurrentLinkedQueue();
            this.f21860H[8] = new ConcurrentLinkedQueue();
            this.f21860H[16] = new ConcurrentLinkedQueue();
        }
        super.mo34262p0();
        if (this.f21861n == null || !(this.f21861n instanceof C11082d)) {
            mo35218e1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public synchronized void mo34263q0() {
        super.mo34263q0();
        if (this.f21863p != null) {
            int length = this.f21863p.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                try {
                    this.f21863p[i].stop();
                } catch (Exception e) {
                    f21856I.mo35492h("EXCEPTION ", e);
                }
                length = i;
            }
        }
        if (this.f21869v != null) {
            int length2 = this.f21869v.length;
            while (true) {
                int i2 = length2 - 1;
                if (length2 <= 0) {
                    break;
                }
                try {
                    this.f21869v[i2].stop();
                } catch (Exception e2) {
                    f21856I.mo35492h("EXCEPTION ", e2);
                }
                length2 = i2;
            }
        }
        this.f21872y = null;
        this.f21873z = null;
        this.f21858B = null;
    }
}
