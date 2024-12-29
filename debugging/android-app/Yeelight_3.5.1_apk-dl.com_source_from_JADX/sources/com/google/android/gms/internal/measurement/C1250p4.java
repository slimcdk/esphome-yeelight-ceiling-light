package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p4 */
public final class C1250p4 {

    /* renamed from: a */
    public final C1250p4 f1499a;

    /* renamed from: b */
    final C1384y f1500b;

    /* renamed from: c */
    final Map f1501c = new HashMap();

    /* renamed from: d */
    final Map f1502d = new HashMap();

    public C1250p4(C1250p4 p4Var, C1384y yVar) {
        this.f1499a = p4Var;
        this.f1500b = yVar;
    }

    /* renamed from: a */
    public final C1250p4 mo13061a() {
        return new C1250p4(this, this.f1500b);
    }

    /* renamed from: b */
    public final C1261q mo13062b(C1261q qVar) {
        return this.f1500b.mo13502a(this, qVar);
    }

    /* renamed from: c */
    public final C1261q mo13063c(C1085f fVar) {
        C1261q qVar = C1261q.f1536D;
        Iterator v = fVar.mo12776v();
        while (v.hasNext()) {
            qVar = this.f1500b.mo13502a(this, fVar.mo12773t(((Integer) v.next()).intValue()));
            if (qVar instanceof C1117h) {
                break;
            }
        }
        return qVar;
    }

    /* renamed from: d */
    public final C1261q mo13064d(String str) {
        if (this.f1501c.containsKey(str)) {
            return (C1261q) this.f1501c.get(str);
        }
        C1250p4 p4Var = this.f1499a;
        if (p4Var != null) {
            return p4Var.mo13064d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo13065e(String str, C1261q qVar) {
        if (!this.f1502d.containsKey(str)) {
            if (qVar == null) {
                this.f1501c.remove(str);
            } else {
                this.f1501c.put(str, qVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo13066f(String str, C1261q qVar) {
        mo13065e(str, qVar);
        this.f1502d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo13067g(String str, C1261q qVar) {
        C1250p4 p4Var;
        if (!this.f1501c.containsKey(str) && (p4Var = this.f1499a) != null && p4Var.mo13068h(str)) {
            this.f1499a.mo13067g(str, qVar);
        } else if (!this.f1502d.containsKey(str)) {
            if (qVar == null) {
                this.f1501c.remove(str);
            } else {
                this.f1501c.put(str, qVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo13068h(String str) {
        if (this.f1501c.containsKey(str)) {
            return true;
        }
        C1250p4 p4Var = this.f1499a;
        if (p4Var != null) {
            return p4Var.mo13068h(str);
        }
        return false;
    }
}
