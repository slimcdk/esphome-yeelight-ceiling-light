package com.google.p107ar.sceneform.rendering;

import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.w */
/* compiled from: lambda */
public final /* synthetic */ class C2777w implements Function {

    /* renamed from: a */
    public final /* synthetic */ Texture f5372a;

    public /* synthetic */ C2777w(Texture texture) {
        this.f5372a = texture;
    }

    public final Object apply(Object obj) {
        Material material = (Material) obj;
        MaterialFactory.m8312d(this.f5372a, material);
        return material;
    }
}
