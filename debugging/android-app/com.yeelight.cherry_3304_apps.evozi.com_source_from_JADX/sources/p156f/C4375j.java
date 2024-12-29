package p156f;

import androidx.appcompat.widget.ActivityChooserView;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p156f.p157g0.C4345c;
import p156f.p157g0.p159f.C10759d;
import p156f.p157g0.p159f.C10763g;
import p156f.p157g0.p159f.C4357c;
import p156f.p157g0.p162k.C4373f;

/* renamed from: f.j */
public final class C4375j {

    /* renamed from: g */
    private static final Executor f7778g = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4345c.m12350G("OkHttp ConnectionPool", true));

    /* renamed from: a */
    private final int f7779a;

    /* renamed from: b */
    private final long f7780b;

    /* renamed from: c */
    private final Runnable f7781c;

    /* renamed from: d */
    private final Deque<C4357c> f7782d;

    /* renamed from: e */
    final C10759d f7783e;

    /* renamed from: f */
    boolean f7784f;

    /* renamed from: f.j$a */
    class C4376a implements Runnable {
        C4376a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                f.j r0 = p156f.C4375j.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.mo24022a(r1)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0000
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r0 / r2
                long r2 = r2 * r4
                long r0 = r0 - r2
                f.j r2 = p156f.C4375j.this
                monitor-enter(r2)
                f.j r3 = p156f.C4375j.this     // Catch:{ InterruptedException -> 0x002b }
                int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0029:
                r0 = move-exception
                goto L_0x002d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0000
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0030
            L_0x002f:
                throw r0
            L_0x0030:
                goto L_0x002f
            */
            throw new UnsupportedOperationException("Method not decompiled: p156f.C4375j.C4376a.run():void");
        }
    }

    public C4375j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C4375j(int i, long j, TimeUnit timeUnit) {
        this.f7781c = new C4376a();
        this.f7782d = new ArrayDeque();
        this.f7783e = new C10759d();
        this.f7779a = i;
        this.f7780b = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    /* renamed from: e */
    private int m12524e(C4357c cVar, long j) {
        List<Reference<C10763g>> list = cVar.f7725n;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C4373f.m12509j().mo24008r("A connection to " + cVar.mo23975p().mo23908a().mo23805l() + " was leaked. Did you forget to close a response body?", ((C10763g.C10764a) reference).f20668a);
                list.remove(i);
                cVar.f7722k = true;
                if (list.isEmpty()) {
                    cVar.f7726o = j - this.f7780b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo24022a(long j) {
        synchronized (this) {
            C4357c cVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C4357c next : this.f7782d) {
                if (m12524e(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.f7726o;
                    if (j3 > j2) {
                        cVar = next;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f7780b) {
                if (i <= this.f7779a) {
                    if (i > 0) {
                        long j4 = this.f7780b - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.f7780b;
                        return j5;
                    } else {
                        this.f7784f = false;
                        return -1;
                    }
                }
            }
            this.f7782d.remove(cVar);
            C4345c.m12361h(cVar.mo23976q());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo24023b(C4357c cVar) {
        if (cVar.f7722k || this.f7779a == 0) {
            this.f7782d.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public Socket mo24024c(C4317a aVar, C10763g gVar) {
        for (C4357c next : this.f7782d) {
            if (next.mo23971l(aVar, (C4340e0) null) && next.mo23973n() && next != gVar.mo34004d()) {
                return gVar.mo34009m(next);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: d */
    public C4357c mo24025d(C4317a aVar, C10763g gVar, C4340e0 e0Var) {
        for (C4357c next : this.f7782d) {
            if (next.mo23971l(aVar, e0Var)) {
                gVar.mo34001a(next, true);
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24026f(C4357c cVar) {
        if (!this.f7784f) {
            this.f7784f = true;
            f7778g.execute(this.f7781c);
        }
        this.f7782d.add(cVar);
    }
}
