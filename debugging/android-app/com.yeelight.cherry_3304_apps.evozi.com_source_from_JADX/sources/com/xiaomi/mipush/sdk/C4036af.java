package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4745hs;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4758ie;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.service.C4854ak;
import com.xiaomi.push.service.C4856al;

/* renamed from: com.xiaomi.mipush.sdk.af */
public class C4036af extends C4498ai.C4499a {

    /* renamed from: a */
    private Context f6858a;

    public C4036af(Context context) {
        this.f6858a = context;
    }

    /* renamed from: a */
    public int mo22734a() {
        return 2;
    }

    public void run() {
        C4854ak a = C4854ak.m15568a(this.f6858a);
        C4758ie ieVar = new C4758ie();
        ieVar.mo25462a(C4856al.m15580a(a, C4745hs.MISC_CONFIG));
        ieVar.mo25465b(C4856al.m15580a(a, C4745hs.PLUGIN_CONFIG));
        C4765il ilVar = new C4765il("-1", false);
        ilVar.mo25565c(C4749hw.DailyCheckClientConfig.f9252a);
        ilVar.mo25559a(C4776iw.m15225a(ieVar));
        C4047aq.m10835a(this.f6858a).mo22910a(ilVar, C4739hm.Notification, (C4752hz) null);
    }
}
