package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.miot.api.Constants;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C0886g();
    public static final int DEVELOPER_ERROR = 10;
    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    @ShowFirstParty
    @NonNull
    @KeepForSdk
    public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult(0);
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    @KeepForSdk
    public static final int UNKNOWN = -1;
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f497a;
    @SafeParcelable.Field(getter = "getErrorCode", mo12312id = 2)

    /* renamed from: b */
    private final int f498b;
    @SafeParcelable.Field(getter = "getResolution", mo12312id = 3)
    @Nullable

    /* renamed from: c */
    private final PendingIntent f499c;
    @SafeParcelable.Field(getter = "getErrorMessage", mo12312id = 4)
    @Nullable

    /* renamed from: d */
    private final String f500d;

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    @SafeParcelable.Constructor
    ConnectionResult(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) int i2, @SafeParcelable.Param(mo12315id = 3) @Nullable PendingIntent pendingIntent, @SafeParcelable.Param(mo12315id = 4) @Nullable String str) {
        this.f497a = i;
        this.f498b = i2;
        this.f499c = pendingIntent;
        this.f500d = str;
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this(1, i, pendingIntent, str);
    }

    @NonNull
    /* renamed from: g0 */
    static String m609g0(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    /* renamed from: V */
    public int mo11751V() {
        return this.f498b;
    }

    @Nullable
    /* renamed from: W */
    public String mo11752W() {
        return this.f500d;
    }

    @Nullable
    /* renamed from: c0 */
    public PendingIntent mo11753c0() {
        return this.f499c;
    }

    /* renamed from: d0 */
    public boolean mo11754d0() {
        return (this.f498b == 0 || this.f499c == null) ? false : true;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f498b == connectionResult.f498b && C0914h.m1402a(this.f499c, connectionResult.f499c) && C0914h.m1402a(this.f500d, connectionResult.f500d);
    }

    /* renamed from: f0 */
    public boolean mo11756f0() {
        return this.f498b == 0;
    }

    public int hashCode() {
        return C0914h.m1403b(Integer.valueOf(this.f498b), this.f499c, this.f500d);
    }

    @NonNull
    public String toString() {
        C0914h.C0915a c = C0914h.m1404c(this);
        c.mo12279a("statusCode", m609g0(this.f498b));
        c.mo12279a("resolution", this.f499c);
        c.mo12279a(Constants.EXTRA_PUSH_MESSAGE, this.f500d);
        return c.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f497a);
        C3897a.m11116l(parcel, 2, mo11751V());
        C3897a.m11121q(parcel, 3, mo11753c0(), i, false);
        C3897a.m11122r(parcel, 4, mo11752W(), false);
        C3897a.m11106b(parcel, a);
    }
}
