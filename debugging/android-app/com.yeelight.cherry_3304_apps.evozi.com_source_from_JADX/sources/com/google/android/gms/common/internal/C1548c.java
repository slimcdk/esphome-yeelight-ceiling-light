package com.google.android.gms.common.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.c */
public final class C1548c {
    @KeepForSdk
    /* renamed from: a */
    public static void m4202a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("checkMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS NOT the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            sb.toString();
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m4203b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
            sb.append("checkNotMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            sb.toString();
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m4204c(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m4205d(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }
}
