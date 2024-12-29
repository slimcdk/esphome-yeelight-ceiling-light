package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.ma */
final class C1710ma implements C1842xa {

    /* renamed from: a */
    final /* synthetic */ C1770ra f2314a;

    C1710ma(C1770ra raVar) {
        this.f2314a = raVar;
    }

    /* renamed from: a */
    public final void mo14233a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C1770ra raVar = this.f2314a;
            if (raVar.f2618l != null) {
                raVar.f2618l.mo14228b().mo14035r().mo14694b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f2314a.mo14227a().mo14310z(new C1697la(this, str, "_err", bundle));
    }
}
