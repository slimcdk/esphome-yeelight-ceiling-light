package com.google.p107ar.sceneform.rendering;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* renamed from: com.google.ar.sceneform.rendering.g */
/* compiled from: lambda */
public final /* synthetic */ class C2748g implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ LightProbe f5296a;

    /* renamed from: b */
    public final /* synthetic */ Callable f5297b;

    public /* synthetic */ C2748g(LightProbe lightProbe, Callable callable) {
        this.f5296a = lightProbe;
        this.f5297b = callable;
    }

    public final Object get() {
        return this.f5296a.mo15964b(this.f5297b);
    }
}
