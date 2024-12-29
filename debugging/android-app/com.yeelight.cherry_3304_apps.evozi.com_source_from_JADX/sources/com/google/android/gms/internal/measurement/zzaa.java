package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InitializationParamsCreator")
public final class zzaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaa> CREATOR = new C1745d();
    @SafeParcelable.Field(mo11280id = 1)

    /* renamed from: a */
    public final long f3878a;
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: b */
    public final long f3879b;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: c */
    public final boolean f3880c;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: d */
    public final String f3881d;
    @SafeParcelable.Field(mo11280id = 5)

    /* renamed from: e */
    public final String f3882e;
    @SafeParcelable.Field(mo11280id = 6)

    /* renamed from: f */
    public final String f3883f;
    @SafeParcelable.Field(mo11280id = 7)

    /* renamed from: g */
    public final Bundle f3884g;

    @SafeParcelable.Constructor
    public zzaa(@SafeParcelable.Param(mo11283id = 1) long j, @SafeParcelable.Param(mo11283id = 2) long j2, @SafeParcelable.Param(mo11283id = 3) boolean z, @SafeParcelable.Param(mo11283id = 4) String str, @SafeParcelable.Param(mo11283id = 5) String str2, @SafeParcelable.Param(mo11283id = 6) String str3, @SafeParcelable.Param(mo11283id = 7) Bundle bundle) {
        this.f3878a = j;
        this.f3879b = j2;
        this.f3880c = z;
        this.f3881d = str;
        this.f3882e = str2;
        this.f3883f = str3;
        this.f3884g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4448n(parcel, 1, this.f3878a);
        C1604b.m4448n(parcel, 2, this.f3879b);
        C1604b.m4437c(parcel, 3, this.f3880c);
        C1604b.m4452r(parcel, 4, this.f3881d, false);
        C1604b.m4452r(parcel, 5, this.f3882e, false);
        C1604b.m4452r(parcel, 6, this.f3883f, false);
        C1604b.m4439e(parcel, 7, this.f3884g, false);
        C1604b.m4436b(parcel, a);
    }
}
