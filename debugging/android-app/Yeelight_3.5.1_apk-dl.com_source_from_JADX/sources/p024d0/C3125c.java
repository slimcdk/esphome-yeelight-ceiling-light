package p024d0;

import android.os.Process;

/* renamed from: d0.c */
final class C3125c implements Runnable {

    /* renamed from: a */
    private final Runnable f5005a;

    public C3125c(Runnable runnable, int i) {
        this.f5005a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f5005a.run();
    }
}
