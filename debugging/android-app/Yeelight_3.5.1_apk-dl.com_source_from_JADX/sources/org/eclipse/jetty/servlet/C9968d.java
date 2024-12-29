package org.eclipse.jetty.servlet;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import javax.servlet.DispatcherType;
import javax.servlet.FilterChain;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.server.handler.C9951i;
import org.eclipse.jetty.servlet.Holder;
import org.eclipse.jetty.util.C9996o;
import org.eclipse.jetty.util.C9997p;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;
import p147d6.C8942b;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10352d;
import p208s4.C10353e;
import p208s4.C10357i;
import p208s4.C10359k;
import p208s4.C10364p;
import p208s4.C10368t;
import p234y5.C12079f;
import p234y5.C12084k;
import p239z5.C12151b;
import p239z5.C12181o;
import p239z5.C12187r;

/* renamed from: org.eclipse.jetty.servlet.d */
public class C9968d extends C9951i {
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static final C9003c f18335R = C9001b.m21450a(C9968d.class);

    /* renamed from: A */
    private final Map<String, ServletHolder> f18336A = new HashMap();

    /* renamed from: B */
    private PathMap f18337B;

    /* renamed from: C */
    protected final ConcurrentMap<String, FilterChain>[] f18338C = new ConcurrentMap[31];

    /* renamed from: Q */
    protected final Queue<String>[] f18339Q = new Queue[31];

    /* renamed from: n */
    private C9965c f18340n;

    /* renamed from: o */
    private C9943d.C9945b f18341o;

    /* renamed from: p */
    private C9961a[] f18342p = new C9961a[0];

    /* renamed from: q */
    private C9963b[] f18343q;

    /* renamed from: r */
    private boolean f18344r = true;

    /* renamed from: s */
    private int f18345s = 512;

    /* renamed from: t */
    private boolean f18346t = true;

    /* renamed from: u */
    private C12079f f18347u;

    /* renamed from: v */
    private ServletHolder[] f18348v = new ServletHolder[0];

    /* renamed from: w */
    private C9971e[] f18349w;

    /* renamed from: x */
    private final Map<String, C9961a> f18350x = new HashMap();

    /* renamed from: y */
    private List<C9963b> f18351y;

    /* renamed from: z */
    private MultiMap<String> f18352z;

    /* renamed from: org.eclipse.jetty.servlet.d$a */
    private class C9969a implements C10353e {

        /* renamed from: a */
        C9961a f18353a;

        /* renamed from: b */
        C9969a f18354b;

        /* renamed from: c */
        ServletHolder f18355c;

        C9969a(Object obj, ServletHolder servletHolder) {
            if (LazyList.size(obj) > 0) {
                this.f18353a = (C9961a) LazyList.get(obj, 0);
                this.f18354b = new C9969a(LazyList.remove(obj, 0), servletHolder);
                return;
            }
            this.f18355c = servletHolder;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public void mo40104a(C10364p pVar, C10368t tVar) {
            C12181o v = pVar instanceof C12181o ? (C12181o) pVar : C12151b.m31593o().mo42994v();
            if (this.f18353a != null) {
                if (C9968d.f18335R.mo36846a()) {
                    C9003c Y0 = C9968d.f18335R;
                    Y0.mo36850e("call filter " + this.f18353a, new Object[0]);
                }
                C10352d P0 = this.f18353a.mo40058P0();
                if (!this.f18353a.mo40027H0() && v.mo43099Y()) {
                    try {
                        v.mo43107g0(false);
                        P0.mo41937a(pVar, tVar, this.f18354b);
                        v.mo43107g0(true);
                    } catch (Throwable th) {
                        v.mo43107g0(true);
                        throw th;
                    }
                } else {
                    P0.mo41937a(pVar, tVar, this.f18354b);
                }
            } else {
                C9277a aVar = (C9277a) pVar;
                if (this.f18355c != null) {
                    if (C9968d.f18335R.mo36846a()) {
                        C9003c Y02 = C9968d.f18335R;
                        Y02.mo36850e("call servlet " + this.f18355c, new Object[0]);
                    }
                    this.f18355c.mo40047W0(v, pVar, tVar);
                } else if (C9968d.this.mo39983R0() == null) {
                    C9968d.this.mo40099o1(aVar, (C9279c) tVar);
                } else {
                    C9968d.this.mo39986W0(C9997p.m24723a(aVar.mo37771s(), aVar.mo37763g()), v, aVar, (C9279c) tVar);
                }
            }
        }

        public String toString() {
            if (this.f18353a != null) {
                return this.f18353a + "->" + this.f18354b.toString();
            }
            ServletHolder servletHolder = this.f18355c;
            return servletHolder != null ? servletHolder.toString() : "null";
        }
    }

    /* renamed from: org.eclipse.jetty.servlet.d$b */
    private class C9970b implements C10353e {

        /* renamed from: a */
        final C12181o f18357a;

        /* renamed from: b */
        final Object f18358b;

        /* renamed from: c */
        final ServletHolder f18359c;

        /* renamed from: d */
        int f18360d = 0;

