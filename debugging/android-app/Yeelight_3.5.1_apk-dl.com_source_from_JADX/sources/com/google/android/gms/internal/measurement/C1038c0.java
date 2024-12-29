package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.c0 */
final class C1038c0 implements Comparator {

    /* renamed from: a */
    final /* synthetic */ C1149j f1259a;

    /* renamed from: b */
    final /* synthetic */ C1250p4 f1260b;

    C1038c0(C1149j jVar, C1250p4 p4Var) {
        this.f1259a = jVar;
        this.f1260b = p4Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C1261q qVar = (C1261q) obj;
        C1261q qVar2 = (C1261q) obj2;
        C1149j jVar = this.f1259a;
        C1250p4 p4Var = this.f1260b;
        if (qVar instanceof C1339v) {
            return !(qVar2 instanceof C1339v) ? 1 : 0;
        }
        if (qVar2 instanceof C1339v) {
            return -1;
        }
        if (jVar == null) {
            return qVar.mo12762d().compareTo(qVar2.mo12762d());
        }
        return (int) C1267q5.m2508a(jVar.mo12586a(p4Var, Arrays.asList(new C1261q[]{qVar, qVar2})).mo12761c().doubleValue());
    }
}
