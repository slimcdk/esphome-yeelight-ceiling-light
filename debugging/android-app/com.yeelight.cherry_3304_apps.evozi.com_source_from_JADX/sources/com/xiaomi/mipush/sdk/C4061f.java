package com.xiaomi.mipush.sdk;

import com.xiaomi.push.C4744hr;
import com.xiaomi.push.service.C4854ak;

/* renamed from: com.xiaomi.mipush.sdk.f */
class C4061f extends C4854ak.C4855a {

    /* renamed from: a */
    final /* synthetic */ C4060e f6936a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4061f(C4060e eVar, int i, String str) {
        super(i, str);
        this.f6936a = eVar;
    }

    /* access modifiers changed from: protected */
    public void onCallback() {
        boolean a = C4854ak.m15568a(C4060e.m10931a(this.f6936a)).mo25911a(C4744hr.AggregatePushSwitch.mo25291a(), true);
        if (C4060e.m10931a(this.f6936a) != a) {
            boolean unused = this.f6936a.f6935a = a;
            C4063h.m10956b(C4060e.m10931a(this.f6936a));
        }
    }
}
