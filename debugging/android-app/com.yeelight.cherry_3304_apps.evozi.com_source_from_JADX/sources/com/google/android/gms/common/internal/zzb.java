package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConnectionInfoCreator")
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new C1576i0();
    @SafeParcelable.Field(mo11280id = 1)

    /* renamed from: a */
    Bundle f3092a;
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: b */
    Feature[] f3093b;

    public zzb() {
    }

    @SafeParcelable.Constructor
    zzb(@SafeParcelable.Param(mo11283id = 1) Bundle bundle, @SafeParcelable.Param(mo11283id = 2) Feature[] featureArr) {
        this.f3092a = bundle;
        this.f3093b = featureArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4439e(parcel, 1, this.f3092a, false);
        C1604b.m4455u(parcel, 2, this.f3093b, i, false);
        C1604b.m4436b(parcel, a);
    }
}
