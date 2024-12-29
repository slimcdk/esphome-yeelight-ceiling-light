package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3458m0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetLocalNodeResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzek extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzek> CREATOR = new C3458m0();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3053a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final zzfw f3054b;

    @SafeParcelable.Constructor
    public zzek(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) zzfw zzfw) {
        this.f3053a = i;
        this.f3054b = zzfw;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3053a);
        C3897a.m11121q(parcel, 3, this.f3054b, i, false);
        C3897a.m11106b(parcel, a);
    }
}
