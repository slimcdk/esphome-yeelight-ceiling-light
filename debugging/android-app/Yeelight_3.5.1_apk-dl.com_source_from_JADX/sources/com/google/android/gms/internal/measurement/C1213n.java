package com.google.android.gms.internal.measurement;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n */
public class C1213n implements C1261q, C1197m {

    /* renamed from: a */
    final Map f1432a = new HashMap();

    /* renamed from: a */
    public final List mo12997a() {
        return new ArrayList(this.f1432a.keySet());
    }

    /* renamed from: b */
    public final C1261q mo12760b() {
        String str;
        Map map;
        C1261q qVar;
        C1213n nVar = new C1213n();
        for (Map.Entry entry : this.f1432a.entrySet()) {
            if (entry.getValue() instanceof C1197m) {
                map = nVar.f1432a;
                str = (String) entry.getKey();
                qVar = (C1261q) entry.getValue();
            } else {
                map = nVar.f1432a;
                str = (String) entry.getKey();
                qVar = ((C1261q) entry.getValue()).mo12760b();
            }
            map.put(str, qVar);
        }
        return nVar;
    }

    /* renamed from: c */
    public final Double mo12761c() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: d */
    public final String mo12762d() {
        return "[object Object]";
    }

    /* renamed from: e */
    public final Boolean mo12763e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1213n)) {
            return false;
        }
        return this.f1432a.equals(((C1213n) obj).f1432a);
    }

    /* renamed from: g */
    public final Iterator mo12765g() {
        return C1165k.m2127b(this.f1432a);
    }

    public final int hashCode() {
        return this.f1432a.hashCode();
    }

    /* renamed from: j */
    public final boolean mo12768j(String str) {
        return this.f1432a.containsKey(str);
    }

    /* renamed from: l */
    public C1261q mo12637l(String str, C1250p4 p4Var, List list) {
        return "toString".equals(str) ? new C1324u(toString()) : C1165k.m2126a(this, new C1324u(str), p4Var, list);
    }

    /* renamed from: m */
    public final void mo12769m(String str, C1261q qVar) {
        if (qVar == null) {
            this.f1432a.remove(str);
        } else {
            this.f1432a.put(str, qVar);
        }
    }

    /* renamed from: n */
    public final C1261q mo12770n(String str) {
        return this.f1432a.containsKey(str) ? (C1261q) this.f1432a.get(str) : C1261q.f1536D;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f1432a.isEmpty()) {
            for (String str : this.f1432a.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f1432a.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SP));
        }
        sb.append("}");
        return sb.toString();
    }
}
