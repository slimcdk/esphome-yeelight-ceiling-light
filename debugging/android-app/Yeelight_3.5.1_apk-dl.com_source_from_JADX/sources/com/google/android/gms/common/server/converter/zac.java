package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new C0949c();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1124a;
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: b */
    final String f1125b;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: c */
    final int f1126c;

    @SafeParcelable.Constructor
    zac(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) int i2) {
        this.f1124a = i;
        this.f1125b = str;
        this.f1126c = i2;
    }

    zac(String str, int i) {
        this.f1124a = 1;
        this.f1125b = str;
        this.f1126c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1124a);
        C3897a.m11122r(parcel, 2, this.f1125b, false);
        C3897a.m11116l(parcel, 3, this.f1126c);
        C3897a.m11106b(parcel, a);
    }
}
