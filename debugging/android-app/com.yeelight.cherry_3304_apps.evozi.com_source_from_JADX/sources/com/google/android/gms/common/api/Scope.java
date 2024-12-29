package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "ScopeCreator")
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1515r();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2546a;
    @SafeParcelable.Field(getter = "getScopeUri", mo11280id = 2)

    /* renamed from: b */
    private final String f2547b;

    @SafeParcelable.Constructor
    Scope(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) String str) {
        C1609u.m4472h(str, "scopeUri must not be null or empty");
        this.f2546a = i;
        this.f2547b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    @KeepForSdk
    /* renamed from: Q */
    public final String mo10767Q() {
        return this.f2547b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2547b.equals(((Scope) obj).f2547b);
    }

    public final int hashCode() {
        return this.f2547b.hashCode();
    }

    public final String toString() {
        return this.f2547b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2546a);
        C1604b.m4452r(parcel, 2, mo10767Q(), false);
        C1604b.m4436b(parcel, a);
    }
}
