package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.c2 */
final class C1040c2 implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f1261a = Executors.defaultThreadFactory();

    C1040c2(C1296s2 s2Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f1261a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
