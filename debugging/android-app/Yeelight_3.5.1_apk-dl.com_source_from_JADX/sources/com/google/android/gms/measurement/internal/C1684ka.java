package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.ka */
final class C1684ka implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzq f2241a;

    /* renamed from: b */
    final /* synthetic */ C1770ra f2242b;

    C1684ka(C1770ra raVar, zzq zzq) {
        this.f2242b = raVar;
        this.f2241a = zzq;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C1634h U = this.f2242b.mo14465U((String) C0917i.m1419j(this.f2241a.f2866a));
        zzah zzah = zzah.ANALYTICS_STORAGE;
        if (U.mo14221i(zzah) && C1634h.m4273b(this.f2241a.f2887v).mo14221i(zzah)) {
            return this.f2242b.mo14462R(this.f2241a).mo14091f0();
        }
        this.f2242b.mo14228b().mo14039v().mo14693a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
