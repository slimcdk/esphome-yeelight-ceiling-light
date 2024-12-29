package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
final class C1847y3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f2779a;

    /* renamed from: b */
    final /* synthetic */ String f2780b;

    /* renamed from: c */
    final /* synthetic */ Object f2781c;

    /* renamed from: d */
    final /* synthetic */ Object f2782d;

    /* renamed from: e */
    final /* synthetic */ Object f2783e;

    /* renamed from: f */
    final /* synthetic */ C1574c4 f2784f;

    C1847y3(C1574c4 c4Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f2784f = c4Var;
        this.f2779a = i;
        this.f2780b = str;
        this.f2781c = obj;
        this.f2782d = obj2;
        this.f2783e = obj3;
    }

    public final void run() {
        char c;
        C1574c4 c4Var;
        C1764r4 F = this.f2784f.f2143a.mo14375F();
        if (F.mo14244n()) {
            C1574c4 c4Var2 = this.f2784f;
            if (c4Var2.f1967c == 0) {
                if (c4Var2.f2143a.mo14402z().mo14169H()) {
                    c4Var = this.f2784f;
                    c4Var.f2143a.mo14230d();
                    c = 'C';
                } else {
                    c4Var = this.f2784f;
                    c4Var.f2143a.mo14230d();
                    c = 'c';
                }
                c4Var.f1967c = c;
            }
            C1574c4 c4Var3 = this.f2784f;
            if (c4Var3.f1968d < 0) {
                c4Var3.f2143a.mo14402z().mo14176q();
                c4Var3.f1968d = 64000;
            }
            char charAt = "01VDIWEA?".charAt(this.f2779a);
            C1574c4 c4Var4 = this.f2784f;
            String str = "2" + charAt + c4Var4.f1967c + c4Var4.f1968d + Constants.COLON_SEPARATOR + C1574c4.m4076A(true, this.f2780b, this.f2781c, this.f2782d, this.f2783e);
            if (str.length() > 1024) {
                str = this.f2780b.substring(0, 1024);
            }
            C1740p4 p4Var = F.f2562d;
            if (p4Var != null) {
                p4Var.mo14420b(str, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f2784f.mo14031C(), "Persisted config not initialized. Not logging error/warn");
    }
}
