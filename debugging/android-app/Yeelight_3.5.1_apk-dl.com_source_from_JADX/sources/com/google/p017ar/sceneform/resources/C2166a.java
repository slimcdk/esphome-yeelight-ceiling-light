package com.google.p017ar.sceneform.resources;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

/* renamed from: com.google.ar.sceneform.resources.a */
final /* synthetic */ class C2166a implements BiFunction {

    /* renamed from: a */
    private final ResourceRegistry f3451a;

    /* renamed from: b */
    private final Object f3452b;

    /* renamed from: c */
    private final CompletableFuture f3453c;

    C2166a(ResourceRegistry resourceRegistry, Object obj, CompletableFuture completableFuture) {
        this.f3451a = resourceRegistry;
        this.f3452b = obj;
        this.f3453c = completableFuture;
    }

    public final Object apply(Object obj, Object obj2) {
        return this.f3451a.lambda$register$0$ResourceRegistry(this.f3452b, this.f3453c, obj, (Throwable) obj2);
    }
}
