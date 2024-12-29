package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3466o1;
import p113x.C3897a;

@SafeParcelable.Class(creator = "PutDataResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzge extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzge> CREATOR = new C3466o1();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3071a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final zzdd f3072b;

    @SafeParcelable.Constructor
    public zzge(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) zzdd zzdd) {
        this.f3071a = i;
        this.f3072b = zzdd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3071a);
        C3897a.m11121q(parcel, 3, this.f3072b, i, false);
        C3897a.m11106b(parcel, a);
    }
}
