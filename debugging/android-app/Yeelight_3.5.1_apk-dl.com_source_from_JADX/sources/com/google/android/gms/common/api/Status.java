package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import p113x.C3897a;

@SafeParcelable.Class(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements C0744h, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new C0876o();
    @ShowFirstParty
    @NonNull
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);
    @NonNull
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    @ShowFirstParty
    @NonNull
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    @ShowFirstParty
    @NonNull
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);
    @ShowFirstParty
    @NonNull
    @KeepForSdk
    @VisibleForTesting
    public static final Status RESULT_SUCCESS = new Status(0);
    @ShowFirstParty
    @NonNull
    @KeepForSdk
    @VisibleForTesting
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1);
    @ShowFirstParty
    @NonNull
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);
    @ShowFirstParty
    @NonNull
    public static final Status zza = new Status(17);
    @SafeParcelable.VersionField(mo12321id = 1000)

    /* renamed from: a */
    final int f513a;
    @SafeParcelable.Field(getter = "getStatusCode", mo12312id = 1)

    /* renamed from: b */
    private final int f514b;
    @SafeParcelable.Field(getter = "getStatusMessage", mo12312id = 2)
    @Nullable

    /* renamed from: c */
    private final String f515c;
    @SafeParcelable.Field(getter = "getPendingIntent", mo12312id = 3)
    @Nullable

    /* renamed from: d */
    private final PendingIntent f516d;
    @SafeParcelable.Field(getter = "getConnectionResult", mo12312id = 4)
    @Nullable

    /* renamed from: e */
    private final ConnectionResult f517e;

    public Status(int i) {
        this(i, (String) null);
    }

    @SafeParcelable.Constructor
    Status(@SafeParcelable.Param(mo12315id = 1000) int i, @SafeParcelable.Param(mo12315id = 1) int i2, @SafeParcelable.Param(mo12315id = 2) @Nullable String str, @SafeParcelable.Param(mo12315id = 3) @Nullable PendingIntent pendingIntent, @SafeParcelable.Param(mo12315id = 4) @Nullable ConnectionResult connectionResult) {
        this.f513a = i;
        this.f514b = i2;
        this.f515c = str;
        this.f516d = pendingIntent;
        this.f517e = connectionResult;
    }

    public Status(int i, @Nullable String str) {
        this(1, i, str, (PendingIntent) null, (ConnectionResult) null);
    }

    public Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    @KeepForSdk
    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i) {
        this(1, i, str, connectionResult.mo11753c0(), connectionResult);
    }

    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: N */
    public Status mo11805N() {
        return this;
    }

    @Nullable
    /* renamed from: V */
    public ConnectionResult mo11806V() {
        return this.f517e;
    }

    @Nullable
    /* renamed from: W */
    public PendingIntent mo11807W() {
        return this.f516d;
    }

    /* renamed from: c0 */
    public int mo11808c0() {
        return this.f514b;
    }

    @Nullable
    /* renamed from: d0 */
    public String mo11809d0() {
        return this.f515c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f513a == status.f513a && this.f514b == status.f514b && C0914h.m1402a(this.f515c, status.f515c) && C0914h.m1402a(this.f516d, status.f516d) && C0914h.m1402a(this.f517e, status.f517e);
    }

    @VisibleForTesting
    /* renamed from: f0 */
    public boolean mo11811f0() {
        return this.f516d != null;
    }

    @CheckReturnValue
    /* renamed from: g0 */
    public boolean mo11812g0() {
        return this.f514b <= 0;
    }

    /* renamed from: h0 */
    public void mo11813h0(@NonNull Activity activity, int i) {
        if (mo11811f0()) {
            PendingIntent pendingIntent = this.f516d;
            C0917i.m1419j(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public int hashCode() {
        return C0914h.m1403b(Integer.valueOf(this.f513a), Integer.valueOf(this.f514b), this.f515c, this.f516d, this.f517e);
    }

    @NonNull
    /* renamed from: k0 */
    public final String mo11815k0() {
        String str = this.f515c;
        return str != null ? str : C0732b.m672a(this.f514b);
    }

    @NonNull
    public String toString() {
        C0914h.C0915a c = C0914h.m1404c(this);
        c.mo12279a("statusCode", mo11815k0());
        c.mo12279a("resolution", this.f516d);
        return c.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, mo11808c0());
        C3897a.m11122r(parcel, 2, mo11809d0(), false);
        C3897a.m11121q(parcel, 3, this.f516d, i, false);
        C3897a.m11121q(parcel, 4, mo11806V(), i, false);
        C3897a.m11116l(parcel, 1000, this.f513a);
        C3897a.m11106b(parcel, a);
    }
}
