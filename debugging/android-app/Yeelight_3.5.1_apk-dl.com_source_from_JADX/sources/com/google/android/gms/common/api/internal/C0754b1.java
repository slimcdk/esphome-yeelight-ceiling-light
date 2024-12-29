package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.b1 */
public final /* synthetic */ class C0754b1 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f583a;

    public /* synthetic */ C0754b1(Handler handler) {
        this.f583a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f583a.post(runnable);
    }
}
