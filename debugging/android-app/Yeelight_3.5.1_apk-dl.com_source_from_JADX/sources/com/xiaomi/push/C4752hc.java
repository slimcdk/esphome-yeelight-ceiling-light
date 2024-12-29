package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.C4521ao;
import java.util.ArrayList;

/* renamed from: com.xiaomi.push.hc */
final class C4752hc extends C4521ao.C4523b {

    /* renamed from: a */
    final /* synthetic */ Context f8397a;

    C4752hc(Context context) {
        this.f8397a = context;
    }

    /* renamed from: b */
    public void mo28749b() {
        ArrayList arrayList;
        synchronized (C4750hb.m14142a()) {
            arrayList = new ArrayList(C4750hb.m14142a());
            C4750hb.m14142a().clear();
        }
        C4750hb.m14152b(this.f8397a, arrayList);
    }
}
