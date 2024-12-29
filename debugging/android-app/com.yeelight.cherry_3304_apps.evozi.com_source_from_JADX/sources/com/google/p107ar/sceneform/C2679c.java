package com.google.p107ar.sceneform;

import java.lang.ref.WeakReference;

/* renamed from: com.google.ar.sceneform.c */
final /* synthetic */ class C2679c implements Runnable {

    /* renamed from: a */
    private final WeakReference f5185a;

    C2679c(WeakReference weakReference) {
        this.f5185a = weakReference;
    }

    public final void run() {
        ArSceneView.lambda$pauseAsync$2$ArSceneView(this.f5185a);
    }
}
