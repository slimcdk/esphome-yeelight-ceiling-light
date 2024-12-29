package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C1582d();
    @SafeParcelable.Field(mo12312id = 2)
    @Nullable

    /* renamed from: a */
    public String f2843a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public String f2844b;
    @SafeParcelable.Field(mo12312id = 4)

    /* renamed from: c */
    public zzlo f2845c;
    @SafeParcelable.Field(mo12312id = 5)

    /* renamed from: d */
    public long f2846d;
    @SafeParcelable.Field(mo12312id = 6)

    /* renamed from: e */
    public boolean f2847e;
    @SafeParcelable.Field(mo12312id = 7)
    @Nullable

    /* renamed from: f */
    public String f2848f;
    @SafeParcelable.Field(mo12312id = 8)
    @Nullable

    /* renamed from: g */
    public final zzaw f2849g;
    @SafeParcelable.Field(mo12312id = 9)

    /* renamed from: h */
    public long f2850h;
    @SafeParcelable.Field(mo12312id = 10)
    @Nullable

    /* renamed from: i */
    public zzaw f2851i;
    @SafeParcelable.Field(mo12312id = 11)

    /* renamed from: j */
    public final long f2852j;
    @SafeParcelable.Field(mo12312id = 12)
    @Nullable

    /* renamed from: k */
    public final zzaw f2853k;

    zzac(zzac zzac) {
        C0917i.m1419j(zzac);
        this.f2843a = zzac.f2843a;
        this.f2844b = zzac.f2844b;
        this.f2845c = zzac.f2845c;
        this.f2846d = zzac.f2846d;
        this.f2847e = zzac.f2847e;
        this.f2848f = zzac.f2848f;
        this.f2849g = zzac.f2849g;
        this.f2850h = zzac.f2850h;
        this.f2851i = zzac.f2851i;
        this.f2852j = zzac.f2852j;
        this.f2853k = zzac.f2853k;
    }

    @SafeParcelable.Constructor
    zzac(@SafeParcelable.Param(mo12315id = 2) @Nullable String str, @SafeParcelable.Param(mo12315id = 3) String str2, @SafeParcelable.Param(mo12315id = 4) zzlo zzlo, @SafeParcelable.Param(mo12315id = 5) long j, @SafeParcelable.Param(mo12315id = 6) boolean z, @SafeParcelable.Param(mo12315id = 7) @Nullable String str3, @SafeParcelable.Param(mo12315id = 8) @Nullable zzaw zzaw, @SafeParcelable.Param(mo12315id = 9) long j2, @SafeParcelable.Param(mo12315id = 10) @Nullable zzaw zzaw2, @SafeParcelable.Param(mo12315id = 11) long j3, @SafeParcelable.Param(mo12315id = 12) @Nullable zzaw zzaw3) {
        this.f2843a = str;
        this.f2844b = str2;
        this.f2845c = zzlo;
        this.f2846d = j;
        this.f2847e = z;
        this.f2848f = str3;
        this.f2849g = zzaw;
        this.f2850h = j2;
        this.f2851i = zzaw2;
        this.f2852j = j3;
        this.f2853k = zzaw3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 2, this.f2843a, false);
        C3897a.m11122r(parcel, 3, this.f2844b, false);
        C3897a.m11121q(parcel, 4, this.f2845c, i, false);
        C3897a.m11118n(parcel, 5, this.f2846d);
        C3897a.m11107c(parcel, 6, this.f2847e);
        C3897a.m11122r(parcel, 7, this.f2848f, false);
        C3897a.m11121q(parcel, 8, this.f2849g, i, false);
        C3897a.m11118n(parcel, 9, this.f2850h);
        C3897a.m11121q(parcel, 10, this.f2851i, i, false);
        C3897a.m11118n(parcel, 11, this.f2852j);
        C3897a.m11121q(parcel, 12, this.f2853k, i, false);
        C3897a.m11106b(parcel, a);
    }
}
