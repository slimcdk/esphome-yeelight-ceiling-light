package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C0718a {
    @VisibleForTesting

    /* renamed from: b */
    static int f491b = 31;

    /* renamed from: a */
    private int f492a = 1;

    @NonNull
    @KeepForSdk
    @CanIgnoreReturnValue
    /* renamed from: a */
    public C0718a mo11744a(@Nullable Object obj) {
        this.f492a = (f491b * this.f492a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    /* renamed from: b */
    public int mo11745b() {
        return this.f492a;
    }

    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: c */
    public final C0718a mo11746c(boolean z) {
        this.f492a = (f491b * this.f492a) + (z ? 1 : 0);
        return this;
    }
}
