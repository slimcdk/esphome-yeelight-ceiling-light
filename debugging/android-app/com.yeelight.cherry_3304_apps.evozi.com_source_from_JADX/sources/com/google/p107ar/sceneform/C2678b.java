package com.google.p107ar.sceneform;

import java.lang.ref.WeakReference;

/* renamed from: com.google.ar.sceneform.b */
final /* synthetic */ class C2678b implements Runnable {

    /* renamed from: a */
    private final WeakReference f5184a;

    C2678b(WeakReference weakReference) {
        this.f5184a = weakReference;
    }

    public final void run() {
        ArSceneView.lambda$resumeAsync$0$ArSceneView(this.f5184a);
    }
}
