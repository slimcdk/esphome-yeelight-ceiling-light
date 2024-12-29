package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.miot.api.Constants;

@SafeParcelable.Class(creator = "ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C1621k();
    public static final int DEVELOPER_ERROR = 10;
    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
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
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2534a;
    @SafeParcelable.Field(getter = "getErrorCode", mo11280id = 2)

    /* renamed from: b */
    private final int f2535b;
    @SafeParcelable.Field(getter = "getResolution", mo11280id = 3)

    /* renamed from: c */
    private final PendingIntent f2536c;
    @SafeParcelable.Field(getter = "getErrorMessage", mo11280id = 4)

    /* renamed from: d */
    private final String f2537d;

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    @SafeParcelable.Constructor
    ConnectionResult(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) int i2, @SafeParcelable.Param(mo11283id = 3) PendingIntent pendingIntent, @SafeParcelable.Param(mo11283id = 4) String str) {
        this.f2534a = i;
        this.f2535b = i2;
        this.f2536c = pendingIntent;
        this.f2537d = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: W */
    static String m3599W(int i) {
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
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: Q */
    public final int mo10745Q() {
        return this.f2535b;
    }

    @Nullable
    /* renamed from: R */
    public final String mo10746R() {
        return this.f2537d;
    }

    @Nullable
    /* renamed from: S */
    public final PendingIntent mo10747S() {
        return this.f2536c;
    }

    /* renamed from: T */
    public final boolean mo10748T() {
        return (this.f2535b == 0 || this.f2536c == null) ? false : true;
    }

    /* renamed from: V */
    public final boolean mo10749V() {
        return this.f2535b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f2535b == connectionResult.f2535b && C1599s.m4388a(this.f2536c, connectionResult.f2536c) && C1599s.m4388a(this.f2537d, connectionResult.f2537d);
    }

    public final int hashCode() {
        return C1599s.m4389b(Integer.valueOf(this.f2535b), this.f2536c, this.f2537d);
    }

    public final String toString() {
        C1599s.C1600a c = C1599s.m4390c(this);
        c.mo11272a("statusCode", m3599W(this.f2535b));
        c.mo11272a("resolution", this.f2536c);
        c.mo11272a(Constants.EXTRA_PUSH_MESSAGE, this.f2537d);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2534a);
        C1604b.m4446l(parcel, 2, mo10745Q());
        C1604b.m4451q(parcel, 3, mo10747S(), i, false);
        C1604b.m4452r(parcel, 4, mo10746R(), false);
        C1604b.m4436b(parcel, a);
    }
}
