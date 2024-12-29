package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C1316e;
import com.google.android.datatransport.runtime.time.C1354a;
import dagger.internal.C10742b;
import java.util.concurrent.Executor;
import javax.inject.C11584a;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p026v.C0553b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.n */
public final class C1348n implements C10742b<C1347m> {

    /* renamed from: a */
    private final C11584a<Context> f2472a;

    /* renamed from: b */
    private final C11584a<C1316e> f2473b;

    /* renamed from: c */
    private final C11584a<C0519c> f2474c;

    /* renamed from: d */
    private final C11584a<C1353s> f2475d;

    /* renamed from: e */
    private final C11584a<Executor> f2476e;

    /* renamed from: f */
    private final C11584a<C0553b> f2477f;

    /* renamed from: g */
    private final C11584a<C1354a> f2478g;

    public C1348n(C11584a<Context> aVar, C11584a<C1316e> aVar2, C11584a<C0519c> aVar3, C11584a<C1353s> aVar4, C11584a<Executor> aVar5, C11584a<C0553b> aVar6, C11584a<C1354a> aVar7) {
        this.f2472a = aVar;
        this.f2473b = aVar2;
        this.f2474c = aVar3;
        this.f2475d = aVar4;
        this.f2476e = aVar5;
        this.f2477f = aVar6;
        this.f2478g = aVar7;
    }

    /* renamed from: a */
    public static C1348n m3546a(C11584a<Context> aVar, C11584a<C1316e> aVar2, C11584a<C0519c> aVar3, C11584a<C1353s> aVar4, C11584a<Executor> aVar5, C11584a<C0553b> aVar6, C11584a<C1354a> aVar7) {
        return new C1348n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* renamed from: b */
    public C1347m get() {
        return new C1347m(this.f2472a.get(), this.f2473b.get(), this.f2474c.get(), this.f2475d.get(), this.f2476e.get(), this.f2477f.get(), this.f2478g.get());
    }
}
