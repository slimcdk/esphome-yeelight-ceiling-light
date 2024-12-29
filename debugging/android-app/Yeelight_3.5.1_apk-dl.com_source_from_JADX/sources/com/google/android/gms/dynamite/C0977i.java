package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.i */
final class C0977i implements DynamiteModule.C0966a {
    C0977i() {
    }

    /* renamed from: a */
    public final DynamiteModule.C0966a.C0968b mo12442a(Context context, String str, DynamiteModule.C0966a.C0967a aVar) {
        DynamiteModule.C0966a.C0968b bVar = new DynamiteModule.C0966a.C0968b();
        bVar.f1206a = aVar.mo12444b(context, str);
        int a = aVar.mo12443a(context, str, true);
        bVar.f1207b = a;
        int i = bVar.f1206a;
        if (i == 0) {
            if (a == 0) {
                bVar.f1208c = 0;
                return bVar;
            }
            i = 0;
        }
        if (i >= a) {
            bVar.f1208c = -1;
        } else {
            bVar.f1208c = 1;
        }
        return bVar;
    }
}
