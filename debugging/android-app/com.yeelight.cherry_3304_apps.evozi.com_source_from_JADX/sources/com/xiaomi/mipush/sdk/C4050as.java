package com.xiaomi.mipush.sdk;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.C4521az;
import com.xiaomi.push.service.C4875aw;

/* renamed from: com.xiaomi.mipush.sdk.as */
class C4050as extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C4047aq f6896a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4050as(C4047aq aqVar, Handler handler) {
        super(handler);
        this.f6896a = aqVar;
    }

    public void onChange(boolean z) {
        C4047aq aqVar = this.f6896a;
        Integer unused = aqVar.f6887a = Integer.valueOf(C4875aw.m15643a(C4047aq.m10830a(aqVar)).mo25938a());
        if (C4047aq.m10830a(this.f6896a).intValue() != 0) {
            C4047aq.m10830a(this.f6896a).getContentResolver().unregisterContentObserver(this);
            if (C4521az.m13366b(C4047aq.m10830a(this.f6896a))) {
                this.f6896a.mo22922c();
            }
        }
    }
}
