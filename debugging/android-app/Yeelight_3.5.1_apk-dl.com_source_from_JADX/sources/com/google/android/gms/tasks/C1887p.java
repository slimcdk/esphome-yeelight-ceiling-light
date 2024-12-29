package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p065m0.C3336d;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.p */
final class C1887p implements C1892u {

    /* renamed from: a */
    private final Executor f2938a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f2939b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C3336d f2940c;

    public C1887p(@NonNull Executor executor, @NonNull C3336d dVar) {
        this.f2938a = executor;
        this.f2940c = dVar;
    }

    /* renamed from: b */
    public final void mo14747b(@NonNull C3339g gVar) {
        if (!gVar.mo14771n() && !gVar.mo14769l()) {
            synchronized (this.f2939b) {
                if (this.f2940c != null) {
                    this.f2938a.execute(new C1886o(this, gVar));
                }
            }
        }
    }
}
