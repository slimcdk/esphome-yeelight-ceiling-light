package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ConnectionInfoCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C0903c0();
    @SafeParcelable.Field(mo12312id = 1)

    /* renamed from: a */
    Bundle f1088a;
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: b */
    Feature[] f1089b;
    @SafeParcelable.Field(defaultValue = "0", mo12312id = 3)

    /* renamed from: c */
    int f1090c;
    @SafeParcelable.Field(mo12312id = 4)
    @Nullable

    /* renamed from: d */
    ConnectionTelemetryConfiguration f1091d;

    public zzj() {
    }

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param(mo12315id = 1) Bundle bundle, @SafeParcelable.Param(mo12315id = 2) Feature[] featureArr, @SafeParcelable.Param(mo12315id = 3) int i, @SafeParcelable.Param(mo12315id = 4) @Nullable ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f1088a = bundle;
        this.f1089b = featureArr;
        this.f1090c = i;
        this.f1091d = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11109e(parcel, 1, this.f1088a, false);
        C3897a.m11125u(parcel, 2, this.f1089b, i, false);
        C3897a.m11116l(parcel, 3, this.f1090c);
        C3897a.m11121q(parcel, 4, this.f1091d, i, false);
        C3897a.m11106b(parcel, a);
    }
}
