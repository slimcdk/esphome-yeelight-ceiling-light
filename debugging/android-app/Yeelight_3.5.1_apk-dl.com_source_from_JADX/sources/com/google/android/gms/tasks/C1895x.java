package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p044i0.C3247a;

/* renamed from: com.google.android.gms.tasks.x */
final class C1895x implements Executor {

    /* renamed from: a */
    private final Handler f2954a = new C3247a(Looper.getMainLooper());

    public final void execute(@NonNull Runnable runnable) {
        this.f2954a.post(runnable);
    }
}
