package p011c.p012a.p019b.p028b.p038e;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: c.a.b.b.e.a0 */
final class C0609a0<TResult> {

    /* renamed from: a */
    private final Object f300a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private Queue<C0640z<TResult>> f301b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f302c;

    C0609a0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f300a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f301b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f302c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo8674b(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8635a(@androidx.annotation.NonNull p011c.p012a.p019b.p028b.p038e.C0619h<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f300a
            monitor-enter(r0)
            java.util.Queue<c.a.b.b.e.z<TResult>> r1 = r2.f301b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f302c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f302c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f300a
            monitor-enter(r1)
            java.util.Queue<c.a.b.b.e.z<TResult>> r0 = r2.f301b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            c.a.b.b.e.z r0 = (p011c.p012a.p019b.p028b.p038e.C0640z) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f302c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo8674b(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002f:
            throw r3
        L_0x0030:
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p019b.p028b.p038e.C0609a0.mo8635a(c.a.b.b.e.h):void");
    }

    /* renamed from: b */
    public final void mo8636b(@NonNull C0640z<TResult> zVar) {
        synchronized (this.f300a) {
            if (this.f301b == null) {
                this.f301b = new ArrayDeque();
            }
            this.f301b.add(zVar);
        }
    }
}
