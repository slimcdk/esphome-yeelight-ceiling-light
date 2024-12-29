package com.google.p017ar.sceneform.rendering;

import com.google.p017ar.sceneform.resources.SharedReference;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;

/* renamed from: com.google.ar.sceneform.rendering.ViewRenderableInternalData */
class ViewRenderableInternalData extends SharedReference {

    /* renamed from: a */
    private final RenderViewToExternalTexture f3356a;

    ViewRenderableInternalData(RenderViewToExternalTexture renderViewToExternalTexture) {
        this.f3356a = renderViewToExternalTexture;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RenderViewToExternalTexture mo17705a() {
        return this.f3356a;
    }

    /* access modifiers changed from: protected */
    public void onDispose() {
        AndroidPreconditions.checkUiThread();
        this.f3356a.mo17524f();
    }
}
