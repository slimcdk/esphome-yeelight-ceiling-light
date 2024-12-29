package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ValidateAccountRequestCreator")
@Deprecated
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C1614w0();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f3094a;

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Param(mo11283id = 1) int i) {
        this.f3094a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f3094a);
        C1604b.m4436b(parcel, a);
    }
}
