package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1609u;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
final class C2395z4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f4752a;

    /* renamed from: b */
    private final /* synthetic */ C2373x4 f4753b;

    public C2395z4(C2373x4 x4Var, String str) {
        this.f4753b = x4Var;
        C1609u.m4475k(str);
        this.f4752a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f4753b.mo12427b().mo13096F().mo13131b(this.f4752a, th);
    }
}
