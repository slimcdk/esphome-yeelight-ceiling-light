package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4516al;

/* renamed from: com.xiaomi.push.by */
class C4570by extends C4516al.C4517a {

    /* renamed from: a */
    final /* synthetic */ C4569bx f7684a;

    C4570by(C4569bx bxVar) {
        this.f7684a = bxVar;
    }

    /* renamed from: a */
    public String mo28479a() {
        return "10052";
    }

    public void run() {
        C4408b.m12482c("exec== mUploadJob");
        if (C4569bx.m13075a(this.f7684a) != null) {
            C4569bx.m13075a(this.f7684a).mo28847a(C4569bx.m13075a(this.f7684a));
            this.f7684a.m13081b("upload_time");
        }
    }
}
