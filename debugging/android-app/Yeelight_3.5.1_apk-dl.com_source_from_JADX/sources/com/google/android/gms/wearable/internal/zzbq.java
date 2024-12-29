package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3445j;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ChannelSendFileResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new C3445j();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3013a;

    @SafeParcelable.Constructor
    public zzbq(@SafeParcelable.Param(mo12315id = 2) int i) {
        this.f3013a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3013a);
        C3897a.m11106b(parcel, a);
    }
}
