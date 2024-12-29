package com.xiaomi.push;

import com.xiaomi.push.C4503al;
import com.xiaomi.push.C4599di;

/* renamed from: com.xiaomi.push.dk */
class C4604dk extends C4503al.C4505b {

    /* renamed from: a */
    C4503al.C4505b f8408a;

    /* renamed from: a */
    final /* synthetic */ C4599di f8409a;

    C4604dk(C4599di diVar) {
        this.f8409a = diVar;
    }

    /* renamed from: b */
    public void mo24740b() {
        C4599di.C4601b bVar = (C4599di.C4601b) C4599di.m13720a(this.f8409a).peek();
        if (bVar != null && bVar.mo24739a()) {
            if (C4599di.m13720a(this.f8409a).remove(bVar)) {
                this.f8408a = bVar;
            }
            C4503al.C4505b bVar2 = this.f8408a;
            if (bVar2 != null) {
                bVar2.mo24740b();
            }
        }
    }

    /* renamed from: c */
    public void mo24741c() {
        C4503al.C4505b bVar = this.f8408a;
        if (bVar != null) {
            bVar.mo24741c();
        }
    }
}
