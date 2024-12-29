package com.xiaomi.push;

import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4583cj;
import java.util.ArrayList;

/* renamed from: com.xiaomi.push.ck */
class C4589ck extends C4516al.C4517a {

    /* renamed from: a */
    final /* synthetic */ C4583cj f7725a;

    C4589ck(C4583cj cjVar) {
        this.f7725a = cjVar;
    }

    /* renamed from: a */
    public String mo28479a() {
        return "100957";
    }

    public void run() {
        synchronized (this.f7725a.f7703a) {
            if (this.f7725a.f7703a.size() > 0) {
                if (this.f7725a.f7703a.size() > 1) {
                    C4583cj cjVar = this.f7725a;
                    cjVar.mo28835a((ArrayList<C4583cj.C4584a>) cjVar.f7703a);
                } else {
                    C4583cj cjVar2 = this.f7725a;
                    cjVar2.mo28836b((C4583cj.C4584a) cjVar2.f7703a.get(0));
                }
                this.f7725a.f7703a.clear();
                System.gc();
            }
        }
    }
}
