package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.c */
final class C1683c implements DynamiteModule.C1676b {
    C1683c() {
    }

    /* renamed from: a */
    public final DynamiteModule.C1676b.C1678b mo11389a(Context context, String str, DynamiteModule.C1676b.C1677a aVar) {
        DynamiteModule.C1676b.C1678b bVar = new DynamiteModule.C1676b.C1678b();
        int a = aVar.mo11390a(context, str);
        bVar.f3214a = a;
        bVar.f3215b = a != 0 ? aVar.mo11391b(context, str, false) : aVar.mo11391b(context, str, true);
        if (bVar.f3214a == 0 && bVar.f3215b == 0) {
            bVar.f3216c = 0;
        } else if (bVar.f3214a >= bVar.f3215b) {
            bVar.f3216c = -1;
        } else {
            bVar.f3216c = 1;
        }
        return bVar;
    }
}
