package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3497z;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetCapabilityResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdk> CREATOR = new C3497z();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3026a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final zzag f3027b;

    @SafeParcelable.Constructor
    public zzdk(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) zzag zzag) {
        this.f3026a = i;
        this.f3027b = zzag;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3026a);
        C3897a.m11121q(parcel, 3, this.f3027b, i, false);
        C3897a.m11106b(parcel, a);
    }
}
