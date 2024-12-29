package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p065m0.C3334b;
import p065m0.C3336d;
import p065m0.C3337e;
import p065m0.C3338f;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.t */
final class C1891t<TResult, TContinuationResult> implements C3337e<TContinuationResult>, C3336d, C3334b, C1892u {

    /* renamed from: a */
    private final Executor f2948a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3338f f2949b;

    /* renamed from: c */
    private final C1896y f2950c;

    public C1891t(@NonNull Executor executor, @NonNull C3338f fVar, @NonNull C1896y yVar) {
        this.f2948a = executor;
        this.f2949b = fVar;
        this.f2950c = yVar;
    }

    /* renamed from: a */
    public final void mo14741a(TContinuationResult tcontinuationresult) {
        this.f2950c.mo14775r(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo14747b(@NonNull C3339g gVar) {
        this.f2948a.execute(new C1890s(this, gVar));
    }

    /* renamed from: c */
    public final void mo14743c() {
        this.f2950c.mo14776s();
    }

    /* renamed from: d */
    public final void mo14744d(@NonNull Exception exc) {
        this.f2950c.mo14774q(exc);
    }
}
