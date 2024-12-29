package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.w */
final class C1894w implements Executor {
    C1894w() {
    }

    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
