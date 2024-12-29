package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import p076o0.C3410a0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetChannelInputStreamResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdm> CREATOR = new C3410a0();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3028a;
    @SafeParcelable.Field(mo12312id = 3)
    @Nullable

    /* renamed from: b */
    public final ParcelFileDescriptor f3029b;

    @SafeParcelable.Constructor
    public zzdm(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) ParcelFileDescriptor parcelFileDescriptor) {
        this.f3028a = i;
        this.f3029b = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3028a);
        C3897a.m11121q(parcel, 3, this.f3029b, i, false);
        C3897a.m11106b(parcel, a);
    }
}
