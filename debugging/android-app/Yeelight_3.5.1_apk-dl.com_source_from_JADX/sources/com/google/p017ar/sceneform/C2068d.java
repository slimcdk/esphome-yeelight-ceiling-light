package com.google.p017ar.sceneform;

import java.lang.ref.WeakReference;

/* renamed from: com.google.ar.sceneform.d */
final /* synthetic */ class C2068d implements Runnable {

    /* renamed from: a */
    private final WeakReference f3262a;

    C2068d(WeakReference weakReference) {
        this.f3262a = weakReference;
    }

    public final void run() {
        ArSceneView.lambda$resumeAsync$1$ArSceneView(this.f3262a);
    }
}
