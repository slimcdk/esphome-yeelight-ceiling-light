package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

@SafeParcelable.Class(creator = "GetAllCapabilitiesResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdi> CREATOR = new C2432b0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4952a;
    @SafeParcelable.Field(mo11280id = 3)
    @VisibleForTesting

    /* renamed from: b */
    public final List<zzah> f4953b;

    @SafeParcelable.Constructor
    public zzdi(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) List<zzah> list) {
        this.f4952a = i;
        this.f4953b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4952a);
        C1604b.m4456v(parcel, 3, this.f4953b, false);
        C1604b.m4436b(parcel, a);
    }
}
