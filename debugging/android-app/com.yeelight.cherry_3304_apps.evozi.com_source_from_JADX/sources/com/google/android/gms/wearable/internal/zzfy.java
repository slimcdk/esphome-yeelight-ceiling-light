package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RemoveLocalCapabilityResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzfy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfy> CREATOR = new C2499s1();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4997a;

    @SafeParcelable.Constructor
    public zzfy(@SafeParcelable.Param(mo11283id = 2) int i) {
        this.f4997a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4997a);
        C1604b.m4436b(parcel, a);
    }
}
