package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p */
public final class C1245p extends C1149j {

    /* renamed from: c */
    protected final List f1488c;

    /* renamed from: d */
    protected final List f1489d;

    /* renamed from: e */
    protected C1250p4 f1490e;

    private C1245p(C1245p pVar) {
        super(pVar.f1380a);
        ArrayList arrayList = new ArrayList(pVar.f1488c.size());
        this.f1488c = arrayList;
        arrayList.addAll(pVar.f1488c);
        ArrayList arrayList2 = new ArrayList(pVar.f1489d.size());
        this.f1489d = arrayList2;
        arrayList2.addAll(pVar.f1489d);
        this.f1490e = pVar.f1490e;
    }

    public C1245p(String str, List list, List list2, C1250p4 p4Var) {
        super(str);
        this.f1488c = new ArrayList();
        this.f1490e = p4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f1488c.add(((C1261q) it.next()).mo12762d());
            }
        }
        this.f1489d = new ArrayList(list2);
    }

    /* renamed from: a */
    public final C1261q mo12586a(C1250p4 p4Var, List list) {
        C1261q qVar;
        String str;
        C1250p4 a = this.f1490e.mo13061a();
        for (int i = 0; i < this.f1488c.size(); i++) {
            if (i < list.size()) {
                str = (String) this.f1488c.get(i);
                qVar = p4Var.mo13062b((C1261q) list.get(i));
            } else {
                str = (String) this.f1488c.get(i);
                qVar = C1261q.f1536D;
            }
            a.mo13065e(str, qVar);
        }
        for (C1261q qVar2 : this.f1489d) {
            C1261q b = a.mo13062b(qVar2);
            if (b instanceof C1277r) {
                b = a.mo13062b(qVar2);
            }
            if (b instanceof C1117h) {
                return ((C1117h) b).mo12847a();
            }
        }
        return C1261q.f1536D;
    }

    /* renamed from: b */
    public final C1261q mo12760b() {
        return new C1245p(this);
    }
}
