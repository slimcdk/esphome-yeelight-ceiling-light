package com.google.p017ar.sceneform.rendering;

import java.util.function.BiFunction;

/* renamed from: com.google.ar.sceneform.rendering.c0 */
public final /* synthetic */ class C2126c0 implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ PlaneRenderer f3362a;

    public /* synthetic */ C2126c0(PlaneRenderer planeRenderer) {
        this.f3362a = planeRenderer;
    }

    public final Object apply(Object obj, Object obj2) {
        return this.f3362a.lambda$loadPlaneMaterial$2((Material) obj, (Texture) obj2);
    }
}
