package com.google.p017ar.sceneform.rendering;

import java.util.function.Consumer;

/* renamed from: com.google.ar.sceneform.rendering.d0 */
public final /* synthetic */ class C2128d0 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ PlaneRenderer f3365a;

    public /* synthetic */ C2128d0(PlaneRenderer planeRenderer) {
        this.f3365a = planeRenderer;
    }

    public final void accept(Object obj) {
        this.f3365a.lambda$loadShadowMaterial$0((Material) obj);
    }
}
