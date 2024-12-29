package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@SafeParcelable.Class(creator = "GetConfigResponseCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public final class zzdw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdw> CREATOR = new C2460i0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    private final int f4967a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    private final ConnectionConfiguration f4968b;

    @SafeParcelable.Constructor
    public zzdw(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) ConnectionConfiguration connectionConfiguration) {
        this.f4967a = i;
        this.f4968b = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4967a);
        C1604b.m4451q(parcel, 3, this.f4968b, i, false);
        C1604b.m4436b(parcel, a);
    }
}
