package com.xiaomi.mipush.sdk;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.C4551bj;
import com.xiaomi.push.service.C4921bn;

/* renamed from: com.xiaomi.mipush.sdk.ar */
class C4469ar extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C4465ao f7463a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4469ar(C4465ao aoVar, Handler handler) {
        super(handler);
        this.f7463a = aoVar;
    }

    public void onChange(boolean z) {
        C4465ao aoVar = this.f7463a;
        Integer unused = aoVar.f7453a = Integer.valueOf(C4921bn.m15441a(C4465ao.m12641a(aoVar)).mo30023a());
        if (C4465ao.m12641a(this.f7463a).intValue() != 0) {
            C4465ao.m12641a(this.f7463a).getContentResolver().unregisterContentObserver(this);
            if (C4551bj.m13000b(C4465ao.m12641a(this.f7463a))) {
                this.f7463a.mo28675c();
            }
        }
    }
}