        C9970b(C12181o oVar, Object obj, ServletHolder servletHolder) {
            this.f18357a = oVar;
            this.f18358b = obj;
            this.f18359c = servletHolder;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public void mo40104a(C10364p pVar, C10368t tVar) {
            if (C9968d.f18335R.mo36846a()) {
                C9003c Y0 = C9968d.f18335R;
                Y0.mo36850e("doFilter " + this.f18360d, new Object[0]);
            }
            if (this.f18360d < LazyList.size(this.f18358b)) {
                Object obj = this.f18358b;
                int i = this.f18360d;
                this.f18360d = i + 1;
                C9961a aVar = (C9961a) LazyList.get(obj, i);
                if (C9968d.f18335R.mo36846a()) {
                    C9003c Y02 = C9968d.f18335R;
                    Y02.mo36850e("call filter " + aVar, new Object[0]);
                }
                C10352d P0 = aVar.mo40058P0();
                if (aVar.mo40027H0() || !this.f18357a.mo43099Y()) {
                    P0.mo41937a(pVar, tVar, this);
                    return;
                }
                try {
                    this.f18357a.mo43107g0(false);
                    P0.mo41937a(pVar, tVar, this);
                    this.f18357a.mo43107g0(true);
                } catch (Throwable th) {
                    this.f18357a.mo43107g0(true);
                    throw th;
                }
            } else {
                C9277a aVar2 = (C9277a) pVar;
                if (this.f18359c != null) {
                    if (C9968d.f18335R.mo36846a()) {
                        C9003c Y03 = C9968d.f18335R;
                        Y03.mo36850e("call servlet " + this.f18359c, new Object[0]);
                    }
                    this.f18359c.mo40047W0(this.f18357a, pVar, tVar);
                } else if (C9968d.this.mo39983R0() == null) {
                    C9968d.this.mo40099o1(aVar2, (C9279c) tVar);
                } else {
                    C9968d.this.mo39986W0(C9997p.m24723a(aVar2.mo37771s(), aVar2.mo37763g()), pVar instanceof C12181o ? (C12181o) pVar : C12151b.m31593o().mo42994v(), aVar2, (C9279c) tVar);
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < LazyList.size(this.f18358b); i++) {
                sb.append(LazyList.get(this.f18358b, i).toString());
                sb.append("->");
            }
            sb.append(this.f18359c);
            return sb.toString();
        }
    }

    /* renamed from: d1 */
    private C10353e m24613d1(C12181o oVar, String str, ServletHolder servletHolder) {
        Object obj;
        MultiMap<String> multiMap;
        ConcurrentMap<String, FilterChain>[] concurrentMapArr;
        C10353e eVar;
        String name = str == null ? servletHolder.getName() : str;
        int c = C9963b.m24582c(oVar.mo43079H());
        if (this.f18344r && (concurrentMapArr = this.f18338C) != null && (eVar = (C10353e) concurrentMapArr[c].get(name)) != null) {
            return eVar;
        }
        C9969a aVar = null;
        if (str == null || this.f18351y == null) {
            obj = null;
        } else {
            obj = null;
            for (int i = 0; i < this.f18351y.size(); i++) {
                C9963b bVar = this.f18351y.get(i);
                if (bVar.mo40060b(str, c)) {
                    obj = LazyList.add(obj, bVar.mo40061d());
                }
            }
        }
        if (servletHolder != null && (multiMap = this.f18352z) != null && multiMap.size() > 0 && this.f18352z.size() > 0) {
            Object obj2 = this.f18352z.get(servletHolder.getName());
            for (int i2 = 0; i2 < LazyList.size(obj2); i2++) {
                C9963b bVar2 = (C9963b) LazyList.get(obj2, i2);
                if (bVar2.mo40059a(c)) {
                    obj = LazyList.add(obj, bVar2.mo40061d());
                }
            }
            Object obj3 = this.f18352z.get("*");
            for (int i3 = 0; i3 < LazyList.size(obj3); i3++) {
                C9963b bVar3 = (C9963b) LazyList.get(obj3, i3);
                if (bVar3.mo40059a(c)) {
                    obj = LazyList.add(obj, bVar3.mo40061d());
                }
            }
        }
        if (obj == null) {
            return null;
        }
        if (this.f18344r) {
            if (LazyList.size(obj) > 0) {
                aVar = new C9969a(obj, servletHolder);
            }
            ConcurrentMap<String, FilterChain> concurrentMap = this.f18338C[c];
            Queue<String> queue = this.f18339Q[c];
            while (true) {
                if (this.f18345s <= 0 || concurrentMap.size() < this.f18345s) {
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
        } else if (LazyList.size(obj) > 0) {
            return new C9970b(oVar, obj, servletHolder);
        } else {
            return null;
        }
    }

    /* renamed from: l1 */
    private void m24614l1() {
        Queue<String>[] queueArr = this.f18339Q;
        if (queueArr[1] != null) {
            queueArr[1].clear();
            this.f18339Q[2].clear();
            this.f18339Q[4].clear();
            this.f18339Q[8].clear();
            this.f18339Q[16].clear();
            this.f18338C[1].clear();
            this.f18338C[2].clear();
            this.f18338C[4].clear();
            this.f18338C[8].clear();
            this.f18338C[16].clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0130, code lost:
        if (r0 != null) goto L_0x0132;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26711T0(java.lang.String r11, p239z5.C12181o r12, javax.servlet.http.C9277a r13, javax.servlet.http.C9279c r14) {
        /*
            r10 = this;
            javax.servlet.DispatcherType r0 = r12.mo43079H()
            z5.w$a r1 = r12.mo43098X()
            org.eclipse.jetty.servlet.ServletHolder r1 = (org.eclipse.jetty.servlet.ServletHolder) r1
            java.lang.String r2 = "/"
            boolean r2 = r11.startsWith(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0021
            if (r1 == 0) goto L_0x002e
            org.eclipse.jetty.servlet.b[] r2 = r10.f18343q
            if (r2 == 0) goto L_0x002e
            int r2 = r2.length
            if (r2 <= 0) goto L_0x002e
            s4.e r3 = r10.m24613d1(r12, r11, r1)
            goto L_0x002e
        L_0x0021:
            if (r1 == 0) goto L_0x002e
            org.eclipse.jetty.servlet.b[] r2 = r10.f18343q
            if (r2 == 0) goto L_0x002e
            int r2 = r2.length
            if (r2 <= 0) goto L_0x002e
            s4.e r3 = r10.m24613d1(r12, r3, r1)
        L_0x002e:
            e6.c r2 = f18335R
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r3
            java.lang.String r7 = "chain={}"
            r2.mo36850e(r7, r5)
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.String r5 = "javax.servlet.error.exception"
            java.lang.String r7 = "Response already committed for handling "
            java.lang.String r8 = "javax.servlet.error.exception_type"
            if (r1 != 0) goto L_0x0053
            z5.i r3 = r10.mo39983R0()     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            if (r3 != 0) goto L_0x004f
            r10.mo40099o1(r13, r14)     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            goto L_0x0076
        L_0x004f:
            r10.mo39986W0(r11, r12, r13, r14)     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            goto L_0x0076
        L_0x0053:
            boolean r11 = r13 instanceof p239z5.C12189s     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            if (r11 == 0) goto L_0x005f
            r11 = r13
            z5.s r11 = (p239z5.C12189s) r11     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            s4.p r11 = r11.mo41959x()     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            goto L_0x0060
        L_0x005f:
            r11 = r13
        L_0x0060:
            boolean r9 = r14 instanceof p239z5.C12190t     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            if (r9 == 0) goto L_0x006c
            r9 = r14
            z5.t r9 = (p239z5.C12190t) r9     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            s4.t r9 = r9.mo41960r()     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            goto L_0x006d
        L_0x006c:
            r9 = r14
        L_0x006d:
            if (r3 == 0) goto L_0x0073
            r3.mo40104a(r11, r9)     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
            goto L_0x0076
        L_0x0073:
            r1.mo40047W0(r12, r11, r9)     // Catch:{ EofException -> 0x01cd, RuntimeIOException -> 0x01cb, ContinuationThrowable -> 0x01c9, Exception -> 0x00da, Error -> 0x0080 }
        L_0x0076:
            if (r1 == 0) goto L_0x01bf
        L_0x0078:
            r12.mo43115o0(r4)
            goto L_0x01bf
        L_0x007d:
            r11 = move-exception
            goto L_0x01cf
        L_0x0080:
            r11 = move-exception
            javax.servlet.DispatcherType r3 = javax.servlet.DispatcherType.REQUEST     // Catch:{ all -> 0x007d }
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x007d }
            if (r3 != 0) goto L_0x0093
            javax.servlet.DispatcherType r3 = javax.servlet.DispatcherType.ASYNC     // Catch:{ all -> 0x007d }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            throw r11     // Catch:{ all -> 0x007d }
        L_0x0093:
            e6.c r0 = f18335R     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r3.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r9 = "Error for "
            r3.append(r9)     // Catch:{ all -> 0x007d }
            java.lang.String r9 = r13.mo37774w()     // Catch:{ all -> 0x007d }
            r3.append(r9)     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007d }
            r0.mo36852g(r3, r11)     // Catch:{ all -> 0x007d }
            boolean r3 = r0.mo36846a()     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x00bc
            java.lang.String r3 = r13.toString()     // Catch:{ all -> 0x007d }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x007d }
            r0.mo36850e(r3, r6)     // Catch:{ all -> 0x007d }
        L_0x00bc:
            boolean r3 = r14.mo39908g()     // Catch:{ all -> 0x007d }
            if (r3 != 0) goto L_0x00d4
            java.lang.Class r0 = r11.getClass()     // Catch:{ all -> 0x007d }
            r13.mo41944b(r8, r0)     // Catch:{ all -> 0x007d }
            r13.mo41944b(r5, r11)     // Catch:{ all -> 0x007d }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x007d }
            r14.mo37776d(r2, r11)     // Catch:{ all -> 0x007d }
            goto L_0x00d7
        L_0x00d4:
            r0.mo36854h(r7, r11)     // Catch:{ all -> 0x007d }
        L_0x00d7:
            if (r1 == 0) goto L_0x01bf
            goto L_0x0078
        L_0x00da:
            r11 = move-exception
            javax.servlet.DispatcherType r3 = javax.servlet.DispatcherType.REQUEST     // Catch:{ all -> 0x007d }
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x007d }
            if (r3 != 0) goto L_0x0101
            javax.servlet.DispatcherType r3 = javax.servlet.DispatcherType.ASYNC     // Catch:{ all -> 0x007d }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0101
            boolean r0 = r11 instanceof java.io.IOException     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x00fe
            boolean r0 = r11 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r11 instanceof javax.servlet.ServletException     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x00f8
            goto L_0x0101
        L_0x00f8:
            javax.servlet.ServletException r11 = (javax.servlet.ServletException) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x00fb:
            java.lang.RuntimeException r11 = (java.lang.RuntimeException) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x00fe:
            java.io.IOException r11 = (java.io.IOException) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x0101:
            boolean r0 = r11 instanceof javax.servlet.UnavailableException     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x010b
            e6.c r0 = f18335R     // Catch:{ all -> 0x007d }
            r0.mo36848c(r11)     // Catch:{ all -> 0x007d }
            goto L_0x0133
        L_0x010b:
            boolean r0 = r11 instanceof javax.servlet.ServletException     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x011e
            e6.c r0 = f18335R     // Catch:{ all -> 0x007d }
            r0.mo36848c(r11)     // Catch:{ all -> 0x007d }
            r0 = r11
            javax.servlet.ServletException r0 = (javax.servlet.ServletException) r0     // Catch:{ all -> 0x007d }
            java.lang.Throwable r0 = r0.getRootCause()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0133
            goto L_0x0132
        L_0x011e:
            boolean r0 = r11 instanceof org.eclipse.jetty.p195io.RuntimeIOException     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0133
            e6.c r0 = f18335R     // Catch:{ all -> 0x007d }
            r0.mo36848c(r11)     // Catch:{ all -> 0x007d }
            r0 = r11
            org.eclipse.jetty.io.RuntimeIOException r0 = (org.eclipse.jetty.p195io.RuntimeIOException) r0     // Catch:{ all -> 0x007d }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x007d }
            java.io.IOException r0 = (java.io.IOException) r0     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0133
        L_0x0132:
            r11 = r0
        L_0x0133:
            boolean r0 = r11 instanceof org.eclipse.jetty.http.HttpException     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x01c6
            boolean r0 = r11 instanceof org.eclipse.jetty.p195io.RuntimeIOException     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x01c3
            boolean r0 = r11 instanceof org.eclipse.jetty.p195io.EofException     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x01c0
            e6.c r0 = f18335R     // Catch:{ all -> 0x007d }
            boolean r3 = r0.mo36846a()     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0159
            java.lang.String r3 = r13.mo37774w()     // Catch:{ all -> 0x007d }
            r0.mo36852g(r3, r11)     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r13.toString()     // Catch:{ all -> 0x007d }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x007d }
            r0.mo36850e(r3, r9)     // Catch:{ all -> 0x007d }
            goto L_0x0171
        L_0x0159:
            boolean r3 = r11 instanceof java.io.IOException     // Catch:{ all -> 0x007d }
            if (r3 != 0) goto L_0x016a
            boolean r3 = r11 instanceof javax.servlet.UnavailableException     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0162
            goto L_0x016a
        L_0x0162:
            java.lang.String r3 = r13.mo37774w()     // Catch:{ all -> 0x007d }
            r0.mo36852g(r3, r11)     // Catch:{ all -> 0x007d }
            goto L_0x0171
        L_0x016a:
            java.lang.String r3 = r13.mo37774w()     // Catch:{ all -> 0x007d }
            r0.mo36854h(r3, r11)     // Catch:{ all -> 0x007d }
        L_0x0171:
            boolean r3 = r14.mo39908g()     // Catch:{ all -> 0x007d }
            if (r3 != 0) goto L_0x01a7
            java.lang.Class r0 = r11.getClass()     // Catch:{ all -> 0x007d }
            r13.mo41944b(r8, r0)     // Catch:{ all -> 0x007d }
            r13.mo41944b(r5, r11)     // Catch:{ all -> 0x007d }
            boolean r13 = r11 instanceof javax.servlet.UnavailableException     // Catch:{ all -> 0x007d }
            if (r13 == 0) goto L_0x019f
            r13 = r11
            javax.servlet.UnavailableException r13 = (javax.servlet.UnavailableException) r13     // Catch:{ all -> 0x007d }
            boolean r13 = r13.isPermanent()     // Catch:{ all -> 0x007d }
            if (r13 == 0) goto L_0x0198
            r13 = 404(0x194, float:5.66E-43)
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x007d }
        L_0x0194:
            r14.mo37776d(r13, r11)     // Catch:{ all -> 0x007d }
            goto L_0x01bb
        L_0x0198:
            r13 = 503(0x1f7, float:7.05E-43)
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x007d }
            goto L_0x0194
        L_0x019f:
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x007d }
            r14.mo37776d(r2, r11)     // Catch:{ all -> 0x007d }
            goto L_0x01bb
        L_0x01a7:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r13.<init>()     // Catch:{ all -> 0x007d }
            r13.append(r7)     // Catch:{ all -> 0x007d }
            r13.append(r11)     // Catch:{ all -> 0x007d }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x007d }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x007d }
            r0.mo36850e(r11, r13)     // Catch:{ all -> 0x007d }
        L_0x01bb:
            if (r1 == 0) goto L_0x01bf
            goto L_0x0078
        L_0x01bf:
            return
        L_0x01c0:
            org.eclipse.jetty.io.EofException r11 = (org.eclipse.jetty.p195io.EofException) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01c3:
            org.eclipse.jetty.io.RuntimeIOException r11 = (org.eclipse.jetty.p195io.RuntimeIOException) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01c6:
            org.eclipse.jetty.http.HttpException r11 = (org.eclipse.jetty.http.HttpException) r11     // Catch:{ all -> 0x007d }
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01c9:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01cb:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01cd:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x007d }
        L_0x01cf:
            if (r1 == 0) goto L_0x01d4
            r12.mo43115o0(r4)
        L_0x01d4:
            goto L_0x01d6
        L_0x01d5:
            throw r11
        L_0x01d6:
            goto L_0x01d5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.C9968d.mo26711T0(java.lang.String, z5.o, javax.servlet.http.a, javax.servlet.http.c):void");
    }

    /* renamed from: U0 */
    public void mo26712U0(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        ServletHolder servletHolder;
        String s = oVar.mo37771s();
        String g = oVar.mo37763g();
        DispatcherType H = oVar.mo43079H();
        ServletHolder servletHolder2 = null;
        if (str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            PathMap.C9886a g1 = mo40091g1(str);
            if (g1 != null) {
                servletHolder = (ServletHolder) g1.getValue();
                String str2 = (String) g1.getKey();
                String a = g1.mo39701a() != null ? g1.mo39701a() : PathMap.pathMatch(str2, str);
                String pathInfo = PathMap.pathInfo(str2, str);
                if (DispatcherType.INCLUDE.equals(H)) {
                    oVar.mo41944b("javax.servlet.include.servlet_path", a);
                    oVar.mo41944b("javax.servlet.include.path_info", pathInfo);
                } else {
                    oVar.mo43072D0(a);
                    oVar.mo43118r0(pathInfo);
                }
            } else {
                servletHolder = servletHolder2;
            }
        } else {
            servletHolder = this.f18336A.get(str);
        }
        C9003c cVar2 = f18335R;
        if (cVar2.mo36846a()) {
            cVar2.mo36850e("servlet {}|{}|{} -> {}", oVar.mo37761e(), oVar.mo37771s(), oVar.mo37763g(), servletHolder);
        }
        try {
            servletHolder2 = oVar.mo43098X();
            oVar.mo43082I0(servletHolder);
            if (mo39985V0()) {
                mo39987X0(str, oVar, aVar, cVar);
            } else {
                C9951i iVar = this.f18270l;
                if (iVar != null) {
                    iVar.mo26712U0(str, oVar, aVar, cVar);
                } else {
                    C9951i iVar2 = this.f18269k;
                    if (iVar2 != null) {
                        iVar2.mo26711T0(str, oVar, aVar, cVar);
                    } else {
                        mo26711T0(str, oVar, aVar, cVar);
                    }
                }
            }
        } finally {
            if (servletHolder2 != null) {
                oVar.mo43082I0(servletHolder2);
            }
            if (!DispatcherType.INCLUDE.equals(H)) {
                oVar.mo43072D0(s);
                oVar.mo43118r0(g);
            }
        }
    }

    /* renamed from: Z0 */
    public ServletHolder mo40085Z0(String str, String str2) {
        ServletHolder n1 = mo40098n1((Holder.Source) null);
        n1.mo40032M0(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + LazyList.size(this.f18348v));
        n1.mo40028I0(str);
        mo40086a1(n1, str2);
        return n1;
    }

    /* renamed from: a1 */
    public void mo40086a1(ServletHolder servletHolder, String str) {
        ServletHolder[] j1 = mo40095j1();
        if (j1 != null) {
            j1 = (ServletHolder[]) j1.clone();
        }
        try {
            mo40101q1((ServletHolder[]) LazyList.addToArray(j1, servletHolder, ServletHolder.class));
            C9971e eVar = new C9971e();
            eVar.mo40110d(servletHolder.getName());
            eVar.mo40109c(str);
            mo40100p1((C9971e[]) LazyList.addToArray(mo40094i1(), eVar, C9971e.class));
        } catch (Exception e) {
            mo40101q1(j1);
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo40087b1(C10352d dVar) {
        C9965c cVar = this.f18340n;
        if (cVar != null) {
            cVar.mo40069K1(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo40088c1(C10357i iVar) {
        C9965c cVar = this.f18340n;
        if (cVar != null) {
            cVar.mo40070L1(iVar);
        }
    }

    /* renamed from: e1 */
    public C9963b[] mo40089e1() {
        return this.f18343q;
    }

    /* renamed from: f1 */
    public C9961a[] mo40090f1() {
        return this.f18342p;
    }

    /* renamed from: g1 */
    public PathMap.C9886a mo40091g1(String str) {
        PathMap pathMap = this.f18337B;
        if (pathMap == null) {
            return null;
        }
        return pathMap.getMatch(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C12079f mo40092h() {
        return this.f18347u;
    }

    /* renamed from: h1 */
    public C10359k mo40093h1() {
        return this.f18341o;
    }

    /* renamed from: i */
    public void mo26716i(C12187r rVar) {
        C12187r c = mo39919c();
        if (!(c == null || c == rVar)) {
            mo39919c().mo43169V0().mo36768h(this, this.f18342p, (Object[]) null, "filter", true);
            mo39919c().mo43169V0().mo36768h(this, this.f18343q, (Object[]) null, "filterMapping", true);
            mo39919c().mo43169V0().mo36768h(this, this.f18348v, (Object[]) null, "servlet", true);
            mo39919c().mo43169V0().mo36768h(this, this.f18349w, (Object[]) null, "servletMapping", true);
        }
        super.mo26716i(rVar);
        if (rVar != null && c != rVar) {
            rVar.mo43169V0().mo36768h(this, (Object[]) null, this.f18342p, "filter", true);
            rVar.mo43169V0().mo36768h(this, (Object[]) null, this.f18343q, "filterMapping", true);
            rVar.mo43169V0().mo36768h(this, (Object[]) null, this.f18348v, "servlet", true);
            rVar.mo43169V0().mo36768h(this, (Object[]) null, this.f18349w, "servletMapping", true);
        }
    }

    /* renamed from: i1 */
    public C9971e[] mo40094i1() {
        return this.f18349w;
    }

    /* renamed from: j1 */
    public ServletHolder[] mo40095j1() {
        return this.f18348v;
    }

    /* renamed from: k1 */
    public void mo40096k1() {
        MultiException multiException = new MultiException();
        if (this.f18342p != null) {
            int i = 0;
            while (true) {
                C9961a[] aVarArr = this.f18342p;
                if (i >= aVarArr.length) {
                    break;
                }
                aVarArr[i].start();
                i++;
            }
        }
        ServletHolder[] servletHolderArr = this.f18348v;
        if (servletHolderArr != null) {
            ServletHolder[] servletHolderArr2 = (ServletHolder[]) servletHolderArr.clone();
            Arrays.sort(servletHolderArr2);
            for (int i2 = 0; i2 < servletHolderArr2.length; i2++) {
                try {
                    if (servletHolderArr2[i2].mo40023D0() == null && servletHolderArr2[i2].mo40043S0() != null) {
                        ServletHolder servletHolder = (ServletHolder) this.f18337B.match(servletHolderArr2[i2].mo40043S0());
                        if (servletHolder != null) {
                            if (servletHolder.mo40023D0() != null) {
                                servletHolderArr2[i2].mo40028I0(servletHolder.mo40023D0());
                            }
                        }
                        multiException.add(new IllegalStateException("No forced path servlet for " + servletHolderArr2[i2].mo40043S0()));
                    }
                    servletHolderArr2[i2].start();
                } catch (Throwable th) {
                    f18335R.mo36854h("EXCEPTION ", th);
                    multiException.add(th);
                }
            }
            multiException.ifExceptionThrow();
        }
    }

    /* renamed from: m1 */
    public boolean mo40097m1() {
        return this.f18346t;
    }

    /* renamed from: n1 */
    public ServletHolder mo40098n1(Holder.Source source) {
        return new ServletHolder(source);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public void mo40099o1(C9277a aVar, C9279c cVar) {
        C9003c cVar2 = f18335R;
        if (cVar2.mo36846a()) {
            cVar2.mo36850e("Not Found " + aVar.mo37774w(), new Object[0]);
        }
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        super.mo36757J0(appendable);
        C8942b.m21357G0(appendable, str, C9996o.m24714a(mo39981o()), mo36759L0(), C9996o.m24714a(mo40089e1()), C9996o.m24714a(mo40090f1()), C9996o.m24714a(mo40094i1()), C9996o.m24714a(mo40095j1()));
    }

    /* renamed from: p1 */
    public void mo40100p1(C9971e[] eVarArr) {
        if (mo39919c() != null) {
            mo39919c().mo43169V0().mo36768h(this, this.f18349w, eVarArr, "servletMapping", true);
        }
        this.f18349w = eVarArr;
        mo40102r1();
        m24614l1();
    }

    /* renamed from: q1 */
    public synchronized void mo40101q1(ServletHolder[] servletHolderArr) {
        if (mo39919c() != null) {
            mo39919c().mo43169V0().mo36768h(this, this.f18348v, servletHolderArr, "servlet", true);
        }
        this.f18348v = servletHolderArr;
        mo40103s1();
        m24614l1();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010c A[Catch:{ Exception -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0126 A[Catch:{ Exception -> 0x01b7 }] */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo40102r1() {
        /*
            r8 = this;
            monitor-enter(r8)
            org.eclipse.jetty.servlet.b[] r0 = r8.f18343q     // Catch:{ all -> 0x01be }
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000d
            r8.f18351y = r1     // Catch:{ all -> 0x01be }
            r8.f18352z = r1     // Catch:{ all -> 0x01be }
            goto L_0x0095
        L_0x000d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01be }
            r0.<init>()     // Catch:{ all -> 0x01be }
            r8.f18351y = r0     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.util.MultiMap r0 = new org.eclipse.jetty.util.MultiMap     // Catch:{ all -> 0x01be }
            r0.<init>()     // Catch:{ all -> 0x01be }
            r8.f18352z = r0     // Catch:{ all -> 0x01be }
            r0 = 0
        L_0x001c:
            org.eclipse.jetty.servlet.b[] r3 = r8.f18343q     // Catch:{ all -> 0x01be }
            int r4 = r3.length     // Catch:{ all -> 0x01be }
            if (r0 >= r4) goto L_0x0095
            java.util.Map<java.lang.String, org.eclipse.jetty.servlet.a> r4 = r8.f18350x     // Catch:{ all -> 0x01be }
            r3 = r3[r0]     // Catch:{ all -> 0x01be }
            java.lang.String r3 = r3.mo40062e()     // Catch:{ all -> 0x01be }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.servlet.a r3 = (org.eclipse.jetty.servlet.C9961a) r3     // Catch:{ all -> 0x01be }
            if (r3 == 0) goto L_0x0076
            org.eclipse.jetty.servlet.b[] r4 = r8.f18343q     // Catch:{ all -> 0x01be }
            r4 = r4[r0]     // Catch:{ all -> 0x01be }
            r4.mo40065h(r3)     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.servlet.b[] r3 = r8.f18343q     // Catch:{ all -> 0x01be }
            r3 = r3[r0]     // Catch:{ all -> 0x01be }
            java.lang.String[] r3 = r3.mo40063f()     // Catch:{ all -> 0x01be }
            if (r3 == 0) goto L_0x004b
            java.util.List<org.eclipse.jetty.servlet.b> r3 = r8.f18351y     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.servlet.b[] r4 = r8.f18343q     // Catch:{ all -> 0x01be }
            r4 = r4[r0]     // Catch:{ all -> 0x01be }
            r3.add(r4)     // Catch:{ all -> 0x01be }
        L_0x004b:
            org.eclipse.jetty.servlet.b[] r3 = r8.f18343q     // Catch:{ all -> 0x01be }
            r3 = r3[r0]     // Catch:{ all -> 0x01be }
            java.lang.String[] r3 = r3.mo40064g()     // Catch:{ all -> 0x01be }
            if (r3 == 0) goto L_0x0073
            org.eclipse.jetty.servlet.b[] r3 = r8.f18343q     // Catch:{ all -> 0x01be }
            r3 = r3[r0]     // Catch:{ all -> 0x01be }
            java.lang.String[] r3 = r3.mo40064g()     // Catch:{ all -> 0x01be }
            r4 = 0
        L_0x005e:
            int r5 = r3.length     // Catch:{ all -> 0x01be }
            if (r4 >= r5) goto L_0x0073
            r5 = r3[r4]     // Catch:{ all -> 0x01be }
            if (r5 == 0) goto L_0x0070
            org.eclipse.jetty.util.MultiMap<java.lang.String> r5 = r8.f18352z     // Catch:{ all -> 0x01be }
            r6 = r3[r4]     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.servlet.b[] r7 = r8.f18343q     // Catch:{ all -> 0x01be }
            r7 = r7[r0]     // Catch:{ all -> 0x01be }
            r5.add(r6, r7)     // Catch:{ all -> 0x01be }
        L_0x0070:
            int r4 = r4 + 1
            goto L_0x005e
        L_0x0073:
            int r0 = r0 + 1
            goto L_0x001c
        L_0x0076:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r2.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "No filter named "
            r2.append(r3)     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.servlet.b[] r3 = r8.f18343q     // Catch:{ all -> 0x01be }
            r0 = r3[r0]     // Catch:{ all -> 0x01be }
            java.lang.String r0 = r0.mo40062e()     // Catch:{ all -> 0x01be }
            r2.append(r0)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01be }
            r1.<init>(r0)     // Catch:{ all -> 0x01be }
            throw r1     // Catch:{ all -> 0x01be }
        L_0x0095:
            org.eclipse.jetty.servlet.e[] r0 = r8.f18349w     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0106
            java.util.Map<java.lang.String, org.eclipse.jetty.servlet.ServletHolder> r0 = r8.f18336A     // Catch:{ all -> 0x01be }
            if (r0 != 0) goto L_0x009e
            goto L_0x0106
        L_0x009e:
            org.eclipse.jetty.http.PathMap r0 = new org.eclipse.jetty.http.PathMap     // Catch:{ all -> 0x01be }
            r0.<init>()     // Catch:{ all -> 0x01be }
            r1 = 0
        L_0x00a4:
            org.eclipse.jetty.servlet.e[] r3 = r8.f18349w     // Catch:{ all -> 0x01be }
            int r4 = r3.length     // Catch:{ all -> 0x01be }
            if (r1 >= r4) goto L_0x0103
            java.util.Map<java.lang.String, org.eclipse.jetty.servlet.ServletHolder> r4 = r8.f18336A     // Catch:{ all -> 0x01be }
            r3 = r3[r1]     // Catch:{ all -> 0x01be }
            java.lang.String r3 = r3.mo40108b()     // Catch:{ all -> 0x01be }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.servlet.ServletHolder r3 = (org.eclipse.jetty.servlet.ServletHolder) r3     // Catch:{ all -> 0x01be }
            if (r3 == 0) goto L_0x00e4
            boolean r4 = r3.mo40050a1()     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x00e1
            org.eclipse.jetty.servlet.e[] r4 = r8.f18349w     // Catch:{ all -> 0x01be }
            r4 = r4[r1]     // Catch:{ all -> 0x01be }
            java.lang.String[] r4 = r4.mo40107a()     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x00e1
            org.eclipse.jetty.servlet.e[] r4 = r8.f18349w     // Catch:{ all -> 0x01be }
            r4 = r4[r1]     // Catch:{ all -> 0x01be }
            java.lang.String[] r4 = r4.mo40107a()     // Catch:{ all -> 0x01be }
            r5 = 0
        L_0x00d2:
            int r6 = r4.length     // Catch:{ all -> 0x01be }
            if (r5 >= r6) goto L_0x00e1
            r6 = r4[r5]     // Catch:{ all -> 0x01be }
            if (r6 == 0) goto L_0x00de
            r6 = r4[r5]     // Catch:{ all -> 0x01be }
            r0.put(r6, r3)     // Catch:{ all -> 0x01be }
        L_0x00de:
            int r5 = r5 + 1
            goto L_0x00d2
        L_0x00e1:
            int r1 = r1 + 1
            goto L_0x00a4
        L_0x00e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r2.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "No such servlet: "
            r2.append(r3)     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.servlet.e[] r3 = r8.f18349w     // Catch:{ all -> 0x01be }
            r1 = r3[r1]     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r1.mo40108b()     // Catch:{ all -> 0x01be }
            r2.append(r1)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01be }
            r0.<init>(r1)     // Catch:{ all -> 0x01be }
            throw r0     // Catch:{ all -> 0x01be }
        L_0x0103:
            r8.f18337B = r0     // Catch:{ all -> 0x01be }
            goto L_0x0108
        L_0x0106:
            r8.f18337B = r1     // Catch:{ all -> 0x01be }
        L_0x0108:
            java.util.concurrent.ConcurrentMap<java.lang.String, javax.servlet.FilterChain>[] r0 = r8.f18338C     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x011e
            int r0 = r0.length     // Catch:{ all -> 0x01be }
        L_0x010d:
            int r1 = r0 + -1
            if (r0 <= 0) goto L_0x011e
            java.util.concurrent.ConcurrentMap<java.lang.String, javax.servlet.FilterChain>[] r0 = r8.f18338C     // Catch:{ all -> 0x01be }
            r3 = r0[r1]     // Catch:{ all -> 0x01be }
            if (r3 == 0) goto L_0x011c
            r0 = r0[r1]     // Catch:{ all -> 0x01be }
            r0.clear()     // Catch:{ all -> 0x01be }
        L_0x011c:
            r0 = r1
            goto L_0x010d
        L_0x011e:
            e6.c r0 = f18335R     // Catch:{ all -> 0x01be }
            boolean r1 = r0.mo36846a()     // Catch:{ all -> 0x01be }
            if (r1 == 0) goto L_0x019e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r1.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "filterNameMap="
            r1.append(r3)     // Catch:{ all -> 0x01be }
            java.util.Map<java.lang.String, org.eclipse.jetty.servlet.a> r3 = r8.f18350x     // Catch:{ all -> 0x01be }
            r1.append(r3)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01be }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01be }
            r0.mo36850e(r1, r3)     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r1.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "pathFilters="
            r1.append(r3)     // Catch:{ all -> 0x01be }
            java.util.List<org.eclipse.jetty.servlet.b> r3 = r8.f18351y     // Catch:{ all -> 0x01be }
            r1.append(r3)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01be }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01be }
            r0.mo36850e(r1, r3)     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r1.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "servletFilterMap="
            r1.append(r3)     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.util.MultiMap<java.lang.String> r3 = r8.f18352z     // Catch:{ all -> 0x01be }
            r1.append(r3)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01be }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01be }
            r0.mo36850e(r1, r3)     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r1.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "servletPathMap="
            r1.append(r3)     // Catch:{ all -> 0x01be }
            org.eclipse.jetty.http.PathMap r3 = r8.f18337B     // Catch:{ all -> 0x01be }
            r1.append(r3)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01be }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x01be }
            r0.mo36850e(r1, r3)     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r1.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "servletNameMap="
            r1.append(r3)     // Catch:{ all -> 0x01be }
            java.util.Map<java.lang.String, org.eclipse.jetty.servlet.ServletHolder> r3 = r8.f18336A     // Catch:{ all -> 0x01be }
            r1.append(r3)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01be }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01be }
            r0.mo36850e(r1, r2)     // Catch:{ all -> 0x01be }
        L_0x019e:
            org.eclipse.jetty.servlet.c r0 = r8.f18340n     // Catch:{ Exception -> 0x01b7 }
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r0.mo36748n0()     // Catch:{ Exception -> 0x01b7 }
            if (r0 != 0) goto L_0x01b2
        L_0x01a8:
            org.eclipse.jetty.servlet.c r0 = r8.f18340n     // Catch:{ Exception -> 0x01b7 }
            if (r0 != 0) goto L_0x01b5
            boolean r0 = r8.mo36748n0()     // Catch:{ Exception -> 0x01b7 }
            if (r0 == 0) goto L_0x01b5
        L_0x01b2:
            r8.mo40096k1()     // Catch:{ Exception -> 0x01b7 }
        L_0x01b5:
            monitor-exit(r8)
            return
        L_0x01b7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x01be }
            r1.<init>(r0)     // Catch:{ all -> 0x01be }
            throw r1     // Catch:{ all -> 0x01be }
        L_0x01be:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x01c2
        L_0x01c1:
            throw r0
        L_0x01c2:
            goto L_0x01c1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.C9968d.mo40102r1():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s1 */
    public synchronized void mo40103s1() {
        this.f18350x.clear();
        int i = 0;
        if (this.f18342p != null) {
            int i2 = 0;
            while (true) {
                C9961a[] aVarArr = this.f18342p;
                if (i2 >= aVarArr.length) {
                    break;
                }
                this.f18350x.put(aVarArr[i2].getName(), this.f18342p[i2]);
                this.f18342p[i2].mo40033N0(this);
                i2++;
            }
        }
        this.f18336A.clear();
        if (this.f18348v != null) {
            while (true) {
                ServletHolder[] servletHolderArr = this.f18348v;
                if (i >= servletHolderArr.length) {
                    break;
                }
                this.f18336A.put(servletHolderArr[i].getName(), this.f18348v[i]);
                this.f18348v[i].mo40033N0(this);
                i++;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public synchronized void mo26547u0() {
        C12084k kVar;
        C9943d.C9945b m1 = C9943d.m24416m1();
        this.f18341o = m1;
        C9965c cVar = (C9965c) (m1 == null ? null : m1.mo39960d());
        this.f18340n = cVar;
        if (!(cVar == null || (kVar = (C12084k) cVar.mo39923Q0(C12084k.class)) == null)) {
            this.f18347u = kVar.mo42741h();
        }
        mo40103s1();
        mo40102r1();
        if (this.f18344r) {
            this.f18338C[1] = new ConcurrentHashMap();
            this.f18338C[2] = new ConcurrentHashMap();
            this.f18338C[4] = new ConcurrentHashMap();
            this.f18338C[8] = new ConcurrentHashMap();
            this.f18338C[16] = new ConcurrentHashMap();
            this.f18339Q[1] = new ConcurrentLinkedQueue();
            this.f18339Q[2] = new ConcurrentLinkedQueue();
            this.f18339Q[4] = new ConcurrentLinkedQueue();
            this.f18339Q[8] = new ConcurrentLinkedQueue();
            this.f18339Q[16] = new ConcurrentLinkedQueue();
        }
        super.mo26547u0();
        C9965c cVar2 = this.f18340n;
        if (cVar2 == null || !(cVar2 instanceof C9965c)) {
            mo40096k1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public synchronized void mo26548v0() {
        super.mo26548v0();
        C9961a[] aVarArr = this.f18342p;
        if (aVarArr != null) {
            int length = aVarArr.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                try {
                    this.f18342p[i].stop();
                } catch (Exception e) {
                    f18335R.mo36852g("EXCEPTION ", e);
                }
                length = i;
            }
        }
        ServletHolder[] servletHolderArr = this.f18348v;
        if (servletHolderArr != null) {
            int length2 = servletHolderArr.length;
            while (true) {
                int i2 = length2 - 1;
                if (length2 <= 0) {
                    break;
                }
                try {
                    this.f18348v[i2].stop();
                } catch (Exception e2) {
                    f18335R.mo36852g("EXCEPTION ", e2);
                }
                length2 = i2;
            }
        }
        this.f18351y = null;
        this.f18352z = null;
        this.f18337B = null;
    }
}
