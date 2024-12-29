package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1811h4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.f4 */
final class C1780f4<T extends C1811h4<T>> {

    /* renamed from: d */
    private static final C1780f4 f3344d = new C1780f4(true);

    /* renamed from: a */
    final C1971r6<T, Object> f3345a;

    /* renamed from: b */
    private boolean f3346b;

    /* renamed from: c */
    private boolean f3347c;

    private C1780f4() {
        this.f3345a = C1971r6.m5893b(16);
    }

    private C1780f4(C1971r6<T, Object> r6Var) {
        this.f3345a = r6Var;
        mo11655k();
    }

    private C1780f4(boolean z) {
        this(C1971r6.m5893b(0));
        mo11655k();
    }

    /* renamed from: a */
    public static int m5087a(C1811h4<?> h4Var, Object obj) {
        C2034v7 D = h4Var.mo11707D();
        int C = h4Var.mo11706C();
        if (!h4Var.mo11709F()) {
            return m5088b(D, C, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (h4Var.mo11710G()) {
            for (Object j : list) {
                i += m5095j(D, j);
            }
            return C2028v3.m6149h0(C) + i + C2028v3.m6128E0(i);
        }
        for (Object b : list) {
            i += m5088b(D, C, b);
        }
        return i;
    }

    /* renamed from: b */
    static int m5088b(C2034v7 v7Var, int i, Object obj) {
        int h0 = C2028v3.m6149h0(i);
        if (v7Var == C2034v7.GROUP) {
            C1925o4.m5645g((C2062x5) obj);
            h0 <<= 1;
        }
        return h0 + m5095j(v7Var, obj);
    }

    /* renamed from: c */
    public static <T extends C1811h4<T>> C1780f4<T> m5089c() {
        return f3344d;
    }

    /* renamed from: d */
    private final Object m5090d(T t) {
        Object obj = this.f3345a.get(t);
        if (!(obj instanceof C2061x4)) {
            return obj;
        }
        C2061x4 x4Var = (C2061x4) obj;
        C2061x4.m6564e();
        throw null;
    }

    /* renamed from: e */
    private static Object m5091e(Object obj) {
        if (obj instanceof C1738c6) {
            return ((C1738c6) obj).mo11552C();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: f */
    static void m5092f(C2028v3 v3Var, C2034v7 v7Var, int i, Object obj) {
        if (v7Var == C2034v7.GROUP) {
            C2062x5 x5Var = (C2062x5) obj;
            C1925o4.m5645g(x5Var);
            v3Var.mo12147m(i, 3);
            x5Var.mo11839b(v3Var);
            v3Var.mo12147m(i, 4);
            return;
        }
        v3Var.mo12147m(i, v7Var.mo12161b());
        switch (C1765e4.f3326b[v7Var.ordinal()]) {
            case 1:
                v3Var.mo12141h(((Double) obj).doubleValue());
                return;
            case 2:
                v3Var.mo12142i(((Float) obj).floatValue());
                return;
            case 3:
                v3Var.mo12154t(((Long) obj).longValue());
                return;
            case 4:
                v3Var.mo12154t(((Long) obj).longValue());
                return;
            case 5:
                v3Var.mo12143j(((Integer) obj).intValue());
                return;
            case 6:
                v3Var.mo12136a0(((Long) obj).longValue());
                return;
            case 7:
                v3Var.mo12138f0(((Integer) obj).intValue());
                return;
            case 8:
                v3Var.mo12159y(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C2062x5) obj).mo11839b(v3Var);
                return;
            case 10:
                v3Var.mo12156v((C2062x5) obj);
                return;
            case 11:
                if (obj instanceof C1779f3) {
                    v3Var.mo12155u((C1779f3) obj);
                    return;
                } else {
                    v3Var.mo12157w((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C1779f3) {
                    v3Var.mo12155u((C1779f3) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                v3Var.mo12132T(bArr, 0, bArr.length);
                return;
            case 13:
                v3Var.mo12127O(((Integer) obj).intValue());
                return;
            case 14:
                v3Var.mo12138f0(((Integer) obj).intValue());
                return;
            case 15:
                v3Var.mo12136a0(((Long) obj).longValue());
                return;
            case 16:
                v3Var.mo12133X(((Integer) obj).intValue());
                return;
            case 17:
                v3Var.mo12131S(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C1953q4) {
                    v3Var.mo12143j(((C1953q4) obj).mo11694C());
                    return;
                } else {
                    v3Var.mo12143j(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C1953q4) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C2061x4) == false) goto L_0x0014;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5093h(com.google.android.gms.internal.measurement.C2034v7 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.C1925o4.m5642d(r3)
            int[] r0 = com.google.android.gms.internal.measurement.C1765e4.f3325a
            com.google.android.gms.internal.measurement.y7 r2 = r2.mo12160a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C2062x5
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C2061x4
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C1953q4
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C1779f3
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x004e
        L_0x004d:
            throw r2
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1780f4.m5093h(com.google.android.gms.internal.measurement.v7, java.lang.Object):void");
    }

    /* renamed from: i */
    private static <T extends C1811h4<T>> boolean m5094i(Map.Entry<T, Object> entry) {
        C1811h4 h4Var = (C1811h4) entry.getKey();
        if (h4Var.mo11708E() == C2081y7.MESSAGE) {
            boolean F = h4Var.mo11709F();
            Object value = entry.getValue();
            if (F) {
                for (C2062x5 c : (List) value) {
                    if (!c.mo11840c()) {
                        return false;
                    }
                }
            } else if (value instanceof C2062x5) {
                if (!((C2062x5) value).mo11840c()) {
                    return false;
                }
            } else if (value instanceof C2061x4) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: j */
    private static int m5095j(C2034v7 v7Var, Object obj) {
        switch (C1765e4.f3326b[v7Var.ordinal()]) {
            case 1:
                return C2028v3.m6166z(((Double) obj).doubleValue());
            case 2:
                return C2028v3.m6119A(((Float) obj).floatValue());
            case 3:
                return C2028v3.m6147e0(((Long) obj).longValue());
            case 4:
                return C2028v3.m6151j0(((Long) obj).longValue());
            case 5:
                return C2028v3.m6152l0(((Integer) obj).intValue());
            case 6:
                return C2028v3.m6159s0(((Long) obj).longValue());
            case 7:
                return C2028v3.m6164x0(((Integer) obj).intValue());
            case 8:
                return C2028v3.m6136L(((Boolean) obj).booleanValue());
            case 9:
                return C2028v3.m6140W((C2062x5) obj);
            case 10:
                return obj instanceof C2061x4 ? C2028v3.m6144d((C2061x4) obj) : C2028v3.m6134J((C2062x5) obj);
            case 11:
                return obj instanceof C1779f3 ? C2028v3.m6133I((C1779f3) obj) : C2028v3.m6135K((String) obj);
            case 12:
                return obj instanceof C1779f3 ? C2028v3.m6133I((C1779f3) obj) : C2028v3.m6137M((byte[]) obj);
            case 13:
                return C2028v3.m6156p0(((Integer) obj).intValue());
            case 14:
                return C2028v3.m6120A0(((Integer) obj).intValue());
            case 15:
                return C2028v3.m6163w0(((Long) obj).longValue());
            case 16:
                return C2028v3.m6160t0(((Integer) obj).intValue());
            case 17:
                return C2028v3.m6155o0(((Long) obj).longValue());
            case 18:
                return obj instanceof C1953q4 ? C2028v3.m6124C0(((C1953q4) obj).mo11694C()) : C2028v3.m6124C0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: l */
    private final void m5096l(T t, Object obj) {
        if (!t.mo11709F()) {
            m5093h(t.mo11707D(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m5093h(t.mo11707D(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C2061x4) {
            this.f3347c = true;
        }
        this.f3345a.put(t, obj);
    }

    /* renamed from: m */
    private final void m5097m(Map.Entry<T, Object> entry) {
        C1811h4 h4Var = (C1811h4) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C2061x4) {
            C2061x4 x4Var = (C2061x4) value;
            C2061x4.m6564e();
            throw null;
        } else if (h4Var.mo11709F()) {
            Object d = m5090d(h4Var);
            if (d == null) {
                d = new ArrayList();
            }
            for (Object e : (List) value) {
                ((List) d).add(m5091e(e));
            }
            this.f3345a.put(h4Var, d);
        } else if (h4Var.mo11708E() == C2081y7.MESSAGE) {
            Object d2 = m5090d(h4Var);
            if (d2 == null) {
                this.f3345a.put(h4Var, m5091e(value));
            } else {
                this.f3345a.put(h4Var, d2 instanceof C1738c6 ? h4Var.mo11711N((C1738c6) d2, (C1738c6) value) : h4Var.mo11712l0(((C2062x5) d2).mo11843f(), (C2062x5) value).mo11851I());
            }
        } else {
            this.f3345a.put(h4Var, m5091e(value));
        }
    }

    /* renamed from: n */
    private static int m5098n(Map.Entry<T, Object> entry) {
        C1811h4 h4Var = (C1811h4) entry.getKey();
        Object value = entry.getValue();
        if (h4Var.mo11708E() != C2081y7.MESSAGE || h4Var.mo11709F() || h4Var.mo11710G()) {
            return m5087a(h4Var, value);
        }
        boolean z = value instanceof C2061x4;
        int C = ((C1811h4) entry.getKey()).mo11706C();
        return z ? C2028v3.m6125D(C, (C2061x4) value) : C2028v3.m6127E(C, (C2062x5) value);
    }

    public final /* synthetic */ Object clone() {
        C1780f4 f4Var = new C1780f4();
        for (int i = 0; i < this.f3345a.mo11998j(); i++) {
            Map.Entry<T, Object> h = this.f3345a.mo11995h(i);
            f4Var.m5096l((C1811h4) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f3345a.mo11999m()) {
            f4Var.m5096l((C1811h4) next.getKey(), next.getValue());
        }
        f4Var.f3347c = this.f3347c;
        return f4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780f4)) {
            return false;
        }
        return this.f3345a.equals(((C1780f4) obj).f3345a);
    }

    /* renamed from: g */
    public final void mo11653g(C1780f4<T> f4Var) {
        for (int i = 0; i < f4Var.f3345a.mo11998j(); i++) {
            m5097m(f4Var.f3345a.mo11995h(i));
        }
        for (Map.Entry<T, Object> m : f4Var.f3345a.mo11999m()) {
            m5097m(m);
        }
    }

    public final int hashCode() {
        return this.f3345a.hashCode();
    }

    /* renamed from: k */
    public final void mo11655k() {
        if (!this.f3346b) {
            this.f3345a.mo11961e();
            this.f3346b = true;
        }
    }

    /* renamed from: o */
    public final boolean mo11656o() {
        return this.f3346b;
    }

    /* renamed from: p */
    public final Iterator<Map.Entry<T, Object>> mo11657p() {
        return this.f3347c ? new C1737c5(this.f3345a.entrySet().iterator()) : this.f3345a.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Iterator<Map.Entry<T, Object>> mo11658q() {
        return this.f3347c ? new C1737c5(this.f3345a.mo12000o().iterator()) : this.f3345a.mo12000o().iterator();
    }

    /* renamed from: r */
    public final boolean mo11659r() {
        for (int i = 0; i < this.f3345a.mo11998j(); i++) {
            if (!m5094i(this.f3345a.mo11995h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> i2 : this.f3345a.mo11999m()) {
            if (!m5094i(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final int mo11660s() {
        int i = 0;
        for (int i2 = 0; i2 < this.f3345a.mo11998j(); i2++) {
            i += m5098n(this.f3345a.mo11995h(i2));
        }
        for (Map.Entry<T, Object> n : this.f3345a.mo11999m()) {
            i += m5098n(n);
        }
        return i;
    }
}
