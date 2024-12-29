package com.google.android.gms.common.util.p106s;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.s.c */
public class C1667c implements ThreadFactory {

    /* renamed from: a */
    private final String f3186a;

    /* renamed from: b */
    private final AtomicInteger f3187b;

    /* renamed from: c */
    private final ThreadFactory f3188c;

    @KeepForSdk
    public C1667c(String str) {
        this(str, 0);
    }

    private C1667c(String str, int i) {
        this.f3187b = new AtomicInteger();
        this.f3188c = Executors.defaultThreadFactory();
        C1609u.m4476l(str, "Name must not be null");
        this.f3186a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f3188c.newThread(new C1668d(runnable, 0));
        String str = this.f3186a;
        int andIncrement = this.f3187b.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
