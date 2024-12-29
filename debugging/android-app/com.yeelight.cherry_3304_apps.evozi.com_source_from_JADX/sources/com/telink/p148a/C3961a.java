package com.telink.p148a;

import android.util.Log;

/* renamed from: com.telink.a.a */
public class C3961a {

    /* renamed from: a */
    public static boolean f6724a = true;

    /* renamed from: a */
    public static int m10647a(String str) {
        if (f6724a) {
            return Log.d("TelinkBluetoothSDK", str);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m10648b(String str) {
        if (f6724a) {
            return Log.w("TelinkBluetoothSDK", str);
        }
        return 0;
    }
}
