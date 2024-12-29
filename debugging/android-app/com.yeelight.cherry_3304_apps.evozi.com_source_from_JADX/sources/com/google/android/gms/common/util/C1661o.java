package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.o */
public class C1661o {

    /* renamed from: a */
    private static String f3177a;

    /* renamed from: b */
    private static int f3178b;

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public static String m4611a() {
        if (f3177a == null) {
            if (f3178b == 0) {
                f3178b = Process.myPid();
            }
            f3177a = m4612b(f3178b);
        }
        return f3177a;
    }

    @Nullable
    /* renamed from: b */
    private static String m4612b(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = m4613c(sb.toString());
            try {
                str = bufferedReader.readLine().trim();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                th = th2;
                C1657k.m4598a(bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            C1657k.m4598a(bufferedReader);
            throw th;
        }
        C1657k.m4598a(bufferedReader);
        return str;
    }

    /* renamed from: c */
    private static BufferedReader m4613c(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
