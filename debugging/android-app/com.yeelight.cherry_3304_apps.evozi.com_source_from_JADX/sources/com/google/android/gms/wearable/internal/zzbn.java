package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ChannelReceiveFileResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzbn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbn> CREATOR = new C2459i();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4940a;

    @SafeParcelable.Constructor
    public zzbn(@SafeParcelable.Param(mo11283id = 2) int i) {
        this.f4940a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4940a);
        C1604b.m4436b(parcel, a);
    }
}
