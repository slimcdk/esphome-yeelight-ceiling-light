package com.google.android.gms.internal.wearable;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.wearable.c2 */
final class C1427c2 {

    /* renamed from: a */
    private static final Class<?> f1762a;

    /* renamed from: b */
    private static final C1482n2<?, ?> f1763b = m3441C(false);

    /* renamed from: c */
    private static final C1482n2<?, ?> f1764c = m3441C(true);

    /* renamed from: d */
    private static final C1482n2<?, ?> f1765d = new C1492p2();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1762a = cls;
    }

    /* renamed from: A */
    public static void m3439A(Class<?> cls) {
        Class<?> cls2;
        if (!C1480n0.class.isAssignableFrom(cls) && (cls2 = f1762a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: B */
    public static void m3440B(int i, List<?> list, C1531y yVar, C1417a2 a2Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                yVar.mo13856D(i, list.get(i2), a2Var);
            }
        }
    }

    /* renamed from: C */
    private static C1482n2<?, ?> m3441C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C1482n2) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m3442D(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1436e1) {
            C1436e1 e1Var = (C1436e1) list;
            i = 0;
            while (i2 < size) {
                i += C1527x.m3874B(e1Var.mo13607g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1527x.m3874B(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: E */
    static int m3443E(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m3442D(list) + (list.size() * C1527x.m3882y(i));
    }

    /* renamed from: F */
    static int m3444F(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1436e1) {
            C1436e1 e1Var = (C1436e1) list;
            i = 0;
            while (i2 < size) {
                i += C1527x.m3874B(e1Var.mo13607g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1527x.m3874B(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: G */
    static int m3445G(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3444F(list) + (size * C1527x.m3882y(i));
    }

    /* renamed from: H */
    static int m3446H(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1436e1) {
            C1436e1 e1Var = (C1436e1) list;
            i = 0;
            while (i2 < size) {
                long g = e1Var.mo13607g(i2);
                i += C1527x.m3874B((g >> 63) ^ (g + g));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C1527x.m3874B((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: I */
    static int m3447I(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3446H(list) + (size * C1527x.m3882y(i));
    }

    /* renamed from: J */
    static int m3448J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1485o0) {
            C1485o0 o0Var = (C1485o0) list;
            i = 0;
            while (i2 < size) {
                i += C1527x.m3883z(o0Var.mo13735e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1527x.m3883z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    static int m3449K(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3448J(list) + (size * C1527x.m3882y(i));
    }

    /* renamed from: L */
    static int m3450L(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1485o0) {
            C1485o0 o0Var = (C1485o0) list;
            i = 0;
            while (i2 < size) {
                i += C1527x.m3883z(o0Var.mo13735e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1527x.m3883z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    static int m3451M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3450L(list) + (size * C1527x.m3882y(i));
    }

    /* renamed from: N */
    static int m3452N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1485o0) {
            C1485o0 o0Var = (C1485o0) list;
            i = 0;
            while (i2 < size) {
                i += C1527x.m3873A(o0Var.mo13735e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1527x.m3873A(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m3453O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3452N(list) + (size * C1527x.m3882y(i));
    }

    /* renamed from: P */
    static int m3454P(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1485o0) {
            C1485o0 o0Var = (C1485o0) list;
            i = 0;
            while (i2 < size) {
                int e = o0Var.mo13735e(i2);
                i += C1527x.m3873A((e >> 31) ^ (e + e));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C1527x.m3873A((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m3455Q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3454P(list) + (size * C1527x.m3882y(i));
    }

    /* renamed from: R */
    static int m3456R(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: S */
    static int m3457S(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C1527x.m3873A(i << 3) + 4);
    }

    /* renamed from: T */
    static int m3458T(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: U */
    static int m3459U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C1527x.m3873A(i << 3) + 8);
    }

    /* renamed from: V */
    static int m3460V(List<?> list) {
        return list.size();
    }

    /* renamed from: W */
    static int m3461W(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C1527x.m3873A(i << 3) + 1);
    }

    /* renamed from: X */
    static int m3462X(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int y = C1527x.m3882y(i) * size;
        if (list instanceof C1536z0) {
            C1536z0 z0Var = (C1536z0) list;
            while (i2 < size) {
                Object p = z0Var.mo13803p(i2);
                y += p instanceof zzau ? C1527x.m3877a((zzau) p) : C1527x.m3875C((String) p);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                y += obj instanceof zzau ? C1527x.m3877a((zzau) obj) : C1527x.m3875C((String) obj);
                i2++;
            }
        }
        return y;
    }

    /* renamed from: Y */
    static int m3463Y(int i, Object obj, C1417a2 a2Var) {
        if (!(obj instanceof C1528x0)) {
            return C1527x.m3873A(i << 3) + C1527x.m3878b((C1486o1) obj, a2Var);
        }
        int A = C1527x.m3873A(i << 3);
        int a = ((C1528x0) obj).mo13838a();
        return A + C1527x.m3873A(a) + a;
    }

    /* renamed from: Z */
    static int m3464Z(int i, List<?> list, C1417a2 a2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = C1527x.m3882y(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            y += obj instanceof C1528x0 ? C1527x.m3876D((C1528x0) obj) : C1527x.m3878b((C1486o1) obj, a2Var);
        }
        return y;
    }

    /* renamed from: a */
    public static C1482n2<?, ?> m3465a() {
        return f1763b;
    }

    /* renamed from: a0 */
    static int m3466a0(int i, List<zzau> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = size * C1527x.m3882y(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            y += C1527x.m3877a(list.get(i2));
        }
        return y;
    }

    /* renamed from: b */
    public static C1482n2<?, ?> m3467b() {
        return f1764c;
    }

    /* renamed from: b0 */
    static int m3468b0(int i, List<C1486o1> list, C1417a2 a2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C1527x.m3879e(i, list.get(i3), a2Var);
        }
        return i2;
    }

    /* renamed from: c */
    public static C1482n2<?, ?> m3469c() {
        return f1765d;
    }

    /* renamed from: d */
    static boolean m3470d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    static <T, FT extends C1445g0<FT>> void m3471e(C1430d0<FT> d0Var, T t, T t2) {
        d0Var.mo13597b(t2);
        throw null;
    }

    /* renamed from: f */
    static <T, UT, UB> void m3472f(C1482n2<UT, UB> n2Var, T t, T t2) {
        n2Var.mo13723c(t, n2Var.mo13726f(n2Var.mo13724d(t), n2Var.mo13724d(t2)));
    }

    /* renamed from: g */
    static <UT, UB> UB m3473g(int i, List<Integer> list, C1500r0 r0Var, UB ub, C1482n2<UT, UB> n2Var) {
        if (r0Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (r0Var.mo13730f(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m3474h(i, intValue, ub, n2Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!r0Var.mo13730f(intValue2)) {
                    ub = m3474h(i, intValue2, ub, n2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: h */
    static <UT, UB> UB m3474h(int i, int i2, UB ub, C1482n2<UT, UB> n2Var) {
        if (ub == null) {
            ub = n2Var.mo13722b();
        }
        n2Var.mo13721a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: i */
    static <T> void m3475i(C1461j1 j1Var, T t, T t2, long j) {
        C1534y2.m3996t(t, j, C1461j1.m3577b(C1534y2.m3995s(t, j), C1534y2.m3995s(t2, j)));
    }

    /* renamed from: j */
    public static void m3476j(int i, List<Double> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13865b(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m3477k(int i, List<Float> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13864a(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m3478l(int i, List<Long> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13861I(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m3479m(int i, List<Long> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13862J(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m3480n(int i, List<Long> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13874k(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m3481o(int i, List<Long> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13863K(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m3482p(int i, List<Long> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13872i(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m3483q(int i, List<Integer> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13859G(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m3484r(int i, List<Integer> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13870g(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m3485s(int i, List<Integer> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13873j(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m3486t(int i, List<Integer> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13860H(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m3487u(int i, List<Integer> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13871h(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m3488v(int i, List<Integer> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13866c(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m3489w(int i, List<Boolean> list, C1531y yVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13867d(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m3490x(int i, List<String> list, C1531y yVar) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13868e(i, list);
        }
    }

    /* renamed from: y */
    public static void m3491y(int i, List<zzau> list, C1531y yVar) {
        if (list != null && !list.isEmpty()) {
            yVar.mo13869f(i, list);
        }
    }

    /* renamed from: z */
    public static void m3492z(int i, List<?> list, C1531y yVar, C1417a2 a2Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                yVar.mo13855C(i, list.get(i2), a2Var);
            }
        }
    }
}
