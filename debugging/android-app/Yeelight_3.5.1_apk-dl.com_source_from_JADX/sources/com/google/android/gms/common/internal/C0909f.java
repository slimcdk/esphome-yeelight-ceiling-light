package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.Executor;
import p109w.C3839f0;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.f */
public abstract class C0909f {

    /* renamed from: a */
    private static int f1025a = 4225;

    /* renamed from: b */
    private static final Object f1026b = new Object();
    @Nullable

    /* renamed from: c */
    private static C0913g0 f1027c = null;
    @Nullable
    @VisibleForTesting

    /* renamed from: d */
    static HandlerThread f1028d = null;

    /* renamed from: e */
    private static boolean f1029e = false;

    @KeepForSdk
    /* renamed from: a */
    public static int m1387a() {
        return f1025a;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static C0909f m1388b(@NonNull Context context) {
        synchronized (f1026b) {
            if (f1027c == null) {
                f1027c = new C0913g0(context.getApplicationContext(), f1029e ? m1389c().getLooper() : context.getMainLooper());
            }
        }
        return f1027c;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static HandlerThread m1389c() {
        synchronized (f1026b) {
            HandlerThread handlerThread = f1028d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f1028d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f1028d;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo12274d(C3839f0 f0Var, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void mo12275e(@NonNull String str, @NonNull String str2, int i, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z) {
        mo12274d(new C3839f0(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo12276f(C3839f0 f0Var, ServiceConnection serviceConnection, String str, @Nullable Executor executor);
}
