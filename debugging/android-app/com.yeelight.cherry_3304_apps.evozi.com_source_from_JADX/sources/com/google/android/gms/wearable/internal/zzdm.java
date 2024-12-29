package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "GetChannelInputStreamResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdm> CREATOR = new C2440d0();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final int f4956a;
    @SafeParcelable.Field(mo11280id = 3)
    @Nullable

    /* renamed from: b */
    public final ParcelFileDescriptor f4957b;

    @SafeParcelable.Constructor
    public zzdm(@SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) ParcelFileDescriptor parcelFileDescriptor) {
        this.f4956a = i;
        this.f4957b = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 2, this.f4956a);
        C1604b.m4451q(parcel, 3, this.f4957b, i, false);
        C1604b.m4436b(parcel, a);
    }
}
