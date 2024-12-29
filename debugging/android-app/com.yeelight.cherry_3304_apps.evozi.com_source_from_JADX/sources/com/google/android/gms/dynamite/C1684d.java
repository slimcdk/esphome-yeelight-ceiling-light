package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
final class C1684d implements DynamiteModule.C1676b {
    C1684d() {
    }

    /* renamed from: a */
    public final DynamiteModule.C1676b.C1678b mo11389a(Context context, String str, DynamiteModule.C1676b.C1677a aVar) {
        int i;
        DynamiteModule.C1676b.C1678b bVar = new DynamiteModule.C1676b.C1678b();
        bVar.f3214a = aVar.mo11390a(context, str);
        int b = aVar.mo11391b(context, str, true);
        bVar.f3215b = b;
        if (bVar.f3214a == 0 && b == 0) {
            i = 0;
        } else if (bVar.f3215b >= bVar.f3214a) {
            bVar.f3216c = 1;
            return bVar;
        } else {
            i = -1;
        }
        bVar.f3216c = i;
        return bVar;
    }
}
