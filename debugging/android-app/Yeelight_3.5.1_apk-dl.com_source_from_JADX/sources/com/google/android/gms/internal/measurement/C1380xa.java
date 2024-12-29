package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.xa */
final class C1380xa {

    /* renamed from: a */
    private static final Unsafe f1710a;

    /* renamed from: b */
    private static final Class f1711b = C1013a7.m1682a();

    /* renamed from: c */
    private static final boolean f1712c;

    /* renamed from: d */
    private static final C1365wa f1713d;

    /* renamed from: e */
    private static final boolean f1714e;

    /* renamed from: f */
    private static final boolean f1715f;

    /* renamed from: g */
    static final long f1716g = ((long) m3256E(byte[].class));

    /* renamed from: h */
    static final boolean f1717h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m3268l()
            f1710a = r7
            java.lang.Class r8 = com.google.android.gms.internal.measurement.C1013a7.m1682a()
            f1711b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m3252A(r8)
            f1712c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m3252A(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.gms.internal.measurement.va r11 = new com.google.android.gms.internal.measurement.va
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.gms.internal.measurement.ua r11 = new com.google.android.gms.internal.measurement.ua
            r11.<init>(r7)
        L_0x003b:
            f1713d = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x0048
        L_0x0046:
            r8 = 0
            goto L_0x006e
        L_0x0048:
            sun.misc.Unsafe r11 = r11.f1697a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m3258b()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C1380xa.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f1714e = r8
            com.google.android.gms.internal.measurement.wa r8 = f1713d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f1697a
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r13] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e8 }
            r9[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00e8 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e8 }
            r14[r10] = r15     // Catch:{ all -> 0x00e8 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00e8 }
            r6 = 1
            goto L_0x00ed
        L_0x00e8:
            r6 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C1380xa.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f1715f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m3256E(r6)
            long r6 = (long) r6
            f1716g = r6
            m3256E(r5)
            m3257a(r5)
            m3256E(r4)
            m3257a(r4)
            m3256E(r3)
            m3257a(r3)
            m3256E(r2)
            m3257a(r2)
            m3256E(r1)
            m3257a(r1)
            m3256E(r0)
            m3257a(r0)
            java.lang.reflect.Field r0 = m3258b()
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.internal.measurement.wa r1 = f1713d
            if (r1 == 0) goto L_0x0129
            r1.mo13462l(r0)
        L_0x0129:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r12 = 0
        L_0x0133:
            f1717h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1380xa.<clinit>():void");
    }

    private C1380xa() {
    }

    /* renamed from: A */
    static boolean m3252A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C1013a7.f1230a;
        try {
            Class cls3 = f1711b;
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

    /* renamed from: B */
    static boolean m3253B(Object obj, long j) {
        return f1713d.mo13416g(obj, j);
    }

    /* renamed from: C */
    static boolean m3254C() {
        return f1715f;
    }

    /* renamed from: D */
    static boolean m3255D() {
        return f1714e;
    }

    /* renamed from: E */
    private static int m3256E(Class cls) {
        if (f1715f) {
            return f1713d.mo13458h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m3257a(Class cls) {
        if (f1715f) {
            return f1713d.mo13459i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m3258b() {
        int i = C1013a7.f1230a;
        Field c = m3259c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m3259c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m3259c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m3260d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C1365wa waVar = f1713d;
        int i = ((((int) j) ^ -1) & 3) << 3;
        waVar.mo13464n(obj, j2, ((255 & b) << i) | (waVar.mo13460j(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m3261e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C1365wa waVar = f1713d;
        int i = (((int) j) & 3) << 3;
        waVar.mo13464n(obj, j2, ((255 & b) << i) | (waVar.mo13460j(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: f */
    static double m3262f(Object obj, long j) {
        return f1713d.mo13410a(obj, j);
    }

    /* renamed from: g */
    static float m3263g(Object obj, long j) {
        return f1713d.mo13411b(obj, j);
    }

    /* renamed from: h */
    static int m3264h(Object obj, long j) {
        return f1713d.mo13460j(obj, j);
    }

    /* renamed from: i */
    static long m3265i(Object obj, long j) {
        return f1713d.mo13461k(obj, j);
    }

    /* renamed from: j */
    static Object m3266j(Class cls) {
        try {
            return f1710a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m3267k(Object obj, long j) {
        return f1713d.mo13463m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m3268l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1320ta());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m3274r(Object obj, long j, boolean z) {
        f1713d.mo13412c(obj, j, z);
    }

    /* renamed from: s */
    static void m3275s(byte[] bArr, long j, byte b) {
        f1713d.mo13413d(bArr, f1716g + j, b);
    }

    /* renamed from: t */
    static void m3276t(Object obj, long j, double d) {
        f1713d.mo13414e(obj, j, d);
    }

    /* renamed from: u */
    static void m3277u(Object obj, long j, float f) {
        f1713d.mo13415f(obj, j, f);
    }

    /* renamed from: v */
    static void m3278v(Object obj, long j, int i) {
        f1713d.mo13464n(obj, j, i);
    }

    /* renamed from: w */
    static void m3279w(Object obj, long j, long j2) {
        f1713d.mo13465o(obj, j, j2);
    }

    /* renamed from: x */
    static void m3280x(Object obj, long j, Object obj2) {
        f1713d.mo13466p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ boolean m3281y(Object obj, long j) {
        return ((byte) ((f1713d.mo13460j(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ boolean m3282z(Object obj, long j) {
        return ((byte) ((f1713d.mo13460j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
