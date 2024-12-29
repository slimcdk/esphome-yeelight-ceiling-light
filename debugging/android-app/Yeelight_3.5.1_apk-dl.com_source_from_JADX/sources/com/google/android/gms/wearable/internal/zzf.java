package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3455l1;
import p113x.C3897a;

@SafeParcelable.Class(creator = "AddLocalCapabilityResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C3455l1();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3055a;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(mo12315id = 2) int i) {
        this.f3055a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3055a);
        C3897a.m11106b(parcel, a);
    }
}
