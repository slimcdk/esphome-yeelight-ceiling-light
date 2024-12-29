package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p065m0.C3333a;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.h */
final class C1879h implements C1892u {

    /* renamed from: a */
    private final Executor f2919a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3333a f2920b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1896y f2921c;

    public C1879h(@NonNull Executor executor, @NonNull C3333a aVar, @NonNull C1896y yVar) {
        this.f2919a = executor;
        this.f2920b = aVar;
        this.f2921c = yVar;
    }

    /* renamed from: b */
    public final void mo14747b(@NonNull C3339g gVar) {
        this.f2919a.execute(new C1878g(this, gVar));
    }
}
