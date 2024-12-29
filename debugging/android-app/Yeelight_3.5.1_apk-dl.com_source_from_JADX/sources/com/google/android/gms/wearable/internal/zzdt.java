package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3422d0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetCloudSyncOptInStatusCreator")
@SafeParcelable.Reserved({1})
public final class zzdt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdt> CREATOR = new C3422d0();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3034a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final boolean f3035b;
    @SafeParcelable.Field(mo12312id = 4)

    /* renamed from: c */
    public final boolean f3036c;

    @SafeParcelable.Constructor
    public zzdt(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) boolean z, @SafeParcelable.Param(mo12315id = 4) boolean z2) {
        this.f3034a = i;
        this.f3035b = z;
        this.f3036c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3034a);
        C3897a.m11107c(parcel, 3, this.f3035b);
        C3897a.m11107c(parcel, 4, this.f3036c);
        C3897a.m11106b(parcel, a);
    }
}
