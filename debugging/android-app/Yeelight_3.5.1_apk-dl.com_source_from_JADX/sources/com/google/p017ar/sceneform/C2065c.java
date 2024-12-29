package com.google.p017ar.sceneform;

import java.lang.ref.WeakReference;

/* renamed from: com.google.ar.sceneform.c */
final /* synthetic */ class C2065c implements Runnable {

    /* renamed from: a */
    private final WeakReference f3260a;

    C2065c(WeakReference weakReference) {
        this.f3260a = weakReference;
    }

    public final void run() {
        ArSceneView.lambda$pauseAsync$2$ArSceneView(this.f3260a);
    }
}
