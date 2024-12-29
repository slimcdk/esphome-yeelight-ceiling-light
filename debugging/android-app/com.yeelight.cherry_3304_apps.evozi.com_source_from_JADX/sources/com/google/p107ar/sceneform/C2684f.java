package com.google.p107ar.sceneform;

import java.lang.ref.WeakReference;

/* renamed from: com.google.ar.sceneform.f */
final /* synthetic */ class C2684f implements Runnable {

    /* renamed from: a */
    private final WeakReference f5189a;

    C2684f(WeakReference weakReference) {
        this.f5189a = weakReference;
    }

    public final void run() {
        ArSceneView.lambda$pauseAsync$3$ArSceneView(this.f5189a);
    }
}
