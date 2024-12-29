package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class zzkn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkn> CREATOR = new C2312r9();
    @SafeParcelable.Field(mo11280id = 1)

    /* renamed from: a */
    private final int f4770a;
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: b */
    public final String f4771b;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: c */
    public final long f4772c;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: d */
    public final Long f4773d;
    @SafeParcelable.Field(mo11280id = 6)

    /* renamed from: e */
    public final String f4774e;
    @SafeParcelable.Field(mo11280id = 7)

    /* renamed from: f */
    public final String f4775f;
    @SafeParcelable.Field(mo11280id = 8)

    /* renamed from: g */
    public final Double f4776g;

    @SafeParcelable.Constructor
    zzkn(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) long j, @SafeParcelable.Param(mo11283id = 4) Long l, @SafeParcelable.Param(mo11283id = 5) Float f, @SafeParcelable.Param(mo11283id = 6) String str2, @SafeParcelable.Param(mo11283id = 7) String str3, @SafeParcelable.Param(mo11283id = 8) Double d) {
        this.f4770a = i;
        this.f4771b = str;
        this.f4772c = j;
        this.f4773d = l;
        if (i == 1) {
            this.f4776g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f4776g = d;
        }
        this.f4774e = str2;
        this.f4775f = str3;
    }

    zzkn(C2334t9 t9Var) {
        this(t9Var.f4628c, t9Var.f4629d, t9Var.f4630e, t9Var.f4627b);
    }

    zzkn(String str, long j, Object obj, String str2) {
        C1609u.m4471g(str);
        this.f4770a = 2;
        this.f4771b = str;
        this.f4772c = j;
        this.f4775f = str2;
        if (obj == null) {
            this.f4773d = null;
            this.f4776g = null;
            this.f4774e = null;
        } else if (obj instanceof Long) {
            this.f4773d = (Long) obj;
            this.f4776g = null;
            this.f4774e = null;
        } else if (obj instanceof String) {
            this.f4773d = null;
            this.f4776g = null;
            this.f4774e = (String) obj;
        } else if (obj instanceof Double) {
            this.f4773d = null;
            this.f4776g = (Double) obj;
            this.f4774e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* renamed from: Q */
    public final Object mo13160Q() {
        Long l = this.f4773d;
        if (l != null) {
            return l;
        }
        Double d = this.f4776g;
        if (d != null) {
            return d;
        }
        String str = this.f4774e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f4770a);
        C1604b.m4452r(parcel, 2, this.f4771b, false);
        C1604b.m4448n(parcel, 3, this.f4772c);
        C1604b.m4449o(parcel, 4, this.f4773d, false);
        C1604b.m4444j(parcel, 5, (Float) null, false);
        C1604b.m4452r(parcel, 6, this.f4774e, false);
        C1604b.m4452r(parcel, 7, this.f4775f, false);
        C1604b.m4442h(parcel, 8, this.f4776g, false);
        C1604b.m4436b(parcel, a);
    }
}
