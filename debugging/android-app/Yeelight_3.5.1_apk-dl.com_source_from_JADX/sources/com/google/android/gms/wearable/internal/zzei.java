package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3454l0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetFdForAssetResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new C3454l0();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3051a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final ParcelFileDescriptor f3052b;

    @SafeParcelable.Constructor
    public zzei(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) ParcelFileDescriptor parcelFileDescriptor) {
        this.f3051a = i;
        this.f3052b = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3051a);
        C3897a.m11121q(parcel, 3, this.f3052b, i | 1, false);
        C3897a.m11106b(parcel, a);
    }
}
