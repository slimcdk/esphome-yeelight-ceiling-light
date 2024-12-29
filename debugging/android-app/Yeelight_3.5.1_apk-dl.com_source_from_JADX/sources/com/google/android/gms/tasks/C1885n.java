package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p065m0.C3335c;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.n */
final class C1885n implements C1892u {

    /* renamed from: a */
    private final Executor f2933a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f2934b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C3335c f2935c;

    public C1885n(@NonNull Executor executor, @NonNull C3335c cVar) {
        this.f2933a = executor;
        this.f2935c = cVar;
    }

    /* renamed from: b */
    public final void mo14747b(@NonNull C3339g gVar) {
        synchronized (this.f2934b) {
            if (this.f2935c != null) {
                this.f2933a.execute(new C1884m(this, gVar));
            }
        }
    }
}
