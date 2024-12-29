package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
final class C1562b5 extends LruCache {

    /* renamed from: a */
    final /* synthetic */ C1614f5 f1948a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1562b5(C1614f5 f5Var, int i) {
        super(20);
        this.f1948a = f5Var;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        C0917i.m1415f(str);
        return C1614f5.m4189s(this.f1948a, str);
    }
}
