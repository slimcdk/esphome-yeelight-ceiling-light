package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.C4503al;
import java.util.ArrayList;

/* renamed from: com.xiaomi.push.gy */
final class C4720gy extends C4503al.C4505b {

    /* renamed from: a */
    final /* synthetic */ Context f8927a;

    C4720gy(Context context) {
        this.f8927a = context;
    }

    /* renamed from: b */
    public void mo24740b() {
        ArrayList arrayList;
        synchronized (C4718gx.m14473a()) {
            arrayList = new ArrayList(C4718gx.m14473a());
            C4718gx.m14473a().clear();
        }
        C4718gx.m14483b(this.f8927a, arrayList);
    }
}
