package com.google.firebase.crashlytics.p110c.p112g;

import android.os.Process;

/* renamed from: com.google.firebase.crashlytics.c.g.d */
public abstract class C2876d implements Runnable {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo17164b();

    public final void run() {
        Process.setThreadPriority(10);
        mo17164b();
    }
}
