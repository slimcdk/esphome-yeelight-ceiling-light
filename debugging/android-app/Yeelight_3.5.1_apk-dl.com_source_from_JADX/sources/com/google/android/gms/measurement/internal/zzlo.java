package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class zzlo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlo> CREATOR = new C1806ua();
    @SafeParcelable.Field(mo12312id = 1)

    /* renamed from: a */
    public final int f2859a;
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: b */
    public final String f2860b;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: c */
    public final long f2861c;
    @SafeParcelable.Field(mo12312id = 4)
    @Nullable

    /* renamed from: d */
    public final Long f2862d;
    @SafeParcelable.Field(mo12312id = 6)
    @Nullable

    /* renamed from: e */
    public final String f2863e;
    @SafeParcelable.Field(mo12312id = 7)

    /* renamed from: f */
    public final String f2864f;
    @SafeParcelable.Field(mo12312id = 8)
    @Nullable

    /* renamed from: g */
    public final Double f2865g;

    @SafeParcelable.Constructor
    zzlo(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) long j, @SafeParcelable.Param(mo12315id = 4) @Nullable Long l, @SafeParcelable.Param(mo12315id = 5) Float f, @SafeParcelable.Param(mo12315id = 6) @Nullable String str2, @SafeParcelable.Param(mo12315id = 7) String str3, @SafeParcelable.Param(mo12315id = 8) @Nullable Double d) {
        this.f2859a = i;
        this.f2860b = str;
        this.f2861c = j;
        this.f2862d = l;
        if (i == 1) {
            this.f2865g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f2865g = d;
        }
        this.f2863e = str2;
        this.f2864f = str3;
    }

    zzlo(C1818va vaVar) {
        this(vaVar.f2732c, vaVar.f2733d, vaVar.f2734e, vaVar.f2731b);
    }

    zzlo(String str, long j, @Nullable Object obj, String str2) {
        C0917i.m1415f(str);
        this.f2859a = 2;
        this.f2860b = str;
        this.f2861c = j;
        this.f2864f = str2;
        if (obj == null) {
            this.f2862d = null;
            this.f2865g = null;
            this.f2863e = null;
        } else if (obj instanceof Long) {
            this.f2862d = (Long) obj;
            this.f2865g = null;
            this.f2863e = null;
        } else if (obj instanceof String) {
            this.f2862d = null;
            this.f2865g = null;
            this.f2863e = (String) obj;
        } else if (obj instanceof Double) {
            this.f2862d = null;
            this.f2865g = (Double) obj;
            this.f2863e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    @Nullable
    /* renamed from: V */
    public final Object mo14714V() {
        Long l = this.f2862d;
        if (l != null) {
            return l;
        }
        Double d = this.f2865g;
        if (d != null) {
            return d;
        }
        String str = this.f2863e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C1806ua.m4800a(this, parcel, i);
    }
}
