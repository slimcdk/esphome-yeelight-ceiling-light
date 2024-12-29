package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.internal.C0897c;
import com.google.android.gms.common.internal.C0917i;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
final class C0774f0 implements C0897c.C0900c {

    /* renamed from: a */
    private final WeakReference f607a;

    /* renamed from: b */
    private final C0722a f608b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f609c;

    public C0774f0(C0831q0 q0Var, C0722a aVar, boolean z) {
        this.f607a = new WeakReference(q0Var);
        this.f608b = aVar;
        this.f609c = z;
    }

    /* renamed from: a */
    public final void mo11950a(@NonNull ConnectionResult connectionResult) {
        C0831q0 q0Var = (C0831q0) this.f607a.get();
        if (q0Var != null) {
            C0917i.m1424o(Looper.myLooper() == q0Var.f741a.f875m.mo11865i(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            q0Var.f742b.lock();
            try {
                if (q0Var.m1015o(0)) {
                    if (!connectionResult.mo11756f0()) {
                        q0Var.m1013m(connectionResult, this.f608b, this.f609c);
                    }
                    if (q0Var.m1016p()) {
                        q0Var.m1014n();
                    }
                }
            } finally {
                q0Var.f742b.unlock();
            }
        }
    }
}
