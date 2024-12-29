package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1393b;
import com.google.android.gms.common.api.C1406i;
import com.google.android.gms.common.api.Status;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.b */
public class C1546b {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static C1393b m4200a(@NonNull Status status) {
        return status.mo10775S() ? new C1406i(status) : new C1393b(status);
    }
}
