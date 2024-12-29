package com.xiaomi.push.service;

import com.xiaomi.push.C4692fj;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.service.aq */
final class C4882aq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f9480a;

    /* renamed from: a */
    final /* synthetic */ boolean f9481a;

    C4882aq(List list, boolean z) {
        this.f9480a = list;
        this.f9481a = z;
    }

    public void run() {
        int i;
        boolean a = C4881ap.m15263a("www.baidu.com:80");
        Iterator it = this.f9480a.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            a = a || C4881ap.m15263a((String) it.next());
            if (a && !this.f9481a) {
                break;
            }
        }
        if (!a) {
            i = 2;
        }
        C4692fj.m13849a(i);
    }
}
