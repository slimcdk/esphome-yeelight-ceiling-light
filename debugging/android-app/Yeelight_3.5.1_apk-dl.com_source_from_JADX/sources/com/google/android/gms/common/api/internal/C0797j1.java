package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C0914h;

/* renamed from: com.google.android.gms.common.api.internal.j1 */
final class C0797j1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0752b f674a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Feature f675b;

    /* synthetic */ C0797j1(C0752b bVar, Feature feature, C0790i1 i1Var) {
        this.f674a = bVar;
        this.f675b = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof C0797j1)) {
            C0797j1 j1Var = (C0797j1) obj;
            return C0914h.m1402a(this.f674a, j1Var.f674a) && C0914h.m1402a(this.f675b, j1Var.f675b);
        }
    }

    public final int hashCode() {
        return C0914h.m1403b(this.f674a, this.f675b);
    }

    public final String toString() {
        return C0914h.m1404c(this).mo12279a("key", this.f674a).mo12279a("feature", this.f675b).toString();
    }
}
