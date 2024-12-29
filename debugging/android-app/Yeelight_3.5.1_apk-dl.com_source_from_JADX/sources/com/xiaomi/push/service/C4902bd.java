package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4561bp;

/* renamed from: com.xiaomi.push.service.bd */
public class C4902bd {

    /* renamed from: a */
    private static long f9521a = 0;

    /* renamed from: a */
    private static String f9522a = "";

    /* renamed from: a */
    public static String m15380a() {
        if (TextUtils.isEmpty(f9522a)) {
            f9522a = C4561bp.m13041a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f9522a);
        long j = f9521a;
        f9521a = 1 + j;
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m15381a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_" + str.substring(8);
        } catch (Exception e) {
            C4408b.m12483d("Exception occurred when filtering registration packet id for log. " + e);
            return "UnexpectedId";
        }
    }

    /* renamed from: b */
    public static String m15382b() {
        return C4561bp.m13041a(32);
    }
}
