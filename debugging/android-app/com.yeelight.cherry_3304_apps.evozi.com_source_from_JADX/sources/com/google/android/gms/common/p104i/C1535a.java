package com.google.android.gms.common.p104i;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
/* renamed from: com.google.android.gms.common.i.a */
public class C1535a {

    /* renamed from: a */
    private static C1536a f2907a;

    /* renamed from: com.google.android.gms.common.i.a$a */
    public interface C1536a {
        @KeepForSdk
        /* renamed from: a */
        ScheduledExecutorService mo11096a();
    }

    @KeepForSdk
    /* renamed from: a */
    public static synchronized C1536a m4167a() {
        C1536a aVar;
        synchronized (C1535a.class) {
            if (f2907a == null) {
                f2907a = new C1537b();
            }
            aVar = f2907a;
        }
        return aVar;
    }
}
