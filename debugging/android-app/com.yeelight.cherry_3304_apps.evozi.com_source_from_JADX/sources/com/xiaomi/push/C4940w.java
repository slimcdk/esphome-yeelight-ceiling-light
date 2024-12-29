package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* renamed from: com.xiaomi.push.w */
final class C4940w extends C4939v {

    /* renamed from: a */
    final /* synthetic */ Runnable f10217a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4940w(Context context, File file, Runnable runnable) {
        super(context, file, (C4940w) null);
        this.f10217a = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26007a(Context context) {
        Runnable runnable = this.f10217a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
