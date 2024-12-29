package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.push.t */
public class C4937t {

    /* renamed from: a */
    private static Context f10207a;

    /* renamed from: a */
    private static String f10208a;

    /* renamed from: a */
    public static int m15865a() {
        try {
            Class<?> a = m15867a((Context) null, "miui.os.Build");
            if (a.getField("IS_STABLE_VERSION").getBoolean((Object) null)) {
                return 3;
            }
            return a.getField("IS_DEVELOPMENT_VERSION").getBoolean((Object) null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static Context m15866a() {
        return f10207a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        com.xiaomi.channel.commonutils.logger.C3989b.m10669a(java.lang.String.format("loadClass fail hasContext= %s, errMsg = %s", new java.lang.Object[]{java.lang.Boolean.valueOf(r2), r5.getLocalizedMessage()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        throw new java.lang.ClassNotFoundException("loadClass fail ", r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[SYNTHETIC, Splitter:B:13:0x0024] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?> m15867a(android.content.Context r5, java.lang.String r6) {
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
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0024 }
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0024 }
            return r5
        L_0x0024:
            java.lang.Class r5 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0029 }
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
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4937t.m15867a(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* renamed from: a */
    public static synchronized String m15868a() {
        synchronized (C4937t.class) {
            if (f10208a != null) {
                String str = f10208a;
                return str;
            }
            String str2 = Build.VERSION.INCREMENTAL;
            if (m15865a() <= 0) {
                String b = m15873b();
                if (TextUtils.isEmpty(b)) {
                    b = m15875c();
                    if (TextUtils.isEmpty(b)) {
                        b = m15876d();
                        if (TextUtils.isEmpty(b)) {
                            str2 = String.valueOf(C4816s.m15380a("ro.product.brand", "Android") + "_" + str2);
                        }
                    }
                }
                str2 = b;
            }
            f10208a = str2;
            return str2;
        }
    }

    /* renamed from: a */
    public static String m15869a(Context context) {
        if (C4808l.m15363b()) {
            return "";
        }
        String str = (String) C4525ba.m13405a("com.xiaomi.xmsf.helper.MIIDAccountHelper", "getMIID", context);
        return TextUtils.isEmpty(str) ? TimerCodec.DISENABLE : str;
    }

    /* renamed from: a */
    public static void m15870a(Context context) {
        f10207a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static boolean m15871a() {
        return TextUtils.equals((String) C4525ba.m13405a("android.os.SystemProperties", "get", "sys.boot_completed"), TimerCodec.ENABLE);
    }

    /* renamed from: a */
    public static boolean m15872a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return false;
        }
    }

    /* renamed from: b */
    private static String m15873b() {
        String a = C4816s.m15380a("ro.build.version.emui", "");
        f10208a = a;
        return a;
    }

    /* renamed from: b */
    public static boolean m15874b() {
        try {
            return m15867a((Context) null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            C3989b.m10681d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return false;
        }
    }

    /* renamed from: c */
    private static String m15875c() {
        String a = C4816s.m15380a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(a) && !a.startsWith("ColorOS_")) {
            f10208a = "ColorOS_" + a;
        }
        return f10208a;
    }

    /* renamed from: d */
    private static String m15876d() {
        String a = C4816s.m15380a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(a) && !a.startsWith("FuntouchOS_")) {
            f10208a = "FuntouchOS_" + a;
        }
        return f10208a;
    }
}
