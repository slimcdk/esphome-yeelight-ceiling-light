package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.g7 */
final class C1109g7 implements Comparator {
    C1109g7() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjb zzjb = (zzjb) obj;
        zzjb zzjb2 = (zzjb) obj2;
        C1093f7 f7Var = new C1093f7(zzjb);
        C1093f7 f7Var2 = new C1093f7(zzjb2);
        while (f7Var.hasNext() && f7Var2.hasNext()) {
            int compareTo = Integer.valueOf(f7Var.zza() & 255).compareTo(Integer.valueOf(f7Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzjb.zzd()).compareTo(Integer.valueOf(zzjb2.zzd()));
    }
}
