package com.xiaomi.push;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.io.File;

/* renamed from: com.xiaomi.push.ad */
public class C4508ad {
    /* renamed from: a */
    public static long m12838a() {
        File externalStorageDirectory;
        if (!m12840b() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !TextUtils.isEmpty(externalStorageDirectory.getPath())) {
            try {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m12839a() {
        try {
            return Environment.getExternalStorageState().equals("removed");
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m12840b() {
        try {
            return true ^ Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("check SDCard is busy: ");
            sb.append(e);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m12841c() {
        return m12838a() <= 102400;
    }

    /* renamed from: d */
    public static boolean m12842d() {
        return !m12840b() && !m12841c() && !m12838a();
    }
}
