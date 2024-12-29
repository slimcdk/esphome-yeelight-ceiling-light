package com.google.android.gms.internal.wearable;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.wearable.n */
final class C1479n implements Comparator<zzau> {
    C1479n() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzau zzau = (zzau) obj;
        zzau zzau2 = (zzau) obj2;
        C1474m mVar = new C1474m(zzau);
        C1474m mVar2 = new C1474m(zzau2);
        while (mVar.hasNext() && mVar2.hasNext()) {
            int compare = Integer.compare(mVar.zza() & 255, mVar2.zza() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzau.zzc(), zzau2.zzc());
    }
}
