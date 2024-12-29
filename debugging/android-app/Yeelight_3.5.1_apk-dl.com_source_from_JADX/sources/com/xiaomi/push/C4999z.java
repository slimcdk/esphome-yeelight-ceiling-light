package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* renamed from: com.xiaomi.push.z */
final class C4999z extends C4998y {

    /* renamed from: a */
    final /* synthetic */ Runnable f9776a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4999z(Context context, File file, Runnable runnable) {
        super(context, file, (C4999z) null);
        this.f9776a = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30097a(Context context) {
        Runnable runnable = this.f9776a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
