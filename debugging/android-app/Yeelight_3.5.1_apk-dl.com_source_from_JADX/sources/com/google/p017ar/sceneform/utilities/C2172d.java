package com.google.p017ar.sceneform.utilities;

import java.net.URLConnection;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.utilities.d */
final /* synthetic */ class C2172d implements Callable {

    /* renamed from: a */
    private final URLConnection f3462a;

    C2172d(URLConnection uRLConnection) {
        this.f3462a = uRLConnection;
    }

    public final Object call() {
        return this.f3462a.getInputStream();
    }
}
