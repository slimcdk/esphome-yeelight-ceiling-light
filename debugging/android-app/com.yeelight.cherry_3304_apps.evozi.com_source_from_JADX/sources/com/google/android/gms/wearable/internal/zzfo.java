package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.C2522k;

@SafeParcelable.Class(creator = "NodeParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzfo extends AbstractSafeParcelable implements C2522k {
    public static final Parcelable.Creator<zzfo> CREATOR = new C2481n1();
    @SafeParcelable.Field(getter = "getId", mo11280id = 2)

    /* renamed from: a */
    private final String f4984a;
    @SafeParcelable.Field(getter = "getDisplayName", mo11280id = 3)

    /* renamed from: b */
    private final String f4985b;
    @SafeParcelable.Field(getter = "getHopCount", mo11280id = 4)

    /* renamed from: c */
    private final int f4986c;
    @SafeParcelable.Field(getter = "isNearby", mo11280id = 5)

    /* renamed from: d */
    private final boolean f4987d;

    @SafeParcelable.Constructor
    public zzfo(@SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) String str2, @SafeParcelable.Param(mo11283id = 4) int i, @SafeParcelable.Param(mo11283id = 5) boolean z) {
        this.f4984a = str;
        this.f4985b = str2;
        this.f4986c = i;
        this.f4987d = z;
    }

    /* renamed from: Q */
    public final String mo13435Q() {
        return this.f4985b;
    }

    /* renamed from: R */
    public final boolean mo13436R() {
        return this.f4987d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfo)) {
            return false;
        }
        return ((zzfo) obj).f4984a.equals(this.f4984a);
    }

    public final String getId() {
        return this.f4984a;
    }

    public final int hashCode() {
        return this.f4984a.hashCode();
    }

    public final String toString() {
        String str = this.f4985b;
        String str2 = this.f4984a;
        int i = this.f4986c;
        boolean z = this.f4987d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(str2).length());
        sb.append("Node{");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", hops=");
        sb.append(i);
        sb.append(", isNearby=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 2, getId(), false);
        C1604b.m4452r(parcel, 3, mo13435Q(), false);
        C1604b.m4446l(parcel, 4, this.f4986c);
        C1604b.m4437c(parcel, 5, mo13436R());
        C1604b.m4436b(parcel, a);
    }
}
