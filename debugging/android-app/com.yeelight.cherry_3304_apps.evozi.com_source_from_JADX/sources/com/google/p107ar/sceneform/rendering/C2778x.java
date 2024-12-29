package com.google.p107ar.sceneform.rendering;

import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.x */
/* compiled from: lambda */
public final /* synthetic */ class C2778x implements Function {

    /* renamed from: a */
    public final /* synthetic */ Texture f5373a;

    public /* synthetic */ C2778x(Texture texture) {
        this.f5373a = texture;
    }

    public final Object apply(Object obj) {
        Material material = (Material) obj;
        MaterialFactory.m8310b(this.f5373a, material);
        return material;
    }
}
