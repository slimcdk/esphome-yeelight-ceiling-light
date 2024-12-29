package com.google.android.datatransport.runtime.time;

import dagger.Module;
import dagger.Provides;

@Module
/* renamed from: com.google.android.datatransport.runtime.time.b */
public abstract class C1355b {
    @WallTime
    @Provides
    /* renamed from: a */
    static C1354a m3558a() {
        return new C1359f();
    }

    @Monotonic
    @Provides
    /* renamed from: b */
    static C1354a m3559b() {
        return new C1358e();
    }
}
