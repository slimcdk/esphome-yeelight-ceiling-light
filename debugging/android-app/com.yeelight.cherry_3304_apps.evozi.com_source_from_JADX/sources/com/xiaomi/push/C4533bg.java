package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.clientreport.manager.C3992a;
import com.xiaomi.push.C4498ai;

/* renamed from: com.xiaomi.push.bg */
public class C4533bg extends C4498ai.C4499a {

    /* renamed from: a */
    private Context f8224a;

    public C4533bg(Context context) {
        this.f8224a = context;
    }

    /* renamed from: a */
    private boolean mo22734a() {
        return C3992a.m10684a(this.f8224a).mo22723a().isEventUploadSwitchOpen();
    }

    /* renamed from: a */
    public int m13444a() {
        return 100886;
    }

    public void run() {
        try {
            if (mo22734a()) {
                C3989b.m10680c(this.f8224a.getPackageName() + " begin upload event");
                C3992a.m10684a(this.f8224a).mo22730b();
            }
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }
}
