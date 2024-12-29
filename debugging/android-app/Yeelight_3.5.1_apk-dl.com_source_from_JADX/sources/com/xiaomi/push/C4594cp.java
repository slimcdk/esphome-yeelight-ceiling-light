package com.xiaomi.push;

import android.os.Build;
import android.system.Os;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.io.File;

/* renamed from: com.xiaomi.push.cp */
public class C4594cp {
    /* renamed from: a */
    public static long m13186a(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0;
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            return 0;
        }
    }
}
