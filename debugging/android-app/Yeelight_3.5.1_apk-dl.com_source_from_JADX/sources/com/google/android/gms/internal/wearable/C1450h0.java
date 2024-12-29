package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.C1445g0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.wearable.h0 */
final class C1450h0<T extends C1445g0<T>> {

    /* renamed from: d */
    private static final C1450h0 f1783d = new C1450h0(true);

    /* renamed from: a */
    final C1467k2<T, Object> f1784a = new C1432d2(16);

    /* renamed from: b */
    private boolean f1785b;

    /* renamed from: c */
    private boolean f1786c;

    private C1450h0() {
    }

    private C1450h0(boolean z) {
        mo13639b();
        mo13639b();
    }

    /* renamed from: a */
    public static <T extends C1445g0<T>> C1450h0<T> m3540a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m3541d(T t, Object obj) {
        boolean z;
        zzem D = t.mo13636D();
        C1524w0.m3857a(obj);
        zzem zzem = zzem.DOUBLE;
        zzen zzen = zzen.INT;
        switch (D.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzau) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C1490p0)) {
                    return;
                }
            case 8:
                if (obj instanceof C1486o1) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.mo13636D().zza(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo13639b() {
        if (!this.f1785b) {
            this.f1784a.mo13599a();
            this.f1785b = true;
        }
    }

    /* renamed from: c */
    public final void mo13640c(T t, Object obj) {
        if (!t.mo13637E()) {
            m3541d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m3541d(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f1784a.put(t, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1450h0 h0Var = new C1450h0();
        for (int i = 0; i < this.f1784a.mo13688c(); i++) {
            Map.Entry<T, Object> d = this.f1784a.mo13691d(i);
            h0Var.mo13640c((C1445g0) d.getKey(), d.getValue());
        }
        for (Map.Entry next : this.f1784a.mo13692e()) {
            h0Var.mo13640c((C1445g0) next.getKey(), next.getValue());
        }
        h0Var.f1786c = this.f1786c;
        return h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1450h0)) {
            return false;
        }
        return this.f1784a.equals(((C1450h0) obj).f1784a);
    }

    public final int hashCode() {
        return this.f1784a.hashCode();
    }
}
