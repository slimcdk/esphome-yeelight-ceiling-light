package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c8 */
final class C1046c8 {

    /* renamed from: d */
    private static final C1046c8 f1263d = new C1046c8(true);

    /* renamed from: a */
    final C1176ka f1264a = new C1409z9(16);

    /* renamed from: b */
    private boolean f1265b;

    /* renamed from: c */
    private boolean f1266c;

    private C1046c8() {
    }

    private C1046c8(boolean z) {
        mo12632b();
        mo12632b();
    }

    /* renamed from: a */
    public static C1046c8 m1768a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m1769d(C1030b8 b8Var, Object obj) {
        boolean z;
        zznb D = b8Var.mo12580D();
        C1270q8.m2546e(obj);
        zznb zznb = zznb.DOUBLE;
        zznc zznc = zznc.INT;
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
                if ((obj instanceof zzjb) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof C1191l9) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(b8Var.zza()), b8Var.mo12580D().zza(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo12632b() {
        if (!this.f1265b) {
            this.f1264a.mo12921a();
            this.f1265b = true;
        }
    }

    /* renamed from: c */
    public final void mo12633c(C1030b8 b8Var, Object obj) {
        if (!b8Var.mo12581E()) {
            m1769d(b8Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m1769d(b8Var, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f1264a.put(b8Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1046c8 c8Var = new C1046c8();
        for (int i = 0; i < this.f1264a.mo12922b(); i++) {
            Map.Entry g = this.f1264a.mo12929g(i);
            c8Var.mo12633c((C1030b8) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.f1264a.mo12923c()) {
            c8Var.mo12633c((C1030b8) entry.getKey(), entry.getValue());
        }
        c8Var.f1266c = this.f1266c;
        return c8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1046c8)) {
            return false;
        }
        return this.f1264a.equals(((C1046c8) obj).f1264a);
    }

    public final int hashCode() {
        return this.f1264a.hashCode();
    }
}
