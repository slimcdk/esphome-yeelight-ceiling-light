package com.google.firebase.iid;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.p131g.C3192a;
import com.google.firebase.p131g.C3193b;

/* renamed from: com.google.firebase.iid.a1 */
final /* synthetic */ class C3206a1 implements C3193b {

    /* renamed from: a */
    private final FirebaseInstanceId.C3202a f6200a;

    C3206a1(FirebaseInstanceId.C3202a aVar) {
        this.f6200a = aVar;
    }

    /* renamed from: a */
    public final void mo17054a(C3192a aVar) {
        FirebaseInstanceId.C3202a aVar2 = this.f6200a;
        synchronized (aVar2) {
            if (aVar2.mo17800a()) {
                FirebaseInstanceId.this.m9988A();
            }
        }
    }
}
