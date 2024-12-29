package com.xiaomi.mistatistic.sdk.controller;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.xiaomi.mistatistic.sdk.BuildSetting;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.NetworkInterface;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.List;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.q */
public class C4162q {
    /* renamed from: a */
    public static String m11287a() {
        if (Build.VERSION.SDK_INT > 8) {
            return Build.SERIAL;
        }
        return null;
    }

    /* renamed from: a */
    public static String m11288a(Context context, String str) {
        try {
            if ((m11300d(context) && BuildSetting.isInternationalBuild()) || m11299c()) {
                if (!str.toLowerCase().startsWith("http")) {
                    str = "https://" + str;
                }
                String host = new URL(str).getHost();
                String str2 = "";
                if (host.contains(".")) {
                    String[] split = host.split("\\.");
                    if (split != null && split.length > 0) {
                        for (int i = 0; i < split.length; i++) {
                            if (i == split.length - 2) {
                                str2 = str2 + "intl.";
                            }
                            str2 = str2 + split[i];
                            if (i < split.length - 1) {
                                str2 = str2 + ".";
                            }
                        }
                    }
                } else {
                    str2 = "intl." + host;
                }
                return str.replace(host, str2);
            }
        } catch (Exception e) {
            C4130h.m11174a("U", "ensureInternationalServer exception", (Throwable) e);
        }
        return str;
    }

    /* renamed from: a */
    public static void m11289a(boolean z) {
        SharedPreferences.Editor edit = C4113c.m11105a().getSharedPreferences("enable_global", 0).edit();
        edit.putBoolean("enable_global", z);
        edit.apply();
    }

    /* renamed from: a */
    public static boolean m11290a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis();
        return timeInMillis <= j && j < MiStatInterface.MAX_UPLOAD_INTERVAL + timeInMillis;
    }

    /* renamed from: a */
    public static boolean m11291a(long j, long j2) {
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* renamed from: a */
    public static boolean m11292a(Context context) {
        boolean z;
        boolean z2 = false;
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                if (!runningAppProcesses.isEmpty()) {
                    z = false;
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        try {
                            if (next.importance == 100 || next.importance == 125) {
                                for (String str : next.pkgList) {
                                    if (str.equals(context.getPackageName())) {
                                        C4130h.m11178b("U", String.format(" %s importance %d", new Object[]{str, Integer.valueOf(next.importance)}));
                                        z = true;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            z2 = z;
                            C4130h.m11176a("isForegroundRunning exception ", th);
                            return z2;
                        }
                    }
                    C4130h.m11180b("U", "%s foreground running %s", context.getPackageName(), Boolean.valueOf(z));
                    return z;
                }
            }
            z = false;
            C4130h.m11180b("U", "%s foreground running %s", context.getPackageName(), Boolean.valueOf(z));
            return z;
        } catch (Throwable th2) {
            th = th2;
            C4130h.m11176a("isForegroundRunning exception ", th);
            return z2;
        }
    }

    /* renamed from: a */
    public static byte[] m11293a(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    /* renamed from: b */
    private static String m11294b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                byte[] hardwareAddress = nextElement.getHardwareAddress();
                if (hardwareAddress != null) {
                    if (hardwareAddress.length != 0) {
                        StringBuilder sb = new StringBuilder();
                        int length = hardwareAddress.length;
                        for (int i = 0; i < length; i++) {
                            sb.append(String.format("%02x:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        String sb2 = sb.toString();
                        if ("wlan0".equals(nextElement.getName())) {
                            return sb2;
                        }
                    }
                }
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public static String m11295b(Context context) {
        String b = Build.VERSION.SDK_INT >= 23 ? m11294b() : "";
        if (TextUtils.isEmpty(b)) {
            try {
                b = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            } catch (Exception e) {
                C4130h.m11174a("U", "getMacMd5 exception: ", (Throwable) e);
            }
        }
        return !TextUtils.isEmpty(b) ? m11296b(b) : b;
    }

    /* renamed from: b */
    public static String m11296b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(m11293a(str));
            return String.format("%1$032X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    /* renamed from: c */
    public static String m11297c(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            C4130h.m11174a("U", "getAndroidId exception: ", th);
            return null;
        }
    }

    /* renamed from: c */
    public static String m11298c(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(m11293a(str));
            return String.format("%1$032X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    /* renamed from: c */
    private static boolean m11299c() {
        return C4113c.m11105a().getSharedPreferences("enable_global", 0).getBoolean("enable_global", false);
    }

    /* renamed from: d */
    public static boolean m11300d(Context context) {
        if (C4137k.m11213b(context, "is_miui")) {
            return C4137k.m11208a(context, "is_miui");
        }
        boolean z = false;
        try {
            context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0);
            z = true;
        } catch (Exception e) {
            C4130h.m11179b("U", "cannot get pkginfo com.xiaomi.xmsf, not miui.", (Throwable) e);
        }
        C4137k.m11206a(context, "is_miui", z);
        return z;
    }

    /* renamed from: e */
    public static boolean m11301e(Context context) {
        if (C4137k.m11213b(context, "is_xiaomi")) {
            return C4137k.m11208a(context, "is_xiaomi");
        }
        String packageName = context.getPackageName();
        if (packageName.contains("miui") || packageName.contains("xiaomi")) {
            C4137k.m11206a(context, "is_xiaomi", true);
            return true;
        } else if (!m11300d(context)) {
            C4137k.m11206a(context, "is_xiaomi", false);
            return false;
        } else {
            boolean z = (context.getApplicationInfo().flags & 1) != 0;
            C4130h.m11180b("U", "the pkg %s is sys app %s", packageName, Boolean.valueOf(z));
            C4137k.m11206a(context, "is_xiaomi", z);
            return z;
        }
    }

    /* renamed from: f */
    public static String m11302f(Context context) {
        if (!m11300d(context)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("miui.telephony.TelephonyManager");
            Method declaredMethod = cls.getDeclaredMethod("getDefault", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            if (invoke == null) {
                return null;
            }
            Method declaredMethod2 = cls.getDeclaredMethod("getMiuiDeviceId", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(invoke, new Object[0]);
            if (invoke2 == null || !(invoke2 instanceof String)) {
                return null;
            }
            return String.class.cast(invoke2);
        } catch (Exception e) {
            C4130h.m11176a("getMiuiImei exception: ", (Throwable) e);
            return null;
        }
    }
}
