package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
final class C1642h7 implements C1842xa {

    /* renamed from: a */
    final /* synthetic */ C1791t7 f2144a;

    C1642h7(C1791t7 t7Var) {
        this.f2144a = t7Var;
    }

    /* renamed from: a */
    public final void mo14233a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f2144a.mo14569u("auto", "_err", bundle, str);
        } else {
            this.f2144a.mo14567s("auto", "_err", bundle);
        }
    }
}
