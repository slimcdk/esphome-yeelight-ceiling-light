package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.internal.C1550d;
import com.google.android.gms.common.internal.C1609u;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.z */
final class C1504z implements C1550d.C1553c {

    /* renamed from: a */
    private final WeakReference<C1498x> f2858a;

    /* renamed from: b */
    private final C1382a<?> f2859b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f2860c;

    public C1504z(C1498x xVar, C1382a<?> aVar, boolean z) {
        this.f2858a = new WeakReference<>(xVar);
        this.f2859b = aVar;
        this.f2860c = z;
    }

    /* renamed from: a */
    public final void mo10937a(@NonNull ConnectionResult connectionResult) {
        C1498x xVar = (C1498x) this.f2858a.get();
        if (xVar != null) {
            C1609u.m4479o(Looper.myLooper() == xVar.f2829a.f2797n.mo10828g(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            xVar.f2830b.lock();
            try {
                if (xVar.m4067x(0)) {
                    if (!connectionResult.mo10749V()) {
                        xVar.m4063t(connectionResult, this.f2859b, this.f2860c);
                    }
                    if (xVar.m4056m()) {
                        xVar.m4057n();
                    }
                }
            } finally {
                xVar.f2830b.unlock();
            }
        }
    }
}
