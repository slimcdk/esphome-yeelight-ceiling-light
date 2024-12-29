package com.inuker.bluetooth.library.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class BluetoothLog {
    private static final String LOG_TAG = "miio-bluetooth";

    /* renamed from: d */
    public static void m7328d(String str) {
    }

    /* renamed from: e */
    public static void m7329e(String str) {
    }

    /* renamed from: e */
    public static void m7330e(Throwable th) {
        m7329e(getThrowableString(th));
    }

    private static String getThrowableString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        while (th != null) {
            th.printStackTrace(printWriter);
            th = th.getCause();
        }
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    /* renamed from: i */
    public static void m7331i(String str) {
    }

    /* renamed from: v */
    public static void m7332v(String str) {
    }

    /* renamed from: w */
    public static void m7333w(String str) {
    }

    /* renamed from: w */
    public static void m7334w(Throwable th) {
        m7333w(getThrowableString(th));
    }
}
