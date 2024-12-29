package com.google.android.gms.wearable;

import com.google.android.gms.common.api.C1395d;
import com.miot.common.ReturnCode;

/* renamed from: com.google.android.gms.wearable.p */
public final class C2530p extends C1395d {
    /* renamed from: a */
    public static String m8134a(int i) {
        switch (i) {
            case 4000:
                return "TARGET_NODE_NOT_CONNECTED";
            case ReturnCode.E_ACCOUNT_LOGIN /*4001*/:
                return "DUPLICATE_LISTENER";
            case ReturnCode.E_ACCOUNT_LOGOUT /*4002*/:
                return "UNKNOWN_LISTENER";
            case ReturnCode.E_ACCOUNT_EXPIRED /*4003*/:
                return "DATA_ITEM_TOO_LARGE";
            case ReturnCode.E_ACCOUNT_NOT_LOGIN /*4004*/:
                return "INVALID_TARGET_NODE";
            case ReturnCode.E_ACCOUNT_TIMEDIFF /*4005*/:
                return "ASSET_UNAVAILABLE";
            default:
                return C1395d.m3645a(i);
        }
    }
}
