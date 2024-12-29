package com.google.p017ar.sceneform;

import java.util.function.Predicate;

/* renamed from: com.google.ar.sceneform.h */
final /* synthetic */ class C2072h implements Predicate {

    /* renamed from: a */
    private final int f3266a;

    /* renamed from: b */
    private final String f3267b;

    C2072h(int i, String str) {
        this.f3266a = i;
        this.f3267b = str;
    }

    public final boolean test(Object obj) {
        return NodeParent.lambda$findByName$0$NodeParent(this.f3266a, this.f3267b, (Node) obj);
    }
}
