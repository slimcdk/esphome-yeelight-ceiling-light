package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.g9 */
final class C1111g9 {
    C1111g9() {
    }

    /* renamed from: a */
    public static final int m2016a(int i, Object obj, Object obj2) {
        zzld zzld = (zzld) obj;
        C1095f9 f9Var = (C1095f9) obj2;
        if (zzld.isEmpty()) {
            return 0;
        }
        Iterator it = zzld.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m2017b(Object obj, Object obj2) {
        zzld zzld = (zzld) obj;
        zzld zzld2 = (zzld) obj2;
        if (!zzld2.isEmpty()) {
            if (!zzld.zze()) {
                zzld = zzld.zzb();
            }
            zzld.zzd(zzld2);
        }
        return zzld;
    }
}
