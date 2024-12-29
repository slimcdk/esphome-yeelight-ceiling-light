package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.C1700a1;
import com.google.android.gms.internal.measurement.C1847j9;
import com.google.android.gms.internal.measurement.C1889m4;
import com.google.android.gms.internal.measurement.C1963r0;
import com.google.android.gms.internal.measurement.C1979s0;
import com.google.android.gms.internal.measurement.C2088z0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.ca */
final class C2140ca {

    /* renamed from: a */
    private String f4009a;

    /* renamed from: b */
    private boolean f4010b;

    /* renamed from: c */
    private C2088z0 f4011c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f4012d;

    /* renamed from: e */
    private BitSet f4013e;

    /* renamed from: f */
    private Map<Integer, Long> f4014f;

    /* renamed from: g */
    private Map<Integer, List<Long>> f4015g;

    /* renamed from: h */
    private final /* synthetic */ C2116aa f4016h;

    private C2140ca(C2116aa aaVar, String str) {
        this.f4016h = aaVar;
        this.f4009a = str;
        this.f4010b = true;
        this.f4012d = new BitSet();
        this.f4013e = new BitSet();
        this.f4014f = new ArrayMap();
        this.f4015g = new ArrayMap();
    }

    private C2140ca(C2116aa aaVar, String str, C2088z0 z0Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f4016h = aaVar;
        this.f4009a = str;
        this.f4012d = bitSet;
        this.f4013e = bitSet2;
        this.f4014f = map;
        this.f4015g = new ArrayMap();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.f4015g.put(next, arrayList);
            }
        }
        this.f4010b = false;
        this.f4011c = z0Var;
    }

    /* synthetic */ C2140ca(C2116aa aaVar, String str, C2088z0 z0Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C2400z9 z9Var) {
        this(aaVar, str, z0Var, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ C2140ca(C2116aa aaVar, String str, C2400z9 z9Var) {
        this(aaVar, str);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public final C1963r0 mo12563a(int i) {
        ArrayList arrayList;
        List list;
        C1963r0.C1964a Q = C1963r0.m5863Q();
        Q.mo11973u(i);
        Q.mo11976x(this.f4010b);
        C2088z0 z0Var = this.f4011c;
        if (z0Var != null) {
            Q.mo11975w(z0Var);
        }
        C2088z0.C2089a b0 = C2088z0.m6633b0();
        b0.mo12351z(C2290p9.m7339D(this.f4012d));
        b0.mo12348w(C2290p9.m7339D(this.f4013e));
        if (this.f4014f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f4014f.size());
            for (Integer intValue : this.f4014f.keySet()) {
                int intValue2 = intValue.intValue();
                C1979s0.C1980a H = C1979s0.m5928H();
                H.mo12050u(intValue2);
                H.mo12051v(this.f4014f.get(Integer.valueOf(intValue2)).longValue());
                arrayList.add((C1979s0) ((C1889m4) H.mo11851I()));
            }
        }
        b0.mo12344A(arrayList);
        if (this.f4015g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f4015g.size());
            for (Integer next : this.f4015g.keySet()) {
                C1700a1.C1701a J = C1700a1.m4698J();
                J.mo11419u(next.intValue());
                List list2 = this.f4015g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    J.mo11420v(list2);
                }
                arrayList2.add((C1700a1) ((C1889m4) J.mo11851I()));
            }
            list = arrayList2;
        }
        b0.mo12345B(list);
        Q.mo11974v(b0);
        return (C1963r0) ((C1889m4) Q.mo11851I());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12564c(@NonNull C2152da daVar) {
        int a = daVar.mo12646a();
        Boolean bool = daVar.f4073c;
        if (bool != null) {
            this.f4013e.set(a, bool.booleanValue());
        }
        Boolean bool2 = daVar.f4074d;
        if (bool2 != null) {
            this.f4012d.set(a, bool2.booleanValue());
        }
        if (daVar.f4075e != null) {
            Long l = this.f4014f.get(Integer.valueOf(a));
            long longValue = daVar.f4075e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f4014f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (daVar.f4076f != null) {
            List list = this.f4015g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList();
                this.f4015g.put(Integer.valueOf(a), list);
            }
            if (daVar.mo12647i()) {
                list.clear();
            }
            if (C1847j9.m5293a() && this.f4016h.mo13112m().mo12480y(this.f4009a, C2302r.f4516h0) && daVar.mo12648j()) {
                list.clear();
            }
            if (!C1847j9.m5293a() || !this.f4016h.mo13112m().mo12480y(this.f4009a, C2302r.f4516h0)) {
                list.add(Long.valueOf(daVar.f4076f.longValue() / 1000));
                return;
            }
            long longValue2 = daVar.f4076f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }
}
