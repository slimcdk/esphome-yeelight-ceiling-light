package com.google.p107ar.sceneform.rendering;

import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.u */
/* compiled from: lambda */
public final /* synthetic */ class C2775u implements Function {

    /* renamed from: a */
    public final /* synthetic */ Color f5370a;

    public /* synthetic */ C2775u(Color color) {
        this.f5370a = color;
    }

    public final Object apply(Object obj) {
        Material material = (Material) obj;
        MaterialFactory.m8309a(this.f5370a, material);
        return material;
    }
}
