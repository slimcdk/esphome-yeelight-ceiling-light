package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.internal.measurement.d2 */
final class C1056d2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ String f1276e;

    /* renamed from: f */
    final /* synthetic */ C1007a1 f1277f;

    /* renamed from: g */
    final /* synthetic */ C1296s2 f1278g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1056d2(C1296s2 s2Var, String str, C1007a1 a1Var) {
        super(s2Var, true);
        this.f1278g = s2Var;
        this.f1276e = str;
        this.f1277f = a1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1278g.f1594h)).getMaxUserProperties(this.f1276e, this.f1277f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo12516c() {
        this.f1277f.mo12512a((Bundle) null);
    }
}
