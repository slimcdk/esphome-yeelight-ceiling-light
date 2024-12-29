package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;
import p060l0.C3306a;

/* renamed from: com.google.android.gms.common.api.internal.l0 */
final class C0806l0 extends C3306a {

    /* renamed from: a */
    private final WeakReference f693a;

    C0806l0(C0831q0 q0Var) {
        this.f693a = new WeakReference(q0Var);
    }

    @BinderThread
    /* renamed from: v */
    public final void mo12005v(zak zak) {
        C0831q0 q0Var = (C0831q0) this.f693a.get();
        if (q0Var != null) {
            q0Var.f741a.mo12105o(new C0801k0(this, q0Var, q0Var, zak));
        }
    }
}
