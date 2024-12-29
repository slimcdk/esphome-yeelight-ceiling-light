package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetCloudSyncSettingCreator")
@SafeParcelable.Reserved({1})
public final class zzdv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdv> CREATOR = new C2456h0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    private final int f4965a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    private final boolean f4966b;

    @SafeParcelable.Constructor
    public zzdv(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) boolean z) {
        this.f4965a = i;
        this.f4966b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4965a);
        C1604b.m4437c(parcel, 3, this.f4966b);
        C1604b.m4436b(parcel, a);
    }
}
