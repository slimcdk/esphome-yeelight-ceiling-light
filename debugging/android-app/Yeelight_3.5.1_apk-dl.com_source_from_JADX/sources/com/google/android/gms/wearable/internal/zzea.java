package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import p076o0.C3438h0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetConfigsResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzea extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzea> CREATOR = new C3438h0();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3043a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final ConnectionConfiguration[] f3044b;

    @SafeParcelable.Constructor
    public zzea(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) ConnectionConfiguration[] connectionConfigurationArr) {
        this.f3043a = i;
        this.f3044b = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3043a);
        C3897a.m11125u(parcel, 3, this.f3044b, i, false);
        C3897a.m11106b(parcel, a);
    }
}
