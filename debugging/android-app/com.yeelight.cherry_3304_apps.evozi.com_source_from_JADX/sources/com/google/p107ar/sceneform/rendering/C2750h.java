package com.google.p107ar.sceneform.rendering;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* renamed from: com.google.ar.sceneform.rendering.h */
/* compiled from: lambda */
public final /* synthetic */ class C2750h implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C2761m0 f5299a;

    /* renamed from: b */
    public final /* synthetic */ Callable f5300b;

    public /* synthetic */ C2750h(C2761m0 m0Var, Callable callable) {
        this.f5299a = m0Var;
        this.f5300b = callable;
    }

    public final Object get() {
        return this.f5299a.mo16290k(this.f5300b);
    }
}
