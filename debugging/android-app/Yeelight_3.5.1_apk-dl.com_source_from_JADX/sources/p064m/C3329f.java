package p064m;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.WallTime;
import p083q.C3604a;

@Module
/* renamed from: m.f */
public abstract class C3329f {
    @Provides
    /* renamed from: a */
    static SchedulerConfig m9064a(@WallTime C3604a aVar) {
        return SchedulerConfig.m551f(aVar);
    }
}
