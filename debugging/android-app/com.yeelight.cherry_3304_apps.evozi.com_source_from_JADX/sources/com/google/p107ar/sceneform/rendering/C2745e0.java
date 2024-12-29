package com.google.p107ar.sceneform.rendering;

import android.graphics.Bitmap;
import com.google.p107ar.sceneform.rendering.Texture;
import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.e0 */
/* compiled from: lambda */
public final /* synthetic */ class C2745e0 implements Function {

    /* renamed from: a */
    public final /* synthetic */ Texture.Builder f5292a;

    public /* synthetic */ C2745e0(Texture.Builder builder) {
        this.f5292a = builder;
    }

    public final Object apply(Object obj) {
        return this.f5292a.mo16204a((Bitmap) obj);
    }
}
