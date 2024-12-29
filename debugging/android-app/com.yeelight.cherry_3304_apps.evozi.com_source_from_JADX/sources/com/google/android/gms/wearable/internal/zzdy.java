package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@SafeParcelable.Class(creator = "GetConfigsResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdy> CREATOR = new C2464j0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    private final int f4969a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    private final ConnectionConfiguration[] f4970b;

    @SafeParcelable.Constructor
    public zzdy(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) ConnectionConfiguration[] connectionConfigurationArr) {
        this.f4969a = i;
        this.f4970b = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4969a);
        C1604b.m4455u(parcel, 3, this.f4970b, i, false);
        C1604b.m4436b(parcel, a);
    }
}
