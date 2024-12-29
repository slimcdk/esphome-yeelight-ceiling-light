package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import dagger.internal.C10742b;
import java.util.concurrent.Executor;
import javax.inject.C11584a;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p026v.C0553b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
public final class C1352r implements C10742b<C1351q> {

    /* renamed from: a */
    private final C11584a<Executor> f2485a;

    /* renamed from: b */
    private final C11584a<C0519c> f2486b;

    /* renamed from: c */
    private final C11584a<C1353s> f2487c;

    /* renamed from: d */
    private final C11584a<C0553b> f2488d;

    public C1352r(C11584a<Executor> aVar, C11584a<C0519c> aVar2, C11584a<C1353s> aVar3, C11584a<C0553b> aVar4) {
        this.f2485a = aVar;
        this.f2486b = aVar2;
        this.f2487c = aVar3;
        this.f2488d = aVar4;
    }

    /* renamed from: a */
    public static C1352r m3554a(C11584a<Executor> aVar, C11584a<C0519c> aVar2, C11584a<C1353s> aVar3, C11584a<C0553b> aVar4) {
        return new C1352r(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: b */
    public C1351q get() {
        return new C1351q(this.f2485a.get(), this.f2486b.get(), this.f2487c.get(), this.f2488d.get());
    }
}
