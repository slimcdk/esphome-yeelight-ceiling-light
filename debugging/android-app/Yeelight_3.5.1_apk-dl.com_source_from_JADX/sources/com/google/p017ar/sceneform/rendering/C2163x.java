package com.google.p017ar.sceneform.rendering;

import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.x */
public final /* synthetic */ class C2163x implements Function {

    /* renamed from: a */
    public final /* synthetic */ Color f3448a;

    public /* synthetic */ C2163x(Color color) {
        this.f3448a = color;
    }

    public final Object apply(Object obj) {
        return MaterialFactory.lambda$makeOpaqueWithColor$0(this.f3448a, (Material) obj);
    }
}
