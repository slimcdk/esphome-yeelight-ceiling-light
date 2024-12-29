package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.SinceKotlin;

/* renamed from: kotlin.jvm.internal.q */
public class C9424q {
    private C9424q() {
    }

    /* renamed from: a */
    public static boolean m22992a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m22993b(Object obj) {
        if (obj == null) {
            m23004m();
        }
    }

    /* renamed from: c */
    public static void m22994c(Object obj, String str) {
        if (obj == null) {
            m23005n(str);
        }
    }

    /* renamed from: d */
    public static void m22995d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m23001j(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: e */
    public static void m22996e(Object obj, String str) {
        if (obj == null) {
            m23006o(str);
        }
    }

    /* renamed from: f */
    public static int m22997f(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: g */
    public static int m22998g(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: h */
    private static String m22999h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: i */
    public static void m23000i(int i, String str) {
        m23007p();
    }

    /* renamed from: j */
    private static <T extends Throwable> T m23001j(T t) {
        return m23002k(t, C9424q.class.getName());
    }

    /* renamed from: k */
    static <T extends Throwable> T m23002k(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: l */
    public static String m23003l(String str, Object obj) {
        return str + obj;
    }

    @SinceKotlin(version = "1.4")
    /* renamed from: m */
    public static void m23004m() {
        throw ((NullPointerException) m23001j(new NullPointerException()));
    }

    @SinceKotlin(version = "1.4")
    /* renamed from: n */
    public static void m23005n(String str) {
        throw ((NullPointerException) m23001j(new NullPointerException(str)));
    }

    /* renamed from: o */
    private static void m23006o(String str) {
        throw ((NullPointerException) m23001j(new NullPointerException(m22999h(str))));
    }

    /* renamed from: p */
    public static void m23007p() {
        m23008q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: q */
    public static void m23008q(String str) {
        throw new UnsupportedOperationException(str);
    }
}
