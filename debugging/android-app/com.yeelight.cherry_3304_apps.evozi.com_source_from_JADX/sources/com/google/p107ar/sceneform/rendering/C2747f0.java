package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.sceneform.rendering.Texture;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* renamed from: com.google.ar.sceneform.rendering.f0 */
/* compiled from: lambda */
public final /* synthetic */ class C2747f0 implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ boolean f5294a;

    /* renamed from: b */
    public final /* synthetic */ Callable f5295b;

    public /* synthetic */ C2747f0(boolean z, Callable callable) {
        this.f5294a = z;
        this.f5295b = callable;
    }

    public final Object get() {
        return Texture.Builder.m8354b(this.f5294a, this.f5295b);
    }
}
