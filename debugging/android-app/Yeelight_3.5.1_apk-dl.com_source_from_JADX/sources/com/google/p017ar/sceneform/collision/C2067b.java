package com.google.p017ar.sceneform.collision;

import java.util.Comparator;

/* renamed from: com.google.ar.sceneform.collision.b */
final /* synthetic */ class C2067b implements Comparator {

    /* renamed from: a */
    static final Comparator f3261a = new C2067b();

    private C2067b() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((RayHit) obj).getDistance(), ((RayHit) obj2).getDistance());
    }
}
