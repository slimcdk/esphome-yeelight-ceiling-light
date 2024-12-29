package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.xiaomi.push.db */
class C4591db extends C4582cv {

    /* renamed from: a */
    C4582cv f8370a;

    /* renamed from: a */
    final /* synthetic */ C4586cz f8371a;

    /* renamed from: b */
    final /* synthetic */ C4582cv f8372b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4591db(C4586cz czVar, String str, C4582cv cvVar) {
        super(str);
        this.f8371a = czVar;
        this.f8372b = cvVar;
        C4582cv cvVar2 = this.f8372b;
        this.f8370a = cvVar2;
        this.f8341b = this.f8341b;
        if (cvVar2 != null) {
            this.f8345f = cvVar2.f8345f;
        }
    }

    /* renamed from: a */
    public synchronized ArrayList<String> mo24865a(boolean z) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        if (this.f8370a != null) {
            arrayList.addAll(this.f8370a.mo24865a(true));
        }
        synchronized (C4586cz.f8358b) {
            C4582cv cvVar = C4586cz.f8358b.get(this.f8341b);
            if (cvVar != null) {
                Iterator<String> it = cvVar.mo24865a(true).iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (arrayList.indexOf(next) == -1) {
                        arrayList.add(next);
                    }
                }
                arrayList.remove(this.f8341b);
                arrayList.add(this.f8341b);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void mo24872a(String str, C4581cu cuVar) {
        if (this.f8370a != null) {
            this.f8370a.mo24872a(str, cuVar);
        }
    }

    /* renamed from: b */
    public boolean mo24878b() {
        return false;
    }
}
