package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C1622l();
    @SafeParcelable.Field(getter = "getName", mo11280id = 1)

    /* renamed from: a */
    private final String f2538a;
    @SafeParcelable.Field(getter = "getOldVersion", mo11280id = 2)
    @Deprecated

    /* renamed from: b */
    private final int f2539b;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", mo11280id = 3)

    /* renamed from: c */
    private final long f2540c;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(mo11283id = 1) String str, @SafeParcelable.Param(mo11283id = 2) int i, @SafeParcelable.Param(mo11283id = 3) long j) {
        this.f2538a = str;
        this.f2539b = i;
        this.f2540c = j;
    }

    @KeepForSdk
    /* renamed from: Q */
    public long mo10754Q() {
        long j = this.f2540c;
        return j == -1 ? (long) this.f2539b : j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            return ((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && mo10754Q() == feature.mo10754Q();
        }
    }

    @KeepForSdk
    public String getName() {
        return this.f2538a;
    }

    public int hashCode() {
        return C1599s.m4389b(getName(), Long.valueOf(mo10754Q()));
    }

    public String toString() {
        C1599s.C1600a c = C1599s.m4390c(this);
        c.mo11272a("name", getName());
        c.mo11272a("version", Long.valueOf(mo10754Q()));
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 1, getName(), false);
        C1604b.m4446l(parcel, 2, this.f2539b);
        C1604b.m4448n(parcel, 3, mo10754Q());
        C1604b.m4436b(parcel, a);
    }
}
