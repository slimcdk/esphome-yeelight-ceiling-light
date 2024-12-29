package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;
import p113x.C3897a;

@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C1871e();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f2902a;
    @SafeParcelable.Field(getter = "getConnectionResult", mo12312id = 2)

    /* renamed from: b */
    private final ConnectionResult f2903b;
    @SafeParcelable.Field(getter = "getResolveAccountResponse", mo12312id = 3)
    @Nullable

    /* renamed from: c */
    private final zav f2904c;

    @SafeParcelable.Constructor
    zak(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(mo12315id = 3) @Nullable zav zav) {
        this.f2902a = i;
        this.f2903b = connectionResult;
        this.f2904c = zav;
    }

    /* renamed from: V */
    public final ConnectionResult mo14733V() {
        return this.f2903b;
    }

    @Nullable
    /* renamed from: W */
    public final zav mo14734W() {
        return this.f2904c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f2902a);
        C3897a.m11121q(parcel, 2, this.f2903b, i, false);
        C3897a.m11121q(parcel, 3, this.f2904c, i, false);
        C3897a.m11106b(parcel, a);
    }
}
