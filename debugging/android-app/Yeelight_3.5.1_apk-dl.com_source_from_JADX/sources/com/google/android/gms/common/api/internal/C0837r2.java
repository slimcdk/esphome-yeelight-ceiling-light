package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.common.api.internal.r2 */
public final class C0837r2 extends C0854v2 {

    /* renamed from: b */
    protected final C0763d f766b;

    public C0837r2(int i, C0763d dVar) {
        super(i);
        this.f766b = (C0763d) C0917i.m1420k(dVar, "Null methods are not runnable.");
    }

    /* renamed from: a */
    public final void mo12035a(@NonNull Status status) {
        try {
            this.f766b.mo11934w(status);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: b */
    public final void mo12036b(@NonNull Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f766b.mo11934w(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: c */
    public final void mo12037c(C0785h1 h1Var) {
        try {
            this.f766b.mo11933u(h1Var.mo11994v());
        } catch (RuntimeException e) {
            mo12036b(e);
        }
    }

    /* renamed from: d */
    public final void mo12071d(@NonNull C0859x xVar, boolean z) {
        xVar.mo12088c(this.f766b, z);
    }
}
