package com.google.p107ar.sceneform;

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
    private CompletableFuture<Void> f5174a;

    SequentialTask() {
    }

    @MainThread
    /* renamed from: a */
    public final CompletableFuture<Void> mo15382a(Runnable runnable, Executor executor) {
        CompletableFuture<Void> completableFuture = this.f5174a;
        this.f5174a = (completableFuture == null || completableFuture.isDone()) ? CompletableFuture.runAsync(runnable, executor) : this.f5174a.thenRunAsync(runnable, executor);
        return this.f5174a;
    }

    @MainThread
    /* renamed from: b */
    public final boolean mo15383b() {
        CompletableFuture<Void> completableFuture = this.f5174a;
        if (completableFuture == null) {
            return true;
        }
        if (!completableFuture.isDone()) {
            return false;
        }
        this.f5174a = null;
        return true;
    }
}
