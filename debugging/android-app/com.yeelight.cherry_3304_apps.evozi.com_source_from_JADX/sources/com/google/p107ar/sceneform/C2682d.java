package com.google.p107ar.sceneform;

import java.lang.ref.WeakReference;

/* renamed from: com.google.ar.sceneform.d */
final /* synthetic */ class C2682d implements Runnable {

    /* renamed from: a */
    private final WeakReference f5187a;

    C2682d(WeakReference weakReference) {
        this.f5187a = weakReference;
    }

    public final void run() {
        ArSceneView.lambda$resumeAsync$1$ArSceneView(this.f5187a);
    }
}
