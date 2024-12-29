package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetCloudSyncOptInStatusCreator")
@SafeParcelable.Reserved({1})
public final class zzdt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdt> CREATOR = new C2452g0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    private final int f4962a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    private final boolean f4963b;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: c */
    private final boolean f4964c;

    @SafeParcelable.Constructor
    public zzdt(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) boolean z, @SafeParcelable.Param(mo11283id = 4) boolean z2) {
        this.f4962a = i;
        this.f4963b = z;
        this.f4964c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4962a);
        C1604b.m4437c(parcel, 3, this.f4963b);
        C1604b.m4437c(parcel, 4, this.f4964c);
        C1604b.m4436b(parcel, a);
    }
}
