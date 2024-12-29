package com.google.p017ar.sceneform.rendering;

import com.google.p017ar.sceneform.rendering.Material;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* renamed from: com.google.ar.sceneform.rendering.w */
public final /* synthetic */ class C2162w implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ Callable f3447a;

    public /* synthetic */ C2162w(Callable callable) {
        this.f3447a = callable;
    }

    public final Object get() {
        return Material.Builder.lambda$build$1(this.f3447a);
    }
}
