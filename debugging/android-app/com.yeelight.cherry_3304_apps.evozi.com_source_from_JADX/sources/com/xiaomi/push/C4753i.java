package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;

/* renamed from: com.xiaomi.push.i */
public class C4753i {

    /* renamed from: a */
    private static String f9335a = null;

    /* renamed from: a */
    private static volatile boolean f9336a = false;

    /* renamed from: a */
    private static final String[] f9337a = {"--", "a-", "u-", "v-", "o-", "g-"};

    /* renamed from: b */
    private static String f9338b = "";

    /* renamed from: c */
    private static String f9339c;

    /* renamed from: d */
    private static String f9340d;

    /* renamed from: e */
    private static final String f9341e = String.valueOf(2);

    /* renamed from: f */
    private static String f9342f = null;

    /* renamed from: a */
    private static double m14733a(double d) {
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
    private static float m14734a(int i) {
        float f = (((float) (((((i + 102400) / 524288) + 1) * 512) * 1024)) / 1024.0f) / 1024.0f;
        double d = (double) f;
        return d > 0.5d ? (float) Math.ceil(d) : f;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static int m14735a() {
        Object a;
        if (Build.VERSION.SDK_INT >= 17 && (a = C4525ba.m13405a("android.os.UserHandle", "myUserId", new Object[0])) != null) {
            return Integer.class.cast(a).intValue();
        }
        return -1;
    }

    /* renamed from: a */
    private static int m14736a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + str.charAt(i2);
        }
        return i;
    }

    /* renamed from: a */
    private static long m14737a(File file) {
        long j;
        long j2;
        StatFs statFs = new StatFs(file.getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockCountLong();
            j = statFs.getBlockSizeLong();
        } else {
            j2 = (long) statFs.getBlockCount();
            j = (long) statFs.getBlockSize();
        }
        return j * j2;
    }

    /* renamed from: a */
    public static String m14738a() {
        int i = Build.VERSION.SDK_INT;
        if (i > 8 && i < 26) {
            return Build.SERIAL;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return (String) C4525ba.m13405a("android.os.Build", "getSerial", (Object[]) null);
        }
        return null;
    }

