package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SendMessageResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzga extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzga> CREATOR = new C2505u1();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4998a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final int f4999b;

    @SafeParcelable.Constructor
    public zzga(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) int i2) {
        this.f4998a = i;
        this.f4999b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4998a);
        C1604b.m4446l(parcel, 3, this.f4999b);
        C1604b.m4436b(parcel, a);
    }
}
