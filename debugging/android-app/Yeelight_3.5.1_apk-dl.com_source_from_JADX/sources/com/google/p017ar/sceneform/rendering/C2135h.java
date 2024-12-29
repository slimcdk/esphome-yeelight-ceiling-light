package com.google.p017ar.sceneform.rendering;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* renamed from: com.google.ar.sceneform.rendering.h */
public final /* synthetic */ class C2135h implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ LightProbe f3384a;

    /* renamed from: b */
    public final /* synthetic */ Callable f3385b;

    public /* synthetic */ C2135h(LightProbe lightProbe, Callable callable) {
        this.f3384a = lightProbe;
        this.f3385b = callable;
    }

    public final Object get() {
        return this.f3384a.lambda$loadInBackground$1(this.f3385b);
    }
}
