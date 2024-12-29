package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import p101u.C3708c;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new C3708c();
    @SafeParcelable.Field(getter = "getName", mo12312id = 1)

    /* renamed from: a */
    private final String f501a;
    @SafeParcelable.Field(getter = "getOldVersion", mo12312id = 2)
    @Deprecated

    /* renamed from: b */
    private final int f502b;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", mo12312id = 3)

    /* renamed from: c */
    private final long f503c;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(mo12315id = 1) @NonNull String str, @SafeParcelable.Param(mo12315id = 2) int i, @SafeParcelable.Param(mo12315id = 3) long j) {
        this.f501a = str;
        this.f502b = i;
        this.f503c = j;
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j) {
        this.f501a = str;
        this.f503c = j;
        this.f502b = -1;
    }

    @KeepForSdk
    /* renamed from: V */
    public long mo11760V() {
        long j = this.f503c;
        return j == -1 ? (long) this.f502b : j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            return ((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && mo11760V() == feature.mo11760V();
        }
    }

    @NonNull
    @KeepForSdk
    public String getName() {
        return this.f501a;
    }

    public final int hashCode() {
        return C0914h.m1403b(getName(), Long.valueOf(mo11760V()));
    }

    @NonNull
    public final String toString() {
        C0914h.C0915a c = C0914h.m1404c(this);
        c.mo12279a("name", getName());
        c.mo12279a(Constants.VERSION, Long.valueOf(mo11760V()));
        return c.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 1, getName(), false);
        C3897a.m11116l(parcel, 2, this.f502b);
        C3897a.m11118n(parcel, 3, mo11760V());
        C3897a.m11106b(parcel, a);
    }
}
