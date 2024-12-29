package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import com.xiaomi.push.service.C4898ba;

/* renamed from: com.xiaomi.push.dp */
public class C4627dp {
    /* renamed from: a */
    private static void m13332a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    /* renamed from: a */
    public static boolean m13333a(Context context, String str, long j) {
        if (C4898ba.m15362a(context).mo29996a(C4765ho.DCJobMutualSwitch.mo29322a(), false)) {
            return (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !C4514aj.m12852a(context, str, j);
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m13334a(String str, byte[] bArr) {
        byte[] a = C4558bm.m13029a(str);
        try {
            m13332a(a);
            return C4777i.m14412a(a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m13335b(String str, byte[] bArr) {
        byte[] a = C4558bm.m13029a(str);
        try {
            m13332a(a);
            return C4777i.m14413b(a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
