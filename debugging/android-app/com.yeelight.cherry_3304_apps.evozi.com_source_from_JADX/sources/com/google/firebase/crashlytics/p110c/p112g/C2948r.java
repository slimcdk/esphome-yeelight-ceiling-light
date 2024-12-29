package com.google.firebase.crashlytics.p110c.p112g;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.p110c.p122o.p123i.C3029b;

/* renamed from: com.google.firebase.crashlytics.c.g.r */
public enum C2948r {
    NONE,
    JAVA_ONLY,
    ALL;

    @NonNull
    /* renamed from: a */
    static C2948r m9040a(@NonNull C3029b bVar) {
        boolean z = true;
        boolean z2 = bVar.f5902g == 2;
        if (bVar.f5903h != 2) {
            z = false;
        }
        return m9041b(z2, z);
    }

    @NonNull
    /* renamed from: b */
    static C2948r m9041b(boolean z, boolean z2) {
        return !z ? NONE : !z2 ? JAVA_ONLY : ALL;
    }
}
