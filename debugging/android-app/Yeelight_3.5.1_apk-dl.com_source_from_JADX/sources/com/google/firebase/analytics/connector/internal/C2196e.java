package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p048j0.C3262a;

/* renamed from: com.google.firebase.analytics.connector.internal.e */
final class C2196e implements C3262a.C3263a {

    /* renamed from: a */
    final /* synthetic */ C2197f f3500a;

    public C2196e(C2197f fVar) {
        this.f3500a = fVar;
    }

    /* renamed from: a */
    public final void mo14049a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && C2193b.m5512e(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f3500a.f3501a.mo26157a(3, bundle2);
        }
    }
}
