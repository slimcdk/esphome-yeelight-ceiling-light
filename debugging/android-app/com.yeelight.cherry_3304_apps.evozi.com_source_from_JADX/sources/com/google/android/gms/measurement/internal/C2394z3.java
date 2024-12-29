package com.google.android.gms.measurement.internal;

import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
final class C2394z3 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f4746a;

    /* renamed from: b */
    private final /* synthetic */ String f4747b;

    /* renamed from: c */
    private final /* synthetic */ Object f4748c;

    /* renamed from: d */
    private final /* synthetic */ Object f4749d;

    /* renamed from: e */
    private final /* synthetic */ Object f4750e;

    /* renamed from: f */
    private final /* synthetic */ C2361w3 f4751f;

    C2394z3(C2361w3 w3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f4751f = w3Var;
        this.f4746a = i;
        this.f4747b = str;
        this.f4748c = obj;
        this.f4749d = obj2;
        this.f4750e = obj3;
    }

    public final void run() {
        char c;
        C2361w3 w3Var;
        C2218j4 A = this.f4751f.f4689a.mo12406A();
        if (A.mo13082s()) {
            if (this.f4751f.f4677c == 0) {
                if (this.f4751f.mo13112m().mo12459E()) {
                    w3Var = this.f4751f;
                    w3Var.mo12414I();
                    c = 'C';
                } else {
                    w3Var = this.f4751f;
                    w3Var.mo12414I();
                    c = 'c';
                }
                char unused = w3Var.f4677c = c;
            }
            if (this.f4751f.f4678d < 0) {
                C2361w3 w3Var2 = this.f4751f;
                long unused2 = w3Var2.f4678d = w3Var2.mo13112m().mo12457C();
            }
            char charAt = "01VDIWEA?".charAt(this.f4746a);
            char t = this.f4751f.f4677c;
            long D = this.f4751f.f4678d;
            String y = C2361w3.m7698y(true, this.f4747b, this.f4748c, this.f4749d, this.f4750e);
            StringBuilder sb = new StringBuilder(String.valueOf(y).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(t);
            sb.append(D);
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(y);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f4747b.substring(0, 1024);
            }
            A.f4221d.mo12898b(sb2, 1);
            return;
        }
        this.f4751f.mo13106z(6, "Persisted config not initialized. Not logging error/warn");
    }
}
