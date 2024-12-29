package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.sceneform.rendering.Material;
import java.nio.ByteBuffer;
import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.q */
/* compiled from: lambda */
public final /* synthetic */ class C2771q implements Function {

    /* renamed from: a */
    public final /* synthetic */ Material.Builder f5367a;

    public /* synthetic */ C2771q(Material.Builder builder) {
        this.f5367a = builder;
    }

    public final Object apply(Object obj) {
        return this.f5367a.mo16010c((ByteBuffer) obj);
    }
}
