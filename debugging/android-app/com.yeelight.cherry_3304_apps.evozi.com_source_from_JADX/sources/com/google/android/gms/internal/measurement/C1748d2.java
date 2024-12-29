package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.measurement.d2 */
final /* synthetic */ class C1748d2 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final C1763e2 f3300a;

    C1748d2(C1763e2 e2Var) {
        this.f3300a = e2Var;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f3300a.mo11598d(sharedPreferences, str);
    }
}
