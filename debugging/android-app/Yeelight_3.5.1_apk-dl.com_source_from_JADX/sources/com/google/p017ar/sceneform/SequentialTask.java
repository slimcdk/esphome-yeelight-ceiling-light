package com.google.p017ar.sceneform;

import android.annotation.TargetApi;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@TargetApi(24)
/* renamed from: com.google.ar.sceneform.SequentialTask */
class SequentialTask {
    @Nullable

    /* renamed from: a */
    private CompletableFuture<Void> f3249a;

    SequentialTask() {
    }

    @MainThread
    /* renamed from: a */
    public final CompletableFuture<Void> mo16835a(Runnable runnable, Executor executor) {
        CompletableFuture<Void> completableFuture = this.f3249a;
        this.f3249a = (completableFuture == null || completableFuture.isDone()) ? CompletableFuture.runAsync(runnable, executor) : this.f3249a.thenRunAsync(runnable, executor);
        return this.f3249a;
    }

    @MainThread
    /* renamed from: b */
    public final boolean mo16836b() {
        CompletableFuture<Void> completableFuture = this.f3249a;
        if (completableFuture == null) {
            return true;
        }
        if (!completableFuture.isDone()) {
            return false;
        }
        this.f3249a = null;
        return true;
    }
}
