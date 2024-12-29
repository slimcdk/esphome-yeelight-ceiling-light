package com.google.p017ar.sceneform;

import java.lang.ref.WeakReference;

/* renamed from: com.google.ar.sceneform.f */
final /* synthetic */ class C2070f implements Runnable {

    /* renamed from: a */
    private final WeakReference f3264a;

    C2070f(WeakReference weakReference) {
        this.f3264a = weakReference;
    }

    public final void run() {
        ArSceneView.lambda$pauseAsync$3$ArSceneView(this.f3264a);
    }
}
