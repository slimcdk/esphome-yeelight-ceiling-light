package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
public final class C1752q4 {

    /* renamed from: a */
    private final String f2529a;

    /* renamed from: b */
    private boolean f2530b;

    /* renamed from: c */
    private String f2531c;

    /* renamed from: d */
    final /* synthetic */ C1764r4 f2532d;

    public C1752q4(C1764r4 r4Var, String str, String str2) {
        this.f2532d = r4Var;
        C0917i.m1415f(str);
        this.f2529a = str;
    }

    @WorkerThread
    /* renamed from: a */
    public final String mo14426a() {
        if (!this.f2530b) {
            this.f2530b = true;
            this.f2531c = this.f2532d.mo14445o().getString(this.f2529a, (String) null);
        }
        return this.f2531c;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14427b(String str) {
        SharedPreferences.Editor edit = this.f2532d.mo14445o().edit();
        edit.putString(this.f2529a, str);
        edit.apply();
        this.f2531c = str;
    }
}
