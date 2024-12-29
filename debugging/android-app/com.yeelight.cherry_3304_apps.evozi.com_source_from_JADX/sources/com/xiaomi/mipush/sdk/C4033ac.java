package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4753i;
import com.xiaomi.push.C4808l;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.ac */
class C4033ac {
    /* renamed from: a */
    public static HashMap<String, String> m10794a(Context context, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put("appToken", C4056b.m10888a(context).mo22937b());
            hashMap.put("regId", MiPushClient.getRegId(context));
            hashMap.put("appId", C4056b.m10888a(context).mo22930a());
            hashMap.put("regResource", C4056b.m10888a(context).mo22942e());
            if (!C4808l.m15366d()) {
                String g = C4753i.m14761g(context);
                if (!TextUtils.isEmpty(g)) {
                    hashMap.put("imeiMd5", C4532bf.m13431a(g));
                }
            }
            hashMap.put("isMIUI", String.valueOf(C4808l.m15356a()));
            hashMap.put("miuiVersion", C4808l.m15356a());
            hashMap.put("devId", C4753i.m14741a(context, true));
            hashMap.put("model", Build.MODEL);
            hashMap.put("pkgName", context.getPackageName());
            hashMap.put("sdkVersion", "3_7_5");
            hashMap.put("androidVersion", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("os", Build.VERSION.RELEASE + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.VERSION.INCREMENTAL);
            hashMap.put("andId", C4753i.m14759e(context));
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("clientInterfaceId", str);
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }
}
