package p083q;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;

@Module
/* renamed from: q.b */
public abstract class C3605b {
    @Provides
    @WallTime
    /* renamed from: a */
    static C3604a m10256a() {
        return new C3611f();
    }

    @Provides
    @Monotonic
    /* renamed from: b */
    static C3604a m10257b() {
        return new C3610e();
    }
}
