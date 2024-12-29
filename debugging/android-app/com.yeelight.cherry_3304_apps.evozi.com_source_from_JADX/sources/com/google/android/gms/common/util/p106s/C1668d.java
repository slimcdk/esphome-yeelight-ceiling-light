package com.google.android.gms.common.util.p106s;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.s.d */
final class C1668d implements Runnable {

    /* renamed from: a */
    private final Runnable f3189a;

    /* renamed from: b */
    private final int f3190b;

    public C1668d(Runnable runnable, int i) {
        this.f3189a = runnable;
        this.f3190b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f3190b);
        this.f3189a.run();
    }
}
