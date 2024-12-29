package com.google.p017ar.sceneform.rendering;

import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.z */
public final /* synthetic */ class C2165z implements Function {

    /* renamed from: a */
    public final /* synthetic */ Texture f3450a;

    public /* synthetic */ C2165z(Texture texture) {
        this.f3450a = texture;
    }

    public final Object apply(Object obj) {
        return MaterialFactory.lambda$makeOpaqueWithTexture$2(this.f3450a, (Material) obj);
    }
}
