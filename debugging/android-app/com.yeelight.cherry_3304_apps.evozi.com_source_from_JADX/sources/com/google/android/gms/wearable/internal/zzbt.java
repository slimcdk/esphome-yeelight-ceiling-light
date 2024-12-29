package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CloseChannelResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR = new C2467k();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4942a;

    @SafeParcelable.Constructor
    public zzbt(@SafeParcelable.Param(mo11283id = 2) int i) {
        this.f4942a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4942a);
        C1604b.m4436b(parcel, a);
    }
}
