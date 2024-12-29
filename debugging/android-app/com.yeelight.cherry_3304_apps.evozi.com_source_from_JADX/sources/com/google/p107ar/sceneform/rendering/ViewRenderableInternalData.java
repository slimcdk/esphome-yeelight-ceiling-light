package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.sceneform.resources.SharedReference;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;

/* renamed from: com.google.ar.sceneform.rendering.ViewRenderableInternalData */
class ViewRenderableInternalData extends SharedReference {

    /* renamed from: a */
    private final RenderViewToExternalTexture f5281a;

    ViewRenderableInternalData(RenderViewToExternalTexture renderViewToExternalTexture) {
        this.f5281a = renderViewToExternalTexture;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RenderViewToExternalTexture mo16265a() {
        return this.f5281a;
    }

    /* access modifiers changed from: protected */
    public void onDispose() {
        AndroidPreconditions.checkUiThread();
        this.f5281a.mo16078f();
    }
}
