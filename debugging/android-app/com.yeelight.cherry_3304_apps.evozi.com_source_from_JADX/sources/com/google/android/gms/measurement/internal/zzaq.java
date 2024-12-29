package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new C2280p();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    public final String f4766a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    public final zzal f4767b;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: c */
    public final String f4768c;
    @SafeParcelable.Field(mo11280id = 5)

    /* renamed from: d */
    public final long f4769d;

    zzaq(zzaq zzaq, long j) {
        C1609u.m4475k(zzaq);
        this.f4766a = zzaq.f4766a;
        this.f4767b = zzaq.f4767b;
        this.f4768c = zzaq.f4768c;
        this.f4769d = j;
    }

    @SafeParcelable.Constructor
    public zzaq(@SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) zzal zzal, @SafeParcelable.Param(mo11283id = 4) String str2, @SafeParcelable.Param(mo11283id = 5) long j) {
        this.f4766a = str;
        this.f4767b = zzal;
        this.f4768c = str2;
        this.f4769d = j;
    }

    public final String toString() {
        String str = this.f4768c;
        String str2 = this.f4766a;
        String valueOf = String.valueOf(this.f4767b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 2, this.f4766a, false);
        C1604b.m4451q(parcel, 3, this.f4767b, i, false);
        C1604b.m4452r(parcel, 4, this.f4768c, false);
        C1604b.m4448n(parcel, 5, this.f4769d);
        C1604b.m4436b(parcel, a);
    }
}
