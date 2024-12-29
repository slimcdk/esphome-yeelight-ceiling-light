package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.y9 */
final class C1394y9 {

    /* renamed from: a */
    private static final Class f1727a;

    /* renamed from: b */
    private static final C1224na f1728b = m3308C(false);

    /* renamed from: c */
    private static final C1224na f1729c = m3308C(true);

    /* renamed from: d */
    private static final C1224na f1730d = new C1256pa();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1727a = cls;
    }

    /* renamed from: A */
    static int m3306A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C1301s7.m2904a(i << 3) + 1);
    }

    /* renamed from: B */
    static void m3307B(C1111g9 g9Var, Object obj, Object obj2, long j) {
        C1380xa.m3280x(obj, j, C1111g9.m2017b(C1380xa.m3267k(obj, j), C1380xa.m3267k(obj2, j)));
    }

    /* renamed from: C */
    private static C1224na m3308C(boolean z) {
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
            return (C1224na) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m3309D(List list) {
        return list.size();
    }

    /* renamed from: E */
    static int m3310E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * C1301s7.m2903D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += C1301s7.m2908x((zzjb) list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    static int m3311F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3312G(list) + (size * C1301s7.m2903D(i));
    }

    /* renamed from: G */
    static int m3312G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1190l8) {
            C1190l8 l8Var = (C1190l8) list;
            i = 0;
            while (i2 < size) {
                i += C1301s7.m2910z(l8Var.mo12966e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1301s7.m2910z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m3313H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C1301s7.m2904a(i << 3) + 4);
    }

    /* renamed from: I */
    static int m3314I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m3315J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C1301s7.m2904a(i << 3) + 8);
    }

    /* renamed from: K */
    static int m3316K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m3317L(int i, List list, C1364w9 w9Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C1301s7.m2909y(i, (C1191l9) list.get(i3), w9Var);
        }
        return i2;
    }

    /* renamed from: M */
    static int m3318M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3319N(list) + (size * C1301s7.m2903D(i));
    }

    /* renamed from: N */
    static int m3319N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1190l8) {
            C1190l8 l8Var = (C1190l8) list;
            i = 0;
            while (i2 < size) {
                i += C1301s7.m2910z(l8Var.mo12966e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1301s7.m2910z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m3320O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m3321P(list) + (list.size() * C1301s7.m2903D(i));
    }

    /* renamed from: P */
    static int m3321P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1015a9) {
            C1015a9 a9Var = (C1015a9) list;
            i = 0;
            while (i2 < size) {
                i += C1301s7.m2905b(a9Var.mo12531f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1301s7.m2905b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m3322Q(int i, Object obj, C1364w9 w9Var) {
        if (!(obj instanceof C1286r8)) {
            return C1301s7.m2904a(i << 3) + C1301s7.m2901B((C1191l9) obj, w9Var);
        }
        int a = C1301s7.m2904a(i << 3);
        int a2 = ((C1286r8) obj).mo13207a();
        return a + C1301s7.m2904a(a2) + a2;
    }

    /* renamed from: R */
    static int m3323R(int i, List list, C1364w9 w9Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = C1301s7.m2903D(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            D += obj instanceof C1286r8 ? C1301s7.m2900A((C1286r8) obj) : C1301s7.m2901B((C1191l9) obj, w9Var);
        }
        return D;
    }

    /* renamed from: S */
    static int m3324S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3325T(list) + (size * C1301s7.m2903D(i));
    }

    /* renamed from: T */
    static int m3325T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1190l8) {
            C1190l8 l8Var = (C1190l8) list;
            i = 0;
            while (i2 < size) {
                int e = l8Var.mo12966e(i2);
                i += C1301s7.m2904a((e >> 31) ^ (e + e));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C1301s7.m2904a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m3326U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3327V(list) + (size * C1301s7.m2903D(i));
    }

    /* renamed from: V */
    static int m3327V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1015a9) {
            C1015a9 a9Var = (C1015a9) list;
            i = 0;
            while (i2 < size) {
                long f = a9Var.mo12531f(i2);
                i += C1301s7.m2905b((f >> 63) ^ (f + f));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C1301s7.m2905b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m3328W(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int D = C1301s7.m2903D(i) * size;
        if (list instanceof C1318t8) {
            C1318t8 t8Var = (C1318t8) list;
            while (i2 < size) {
                Object i3 = t8Var.mo13354i(i2);
                D += i3 instanceof zzjb ? C1301s7.m2908x((zzjb) i3) : C1301s7.m2902C((String) i3);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                D += obj instanceof zzjb ? C1301s7.m2908x((zzjb) obj) : C1301s7.m2902C((String) obj);
                i2++;
            }
        }
        return D;
    }

    /* renamed from: X */
    static int m3329X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3330Y(list) + (size * C1301s7.m2903D(i));
    }

    /* renamed from: Y */
    static int m3330Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1190l8) {
            C1190l8 l8Var = (C1190l8) list;
            i = 0;
            while (i2 < size) {
                i += C1301s7.m2904a(l8Var.mo12966e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1301s7.m2904a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m3331Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m3333a0(list) + (size * C1301s7.m2903D(i));
    }

    /* renamed from: a */
    public static C1224na m3332a() {
        return f1729c;
    }

    /* renamed from: a0 */
    static int m3333a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1015a9) {
            C1015a9 a9Var = (C1015a9) list;
            i = 0;
            while (i2 < size) {
                i += C1301s7.m2905b(a9Var.mo12531f(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1301s7.m2905b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C1224na m3334b() {
        return f1730d;
    }

    /* renamed from: b0 */
    public static C1224na m3335b0() {
        return f1728b;
    }

    /* renamed from: c */
    static Object m3336c(int i, List list, C1206m8 m8Var, Object obj, C1224na naVar) {
        if (m8Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (m8Var.mo12626f(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m3337d(i, intValue, obj, naVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!m8Var.mo12626f(intValue2)) {
                    obj = m3337d(i, intValue2, obj, naVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    static Object m3337d(int i, int i2, Object obj, C1224na naVar) {
        if (obj == null) {
            obj = naVar.mo13024e();
        }
        naVar.mo13025f(obj, i, (long) i2);
        return obj;
    }

    /* renamed from: e */
    static void m3338e(C1392y7 y7Var, Object obj, Object obj2) {
        y7Var.mo13508a(obj2);
        throw null;
    }

    /* renamed from: f */
    static void m3339f(C1224na naVar, Object obj, Object obj2) {
        naVar.mo13027h(obj, naVar.mo13023d(naVar.mo13022c(obj), naVar.mo13022c(obj2)));
    }

    /* renamed from: g */
    public static void m3340g(Class cls) {
        Class cls2;
        if (!C1174k8.class.isAssignableFrom(cls) && (cls2 = f1727a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m3341h(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12687k(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m3342i(int i, List list, C1065db dbVar) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12679c(i, list);
        }
    }

    /* renamed from: j */
    public static void m3343j(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12668B(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m3344k(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12693q(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m3345l(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12690n(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m3346m(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12697u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m3347n(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12671E(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m3348o(int i, List list, C1065db dbVar, C1364w9 w9Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C1317t7) dbVar).mo12674H(i, list.get(i2), w9Var);
            }
        }
    }

    /* renamed from: p */
    public static void m3349p(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12691o(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m3350q(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12701y(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m3351r(int i, List list, C1065db dbVar, C1364w9 w9Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C1317t7) dbVar).mo12680d(i, list.get(i2), w9Var);
            }
        }
    }

    /* renamed from: s */
    public static void m3352s(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12667A(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m3353t(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12678b(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m3354u(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12700x(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m3355v(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12673G(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m3356w(int i, List list, C1065db dbVar) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12695s(i, list);
        }
    }

    /* renamed from: x */
    public static void m3357x(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12689m(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m3358y(int i, List list, C1065db dbVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dbVar.mo12702z(i, list, z);
        }
    }

    /* renamed from: z */
    static boolean m3359z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
