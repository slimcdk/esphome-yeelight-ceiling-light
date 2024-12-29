package com.google.p017ar.sceneform.rendering;

import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.y */
public final /* synthetic */ class C2164y implements Function {

    /* renamed from: a */
    public final /* synthetic */ Color f3449a;

    public /* synthetic */ C2164y(Color color) {
        this.f3449a = color;
    }

    public final Object apply(Object obj) {
        return MaterialFactory.lambda$makeTransparentWithColor$1(this.f3449a, (Material) obj);
    }
}
