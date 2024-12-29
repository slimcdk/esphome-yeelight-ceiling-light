package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new C2200ha();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public String f4799a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public String f4800b;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: c */
    public zzkn f4801c;
    @SafeParcelable.Field(mo11280id = 5)

    /* renamed from: d */
    public long f4802d;
    @SafeParcelable.Field(mo11280id = 6)

    /* renamed from: e */
    public boolean f4803e;
    @SafeParcelable.Field(mo11280id = 7)

    /* renamed from: f */
    public String f4804f;
    @SafeParcelable.Field(mo11280id = 8)

    /* renamed from: g */
    public zzaq f4805g;
    @SafeParcelable.Field(mo11280id = 9)

    /* renamed from: h */
    public long f4806h;
    @SafeParcelable.Field(mo11280id = 10)

    /* renamed from: i */
    public zzaq f4807i;
    @SafeParcelable.Field(mo11280id = 11)

    /* renamed from: j */
    public long f4808j;
    @SafeParcelable.Field(mo11280id = 12)

    /* renamed from: k */
    public zzaq f4809k;

    zzy(zzy zzy) {
        C1609u.m4475k(zzy);
        this.f4799a = zzy.f4799a;
        this.f4800b = zzy.f4800b;
        this.f4801c = zzy.f4801c;
        this.f4802d = zzy.f4802d;
        this.f4803e = zzy.f4803e;
        this.f4804f = zzy.f4804f;
        this.f4805g = zzy.f4805g;
        this.f4806h = zzy.f4806h;
        this.f4807i = zzy.f4807i;
        this.f4808j = zzy.f4808j;
        this.f4809k = zzy.f4809k;
    }

    @SafeParcelable.Constructor
    zzy(@SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) String str2, @SafeParcelable.Param(mo11283id = 4) zzkn zzkn, @SafeParcelable.Param(mo11283id = 5) long j, @SafeParcelable.Param(mo11283id = 6) boolean z, @SafeParcelable.Param(mo11283id = 7) String str3, @SafeParcelable.Param(mo11283id = 8) zzaq zzaq, @SafeParcelable.Param(mo11283id = 9) long j2, @SafeParcelable.Param(mo11283id = 10) zzaq zzaq2, @SafeParcelable.Param(mo11283id = 11) long j3, @SafeParcelable.Param(mo11283id = 12) zzaq zzaq3) {
        this.f4799a = str;
        this.f4800b = str2;
        this.f4801c = zzkn;
        this.f4802d = j;
        this.f4803e = z;
        this.f4804f = str3;
        this.f4805g = zzaq;
        this.f4806h = j2;
        this.f4807i = zzaq2;
        this.f4808j = j3;
        this.f4809k = zzaq3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 2, this.f4799a, false);
        C1604b.m4452r(parcel, 3, this.f4800b, false);
        C1604b.m4451q(parcel, 4, this.f4801c, i, false);
        C1604b.m4448n(parcel, 5, this.f4802d);
        C1604b.m4437c(parcel, 6, this.f4803e);
        C1604b.m4452r(parcel, 7, this.f4804f, false);
        C1604b.m4451q(parcel, 8, this.f4805g, i, false);
        C1604b.m4448n(parcel, 9, this.f4806h);
        C1604b.m4451q(parcel, 10, this.f4807i, i, false);
        C1604b.m4448n(parcel, 11, this.f4808j);
        C1604b.m4451q(parcel, 12, this.f4809k, i, false);
        C1604b.m4436b(parcel, a);
    }
}
