package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import p076o0.C3494y;
import p113x.C3897a;

@SafeParcelable.Class(creator = "GetAllCapabilitiesResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdi> CREATOR = new C3494y();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final int f3024a;
    @SafeParcelable.Field(mo12312id = 3)
    @VisibleForTesting

    /* renamed from: b */
    public final List<zzag> f3025b;

    @SafeParcelable.Constructor
    public zzdi(@SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) List<zzag> list) {
        this.f3024a = i;
        this.f3025b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, this.f3024a);
        C3897a.m11126v(parcel, 3, this.f3025b, false);
        C3897a.m11106b(parcel, a);
    }
}
