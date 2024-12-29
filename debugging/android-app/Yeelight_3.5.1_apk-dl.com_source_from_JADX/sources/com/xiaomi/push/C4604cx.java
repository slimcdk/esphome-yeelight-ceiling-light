package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.xiaomi.push.cx */
class C4604cx extends C4596cr {

    /* renamed from: a */
    C4596cr f7769a;

    /* renamed from: a */
    final /* synthetic */ C4600cv f7770a;

    /* renamed from: b */
    final /* synthetic */ C4596cr f7771b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4604cx(C4600cv cvVar, String str, C4596cr crVar) {
        super(str);
        this.f7770a = cvVar;
        this.f7771b = crVar;
        this.f7769a = crVar;
        this.f7740b = this.f7740b;
        if (crVar != null) {
            this.f7744f = crVar.f7744f;
        }
    }

    /* renamed from: a */
    public synchronized ArrayList<String> mo28854a(boolean z) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        C4596cr crVar = this.f7769a;
        if (crVar != null) {
            arrayList.addAll(crVar.mo28854a(true));
        }
        Map<String, C4596cr> map = C4600cv.f7757b;
        synchronized (map) {
            C4596cr crVar2 = map.get(this.f7740b);
            if (crVar2 != null) {
                Iterator<String> it = crVar2.mo28854a(true).iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (arrayList.indexOf(next) == -1) {
                        arrayList.add(next);
                    }
                }
                arrayList.remove(this.f7740b);
                arrayList.add(this.f7740b);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void mo28861a(String str, C4595cq cqVar) {
        C4596cr crVar = this.f7769a;
        if (crVar != null) {
            crVar.mo28861a(str, cqVar);
        }
    }

    /* renamed from: b */
    public boolean mo28867b() {
        return false;
    }
}
