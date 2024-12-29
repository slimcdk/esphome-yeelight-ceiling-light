package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.internal.measurement.a2 */
final class C1008a2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ String f1225e;

    /* renamed from: f */
    final /* synthetic */ String f1226f;

    /* renamed from: g */
    final /* synthetic */ boolean f1227g;

    /* renamed from: h */
    final /* synthetic */ C1007a1 f1228h;

    /* renamed from: i */
    final /* synthetic */ C1296s2 f1229i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1008a2(C1296s2 s2Var, String str, String str2, boolean z, C1007a1 a1Var) {
        super(s2Var, true);
        this.f1229i = s2Var;
        this.f1225e = str;
        this.f1226f = str2;
        this.f1227g = z;
        this.f1228h = a1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1229i.f1594h)).getUserProperties(this.f1225e, this.f1226f, this.f1227g, this.f1228h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo12516c() {
        this.f1228h.mo12512a((Bundle) null);
    }
}
