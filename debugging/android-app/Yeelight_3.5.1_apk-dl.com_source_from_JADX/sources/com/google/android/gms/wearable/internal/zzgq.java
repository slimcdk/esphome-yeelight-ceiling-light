package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p076o0.C3481t1;
import p113x.C3897a;

@ShowFirstParty
@SafeParcelable.Class(creator = "StorageInfoResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzgq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgq> CREATOR = new C3481t1();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3081a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final long f3082b;
    @SafeParcelable.Field(mo12312id = 4)

    /* renamed from: c */
    public final List<zzga> f3083c;

    @SafeParcelable.Constructor
    public zzgq(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) long j, @SafeParcelable.Param(mo12315id = 4) List<zzga> list) {
        this.f3081a = i;
        this.f3082b = j;
        this.f3083c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3081a);
        C3897a.m11118n(parcel, 3, this.f3082b);
        C3897a.m11126v(parcel, 4, this.f3083c, false);
        C3897a.m11106b(parcel, a);
    }
}
