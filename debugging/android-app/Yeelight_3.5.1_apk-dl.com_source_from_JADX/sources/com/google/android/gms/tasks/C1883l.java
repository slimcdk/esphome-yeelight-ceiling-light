package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p065m0.C3334b;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.l */
final class C1883l implements C1892u {

    /* renamed from: a */
    private final Executor f2928a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f2929b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C3334b f2930c;

    public C1883l(@NonNull Executor executor, @NonNull C3334b bVar) {
        this.f2928a = executor;
        this.f2930c = bVar;
    }

    /* renamed from: b */
    public final void mo14747b(@NonNull C3339g gVar) {
        if (gVar.mo14769l()) {
            synchronized (this.f2929b) {
                if (this.f2930c != null) {
                    this.f2928a.execute(new C1882k(this));
                }
            }
        }
    }
}
