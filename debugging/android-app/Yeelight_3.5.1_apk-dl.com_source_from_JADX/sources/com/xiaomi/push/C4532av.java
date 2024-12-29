package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.xiaomi.push.av */
class C4532av implements C4531au, InvocationHandler {

    /* renamed from: a */
    private static final String[][] f7578a = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* renamed from: a */
    private volatile int f7579a = 0;

    /* renamed from: a */
    private volatile long f7580a = 0;

    /* renamed from: a */
    private Context f7581a;

    /* renamed from: a */
    private volatile C4533a f7582a = null;

    /* renamed from: a */
    private Class f7583a = null;

    /* renamed from: a */
    private final Object f7584a = new Object();

    /* renamed from: a */
    private Method f7585a = null;

    /* renamed from: b */
    private Class f7586b = null;

    /* renamed from: b */
    private Method f7587b = null;

    /* renamed from: c */
    private Method f7588c = null;

    /* renamed from: d */
    private Method f7589d = null;

    /* renamed from: e */
    private Method f7590e = null;

    /* renamed from: f */
    private Method f7591f = null;

    /* renamed from: g */
    private Method f7592g = null;

    /* renamed from: com.xiaomi.push.av$a */
    private class C4533a {

        /* renamed from: a */
        Boolean f7594a;

        /* renamed from: a */
        String f7595a;

        /* renamed from: b */
        String f7596b;

        /* renamed from: c */
        String f7597c;

        /* renamed from: d */
        String f7598d;

        private C4533a() {
            this.f7594a = null;
            this.f7595a = null;
            this.f7596b = null;
            this.f7597c = null;
            this.f7598d = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo28757a() {
            if (!TextUtils.isEmpty(this.f7595a) || !TextUtils.isEmpty(this.f7596b) || !TextUtils.isEmpty(this.f7597c) || !TextUtils.isEmpty(this.f7598d)) {
                this.f7594a = Boolean.TRUE;
            }
            return this.f7594a != null;
        }
    }

    public C4532av(Context context) {
        this.f7581a = context.getApplicationContext();
        m12909a(context);
        m12912b(context);
    }

