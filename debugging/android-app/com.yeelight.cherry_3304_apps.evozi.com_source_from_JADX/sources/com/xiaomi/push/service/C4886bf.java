package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4503al;
import com.xiaomi.push.C4520ay;
import com.xiaomi.push.C4593dd;
import com.xiaomi.push.C4630ej;
import com.xiaomi.push.C4937t;
import com.xiaomi.push.service.C4884be;
import java.util.List;

/* renamed from: com.xiaomi.push.service.bf */
class C4886bf extends C4503al.C4505b {

    /* renamed from: a */
    final /* synthetic */ C4884be f10090a;

    /* renamed from: a */
    boolean f10091a = false;

    C4886bf(C4884be beVar) {
        this.f10090a = beVar;
    }

    /* renamed from: b */
    public void mo24740b() {
        try {
            C4630ej.C4631a a = C4630ej.C4631a.m13831a(Base64.decode(C4593dd.m13700a(C4937t.m15865a(), "http://resolver.msg.xiaomi.net/psc/?t=a", (List<C4520ay>) null), 10));
            if (a != null) {
                C4630ej.C4631a unused = this.f10090a.f10088a = a;
                this.f10091a = true;
                C4884be.m15673a(this.f10090a);
            }
        } catch (Exception e) {
            C3989b.m10669a("fetch config failure: " + e.getMessage());
        }
    }

    /* renamed from: c */
    public void mo24741c() {
        C4884be.C4885a[] aVarArr;
        C4503al.C4505b unused = this.f10090a.f10087a = null;
        if (this.f10091a) {
            synchronized (this.f10090a) {
                aVarArr = (C4884be.C4885a[]) C4884be.m15673a(this.f10090a).toArray(new C4884be.C4885a[C4884be.m15673a(this.f10090a).size()]);
            }
            for (C4884be.C4885a a : aVarArr) {
                a.mo25937a(C4884be.m15673a(this.f10090a));
            }
        }
    }
}
