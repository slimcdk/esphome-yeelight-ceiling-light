package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.o6 */
final class C1927o6 {

    /* renamed from: a */
    private static final Class<?> f3615a = m5654F();

    /* renamed from: b */
    private static final C1768e7<?, ?> f3616b = m5685g(false);

    /* renamed from: c */
    private static final C1768e7<?, ?> f3617c = m5685g(true);

    /* renamed from: d */
    private static final C1768e7<?, ?> f3618d = new C1798g7();

    /* renamed from: A */
    static int m5649A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1875l5) {
            C1875l5 l5Var = (C1875l5) list;
            i = 0;
            while (i2 < size) {
                i += C2028v3.m6155o0(l5Var.mo11803b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2028v3.m6155o0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static C1768e7<?, ?> m5650B() {
        return f3618d;
    }

    /* renamed from: C */
    public static void m5651C(int i, List<Long> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11502n(i, list, z);
        }
    }

    /* renamed from: D */
    static int m5652D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m5653E(list) + (size * C2028v3.m6149h0(i));
    }

    /* renamed from: E */
    static int m5653E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1939p4) {
            C1939p4 p4Var = (C1939p4) list;
            i = 0;
            while (i2 < size) {
                i += C2028v3.m6124C0(p4Var.mo11939d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2028v3.m6124C0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    private static Class<?> m5654F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: G */
    public static void m5655G(int i, List<Long> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11478E(i, list, z);
        }
    }

    /* renamed from: H */
    static int m5656H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m5657I(list) + (size * C2028v3.m6149h0(i));
    }

    /* renamed from: I */
    static int m5657I(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1939p4) {
            C1939p4 p4Var = (C1939p4) list;
            i = 0;
            while (i2 < size) {
                i += C2028v3.m6152l0(p4Var.mo11939d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2028v3.m6152l0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    private static Class<?> m5658J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static void m5659K(int i, List<Long> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11474A(i, list, z);
        }
    }

    /* renamed from: L */
    static int m5660L(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m5661M(list) + (size * C2028v3.m6149h0(i));
    }

    /* renamed from: M */
    static int m5661M(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1939p4) {
            C1939p4 p4Var = (C1939p4) list;
            i = 0;
            while (i2 < size) {
                i += C2028v3.m6156p0(p4Var.mo11939d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2028v3.m6156p0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: N */
    public static void m5662N(int i, List<Long> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11513y(i, list, z);
        }
    }

    /* renamed from: O */
    static int m5663O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m5664P(list) + (size * C2028v3.m6149h0(i));
    }

    /* renamed from: P */
    static int m5664P(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1939p4) {
            C1939p4 p4Var = (C1939p4) list;
            i = 0;
            while (i2 < size) {
                i += C2028v3.m6160t0(p4Var.mo11939d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2028v3.m6160t0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static void m5665Q(int i, List<Long> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11504p(i, list, z);
        }
    }

    /* renamed from: R */
    static int m5666R(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C2028v3.m6165y0(i, 0);
    }

    /* renamed from: S */
    static int m5667S(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: T */
    public static void m5668T(int i, List<Integer> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11497i(i, list, z);
        }
    }

    /* renamed from: U */
    static int m5669U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C2028v3.m6158r0(i, 0);
    }

    /* renamed from: V */
    static int m5670V(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: W */
    public static void m5671W(int i, List<Integer> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11507s(i, list, z);
        }
    }

    /* renamed from: X */
    static int m5672X(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C2028v3.m6132H(i, true);
    }

    /* renamed from: Y */
    static int m5673Y(List<?> list) {
        return list.size();
    }

    /* renamed from: Z */
    public static void m5674Z(int i, List<Integer> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11479F(i, list, z);
        }
    }

    /* renamed from: a */
    static int m5675a(int i, Object obj, C1912n6 n6Var) {
        return obj instanceof C1720b5 ? C2028v3.m6142c(i, (C1720b5) obj) : C2028v3.m6129F(i, (C2062x5) obj, n6Var);
    }

    /* renamed from: a0 */
    public static void m5676a0(int i, List<Integer> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11505q(i, list, z);
        }
    }

    /* renamed from: b */
    static int m5677b(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int h0 = C2028v3.m6149h0(i) * size;
        if (list instanceof C1766e5) {
            C1766e5 e5Var = (C1766e5) list;
            while (i2 < size) {
                Object b = e5Var.mo11600b(i2);
                h0 += b instanceof C1779f3 ? C2028v3.m6133I((C1779f3) b) : C2028v3.m6135K((String) b);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                h0 += obj instanceof C1779f3 ? C2028v3.m6133I((C1779f3) obj) : C2028v3.m6135K((String) obj);
                i2++;
            }
        }
        return h0;
    }

    /* renamed from: b0 */
    public static void m5678b0(int i, List<Integer> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11508t(i, list, z);
        }
    }

    /* renamed from: c */
    static int m5679c(int i, List<?> list, C1912n6 n6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = C2028v3.m6149h0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            h0 += obj instanceof C1720b5 ? C2028v3.m6144d((C1720b5) obj) : C2028v3.m6146e((C2062x5) obj, n6Var);
        }
        return h0;
    }

    /* renamed from: c0 */
    public static void m5680c0(int i, List<Integer> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11498j(i, list, z);
        }
    }

    /* renamed from: d */
    static int m5681d(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m5683e(list) + (list.size() * C2028v3.m6149h0(i));
    }

    /* renamed from: d0 */
    public static void m5682d0(int i, List<Boolean> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11493e(i, list, z);
        }
    }

    /* renamed from: e */
    static int m5683e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1875l5) {
            C1875l5 l5Var = (C1875l5) list;
            i = 0;
            while (i2 < size) {
                i += C2028v3.m6147e0(l5Var.mo11803b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2028v3.m6147e0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static C1768e7<?, ?> m5684f() {
        return f3616b;
    }

    /* renamed from: g */
    private static C1768e7<?, ?> m5685g(boolean z) {
        try {
            Class<?> J = m5658J();
            if (J == null) {
                return null;
            }
            return (C1768e7) J.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    static <UT, UB> UB m5686h(int i, int i2, UB ub, C1768e7<UT, UB> e7Var) {
        if (ub == null) {
            ub = e7Var.mo11603a();
        }
        e7Var.mo11604b(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: i */
    static <UT, UB> UB m5687i(int i, List<Integer> list, C1984s4 s4Var, UB ub, C1768e7<UT, UB> e7Var) {
        if (s4Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (s4Var.mo11560a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m5686h(i, intValue, ub, e7Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!s4Var.mo11560a(intValue2)) {
                    ub = m5686h(i, intValue2, ub, e7Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: j */
    public static void m5688j(int i, List<String> list, C1723b8 b8Var) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11488O(i, list);
        }
    }

    /* renamed from: k */
    public static void m5689k(int i, List<?> list, C1723b8 b8Var, C1912n6 n6Var) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11491c(i, list, n6Var);
        }
    }

    /* renamed from: l */
    public static void m5690l(int i, List<Double> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11481H(i, list, z);
        }
    }

    /* renamed from: m */
    static <T, FT extends C1811h4<FT>> void m5691m(C1704a4<FT> a4Var, T t, T t2) {
        C1780f4<FT> b = a4Var.mo11423b(t2);
        if (!b.f3345a.isEmpty()) {
            a4Var.mo11427f(t).mo11653g(b);
        }
    }

    /* renamed from: n */
    static <T> void m5692n(C1954q5 q5Var, T t, T t2, long j) {
        C1859k7.m5336j(t, j, q5Var.mo11957e(C1859k7.m5317F(t, j), C1859k7.m5317F(t2, j)));
    }

    /* renamed from: o */
    static <T, UT, UB> void m5693o(C1768e7<UT, UB> e7Var, T t, T t2) {
        e7Var.mo11607e(t, e7Var.mo11611i(e7Var.mo11608f(t), e7Var.mo11608f(t2)));
    }

    /* renamed from: p */
    public static void m5694p(Class<?> cls) {
        Class<?> cls2;
        if (!C1889m4.class.isAssignableFrom(cls) && (cls2 = f3615a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: q */
    static boolean m5695q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: r */
    static int m5696r(int i, List<C1779f3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = size * C2028v3.m6149h0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            h0 += C2028v3.m6133I(list.get(i2));
        }
        return h0;
    }

    /* renamed from: s */
    static int m5697s(int i, List<C2062x5> list, C1912n6 n6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C2028v3.m6139V(i, list.get(i3), n6Var);
        }
        return i2;
    }

    /* renamed from: t */
    static int m5698t(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m5699u(list) + (size * C2028v3.m6149h0(i));
    }

    /* renamed from: u */
    static int m5699u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1875l5) {
            C1875l5 l5Var = (C1875l5) list;
            i = 0;
            while (i2 < size) {
                i += C2028v3.m6151j0(l5Var.mo11803b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2028v3.m6151j0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v */
    public static C1768e7<?, ?> m5700v() {
        return f3617c;
    }

    /* renamed from: w */
    public static void m5701w(int i, List<C1779f3> list, C1723b8 b8Var) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11482I(i, list);
        }
    }

    /* renamed from: x */
    public static void m5702x(int i, List<?> list, C1723b8 b8Var, C1912n6 n6Var) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11495g(i, list, n6Var);
        }
    }

    /* renamed from: y */
    public static void m5703y(int i, List<Float> list, C1723b8 b8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            b8Var.mo11485L(i, list, z);
        }
    }

    /* renamed from: z */
    static int m5704z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m5649A(list) + (size * C2028v3.m6149h0(i));
    }
}
