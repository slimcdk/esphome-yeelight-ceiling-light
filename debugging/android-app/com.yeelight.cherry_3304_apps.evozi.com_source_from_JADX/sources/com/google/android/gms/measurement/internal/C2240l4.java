package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
public final class C2240l4 {

    /* renamed from: a */
    private final String f4295a;

    /* renamed from: b */
    private final boolean f4296b;

    /* renamed from: c */
    private boolean f4297c;

    /* renamed from: d */
    private boolean f4298d;

    /* renamed from: e */
    private final /* synthetic */ C2218j4 f4299e;

    public C2240l4(C2218j4 j4Var, String str, boolean z) {
        this.f4299e = j4Var;
        C1609u.m4471g(str);
        this.f4295a = str;
        this.f4296b = z;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo12795a(boolean z) {
        SharedPreferences.Editor edit = this.f4299e.mo12755B().edit();
        edit.putBoolean(this.f4295a, z);
        edit.apply();
        this.f4298d = z;
    }

    @WorkerThread
    /* renamed from: b */
    public final boolean mo12796b() {
        if (!this.f4297c) {
            this.f4297c = true;
            this.f4298d = this.f4299e.mo12755B().getBoolean(this.f4295a, this.f4296b);
        }
        return this.f4298d;
    }
}
