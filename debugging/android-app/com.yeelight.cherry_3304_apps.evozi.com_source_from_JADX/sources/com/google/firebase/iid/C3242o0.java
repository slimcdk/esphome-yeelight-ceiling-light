package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.iid.o0 */
final /* synthetic */ class C3242o0 implements Callable {

    /* renamed from: a */
    private final Context f6270a;

    /* renamed from: b */
    private final Intent f6271b;

    C3242o0(Context context, Intent intent) {
        this.f6270a = context;
        this.f6271b = intent;
    }

    public final Object call() {
        return Integer.valueOf(C3261y.m10123b().mo17869a(this.f6270a, this.f6271b));
    }
}
