package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetCloudSyncOptInOutDoneCreator")
@SafeParcelable.Reserved({1})
public final class zzdr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdr> CREATOR = new C2448f0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    private final int f4960a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    private final boolean f4961b;

    @SafeParcelable.Constructor
    public zzdr(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) boolean z) {
        this.f4960a = i;
        this.f4961b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4960a);
        C1604b.m4437c(parcel, 3, this.f4961b);
        C1604b.m4436b(parcel, a);
    }
}
