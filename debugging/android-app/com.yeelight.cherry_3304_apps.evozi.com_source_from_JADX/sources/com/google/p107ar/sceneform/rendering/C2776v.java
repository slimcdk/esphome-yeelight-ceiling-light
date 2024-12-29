package com.google.p107ar.sceneform.rendering;

import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.v */
/* compiled from: lambda */
public final /* synthetic */ class C2776v implements Function {

    /* renamed from: a */
    public final /* synthetic */ Color f5371a;

    public /* synthetic */ C2776v(Color color) {
        this.f5371a = color;
    }

    public final Object apply(Object obj) {
        Material material = (Material) obj;
        MaterialFactory.m8311c(this.f5371a, material);
        return material;
    }
}
