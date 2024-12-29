package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.sceneform.rendering.RenderViewToExternalTexture;

/* renamed from: com.google.ar.sceneform.rendering.j0 */
/* compiled from: lambda */
public final /* synthetic */ class C2755j0 implements RenderViewToExternalTexture.OnViewSizeChangedListener {

    /* renamed from: a */
    public final /* synthetic */ ViewRenderable f5305a;

    public /* synthetic */ C2755j0(ViewRenderable viewRenderable) {
        this.f5305a = viewRenderable;
    }

    public final void onViewSizeChanged(int i, int i2) {
        this.f5305a.mo16250c(i, i2);
    }
}
