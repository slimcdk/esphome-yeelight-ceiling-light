package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4655ed;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.service.C4898ba;

/* renamed from: com.xiaomi.mipush.sdk.q */
final class C4492q extends C4898ba.C4899a {

    /* renamed from: a */
    final /* synthetic */ Context f7517a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4492q(int i, String str, Context context) {
        super(i, str);
        this.f7517a = context;
    }

    /* access modifiers changed from: protected */
    public void onCallback() {
        C4655ed.m13639a(this.f7517a).mo29040a(C4898ba.m15362a(this.f7517a).mo29988a(C4765ho.AwakeInfoUploadWaySwitch.mo29322a(), 0));
    }
}
