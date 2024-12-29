package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
final class C1263q1 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ String f1544e;

    /* renamed from: f */
    final /* synthetic */ String f1545f;

    /* renamed from: g */
    final /* synthetic */ C1007a1 f1546g;

    /* renamed from: h */
    final /* synthetic */ C1296s2 f1547h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1263q1(C1296s2 s2Var, String str, String str2, C1007a1 a1Var) {
        super(s2Var, true);
        this.f1547h = s2Var;
        this.f1544e = str;
        this.f1545f = str2;
        this.f1546g = a1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1547h.f1594h)).getConditionalUserProperties(this.f1544e, this.f1545f, this.f1546g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo12516c() {
        this.f1546g.mo12512a((Bundle) null);
    }
}
