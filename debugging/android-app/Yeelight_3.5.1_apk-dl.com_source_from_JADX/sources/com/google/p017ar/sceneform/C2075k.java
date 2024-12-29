package com.google.p017ar.sceneform;

import java.util.function.Consumer;

/* renamed from: com.google.ar.sceneform.k */
final /* synthetic */ class C2075k implements Consumer {

    /* renamed from: a */
    private final FrameTime f3270a;

    C2075k(FrameTime frameTime) {
        this.f3270a = frameTime;
    }

    public final void accept(Object obj) {
        ((Node) obj).dispatchUpdate(this.f3270a);
    }
}
