package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p076o0.C3442i0;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetConnectedNodesResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzec> CREATOR = new C3442i0();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3045a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final List<zzfw> f3046b;

    @SafeParcelable.Constructor
    public zzec(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) List<zzfw> list) {
        this.f3045a = i;
        this.f3046b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3045a);
        C3897a.m11126v(parcel, 3, this.f3046b, false);
        C3897a.m11106b(parcel, a);
    }
}
