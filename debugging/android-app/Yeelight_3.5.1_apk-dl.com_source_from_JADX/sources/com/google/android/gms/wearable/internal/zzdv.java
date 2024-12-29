package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3426e0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetCloudSyncSettingCreator")
@SafeParcelable.Reserved({1})
public final class zzdv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdv> CREATOR = new C3426e0();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3037a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final boolean f3038b;

    @SafeParcelable.Constructor
    public zzdv(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) boolean z) {
        this.f3037a = i;
        this.f3038b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3037a);
        C3897a.m11107c(parcel, 3, this.f3038b);
        C3897a.m11106b(parcel, a);
    }
}
