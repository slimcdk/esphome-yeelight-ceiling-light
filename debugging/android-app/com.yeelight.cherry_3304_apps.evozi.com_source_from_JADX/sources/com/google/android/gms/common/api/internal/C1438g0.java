package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1399f;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
final class C1438g0 implements C1399f.C1401b, C1399f.C1402c {

    /* renamed from: a */
    private final /* synthetic */ C1498x f2692a;

    private C1438g0(C1498x xVar) {
        this.f2692a = xVar;
    }

    /* synthetic */ C1438g0(C1498x xVar, C1501y yVar) {
        this(xVar);
    }

    /* renamed from: a */
    public final void mo10836a(int i) {
    }

    /* renamed from: c */
    public final void mo10837c(Bundle bundle) {
        if (this.f2692a.f2846r.mo11201j()) {
            this.f2692a.f2830b.lock();
            try {
                if (this.f2692a.f2839k != null) {
                    this.f2692a.f2839k.mo8633o(new C1430e0(this.f2692a));
                    this.f2692a.f2830b.unlock();
                }
            } finally {
                this.f2692a.f2830b.unlock();
            }
        } else {
            this.f2692a.f2839k.mo8633o(new C1430e0(this.f2692a));
        }
    }

    /* renamed from: f */
    public final void mo10838f(@NonNull ConnectionResult connectionResult) {
        this.f2692a.f2830b.lock();
        try {
            if (this.f2692a.m4040A(connectionResult)) {
                this.f2692a.m4059p();
                this.f2692a.m4057n();
            } else {
                this.f2692a.m4041B(connectionResult);
            }
        } finally {
            this.f2692a.f2830b.unlock();
        }
    }
}
