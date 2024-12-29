package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PackageStorageInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzfs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfs> CREATOR = new C2489p1();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    private final String f4990a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    private final String f4991b;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: c */
    private final long f4992c;

    @SafeParcelable.Constructor
    public zzfs(@SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) String str2, @SafeParcelable.Param(mo11283id = 4) long j) {
        this.f4990a = str;
        this.f4991b = str2;
        this.f4992c = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 2, this.f4990a, false);
        C1604b.m4452r(parcel, 3, this.f4991b, false);
        C1604b.m4448n(parcel, 4, this.f4992c);
        C1604b.m4436b(parcel, a);
    }
}
