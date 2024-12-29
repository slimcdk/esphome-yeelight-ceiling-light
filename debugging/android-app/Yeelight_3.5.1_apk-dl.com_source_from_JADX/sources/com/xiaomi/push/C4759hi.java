package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.C4937ca;
import com.xiaomi.push.service.C4985u;

/* renamed from: com.xiaomi.push.hi */
public class C4759hi {
    /* renamed from: a */
    public static boolean m14179a(Context context) {
        return !C4937ca.f9650a.isEmpty() && C4551bj.m13003e(context) && C4805j.m14870b(context);
    }

    /* renamed from: a */
    public static boolean m14180a(Context context, int i) {
        if (context != null && i > 0) {
            String a = C4985u.m15674a(context);
            if (!TextUtils.isEmpty(a)) {
                for (int i2 = 1; i2 <= i; i2++) {
                    if (C4716g.m13987a(10) == C4995w.m15744a(a.substring(a.length() - 1, a.length()), -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
