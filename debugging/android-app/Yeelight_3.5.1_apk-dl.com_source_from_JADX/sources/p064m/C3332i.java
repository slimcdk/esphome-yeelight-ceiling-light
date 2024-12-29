package p064m;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import com.google.android.datatransport.runtime.dagger.internal.C0691d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p068n.C3354v;
import p075o.C3388d;
import p083q.C3604a;
import p191o4.C9779a;

/* renamed from: m.i */
public final class C3332i implements C0689b<C3354v> {

    /* renamed from: a */
    private final C9779a<Context> f5428a;

    /* renamed from: b */
    private final C9779a<C3388d> f5429b;

    /* renamed from: c */
    private final C9779a<SchedulerConfig> f5430c;

    /* renamed from: d */
    private final C9779a<C3604a> f5431d;

    public C3332i(C9779a<Context> aVar, C9779a<C3388d> aVar2, C9779a<SchedulerConfig> aVar3, C9779a<C3604a> aVar4) {
        this.f5428a = aVar;
        this.f5429b = aVar2;
        this.f5430c = aVar3;
        this.f5431d = aVar4;
    }

    /* renamed from: a */
    public static C3332i m9069a(C9779a<Context> aVar, C9779a<C3388d> aVar2, C9779a<SchedulerConfig> aVar3, C9779a<C3604a> aVar4) {
        return new C3332i(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C3354v m9070c(Context context, C3388d dVar, SchedulerConfig schedulerConfig, C3604a aVar) {
        return (C3354v) C0691d.m537c(C3331h.m9068a(context, dVar, schedulerConfig, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C3354v get() {
        return m9070c(this.f5428a.get(), this.f5429b.get(), this.f5430c.get(), this.f5431d.get());
    }
}
