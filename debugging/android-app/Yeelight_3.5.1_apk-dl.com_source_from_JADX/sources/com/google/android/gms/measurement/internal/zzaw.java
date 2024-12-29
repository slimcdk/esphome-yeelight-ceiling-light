package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C1795u();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    public final String f2855a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    public final zzau f2856b;
    @SafeParcelable.Field(mo12312id = 4)

    /* renamed from: c */
    public final String f2857c;
    @SafeParcelable.Field(mo12312id = 5)

    /* renamed from: d */
    public final long f2858d;

    zzaw(zzaw zzaw, long j) {
        C0917i.m1419j(zzaw);
        this.f2855a = zzaw.f2855a;
        this.f2856b = zzaw.f2856b;
        this.f2857c = zzaw.f2857c;
        this.f2858d = j;
    }

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) zzau zzau, @SafeParcelable.Param(mo12315id = 4) String str2, @SafeParcelable.Param(mo12315id = 5) long j) {
        this.f2855a = str;
        this.f2856b = zzau;
        this.f2857c = str2;
        this.f2858d = j;
    }

    public final String toString() {
        String str = this.f2857c;
        String str2 = this.f2855a;
        String valueOf = String.valueOf(this.f2856b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C1795u.m4773a(this, parcel, i);
    }
}
