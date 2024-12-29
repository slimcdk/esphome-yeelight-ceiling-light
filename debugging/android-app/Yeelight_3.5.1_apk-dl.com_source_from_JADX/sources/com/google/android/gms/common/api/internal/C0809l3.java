package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.l3 */
final class C0809l3 implements C0828p1 {

    /* renamed from: a */
    final /* synthetic */ C0847u f702a;

    /* synthetic */ C0809l3(C0847u uVar, C0804k3 k3Var) {
        this.f702a = uVar;
    }

    /* renamed from: a */
    public final void mo12018a(@Nullable Bundle bundle) {
        this.f702a.f799l.lock();
        try {
            this.f702a.f797j = ConnectionResult.RESULT_SUCCESS;
            C0847u.m1099w(this.f702a);
        } finally {
            this.f702a.f799l.unlock();
        }
    }

    /* renamed from: b */
    public final void mo12019b(int i, boolean z) {
        this.f702a.f799l.lock();
        try {
            C0847u uVar = this.f702a;
            if (uVar.f798k) {
                uVar.f798k = false;
                C0847u.m1097u(this.f702a, i, z);
            } else {
                uVar.f798k = true;
                this.f702a.f790c.mo11948c(i);
            }
        } finally {
            this.f702a.f799l.unlock();
        }
    }

    /* renamed from: c */
    public final void mo12020c(@NonNull ConnectionResult connectionResult) {
        this.f702a.f799l.lock();
        try {
            this.f702a.f797j = connectionResult;
            C0847u.m1099w(this.f702a);
        } finally {
            this.f702a.f799l.unlock();
        }
    }
}
