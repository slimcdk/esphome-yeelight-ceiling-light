package com.yeelight.cherry;

import java.lang.Thread;

/* renamed from: com.yeelight.cherry.a */
/* compiled from: lambda */
public final /* synthetic */ class C4188a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ YeelightApplication f7212a;

    public /* synthetic */ C4188a(YeelightApplication yeelightApplication) {
        this.f7212a = yeelightApplication;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.f7212a.mo23283k(thread, th);
    }
}
