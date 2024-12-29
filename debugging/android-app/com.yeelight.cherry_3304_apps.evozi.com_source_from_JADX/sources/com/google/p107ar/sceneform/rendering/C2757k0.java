package com.google.p107ar.sceneform.rendering;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: com.google.ar.sceneform.rendering.k0 */
class C2757k0<T> extends PhantomReference<T> {

    /* renamed from: a */
    private final Runnable f5307a;

    C2757k0(T t, ReferenceQueue<T> referenceQueue, Runnable runnable) {
        super(t, referenceQueue);
        this.f5307a = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16286a() {
        this.f5307a.run();
    }
}
