package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C0917i;
import p032f0.C3157b;

/* renamed from: com.google.android.gms.internal.measurement.b2 */
final class C1024b2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ String f1247e;

    /* renamed from: f */
    final /* synthetic */ Object f1248f;

    /* renamed from: g */
    final /* synthetic */ C1296s2 f1249g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1024b2(C1296s2 s2Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(s2Var, false);
        this.f1249g = s2Var;
        this.f1247e = str;
        this.f1248f = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1249g.f1594h)).logHealthData(5, this.f1247e, C3157b.m8427T(this.f1248f), C3157b.m8427T(null), C3157b.m8427T(null));
    }
}
