package com.google.p107ar.sceneform;

import com.google.p107ar.sceneform.collision.Collider;
import java.util.ArrayList;
import java.util.function.Consumer;

/* renamed from: com.google.ar.sceneform.l */
final /* synthetic */ class C2690l implements Consumer {

    /* renamed from: a */
    private final ArrayList f5196a;

    C2690l(ArrayList arrayList) {
        this.f5196a = arrayList;
    }

    public final void accept(Object obj) {
        this.f5196a.add((Node) ((Collider) obj).getTransformProvider());
    }
}
