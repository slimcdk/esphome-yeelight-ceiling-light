package p011c.p083d.p084a;

import com.xiaomi.mipush.sdk.Constants;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p084a.p085d0.C1019i;
import p011c.p083d.p084a.p085d0.C1024k;

/* renamed from: c.d.a.k */
public final class C1121k {

    /* renamed from: f */
    private static final C1121k f1771f;

    /* renamed from: a */
    private final int f1772a;

    /* renamed from: b */
    private final long f1773b;

    /* renamed from: c */
    private final LinkedList<C1120j> f1774c = new LinkedList<>();

    /* renamed from: d */
    private Executor f1775d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C1024k.m2106q("OkHttp ConnectionPool", true));

    /* renamed from: e */
    private final Runnable f1776e = new C1122a();

    /* renamed from: c.d.a.k$a */
    class C1122a implements Runnable {
        C1122a() {
        }

        public void run() {
            C1121k.this.m2663g();
        }
    }

    static {
        C1121k kVar;
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
        if (property != null && !Boolean.parseBoolean(property)) {
            kVar = new C1121k(0, parseLong);
        } else if (property3 != null) {
            int parseInt = Integer.parseInt(property3);
        } else {
            kVar = new C1121k(5, parseLong);
        }
        f1771f = kVar;
    }

    public C1121k(int i, long j) {
        this.f1772a = i;
        this.f1773b = j * 1000 * 1000;
    }

    /* renamed from: b */
    private void m2661b(C1120j jVar) {
        boolean isEmpty = this.f1774c.isEmpty();
        this.f1774c.addFirst(jVar);
        if (isEmpty) {
            this.f1775d.execute(this.f1776e);
        } else {
            notifyAll();
        }
    }

    /* renamed from: d */
    public static C1121k m2662d() {
        return f1771f;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m2663g() {
        do {
        } while (mo9712e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        r0 = r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p011c.p083d.p084a.C1120j mo9711c(p011c.p083d.p084a.C0987a r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            java.util.LinkedList<c.d.a.j> r1 = r8.f1774c     // Catch:{ all -> 0x0084 }
            java.util.LinkedList<c.d.a.j> r2 = r8.f1774c     // Catch:{ all -> 0x0084 }
            int r2 = r2.size()     // Catch:{ all -> 0x0084 }
            java.util.ListIterator r1 = r1.listIterator(r2)     // Catch:{ all -> 0x0084 }
        L_0x000e:
            boolean r2 = r1.hasPrevious()     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x0075
            java.lang.Object r2 = r1.previous()     // Catch:{ all -> 0x0084 }
            c.d.a.j r2 = (p011c.p083d.p084a.C1120j) r2     // Catch:{ all -> 0x0084 }
            c.d.a.b0 r3 = r2.mo9696l()     // Catch:{ all -> 0x0084 }
            c.d.a.a r3 = r3.mo9394a()     // Catch:{ all -> 0x0084 }
            boolean r3 = r3.equals(r9)     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x000e
            boolean r3 = r2.mo9699o()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x000e
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0084 }
            long r5 = r2.mo9694j()     // Catch:{ all -> 0x0084 }
            long r3 = r3 - r5
            long r5 = r8.f1773b     // Catch:{ all -> 0x0084 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x003e
            goto L_0x000e
        L_0x003e:
            r1.remove()     // Catch:{ all -> 0x0084 }
            boolean r3 = r2.mo9701q()     // Catch:{ all -> 0x0084 }
            if (r3 != 0) goto L_0x0074
            c.d.a.d0.i r3 = p011c.p083d.p084a.p085d0.C1019i.m2068f()     // Catch:{ SocketException -> 0x0053 }
            java.net.Socket r4 = r2.mo9697m()     // Catch:{ SocketException -> 0x0053 }
            r3.mo9479j(r4)     // Catch:{ SocketException -> 0x0053 }
            goto L_0x0074
        L_0x0053:
            r3 = move-exception
            java.net.Socket r2 = r2.mo9697m()     // Catch:{ all -> 0x0084 }
            p011c.p083d.p084a.p085d0.C1024k.m2093d(r2)     // Catch:{ all -> 0x0084 }
            c.d.a.d0.i r2 = p011c.p083d.p084a.p085d0.C1019i.m2068f()     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r4.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "Unable to tagSocket(): "
            r4.append(r5)     // Catch:{ all -> 0x0084 }
            r4.append(r3)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0084 }
            r2.mo9478i(r3)     // Catch:{ all -> 0x0084 }
            goto L_0x000e
        L_0x0074:
            r0 = r2
        L_0x0075:
            if (r0 == 0) goto L_0x0082
            boolean r9 = r0.mo9701q()     // Catch:{ all -> 0x0084 }
            if (r9 == 0) goto L_0x0082
            java.util.LinkedList<c.d.a.j> r9 = r8.f1774c     // Catch:{ all -> 0x0084 }
            r9.addFirst(r0)     // Catch:{ all -> 0x0084 }
        L_0x0082:
            monitor-exit(r8)
            return r0
        L_0x0084:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0088
        L_0x0087:
            throw r9
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C1121k.mo9711c(c.d.a.a):c.d.a.j");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9712e() {
        synchronized (this) {
            if (this.f1774c.isEmpty()) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            long nanoTime = System.nanoTime();
            long j = this.f1773b;
            ListIterator<C1120j> listIterator = this.f1774c.listIterator(this.f1774c.size());
            int i = 0;
            while (listIterator.hasPrevious()) {
                C1120j previous = listIterator.previous();
                long j2 = (previous.mo9694j() + this.f1773b) - nanoTime;
                if (j2 > 0) {
                    if (previous.mo9699o()) {
                        if (previous.mo9702r()) {
                            i++;
                            j = Math.min(j, j2);
                        }
                    }
                }
                listIterator.remove();
                arrayList.add(previous);
            }
            ListIterator<C1120j> listIterator2 = this.f1774c.listIterator(this.f1774c.size());
            while (listIterator2.hasPrevious() && i > this.f1772a) {
                C1120j previous2 = listIterator2.previous();
                if (previous2.mo9702r()) {
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
                        C1024k.m2093d(((C1120j) arrayList.get(i2)).mo9697m());
                    }
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9713f(C1120j jVar) {
        if (!jVar.mo9701q() && jVar.mo9689a()) {
            if (jVar.mo9699o()) {
                try {
                    C1019i.m2068f().mo9480k(jVar.mo9697m());
                    synchronized (this) {
                        m2661b(jVar);
                        jVar.mo9698n();
                        jVar.mo9707v();
                    }
                    return;
                } catch (SocketException e) {
                    C1019i f = C1019i.m2068f();
                    f.mo9478i("Unable to untagSocket(): " + e);
                }
            }
            C1024k.m2093d(jVar.mo9697m());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9714h(C1120j jVar) {
        if (!jVar.mo9701q()) {
            throw new IllegalArgumentException();
        } else if (jVar.mo9699o()) {
            synchronized (this) {
                m2661b(jVar);
            }
        }
    }
}
