package com.google.android.gms.internal.measurement;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.measurement.f */
public final class C1085f implements Iterable, C1261q, C1197m {

    /* renamed from: a */
    final SortedMap f1316a;

    /* renamed from: b */
    final Map f1317b;

    public C1085f() {
        this.f1316a = new TreeMap();
        this.f1317b = new TreeMap();
    }

    public C1085f(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo12758A(i, (C1261q) list.get(i));
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* renamed from: A */
    public final void mo12758A(int i, C1261q qVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (qVar == null) {
            this.f1316a.remove(Integer.valueOf(i));
        } else {
            this.f1316a.put(Integer.valueOf(i), qVar);
        }
    }

    /* renamed from: B */
    public final boolean mo12759B(int i) {
        if (i >= 0 && i <= ((Integer) this.f1316a.lastKey()).intValue()) {
            return this.f1316a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    /* renamed from: b */
    public final C1261q mo12760b() {
        Integer num;
        SortedMap sortedMap;
        C1261q qVar;
        C1085f fVar = new C1085f();
        for (Map.Entry entry : this.f1316a.entrySet()) {
            if (entry.getValue() instanceof C1197m) {
                sortedMap = fVar.f1316a;
                num = (Integer) entry.getKey();
                qVar = (C1261q) entry.getValue();
            } else {
                sortedMap = fVar.f1316a;
                num = (Integer) entry.getKey();
                qVar = ((C1261q) entry.getValue()).mo12760b();
            }
            sortedMap.put(num, qVar);
        }
        return fVar;
    }

    /* renamed from: c */
    public final Double mo12761c() {
        return this.f1316a.size() == 1 ? mo12773t(0).mo12761c() : this.f1316a.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    /* renamed from: d */
    public final String mo12762d() {
        return mo12775u(Constants.ACCEPT_TIME_SEPARATOR_SP);
    }

    /* renamed from: e */
    public final Boolean mo12763e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1085f)) {
            return false;
        }
        C1085f fVar = (C1085f) obj;
        if (mo12772r() != fVar.mo12772r()) {
            return false;
        }
        if (this.f1316a.isEmpty()) {
            return fVar.f1316a.isEmpty();
        }
        for (int intValue = ((Integer) this.f1316a.firstKey()).intValue(); intValue <= ((Integer) this.f1316a.lastKey()).intValue(); intValue++) {
            if (!mo12773t(intValue).equals(fVar.mo12773t(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final Iterator mo12765g() {
        return new C1053d(this, this.f1316a.keySet().iterator(), this.f1317b.keySet().iterator());
    }

    public final int hashCode() {
        return this.f1316a.hashCode() * 31;
    }

    public final Iterator iterator() {
        return new C1069e(this);
    }

    /* renamed from: j */
    public final boolean mo12768j(String str) {
        return "length".equals(str) || this.f1317b.containsKey(str);
    }

    /* renamed from: l */
    public final C1261q mo12637l(String str, C1250p4 p4Var, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? C1054d0.m1789a(str, this, p4Var, list) : C1165k.m2126a(this, new C1324u(str), p4Var, list);
    }

    /* renamed from: m */
    public final void mo12769m(String str, C1261q qVar) {
        if (qVar == null) {
            this.f1317b.remove(str);
        } else {
            this.f1317b.put(str, qVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.google.android.gms.internal.measurement.C1261q) r2.f1317b.get(r3);
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C1261q mo12770n(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.i r3 = new com.google.android.gms.internal.measurement.i
            int r0 = r2.mo12772r()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.mo12768j(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.f1317b
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.q r3 = (com.google.android.gms.internal.measurement.C1261q) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.q r3 = com.google.android.gms.internal.measurement.C1261q.f1536D
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1085f.mo12770n(java.lang.String):com.google.android.gms.internal.measurement.q");
    }

    /* renamed from: o */
    public final int mo12771o() {
        return this.f1316a.size();
    }

    /* renamed from: r */
    public final int mo12772r() {
        if (this.f1316a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f1316a.lastKey()).intValue() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.C1261q) r1.f1316a.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C1261q mo12773t(int r2) {
        /*
            r1 = this;
            int r0 = r1.mo12772r()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.mo12759B(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.f1316a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r2 = (com.google.android.gms.internal.measurement.C1261q) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.q r2 = com.google.android.gms.internal.measurement.C1261q.f1536D
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1085f.mo12773t(int):com.google.android.gms.internal.measurement.q");
    }

    public final String toString() {
        return mo12775u(Constants.ACCEPT_TIME_SEPARATOR_SP);
    }

    /* renamed from: u */
    public final String mo12775u(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f1316a.isEmpty()) {
            for (int i = 0; i < mo12772r(); i++) {
                C1261q t = mo12773t(i);
                sb.append(str);
                if (!(t instanceof C1339v) && !(t instanceof C1229o)) {
                    sb.append(t.mo12762d());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: v */
    public final Iterator mo12776v() {
        return this.f1316a.keySet().iterator();
    }

    /* renamed from: w */
    public final List mo12777w() {
        ArrayList arrayList = new ArrayList(mo12772r());
        for (int i = 0; i < mo12772r(); i++) {
            arrayList.add(mo12773t(i));
        }
        return arrayList;
    }

    /* renamed from: x */
    public final void mo12778x() {
        this.f1316a.clear();
    }

    /* renamed from: y */
    public final void mo12779y(int i, C1261q qVar) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= mo12772r()) {
            mo12758A(i, qVar);
        } else {
            for (int intValue = ((Integer) this.f1316a.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f1316a;
                Integer valueOf = Integer.valueOf(intValue);
                C1261q qVar2 = (C1261q) sortedMap.get(valueOf);
                if (qVar2 != null) {
                    mo12758A(intValue + 1, qVar2);
                    this.f1316a.remove(valueOf);
                }
            }
            mo12758A(i, qVar);
        }
    }

    /* renamed from: z */
    public final void mo12780z(int i) {
        int intValue = ((Integer) this.f1316a.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f1316a.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f1316a;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f1316a.put(valueOf, C1261q.f1536D);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f1316a.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f1316a;
                    Integer valueOf2 = Integer.valueOf(i);
                    C1261q qVar = (C1261q) sortedMap2.get(valueOf2);
                    if (qVar != null) {
                        this.f1316a.put(Integer.valueOf(i - 1), qVar);
                        this.f1316a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }
}
