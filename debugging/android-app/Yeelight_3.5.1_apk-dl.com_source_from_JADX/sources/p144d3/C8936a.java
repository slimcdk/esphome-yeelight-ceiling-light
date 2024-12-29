package p144d3;

import android.util.Log;

/* renamed from: d3.a */
public class C8936a {

    /* renamed from: a */
    public static boolean f16430a = true;

    /* renamed from: a */
    public static int m21301a(String str) {
        if (f16430a) {
            return Log.d("TelinkBluetoothSDK", str);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m21302b(String str) {
        if (f16430a) {
            return Log.w("TelinkBluetoothSDK", str);
        }
        return 0;
    }
}
