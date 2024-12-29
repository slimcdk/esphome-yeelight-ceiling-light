package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AddLocalCapabilityResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C2502t1();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4979a;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(mo11283id = 2) int i) {
        this.f4979a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4979a);
        C1604b.m4436b(parcel, a);
    }
}
