package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p065m0.C3337e;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.r */
final class C1889r implements C1892u {

    /* renamed from: a */
    private final Executor f2943a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f2944b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C3337e f2945c;

    public C1889r(@NonNull Executor executor, @NonNull C3337e eVar) {
        this.f2943a = executor;
        this.f2945c = eVar;
    }

    /* renamed from: b */
    public final void mo14747b(@NonNull C3339g gVar) {
        if (gVar.mo14771n()) {
            synchronized (this.f2944b) {
                if (this.f2945c != null) {
                    this.f2943a.execute(new C1888q(this, gVar));
                }
            }
        }
    }
}
