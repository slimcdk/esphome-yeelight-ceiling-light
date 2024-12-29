package com.xiaomi.push;

import com.xiaomi.push.C4521ao;
import com.xiaomi.push.C4614df;

/* renamed from: com.xiaomi.push.dh */
class C4619dh extends C4521ao.C4523b {

    /* renamed from: a */
    C4521ao.C4523b f7808a;

    /* renamed from: a */
    final /* synthetic */ C4614df f7809a;

    C4619dh(C4614df dfVar) {
        this.f7809a = dfVar;
    }

    /* renamed from: b */
    public void mo28749b() {
        C4614df.C4616b bVar = (C4614df.C4616b) C4614df.m13296a(this.f7809a).peek();
        if (bVar != null && bVar.mo28748a()) {
            if (C4614df.m13296a(this.f7809a).remove(bVar)) {
                this.f7808a = bVar;
            }
            C4521ao.C4523b bVar2 = this.f7808a;
            if (bVar2 != null) {
                bVar2.mo28749b();
            }
        }
    }

    /* renamed from: c */
    public void mo28750c() {
        C4521ao.C4523b bVar = this.f7808a;
        if (bVar != null) {
            bVar.mo28750c();
        }
    }
}
