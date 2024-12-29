package com.google.p017ar.sceneform;

import com.google.p017ar.sceneform.rendering.LightProbe;
import java.util.function.Consumer;

/* renamed from: com.google.ar.sceneform.n */
final /* synthetic */ class C2078n implements Consumer {

    /* renamed from: a */
    private final Scene f3280a;

    C2078n(Scene scene) {
        this.f3280a = scene;
    }

    public final void accept(Object obj) {
        this.f3280a.lambda$setupLightProbe$4$Scene((LightProbe) obj);
    }
}
