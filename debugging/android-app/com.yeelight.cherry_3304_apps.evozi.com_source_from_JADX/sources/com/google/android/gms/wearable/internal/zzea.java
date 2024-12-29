package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "GetConnectedNodesResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzea extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzea> CREATOR = new C2472l0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4971a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final List<zzfo> f4972b;

    @SafeParcelable.Constructor
    public zzea(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) List<zzfo> list) {
        this.f4971a = i;
        this.f4972b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4971a);
        C1604b.m4456v(parcel, 3, this.f4972b, false);
        C1604b.m4436b(parcel, a);
    }
}
