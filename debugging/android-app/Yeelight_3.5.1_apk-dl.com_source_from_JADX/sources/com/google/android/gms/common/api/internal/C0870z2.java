package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.common.api.internal.z2 */
final class C0870z2 {

    /* renamed from: a */
    private final int f878a;

    /* renamed from: b */
    private final ConnectionResult f879b;

    C0870z2(ConnectionResult connectionResult, int i) {
        C0917i.m1419j(connectionResult);
        this.f879b = connectionResult;
        this.f878a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo12108a() {
        return this.f878a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConnectionResult mo12109b() {
        return this.f879b;
    }
}
