package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s3 */
public final class C1297s3 extends C1110g8 implements C1207m9 {
    private C1297s3() {
        super(C1313t3.zza);
    }

    /* synthetic */ C1297s3(C1201m3 m3Var) {
        super(C1313t3.zza);
    }

    /* renamed from: C */
    public final List mo13274C() {
        return Collections.unmodifiableList(((C1313t3) this.f1342b).mo13372H());
    }

    /* renamed from: D */
    public final List mo13275D() {
        return Collections.unmodifiableList(((C1313t3) this.f1342b).mo13373I());
    }

    /* renamed from: t */
    public final int mo13276t() {
        return ((C1313t3) this.f1342b).mo13380y();
    }

    /* renamed from: u */
    public final C1281r3 mo13277u(int i) {
        return ((C1313t3) this.f1342b).mo13369A(i);
    }

    /* renamed from: w */
    public final C1297s3 mo13278w() {
        if (this.f1343c) {
            mo12840s();
            this.f1343c = false;
        }
        ((C1313t3) this.f1342b).zzk = C1174k8.m2150r();
        return this;
    }

    /* renamed from: x */
    public final C1297s3 mo13279x(int i, C1265q3 q3Var) {
        if (this.f1343c) {
            mo12840s();
            this.f1343c = false;
        }
        C1313t3.m2987L((C1313t3) this.f1342b, i, (C1281r3) q3Var.mo12838q());
        return this;
    }

    /* renamed from: y */
    public final String mo13280y() {
        return ((C1313t3) this.f1342b).mo13371G();
    }
}
