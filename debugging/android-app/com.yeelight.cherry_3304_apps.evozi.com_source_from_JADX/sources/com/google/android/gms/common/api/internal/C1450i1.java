package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p106s.C1667c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.i1 */
public final class C1450i1 {

    /* renamed from: a */
    private static final ExecutorService f2704a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1667c("GAC_Transform"));

    /* renamed from: a */
    public static ExecutorService m3876a() {
        return f2704a;
    }
}
