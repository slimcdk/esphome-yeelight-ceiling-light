package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetLocalNodeResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new C2484o0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4977a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final zzfo f4978b;

    @SafeParcelable.Constructor
    public zzeg(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) zzfo zzfo) {
        this.f4977a = i;
        this.f4978b = zzfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4977a);
        C1604b.m4451q(parcel, 3, this.f4978b, i, false);
        C1604b.m4436b(parcel, a);
    }
}
