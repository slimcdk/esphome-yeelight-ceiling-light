package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetFdForAssetResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new C2480n0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4975a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final ParcelFileDescriptor f4976b;

    @SafeParcelable.Constructor
    public zzee(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) ParcelFileDescriptor parcelFileDescriptor) {
        this.f4975a = i;
        this.f4976b = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4975a);
        C1604b.m4451q(parcel, 3, this.f4976b, i | 1, false);
        C1604b.m4436b(parcel, a);
    }
}
