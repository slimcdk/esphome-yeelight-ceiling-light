package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.k7 */
final class C1859k7 {

    /* renamed from: a */
    private static final Logger f3518a = Logger.getLogger(C1859k7.class.getName());

    /* renamed from: b */
    private static final Unsafe f3519b = m5346t();

    /* renamed from: c */
    private static final Class<?> f3520c = C1735c3.m4944c();

    /* renamed from: d */
    private static final boolean f3521d = m5313B(Long.TYPE);

    /* renamed from: e */
    private static final boolean f3522e = m5313B(Integer.TYPE);

    /* renamed from: f */
    private static final C1863d f3523f;

    /* renamed from: g */
    private static final boolean f3524g = m5316E();

    /* renamed from: h */
    private static final boolean f3525h = m5312A();

    /* renamed from: i */
    private static final long f3526i = ((long) m5340n(byte[].class));

    /* renamed from: j */
    static final boolean f3527j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.measurement.k7$a */
    static final class C1860a extends C1863d {
        C1860a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo11773a(Object obj, long j) {
            return C1859k7.f3527j ? C1859k7.m5323L(obj, j) : C1859k7.m5324M(obj, j);
        }

        /* renamed from: b */
        public final void mo11774b(Object obj, long j, byte b) {
            if (C1859k7.f3527j) {
                C1859k7.m5347u(obj, j, b);
            } else {
                C1859k7.m5351y(obj, j, b);
            }
        }

