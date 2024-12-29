package com.google.p017ar.sceneform.rendering;

import android.graphics.Bitmap;
import com.google.p017ar.sceneform.rendering.Texture;
import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.k0 */
public final /* synthetic */ class C2143k0 implements Function {

    /* renamed from: a */
    public final /* synthetic */ Texture.Builder f3405a;

    public /* synthetic */ C2143k0(Texture.Builder builder) {
        this.f3405a = builder;
    }

    public final Object apply(Object obj) {
        return this.f3405a.lambda$build$0((Bitmap) obj);
    }
}
