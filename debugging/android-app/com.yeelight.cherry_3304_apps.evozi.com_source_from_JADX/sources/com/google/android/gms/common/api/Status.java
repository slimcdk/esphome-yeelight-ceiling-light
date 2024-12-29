package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@SafeParcelable.Class(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements C1507j, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C1516s();
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);
    @KeepForSdk
    @VisibleForTesting
    public static final Status RESULT_SUCCESS = new Status(0);
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);
    @SafeParcelable.VersionField(mo11286id = 1000)

    /* renamed from: a */
    private final int f2548a;
    @SafeParcelable.Field(getter = "getStatusCode", mo11280id = 1)

    /* renamed from: b */
    private final int f2549b;
    @SafeParcelable.Field(getter = "getStatusMessage", mo11280id = 2)
    @Nullable

    /* renamed from: c */
    private final String f2550c;
    @SafeParcelable.Field(getter = "getPendingIntent", mo11280id = 3)
    @Nullable

    /* renamed from: d */
    private final PendingIntent f2551d;

    @KeepForSdk
    public Status(int i) {
        this(i, (String) null);
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    Status(@SafeParcelable.Param(mo11283id = 1000) int i, @SafeParcelable.Param(mo11283id = 1) int i2, @SafeParcelable.Param(mo11283id = 2) @Nullable String str, @SafeParcelable.Param(mo11283id = 3) @Nullable PendingIntent pendingIntent) {
        this.f2548a = i;
        this.f2549b = i2;
        this.f2550c = str;
        this.f2551d = pendingIntent;
    }

    @KeepForSdk
    public Status(int i, @Nullable String str) {
        this(1, i, str, (PendingIntent) null);
    }

    @KeepForSdk
    public Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    @KeepForSdk
    /* renamed from: K */
    public final Status mo10772K() {
        return this;
    }

    /* renamed from: Q */
    public final int mo10773Q() {
        return this.f2549b;
    }

    @Nullable
    /* renamed from: R */
    public final String mo10774R() {
        return this.f2550c;
    }

    @VisibleForTesting
    /* renamed from: S */
    public final boolean mo10775S() {
        return this.f2551d != null;
    }

    /* renamed from: T */
    public final boolean mo10776T() {
        return this.f2549b <= 0;
    }

    /* renamed from: V */
    public final String mo10777V() {
        String str = this.f2550c;
        return str != null ? str : C1395d.m3645a(this.f2549b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2548a == status.f2548a && this.f2549b == status.f2549b && C1599s.m4388a(this.f2550c, status.f2550c) && C1599s.m4388a(this.f2551d, status.f2551d);
    }

    public final int hashCode() {
        return C1599s.m4389b(Integer.valueOf(this.f2548a), Integer.valueOf(this.f2549b), this.f2550c, this.f2551d);
    }

    public final String toString() {
        C1599s.C1600a c = C1599s.m4390c(this);
        c.mo11272a("statusCode", mo10777V());
        c.mo11272a("resolution", this.f2551d);
        return c.toString();
    }

    @KeepForSdk
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, mo10773Q());
        C1604b.m4452r(parcel, 2, mo10774R(), false);
        C1604b.m4451q(parcel, 3, this.f2551d, i, false);
        C1604b.m4446l(parcel, 1000, this.f2548a);
        C1604b.m4436b(parcel, a);
    }
}
