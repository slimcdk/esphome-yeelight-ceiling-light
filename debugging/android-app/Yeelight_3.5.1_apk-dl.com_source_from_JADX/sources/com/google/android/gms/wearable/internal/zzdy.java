package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import p076o0.C3434g0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetConfigResponseCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public final class zzdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdy> CREATOR = new C3434g0();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3041a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final ConnectionConfiguration f3042b;

    @SafeParcelable.Constructor
    public zzdy(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) ConnectionConfiguration connectionConfiguration) {
        this.f3041a = i;
        this.f3042b = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3041a);
        C3897a.m11121q(parcel, 3, this.f3042b, i, false);
        C3897a.m11106b(parcel, a);
    }
}
