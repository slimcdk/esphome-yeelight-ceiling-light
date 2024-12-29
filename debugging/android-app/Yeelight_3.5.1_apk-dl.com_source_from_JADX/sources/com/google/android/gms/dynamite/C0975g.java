package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.g */
final class C0975g implements DynamiteModule.C0966a {
    C0975g() {
    }

    /* renamed from: a */
    public final DynamiteModule.C0966a.C0968b mo12442a(Context context, String str, DynamiteModule.C0966a.C0967a aVar) {
        DynamiteModule.C0966a.C0968b bVar = new DynamiteModule.C0966a.C0968b();
        int b = aVar.mo12444b(context, str);
        bVar.f1206a = b;
        if (b != 0) {
            bVar.f1208c = -1;
        } else {
            int a = aVar.mo12443a(context, str, true);
            bVar.f1207b = a;
            if (a != 0) {
                bVar.f1208c = 1;
            }
        }
        return bVar;
    }
}
