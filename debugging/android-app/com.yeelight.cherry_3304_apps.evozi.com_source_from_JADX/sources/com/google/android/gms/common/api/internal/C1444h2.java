package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.h2 */
final class C1444h2 implements C1431e1 {

    /* renamed from: a */
    private final /* synthetic */ C1436f2 f2696a;

    private C1444h2(C1436f2 f2Var) {
        this.f2696a = f2Var;
    }

    /* synthetic */ C1444h2(C1436f2 f2Var, C1440g2 g2Var) {
        this(f2Var);
    }

    /* renamed from: a */
    public final void mo10941a(@NonNull ConnectionResult connectionResult) {
        this.f2696a.f2690l.lock();
        try {
            ConnectionResult unused = this.f2696a.f2687i = connectionResult;
            this.f2696a.m3847w();
        } finally {
            this.f2696a.f2690l.unlock();
        }
    }

    /* renamed from: b */
    public final void mo10942b(@Nullable Bundle bundle) {
        this.f2696a.f2690l.lock();
        try {
            this.f2696a.m3833i(bundle);
            ConnectionResult unused = this.f2696a.f2687i = ConnectionResult.RESULT_SUCCESS;
            this.f2696a.m3847w();
        } finally {
            this.f2696a.f2690l.unlock();
        }
    }

    /* renamed from: c */
    public final void mo10943c(int i, boolean z) {
        this.f2696a.f2690l.lock();
        try {
            if (!this.f2696a.f2689k && this.f2696a.f2688j != null) {
                if (this.f2696a.f2688j.mo10749V()) {
                    boolean unused = this.f2696a.f2689k = true;
                    this.f2696a.f2682d.mo10836a(i);
                }
            }
            boolean unused2 = this.f2696a.f2689k = false;
            this.f2696a.m3832h(i, z);
        } finally {
            this.f2696a.f2690l.unlock();
        }
    }
}
