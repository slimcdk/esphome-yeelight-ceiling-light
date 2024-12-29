package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3491x;
import p113x.C3897a;

@SafeParcelable.Class(creator = "DeleteDataItemsResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdg> CREATOR = new C3491x();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3022a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final int f3023b;

    @SafeParcelable.Constructor
    public zzdg(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) int i2) {
        this.f3022a = i;
        this.f3023b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3022a);
        C3897a.m11116l(parcel, 3, this.f3023b);
        C3897a.m11106b(parcel, a);
    }
}