    /* renamed from: a */
    private static String m14739a(int i) {
        if (i > 0) {
            String[] strArr = f9337a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return f9337a[0];
    }

    /* renamed from: a */
    public static String m14740a(Context context) {
        String e = m14759e(context);
        return "a-" + C4532bf.m13440b(null + e + null);
    }

    /* renamed from: a */
    public static String m14741a(Context context, boolean z) {
        if (f9339c == null) {
            String e = m14759e(context);
            String f = !C4808l.m15366d() ? z ? m14760f(context) : m14770p(context) : "";
            String a = m14735a();
            int i = 1;
            if ((Build.VERSION.SDK_INT < 26) || !TextUtils.isEmpty(f) || !TextUtils.isEmpty(a)) {
                e = f + e + a;
            } else {
                String a2 = C4516au.m13333a(context).mo24744a();
                if (!TextUtils.isEmpty(a2)) {
                    e = a2 + e;
                    i = 2;
                } else {
                    String o = m14769o(context);
                    if (!TextUtils.isEmpty(o)) {
                        e = o;
                        i = 3;
                    } else {
                        String b = C4516au.m13333a(context).mo24745b();
                        if (!TextUtils.isEmpty(b)) {
                            i = 4;
                            e = b;
                        } else {
                            i = 5;
                        }
                    }
                }
            }
            C3989b.m10679b("devid rule select:" + i);
            if (i == 3) {
                f9339c = e;
            } else {
                f9339c = m14734a(i) + C4532bf.m13440b(e);
            }
            m14748b(context, f9339c);
        }
        return f9339c;
    }

    /* renamed from: a */
    public static void m14742a(Context context, String str) {
        C3989b.m10680c("update vdevid = " + str);
        if (!TextUtils.isEmpty(str)) {
            f9342f = str;
            C4938u uVar = null;
            try {
                if (m14753c(context)) {
                    File file = new File(Environment.getExternalStorageDirectory(), "/.vdevdir/");
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                    File file2 = new File(file, ".vdevid");
                    uVar = C4938u.m15877a(context, file2);
                    C4942y.m15883a(file2);
                    C4942y.m15887a(file2, f9342f);
                }
                C4942y.m15887a(new File(context.getFilesDir(), ".vdevid"), f9342f);
                if (uVar == null) {
                    return;
                }
            } catch (IOException e) {
                C3989b.m10669a("update vdevid failure :" + e.getMessage());
                if (uVar == null) {
                    return;
                }
            } catch (Throwable th) {
                if (uVar != null) {
                    uVar.mo26006a();
                }
                throw th;
            }
            uVar.mo26006a();
        }
    }

    /* renamed from: a */
    public static boolean m14743a(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: a */
    public static boolean m14744a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = f9337a;
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
    public static int m14745b() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4753i.m14745b():int");
    }

    /* renamed from: b */
    public static String m14746b() {
        return m14734a(m14745b()) + "GB";
    }

    /* renamed from: b */
    public static String m14747b(Context context) {
        try {
            return C4781j.m15245a(context).mo25807a();
        } catch (Exception e) {
            C3989b.m10669a("failure to get gaid:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private static void m14748b(Context context, String str) {
        C3989b.m10680c("write lvdd = " + str);
        if (!TextUtils.isEmpty(str)) {
            C4938u uVar = null;
            try {
                if (m14753c(context)) {
                    File file = new File(Environment.getExternalStorageDirectory(), "/.vdevdir/");
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                    File file2 = new File(file, ".vdevidlocal");
                    if (!file2.exists() || !file2.isFile()) {
                        uVar = C4938u.m15877a(context, file2);
                        C4942y.m15883a(file2);
                        C4942y.m15887a(file2, f9339c + f9341e + m14736a(f9339c));
                        C3989b.m10679b("lvdd write succ.");
                    } else {
                        C3989b.m10679b("vdr exists, not rewrite.");
                        return;
                    }
                } else {
                    C3989b.m10669a("not support write lvdd.");
                }
                if (uVar == null) {
                    return;
                }
            } catch (IOException e) {
                C3989b.m10669a("write lvdd failure :" + e.getMessage());
                if (uVar == null) {
                    return;
                }
            } catch (Throwable th) {
                if (uVar != null) {
                    uVar.mo26006a();
                }
                throw th;
            }
            uVar.mo26006a();
        }
    }

    /* renamed from: b */
    public static boolean m14749b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    /* renamed from: b */
    private static boolean m14750b(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 15 && str.length() >= 14 && C4532bf.m13440b(str) && !C4532bf.m13442c(str);
    }

    /* renamed from: c */
    private static int m14751c() {
        return Build.VERSION.SDK_INT < 29 ? 10 : 0;
    }

    /* renamed from: c */
    public static String m14752c() {
        double a = (double) m14737a(Environment.getDataDirectory());
        Double.isNaN(a);
        double a2 = m14733a(((a / 1024.0d) / 1024.0d) / 1024.0d);
        return a2 + "GB";
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.xiaomi.push.u, java.lang.String] */
    /* renamed from: c */
    public static String m14753c(Context context) {
        ? r1 = 0;
        if (!m14753c(context)) {
            return r1;
        }
        if (!TextUtils.isEmpty(f9342f)) {
            return f9342f;
        }
        String a = C4942y.m15883a(new File(context.getFilesDir(), ".vdevid"));
        f9342f = a;
        if (!TextUtils.isEmpty(a)) {
            return f9342f;
        }
        try {
            File file = new File(new File(Environment.getExternalStorageDirectory(), "/.vdevdir/"), ".vdevid");
            C4938u a2 = C4938u.m15877a(context, file);
            f9342f = "";
            String a3 = C4942y.m15883a(file);
            if (a3 != null) {
                f9342f = a3;
            }
            String str = f9342f;
            if (a2 != null) {
                a2.mo26006a();
            }
            return str;
        } catch (IOException e) {
            C3989b.m10669a("getVDevID failure :" + e.getMessage());
            if (r1 != 0) {
                r1.mo26006a();
            }
            return f9342f;
        } catch (Throwable th) {
            if (r1 != 0) {
                r1.mo26006a();
            }
            throw th;
        }
    }

    /* renamed from: c */
    private static boolean m14754c(Context context) {
        boolean z = false;
        if (!C4809m.m15367a(context, "android.permission.WRITE_EXTERNAL_STORAGE") || C4808l.m15356a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        }
        return !z ? C4937t.m15869a(context) : z;
    }

    /* renamed from: d */
    public static String m14755d() {
        return m14745b() + "KB";
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14756d(android.content.Context r6) {
        /*
            boolean r0 = m14753c((android.content.Context) r6)
            r1 = 0
            if (r0 == 0) goto L_0x00cb
            boolean r0 = f9336a
            if (r0 == 0) goto L_0x000d
            goto L_0x00cb
        L_0x000d:
            r0 = 1
            f9336a = r0
            java.io.File r0 = new java.io.File
            java.io.File r2 = r6.getFilesDir()
            java.lang.String r3 = ".vdevid"
            r0.<init>(r2, r3)
            java.lang.String r0 = com.xiaomi.push.C4942y.m15883a((java.io.File) r0)
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0042, all -> 0x003f }
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x0042, all -> 0x003f }
            java.lang.String r5 = "/.vdevdir/"
            r2.<init>(r4, r5)     // Catch:{ IOException -> 0x0042, all -> 0x003f }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0042, all -> 0x003f }
            r4.<init>(r2, r3)     // Catch:{ IOException -> 0x0042, all -> 0x003f }
            com.xiaomi.push.u r2 = com.xiaomi.push.C4938u.m15877a(r6, r4)     // Catch:{ IOException -> 0x0042, all -> 0x003f }
            java.lang.String r3 = com.xiaomi.push.C4942y.m15883a((java.io.File) r4)     // Catch:{ IOException -> 0x003d }
            if (r2 == 0) goto L_0x0062
            r2.mo26006a()
            goto L_0x0062
        L_0x003d:
            r3 = move-exception
            goto L_0x0044
        L_0x003f:
            r6 = move-exception
            goto L_0x00c5
        L_0x0042:
            r3 = move-exception
            r2 = r1
        L_0x0044:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r4.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = "check id failure :"
            r4.append(r5)     // Catch:{ all -> 0x00c3 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00c3 }
            r4.append(r3)     // Catch:{ all -> 0x00c3 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00c3 }
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r3)     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x0061
            r2.mo26006a()
        L_0x0061:
            r3 = r1
        L_0x0062:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x00bb
            f9342f = r0
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0085
            int r2 = r3.length()
            r4 = 128(0x80, float:1.794E-43)
            if (r2 <= r4) goto L_0x0079
            goto L_0x0085
        L_0x0079:
            boolean r6 = android.text.TextUtils.equals(r0, r3)
            if (r6 != 0) goto L_0x009c
            java.lang.String r6 = "vid changed, need sync"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r6)
            return r3
        L_0x0085:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "recover vid :"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r2)
            m14742a((android.content.Context) r6, (java.lang.String) r0)
        L_0x009c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "vdevid = "
            r6.append(r0)
            java.lang.String r0 = f9342f
            r6.append(r0)
            java.lang.String r0 = " "
            r6.append(r0)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10680c(r6)
            return r1
        L_0x00bb:
            java.lang.String r6 = "empty local vid"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r6)
            java.lang.String r6 = "F*"
            return r6
        L_0x00c3:
            r6 = move-exception
            r1 = r2
        L_0x00c5:
            if (r1 == 0) goto L_0x00ca
            r1.mo26006a()
        L_0x00ca:
            throw r6
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4753i.m14756d(android.content.Context):java.lang.String");
    }

    /* renamed from: d */
    private static boolean m14757d(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0;
    }

    /* renamed from: e */
    public static String m14758e() {
        long a = m14737a(Environment.getDataDirectory());
        return (a / 1024) + "KB";
    }

    /* renamed from: e */
    public static String m14759e(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            C3989b.m10678a(th);
            return null;
        }
    }

    /* renamed from: f */
    public static String m14760f(Context context) {
        int c = m14751c();
        String g = m14761g(context);
        while (g == null) {
            int i = c - 1;
            if (c <= 0) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            g = m14761g(context);
            c = i;
        }
        return g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r2 = com.xiaomi.push.C4525ba.m13403a((r2 = com.xiaomi.push.C4525ba.m13405a("miui.telephony.TelephonyManager", "getDefault", new java.lang.Object[0])), "getMiuiDeviceId", new java.lang.Object[0]);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14761g(android.content.Context r6) {
        /*
            boolean r0 = com.xiaomi.push.C4808l.m15366d()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.String r0 = f9335a
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            r0 = 0
            boolean r2 = com.xiaomi.push.C4808l.m15356a()     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = "miui.telephony.TelephonyManager"
            java.lang.String r3 = "getDefault"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = com.xiaomi.push.C4525ba.m13405a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r5)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0039
            java.lang.String r3 = "getMiuiDeviceId"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r2, (java.lang.String) r3, (java.lang.Object[]) r4)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0039
            boolean r3 = r2 instanceof java.lang.String     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x0039
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Object r2 = r3.cast(r2)     // Catch:{ all -> 0x007e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x007e }
            goto L_0x003a
        L_0x0039:
            r2 = r0
        L_0x003a:
            if (r2 != 0) goto L_0x0074
            boolean r3 = m14756d((android.content.Context) r6)     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x0074
            java.lang.String r3 = "phone"
            java.lang.Object r6 = r6.getSystemService(r3)     // Catch:{ all -> 0x007e }
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ all -> 0x007e }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007e }
            r4 = 26
            if (r3 >= r4) goto L_0x0055
            java.lang.String r2 = r6.getDeviceId()     // Catch:{ all -> 0x007e }
            goto L_0x0074
        L_0x0055:
            r3 = 1
            int r4 = r6.getPhoneType()     // Catch:{ all -> 0x007e }
            if (r3 != r4) goto L_0x0066
            java.lang.String r2 = "getImei"
            java.lang.Object r6 = com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r2, (java.lang.Object[]) r0)     // Catch:{ all -> 0x007e }
        L_0x0062:
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x007e }
            goto L_0x0074
        L_0x0066:
            r3 = 2
            int r4 = r6.getPhoneType()     // Catch:{ all -> 0x007e }
            if (r3 != r4) goto L_0x0074
            java.lang.String r2 = "getMeid"
            java.lang.Object r6 = com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r2, (java.lang.Object[]) r0)     // Catch:{ all -> 0x007e }
            goto L_0x0062
        L_0x0074:
            boolean r6 = m14750b((java.lang.String) r2)     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x007d
            f9335a = r2     // Catch:{ all -> 0x007e }
            return r2
        L_0x007d:
            return r1
        L_0x007e:
            r6 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4753i.m14761g(android.content.Context):java.lang.String");
    }

    /* renamed from: h */
    public static String m14762h(Context context) {
        int c = m14751c();
        String j = m14764j(context);
        while (j == null) {
            int i = c - 1;
            if (c <= 0) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            j = m14764j(context);
            c = i;
        }
        return j;
    }

    /* renamed from: i */
    public static String m14763i(Context context) {
        Object a;
        if (C4808l.m15366d() || Build.VERSION.SDK_INT < 22) {
            return "";
        }
        if (!TextUtils.isEmpty(f9338b)) {
            return f9338b;
        }
        if (!m14756d(context)) {
            return "";
        }
        m14761g(context);
        if (TextUtils.isEmpty(f9335a)) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            Integer num = (Integer) C4525ba.m13403a((Object) telephonyManager, "getPhoneCount", new Object[0]);
            if (num == null || num.intValue() <= 1) {
                return "";
            }
            String str = null;
            for (int i = 0; i < num.intValue(); i++) {
                if (Build.VERSION.SDK_INT < 26) {
                    a = C4525ba.m13403a((Object) telephonyManager, "getDeviceId", Integer.valueOf(i));
                } else if (1 == telephonyManager.getPhoneType()) {
                    a = C4525ba.m13403a((Object) telephonyManager, "getImei", Integer.valueOf(i));
                } else {
                    if (2 == telephonyManager.getPhoneType()) {
                        a = C4525ba.m13403a((Object) telephonyManager, "getMeid", Integer.valueOf(i));
                    }
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(f9335a, str) && m14750b(str)) {
                        f9338b += str + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                }
                str = (String) a;
                f9338b += str + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
            int length = f9338b.length();
            if (length > 0) {
                f9338b = f9338b.substring(0, length - 1);
            }
            return f9338b;
        } catch (Exception e) {
            C3989b.m10681d(e.toString());
            return "";
        }
    }

    /* renamed from: j */
    public static String m14764j(Context context) {
        m14763i(context);
        String str = "";
        if (TextUtils.isEmpty(f9338b)) {
            return str;
        }
        for (String str2 : f9338b.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (m14750b(str2)) {
                str = str + C4532bf.m13431a(str2) + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
        }
        int length = str.length();
        return length > 0 ? str.substring(0, length - 1) : str;
    }

    /* renamed from: k */
    public static synchronized String m14765k(Context context) {
        synchronized (C4753i.class) {
            if (f9340d != null) {
                String str = f9340d;
                return str;
            }
            String e = m14759e(context);
            String a = m14735a();
            String b = C4532bf.m13440b(e + a);
            f9340d = b;
            return b;
        }
    }

    /* renamed from: l */
    public static synchronized String m14766l(Context context) {
        String b;
        synchronized (C4753i.class) {
            String e = m14759e(context);
            b = C4532bf.m13440b(e + null);
        }
        return b;
    }

    /* renamed from: m */
    public static String m14767m(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    /* renamed from: n */
    public static String m14768n(Context context) {
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.xiaomi.push.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.xiaomi.push.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.xiaomi.push.u} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        r5 = r1;
        r1 = r6;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        if (r1 == 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        r1.mo26006a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        if (r1 != 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        return r6;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ IOException -> 0x0069, all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m14769o(android.content.Context r6) {
        /*
            boolean r0 = m14753c((android.content.Context) r6)
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r6 = "not support read lvdd."
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r6)
            return r1
        L_0x000d:
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x007c }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x007c }
            java.lang.String r3 = "/.vdevdir/"
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x007c }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x007c }
            java.lang.String r3 = ".vdevidlocal"
            r2.<init>(r0, r3)     // Catch:{ IOException -> 0x007c }
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x007c }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r2.isFile()     // Catch:{ IOException -> 0x007c }
            if (r0 == 0) goto L_0x006e
            com.xiaomi.push.u r6 = com.xiaomi.push.C4938u.m15877a(r6, r2)     // Catch:{ IOException -> 0x007c }
            java.lang.String r0 = com.xiaomi.push.C4942y.m15883a((java.io.File) r2)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = f9341e     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            int r3 = r0.length     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            r4 = 2
            if (r3 != r4) goto L_0x0054
            r3 = 0
            r3 = r0[r3]     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            r4 = 1
            r0 = r0[r4]     // Catch:{ Exception -> 0x0054, all -> 0x0066 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0054, all -> 0x0066 }
            int r4 = m14736a((java.lang.String) r3)     // Catch:{ Exception -> 0x0054, all -> 0x0066 }
            if (r4 != r0) goto L_0x0054
            r1 = r3
        L_0x0054:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            if (r0 == 0) goto L_0x0062
            com.xiaomi.push.C4942y.m15883a((java.io.File) r2)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.lang.String r0 = "lvdd content invalid, remove it."
            com.xiaomi.channel.commonutils.logger.C3989b.m10679b(r0)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
        L_0x0062:
            r5 = r1
            r1 = r6
            r6 = r5
            goto L_0x0074
        L_0x0066:
            r0 = move-exception
            r1 = r6
            goto L_0x009a
        L_0x0069:
            r0 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L_0x007e
        L_0x006e:
            java.lang.String r6 = "lvdf not exists"
            com.xiaomi.channel.commonutils.logger.C3989b.m10679b(r6)     // Catch:{ IOException -> 0x007c }
            r6 = r1
        L_0x0074:
            if (r1 == 0) goto L_0x0099
        L_0x0076:
            r1.mo26006a()
            goto L_0x0099
        L_0x007a:
            r0 = move-exception
            goto L_0x009a
        L_0x007c:
            r0 = move-exception
            r6 = r1
        L_0x007e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r2.<init>()     // Catch:{ all -> 0x007a }
            java.lang.String r3 = "get lvdd failure :"
            r2.append(r3)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x007a }
            r2.append(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x007a }
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x0099
            goto L_0x0076
        L_0x0099:
            return r6
        L_0x009a:
            if (r1 == 0) goto L_0x009f
            r1.mo26006a()
        L_0x009f:
            goto L_0x00a1
        L_0x00a0:
            throw r0
        L_0x00a1:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4753i.m14769o(android.content.Context):java.lang.String");
    }

    /* renamed from: p */
    private static String m14770p(Context context) {
        int c = m14751c();
        String g = m14761g(context);
        while (TextUtils.isEmpty(g)) {
            int i = c - 1;
            if (c <= 0) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            g = m14761g(context);
            c = i;
        }
        return g;
    }
}
