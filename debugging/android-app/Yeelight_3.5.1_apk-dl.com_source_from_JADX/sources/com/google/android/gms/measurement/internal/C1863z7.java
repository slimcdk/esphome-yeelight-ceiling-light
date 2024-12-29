package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
public final class C1863z7 {
    /* renamed from: a */
    public static String m4907a(String str, String[] strArr, String[] strArr2) {
        C0917i.m1419j(strArr);
        C0917i.m1419j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m4908b(Context context, String str, String str2) {
        C0917i.m1419j(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C1627g5.m4241a(context);
        }
        return C1627g5.m4242b("google_app_id", resources, str2);
    }
}
