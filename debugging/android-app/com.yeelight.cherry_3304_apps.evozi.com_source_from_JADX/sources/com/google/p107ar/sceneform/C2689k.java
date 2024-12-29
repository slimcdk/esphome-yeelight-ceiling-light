package com.google.p107ar.sceneform;

import java.util.function.Consumer;

/* renamed from: com.google.ar.sceneform.k */
final /* synthetic */ class C2689k implements Consumer {

    /* renamed from: a */
    private final FrameTime f5195a;

    C2689k(FrameTime frameTime) {
        this.f5195a = frameTime;
    }

    public final void accept(Object obj) {
        ((Node) obj).dispatchUpdate(this.f5195a);
    }
}
