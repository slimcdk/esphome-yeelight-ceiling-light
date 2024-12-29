package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p069n0.C3367m;
import p076o0.C3447j1;
import p113x.C3897a;

@SafeParcelable.Class(creator = "NodeParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzfw extends AbstractSafeParcelable implements C3367m {
    public static final Parcelable.Creator<zzfw> CREATOR = new C3447j1();
    @SafeParcelable.Field(getter = "getId", mo12312id = 2)

    /* renamed from: a */
    private final String f3060a;
    @SafeParcelable.Field(getter = "getDisplayName", mo12312id = 3)

    /* renamed from: b */
    private final String f3061b;
    @SafeParcelable.Field(getter = "getHopCount", mo12312id = 4)

    /* renamed from: c */
    private final int f3062c;
    @SafeParcelable.Field(getter = "isNearby", mo12312id = 5)

    /* renamed from: d */
    private final boolean f3063d;

    @SafeParcelable.Constructor
    public zzfw(@SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) String str2, @SafeParcelable.Param(mo12315id = 4) int i, @SafeParcelable.Param(mo12315id = 5) boolean z) {
        this.f3060a = str;
        this.f3061b = str2;
        this.f3062c = i;
        this.f3063d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfw)) {
            return false;
        }
        return ((zzfw) obj).f3060a.equals(this.f3060a);
    }

    public final String getId() {
        return this.f3060a;
    }

    public final int hashCode() {
        return this.f3060a.hashCode();
    }

    public final String toString() {
        String str = this.f3061b;
        String str2 = this.f3060a;
        int i = this.f3062c;
        boolean z = this.f3063d;
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
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 2, this.f3060a, false);
        C3897a.m11122r(parcel, 3, this.f3061b, false);
        C3897a.m11116l(parcel, 4, this.f3062c);
        C3897a.m11107c(parcel, 5, this.f3063d);
        C3897a.m11106b(parcel, a);
    }
}
