package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.C2403c;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
final class C1430e0 extends C2403c {

    /* renamed from: a */
    private final WeakReference<C1498x> f2668a;

    C1430e0(C1498x xVar) {
        this.f2668a = new WeakReference<>(xVar);
    }

    @BinderThread
    /* renamed from: r */
    public final void mo10940r(zaj zaj) {
        C1498x xVar = (C1498x) this.f2668a.get();
        if (xVar != null) {
            xVar.f2829a.mo11002i(new C1434f0(this, xVar, xVar, zaj));
        }
    }
}
