package com.google.p107ar.sceneform;

import java.util.function.Predicate;

/* renamed from: com.google.ar.sceneform.h */
final /* synthetic */ class C2686h implements Predicate {

    /* renamed from: a */
    private final int f5191a;

    /* renamed from: b */
    private final String f5192b;

    C2686h(int i, String str) {
        this.f5191a = i;
        this.f5192b = str;
    }

    public final boolean test(Object obj) {
        return NodeParent.lambda$findByName$0$NodeParent(this.f5191a, this.f5192b, (Node) obj);
    }
}
