package com.google.android.gms.internal.wearable;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.wearable.y2 */
final class C1534y2 {

    /* renamed from: a */
    private static final Unsafe f1884a;

    /* renamed from: b */
    private static final Class<?> f1885b = C1449h.m3539a();

    /* renamed from: c */
    private static final boolean f1886c;

    /* renamed from: d */
    private static final boolean f1887d;

    /* renamed from: e */
    private static final C1530x2 f1888e;

    /* renamed from: f */
    private static final boolean f1889f;

    /* renamed from: g */
    private static final boolean f1890g;

    /* renamed from: h */
    static final long f1891h = ((long) m3976E(byte[].class));

    /* renamed from: i */
    static final boolean f1892i;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m3998v()
            f1884a = r7
            java.lang.Class r8 = com.google.android.gms.internal.wearable.C1449h.m3539a()
            f1885b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m3999w(r8)
            f1886c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m3999w(r10)
            f1887d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            com.google.android.gms.internal.wearable.w2 r11 = new com.google.android.gms.internal.wearable.w2
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            com.google.android.gms.internal.wearable.v2 r11 = new com.google.android.gms.internal.wearable.v2
            r11.<init>(r7)
        L_0x003d:
            f1888e = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x004a
        L_0x0048:
            r8 = 0
            goto L_0x0073
        L_0x004a:
            sun.misc.Unsafe r11 = r11.f1877a
            if (r11 != 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006e }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006e }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x006e }
            r14[r13] = r6     // Catch:{ all -> 0x006e }
            r14[r12] = r8     // Catch:{ all -> 0x006e }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x006e }
            java.lang.reflect.Field r8 = m3978b()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = 1
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            m4000x(r8)
            goto L_0x0048
        L_0x0073:
            f1889f = r8
            com.google.android.gms.internal.wearable.x2 r8 = f1888e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = 0
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f1877a
            if (r8 != 0) goto L_0x0081
            goto L_0x0079
        L_0x0081:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r9[r13] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f1 }
            r9[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00f1 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f1 }
            r14[r10] = r15     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00f1 }
            r6 = 1
            goto L_0x00f6
        L_0x00f1:
            r6 = move-exception
            m4000x(r6)
            goto L_0x0079
        L_0x00f6:
            f1890g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m3976E(r6)
            long r6 = (long) r6
            f1891h = r6
            m3976E(r5)
            m3977a(r5)
            m3976E(r4)
            m3977a(r4)
            m3976E(r3)
            m3977a(r3)
            m3976E(r2)
            m3977a(r2)
            m3976E(r1)
            m3977a(r1)
            m3976E(r0)
            m3977a(r0)
            java.lang.reflect.Field r0 = m3978b()
            if (r0 == 0) goto L_0x0132
            com.google.android.gms.internal.wearable.x2 r1 = f1888e
            if (r1 == 0) goto L_0x0132
            r1.mo13844h(r0)
        L_0x0132:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r12 = 0
        L_0x013c:
            f1892i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1534y2.<clinit>():void");
    }

    private C1534y2() {
    }

    /* renamed from: A */
    static /* synthetic */ boolean m3972A(Object obj, long j) {
        return ((byte) ((f1888e.mo13847k(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: B */
    static /* synthetic */ boolean m3973B(Object obj, long j) {
        return ((byte) ((f1888e.mo13847k(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: E */
    private static int m3976E(Class<?> cls) {
        if (f1890g) {
            return f1888e.mo13845i(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m3977a(Class<?> cls) {
        if (f1890g) {
            return f1888e.mo13846j(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m3978b() {
        int i = C1449h.f1782a;
        Field c = m3979c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m3979c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m3979c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m3980d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C1530x2 x2Var = f1888e;
        int i = ((((int) j) ^ -1) & 3) << 3;
        x2Var.mo13848l(obj, j2, ((255 & b) << i) | (x2Var.mo13847k(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m3981e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C1530x2 x2Var = f1888e;
        int i = (((int) j) & 3) << 3;
        x2Var.mo13848l(obj, j2, ((255 & b) << i) | (x2Var.mo13847k(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: f */
    static boolean m3982f() {
        return f1890g;
    }

    /* renamed from: g */
    static boolean m3983g() {
        return f1889f;
    }

    /* renamed from: h */
    static <T> T m3984h(Class<T> cls) {
        try {
            return f1884a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: i */
    static int m3985i(Object obj, long j) {
        return f1888e.mo13847k(obj, j);
    }

    /* renamed from: j */
    static void m3986j(Object obj, long j, int i) {
        f1888e.mo13848l(obj, j, i);
    }

    /* renamed from: k */
    static long m3987k(Object obj, long j) {
        return f1888e.mo13849m(obj, j);
    }

    /* renamed from: l */
    static void m3988l(Object obj, long j, long j2) {
        f1888e.mo13850n(obj, j, j2);
    }

    /* renamed from: m */
    static boolean m3989m(Object obj, long j) {
        return f1888e.mo13827b(obj, j);
    }

    /* renamed from: n */
    static void m3990n(Object obj, long j, boolean z) {
        f1888e.mo13828c(obj, j, z);
    }

    /* renamed from: o */
    static float m3991o(Object obj, long j) {
        return f1888e.mo13829d(obj, j);
    }

    /* renamed from: p */
    static void m3992p(Object obj, long j, float f) {
        f1888e.mo13830e(obj, j, f);
    }

    /* renamed from: q */
    static double m3993q(Object obj, long j) {
        return f1888e.mo13831f(obj, j);
    }

    /* renamed from: r */
    static void m3994r(Object obj, long j, double d) {
        f1888e.mo13832g(obj, j, d);
    }

    /* renamed from: s */
    static Object m3995s(Object obj, long j) {
        return f1888e.mo13851o(obj, j);
    }

    /* renamed from: t */
    static void m3996t(Object obj, long j, Object obj2) {
        f1888e.mo13852p(obj, j, obj2);
    }

    /* renamed from: u */
    static void m3997u(byte[] bArr, long j, byte b) {
        f1888e.mo13826a(bArr, f1891h + j, b);
    }

    /* renamed from: v */
    static Unsafe m3998v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1517u2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: w */
    static boolean m3999w(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C1449h.f1782a;
        try {
            Class<?> cls3 = f1885b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: x */
    static /* synthetic */ void m4000x(Throwable th) {
        Logger logger = Logger.getLogger(C1534y2.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }
}
