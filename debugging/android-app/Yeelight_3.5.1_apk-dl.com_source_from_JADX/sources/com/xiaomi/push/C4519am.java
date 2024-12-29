package com.xiaomi.push;

import com.xiaomi.push.C4516al;

/* renamed from: com.xiaomi.push.am */
class C4519am extends C4516al.C4518b {

    /* renamed from: a */
    final /* synthetic */ C4516al f7554a;

    /* renamed from: a */
    final /* synthetic */ String f7555a;

    /* renamed from: a */
    final /* synthetic */ boolean f7556a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4519am(C4516al alVar, C4516al.C4517a aVar, boolean z, String str) {
        super(aVar);
        this.f7554a = alVar;
        this.f7556a = z;
        this.f7555a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28741a() {
        super.mo28741a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28742b() {
        if (!this.f7556a) {
            C4516al.m12856a(this.f7554a).edit().putLong(this.f7555a, System.currentTimeMillis()).commit();
        }
    }
}
