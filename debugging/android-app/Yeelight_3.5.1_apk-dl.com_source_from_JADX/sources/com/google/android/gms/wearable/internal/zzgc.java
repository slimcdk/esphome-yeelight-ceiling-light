package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3463n1;
import p113x.C3897a;

@SafeParcelable.Class(creator = "PerformEapAkaResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzgc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgc> CREATOR = new C3463n1();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3069a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final String f3070b;

    @SafeParcelable.Constructor
    public zzgc(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) String str) {
        this.f3069a = i;
        this.f3070b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3069a);
        C3897a.m11122r(parcel, 3, this.f3070b, false);
        C3897a.m11106b(parcel, a);
    }
}
