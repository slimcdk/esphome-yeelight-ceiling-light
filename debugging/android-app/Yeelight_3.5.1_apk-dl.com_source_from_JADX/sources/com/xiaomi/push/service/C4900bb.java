package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.C4511ag;
import com.xiaomi.push.C4766hp;
import com.xiaomi.push.C4767hq;
import com.xiaomi.push.C4769hs;
import com.xiaomi.push.C4771hu;
import com.xiaomi.push.C4784ig;
import com.xiaomi.push.C4785ih;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.service.bb */
public class C4900bb {
    /* renamed from: a */
    public static int m15376a(C4898ba baVar, C4766hp hpVar) {
        int i = 1;
        if (C4901bc.f9519a[hpVar.ordinal()] != 1) {
            i = 0;
        }
        return baVar.mo29989a(hpVar, i);
    }

    /* renamed from: a */
    private static List<Pair<Integer, Object>> m15377a(List<C4771hu> list, boolean z) {
        if (C4511ag.m12849a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C4771hu next : list) {
            int a = next.mo29346a();
            C4767hq a2 = C4767hq.m14235a(next.mo29349b());
            if (a2 != null) {
                if (!z || !next.f8731a) {
                    int i = C4901bc.f9520b[a2.ordinal()];
                    arrayList.add(i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : new Pair(Integer.valueOf(a), Boolean.valueOf(next.mo29361g())) : new Pair(Integer.valueOf(a), next.mo29346a()) : new Pair(Integer.valueOf(a), Long.valueOf(next.mo29346a())) : new Pair(Integer.valueOf(a), Integer.valueOf(next.mo29351c())));
                } else {
                    arrayList.add(new Pair(Integer.valueOf(a), (Object) null));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m15378a(C4898ba baVar, C4784ig igVar) {
        baVar.mo29994a(m15377a(igVar.mo29580a(), true));
        baVar.mo29997b();
    }

    /* renamed from: a */
    public static void m15379a(C4898ba baVar, C4785ih ihVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C4769hs next : ihVar.mo29586a()) {
            arrayList.add(new Pair(next.mo29336a(), Integer.valueOf(next.mo29336a())));
            List<Pair<Integer, Object>> a = m15377a(next.f8657a, false);
            if (!C4511ag.m12849a(a)) {
                arrayList2.addAll(a);
            }
        }
        baVar.mo29995a((List<Pair<C4766hp, Integer>>) arrayList, (List<Pair<Integer, Object>>) arrayList2);
        baVar.mo29997b();
    }
}
