package p064m;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Monotonic;
import p068n.C3348a;
import p068n.C3349c;
import p068n.C3354v;
import p075o.C3388d;
import p083q.C3604a;

@Module
/* renamed from: m.h */
public abstract class C3331h {
    @Provides
    /* renamed from: a */
    static C3354v m9068a(Context context, C3388d dVar, SchedulerConfig schedulerConfig, @Monotonic C3604a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new C3349c(context, dVar, schedulerConfig) : new C3348a(context, dVar, aVar, schedulerConfig);
    }
}
