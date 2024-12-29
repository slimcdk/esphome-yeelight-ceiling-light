package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3475r1;
import p113x.C3897a;

@SafeParcelable.Class(creator = "SendMessageResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzgm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgm> CREATOR = new C3475r1();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3079a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final int f3080b;

    @SafeParcelable.Constructor
    public zzgm(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) int i2) {
        this.f3079a = i;
        this.f3080b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3079a);
        C3897a.m11116l(parcel, 3, this.f3080b);
        C3897a.m11106b(parcel, a);
    }
}
