package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

@KeepForSdk
/* renamed from: com.google.android.gms.common.stats.c */
public class C1642c {
    @KeepForSdk
    /* renamed from: a */
    public static String m4555a(PowerManager.WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Nullable
    /* renamed from: b */
    static List<String> m4556b(@Nullable List<String> list) {
        if (list == null || list.size() != 1 || !"com.google.android.gms".equals(list.get(0))) {
            return list;
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    static String m4557c(String str) {
        if ("com.google.android.gms".equals(str)) {
            return null;
        }
        return str;
    }
}
