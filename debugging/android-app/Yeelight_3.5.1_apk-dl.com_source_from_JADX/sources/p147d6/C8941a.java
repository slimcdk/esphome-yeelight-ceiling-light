package p147d6;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p147d6.C8949e;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: d6.a */
public abstract class C8941a implements C8949e {

    /* renamed from: d */
    private static final C9003c f16442d = C9001b.m21450a(C8941a.class);

    /* renamed from: a */
    private final Object f16443a = new Object();

    /* renamed from: b */
    private volatile int f16444b = 0;

    /* renamed from: c */
    protected final CopyOnWriteArrayList<C8949e.C8950a> f16445c = new CopyOnWriteArrayList<>();

    /* renamed from: A0 */
    private void m21345A0() {
        f16442d.mo36850e("starting {}", this);
        this.f16444b = 1;
        Iterator<C8949e.C8950a> it = this.f16445c.iterator();
        while (it.hasNext()) {
            it.next().mo36777G(this);
        }
    }

    /* renamed from: B0 */
    private void m21346B0() {
        this.f16444b = 0;
        f16442d.mo36850e("{} {}", "STOPPED", this);
        Iterator<C8949e.C8950a> it = this.f16445c.iterator();
        while (it.hasNext()) {
            it.next().mo36779h(this);
        }
    }

    /* renamed from: C0 */
    private void m21347C0() {
        f16442d.mo36850e("stopping {}", this);
        this.f16444b = 3;
        Iterator<C8949e.C8950a> it = this.f16445c.iterator();
        while (it.hasNext()) {
            it.next().mo36776D(this);
        }
    }

    /* renamed from: x0 */
    public static String m21348x0(C8949e eVar) {
        return eVar.mo36745M() ? "STARTING" : eVar.mo36748n0() ? "STARTED" : eVar.mo36751w() ? "STOPPING" : eVar.isStopped() ? "STOPPED" : "FAILED";
    }

    /* renamed from: y0 */
    private void m21349y0(Throwable th) {
        this.f16444b = -1;
        C9003c cVar = f16442d;
        cVar.mo36852g("FAILED " + this + ": " + th, th);
        Iterator<C8949e.C8950a> it = this.f16445c.iterator();
        while (it.hasNext()) {
            it.next().mo36778f(this, th);
        }
    }

    /* renamed from: z0 */
    private void m21350z0() {
        this.f16444b = 2;
        f16442d.mo36850e("STARTED {}", this);
        Iterator<C8949e.C8950a> it = this.f16445c.iterator();
        while (it.hasNext()) {
            it.next().mo36780z(this);
        }
    }

    /* renamed from: M */
    public boolean mo36745M() {
        return this.f16444b == 1;
    }

    public boolean isRunning() {
        int i = this.f16444b;
        return i == 2 || i == 1;
    }

    public boolean isStopped() {
        return this.f16444b == 0;
    }

    /* renamed from: n0 */
    public boolean mo36748n0() {
        return this.f16444b == 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16443a
            monitor-enter(r0)
            int r1 = r3.f16444b     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
            r2 = 2
            if (r1 == r2) goto L_0x0019
            int r1 = r3.f16444b     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
            r2 = 1
            if (r1 != r2) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            r3.m21345A0()     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
            r3.mo26547u0()     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
            r3.m21350z0()     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r1 = move-exception
            goto L_0x0027
        L_0x001d:
            r1 = move-exception
            r3.m21349y0(r1)     // Catch:{ all -> 0x001b }
            throw r1     // Catch:{ all -> 0x001b }
        L_0x0022:
            r1 = move-exception
            r3.m21349y0(r1)     // Catch:{ all -> 0x001b }
            throw r1     // Catch:{ all -> 0x001b }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p147d6.C8941a.start():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void stop() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16443a
            monitor-enter(r0)
            int r1 = r3.f16444b     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
            r2 = 3
            if (r1 == r2) goto L_0x0018
            int r1 = r3.f16444b     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
            if (r1 != 0) goto L_0x000d
            goto L_0x0018
        L_0x000d:
            r3.m21347C0()     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
            r3.mo26548v0()     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
            r3.m21346B0()     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r1 = move-exception
            goto L_0x0026
        L_0x001c:
            r1 = move-exception
            r3.m21349y0(r1)     // Catch:{ all -> 0x001a }
            throw r1     // Catch:{ all -> 0x001a }
        L_0x0021:
            r1 = move-exception
            r3.m21349y0(r1)     // Catch:{ all -> 0x001a }
            throw r1     // Catch:{ all -> 0x001a }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p147d6.C8941a.stop():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
    }

    /* renamed from: w */
    public boolean mo36751w() {
        return this.f16444b == 3;
    }

    /* renamed from: w0 */
    public String mo36752w0() {
        int i = this.f16444b;
        if (i == -1) {
            return "FAILED";
        }
        if (i == 0) {
            return "STOPPED";
        }
        if (i == 1) {
            return "STARTING";
        }
        if (i == 2) {
            return "STARTED";
        }
        if (i != 3) {
            return null;
        }
        return "STOPPING";
    }
}
