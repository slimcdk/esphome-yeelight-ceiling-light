package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthAccountResultCreator")
public final class zaa extends AbstractSafeParcelable implements C1507j {
    public static final Parcelable.Creator<zaa> CREATOR = new C2402b();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f4815a;
    @SafeParcelable.Field(getter = "getConnectionResultCode", mo11280id = 2)

    /* renamed from: b */
    private int f4816b;
    @SafeParcelable.Field(getter = "getRawAuthResolutionIntent", mo11280id = 3)

    /* renamed from: c */
    private Intent f4817c;

    public zaa() {
        this(0, (Intent) null);
    }

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) int i2, @SafeParcelable.Param(mo11283id = 3) Intent intent) {
        this.f4815a = i;
        this.f4816b = i2;
        this.f4817c = intent;
    }

    private zaa(int i, Intent intent) {
        this(2, 0, (Intent) null);
    }

    /* renamed from: K */
    public final Status mo10772K() {
        return this.f4816b == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f4815a);
        C1604b.m4446l(parcel, 2, this.f4816b);
        C1604b.m4451q(parcel, 3, this.f4817c, i, false);
        C1604b.m4436b(parcel, a);
    }
}
