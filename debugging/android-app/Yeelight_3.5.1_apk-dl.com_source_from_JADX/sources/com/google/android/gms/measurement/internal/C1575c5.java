package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1180ke;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
final class C1575c5 implements C1180ke {

    /* renamed from: a */
    final /* synthetic */ C1614f5 f1979a;

    C1575c5(C1614f5 f5Var) {
        this.f1979a = f5Var;
    }

    /* renamed from: a */
    public final void mo12941a(int i, String str, List list, boolean z, boolean z2) {
        C1859z3 z3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            z3Var = this.f1979a.f2143a.mo14228b().mo14034q();
        } else if (i2 == 1) {
            C1574c4 b = this.f1979a.f2143a.mo14228b();
            z3Var = z ? b.mo14037t() : !z2 ? b.mo14036s() : b.mo14035r();
        } else if (i2 == 3) {
            z3Var = this.f1979a.f2143a.mo14228b().mo14039v();
        } else if (i2 != 4) {
            z3Var = this.f1979a.f2143a.mo14228b().mo14038u();
        } else {
            C1574c4 b2 = this.f1979a.f2143a.mo14228b();
            z3Var = z ? b2.mo14042y() : !z2 ? b2.mo14041x() : b2.mo14040w();
        }
        int size = list.size();
        if (size == 1) {
            z3Var.mo14694b(str, list.get(0));
        } else if (size == 2) {
            z3Var.mo14695c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            z3Var.mo14693a(str);
        } else {
            z3Var.mo14696d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
