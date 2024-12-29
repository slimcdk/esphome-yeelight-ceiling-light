package p069n0;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0732b;
import com.miot.common.ReturnCode;

/* renamed from: n0.p */
public final class C3371p extends C0732b {
    @RecentlyNonNull
    /* renamed from: a */
    public static String m9212a(int i) {
        switch (i) {
            case 4000:
                return "TARGET_NODE_NOT_CONNECTED";
            case ReturnCode.E_ACCOUNT_LOGIN:
                return "DUPLICATE_LISTENER";
            case ReturnCode.E_ACCOUNT_LOGOUT:
                return "UNKNOWN_LISTENER";
            case ReturnCode.E_ACCOUNT_EXPIRED:
                return "DATA_ITEM_TOO_LARGE";
            case ReturnCode.E_ACCOUNT_NOT_LOGIN:
                return "INVALID_TARGET_NODE";
            case ReturnCode.E_ACCOUNT_TIMEDIFF:
                return "ASSET_UNAVAILABLE";
            case 4006:
                return "DUPLICATE_CAPABILITY";
            case 4007:
                return "UNKNOWN_CAPABILITY";
            case 4008:
                return "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
            case 4009:
                return "UNSUPPORTED_BY_TARGET";
            case 4010:
                return "ACCOUNT_KEY_CREATION_FAILED";
            default:
                return C0732b.m672a(i);
        }
    }
}
