package com.google.p107ar.sceneform;

import com.google.p107ar.sceneform.collision.Collider;
import java.util.function.BiConsumer;

/* renamed from: com.google.ar.sceneform.j */
final /* synthetic */ class C2688j implements BiConsumer {

    /* renamed from: a */
    static final BiConsumer f5194a = new C2688j();

    private C2688j() {
    }

    public final void accept(Object obj, Object obj2) {
        ((HitTestResult) obj).setNode((Node) ((Collider) obj2).getTransformProvider());
    }
}
