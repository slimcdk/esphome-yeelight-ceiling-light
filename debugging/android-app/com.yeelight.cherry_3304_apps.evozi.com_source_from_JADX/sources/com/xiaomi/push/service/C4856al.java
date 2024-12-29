package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.C4493ad;
import com.xiaomi.push.C4745hs;
import com.xiaomi.push.C4746ht;
import com.xiaomi.push.C4748hv;
import com.xiaomi.push.C4750hx;
import com.xiaomi.push.C4763ij;
import com.xiaomi.push.C4764ik;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.service.al */
public class C4856al {
    /* renamed from: a */
    public static int m15580a(C4854ak akVar, C4745hs hsVar) {
        String a = m15581a(hsVar);
        int i = 1;
        if (C4857am.f9971a[hsVar.ordinal()] != 1) {
            i = 0;
        }
        return akVar.f9969a.getInt(a, i);
    }

    /* renamed from: a */
    private static String m15581a(C4745hs hsVar) {
        return "oc_version_" + hsVar.mo25292a();
    }

    /* renamed from: a */
    private static List<Pair<Integer, Object>> m15582a(List<C4750hx> list, boolean z) {
        if (C4493ad.m13262a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C4750hx next : list) {
            int a = next.mo25315a();
            C4746ht a2 = C4746ht.m14608a(next.mo25318b());
            if (a2 != null) {
                if (!z || !next.f9265a) {
                    int i = C4857am.f9972b[a2.ordinal()];
                    arrayList.add(i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : new Pair(Integer.valueOf(a), Boolean.valueOf(next.mo25330g())) : new Pair(Integer.valueOf(a), next.mo25315a()) : new Pair(Integer.valueOf(a), Long.valueOf(next.mo25315a())) : new Pair(Integer.valueOf(a), Integer.valueOf(next.mo25320c())));
                } else {
                    arrayList.add(new Pair(Integer.valueOf(a), (Object) null));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m15583a(C4854ak akVar, C4745hs hsVar, int i) {
        akVar.f9969a.edit().putInt(m15581a(hsVar), i).commit();
    }

    /* renamed from: a */
    public static void m15584a(C4854ak akVar, C4763ij ijVar) {
        akVar.mo25913b(m15582a(ijVar.mo25543a(), true));
        akVar.mo25912b();
    }

    /* renamed from: a */
    public static void m15585a(C4854ak akVar, C4764ik ikVar) {
        for (C4748hv next : ikVar.mo25549a()) {
            if (next.mo25305a() > m15580a(akVar, next.mo25305a())) {
                m15583a(akVar, next.mo25305a(), next.mo25305a());
                akVar.mo25910a(m15582a(next.f9206a, false));
            }
        }
        akVar.mo25912b();
    }
}
