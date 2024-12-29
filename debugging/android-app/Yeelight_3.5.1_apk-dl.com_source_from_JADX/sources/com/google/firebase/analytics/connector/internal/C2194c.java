package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p048j0.C3262a;

/* renamed from: com.google.firebase.analytics.connector.internal.c */
final class C2194c implements C3262a.C3263a {

    /* renamed from: a */
    final /* synthetic */ C2195d f3495a;

    public C2194c(C2195d dVar) {
        this.f3495a = dVar;
    }

    /* renamed from: a */
    public final void mo14049a(String str, String str2, Bundle bundle, long j) {
        if (this.f3495a.f3496a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C2193b.m5508a(str2));
            this.f3495a.f3497b.mo26157a(2, bundle2);
        }
    }
}
