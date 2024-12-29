package com.google.p017ar.sceneform.rendering;

/* renamed from: com.google.ar.sceneform.rendering.p0 */
public final /* synthetic */ class C2153p0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ViewRenderable f3416a;

    public /* synthetic */ C2153p0(ViewRenderable viewRenderable) {
        this.f3416a = viewRenderable;
    }

    public final void run() {
        this.f3416a.updateSuggestedCollisionShape();
    }
}
