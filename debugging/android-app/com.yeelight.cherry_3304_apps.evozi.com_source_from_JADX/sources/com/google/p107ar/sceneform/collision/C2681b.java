package com.google.p107ar.sceneform.collision;

import java.util.Comparator;

/* renamed from: com.google.ar.sceneform.collision.b */
final /* synthetic */ class C2681b implements Comparator {

    /* renamed from: a */
    static final Comparator f5186a = new C2681b();

    private C2681b() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((RayHit) obj).getDistance(), ((RayHit) obj2).getDistance());
    }
}
