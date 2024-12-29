package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "InitializationParamsCreator")
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C1215n1();
    @SafeParcelable.Field(mo12312id = 1)

    /* renamed from: a */
    public final long f1746a;
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: b */
    public final long f1747b;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: c */
    public final boolean f1748c;
    @SafeParcelable.Field(mo12312id = 4)
    @Nullable

    /* renamed from: d */
    public final String f1749d;
    @SafeParcelable.Field(mo12312id = 5)
    @Nullable

    /* renamed from: e */
    public final String f1750e;
    @SafeParcelable.Field(mo12312id = 6)
    @Nullable

    /* renamed from: f */
    public final String f1751f;
    @SafeParcelable.Field(mo12312id = 7)
    @Nullable

    /* renamed from: g */
    public final Bundle f1752g;
    @SafeParcelable.Field(mo12312id = 8)
    @Nullable

    /* renamed from: h */
    public final String f1753h;

    @SafeParcelable.Constructor
    public zzcl(@SafeParcelable.Param(mo12315id = 1) long j, @SafeParcelable.Param(mo12315id = 2) long j2, @SafeParcelable.Param(mo12315id = 3) boolean z, @SafeParcelable.Param(mo12315id = 4) @Nullable String str, @SafeParcelable.Param(mo12315id = 5) @Nullable String str2, @SafeParcelable.Param(mo12315id = 6) @Nullable String str3, @SafeParcelable.Param(mo12315id = 7) @Nullable Bundle bundle, @SafeParcelable.Param(mo12315id = 8) @Nullable String str4) {
        this.f1746a = j;
        this.f1747b = j2;
        this.f1748c = z;
        this.f1749d = str;
        this.f1750e = str2;
        this.f1751f = str3;
        this.f1752g = bundle;
        this.f1753h = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11118n(parcel, 1, this.f1746a);
        C3897a.m11118n(parcel, 2, this.f1747b);
        C3897a.m11107c(parcel, 3, this.f1748c);
        C3897a.m11122r(parcel, 4, this.f1749d, false);
        C3897a.m11122r(parcel, 5, this.f1750e, false);
        C3897a.m11122r(parcel, 6, this.f1751f, false);
        C3897a.m11109e(parcel, 7, this.f1752g, false);
        C3897a.m11122r(parcel, 8, this.f1753h, false);
        C3897a.m11106b(parcel, a);
    }
}
