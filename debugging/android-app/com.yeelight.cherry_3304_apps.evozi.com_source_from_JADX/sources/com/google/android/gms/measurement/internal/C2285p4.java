package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
public final class C2285p4 {

    /* renamed from: a */
    private final String f4427a;

    /* renamed from: b */
    private boolean f4428b;

    /* renamed from: c */
    private String f4429c;

    /* renamed from: d */
    private final /* synthetic */ C2218j4 f4430d;

    public C2285p4(C2218j4 j4Var, String str, String str2) {
        this.f4430d = j4Var;
        C1609u.m4471g(str);
        this.f4427a = str;
    }

    @WorkerThread
    /* renamed from: a */
    public final String mo12869a() {
        if (!this.f4428b) {
            this.f4428b = true;
            this.f4429c = this.f4430d.mo12755B().getString(this.f4427a, (String) null);
        }
        return this.f4429c;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo12870b(String str) {
        if (this.f4430d.mo13112m().mo12474s(C2302r.f4550y0) || !C2323s9.m7583y0(str, this.f4429c)) {
            SharedPreferences.Editor edit = this.f4430d.mo12755B().edit();
            edit.putString(this.f4427a, str);
            edit.apply();
            this.f4429c = str;
        }
    }
}
