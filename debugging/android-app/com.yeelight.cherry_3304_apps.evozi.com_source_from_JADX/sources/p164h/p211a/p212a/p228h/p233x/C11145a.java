package p164h.p211a.p212a.p228h.p233x;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p164h.p211a.p212a.p228h.p233x.C11153e;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.x.a */
public abstract class C11145a implements C11153e {

    /* renamed from: d */
    private static final C11158c f22080d = C11156b.m29015a(C11145a.class);

    /* renamed from: a */
    private final Object f22081a = new Object();

    /* renamed from: b */
    private volatile int f22082b = 0;

    /* renamed from: c */
    protected final CopyOnWriteArrayList<C11153e.C11154a> f22083c = new CopyOnWriteArrayList<>();

    /* renamed from: s0 */
    public static String m28963s0(C11153e eVar) {
        return eVar.mo35449K() ? "STARTING" : eVar.mo35452j0() ? "STARTED" : eVar.mo35456u() ? "STOPPING" : eVar.mo35450Q() ? "STOPPED" : "FAILED";
    }

    /* renamed from: t0 */
    private void m28964t0(Throwable th) {
        this.f22082b = -1;
        C11158c cVar = f22080d;
        cVar.mo35492h("FAILED " + this + ": " + th, th);
        Iterator<C11153e.C11154a> it = this.f22083c.iterator();
        while (it.hasNext()) {
            it.next().mo35477F(this, th);
        }
    }

    /* renamed from: u0 */
    private void m28965u0() {
        this.f22082b = 2;
        f22080d.mo35489e("STARTED {}", this);
        Iterator<C11153e.C11154a> it = this.f22083c.iterator();
        while (it.hasNext()) {
            it.next().mo35481t(this);
        }
    }

    /* renamed from: v0 */
    private void m28966v0() {
        f22080d.mo35489e("starting {}", this);
        this.f22082b = 1;
        Iterator<C11153e.C11154a> it = this.f22083c.iterator();
        while (it.hasNext()) {
            it.next().mo35479L(this);
        }
    }

    /* renamed from: w0 */
    private void m28967w0() {
        this.f22082b = 0;
        f22080d.mo35489e("{} {}", "STOPPED", this);
        Iterator<C11153e.C11154a> it = this.f22083c.iterator();
        while (it.hasNext()) {
            it.next().mo35478G(this);
        }
    }

    /* renamed from: x0 */
    private void m28968x0() {
        f22080d.mo35489e("stopping {}", this);
        this.f22082b = 3;
        Iterator<C11153e.C11154a> it = this.f22083c.iterator();
        while (it.hasNext()) {
            it.next().mo35480k(this);
        }
    }

    /* renamed from: K */
    public boolean mo35449K() {
        return this.f22082b == 1;
    }

    /* renamed from: Q */
    public boolean mo35450Q() {
        return this.f22082b == 0;
    }

    public boolean isRunning() {
        int i = this.f22082b;
        return i == 2 || i == 1;
    }

    /* renamed from: j0 */
    public boolean mo35452j0() {
        return this.f22082b == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
    }

    /* renamed from: r0 */
    public String mo35453r0() {
        int i = this.f22082b;
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

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f22081a
            monitor-enter(r0)
            int r1 = r3.f22082b     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
            r2 = 2
            if (r1 == r2) goto L_0x0019
            int r1 = r3.f22082b     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
            r2 = 1
            if (r1 != r2) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            r3.m28966v0()     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
            r3.mo34262p0()     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
            r3.m28965u0()     // Catch:{ Exception -> 0x0022, Error -> 0x001d }
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
            r3.m28964t0(r1)     // Catch:{ all -> 0x001b }
            throw r1     // Catch:{ all -> 0x001b }
        L_0x0022:
            r1 = move-exception
            r3.m28964t0(r1)     // Catch:{ all -> 0x001b }
            throw r1     // Catch:{ all -> 0x001b }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.p233x.C11145a.start():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void stop() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f22081a
            monitor-enter(r0)
            int r1 = r3.f22082b     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
            r2 = 3
            if (r1 == r2) goto L_0x0018
            int r1 = r3.f22082b     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
            if (r1 != 0) goto L_0x000d
            goto L_0x0018
        L_0x000d:
            r3.m28968x0()     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
            r3.mo34263q0()     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
            r3.m28967w0()     // Catch:{ Exception -> 0x0021, Error -> 0x001c }
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
            r3.m28964t0(r1)     // Catch:{ all -> 0x001a }
            throw r1     // Catch:{ all -> 0x001a }
        L_0x0021:
            r1 = move-exception
            r3.m28964t0(r1)     // Catch:{ all -> 0x001a }
            throw r1     // Catch:{ all -> 0x001a }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.p233x.C11145a.stop():void");
    }

    /* renamed from: u */
    public boolean mo35456u() {
        return this.f22082b == 3;
    }
}
