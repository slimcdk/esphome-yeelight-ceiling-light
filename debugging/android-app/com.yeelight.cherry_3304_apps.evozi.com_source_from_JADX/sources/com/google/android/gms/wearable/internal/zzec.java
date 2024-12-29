package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetDataItemResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzec> CREATOR = new C2476m0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4973a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final zzdd f4974b;

    @SafeParcelable.Constructor
    public zzec(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) zzdd zzdd) {
        this.f4973a = i;
        this.f4974b = zzdd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4973a);
        C1604b.m4451q(parcel, 3, this.f4974b, i, false);
        C1604b.m4436b(parcel, a);
    }
}
