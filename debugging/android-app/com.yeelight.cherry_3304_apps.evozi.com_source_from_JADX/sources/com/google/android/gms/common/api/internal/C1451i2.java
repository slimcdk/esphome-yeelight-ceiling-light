package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.i2 */
final class C1451i2 implements C1431e1 {

    /* renamed from: a */
    private final /* synthetic */ C1436f2 f2705a;

    private C1451i2(C1436f2 f2Var) {
        this.f2705a = f2Var;
    }

    /* synthetic */ C1451i2(C1436f2 f2Var, C1440g2 g2Var) {
        this(f2Var);
    }

    /* renamed from: a */
    public final void mo10941a(@NonNull ConnectionResult connectionResult) {
        this.f2705a.f2690l.lock();
        try {
            ConnectionResult unused = this.f2705a.f2688j = connectionResult;
            this.f2705a.m3847w();
        } finally {
            this.f2705a.f2690l.unlock();
        }
    }

    /* renamed from: b */
    public final void mo10942b(@Nullable Bundle bundle) {
        this.f2705a.f2690l.lock();
        try {
            ConnectionResult unused = this.f2705a.f2688j = ConnectionResult.RESULT_SUCCESS;
            this.f2705a.m3847w();
        } finally {
            this.f2705a.f2690l.unlock();
        }
    }

    /* renamed from: c */
    public final void mo10943c(int i, boolean z) {
        this.f2705a.f2690l.lock();
        try {
            if (this.f2705a.f2689k) {
                boolean unused = this.f2705a.f2689k = false;
                this.f2705a.m3832h(i, z);
            } else {
                boolean unused2 = this.f2705a.f2689k = true;
                this.f2705a.f2681c.mo10836a(i);
            }
        } finally {
            this.f2705a.f2690l.unlock();
        }
    }
}
