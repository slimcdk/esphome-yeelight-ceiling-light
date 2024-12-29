package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ValidateAccountRequestCreator")
@Deprecated
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C0930u();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1087a;

    @SafeParcelable.Constructor
    zzaj(@SafeParcelable.Param(mo12315id = 1) int i) {
        this.f1087a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1087a);
        C3897a.m11106b(parcel, a);
    }
}
