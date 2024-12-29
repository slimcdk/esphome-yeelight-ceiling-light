package com.google.p017ar.sceneform;

import com.google.p017ar.sceneform.collision.Collider;
import java.util.ArrayList;
import java.util.function.Consumer;

/* renamed from: com.google.ar.sceneform.l */
final /* synthetic */ class C2076l implements Consumer {

    /* renamed from: a */
    private final ArrayList f3271a;

    C2076l(ArrayList arrayList) {
        this.f3271a = arrayList;
    }

    public final void accept(Object obj) {
        this.f3271a.add((Node) ((Collider) obj).getTransformProvider());
    }
}
