package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.Date;

/* renamed from: com.xiaomi.push.fv */
class C4710fv implements C4715fz {

    /* renamed from: a */
    final /* synthetic */ C4708fu f8215a;

    C4710fv(C4708fu fuVar) {
        this.f8215a = fuVar;
    }

    /* renamed from: a */
    public void mo29135a(C4711fw fwVar) {
        C4408b.m12482c("[Slim] " + C4708fu.m13929a(this.f8215a).format(new Date()) + " Connection started (" + C4708fu.m13929a(this.f8215a).hashCode() + ")");
    }

    /* renamed from: a */
    public void mo29136a(C4711fw fwVar, int i, Exception exc) {
        C4408b.m12482c("[Slim] " + C4708fu.m13929a(this.f8215a).format(new Date()) + " Connection closed (" + C4708fu.m13929a(this.f8215a).hashCode() + ")");
    }

    /* renamed from: a */
    public void mo29137a(C4711fw fwVar, Exception exc) {
        C4408b.m12482c("[Slim] " + C4708fu.m13929a(this.f8215a).format(new Date()) + " Reconnection failed due to an exception (" + C4708fu.m13929a(this.f8215a).hashCode() + ")");
        exc.printStackTrace();
    }

    /* renamed from: b */
    public void mo29138b(C4711fw fwVar) {
        C4408b.m12482c("[Slim] " + C4708fu.m13929a(this.f8215a).format(new Date()) + " Connection reconnected (" + C4708fu.m13929a(this.f8215a).hashCode() + ")");
    }
}
