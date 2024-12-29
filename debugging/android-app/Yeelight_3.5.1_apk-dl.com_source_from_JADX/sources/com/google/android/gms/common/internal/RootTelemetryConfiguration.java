package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p109w.C3832c0;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "RootTelemetryConfigurationCreator")
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C3832c0();
    @SafeParcelable.Field(getter = "getVersion", mo12312id = 1)

    /* renamed from: a */
    private final int f965a;
    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", mo12312id = 2)

    /* renamed from: b */
    private final boolean f966b;
    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", mo12312id = 3)

    /* renamed from: c */
    private final boolean f967c;
    @SafeParcelable.Field(getter = "getBatchPeriodMillis", mo12312id = 4)

    /* renamed from: d */
    private final int f968d;
    @SafeParcelable.Field(getter = "getMaxMethodInvocationsInBatch", mo12312id = 5)

    /* renamed from: e */
    private final int f969e;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) boolean z, @SafeParcelable.Param(mo12315id = 3) boolean z2, @SafeParcelable.Param(mo12315id = 4) int i2, @SafeParcelable.Param(mo12315id = 5) int i3) {
        this.f965a = i;
        this.f966b = z;
        this.f967c = z2;
        this.f968d = i2;
        this.f969e = i3;
    }

    @KeepForSdk
    /* renamed from: V */
    public int mo12178V() {
        return this.f968d;
    }

    @KeepForSdk
    /* renamed from: W */
    public int mo12179W() {
        return this.f969e;
    }

    @KeepForSdk
    /* renamed from: c0 */
    public boolean mo12180c0() {
        return this.f966b;
    }

    @KeepForSdk
    /* renamed from: d0 */
    public boolean mo12181d0() {
        return this.f967c;
    }

    @KeepForSdk
    /* renamed from: f0 */
    public int mo12182f0() {
        return this.f965a;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, mo12182f0());
        C3897a.m11107c(parcel, 2, mo12180c0());
        C3897a.m11107c(parcel, 3, mo12181d0());
        C3897a.m11116l(parcel, 4, mo12178V());
        C3897a.m11116l(parcel, 5, mo12179W());
        C3897a.m11106b(parcel, a);
    }
}
