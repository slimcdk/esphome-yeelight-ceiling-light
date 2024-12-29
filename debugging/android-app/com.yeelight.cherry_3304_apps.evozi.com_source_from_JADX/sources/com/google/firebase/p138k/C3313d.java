package com.google.firebase.p138k;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.k.d */
public class C3313d {

    /* renamed from: b */
    private static volatile C3313d f6419b;

    /* renamed from: a */
    private final Set<C3315f> f6420a = new HashSet();

    C3313d() {
    }

    /* renamed from: a */
    public static C3313d m10306a() {
        C3313d dVar = f6419b;
        if (dVar == null) {
            synchronized (C3313d.class) {
                dVar = f6419b;
                if (dVar == null) {
                    dVar = new C3313d();
                    f6419b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C3315f> mo17972b() {
        Set<C3315f> unmodifiableSet;
        synchronized (this.f6420a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f6420a);
        }
        return unmodifiableSet;
    }
}
