package com.google.p017ar.sceneform.rendering;

import com.google.p017ar.sceneform.rendering.Texture;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* renamed from: com.google.ar.sceneform.rendering.l0 */
public final /* synthetic */ class C2145l0 implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ boolean f3407a;

    /* renamed from: b */
    public final /* synthetic */ Callable f3408b;

    public /* synthetic */ C2145l0(boolean z, Callable callable) {
        this.f3407a = z;
        this.f3408b = callable;
    }

    public final Object get() {
        return Texture.Builder.lambda$makeBitmap$1(this.f3407a, this.f3408b);
    }
}
