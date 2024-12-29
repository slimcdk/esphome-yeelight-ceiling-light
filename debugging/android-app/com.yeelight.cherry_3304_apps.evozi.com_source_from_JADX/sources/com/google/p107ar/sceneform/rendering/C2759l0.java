package com.google.p107ar.sceneform.rendering;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/* renamed from: com.google.ar.sceneform.rendering.l0 */
class C2759l0 {
    /* renamed from: a */
    static /* synthetic */ Object m8368a(String str, String str2, Throwable th) {
        throw new CompletionException(th);
    }

    /* renamed from: b */
    static <T> CompletableFuture<T> m8369b(String str, CompletableFuture<T> completableFuture, String str2) {
        completableFuture.exceptionally(new C2740c(str, str2));
        return completableFuture;
    }
}
