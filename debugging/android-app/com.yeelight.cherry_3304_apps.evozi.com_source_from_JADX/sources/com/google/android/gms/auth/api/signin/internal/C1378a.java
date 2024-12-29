package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C1378a {
    @VisibleForTesting

    /* renamed from: b */
    private static int f2528b = 31;

    /* renamed from: a */
    private int f2529a = 1;

    @KeepForSdk
    /* renamed from: a */
    public C1378a mo10739a(Object obj) {
        this.f2529a = (f2528b * this.f2529a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    /* renamed from: b */
    public int mo10740b() {
        return this.f2529a;
    }

    /* renamed from: c */
    public final C1378a mo10741c(boolean z) {
        this.f2529a = (f2528b * this.f2529a) + (z ? 1 : 0);
        return this;
    }
}
