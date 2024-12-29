package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OpenChannelResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzfq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfq> CREATOR = new C2485o1();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4988a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final zzay f4989b;

    @SafeParcelable.Constructor
    public zzfq(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) zzay zzay) {
        this.f4988a = i;
        this.f4989b = zzay;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4988a);
        C1604b.m4451q(parcel, 3, this.f4989b, i, false);
        C1604b.m4436b(parcel, a);
    }
}
