package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3450k0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetEapIdResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new C3450k0();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3049a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final String f3050b;

    @SafeParcelable.Constructor
    public zzeg(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) String str) {
        this.f3049a = i;
        this.f3050b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3049a);
        C3897a.m11122r(parcel, 3, this.f3050b, false);
        C3897a.m11106b(parcel, a);
    }
}
