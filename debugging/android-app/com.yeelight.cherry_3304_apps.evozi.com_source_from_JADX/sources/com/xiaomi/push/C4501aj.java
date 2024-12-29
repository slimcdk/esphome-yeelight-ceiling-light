package com.xiaomi.push;

import com.xiaomi.push.C4498ai;

/* renamed from: com.xiaomi.push.aj */
class C4501aj extends C4498ai.C4500b {

    /* renamed from: a */
    final /* synthetic */ C4498ai f8159a;

    /* renamed from: a */
    final /* synthetic */ String f8160a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4501aj(C4498ai aiVar, C4498ai.C4499a aVar, String str) {
        super(aVar);
        this.f8159a = aiVar;
        this.f8160a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24732a() {
        super.mo24732a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24733b() {
        C4498ai.m13269a(this.f8159a).edit().putLong(this.f8160a, System.currentTimeMillis()).commit();
    }
}
