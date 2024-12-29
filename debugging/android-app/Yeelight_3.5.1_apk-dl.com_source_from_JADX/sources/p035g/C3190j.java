package p035g;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

@Module
/* renamed from: g.j */
abstract class C3190j {
    @Singleton
    @Provides
    /* renamed from: a */
    static Executor m8589a() {
        return new C3194m(Executors.newSingleThreadExecutor());
    }
}
