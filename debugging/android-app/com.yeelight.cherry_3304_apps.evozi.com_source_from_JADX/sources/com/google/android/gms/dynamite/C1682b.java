package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
final class C1682b implements DynamiteModule.C1676b {
    C1682b() {
    }

    /* renamed from: a */
    public final DynamiteModule.C1676b.C1678b mo11389a(Context context, String str, DynamiteModule.C1676b.C1677a aVar) {
        DynamiteModule.C1676b.C1678b bVar = new DynamiteModule.C1676b.C1678b();
        int a = aVar.mo11390a(context, str);
        bVar.f3214a = a;
        if (a != 0) {
            bVar.f3216c = -1;
        } else {
            int b = aVar.mo11391b(context, str, true);
            bVar.f3215b = b;
            if (b != 0) {
                bVar.f3216c = 1;
            }
        }
        return bVar;
    }
}
