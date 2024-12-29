package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4498ai;
import java.lang.ref.WeakReference;

/* renamed from: com.xiaomi.push.br */
class C4545br extends C4498ai.C4499a {

    /* renamed from: a */
    final /* synthetic */ C4543bp f8254a;

    C4545br(C4543bp bpVar) {
        this.f8254a = bpVar;
    }

    /* renamed from: a */
    public int mo22734a() {
        return 10054;
    }

    public void run() {
        C3989b.m10680c("exec== DbSizeControlJob");
        C4557cb.m13552a(C4543bp.m13473a(this.f8254a)).mo24826a((Runnable) new C4548bu(C4543bp.m13473a(this.f8254a), new WeakReference(C4543bp.m13473a(this.f8254a))));
        this.f8254a.m13479b("check_time");
    }
}
