package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetCapabilityResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdk> CREATOR = new C2436c0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4954a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final zzah f4955b;

    @SafeParcelable.Constructor
    public zzdk(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) zzah zzah) {
        this.f4954a = i;
        this.f4955b = zzah;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4954a);
        C1604b.m4451q(parcel, 3, this.f4955b, i, false);
        C1604b.m4436b(parcel, a);
    }
}
