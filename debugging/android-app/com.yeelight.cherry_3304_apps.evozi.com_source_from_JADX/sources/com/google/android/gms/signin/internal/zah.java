package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInRequestCreator")
public final class zah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zah> CREATOR = new C2408h();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f4818a;
    @SafeParcelable.Field(getter = "getResolveAccountRequest", mo11280id = 2)

    /* renamed from: b */
    private final ResolveAccountRequest f4819b;

    @SafeParcelable.Constructor
    zah(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) ResolveAccountRequest resolveAccountRequest) {
        this.f4818a = i;
        this.f4819b = resolveAccountRequest;
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f4818a);
        C1604b.m4451q(parcel, 2, this.f4819b, i, false);
        C1604b.m4436b(parcel, a);
    }
}
