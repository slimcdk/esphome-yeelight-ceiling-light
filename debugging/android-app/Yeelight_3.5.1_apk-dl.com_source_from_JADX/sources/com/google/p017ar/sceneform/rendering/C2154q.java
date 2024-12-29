package com.google.p017ar.sceneform.rendering;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* renamed from: com.google.ar.sceneform.rendering.q */
public final /* synthetic */ class C2154q implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C2156s f3417a;

    /* renamed from: b */
    public final /* synthetic */ Callable f3418b;

    public /* synthetic */ C2154q(C2156s sVar, Callable callable) {
        this.f3417a = sVar;
        this.f3418b = callable;
    }

    public final Object get() {
        return this.f3417a.m5392s(this.f3418b);
    }
}
