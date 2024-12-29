package com.google.p107ar.sceneform.utilities;

import java.net.URLConnection;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.utilities.d */
final /* synthetic */ class C2787d implements Callable {

    /* renamed from: a */
    private final URLConnection f5387a;

    C2787d(URLConnection uRLConnection) {
        this.f5387a = uRLConnection;
    }

    public final Object call() {
        return this.f5387a.getInputStream();
    }
}
