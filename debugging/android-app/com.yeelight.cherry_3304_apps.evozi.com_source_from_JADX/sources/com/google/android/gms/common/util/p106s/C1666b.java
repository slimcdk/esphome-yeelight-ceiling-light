package com.google.android.gms.common.util.p106s;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.s.b */
public class C1666b implements ThreadFactory {

    /* renamed from: a */
    private final String f3184a;

    /* renamed from: b */
    private final ThreadFactory f3185b;

    @KeepForSdk
    public C1666b(String str) {
        this(str, 0);
    }

    private C1666b(String str, int i) {
        this.f3185b = Executors.defaultThreadFactory();
        C1609u.m4476l(str, "Name must not be null");
        this.f3184a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f3185b.newThread(new C1668d(runnable, 0));
        newThread.setName(this.f3184a);
        return newThread;
    }
}
