package com.xiaomi.push;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.io.File;

/* renamed from: com.xiaomi.push.aa */
public class C4490aa {
    /* renamed from: a */
    public static long m13251a() {
        File externalStorageDirectory;
        if (!m13253b() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !TextUtils.isEmpty(externalStorageDirectory.getPath())) {
            try {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m13252a() {
        try {
            return Environment.getExternalStorageState().equals("removed");
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m13253b() {
        try {
            return true ^ Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m13254c() {
        return m13251a() <= 102400;
    }

    /* renamed from: d */
    public static boolean m13255d() {
        return !m13253b() && !m13254c() && !m13251a();
    }
}
