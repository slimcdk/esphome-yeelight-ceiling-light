package com.google.p017ar.sceneform.rendering;

import com.google.p017ar.sceneform.rendering.RenderViewToExternalTexture;

/* renamed from: com.google.ar.sceneform.rendering.n0 */
public final /* synthetic */ class C2149n0 implements RenderViewToExternalTexture.OnViewSizeChangedListener {

    /* renamed from: a */
    public final /* synthetic */ ViewRenderable f3412a;

    public /* synthetic */ C2149n0(ViewRenderable viewRenderable) {
        this.f3412a = viewRenderable;
    }

    public final void onViewSizeChanged(int i, int i2) {
        this.f3412a.lambda$new$0(i, i2);
    }
}
