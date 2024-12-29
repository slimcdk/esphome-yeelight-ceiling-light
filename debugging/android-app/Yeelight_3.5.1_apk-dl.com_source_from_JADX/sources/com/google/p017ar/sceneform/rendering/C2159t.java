package com.google.p017ar.sceneform.rendering;

import com.google.p017ar.sceneform.rendering.Material;
import java.nio.ByteBuffer;
import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.t */
public final /* synthetic */ class C2159t implements Function {

    /* renamed from: a */
    public final /* synthetic */ Material.Builder f3444a;

    public /* synthetic */ C2159t(Material.Builder builder) {
        this.f3444a = builder;
    }

    public final Object apply(Object obj) {
        return this.f3444a.lambda$build$2((ByteBuffer) obj);
    }
}
