package p064m;

import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import com.google.android.datatransport.runtime.dagger.internal.C0691d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p083q.C3604a;
import p191o4.C9779a;

/* renamed from: m.g */
public final class C3330g implements C0689b<SchedulerConfig> {

    /* renamed from: a */
    private final C9779a<C3604a> f5427a;

    public C3330g(C9779a<C3604a> aVar) {
        this.f5427a = aVar;
    }

    /* renamed from: a */
    public static SchedulerConfig m9065a(C3604a aVar) {
        return (SchedulerConfig) C0691d.m537c(C3329f.m9064a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C3330g m9066b(C9779a<C3604a> aVar) {
        return new C3330g(aVar);
    }

    /* renamed from: c */
    public SchedulerConfig get() {
        return m9065a(this.f5427a.get());
    }
}
