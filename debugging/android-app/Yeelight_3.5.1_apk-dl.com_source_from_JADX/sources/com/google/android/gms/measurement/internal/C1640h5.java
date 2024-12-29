package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
final class C1640h5 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f2141a;

    /* renamed from: b */
    final /* synthetic */ C1679k5 f2142b;

    public C1640h5(C1679k5 k5Var, String str) {
        this.f2142b = k5Var;
        C0917i.m1419j(str);
        this.f2141a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f2142b.f2143a.mo14228b().mo14035r().mo14694b(this.f2141a, th);
    }
}
