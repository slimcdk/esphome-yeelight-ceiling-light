package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.internal.measurement.w1 */
final class C1356w1 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ C1007a1 f1693e;

    /* renamed from: f */
    final /* synthetic */ C1296s2 f1694f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1356w1(C1296s2 s2Var, C1007a1 a1Var) {
        super(s2Var, true);
        this.f1694f = s2Var;
        this.f1693e = a1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1694f.f1594h)).getCachedAppInstanceId(this.f1693e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo12516c() {
        this.f1693e.mo12512a((Bundle) null);
    }
}
