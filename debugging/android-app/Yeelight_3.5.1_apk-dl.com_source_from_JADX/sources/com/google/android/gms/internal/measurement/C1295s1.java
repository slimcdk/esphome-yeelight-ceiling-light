package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C1627g5;
import p032f0.C3157b;

/* renamed from: com.google.android.gms.internal.measurement.s1 */
final class C1295s1 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ String f1581e;

    /* renamed from: f */
    final /* synthetic */ String f1582f;

    /* renamed from: g */
    final /* synthetic */ Context f1583g;

    /* renamed from: h */
    final /* synthetic */ Bundle f1584h;

    /* renamed from: i */
    final /* synthetic */ C1296s2 f1585i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1295s1(C1296s2 s2Var, String str, String str2, Context context, Bundle bundle) {
        super(s2Var, true);
        this.f1585i = s2Var;
        this.f1581e = str;
        this.f1582f = str2;
        this.f1583g = context;
        this.f1584h = bundle;
    }

    /* renamed from: b */
    public final void mo12515b() {
        String str;
        String str2;
        String str3;
        try {
            if (C1296s2.m2740l(this.f1581e, this.f1582f)) {
                String str4 = this.f1582f;
                str2 = this.f1581e;
                str = str4;
                str3 = this.f1585i.f1587a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C0917i.m1419j(this.f1583g);
            C1296s2 s2Var = this.f1585i;
            s2Var.f1594h = s2Var.mo13267q(this.f1583g, true);
            if (this.f1585i.f1594h == null) {
                String unused = this.f1585i.f1587a;
                return;
            }
            int a = DynamiteModule.m1604a(this.f1583g, ModuleDescriptor.MODULE_ID);
            int b = DynamiteModule.m1605b(this.f1583g, ModuleDescriptor.MODULE_ID);
            ((C1071e1) C0917i.m1419j(this.f1585i.f1594h)).initialize(C3157b.m8427T(this.f1583g), new zzcl(64000, (long) Math.max(a, b), b < a, str3, str2, str, this.f1584h, C1627g5.m4241a(this.f1583g)), this.f1359a);
        } catch (Exception e) {
            this.f1585i.m2737i(e, true, false);
        }
    }
}
