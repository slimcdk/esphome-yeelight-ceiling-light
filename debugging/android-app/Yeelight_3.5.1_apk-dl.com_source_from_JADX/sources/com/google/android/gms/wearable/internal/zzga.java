package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3459m1;
import p113x.C3897a;

@ShowFirstParty
@SafeParcelable.Class(creator = "PackageStorageInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzga extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzga> CREATOR = new C3459m1();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final String f3066a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final String f3067b;
    @SafeParcelable.Field(mo12312id = 4)

    /* renamed from: c */
    public final long f3068c;

    @SafeParcelable.Constructor
    public zzga(@SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) String str2, @SafeParcelable.Param(mo12315id = 4) long j) {
        this.f3066a = str;
        this.f3067b = str2;
        this.f3068c = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 2, this.f3066a, false);
        C3897a.m11122r(parcel, 3, this.f3067b, false);
        C3897a.m11118n(parcel, 4, this.f3068c);
        C3897a.m11106b(parcel, a);
    }
}
