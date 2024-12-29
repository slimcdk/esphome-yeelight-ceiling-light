package com.google.firebase.crashlytics.internal.common;

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
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p118y0.C3916f;

public class CommonUtils {

    /* renamed from: a */
    private static final char[] f3511a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static long f3512b = -1;

    enum Architecture {
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
        
        private static final Map<String, Architecture> matcher = null;

        static {
            Architecture architecture;
            Architecture architecture2;
            Architecture architecture3;
            Architecture architecture4;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C3916f.m11190f().mo26405i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = matcher.get(str.toLowerCase(Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }
    }

    /* renamed from: A */
    public static boolean m5529A(@Nullable String str, @Nullable String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: B */
    public static String m5530B(String str) {
        return m5551t(str, "SHA-1");
    }

    /* renamed from: C */
    public static String m5531C(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: a */
    public static long m5532a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m5533b(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static boolean m5534c(Context context) {
        if (!m5535d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: d */
    public static boolean m5535d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: e */
    public static void m5536e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C3916f.m11190f().mo26402e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m5537f(Closeable closeable) {
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
    static long m5538g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: h */
    public static String m5539h(String... strArr) {
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
            return m5530B(sb2);
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
    public static java.lang.String m5540i(java.io.File r6, java.lang.String r7) {
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
            m5536e(r1, r0)
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
            y0.f r3 = p118y0.C3916f.m11190f()     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0059 }
            r3.mo26402e(r6, r7)     // Catch:{ all -> 0x0059 }
            goto L_0x0036
        L_0x0059:
            r6 = move-exception
            r2 = r1
        L_0x005b:
            m5536e(r2, r0)
            throw r6
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.m5540i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m5541j(String str, Context context) {
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

    /* renamed from: k */
    public static boolean m5542k(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int q = m5548q(context, str, "bool");
            if (q > 0) {
                return resources.getBoolean(q);
            }
            int q2 = m5548q(context, str, TypedValues.Custom.S_STRING);
            if (q2 > 0) {
                return Boolean.parseBoolean(context.getString(q2));
            }
        }
        return z;
    }

    /* renamed from: l */
    public static int m5543l() {
        return Architecture.getValue().ordinal();
    }

    /* renamed from: m */
    public static int m5544m(Context context) {
        boolean y = m5556y(context);
        if (m5557z(context)) {
            y |= true;
        }
        return m5555x() ? y | true ? 1 : 0 : y ? 1 : 0;
    }

    /* renamed from: n */
    public static String m5545n(Context context) {
        int q = m5548q(context, "com.google.firebase.crashlytics.mapping_file_id", TypedValues.Custom.S_STRING);
        if (q == 0) {
            q = m5548q(context, "com.crashlytics.android.build_id", TypedValues.Custom.S_STRING);
        }
        if (q != 0) {
            return context.getResources().getString(q);
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m5546o(Context context) {
        return !m5556y(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    /* renamed from: p */
    public static String m5547p(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    /* renamed from: q */
    public static int m5548q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m5547p(context));
    }

    /* renamed from: r */
    public static SharedPreferences m5549r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: s */
    public static synchronized long m5550s() {
        long j;
        synchronized (CommonUtils.class) {
            if (f3512b == -1) {
                long j2 = 0;
                String i = m5540i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(i)) {
                    String upperCase = i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m5538g(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m5538g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m5538g(upperCase, "GB", BasicMeasure.EXACTLY);
                        } else {
                            C3916f f = C3916f.m11190f();
                            f.mo26407k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        C3916f f2 = C3916f.m11190f();
                        f2.mo26402e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f3512b = j2;
            }
            j = f3512b;
        }
        return j;
    }

    /* renamed from: t */
    private static String m5551t(String str, String str2) {
        return m5552u(str.getBytes(), str2);
    }

    /* renamed from: u */
    private static String m5552u(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m5553v(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C3916f f = C3916f.m11190f();
            f.mo26402e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: v */
    public static String m5553v(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f3511a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & ParameterInitDefType.CubemapSamplerInit];
        }
        return new String(cArr);
    }

    /* renamed from: w */
    public static boolean m5554w(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: x */
    public static boolean m5555x() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: y */
    public static boolean m5556y(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            return str.contains("goldfish") || str.contains("ranchu") || string == null;
        }
    }

    /* renamed from: z */
    public static boolean m5557z(Context context) {
        boolean y = m5556y(context);
        String str = Build.TAGS;
        if ((!y && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !y && new File("/system/xbin/su").exists();
    }
}
