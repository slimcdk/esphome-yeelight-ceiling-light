package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4649eq;
import com.xiaomi.push.C4744hr;
import com.xiaomi.push.service.C4854ak;

/* renamed from: com.xiaomi.mipush.sdk.p */
final class C4072p extends C4854ak.C4855a {

    /* renamed from: a */
    final /* synthetic */ Context f6950a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4072p(int i, String str, Context context) {
        super(i, str);
        this.f6950a = context;
    }

    /* access modifiers changed from: protected */
    public void onCallback() {
        C4649eq.m14098a(this.f6950a).mo25049a(C4854ak.m15568a(this.f6950a).mo25906a(C4744hr.AwakeInfoUploadWaySwitch.mo25291a(), 0));
    }
}
