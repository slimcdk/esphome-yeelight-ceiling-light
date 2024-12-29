package com.google.firebase.iid;

import com.google.android.gms.common.util.p106s.C1666b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.s0 */
final class C3250s0 {

    /* renamed from: a */
    private static final Executor f6285a = C3248r0.f6283a;

    /* renamed from: a */
    static Executor m10106a() {
        return f6285a;
    }

    /* renamed from: b */
    static ExecutorService m10107b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1666b("firebase-iid-executor"));
    }
}
