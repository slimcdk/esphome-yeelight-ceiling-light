package com.google.p017ar.sceneform;

import java.lang.ref.WeakReference;

/* renamed from: com.google.ar.sceneform.b */
final /* synthetic */ class C2064b implements Runnable {

    /* renamed from: a */
    private final WeakReference f3259a;

    C2064b(WeakReference weakReference) {
        this.f3259a = weakReference;
    }

    public final void run() {
        ArSceneView.lambda$resumeAsync$0$ArSceneView(this.f3259a);
    }
}
