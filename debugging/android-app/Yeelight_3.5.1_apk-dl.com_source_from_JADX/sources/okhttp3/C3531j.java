package okhttp3;

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
import okhttp3.internal.connection.C3526a;
import p056k5.C3300c;
import p092r5.C3636f;
import p186m5.C9551c;
import p186m5.C9554e;

/* renamed from: okhttp3.j */
public final class C3531j {

    /* renamed from: g */
    private static final Executor f5751g = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C3300c.m8912F("OkHttp ConnectionPool", true));

    /* renamed from: a */
    private final int f5752a;

    /* renamed from: b */
    private final long f5753b;

    /* renamed from: c */
    private final Runnable f5754c;

    /* renamed from: d */
    private final Deque<C3526a> f5755d;

    /* renamed from: e */
    final C9551c f5756e;

    /* renamed from: f */
    boolean f5757f;

    /* renamed from: okhttp3.j$a */
    class C3532a implements Runnable {
        C3532a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                okhttp3.j r0 = okhttp3.C3531j.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.mo24483a(r1)
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
                okhttp3.j r2 = okhttp3.C3531j.this
                monitor-enter(r2)
                okhttp3.j r3 = okhttp3.C3531j.this     // Catch:{ InterruptedException -> 0x002b }
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
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C3531j.C3532a.run():void");
        }
    }

    public C3531j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C3531j(int i, long j, TimeUnit timeUnit) {
        this.f5754c = new C3532a();
        this.f5755d = new ArrayDeque();
        this.f5756e = new C9551c();
        this.f5752a = i;
        this.f5753b = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    /* renamed from: e */
    private int m9727e(C3526a aVar, long j) {
        List<Reference<C9554e>> list = aVar.f5726n;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C3636f.m10368j().mo25944r("A connection to " + aVar.mo24452p().mo24426a().mo24349l() + " was leaked. Did you forget to close a response body?", ((C9554e.C9555a) reference).f17455a);
                list.remove(i);
                aVar.f5723k = true;
                if (list.isEmpty()) {
                    aVar.f5727o = j - this.f5753b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo24483a(long j) {
        synchronized (this) {
            C3526a aVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C3526a next : this.f5755d) {
                if (m9727e(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.f5727o;
                    if (j3 > j2) {
                        aVar = next;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f5753b;
            if (j2 < j4) {
                if (i <= this.f5752a) {
                    if (i > 0) {
                        long j5 = j4 - j2;
                        return j5;
                    } else if (i2 > 0) {
                        return j4;
                    } else {
                        this.f5757f = false;
                        return -1;
                    }
                }
            }
            this.f5755d.remove(aVar);
            C3300c.m8922g(aVar.mo24453q());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo24484b(C3526a aVar) {
        if (aVar.f5723k || this.f5752a == 0) {
            this.f5755d.remove(aVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public Socket mo24485c(C3504a aVar, C9554e eVar) {
        for (C3526a next : this.f5755d) {
            if (next.mo24448l(aVar, (C3522d0) null) && next.mo24450n() && next != eVar.mo38524d()) {
                return eVar.mo38529m(next);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: d */
    public C3526a mo24486d(C3504a aVar, C9554e eVar, C3522d0 d0Var) {
        for (C3526a next : this.f5755d) {
            if (next.mo24448l(aVar, d0Var)) {
                eVar.mo38521a(next, true);
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24487f(C3526a aVar) {
        if (!this.f5757f) {
            this.f5757f = true;
            f5751g.execute(this.f5754c);
        }
        this.f5755d.add(aVar);
    }
}
