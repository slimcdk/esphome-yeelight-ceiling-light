package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.C4561bp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.m */
public class C4970m {

    /* renamed from: a */
    private static final Map<String, Long> f9694a = new HashMap();

    /* renamed from: a */
    private static void m15579a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f9694a;
        ArrayList<String> arrayList = new ArrayList<>(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (elapsedRealtime - ((Long) next.getValue()).longValue() > 60000) {
                arrayList.add(next.getKey());
            }
        }
        for (String remove : arrayList) {
            f9694a.remove(remove);
        }
    }

    /* renamed from: a */
    public static boolean m15580a(byte[] bArr, String str) {
        boolean z = false;
        if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            String a = C4561bp.m13046a(bArr);
            if (!TextUtils.isEmpty(a)) {
                Map<String, Long> map = f9694a;
                synchronized (map) {
                    if (map.get(a + str) != null) {
                        z = true;
                    } else {
                        map.put(a + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    m15579a();
                }
            }
        }
        return z;
    }
}
