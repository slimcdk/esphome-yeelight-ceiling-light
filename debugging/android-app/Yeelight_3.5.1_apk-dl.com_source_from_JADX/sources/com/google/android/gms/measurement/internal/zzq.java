package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p113x.C3897a;

@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 17, 20})
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C1594db();
    @SafeParcelable.Field(mo12312id = 2)
    @Nullable

    /* renamed from: a */
    public final String f2866a;
    @SafeParcelable.Field(mo12312id = 3)
    @Nullable

    /* renamed from: b */
    public final String f2867b;
    @SafeParcelable.Field(mo12312id = 4)
    @Nullable

    /* renamed from: c */
    public final String f2868c;
    @SafeParcelable.Field(mo12312id = 5)
    @Nullable

    /* renamed from: d */
    public final String f2869d;
    @SafeParcelable.Field(mo12312id = 6)

    /* renamed from: e */
    public final long f2870e;
    @SafeParcelable.Field(mo12312id = 7)

    /* renamed from: f */
    public final long f2871f;
    @SafeParcelable.Field(mo12312id = 8)
    @Nullable

    /* renamed from: g */
    public final String f2872g;
    @SafeParcelable.Field(defaultValue = "true", mo12312id = 9)

    /* renamed from: h */
    public final boolean f2873h;
    @SafeParcelable.Field(mo12312id = 10)

    /* renamed from: i */
    public final boolean f2874i;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", mo12312id = 11)

    /* renamed from: j */
    public final long f2875j;
    @SafeParcelable.Field(mo12312id = 12)
    @Nullable

    /* renamed from: k */
    public final String f2876k;
    @SafeParcelable.Field(mo12312id = 13)

    /* renamed from: l */
    public final long f2877l;
    @SafeParcelable.Field(mo12312id = 14)

    /* renamed from: m */
    public final long f2878m;
    @SafeParcelable.Field(mo12312id = 15)

    /* renamed from: n */
    public final int f2879n;
    @SafeParcelable.Field(defaultValue = "true", mo12312id = 16)

    /* renamed from: o */
    public final boolean f2880o;
    @SafeParcelable.Field(mo12312id = 18)

    /* renamed from: p */
    public final boolean f2881p;
    @SafeParcelable.Field(mo12312id = 19)
    @Nullable

    /* renamed from: q */
    public final String f2882q;
    @SafeParcelable.Field(mo12312id = 21)
    @Nullable

    /* renamed from: r */
    public final Boolean f2883r;
    @SafeParcelable.Field(mo12312id = 22)

    /* renamed from: s */
    public final long f2884s;
    @SafeParcelable.Field(mo12312id = 23)
    @Nullable

    /* renamed from: t */
    public final List f2885t;
    @SafeParcelable.Field(mo12312id = 24)
    @Nullable

    /* renamed from: u */
    public final String f2886u;
    @SafeParcelable.Field(defaultValue = "", mo12312id = 25)

    /* renamed from: v */
    public final String f2887v;
    @SafeParcelable.Field(defaultValue = "", mo12312id = 26)

    /* renamed from: w */
    public final String f2888w;
    @SafeParcelable.Field(mo12312id = 27)
    @Nullable

    /* renamed from: x */
    public final String f2889x;

    zzq(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List list, @Nullable String str8, String str9, String str10, @Nullable String str11) {
        C0917i.m1415f(str);
        this.f2866a = str;
        this.f2867b = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f2868c = str3;
        this.f2875j = j;
        this.f2869d = str4;
        this.f2870e = j2;
        this.f2871f = j3;
        this.f2872g = str5;
        this.f2873h = z;
        this.f2874i = z2;
        this.f2876k = str6;
        this.f2877l = j4;
        this.f2878m = j5;
        this.f2879n = i;
        this.f2880o = z3;
        this.f2881p = z4;
        this.f2882q = str7;
        this.f2883r = bool;
        this.f2884s = j6;
        this.f2885t = list;
        this.f2886u = null;
        this.f2887v = str9;
        this.f2888w = str10;
        this.f2889x = str11;
    }

    @SafeParcelable.Constructor
    zzq(@SafeParcelable.Param(mo12315id = 2) @Nullable String str, @SafeParcelable.Param(mo12315id = 3) @Nullable String str2, @SafeParcelable.Param(mo12315id = 4) @Nullable String str3, @SafeParcelable.Param(mo12315id = 5) @Nullable String str4, @SafeParcelable.Param(mo12315id = 6) long j, @SafeParcelable.Param(mo12315id = 7) long j2, @SafeParcelable.Param(mo12315id = 8) @Nullable String str5, @SafeParcelable.Param(mo12315id = 9) boolean z, @SafeParcelable.Param(mo12315id = 10) boolean z2, @SafeParcelable.Param(mo12315id = 11) long j3, @SafeParcelable.Param(mo12315id = 12) @Nullable String str6, @SafeParcelable.Param(mo12315id = 13) long j4, @SafeParcelable.Param(mo12315id = 14) long j5, @SafeParcelable.Param(mo12315id = 15) int i, @SafeParcelable.Param(mo12315id = 16) boolean z3, @SafeParcelable.Param(mo12315id = 18) boolean z4, @SafeParcelable.Param(mo12315id = 19) @Nullable String str7, @SafeParcelable.Param(mo12315id = 21) @Nullable Boolean bool, @SafeParcelable.Param(mo12315id = 22) long j6, @SafeParcelable.Param(mo12315id = 23) @Nullable List list, @SafeParcelable.Param(mo12315id = 24) @Nullable String str8, @SafeParcelable.Param(mo12315id = 25) String str9, @SafeParcelable.Param(mo12315id = 26) String str10, @SafeParcelable.Param(mo12315id = 27) String str11) {
        this.f2866a = str;
        this.f2867b = str2;
        this.f2868c = str3;
        this.f2875j = j3;
        this.f2869d = str4;
        this.f2870e = j;
        this.f2871f = j2;
        this.f2872g = str5;
        this.f2873h = z;
        this.f2874i = z2;
        this.f2876k = str6;
        this.f2877l = j4;
        this.f2878m = j5;
        this.f2879n = i;
        this.f2880o = z3;
        this.f2881p = z4;
        this.f2882q = str7;
        this.f2883r = bool;
        this.f2884s = j6;
        this.f2885t = list;
        this.f2886u = str8;
        this.f2887v = str9;
        this.f2888w = str10;
        this.f2889x = str11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 2, this.f2866a, false);
        C3897a.m11122r(parcel, 3, this.f2867b, false);
        C3897a.m11122r(parcel, 4, this.f2868c, false);
        C3897a.m11122r(parcel, 5, this.f2869d, false);
        C3897a.m11118n(parcel, 6, this.f2870e);
        C3897a.m11118n(parcel, 7, this.f2871f);
        C3897a.m11122r(parcel, 8, this.f2872g, false);
        C3897a.m11107c(parcel, 9, this.f2873h);
        C3897a.m11107c(parcel, 10, this.f2874i);
        C3897a.m11118n(parcel, 11, this.f2875j);
        C3897a.m11122r(parcel, 12, this.f2876k, false);
        C3897a.m11118n(parcel, 13, this.f2877l);
        C3897a.m11118n(parcel, 14, this.f2878m);
        C3897a.m11116l(parcel, 15, this.f2879n);
        C3897a.m11107c(parcel, 16, this.f2880o);
        C3897a.m11107c(parcel, 18, this.f2881p);
        C3897a.m11122r(parcel, 19, this.f2882q, false);
        C3897a.m11108d(parcel, 21, this.f2883r, false);
        C3897a.m11118n(parcel, 22, this.f2884s);
        C3897a.m11124t(parcel, 23, this.f2885t, false);
        C3897a.m11122r(parcel, 24, this.f2886u, false);
        C3897a.m11122r(parcel, 25, this.f2887v, false);
        C3897a.m11122r(parcel, 26, this.f2888w, false);
        C3897a.m11122r(parcel, 27, this.f2889x, false);
        C3897a.m11106b(parcel, a);
    }
}
