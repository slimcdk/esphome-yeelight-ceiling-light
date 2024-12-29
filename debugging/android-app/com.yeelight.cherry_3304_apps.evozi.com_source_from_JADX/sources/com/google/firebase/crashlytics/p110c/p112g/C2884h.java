package com.google.firebase.crashlytics.p110c.p112g;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* renamed from: com.google.firebase.crashlytics.c.g.h */
public class C2884h {

    /* renamed from: a */
    private static final char[] f5557a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static long f5558b = -1;

    /* renamed from: c */
    public static final Comparator<File> f5559c = new C2885a();

    /* renamed from: com.google.firebase.crashlytics.c.g.h$a */
    class C2885a implements Comparator<File> {
        C2885a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.g.h$b */
    enum C2886b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: k */
        private static final Map<String, C2886b> f5570k = null;

        static {
            HashMap hashMap = new HashMap(4);
            f5570k = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            f5570k.put("armeabi", ARMV6);
            f5570k.put("arm64-v8a", ARM64);
            f5570k.put("x86", X86_32);
        }

        /* renamed from: a */
        static C2886b m8831a() {
            C2886b bVar = UNKNOWN;
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C2857b.m8687f().mo17130b("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return bVar;
            }
            C2886b bVar2 = f5570k.get(str.toLowerCase(Locale.US));
            return bVar2 == null ? bVar : bVar2;
        }
    }

    /* renamed from: A */
    public static boolean m8794A(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: B */
    public static boolean m8795B() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: C */
    public static boolean m8796C(Context context) {
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    /* renamed from: D */
    public static boolean m8797D(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: E */
    public static boolean m8798E(Context context) {
        boolean C = m8796C(context);
        String str = Build.TAGS;
        if ((!C && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !C && new File("/system/xbin/su").exists();
    }

    /* renamed from: F */
    public static String m8799F(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /* renamed from: G */
    public static String m8800G(Context context) {
        int s = m8822s(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (s == 0) {
            return null;
        }
        String string = context.getResources().getString(s);
        C2857b f = C2857b.m8687f();
        f.mo17130b("Unity Editor version is: " + string);
        return string;
    }

    /* renamed from: H */
    public static String m8801H(InputStream inputStream) {
        return m8826w(inputStream, "SHA-1");
    }

    /* renamed from: I */
    public static String m8802I(String str) {
        return m8827x(str, "SHA-1");
    }

    /* renamed from: J */
    public static String m8803J(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: a */
    public static long m8804a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m8805b(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static boolean m8806c(Context context) {
        if (!m8807d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: d */
    public static boolean m8807d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: e */
    public static void m8808e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C2857b.m8687f().mo17133e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m8809f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    static long m8810g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: h */
    public static String m8811h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m8802I(sb2);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8812i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r6
        L_0x0036:
            m8808e(r1, r0)
            goto L_0x005f
        L_0x003a:
            r7 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x005b
        L_0x003e:
            r7 = move-exception
            r1 = r2
        L_0x0040:
            com.google.firebase.crashlytics.c.b r3 = com.google.firebase.crashlytics.p110c.C2857b.m8687f()     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0059 }
            r3.mo17133e(r6, r7)     // Catch:{ all -> 0x0059 }
            goto L_0x0036
        L_0x0059:
            r6 = move-exception
            r2 = r1
        L_0x005b:
            m8808e(r2, r0)
            throw r6
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p110c.p112g.C2884h.m8812i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static void m8813j(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                C2857b.m8687f().mo17133e(str, e);
            }
        }
    }

    /* renamed from: k */
    public static ActivityManager.RunningAppProcessInfo m8814k(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: l */
    public static boolean m8815l(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int s = m8822s(context, str, "bool");
            if (s > 0) {
                return resources.getBoolean(s);
            }
            int s2 = m8822s(context, str, "string");
            if (s2 > 0) {
                return Boolean.parseBoolean(context.getString(s2));
            }
        }
        return z;
    }

    /* renamed from: m */
    public static int m8816m() {
        return C2886b.m8831a().ordinal();
    }

    /* renamed from: n */
    public static int m8817n(Context context) {
        int i = m8796C(context) ? 1 : 0;
        if (m8798E(context)) {
            i |= 2;
        }
        return m8795B() ? i | 4 : i;
    }

    /* renamed from: o */
    public static SharedPreferences m8818o(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* renamed from: p */
    public static String m8819p(Context context) {
        int s = m8822s(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (s == 0) {
            s = m8822s(context, "com.crashlytics.android.build_id", "string");
        }
        if (s != 0) {
            return context.getResources().getString(s);
        }
        return null;
    }

    /* renamed from: q */
    public static boolean m8820q(Context context) {
        return !m8796C(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    /* renamed from: r */
    public static String m8821r(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                return context.getResources().getResourcePackageName(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    /* renamed from: s */
    public static int m8822s(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m8821r(context));
    }

    /* renamed from: t */
    public static SharedPreferences m8823t(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: u */
    public static String m8824u(Context context, String str) {
        int s = m8822s(context, str, "string");
        return s > 0 ? context.getString(s) : "";
    }

    /* renamed from: v */
    public static synchronized long m8825v() {
        long j;
        synchronized (C2884h.class) {
            if (f5558b == -1) {
                long j2 = 0;
                String i = m8812i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(i)) {
                    String upperCase = i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m8810g(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m8810g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m8810g(upperCase, "GB", 1073741824);
                        } else {
                            C2857b f = C2857b.m8687f();
                            f.mo17130b("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        C2857b f2 = C2857b.m8687f();
                        f2.mo17133e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f5558b = j2;
            }
            j = f5558b;
        }
        return j;
    }

    /* renamed from: w */
    private static String m8826w(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m8829z(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            C2857b.m8687f().mo17133e("Could not calculate hash for app icon.", e);
            return "";
        }
    }

    /* renamed from: x */
    private static String m8827x(String str, String str2) {
        return m8828y(str.getBytes(), str2);
    }

    /* renamed from: y */
    private static String m8828y(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m8829z(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C2857b f = C2857b.m8687f();
            f.mo17133e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: z */
    public static String m8829z(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f5557a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & ParameterInitDefType.CubemapSamplerInit];
        }
        return new String(cArr);
    }
}