    /* renamed from: a */
    private static Class<?> m12905a(Context context, String str) {
        try {
            return C4994v.m15735a(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <T> T m12906a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            T invoke = method.invoke(obj, objArr);
            if (invoke != null) {
                return invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m12907a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void mo28753a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7584a
            monitor-enter(r0)
            java.lang.Object r1 = r2.f7584a     // Catch:{ Exception -> 0x000b }
            r1.notifyAll()     // Catch:{ Exception -> 0x000b }
            goto L_0x000b
        L_0x0009:
            r1 = move-exception
            goto L_0x000d
        L_0x000b:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4532av.mo28753a():void");
    }

    /* renamed from: a */
    private void m12909a(Context context) {
        Class<?> a = m12905a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i = 0;
        while (true) {
            String[][] strArr = f7578a;
            if (i >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i];
            Class<?> a2 = m12905a(context, strArr2[0]);
            Class<?> a3 = m12905a(context, strArr2[1]);
            if (a2 != null && a3 != null) {
                m12913b("found class in index " + i);
                Class<?> cls3 = a2;
                cls2 = a3;
                cls = cls3;
                break;
            }
            i++;
            Class<?> cls4 = a2;
            cls2 = a3;
            cls = cls4;
        }
        this.f7583a = a;
        this.f7585a = m12907a(a, "InitSdk", (Class<?>[]) new Class[]{Context.class, cls});
        this.f7586b = cls;
        this.f7587b = m12907a(cls2, "getUDID", (Class<?>[]) new Class[0]);
        this.f7588c = m12907a(cls2, "getOAID", (Class<?>[]) new Class[0]);
        this.f7589d = m12907a(cls2, "getVAID", (Class<?>[]) new Class[0]);
        this.f7590e = m12907a(cls2, "getAAID", (Class<?>[]) new Class[0]);
        this.f7591f = m12907a(cls2, "isSupported", (Class<?>[]) new Class[0]);
        this.f7592g = m12907a(cls2, "shutDown", (Class<?>[]) new Class[0]);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|31|(2:33|34)|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12910a(java.lang.String r12) {
        /*
            r11 = this;
            com.xiaomi.push.av$a r0 = r11.f7582a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            long r0 = r11.f7580a
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = java.lang.Math.abs(r0)
            long r2 = r2 - r4
            int r4 = r11.f7579a
            r5 = 3000(0xbb8, double:1.482E-320)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0057
            r7 = 3
            if (r4 >= r7) goto L_0x0057
            java.lang.Object r7 = r11.f7584a
            monitor-enter(r7)
            long r8 = r11.f7580a     // Catch:{ all -> 0x0054 }
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x0052
            int r8 = r11.f7579a     // Catch:{ all -> 0x0054 }
            if (r8 != r4) goto L_0x0052
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "retry, current count is "
            r0.append(r1)     // Catch:{ all -> 0x0054 }
            r0.append(r4)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0054 }
            m12913b((java.lang.String) r0)     // Catch:{ all -> 0x0054 }
            int r0 = r11.f7579a     // Catch:{ all -> 0x0054 }
            int r0 = r0 + 1
            r11.f7579a = r0     // Catch:{ all -> 0x0054 }
            android.content.Context r0 = r11.f7581a     // Catch:{ all -> 0x0054 }
            r11.m12912b((android.content.Context) r0)     // Catch:{ all -> 0x0054 }
            long r0 = r11.f7580a     // Catch:{ all -> 0x0054 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0054 }
            long r8 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0054 }
            long r2 = r2 - r8
        L_0x0052:
            monitor-exit(r7)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x0054:
            r12 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0054 }
            throw r12
        L_0x0057:
            com.xiaomi.push.av$a r4 = r11.f7582a
            if (r4 != 0) goto L_0x0094
            r7 = 0
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0094
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0094
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L_0x0094
            java.lang.Object r0 = r11.f7584a
            monitor-enter(r0)
            com.xiaomi.push.av$a r1 = r11.f7582a     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x008f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
            r1.<init>()     // Catch:{ Exception -> 0x008f }
            r1.append(r12)     // Catch:{ Exception -> 0x008f }
            java.lang.String r12 = " wait..."
            r1.append(r12)     // Catch:{ Exception -> 0x008f }
            java.lang.String r12 = r1.toString()     // Catch:{ Exception -> 0x008f }
            m12913b((java.lang.String) r12)     // Catch:{ Exception -> 0x008f }
            java.lang.Object r12 = r11.f7584a     // Catch:{ Exception -> 0x008f }
            r12.wait(r5)     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x0094
        L_0x0091:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r12
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4532av.m12910a(java.lang.String):void");
    }

    /* renamed from: a */
    private static boolean m12911a(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    /* renamed from: b */
    private void m12912b(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = -elapsedRealtime;
        Class cls = this.f7586b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{this.f7586b}, this);
                m12906a(this.f7585a, this.f7583a.newInstance(), context, newProxyInstance);
            } catch (Throwable th) {
                m12913b("call init sdk error:" + th);
            }
            this.f7580a = elapsedRealtime;
        }
        elapsedRealtime = j;
        this.f7580a = elapsedRealtime;
    }

    /* renamed from: b */
    private static void m12913b(String str) {
        C4408b.m12464a("mdid:" + str);
    }

    /* renamed from: a */
    public String m12914a() {
        m12910a("getOAID");
        if (this.f7582a == null) {
            return null;
        }
        return this.f7582a.f7596b;
    }

    /* renamed from: a */
    public boolean m12915a() {
        m12910a("isSupported");
        return this.f7582a != null && Boolean.TRUE.equals(this.f7582a.f7594a);
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f7580a = SystemClock.elapsedRealtime();
        if (objArr != null) {
            C4533a aVar = new C4533a();
            int length = objArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr[i];
                if (obj2 != null && !m12911a(obj2)) {
                    aVar.f7595a = (String) m12906a(this.f7587b, obj2, new Object[0]);
                    aVar.f7596b = (String) m12906a(this.f7588c, obj2, new Object[0]);
                    aVar.f7597c = (String) m12906a(this.f7589d, obj2, new Object[0]);
                    aVar.f7598d = (String) m12906a(this.f7590e, obj2, new Object[0]);
                    aVar.f7594a = (Boolean) m12906a(this.f7591f, obj2, new Object[0]);
                    m12906a(this.f7592g, obj2, new Object[0]);
                    if (aVar.mo28757a()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("has get succ, check duplicate:");
                        if (this.f7582a != null) {
                            z = true;
                        }
                        sb.append(z);
                        m12913b(sb.toString());
                        synchronized (C4532av.class) {
                            if (this.f7582a == null) {
                                this.f7582a = aVar;
                            }
                        }
                    }
                }
                i++;
            }
        }
        mo28753a();
        return null;
    }
}
