package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.p007os.EnvironmentCompat;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.xiaomi.push.j */
public class C4805j {

    /* renamed from: a */
    private static String f9261a = null;

    /* renamed from: a */
    private static final Set<String> f9262a;

    /* renamed from: a */
    private static boolean f9263a = true;

    /* renamed from: a */
    private static final String[] f9264a = {"--", "a-", "u-", "v-", "o-", "g-"};

    /* renamed from: b */
    private static String f9265b = null;

    /* renamed from: c */
    private static String f9266c = "";

    /* renamed from: d */
    private static String f9267d;

    /* renamed from: e */
    private static String f9268e;

    /* renamed from: f */
    private static final String f9269f = String.valueOf(2);

    static {
        HashSet hashSet = new HashSet();
        f9262a = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add("com.xiaomi.finddevice");
        hashSet.add("com.miui.securitycenter");
    }

    /* renamed from: a */
    private static double m14857a(double d) {
        int i = 1;
        while (true) {
            double d2 = (double) i;
            if (d2 >= d) {
                return d2;
            }
            i <<= 1;
        }
    }

    /* renamed from: a */
    private static float m14858a(int i) {
        float f = (((float) (((((i + 102400) / 524288) + 1) * 512) * 1024)) / 1024.0f) / 1024.0f;
        double d = (double) f;
        return d > 0.5d ? (float) Math.ceil(d) : f;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static int m14859a() {
        Object a = C4554bk.m13014a("android.os.UserHandle", "myUserId", new Object[0]);
        if (a == null) {
            return -1;
        }
        return Integer.class.cast(a).intValue();
    }

    /* renamed from: a */
    private static long m14860a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    /* renamed from: a */
    public static String m14861a() {
        return m14858a(m14868b()) + "GB";
    }

    /* renamed from: a */
    private static String m14862a(int i) {
        if (i > 0) {
            String[] strArr = f9264a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return f9264a[0];
    }

    /* renamed from: a */
    public static String m14863a(Context context) {
        try {
            return C4825k.m14993a(context).mo29883a();
        } catch (Exception e) {
            C4408b.m12464a("failure to get gaid:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static String m14864a(Context context, boolean z) {
        if (f9267d == null) {
            String c = m14875c(context);
            String d = !C4830m.m15015d() ? z ? m14879d(context) : m14888l(context) : "";
            String b = m14870b(context);
            int i = 1;
            if ((Build.VERSION.SDK_INT < 26) || !m14872b(d) || !m14872b(b)) {
                c = d + c + b;
            } else {
                String b2 = C4539ba.m12950a(context).mo28768b();
                if (!TextUtils.isEmpty(b2)) {
                    c = b2 + c;
                    i = 2;
                } else {
                    String a = C4539ba.m12950a(context).mo28753a();
                    if (TextUtils.isEmpty(a) || a.startsWith("00000000-0000-0000-0000-000000000000")) {
                        i = 5;
                    } else {
                        i = 4;
                        c = a;
                    }
                }
            }
            C4408b.m12481b("devid rule select:" + i);
            if (i == 3) {
                f9267d = c;
            } else {
                f9267d = m14858a(i) + C4561bp.m13051b(c);
            }
        }
        return f9267d;
    }

    /* renamed from: a */
    public static boolean m14865a(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: a */
    public static boolean m14866a(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) C4554bk.m13012a((Object) context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        if (!(packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null)) {
            int i = applicationInfo.flags;
            if ((i & 2097152) != 2097152 || (i & 8388608) == 8388608) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m14867a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = f9264a;
            if (i >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[SYNTHETIC, Splitter:B:24:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056 A[SYNTHETIC, Splitter:B:30:0x0056] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14868b() {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            r2 = 0
            if (r0 == 0) goto L_0x0059
            r0 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0053, all -> 0x0049 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0053, all -> 0x0049 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0053, all -> 0x0049 }
            r4 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x0053, all -> 0x0049 }
            java.lang.String r0 = r1.readLine()     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            if (r3 != 0) goto L_0x0041
            java.lang.String r3 = "\\s+"
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            if (r0 == 0) goto L_0x0041
            int r3 = r0.length     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r4 = 2
            if (r3 < r4) goto L_0x0041
            r3 = 1
            r4 = r0[r3]     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            boolean r4 = android.text.TextUtils.isDigitsOnly(r4)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            if (r4 == 0) goto L_0x0041
            r0 = r0[r3]     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r2 = r0
        L_0x0041:
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x0059
        L_0x0045:
            r0 = move-exception
            goto L_0x004d
        L_0x0047:
            r0 = r1
            goto L_0x0054
        L_0x0049:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            throw r0
        L_0x0053:
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r0.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4805j.m14868b():int");
    }

    /* renamed from: b */
    public static String m14869b() {
        double a = (double) m14860a(Environment.getDataDirectory());
        Double.isNaN(a);
        double a2 = m14857a(((a / 1024.0d) / 1024.0d) / 1024.0d);
        return a2 + "GB";
    }

    /* renamed from: b */
    public static String m14870b(Context context) {
        return null;
    }

    /* renamed from: b */
    public static boolean m14871b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    /* renamed from: b */
    private static boolean m14872b(String str) {
        if (str == null) {
            return true;
        }
        String trim = str.trim();
        return trim.length() == 0 || trim.equalsIgnoreCase("null") || trim.equalsIgnoreCase(EnvironmentCompat.MEDIA_UNKNOWN);
    }

    /* renamed from: c */
    private static int m14873c() {
        return Build.VERSION.SDK_INT < 29 ? 10 : 0;
    }

    /* renamed from: c */
    public static String m14874c() {
        return m14868b() + "KB";
    }

    /* renamed from: c */
    public static String m14875c(Context context) {
        String str = f9265b;
        if (str != null || !f9263a) {
            return str;
        }
        boolean d = m14879d(context);
        f9263a = d;
        if (!d) {
            return null;
        }
        try {
            f9265b = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            C4408b.m12464a("failure to get androidId: " + th);
        }
        return f9265b;
    }

    /* renamed from: c */
    private static boolean m14876c(Context context) {
        String packageName = context.getPackageName();
        if (!C4830m.m14997a() || !f9262a.contains(packageName)) {
            return false;
        }
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", packageName) == 0 || context.getPackageManager().checkPermission("android.permission.READ_PRIVILEGED_PHONE_STATE", packageName) == 0;
    }

    /* renamed from: c */
    private static boolean m14877c(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 15 && str.length() >= 14 && C4561bp.m13051b(str) && !C4561bp.m13054c(str);
    }

    /* renamed from: d */
    public static String m14878d() {
        long a = m14860a(Environment.getDataDirectory());
        return (a / 1024) + "KB";
    }

    /* renamed from: d */
    public static String m14879d(Context context) {
        int c = m14873c();
        String e = m14881e(context);
        while (e == null) {
            int i = c - 1;
            if (c <= 0) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            e = m14881e(context);
            c = i;
        }
        return e;
    }

    /* renamed from: d */
    private static boolean m14880d(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            return true;
        }
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
        intent.setComponent(componentName);
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
            if (bundle != null) {
                String string = bundle.getString("supportGetAndroidID");
                if (TextUtils.isEmpty(string)) {
                    return true;
                }
                return Boolean.parseBoolean(string);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r2 = com.xiaomi.push.C4554bk.m13012a((r2 = com.xiaomi.push.C4554bk.m13014a("miui.telephony.TelephonyManager", "getDefault", new java.lang.Object[0])), "getMiuiDeviceId", new java.lang.Object[0]);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14881e(android.content.Context r6) {
        /*
            boolean r0 = com.xiaomi.push.C4830m.m15015d()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.String r0 = f9261a
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            r0 = 0
            boolean r2 = m14875c((android.content.Context) r6)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0074
            boolean r2 = com.xiaomi.push.C4830m.m14997a()     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = "miui.telephony.TelephonyManager"
            java.lang.String r3 = "getDefault"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x007f }
            java.lang.Object r2 = com.xiaomi.push.C4554bk.m13014a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r5)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x003f
            java.lang.String r3 = "getMiuiDeviceId"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x007f }
            java.lang.Object r2 = com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r2, (java.lang.String) r3, (java.lang.Object[]) r4)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x003f
            boolean r3 = r2 instanceof java.lang.String     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x003f
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Object r2 = r3.cast(r2)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x007f }
            goto L_0x0040
        L_0x003f:
            r2 = r0
        L_0x0040:
            if (r2 != 0) goto L_0x0075
            java.lang.String r3 = "phone"
            java.lang.Object r6 = r6.getSystemService(r3)     // Catch:{ all -> 0x007f }
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ all -> 0x007f }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007f }
            r4 = 26
            if (r3 >= r4) goto L_0x0055
            java.lang.String r2 = r6.getDeviceId()     // Catch:{ all -> 0x007f }
            goto L_0x0075
        L_0x0055:
            r3 = 1
            int r4 = r6.getPhoneType()     // Catch:{ all -> 0x007f }
            if (r3 != r4) goto L_0x0066
            java.lang.String r2 = "getImei"
            java.lang.Object r6 = com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r6, (java.lang.String) r2, (java.lang.Object[]) r0)     // Catch:{ all -> 0x007f }
        L_0x0062:
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x007f }
            goto L_0x0075
        L_0x0066:
            r3 = 2
            int r4 = r6.getPhoneType()     // Catch:{ all -> 0x007f }
            if (r3 != r4) goto L_0x0075
            java.lang.String r2 = "getMeid"
            java.lang.Object r6 = com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r6, (java.lang.String) r2, (java.lang.Object[]) r0)     // Catch:{ all -> 0x007f }
            goto L_0x0062
        L_0x0074:
            r2 = r0
        L_0x0075:
            boolean r6 = m14877c((java.lang.String) r2)     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x007e
            f9261a = r2     // Catch:{ all -> 0x007f }
            return r2
        L_0x007e:
            return r1
        L_0x007f:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failure to get id:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4805j.m14881e(android.content.Context):java.lang.String");
    }

    /* renamed from: f */
    public static String m14882f(Context context) {
        int c = m14873c();
        String h = m14884h(context);
        while (h == null) {
            int i = c - 1;
            if (c <= 0) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            h = m14884h(context);
            c = i;
        }
        return h;
    }

    /* renamed from: g */
    public static String m14883g(Context context) {
        Object a;
        if (C4830m.m15015d() || Build.VERSION.SDK_INT < 22) {
            return "";
        }
        if (!TextUtils.isEmpty(f9266c)) {
            return f9266c;
        }
        m14881e(context);
        if (TextUtils.isEmpty(f9261a)) {
            return "";
        }
        try {
            if (m14875c(context)) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                Integer num = (Integer) C4554bk.m13012a((Object) telephonyManager, "getPhoneCount", new Object[0]);
                if (num != null && num.intValue() > 1) {
                    String str = null;
                    for (int i = 0; i < num.intValue(); i++) {
                        if (Build.VERSION.SDK_INT < 26) {
                            a = C4554bk.m13012a((Object) telephonyManager, "getDeviceId", Integer.valueOf(i));
                        } else if (1 == telephonyManager.getPhoneType()) {
                            a = C4554bk.m13012a((Object) telephonyManager, "getImei", Integer.valueOf(i));
                        } else {
                            if (2 == telephonyManager.getPhoneType()) {
                                a = C4554bk.m13012a((Object) telephonyManager, "getMeid", Integer.valueOf(i));
                            }
                            if (!TextUtils.isEmpty(str) && !TextUtils.equals(f9261a, str) && m14877c(str)) {
                                f9266c += str + Constants.ACCEPT_TIME_SEPARATOR_SP;
                            }
                        }
                        str = (String) a;
                        f9266c += str + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                    int length = f9266c.length();
                    if (length > 0) {
                        f9266c = f9266c.substring(0, length - 1);
                    }
                    return f9266c;
                }
            }
            return "";
        } catch (Exception e) {
            C4408b.m12464a("failure to get ids: " + e);
            return "";
        }
    }

    /* renamed from: h */
    public static String m14884h(Context context) {
        m14883g(context);
        String str = "";
        if (TextUtils.isEmpty(f9266c)) {
            return str;
        }
        for (String str2 : f9266c.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (m14877c(str2)) {
                str = str + C4561bp.m13042a(str2) + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
        }
        int length = str.length();
        return length > 0 ? str.substring(0, length - 1) : str;
    }

    /* renamed from: i */
    public static synchronized String m14885i(Context context) {
        synchronized (C4805j.class) {
            String str = f9268e;
            if (str != null) {
                return str;
            }
            String c = m14875c(context);
            String b = m14870b(context);
            String b2 = C4561bp.m13051b(c + b);
            f9268e = b2;
            return b2;
        }
    }

    /* renamed from: j */
    public static synchronized String m14886j(Context context) {
        String b;
        synchronized (C4805j.class) {
            String c = m14875c(context);
            b = C4561bp.m13051b(c + null);
        }
        return b;
    }

    /* renamed from: k */
    public static String m14887k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    /* renamed from: l */
    private static String m14888l(Context context) {
        int c = m14873c();
        String e = m14881e(context);
        while (TextUtils.isEmpty(e)) {
            int i = c - 1;
            if (c <= 0) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            e = m14881e(context);
            c = i;
        }
        return e;
    }
}
