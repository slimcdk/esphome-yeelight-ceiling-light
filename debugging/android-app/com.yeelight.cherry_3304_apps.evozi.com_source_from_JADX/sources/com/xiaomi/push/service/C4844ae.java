package com.xiaomi.push.service;

import com.xiaomi.push.C4731hg;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.service.ae */
final class C4844ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f9952a;

    /* renamed from: a */
    final /* synthetic */ boolean f9953a;

    C4844ae(List list, boolean z) {
        this.f9952a = list;
        this.f9953a = z;
    }

    public void run() {
        int i;
        boolean a = C4843ad.m15532a("www.baidu.com:80");
        Iterator it = this.f9952a.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            a = a || C4843ad.m15532a((String) it.next());
            if (a && !this.f9953a) {
                break;
            }
        }
        if (!a) {
            i = 2;
        }
        C4731hg.m14523a(i);
    }
}
