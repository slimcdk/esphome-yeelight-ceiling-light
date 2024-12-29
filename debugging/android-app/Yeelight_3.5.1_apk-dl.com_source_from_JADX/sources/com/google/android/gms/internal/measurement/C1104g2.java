package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.internal.measurement.g2 */
final class C1104g2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ Long f1333e;

    /* renamed from: f */
    final /* synthetic */ String f1334f;

    /* renamed from: g */
    final /* synthetic */ String f1335g;

    /* renamed from: h */
    final /* synthetic */ Bundle f1336h;

    /* renamed from: i */
    final /* synthetic */ boolean f1337i;

    /* renamed from: j */
    final /* synthetic */ boolean f1338j;

    /* renamed from: k */
    final /* synthetic */ C1296s2 f1339k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1104g2(C1296s2 s2Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(s2Var, true);
        this.f1339k = s2Var;
        this.f1333e = l;
        this.f1334f = str;
        this.f1335g = str2;
        this.f1336h = bundle;
        this.f1337i = z;
        this.f1338j = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        Long l = this.f1333e;
        ((C1071e1) C0917i.m1419j(this.f1339k.f1594h)).logEvent(this.f1334f, this.f1335g, this.f1336h, this.f1337i, this.f1338j, l == null ? this.f1359a : l.longValue());
    }
}
