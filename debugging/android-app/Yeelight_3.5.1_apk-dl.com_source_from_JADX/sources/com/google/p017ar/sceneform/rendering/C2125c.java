package com.google.p017ar.sceneform.rendering;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: com.google.ar.sceneform.rendering.c */
class C2125c<T> extends PhantomReference<T> {

    /* renamed from: a */
    private final Runnable f3361a;

    C2125c(T t, ReferenceQueue<T> referenceQueue, Runnable runnable) {
        super(t, referenceQueue);
        this.f3361a = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17709a() {
        this.f3361a.run();
    }
}
