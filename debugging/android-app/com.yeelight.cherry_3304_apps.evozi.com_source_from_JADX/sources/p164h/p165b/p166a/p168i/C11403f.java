package p164h.p165b.p166a.p168i;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p170k.C11451b;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11245f;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p248s.C11326f;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.i.f */
public class C11403f implements Runnable {

    /* renamed from: d */
    private static final Logger f22683d = Logger.getLogger(C11403f.class.getName());

    /* renamed from: e */
    private static final Set<URL> f22684e = new CopyOnWriteArraySet();

    /* renamed from: a */
    private final C4423b f22685a;

    /* renamed from: b */
    private C11332l f22686b;

    /* renamed from: c */
    protected List<C11365e0> f22687c = new ArrayList();

    public C11403f(C4423b bVar, C11332l lVar) {
        this.f22685a = bVar;
        this.f22686b = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36165b() {
        if (mo36170g().getRouter() == null) {
            f22683d.warning("Router not yet initialized");
            return;
        }
        try {
            C11243d dVar = new C11243d(C11249i.C11250a.GET, ((C11333m) this.f22686b.mo35899p()).mo35973d());
            C11245f descriptorRetrievalHeaders = mo36170g().getConfiguration().getDescriptorRetrievalHeaders((C11333m) this.f22686b.mo35899p());
            if (descriptorRetrievalHeaders != null) {
                dVar.mo35747j().putAll(descriptorRetrievalHeaders);
            }
            Logger logger = f22683d;
            logger.fine("Sending device descriptor retrieval message: " + dVar);
            C11244e d = mo36170g().getRouter().mo24453d(dVar);
            if (d == null) {
                Logger logger2 = f22683d;
                logger2.warning("Device descriptor retrieval failed, no response: " + ((C11333m) this.f22686b.mo35899p()).mo35973d());
            } else if (((C11252j) d.mo35776k()).mo35798f()) {
                Logger logger3 = f22683d;
                logger3.warning("Device descriptor retrieval failed: " + ((C11333m) this.f22686b.mo35899p()).mo35973d() + ", " + ((C11252j) d.mo35776k()).mo35795c());
            } else {
                if (!d.mo35782q()) {
                    Logger logger4 = f22683d;
                    logger4.fine("Received device descriptor without or with invalid Content-Type: " + ((C11333m) this.f22686b.mo35899p()).mo35973d());
                }
                String c = d.mo35770c();
                if (c == null || c.length() == 0) {
                    Logger logger5 = f22683d;
                    logger5.warning("Received empty device descriptor:" + ((C11333m) this.f22686b.mo35899p()).mo35973d());
                    return;
                }
                Logger logger6 = f22683d;
                logger6.fine("Received root device descriptor: " + d);
                mo36166c(c);
            }
        } catch (IllegalArgumentException e) {
            Logger logger7 = f22683d;
            logger7.warning("Device descriptor retrieval failed: " + ((C11333m) this.f22686b.mo35899p()).mo35973d() + ", possibly invalid URL: " + e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: h.b.a.j.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: h.b.a.j.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: h.b.a.j.c} */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36166c(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Cause was: "
            r1 = 0
            r2 = 0
            h.b.a.b r3 = r7.mo36170g()     // Catch:{ m -> 0x0160, d -> 0x0127, c -> 0x00e2 }
            h.b.a.c r3 = r3.getConfiguration()     // Catch:{ m -> 0x0160, d -> 0x0127, c -> 0x00e2 }
            h.b.a.f.e.e r3 = r3.getDeviceDescriptorBinderUDA10()     // Catch:{ m -> 0x0160, d -> 0x0127, c -> 0x00e2 }
            h.b.a.h.s.l r4 = r7.f22686b     // Catch:{ m -> 0x0160, d -> 0x0127, c -> 0x00e2 }
            h.b.a.h.s.c r8 = r3.mo35549a(r4, r8)     // Catch:{ m -> 0x0160, d -> 0x0127, c -> 0x00e2 }
            h.b.a.h.s.l r8 = (p164h.p165b.p166a.p240h.p248s.C11332l) r8     // Catch:{ m -> 0x0160, d -> 0x0127, c -> 0x00e2 }
            java.util.logging.Logger r2 = f22683d     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r3.<init>()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.String r4 = "Remote device described (without services) notifying listeners: "
            r3.append(r4)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r3.append(r8)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.String r3 = r3.toString()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r2.fine(r3)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.b r2 = r7.mo36170g()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.j.d r2 = r2.getRegistry()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            boolean r1 = r2.mo24432w(r8)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.util.logging.Logger r2 = f22683d     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r3.<init>()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.String r4 = "Hydrating described device's services: "
            r3.append(r4)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r3.append(r8)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.String r3 = r3.toString()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r2.fine(r3)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.s.l r2 = r7.mo36168e(r8)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            if (r2 != 0) goto L_0x00b7
            java.util.List<h.b.a.h.w.e0> r2 = r7.f22687c     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.s.l r3 = r7.f22686b     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.s.e r3 = r3.mo35899p()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.s.m r3 = (p164h.p165b.p166a.p240h.p248s.C11333m) r3     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.w.e0 r3 = r3.mo35922b()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            boolean r2 = r2.contains(r3)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.String r3 = "Device service description failed: "
            if (r2 != 0) goto L_0x0093
            java.util.List<h.b.a.h.w.e0> r2 = r7.f22687c     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.s.l r4 = r7.f22686b     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.s.e r4 = r4.mo35899p()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.s.m r4 = (p164h.p165b.p166a.p240h.p248s.C11333m) r4     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.w.e0 r4 = r4.mo35922b()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r2.add(r4)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.util.logging.Logger r2 = f22683d     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r4.<init>()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r4.append(r3)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.s.l r5 = r7.f22686b     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r4.append(r5)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.String r4 = r4.toString()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r2.warning(r4)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
        L_0x0093:
            if (r1 == 0) goto L_0x00b6
            h.b.a.b r2 = r7.mo36170g()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.j.d r2 = r2.getRegistry()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.f.e.d r4 = new h.b.a.f.e.d     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r5.<init>()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r5.append(r3)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.h.s.l r3 = r7.f22686b     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r5.append(r3)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.String r3 = r5.toString()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r4.<init>(r3)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r2.mo24421n(r8, r4)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
        L_0x00b6:
            return
        L_0x00b7:
            java.util.logging.Logger r3 = f22683d     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r4.<init>()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.String r5 = "Adding fully hydrated remote device to registry: "
            r4.append(r5)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r4.append(r2)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            java.lang.String r4 = r4.toString()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r3.fine(r4)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.b r3 = r7.mo36170g()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            h.b.a.j.d r3 = r3.getRegistry()     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            r3.mo24430u(r2)     // Catch:{ m -> 0x00de, d -> 0x00dc, c -> 0x00da }
            goto L_0x01cb
        L_0x00da:
            r2 = move-exception
            goto L_0x00e6
        L_0x00dc:
            r2 = move-exception
            goto L_0x012b
        L_0x00de:
            r0 = move-exception
            r2 = r8
            goto L_0x0161
        L_0x00e2:
            r8 = move-exception
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x00e6:
            java.util.logging.Logger r3 = f22683d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Adding hydrated device to registry failed: "
            r4.append(r5)
            h.b.a.h.s.l r5 = r7.f22686b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.warning(r4)
            java.util.logging.Logger r3 = f22683d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r2.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.warning(r0)
            if (r8 == 0) goto L_0x01cb
            if (r1 == 0) goto L_0x01cb
        L_0x011a:
            h.b.a.b r0 = r7.mo36170g()
            h.b.a.j.d r0 = r0.getRegistry()
            r0.mo24421n(r8, r2)
            goto L_0x01cb
        L_0x0127:
            r8 = move-exception
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x012b:
            java.util.logging.Logger r3 = f22683d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not hydrate device or its services from descriptor: "
            r4.append(r5)
            h.b.a.h.s.l r5 = r7.f22686b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.warning(r4)
            java.util.logging.Logger r3 = f22683d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.Throwable r0 = p164h.p257c.p259b.C11495a.m30173a(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.warning(r0)
            if (r8 == 0) goto L_0x01cb
            if (r1 == 0) goto L_0x01cb
            goto L_0x011a
        L_0x0160:
            r0 = move-exception
        L_0x0161:
            java.util.List<h.b.a.h.w.e0> r8 = r7.f22687c
            h.b.a.h.s.l r3 = r7.f22686b
            h.b.a.h.s.e r3 = r3.mo35899p()
            h.b.a.h.s.m r3 = (p164h.p165b.p166a.p240h.p248s.C11333m) r3
            h.b.a.h.w.e0 r3 = r3.mo35922b()
            boolean r8 = r8.contains(r3)
            if (r8 != 0) goto L_0x01cb
            java.util.List<h.b.a.h.w.e0> r8 = r7.f22687c
            h.b.a.h.s.l r3 = r7.f22686b
            h.b.a.h.s.e r3 = r3.mo35899p()
            h.b.a.h.s.m r3 = (p164h.p165b.p166a.p240h.p248s.C11333m) r3
            h.b.a.h.w.e0 r3 = r3.mo35922b()
            r8.add(r3)
            java.util.logging.Logger r8 = f22683d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not validate device model: "
            r3.append(r4)
            h.b.a.h.s.l r4 = r7.f22686b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.warning(r3)
            java.util.List r8 = r0.mo35687a()
            java.util.Iterator r8 = r8.iterator()
        L_0x01a6:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x01bc
            java.lang.Object r3 = r8.next()
            h.b.a.h.l r3 = (p164h.p165b.p166a.p240h.C11222l) r3
            java.util.logging.Logger r4 = f22683d
            java.lang.String r3 = r3.toString()
            r4.warning(r3)
            goto L_0x01a6
        L_0x01bc:
            if (r2 == 0) goto L_0x01cb
            if (r1 == 0) goto L_0x01cb
            h.b.a.b r8 = r7.mo36170g()
            h.b.a.j.d r8 = r8.getRegistry()
            r8.mo24421n(r2, r0)
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p168i.C11403f.mo36166c(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C11334n mo36167d(C11334n nVar) {
        try {
            URL N = ((C11332l) nVar.mo35983d()).mo35970N(nVar.mo35977o());
            C11243d dVar = new C11243d(C11249i.C11250a.GET, N);
            C11245f descriptorRetrievalHeaders = mo36170g().getConfiguration().getDescriptorRetrievalHeaders((C11333m) ((C11332l) nVar.mo35983d()).mo35899p());
            if (descriptorRetrievalHeaders != null) {
                dVar.mo35747j().putAll(descriptorRetrievalHeaders);
            }
            Logger logger = f22683d;
            logger.fine("Sending service descriptor retrieval message: " + dVar);
            C11244e d = mo36170g().getRouter().mo24453d(dVar);
            if (d == null) {
                Logger logger2 = f22683d;
                logger2.warning("Could not retrieve service descriptor, no response: " + nVar);
                return null;
            } else if (((C11252j) d.mo35776k()).mo35798f()) {
                Logger logger3 = f22683d;
                logger3.warning("Service descriptor retrieval failed: " + N + ", " + ((C11252j) d.mo35776k()).mo35795c());
                return null;
            } else {
                if (!d.mo35782q()) {
                    Logger logger4 = f22683d;
                    logger4.fine("Received service descriptor without or with invalid Content-Type: " + N);
                }
                String c = d.mo35770c();
                if (c == null || c.length() == 0) {
                    Logger logger5 = f22683d;
                    logger5.warning("Received empty service descriptor:" + N);
                    return null;
                }
                Logger logger6 = f22683d;
                logger6.fine("Received service descriptor, hydrating service model: " + d);
                return (C11334n) mo36170g().getConfiguration().getServiceDescriptorBinderUDA10().mo35555a(nVar, c);
            }
        } catch (IllegalArgumentException unused) {
            Logger logger7 = f22683d;
            logger7.warning("Could not normalize service descriptor URL: " + nVar.mo35977o());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11332l mo36168e(C11332l lVar) {
        C11332l e;
        ArrayList arrayList = new ArrayList();
        if (lVar.mo35908x()) {
            for (C11334n next : mo36169f(lVar.mo35902s())) {
                C11334n d = mo36167d(next);
                if (d != null) {
                    arrayList.add(d);
                } else {
                    f22683d.warning("Skipping invalid service '" + next + "' of: " + lVar);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (lVar.mo35906v()) {
            for (C11332l lVar2 : lVar.mo35897n()) {
                if (!(lVar2 == null || (e = mo36168e(lVar2)) == null)) {
                    arrayList2.add(e);
                }
            }
        }
        C11326f[] fVarArr = new C11326f[lVar.mo35898o().length];
        for (int i = 0; i < lVar.mo35898o().length; i++) {
            fVarArr[i] = lVar.mo35898o()[i].mo35927a();
        }
        return lVar.mo35876A(((C11333m) lVar.mo35899p()).mo35922b(), lVar.mo35905u(), lVar.mo35903t(), lVar.mo35895l(), fVarArr, lVar.mo35972P(arrayList), arrayList2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public List<C11334n> mo36169f(C11334n[] nVarArr) {
        C11397x[] exclusiveServiceTypes = mo36170g().getConfiguration().getExclusiveServiceTypes();
        if (exclusiveServiceTypes == null || exclusiveServiceTypes.length == 0) {
            return Arrays.asList(nVarArr);
        }
        ArrayList arrayList = new ArrayList();
        for (C11334n nVar : nVarArr) {
            for (C11397x xVar : exclusiveServiceTypes) {
                if (nVar.mo35986g().mo36140d(xVar)) {
                    f22683d.fine("Including exclusive service: " + nVar);
                    arrayList.add(nVar);
                } else {
                    f22683d.fine("Excluding unwanted service: " + xVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public C4423b mo36170g() {
        return this.f22685a;
    }

    public void run() {
        Logger logger;
        StringBuilder sb;
        String str;
        URL d = ((C11333m) this.f22686b.mo35899p()).mo35973d();
        if (f22684e.contains(d)) {
            logger = f22683d;
            sb = new StringBuilder();
            str = "Exiting early, active retrieval for URL already in progress: ";
        } else if (mo36170g().getRegistry().mo24426r(((C11333m) this.f22686b.mo35899p()).mo35922b(), true) != null) {
            logger = f22683d;
            sb = new StringBuilder();
            str = "Exiting early, already discovered: ";
        } else {
            try {
                f22684e.add(d);
                mo36165b();
            } catch (C11451b e) {
                Logger logger2 = f22683d;
                Level level = Level.WARNING;
                logger2.log(level, "Descriptor retrieval failed: " + d, e);
            } catch (Throwable th) {
                f22684e.remove(d);
                throw th;
            }
            f22684e.remove(d);
            return;
        }
        sb.append(str);
        sb.append(d);
        logger.finer(sb.toString());
    }
}
