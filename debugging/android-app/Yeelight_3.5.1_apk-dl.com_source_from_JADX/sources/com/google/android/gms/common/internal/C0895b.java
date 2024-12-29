package com.google.android.gms.common.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.b */
public final class C0895b {
    @KeepForSdk
    /* renamed from: a */
    public static void m1287a(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder();
            sb.append("checkMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS NOT the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m1288b(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder();
            sb.append("checkNotMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    @EnsuresNonNull({"#1"})
    /* renamed from: c */
    public static void m1289c(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @KeepForSdk
    @EnsuresNonNull({"#1"})
    /* renamed from: d */
    public static void m1290d(@Nullable Object obj, @NonNull Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }
}
