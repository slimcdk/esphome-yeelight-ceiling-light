package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.C4532bf;

/* renamed from: com.xiaomi.push.service.an */
public class C4858an {

    /* renamed from: a */
    private static long f9973a = 0;

    /* renamed from: a */
    private static String f9974a = "";

    /* renamed from: a */
    public static String m15586a() {
        if (TextUtils.isEmpty(f9974a)) {
            f9974a = C4532bf.m13430a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f9974a);
        long j = f9973a;
        f9973a = 1 + j;
        sb.append(j);
        return sb.toString();
    }
}
