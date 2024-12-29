package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p076o0.C3472q1;
import p113x.C3897a;

@SafeParcelable.Class(creator = "RpcResponseCreator")
public final class zzgk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgk> CREATOR = new C3472q1();
    @SafeParcelable.Field(mo12312id = 1)

    /* renamed from: a */
    public final int f3076a;
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: b */
    public final int f3077b;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: c */
    public final byte[] f3078c;

    @SafeParcelable.Constructor
    public zzgk(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) int i2, @SafeParcelable.Param(mo12315id = 3) byte[] bArr) {
        this.f3076a = i;
        this.f3077b = i2;
        this.f3078c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f3076a);
        C3897a.m11116l(parcel, 2, this.f3077b);
        C3897a.m11111g(parcel, 3, this.f3078c, false);
        C3897a.m11106b(parcel, a);
    }
}
