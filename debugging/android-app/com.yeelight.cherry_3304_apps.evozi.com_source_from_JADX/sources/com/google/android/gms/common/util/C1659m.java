package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.m */
public class C1659m {
    @KeepForSdk
    /* renamed from: a */
    public static void m4600a(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            } else {
                z = false;
            }
            String str = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
        }
        sb.append("}");
    }
}
