package com.xiaomi.mipush.sdk;

import com.xiaomi.push.C4765ho;
import com.xiaomi.push.service.C4898ba;

/* renamed from: com.xiaomi.mipush.sdk.g */
class C4481g extends C4898ba.C4899a {

    /* renamed from: a */
    final /* synthetic */ C4480f f7503a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4481g(C4480f fVar, int i, String str) {
        super(i, str);
        this.f7503a = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCallback() {
        boolean a = C4898ba.m15362a(C4480f.m12750a(this.f7503a)).mo29996a(C4765ho.AggregatePushSwitch.mo29322a(), true);
        if (C4480f.m12750a(this.f7503a) != a) {
            boolean unused = this.f7503a.f7502a = a;
            C4483i.m12781b(C4480f.m12750a(this.f7503a));
        }
    }
}
