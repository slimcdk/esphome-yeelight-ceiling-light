package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.i */
public interface C0788i {
    @KeepForSdk
    /* renamed from: b */
    void mo11998b(@NonNull String str, @NonNull LifecycleCallback lifecycleCallback);

    @KeepForSdk
    @Nullable
    /* renamed from: h */
    <T extends LifecycleCallback> T mo11999h(@NonNull String str, @NonNull Class<T> cls);

    @KeepForSdk
    @Nullable
    /* renamed from: l */
    Activity mo12000l();

    @KeepForSdk
    void startActivityForResult(@NonNull Intent intent, int i);
}
