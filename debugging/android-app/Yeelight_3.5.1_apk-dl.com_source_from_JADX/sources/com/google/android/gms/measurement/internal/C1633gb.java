package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.C1042c4;
import com.google.android.gms.internal.measurement.C1058d4;
import com.google.android.gms.internal.measurement.C1074e4;
import com.google.android.gms.internal.measurement.C1090f4;
import com.google.android.gms.internal.measurement.C1162jc;
import com.google.android.gms.internal.measurement.C1359w4;
import com.google.android.gms.internal.measurement.C1374x4;
import com.google.android.gms.internal.measurement.C1389y4;
import com.google.android.gms.internal.measurement.C1404z4;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.gb */
final class C1633gb {

    /* renamed from: a */
    private String f2121a;

    /* renamed from: b */
    private boolean f2122b;

    /* renamed from: c */
    private C1374x4 f2123c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f2124d;

    /* renamed from: e */
    private BitSet f2125e;

    /* renamed from: f */
    private Map f2126f;

    /* renamed from: g */
    private Map f2127g;

    /* renamed from: h */
    final /* synthetic */ C1556b f2128h;

    /* synthetic */ C1633gb(C1556b bVar, String str, C1374x4 x4Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C1620fb fbVar) {
        this.f2128h = bVar;
        this.f2121a = str;
        this.f2124d = bitSet;
        this.f2125e = bitSet2;
        this.f2126f = map;
        this.f2127g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f2127g.put(num, arrayList);
        }
        this.f2122b = false;
        this.f2123c = x4Var;
    }

    /* synthetic */ C1633gb(C1556b bVar, String str, C1620fb fbVar) {
        this.f2128h = bVar;
        this.f2121a = str;
        this.f2122b = true;
        this.f2124d = new BitSet();
        this.f2125e = new BitSet();
        this.f2126f = new ArrayMap();
        this.f2127g = new ArrayMap();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public final C1058d4 mo14212a(int i) {
        ArrayList arrayList;
        List list;
        C1042c4 y = C1058d4.m1800y();
        y.mo12627t(i);
        y.mo12629w(this.f2122b);
        C1374x4 x4Var = this.f2123c;
        if (x4Var != null) {
            y.mo12630x(x4Var);
        }
        C1359w4 D = C1374x4.m3213D();
        D.mo13451u(C1794ta.m4743H(this.f2124d));
        D.mo13453x(C1794ta.m4743H(this.f2125e));
        Map map = this.f2126f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f2126f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = (Long) this.f2126f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C1074e4 z = C1090f4.m1942z();
                    z.mo12741u(intValue2);
                    z.mo12740t(l.longValue());
                    arrayList2.add((C1090f4) z.mo12838q());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            D.mo13450t(arrayList);
        }
        Map map2 = this.f2127g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f2127g.keySet()) {
                C1389y4 A = C1404z4.m3390A();
                A.mo13506u(num.intValue());
                List list2 = (List) this.f2127g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    A.mo13505t(list2);
                }
                arrayList3.add((C1404z4) A.mo12838q());
            }
            list = arrayList3;
        }
        D.mo13452w(list);
        y.mo12628u(D);
        return (C1058d4) y.mo12838q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14213c(@NonNull C1685kb kbVar) {
        int a = kbVar.mo14292a();
        Boolean bool = kbVar.f2245c;
        if (bool != null) {
            this.f2125e.set(a, bool.booleanValue());
        }
        Boolean bool2 = kbVar.f2246d;
        if (bool2 != null) {
            this.f2124d.set(a, bool2.booleanValue());
        }
        if (kbVar.f2247e != null) {
            Map map = this.f2126f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = kbVar.f2247e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f2126f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (kbVar.f2248f != null) {
            Map map2 = this.f2127g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f2127g.put(valueOf2, list);
            }
            if (kbVar.mo14294c()) {
                list.clear();
            }
            C1162jc.m2121b();
            C1621g z = this.f2128h.f2143a.mo14402z();
            String str = this.f2121a;
            C1715n3 n3Var = C1727o3.f2427Y;
            if (z.mo14163B(str, n3Var) && kbVar.mo14293b()) {
                list.clear();
            }
            C1162jc.m2121b();
            boolean B = this.f2128h.f2143a.mo14402z().mo14163B(this.f2121a, n3Var);
            Long valueOf3 = Long.valueOf(kbVar.f2248f.longValue() / 1000);
            if (!B) {
                list.add(valueOf3);
            } else if (!list.contains(valueOf3)) {
                list.add(valueOf3);
            }
        }
    }
}
