package com.google.p017ar.sceneform.rendering;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/* renamed from: com.google.ar.sceneform.rendering.e */
class C2129e {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Object m5320b(String str, String str2, Throwable th) {
        throw new CompletionException(th);
    }

    /* renamed from: c */
    static <T> CompletableFuture<T> m5321c(String str, CompletableFuture<T> completableFuture, String str2) {
        completableFuture.exceptionally(new C2127d(str, str2));
        return completableFuture;
    }
}
