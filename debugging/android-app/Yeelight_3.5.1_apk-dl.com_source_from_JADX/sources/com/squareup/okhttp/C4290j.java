package com.squareup.okhttp;

import com.xiaomi.mipush.sdk.Constants;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p231y2.C12028i;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.j */
public final class C4290j {

    /* renamed from: f */
    private static final C4290j f6966f;

    /* renamed from: a */
    private final int f6967a;

    /* renamed from: b */
    private final long f6968b;

    /* renamed from: c */
    private final LinkedList<C4289i> f6969c = new LinkedList<>();

    /* renamed from: d */
    private Executor f6970d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C12033k.m31057q("OkHttp ConnectionPool", true));

    /* renamed from: e */
    private final Runnable f6971e = new C4291a();

    /* renamed from: com.squareup.okhttp.j$a */
    class C4291a implements Runnable {
        C4291a() {
        }

        public void run() {
            C4290j.this.m11943g();
        }
    }

    static {
        C4290j jVar;
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
        if (property != null && !Boolean.parseBoolean(property)) {
            jVar = new C4290j(0, parseLong);
        } else if (property3 != null) {
            int parseInt = Integer.parseInt(property3);
        } else {
            jVar = new C4290j(5, parseLong);
        }
        f6966f = jVar;
    }

    public C4290j(int i, long j) {
        this.f6967a = i;
        this.f6968b = j * 1000 * 1000;
    }

    /* renamed from: b */
    private void m11941b(C4289i iVar) {
        boolean isEmpty = this.f6969c.isEmpty();
        this.f6969c.addFirst(iVar);
        if (isEmpty) {
            this.f6970d.execute(this.f6971e);
        } else {
            notifyAll();
        }
    }

    /* renamed from: d */
    public static C4290j m11942d() {
        return f6966f;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m11943g() {
        do {
        } while (mo27899e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r0 = r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.squareup.okhttp.C4289i mo27898c(com.squareup.okhttp.C4268a r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            java.util.LinkedList<com.squareup.okhttp.i> r1 = r8.f6969c     // Catch:{ all -> 0x0082 }
            int r2 = r1.size()     // Catch:{ all -> 0x0082 }
            java.util.ListIterator r1 = r1.listIterator(r2)     // Catch:{ all -> 0x0082 }
        L_0x000c:
            boolean r2 = r1.hasPrevious()     // Catch:{ all -> 0x0082 }
            if (r2 == 0) goto L_0x0073
            java.lang.Object r2 = r1.previous()     // Catch:{ all -> 0x0082 }
            com.squareup.okhttp.i r2 = (com.squareup.okhttp.C4289i) r2     // Catch:{ all -> 0x0082 }
            com.squareup.okhttp.z r3 = r2.mo27876l()     // Catch:{ all -> 0x0082 }
            com.squareup.okhttp.a r3 = r3.mo28090a()     // Catch:{ all -> 0x0082 }
            boolean r3 = r3.equals(r9)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x000c
            boolean r3 = r2.mo27879o()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x000c
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
            long r5 = r2.mo27874j()     // Catch:{ all -> 0x0082 }
            long r3 = r3 - r5
            long r5 = r8.f6968b     // Catch:{ all -> 0x0082 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x003c
            goto L_0x000c
        L_0x003c:
            r1.remove()     // Catch:{ all -> 0x0082 }
            boolean r3 = r2.mo27881q()     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x0072
            y2.i r3 = p231y2.C12028i.m31019f()     // Catch:{ SocketException -> 0x0051 }
            java.net.Socket r4 = r2.mo27877m()     // Catch:{ SocketException -> 0x0051 }
            r3.mo42655j(r4)     // Catch:{ SocketException -> 0x0051 }
            goto L_0x0072
        L_0x0051:
            r3 = move-exception
            java.net.Socket r2 = r2.mo27877m()     // Catch:{ all -> 0x0082 }
            p231y2.C12033k.m31044d(r2)     // Catch:{ all -> 0x0082 }
            y2.i r2 = p231y2.C12028i.m31019f()     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r4.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "Unable to tagSocket(): "
            r4.append(r5)     // Catch:{ all -> 0x0082 }
            r4.append(r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0082 }
            r2.mo42654i(r3)     // Catch:{ all -> 0x0082 }
            goto L_0x000c
        L_0x0072:
            r0 = r2
        L_0x0073:
            if (r0 == 0) goto L_0x0080
            boolean r9 = r0.mo27881q()     // Catch:{ all -> 0x0082 }
            if (r9 == 0) goto L_0x0080
            java.util.LinkedList<com.squareup.okhttp.i> r9 = r8.f6969c     // Catch:{ all -> 0x0082 }
            r9.addFirst(r0)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r8)
            return r0
        L_0x0082:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0086
        L_0x0085:
            throw r9
        L_0x0086:
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.C4290j.mo27898c(com.squareup.okhttp.a):com.squareup.okhttp.i");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo27899e() {
        synchronized (this) {
            if (this.f6969c.isEmpty()) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            long nanoTime = System.nanoTime();
            long j = this.f6968b;
            LinkedList<C4289i> linkedList = this.f6969c;
            ListIterator<C4289i> listIterator = linkedList.listIterator(linkedList.size());
            int i = 0;
            while (listIterator.hasPrevious()) {
                C4289i previous = listIterator.previous();
                long j2 = (previous.mo27874j() + this.f6968b) - nanoTime;
                if (j2 > 0) {
                    if (previous.mo27879o()) {
                        if (previous.mo27882r()) {
                            i++;
                            j = Math.min(j, j2);
                        }
                    }
                }
                listIterator.remove();
                arrayList.add(previous);
            }
            LinkedList<C4289i> linkedList2 = this.f6969c;
            ListIterator<C4289i> listIterator2 = linkedList2.listIterator(linkedList2.size());
            while (listIterator2.hasPrevious() && i > this.f6967a) {
                C4289i previous2 = listIterator2.previous();
                if (previous2.mo27882r()) {
                    arrayList.add(previous2);
                    listIterator2.remove();
                    i--;
                }
            }
            if (arrayList.isEmpty()) {
                try {
                    long j3 = j / 1000000;
                    Long.signum(j3);
                    wait(j3, (int) (j - (1000000 * j3)));
                    return true;
                } catch (InterruptedException unused) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C12033k.m31044d(((C4289i) arrayList.get(i2)).mo27877m());
                    }
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo27900f(C4289i iVar) {
        if (!iVar.mo27881q() && iVar.mo27869a()) {
            if (iVar.mo27879o()) {
                try {
                    C12028i.m31019f().mo42656k(iVar.mo27877m());
                    synchronized (this) {
                        m11941b(iVar);
                        iVar.mo27878n();
                        iVar.mo27887v();
                    }
                    return;
                } catch (SocketException e) {
                    C12028i f = C12028i.m31019f();
                    f.mo42654i("Unable to untagSocket(): " + e);
                }
            }
            C12033k.m31044d(iVar.mo27877m());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo27901h(C4289i iVar) {
        if (!iVar.mo27881q()) {
            throw new IllegalArgumentException();
        } else if (iVar.mo27879o()) {
            synchronized (this) {
                m11941b(iVar);
            }
        }
    }
}
