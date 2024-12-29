package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q5 */
public final class C1267q5 {
    /* renamed from: a */
    public static double m2508a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        double d2 = (double) (d > 0.0d ? 1 : -1);
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return d2 * floor;
    }

    /* renamed from: b */
    public static int m2509b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        double d2 = (double) (d > 0.0d ? 1 : -1);
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return (int) ((long) ((d2 * floor) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m2510c(C1250p4 p4Var) {
        int b = m2509b(p4Var.mo13064d("runtime.counter").mo12761c().doubleValue() + 1.0d);
        if (b <= 1000000) {
            p4Var.mo13067g("runtime.counter", new C1133i(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m2511d(double d) {
        return ((long) m2509b(d)) & 4294967295L;
    }

    /* renamed from: e */
    public static zzbl m2512e(String str) {
        zzbl zzbl = null;
        if (str != null && !str.isEmpty()) {
            zzbl = zzbl.zza(Integer.parseInt(str));
        }
        if (zzbl != null) {
            return zzbl;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m2513f(C1261q qVar) {
        if (C1261q.f1537E.equals(qVar)) {
            return null;
        }
        if (C1261q.f1536D.equals(qVar)) {
            return "";
        }
        if (qVar instanceof C1213n) {
            return m2514g((C1213n) qVar);
        }
        if (!(qVar instanceof C1085f)) {
            return !qVar.mo12761c().isNaN() ? qVar.mo12761c() : qVar.mo12762d();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C1085f) qVar).iterator();
        while (it.hasNext()) {
            Object f = m2513f((C1261q) it.next());
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static Map m2514g(C1213n nVar) {
        HashMap hashMap = new HashMap();
        for (String str : nVar.mo12997a()) {
            Object f = m2513f(nVar.mo12770n(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m2515h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m2516i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m2517j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m2518k(C1261q qVar) {
        if (qVar == null) {
            return false;
        }
        Double c = qVar.mo12761c();
        return !c.isNaN() && c.doubleValue() >= 0.0d && c.equals(Double.valueOf(Math.floor(c.doubleValue())));
    }

    /* renamed from: l */
    public static boolean m2519l(C1261q qVar, C1261q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof C1339v) || (qVar instanceof C1229o)) {
            return true;
        }
        if (!(qVar instanceof C1133i)) {
            return qVar instanceof C1324u ? qVar.mo12762d().equals(qVar2.mo12762d()) : qVar instanceof C1101g ? qVar.mo12763e().equals(qVar2.mo12763e()) : qVar == qVar2;
        }
        if (Double.isNaN(qVar.mo12761c().doubleValue()) || Double.isNaN(qVar2.mo12761c().doubleValue())) {
            return false;
        }
        return qVar.mo12761c().equals(qVar2.mo12761c());
    }
}
