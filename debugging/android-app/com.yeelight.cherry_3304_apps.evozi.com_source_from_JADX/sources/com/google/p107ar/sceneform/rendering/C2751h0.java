package com.google.p107ar.sceneform.rendering;

/* renamed from: com.google.ar.sceneform.rendering.h0 */
/* compiled from: lambda */
public final /* synthetic */ class C2751h0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ViewRenderable f5301a;

    public /* synthetic */ C2751h0(ViewRenderable viewRenderable) {
        this.f5301a = viewRenderable;
    }

    public final void run() {
        this.f5301a.updateSuggestedCollisionShape();
    }
}
