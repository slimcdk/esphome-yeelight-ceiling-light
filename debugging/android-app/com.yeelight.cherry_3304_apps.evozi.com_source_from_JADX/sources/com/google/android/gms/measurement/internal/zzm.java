package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 20})
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C2389y9();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final String f4777a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final String f4778b;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: c */
    public final String f4779c;
    @SafeParcelable.Field(mo11280id = 5)

    /* renamed from: d */
    public final String f4780d;
    @SafeParcelable.Field(mo11280id = 6)

    /* renamed from: e */
    public final long f4781e;
    @SafeParcelable.Field(mo11280id = 7)

    /* renamed from: f */
    public final long f4782f;
    @SafeParcelable.Field(mo11280id = 8)

    /* renamed from: g */
    public final String f4783g;
    @SafeParcelable.Field(defaultValue = "true", mo11280id = 9)

    /* renamed from: h */
    public final boolean f4784h;
    @SafeParcelable.Field(mo11280id = 10)

    /* renamed from: i */
    public final boolean f4785i;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", mo11280id = 11)

    /* renamed from: j */
    public final long f4786j;
    @SafeParcelable.Field(mo11280id = 12)

    /* renamed from: k */
    public final String f4787k;
    @SafeParcelable.Field(mo11280id = 13)

    /* renamed from: l */
    public final long f4788l;
    @SafeParcelable.Field(mo11280id = 14)

    /* renamed from: m */
    public final long f4789m;
    @SafeParcelable.Field(mo11280id = 15)

    /* renamed from: n */
    public final int f4790n;
    @SafeParcelable.Field(defaultValue = "true", mo11280id = 16)

    /* renamed from: o */
    public final boolean f4791o;
    @SafeParcelable.Field(defaultValue = "true", mo11280id = 17)

    /* renamed from: p */
    public final boolean f4792p;
    @SafeParcelable.Field(mo11280id = 18)

    /* renamed from: q */
    public final boolean f4793q;
    @SafeParcelable.Field(mo11280id = 19)

    /* renamed from: r */
    public final String f4794r;
    @SafeParcelable.Field(mo11280id = 21)

    /* renamed from: s */
    public final Boolean f4795s;
    @SafeParcelable.Field(mo11280id = 22)

    /* renamed from: t */
    public final long f4796t;
    @SafeParcelable.Field(mo11280id = 23)

    /* renamed from: u */
    public final List<String> f4797u;
    @SafeParcelable.Field(mo11280id = 24)

    /* renamed from: v */
    public final String f4798v;

    zzm(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        C1609u.m4471g(str);
        this.f4777a = str;
        this.f4778b = TextUtils.isEmpty(str2) ? null : str2;
        this.f4779c = str3;
        this.f4786j = j;
        this.f4780d = str4;
        this.f4781e = j2;
        this.f4782f = j3;
        this.f4783g = str5;
        this.f4784h = z;
        this.f4785i = z2;
        this.f4787k = str6;
        this.f4788l = j4;
        this.f4789m = j5;
        this.f4790n = i;
        this.f4791o = z3;
        this.f4792p = z4;
        this.f4793q = z5;
        this.f4794r = str7;
        this.f4795s = bool;
        this.f4796t = j6;
        this.f4797u = list;
        this.f4798v = str8;
    }

    @SafeParcelable.Constructor
    zzm(@SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) String str2, @SafeParcelable.Param(mo11283id = 4) String str3, @SafeParcelable.Param(mo11283id = 5) String str4, @SafeParcelable.Param(mo11283id = 6) long j, @SafeParcelable.Param(mo11283id = 7) long j2, @SafeParcelable.Param(mo11283id = 8) String str5, @SafeParcelable.Param(mo11283id = 9) boolean z, @SafeParcelable.Param(mo11283id = 10) boolean z2, @SafeParcelable.Param(mo11283id = 11) long j3, @SafeParcelable.Param(mo11283id = 12) String str6, @SafeParcelable.Param(mo11283id = 13) long j4, @SafeParcelable.Param(mo11283id = 14) long j5, @SafeParcelable.Param(mo11283id = 15) int i, @SafeParcelable.Param(mo11283id = 16) boolean z3, @SafeParcelable.Param(mo11283id = 17) boolean z4, @SafeParcelable.Param(mo11283id = 18) boolean z5, @SafeParcelable.Param(mo11283id = 19) String str7, @SafeParcelable.Param(mo11283id = 21) Boolean bool, @SafeParcelable.Param(mo11283id = 22) long j6, @SafeParcelable.Param(mo11283id = 23) List<String> list, @SafeParcelable.Param(mo11283id = 24) String str8) {
        this.f4777a = str;
        this.f4778b = str2;
        this.f4779c = str3;
        this.f4786j = j3;
        this.f4780d = str4;
        this.f4781e = j;
        this.f4782f = j2;
        this.f4783g = str5;
        this.f4784h = z;
        this.f4785i = z2;
        this.f4787k = str6;
        this.f4788l = j4;
        this.f4789m = j5;
        this.f4790n = i;
        this.f4791o = z3;
        this.f4792p = z4;
        this.f4793q = z5;
        this.f4794r = str7;
        this.f4795s = bool;
        this.f4796t = j6;
        this.f4797u = list;
        this.f4798v = str8;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 2, this.f4777a, false);
        C1604b.m4452r(parcel, 3, this.f4778b, false);
        C1604b.m4452r(parcel, 4, this.f4779c, false);
        C1604b.m4452r(parcel, 5, this.f4780d, false);
        C1604b.m4448n(parcel, 6, this.f4781e);
        C1604b.m4448n(parcel, 7, this.f4782f);
        C1604b.m4452r(parcel, 8, this.f4783g, false);
        C1604b.m4437c(parcel, 9, this.f4784h);
        C1604b.m4437c(parcel, 10, this.f4785i);
        C1604b.m4448n(parcel, 11, this.f4786j);
        C1604b.m4452r(parcel, 12, this.f4787k, false);
        C1604b.m4448n(parcel, 13, this.f4788l);
        C1604b.m4448n(parcel, 14, this.f4789m);
        C1604b.m4446l(parcel, 15, this.f4790n);
        C1604b.m4437c(parcel, 16, this.f4791o);
        C1604b.m4437c(parcel, 17, this.f4792p);
        C1604b.m4437c(parcel, 18, this.f4793q);
        C1604b.m4452r(parcel, 19, this.f4794r, false);
        C1604b.m4438d(parcel, 21, this.f4795s, false);
        C1604b.m4448n(parcel, 22, this.f4796t);
        C1604b.m4454t(parcel, 23, this.f4797u, false);
        C1604b.m4452r(parcel, 24, this.f4798v, false);
        C1604b.m4436b(parcel, a);
    }
}
