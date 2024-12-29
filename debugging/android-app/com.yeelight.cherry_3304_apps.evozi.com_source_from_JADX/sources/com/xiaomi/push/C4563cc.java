package com.xiaomi.push;

import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4557cb;
import java.util.ArrayList;

/* renamed from: com.xiaomi.push.cc */
class C4563cc extends C4498ai.C4499a {

    /* renamed from: a */
    final /* synthetic */ C4557cb f8294a;

    C4563cc(C4557cb cbVar) {
        this.f8294a = cbVar;
    }

    /* renamed from: a */
    public int mo22734a() {
        return 100957;
    }

    public void run() {
        synchronized (this.f8294a.f8272a) {
            if (this.f8294a.f8272a.size() > 0) {
                if (this.f8294a.f8272a.size() > 1) {
                    this.f8294a.mo24827a((ArrayList<C4557cb.C4558a>) this.f8294a.f8272a);
                } else {
                    this.f8294a.mo24828b((C4557cb.C4558a) this.f8294a.f8272a.get(0));
                }
                this.f8294a.f8272a.clear();
                System.gc();
            }
        }
    }
}
