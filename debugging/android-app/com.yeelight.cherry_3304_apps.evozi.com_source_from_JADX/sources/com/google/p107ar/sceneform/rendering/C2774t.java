package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.sceneform.rendering.Material;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* renamed from: com.google.ar.sceneform.rendering.t */
/* compiled from: lambda */
public final /* synthetic */ class C2774t implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ Callable f5369a;

    public /* synthetic */ C2774t(Callable callable) {
        this.f5369a = callable;
    }

    public final Object get() {
        return Material.Builder.m8296b(this.f5369a);
    }
}
