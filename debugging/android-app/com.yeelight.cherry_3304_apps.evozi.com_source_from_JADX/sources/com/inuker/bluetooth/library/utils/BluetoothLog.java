package com.inuker.bluetooth.library.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class BluetoothLog {
    private static final String LOG_TAG = "miio-bluetooth";

    /* renamed from: d */
    public static void m10334d(String str) {
    }

    /* renamed from: e */
    public static void m10335e(String str) {
    }

    /* renamed from: e */
    public static void m10336e(Throwable th) {
        m10335e(getThrowableString(th));
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
    public static void m10337i(String str) {
    }

    /* renamed from: v */
    public static void m10338v(String str) {
    }

    /* renamed from: w */
    public static void m10339w(String str) {
    }

    /* renamed from: w */
    public static void m10340w(Throwable th) {
        m10339w(getThrowableString(th));
    }
}