        /* renamed from: c */
        public final void mo11775c(Object obj, long j, double d) {
            mo11782f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo11776d(Object obj, long j, float f) {
            mo11781e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo11777g(Object obj, long j, boolean z) {
            if (C1859k7.f3527j) {
                C1859k7.m5352z(obj, j, z);
            } else {
                C1859k7.m5315D(obj, j, z);
            }
        }

        /* renamed from: h */
        public final boolean mo11778h(Object obj, long j) {
            return C1859k7.f3527j ? C1859k7.m5325N(obj, j) : C1859k7.m5326O(obj, j);
        }

        /* renamed from: i */
        public final float mo11779i(Object obj, long j) {
            return Float.intBitsToFloat(mo11783k(obj, j));
        }

        /* renamed from: j */
        public final double mo11780j(Object obj, long j) {
            return Double.longBitsToDouble(mo11784l(obj, j));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.k7$b */
    static final class C1861b extends C1863d {
        C1861b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo11773a(Object obj, long j) {
            return this.f3528a.getByte(obj, j);
        }

        /* renamed from: b */
        public final void mo11774b(Object obj, long j, byte b) {
            this.f3528a.putByte(obj, j, b);
        }

        /* renamed from: c */
        public final void mo11775c(Object obj, long j, double d) {
            this.f3528a.putDouble(obj, j, d);
        }

        /* renamed from: d */
        public final void mo11776d(Object obj, long j, float f) {
            this.f3528a.putFloat(obj, j, f);
        }

        /* renamed from: g */
        public final void mo11777g(Object obj, long j, boolean z) {
            this.f3528a.putBoolean(obj, j, z);
        }

        /* renamed from: h */
        public final boolean mo11778h(Object obj, long j) {
            return this.f3528a.getBoolean(obj, j);
        }

        /* renamed from: i */
        public final float mo11779i(Object obj, long j) {
            return this.f3528a.getFloat(obj, j);
        }

        /* renamed from: j */
        public final double mo11780j(Object obj, long j) {
            return this.f3528a.getDouble(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.k7$c */
    static final class C1862c extends C1863d {
        C1862c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo11773a(Object obj, long j) {
            return C1859k7.f3527j ? C1859k7.m5323L(obj, j) : C1859k7.m5324M(obj, j);
        }

        /* renamed from: b */
        public final void mo11774b(Object obj, long j, byte b) {
            if (C1859k7.f3527j) {
                C1859k7.m5347u(obj, j, b);
            } else {
                C1859k7.m5351y(obj, j, b);
            }
        }

        /* renamed from: c */
        public final void mo11775c(Object obj, long j, double d) {
            mo11782f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo11776d(Object obj, long j, float f) {
            mo11781e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo11777g(Object obj, long j, boolean z) {
            if (C1859k7.f3527j) {
                C1859k7.m5352z(obj, j, z);
            } else {
                C1859k7.m5315D(obj, j, z);
            }
        }

        /* renamed from: h */
        public final boolean mo11778h(Object obj, long j) {
            return C1859k7.f3527j ? C1859k7.m5325N(obj, j) : C1859k7.m5326O(obj, j);
        }

        /* renamed from: i */
        public final float mo11779i(Object obj, long j) {
            return Float.intBitsToFloat(mo11783k(obj, j));
        }

        /* renamed from: j */
        public final double mo11780j(Object obj, long j) {
            return Double.longBitsToDouble(mo11784l(obj, j));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.k7$d */
    static abstract class C1863d {

        /* renamed from: a */
        Unsafe f3528a;

        C1863d(Unsafe unsafe) {
            this.f3528a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo11773a(Object obj, long j);

        /* renamed from: b */
        public abstract void mo11774b(Object obj, long j, byte b);

        /* renamed from: c */
        public abstract void mo11775c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo11776d(Object obj, long j, float f);

        /* renamed from: e */
        public final void mo11781e(Object obj, long j, int i) {
            this.f3528a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void mo11782f(Object obj, long j, long j2) {
            this.f3528a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo11777g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract boolean mo11778h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo11779i(Object obj, long j);

        /* renamed from: j */
        public abstract double mo11780j(Object obj, long j);

        /* renamed from: k */
        public final int mo11783k(Object obj, long j) {
            return this.f3528a.getInt(obj, j);
        }

        /* renamed from: l */
        public final long mo11784l(Object obj, long j) {
            return this.f3528a.getLong(obj, j);
        }
    }

    static {
        C1863d dVar;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        C1863d dVar2 = null;
        if (f3519b != null) {
            if (!C1735c3.m4943b()) {
                dVar2 = new C1861b(f3519b);
            } else if (f3521d) {
                dVar2 = new C1862c(f3519b);
            } else if (f3522e) {
                dVar2 = new C1860a(f3519b);
            }
        }
        f3523f = dVar2;
        m5340n(cls6);
        m5345s(cls6);
        m5340n(cls5);
        m5345s(cls5);
        m5340n(cls4);
        m5345s(cls4);
        m5340n(cls3);
        m5345s(cls3);
        m5340n(cls2);
        m5345s(cls2);
        m5340n(cls);
        m5345s(cls);
        Field G = m5318G();
        if (!(G == null || (dVar = f3523f) == null)) {
            dVar.f3528a.objectFieldOffset(G);
        }
    }

    private C1859k7() {
    }

    /* renamed from: A */
    private static boolean m5312A() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f3519b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (C1735c3.m4943b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f3518a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: B */
    private static boolean m5313B(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C1735c3.m4943b()) {
            return false;
        }
        try {
            Class<?> cls3 = f3520c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: C */
    static double m5314C(Object obj, long j) {
        return f3523f.mo11780j(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static void m5315D(Object obj, long j, boolean z) {
        m5351y(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: E */
    private static boolean m5316E() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f3519b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (m5318G() == null) {
                return false;
            }
            if (C1735c3.m4943b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f3518a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: F */
    static Object m5317F(Object obj, long j) {
        return f3523f.f3528a.getObject(obj, j);
    }

    /* renamed from: G */
    private static Field m5318G() {
        Field d;
        if (C1735c3.m4943b() && (d = m5330d(Buffer.class, "effectiveDirectAddress")) != null) {
            return d;
        }
        Field d2 = m5330d(Buffer.class, "address");
        if (d2 == null || d2.getType() != Long.TYPE) {
            return null;
        }
        return d2;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static byte m5323L(Object obj, long j) {
        return (byte) (m5328b(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static byte m5324M(Object obj, long j) {
        return (byte) (m5328b(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static boolean m5325N(Object obj, long j) {
        return m5323L(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static boolean m5326O(Object obj, long j) {
        return m5324M(obj, j) != 0;
    }

    /* renamed from: a */
    static byte m5327a(byte[] bArr, long j) {
        return f3523f.mo11773a(bArr, f3526i + j);
    }

    /* renamed from: b */
    static int m5328b(Object obj, long j) {
        return f3523f.mo11783k(obj, j);
    }

    /* renamed from: c */
    static <T> T m5329c(Class<T> cls) {
        try {
            return f3519b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    private static Field m5330d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    static void m5332f(Object obj, long j, double d) {
        f3523f.mo11775c(obj, j, d);
    }

    /* renamed from: g */
    static void m5333g(Object obj, long j, float f) {
        f3523f.mo11776d(obj, j, f);
    }

    /* renamed from: h */
    static void m5334h(Object obj, long j, int i) {
        f3523f.mo11781e(obj, j, i);
    }

    /* renamed from: i */
    static void m5335i(Object obj, long j, long j2) {
        f3523f.mo11782f(obj, j, j2);
    }

    /* renamed from: j */
    static void m5336j(Object obj, long j, Object obj2) {
        f3523f.f3528a.putObject(obj, j, obj2);
    }

    /* renamed from: k */
    static void m5337k(Object obj, long j, boolean z) {
        f3523f.mo11777g(obj, j, z);
    }

    /* renamed from: l */
    static void m5338l(byte[] bArr, long j, byte b) {
        f3523f.mo11774b(bArr, f3526i + j, b);
    }

    /* renamed from: m */
    static boolean m5339m() {
        return f3525h;
    }

    /* renamed from: n */
    private static int m5340n(Class<?> cls) {
        if (f3525h) {
            return f3523f.f3528a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: o */
    static long m5341o(Object obj, long j) {
        return f3523f.mo11784l(obj, j);
    }

    /* renamed from: r */
    static boolean m5344r() {
        return f3524g;
    }

    /* renamed from: s */
    private static int m5345s(Class<?> cls) {
        if (f3525h) {
            return f3523f.f3528a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: t */
    static Unsafe m5346t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1898m7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static void m5347u(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m5334h(obj, j2, ((255 & b) << i) | (m5328b(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: w */
    static boolean m5349w(Object obj, long j) {
        return f3523f.mo11778h(obj, j);
    }

    /* renamed from: x */
    static float m5350x(Object obj, long j) {
        return f3523f.mo11779i(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static void m5351y(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m5334h(obj, j2, ((255 & b) << i) | (m5328b(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static void m5352z(Object obj, long j, boolean z) {
        m5347u(obj, j, z ? (byte) 1 : 0);
    }
}
