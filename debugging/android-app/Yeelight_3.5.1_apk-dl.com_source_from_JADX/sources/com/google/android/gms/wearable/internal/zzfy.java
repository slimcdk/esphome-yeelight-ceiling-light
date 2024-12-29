package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3451k1;
import p113x.C3897a;

@SafeParcelable.Class(creator = "OpenChannelResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzfy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfy> CREATOR = new C3451k1();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3064a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final zzbi f3065b;

    @SafeParcelable.Constructor
    public zzfy(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) zzbi zzbi) {
        this.f3064a = i;
        this.f3065b = zzbi;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3064a);
        C3897a.m11121q(parcel, 3, this.f3065b, i, false);
        C3897a.m11106b(parcel, a);
    }
}
