package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.clientreport.manager.C3992a;
import com.xiaomi.push.C4498ai;

/* renamed from: com.xiaomi.push.bh */
public class C4534bh extends C4498ai.C4499a {

    /* renamed from: a */
    private Context f8225a;

    public C4534bh(Context context) {
        this.f8225a = context;
    }

    /* renamed from: a */
    private boolean mo22734a() {
        return C3992a.m10684a(this.f8225a).mo22723a().isPerfUploadSwitchOpen();
    }

    /* renamed from: a */
    public int m13446a() {
        return 100887;
    }

    public void run() {
        try {
            if (mo22734a()) {
                C3992a.m10684a(this.f8225a).mo22731c();
                C3989b.m10680c(this.f8225a.getPackageName() + "perf  begin upload");
            }
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }
}
