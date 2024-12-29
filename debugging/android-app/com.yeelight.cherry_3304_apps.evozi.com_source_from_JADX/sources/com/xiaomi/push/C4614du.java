package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.service.C4854ak;

/* renamed from: com.xiaomi.push.du */
public class C4614du {
    /* renamed from: a */
    private static void m13761a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    /* renamed from: a */
    public static boolean m13762a(Context context, String str, long j) {
        return C4854ak.m15568a(context).mo25911a(C4744hr.DCJobMutualSwitch.mo25291a(), false) && !C4496ag.m13265a(context, str, j);
    }

    /* renamed from: a */
    public static byte[] m13763a(String str, byte[] bArr) {
        byte[] a = C4529bc.m13418a(str);
        try {
            m13761a(a);
            return C4722h.m14492a(a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m13764b(String str, byte[] bArr) {
        byte[] a = C4529bc.m13418a(str);
        try {
            m13761a(a);
            return C4722h.m14493b(a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
