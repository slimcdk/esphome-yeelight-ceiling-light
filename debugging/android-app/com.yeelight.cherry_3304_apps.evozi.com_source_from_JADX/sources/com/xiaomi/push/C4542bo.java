package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.Date;

/* renamed from: com.xiaomi.push.bo */
class C4542bo implements C4684fv {

    /* renamed from: a */
    final /* synthetic */ C4540bn f8239a;

    C4542bo(C4540bn bnVar) {
        this.f8239a = bnVar;
    }

    /* renamed from: a */
    public void mo24779a(C4680fs fsVar) {
        C3989b.m10680c("[Slim] " + C4540bn.m13463a(this.f8239a).format(new Date()) + " Connection reconnected (" + C4540bn.m13463a(this.f8239a).hashCode() + ")");
    }

    /* renamed from: a */
    public void mo24780a(C4680fs fsVar, int i, Exception exc) {
        C3989b.m10680c("[Slim] " + C4540bn.m13463a(this.f8239a).format(new Date()) + " Connection closed (" + C4540bn.m13463a(this.f8239a).hashCode() + ")");
    }

    /* renamed from: a */
    public void mo24781a(C4680fs fsVar, Exception exc) {
        C3989b.m10680c("[Slim] " + C4540bn.m13463a(this.f8239a).format(new Date()) + " Reconnection failed due to an exception (" + C4540bn.m13463a(this.f8239a).hashCode() + ")");
        exc.printStackTrace();
    }

    /* renamed from: b */
    public void mo24782b(C4680fs fsVar) {
        C3989b.m10680c("[Slim] " + C4540bn.m13463a(this.f8239a).format(new Date()) + " Connection started (" + C4540bn.m13463a(this.f8239a).hashCode() + ")");
    }
}
