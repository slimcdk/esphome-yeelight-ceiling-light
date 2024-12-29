package com.xiaomi.push;

import com.xiaomi.push.C4498ai;

/* renamed from: com.xiaomi.push.ak */
class C4502ak extends C4498ai.C4500b {

    /* renamed from: a */
    final /* synthetic */ C4498ai f8161a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4502ak(C4498ai aiVar, C4498ai.C4499a aVar) {
        super(aVar);
        this.f8161a = aiVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24733b() {
        synchronized (C4498ai.m13269a(this.f8161a)) {
            C4498ai.m13269a(this.f8161a).remove(this.f8158a.mo22734a());
        }
    }
}
