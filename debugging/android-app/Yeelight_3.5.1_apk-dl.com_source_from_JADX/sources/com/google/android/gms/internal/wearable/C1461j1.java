package com.google.android.gms.internal.wearable;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.wearable.j1 */
final class C1461j1 {
    C1461j1() {
    }

    /* renamed from: a */
    public static final int m3576a(int i, Object obj, Object obj2) {
        zzcr zzcr = (zzcr) obj;
        C1456i1 i1Var = (C1456i1) obj2;
        if (zzcr.isEmpty()) {
            return 0;
        }
        Iterator it = zzcr.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m3577b(Object obj, Object obj2) {
        zzcr zzcr = (zzcr) obj;
        zzcr zzcr2 = (zzcr) obj2;
        if (!zzcr2.isEmpty()) {
            if (!zzcr.zze()) {
                zzcr = zzcr.zzc();
            }
            zzcr.zzb(zzcr2);
        }
        return zzcr;
    }
}
