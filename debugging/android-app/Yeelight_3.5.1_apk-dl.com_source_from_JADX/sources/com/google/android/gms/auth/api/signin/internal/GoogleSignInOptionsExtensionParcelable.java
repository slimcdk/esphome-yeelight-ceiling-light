package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GoogleSignInOptionsExtensionCreator")
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C0720c();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f488a;
    @SafeParcelable.Field(getter = "getType", mo12312id = 2)

    /* renamed from: b */
    private int f489b;
    @SafeParcelable.Field(getter = "getBundle", mo12312id = 3)

    /* renamed from: c */
    private Bundle f490c;

    @SafeParcelable.Constructor
    GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) int i2, @SafeParcelable.Param(mo12315id = 3) Bundle bundle) {
        this.f488a = i;
        this.f489b = i2;
        this.f490c = bundle;
    }

    @KeepForSdk
    public int getType() {
        return this.f489b;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f488a);
        C3897a.m11116l(parcel, 2, getType());
        C3897a.m11109e(parcel, 3, this.f490c, false);
        C3897a.m11106b(parcel, a);
    }
}
