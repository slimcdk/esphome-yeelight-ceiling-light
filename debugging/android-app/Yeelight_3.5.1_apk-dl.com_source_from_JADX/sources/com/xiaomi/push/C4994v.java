package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.push.v */
public class C4994v {

    /* renamed from: a */
    private static Context f9763a;

    /* renamed from: a */
    private static String f9764a;

    /* renamed from: a */
    public static int m15733a() {
        try {
            Class<?> a = m15735a((Context) null, "miui.os.Build");
            if (a.getField("IS_STABLE_VERSION").getBoolean((Object) null)) {
                return 3;
            }
            return a.getField("IS_DEVELOPMENT_VERSION").getBoolean((Object) null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static Context m15734a() {
        return f9763a;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[SYNTHETIC, Splitter:B:13:0x0024] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?> m15735a(android.content.Context r5, java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x004a
            java.lang.String r0 = r6.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x004a
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0024
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L_0x0024
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ all -> 0x0024 }
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ all -> 0x0024 }
            return r5
        L_0x0024:
            java.lang.Class r5 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0029 }
            return r5
        L_0x0029:
            r5 = move-exception
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6[r1] = r2
            java.lang.String r1 = r5.getLocalizedMessage()
            r6[r0] = r1
            java.lang.String r0 = "loadClass fail hasContext= %s, errMsg = %s"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r6)
            java.lang.ClassNotFoundException r6 = new java.lang.ClassNotFoundException
            java.lang.String r0 = "loadClass fail "
            r6.<init>(r0, r5)
            throw r6
        L_0x004a:
            java.lang.ClassNotFoundException r5 = new java.lang.ClassNotFoundException
            java.lang.String r6 = "class is empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4994v.m15735a(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* renamed from: a */
    public static synchronized String m15736a() {
        synchronized (C4994v.class) {
            String str = f9764a;
            if (str != null) {
                return str;
            }
            String str2 = Build.VERSION.INCREMENTAL;
            if (m15733a() <= 0) {
                String b = m15740b();
                if (TextUtils.isEmpty(b)) {
                    b = m15742c();
                    if (TextUtils.isEmpty(b)) {
                        b = m15743d();
                        if (TextUtils.isEmpty(b)) {
                            str2 = String.valueOf(C4993u.m15732a("ro.product.brand", "Android") + "_" + str2);
                        }
                    }
                }
                str2 = b;
            }
            f9764a = str2;
            return str2;
        }
    }

    /* renamed from: a */
    public static void m15737a(Context context) {
        f9763a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static boolean m15738a() {
        return TextUtils.equals((String) C4554bk.m13014a("android.os.SystemProperties", "get", "sys.boot_completed"), TimerCodec.ENABLE);
    }

    /* renamed from: a */
    public static boolean m15739a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            return false;
        }
    }

    /* renamed from: b */
    private static String m15740b() {
        String a = C4993u.m15732a("ro.build.version.emui", "");
        f9764a = a;
        return a;
    }

    /* renamed from: b */
    public static boolean m15741b() {
        try {
            return m15735a((Context) null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            C4408b.m12483d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            return false;
        }
    }

    /* renamed from: c */
    private static String m15742c() {
        String a = C4993u.m15732a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(a) && !a.startsWith("ColorOS_")) {
            f9764a = "ColorOS_" + a;
        }
        return f9764a;
    }

    /* renamed from: d */
    private static String m15743d() {
        String a = C4993u.m15732a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(a) && !a.startsWith("FuntouchOS_")) {
            f9764a = "FuntouchOS_" + a;
        }
        return f9764a;
    }
}
