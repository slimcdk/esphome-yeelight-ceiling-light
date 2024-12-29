package com.google.p107ar.sceneform.resources;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

/* renamed from: com.google.ar.sceneform.resources.a */
final /* synthetic */ class C2781a implements BiFunction {

    /* renamed from: a */
    private final ResourceRegistry f5376a;

    /* renamed from: b */
    private final Object f5377b;

    /* renamed from: c */
    private final CompletableFuture f5378c;

    C2781a(ResourceRegistry resourceRegistry, Object obj, CompletableFuture completableFuture) {
        this.f5376a = resourceRegistry;
        this.f5377b = obj;
        this.f5378c = completableFuture;
    }

    public final Object apply(Object obj, Object obj2) {
        return this.f5376a.lambda$register$0$ResourceRegistry(this.f5377b, this.f5378c, obj, (Throwable) obj2);
    }
}
