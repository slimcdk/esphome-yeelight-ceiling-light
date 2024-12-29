package com.google.p017ar.sceneform.rendering;

import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.a0 */
public final /* synthetic */ class C2122a0 implements Function {

    /* renamed from: a */
    public final /* synthetic */ Texture f3358a;

    public /* synthetic */ C2122a0(Texture texture) {
        this.f3358a = texture;
    }

    public final Object apply(Object obj) {
        return MaterialFactory.lambda$makeTransparentWithTexture$3(this.f3358a, (Material) obj);
    }
}
