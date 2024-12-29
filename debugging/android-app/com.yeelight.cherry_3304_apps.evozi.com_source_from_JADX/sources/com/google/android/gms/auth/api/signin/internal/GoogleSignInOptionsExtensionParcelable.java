package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleSignInOptionsExtensionCreator")
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C1380c();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2525a;
    @SafeParcelable.Field(getter = "getType", mo11280id = 2)

    /* renamed from: b */
    private int f2526b;
    @SafeParcelable.Field(getter = "getBundle", mo11280id = 3)

    /* renamed from: c */
    private Bundle f2527c;

    @SafeParcelable.Constructor
    GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) int i2, @SafeParcelable.Param(mo11283id = 3) Bundle bundle) {
        this.f2525a = i;
        this.f2526b = i2;
        this.f2527c = bundle;
    }

    @KeepForSdk
    public int getType() {
        return this.f2526b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2525a);
        C1604b.m4446l(parcel, 2, getType());
        C1604b.m4439e(parcel, 3, this.f2527c, false);
        C1604b.m4436b(parcel, a);
    }
}
