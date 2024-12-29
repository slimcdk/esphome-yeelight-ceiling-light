package com.xiaomi.push;

import android.os.Build;
import android.system.Os;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.io.File;

/* renamed from: com.xiaomi.push.ch */
public class C4568ch {
    /* renamed from: a */
    public static long m13584a(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0;
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return 0;
        }
    }
}
