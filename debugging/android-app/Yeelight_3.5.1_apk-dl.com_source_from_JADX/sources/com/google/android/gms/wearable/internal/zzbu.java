package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3449k;
import p113x.C3897a;

@SafeParcelable.Class(creator = "CloseChannelResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzbu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbu> CREATOR = new C3449k();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3014a;

    @SafeParcelable.Constructor
    public zzbu(@SafeParcelable.Param(mo12315id = 2) int i) {
        this.f3014a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3014a);
        C3897a.m11106b(parcel, a);
    }
}
