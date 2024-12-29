package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4516al;
import java.lang.ref.WeakReference;

/* renamed from: com.xiaomi.push.bz */
class C4571bz extends C4516al.C4517a {

    /* renamed from: a */
    final /* synthetic */ C4569bx f7685a;

    C4571bz(C4569bx bxVar) {
        this.f7685a = bxVar;
    }

    /* renamed from: a */
    public String mo28479a() {
        return "10054";
    }

    public void run() {
        C4408b.m12482c("exec== DbSizeControlJob");
        C4583cj.m13154a(C4569bx.m13075a(this.f7685a)).mo28834a((Runnable) new C4576cc(C4569bx.m13075a(this.f7685a), new WeakReference(C4569bx.m13075a(this.f7685a))));
        this.f7685a.m13081b("check_time");
    }
}
