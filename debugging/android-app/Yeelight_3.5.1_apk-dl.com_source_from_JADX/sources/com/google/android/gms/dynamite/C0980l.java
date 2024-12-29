package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.l */
final class C0980l implements DynamiteModule.C0966a {
    C0980l() {
    }

    /* renamed from: a */
    public final DynamiteModule.C0966a.C0968b mo12442a(Context context, String str, DynamiteModule.C0966a.C0967a aVar) {
        DynamiteModule.C0966a.C0968b bVar = new DynamiteModule.C0966a.C0968b();
        int b = aVar.mo12444b(context, str);
        bVar.f1206a = b;
        int i = 0;
        int a = b != 0 ? aVar.mo12443a(context, str, false) : aVar.mo12443a(context, str, true);
        bVar.f1207b = a;
        int i2 = bVar.f1206a;
        if (i2 != 0) {
            i = i2;
        } else if (a == 0) {
            bVar.f1208c = 0;
            return bVar;
        }
        if (a >= i) {
            bVar.f1208c = 1;
        } else {
            bVar.f1208c = -1;
        }
        return bVar;
    }
}
