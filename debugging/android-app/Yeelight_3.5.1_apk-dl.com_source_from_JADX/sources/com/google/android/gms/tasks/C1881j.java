package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p065m0.C3333a;
import p065m0.C3334b;
import p065m0.C3336d;
import p065m0.C3337e;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.j */
final class C1881j<TResult, TContinuationResult> implements C3337e<TContinuationResult>, C3336d, C3334b, C1892u {

    /* renamed from: a */
    private final Executor f2924a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3333a f2925b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1896y f2926c;

    public C1881j(@NonNull Executor executor, @NonNull C3333a aVar, @NonNull C1896y yVar) {
        this.f2924a = executor;
        this.f2925b = aVar;
        this.f2926c = yVar;
    }

    /* renamed from: a */
    public final void mo14741a(TContinuationResult tcontinuationresult) {
        this.f2926c.mo14775r(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo14747b(@NonNull C3339g gVar) {
        this.f2924a.execute(new C1880i(this, gVar));
    }

    /* renamed from: c */
    public final void mo14743c() {
        this.f2926c.mo14776s();
    }

    /* renamed from: d */
    public final void mo14744d(@NonNull Exception exc) {
        this.f2926c.mo14774q(exc);
    }
}
