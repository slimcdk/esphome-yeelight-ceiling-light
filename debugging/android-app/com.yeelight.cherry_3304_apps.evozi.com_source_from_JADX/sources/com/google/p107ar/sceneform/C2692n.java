package com.google.p107ar.sceneform;

import com.google.p107ar.sceneform.rendering.LightProbe;
import java.util.function.Consumer;

/* renamed from: com.google.ar.sceneform.n */
final /* synthetic */ class C2692n implements Consumer {

    /* renamed from: a */
    private final Scene f5205a;

    C2692n(Scene scene) {
        this.f5205a = scene;
    }

    public final void accept(Object obj) {
        this.f5205a.lambda$setupLightProbe$4$Scene((LightProbe) obj);
    }
}
