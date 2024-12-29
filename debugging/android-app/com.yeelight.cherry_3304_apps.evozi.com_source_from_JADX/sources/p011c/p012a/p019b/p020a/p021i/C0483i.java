package p011c.p012a.p019b.p020a.p021i;

import dagger.Module;
import dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

@Module
/* renamed from: c.a.b.a.i.i */
abstract class C0483i {
    @Singleton
    @Provides
    /* renamed from: a */
    static Executor m114a() {
        return Executors.newSingleThreadExecutor();
    }
}
