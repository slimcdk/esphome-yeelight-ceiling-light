package com.google.android.gms.common.util.p106s;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;
import p011c.p012a.p019b.p028b.p032c.p034b.C0574d;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.s.a */
public class C1665a implements Executor {

    /* renamed from: a */
    private final Handler f3183a;

    @KeepForSdk
    public C1665a(Looper looper) {
        this.f3183a = new C0574d(looper);
    }

    public void execute(@NonNull Runnable runnable) {
        this.f3183a.post(runnable);
    }
}
