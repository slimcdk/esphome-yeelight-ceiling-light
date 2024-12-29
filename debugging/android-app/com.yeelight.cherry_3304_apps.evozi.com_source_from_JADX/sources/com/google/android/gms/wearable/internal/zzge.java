package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "StorageInfoResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzge extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzge> CREATOR = new C2511w1();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    private final int f5000a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    private final long f5001b;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: c */
    private final List<zzfs> f5002c;

    @SafeParcelable.Constructor
    public zzge(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) long j, @SafeParcelable.Param(mo11283id = 4) List<zzfs> list) {
        this.f5000a = i;
        this.f5001b = j;
        this.f5002c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f5000a);
        C1604b.m4448n(parcel, 3, this.f5001b);
        C1604b.m4456v(parcel, 4, this.f5002c, false);
        C1604b.m4436b(parcel, a);
    }
}
