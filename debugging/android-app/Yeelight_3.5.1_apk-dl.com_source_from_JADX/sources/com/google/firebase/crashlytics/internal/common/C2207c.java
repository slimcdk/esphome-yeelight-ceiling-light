package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

/* renamed from: com.google.firebase.crashlytics.internal.common.c */
public abstract class C2207c implements Runnable {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo18530b();

    public final void run() {
        Process.setThreadPriority(10);
        mo18530b();
    }
}
