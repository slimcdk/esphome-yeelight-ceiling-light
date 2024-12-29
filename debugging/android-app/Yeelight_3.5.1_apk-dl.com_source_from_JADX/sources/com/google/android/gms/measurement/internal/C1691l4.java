package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
public final class C1691l4 {

    /* renamed from: a */
    private final String f2263a;

    /* renamed from: b */
    private final boolean f2264b;

    /* renamed from: c */
    private boolean f2265c;

    /* renamed from: d */
    private boolean f2266d;

    /* renamed from: e */
    final /* synthetic */ C1764r4 f2267e;

    public C1691l4(C1764r4 r4Var, String str, boolean z) {
        this.f2267e = r4Var;
        C0917i.m1415f(str);
        this.f2263a = str;
        this.f2264b = z;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14350a(boolean z) {
        SharedPreferences.Editor edit = this.f2267e.mo14445o().edit();
        edit.putBoolean(this.f2263a, z);
        edit.apply();
        this.f2266d = z;
    }

    @WorkerThread
    /* renamed from: b */
    public final boolean mo14351b() {
        if (!this.f2265c) {
            this.f2265c = true;
            this.f2266d = this.f2267e.mo14445o().getBoolean(this.f2263a, this.f2264b);
        }
        return this.f2266d;
    }
}
