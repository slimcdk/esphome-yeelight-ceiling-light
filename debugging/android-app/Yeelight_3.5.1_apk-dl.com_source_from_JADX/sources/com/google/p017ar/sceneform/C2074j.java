package com.google.p017ar.sceneform;

import com.google.p017ar.sceneform.collision.Collider;
import java.util.function.BiConsumer;

/* renamed from: com.google.ar.sceneform.j */
final /* synthetic */ class C2074j implements BiConsumer {

    /* renamed from: a */
    static final BiConsumer f3269a = new C2074j();

    private C2074j() {
    }

    public final void accept(Object obj, Object obj2) {
        ((HitTestResult) obj).setNode((Node) ((Collider) obj2).getTransformProvider());
    }
}
