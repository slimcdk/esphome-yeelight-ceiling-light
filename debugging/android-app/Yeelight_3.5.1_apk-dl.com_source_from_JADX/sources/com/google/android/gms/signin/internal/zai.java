package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;
import p113x.C3897a;

@SafeParcelable.Class(creator = "SignInRequestCreator")
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C1870d();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f2900a;
    @SafeParcelable.Field(getter = "getResolveAccountRequest", mo12312id = 2)

    /* renamed from: b */
    final zat f2901b;

    @SafeParcelable.Constructor
    zai(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) zat zat) {
        this.f2900a = i;
        this.f2901b = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f2900a);
        C3897a.m11121q(parcel, 2, this.f2901b, i, false);
        C3897a.m11106b(parcel, a);
    }
}
