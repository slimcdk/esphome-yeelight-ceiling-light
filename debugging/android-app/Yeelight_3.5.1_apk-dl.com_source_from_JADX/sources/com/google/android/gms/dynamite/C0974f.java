package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
final class C0974f implements DynamiteModule.C0966a {
    C0974f() {
    }

    /* renamed from: a */
    public final DynamiteModule.C0966a.C0968b mo12442a(Context context, String str, DynamiteModule.C0966a.C0967a aVar) {
        DynamiteModule.C0966a.C0968b bVar = new DynamiteModule.C0966a.C0968b();
        int a = aVar.mo12443a(context, str, true);
        bVar.f1207b = a;
        if (a != 0) {
            bVar.f1208c = 1;
        } else {
            int b = aVar.mo12444b(context, str);
            bVar.f1206a = b;
            if (b != 0) {
                bVar.f1208c = -1;
            }
        }
        return bVar;
    }
}
