package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4498ai;

/* renamed from: com.xiaomi.push.bq */
class C4544bq extends C4498ai.C4499a {

    /* renamed from: a */
    final /* synthetic */ C4543bp f8253a;

    C4544bq(C4543bp bpVar) {
        this.f8253a = bpVar;
    }

    /* renamed from: a */
    public int mo22734a() {
        return 10052;
    }

    public void run() {
        C3989b.m10680c("exec== mUploadJob");
        if (C4543bp.m13473a(this.f8253a) != null) {
            C4543bp.m13473a(this.f8253a).mo24839a(C4543bp.m13473a(this.f8253a));
            this.f8253a.m13479b("upload_time");
        }
    }
}
