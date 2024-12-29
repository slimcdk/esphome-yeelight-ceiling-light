package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeleteDataItemsResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdg> CREATOR = new C2428a0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4950a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final int f4951b;

    @SafeParcelable.Constructor
    public zzdg(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) int i2) {
        this.f4950a = i;
        this.f4951b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4950a);
        C1604b.m4446l(parcel, 3, this.f4951b);
        C1604b.m4436b(parcel, a);
    }
}
