package p093s;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* renamed from: s.c */
final class C3679c extends Thread {

    /* renamed from: a */
    private final WeakReference<C3676a> f6201a;

    /* renamed from: b */
    private final long f6202b;

    /* renamed from: c */
    final CountDownLatch f6203c = new CountDownLatch(1);

    /* renamed from: d */
    boolean f6204d = false;

    public C3679c(C3676a aVar, long j) {
        this.f6201a = new WeakReference<>(aVar);
        this.f6202b = j;
        start();
    }

    /* renamed from: b */
    private final void m10521b() {
        C3676a aVar = (C3676a) this.f6201a.get();
        if (aVar != null) {
            aVar.mo26081c();
            this.f6204d = true;
        }
    }

    public final void run() {
        try {
            if (!this.f6203c.await(this.f6202b, TimeUnit.MILLISECONDS)) {
                m10521b();
            }
        } catch (InterruptedException unused) {
            m10521b();
        }
    }
}
