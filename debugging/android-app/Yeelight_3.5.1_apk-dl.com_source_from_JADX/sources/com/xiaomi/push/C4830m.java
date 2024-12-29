package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.xiaomi.push.m */
public class C4830m {

    /* renamed from: a */
    private static volatile int f9321a = 0;

    /* renamed from: a */
    private static Map<String, C4835q> f9322a = null;

    /* renamed from: b */
    private static int f9323b = -1;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024 A[Catch:{ all -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ all -> 0x0029 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14997a() {
        /*
            int r0 = f9321a
            if (r0 != 0) goto L_0x0047
            r0 = 0
            java.lang.String r1 = "ro.miui.ui.version.code"
            java.lang.String r1 = m14999a((java.lang.String) r1)     // Catch:{ all -> 0x0029 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0029 }
            r2 = 1
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = m14999a((java.lang.String) r1)     // Catch:{ all -> 0x0029 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 0
            goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 2
        L_0x0026:
            f9321a = r2     // Catch:{ all -> 0x0029 }
            goto L_0x0031
        L_0x0029:
            r1 = move-exception
            java.lang.String r2 = "get isMIUI failed"
            com.xiaomi.channel.commonutils.logger.C4408b.m12477a((java.lang.String) r2, (java.lang.Throwable) r1)
            f9321a = r0
        L_0x0031:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isMIUI's value is: "
            r0.append(r1)
            int r1 = f9321a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12481b(r0)
        L_0x0047:
            int r0 = f9321a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4830m.m14997a():int");
    }

    /* renamed from: a */
    public static int m14998a(Context context) {
        String a = m14999a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(a) || !TextUtils.isDigitsOnly(a)) {
            return 0;
        }
        return Integer.parseInt(a);
    }

    /* renamed from: a */
    public static C4835q m14999a(String str) {
        C4835q b = m15009b(str);
        return b == null ? C4835q.Global : b;
    }

    /* renamed from: a */
    public static String m15000a() {
        int a = C4994v.m15733a();
        return (!m14997a() || a <= 0) ? "" : a < 2 ? "alpha" : a < 3 ? "development" : "stable";
    }

    /* renamed from: a */
    public static String m15001a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + m15002a(intent.getExtras());
    }

    /* renamed from: a */
    public static String m15002a(Bundle bundle) {
        String a;
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append("null");
        } else {
            boolean z = true;
            for (String str : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    a = Arrays.toString((int[]) obj);
                } else if (obj instanceof byte[]) {
                    a = Arrays.toString((byte[]) obj);
                } else if (obj instanceof boolean[]) {
                    a = Arrays.toString((boolean[]) obj);
                } else if (obj instanceof short[]) {
                    a = Arrays.toString((short[]) obj);
                } else if (obj instanceof long[]) {
                    a = Arrays.toString((long[]) obj);
                } else if (obj instanceof float[]) {
                    a = Arrays.toString((float[]) obj);
                } else if (obj instanceof double[]) {
                    a = Arrays.toString((double[]) obj);
                } else if (obj instanceof String[]) {
                    a = Arrays.toString((String[]) obj);
                } else if (obj instanceof CharSequence[]) {
                    a = Arrays.toString((CharSequence[]) obj);
                } else if (obj instanceof Parcelable[]) {
                    a = Arrays.toString((Parcelable[]) obj);
                } else if (obj instanceof Bundle) {
                    a = m15002a((Bundle) obj);
                } else {
                    sb.append(obj);
                    z = false;
                }
                sb.append(a);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m15003a(String str) {
        try {
            return (String) C4554bk.m13014a("android.os.SystemProperties", "get", str, "");
        } catch (Exception e) {
            C4408b.m12483d("fail to get property. " + e);
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static void m15004a() {
        if (f9322a == null) {
            HashMap hashMap = new HashMap();
            f9322a = hashMap;
            hashMap.put("CN", C4835q.China);
            Map<String, C4835q> map = f9322a;
            C4835q qVar = C4835q.Europe;
            map.put("FI", qVar);
            f9322a.put("SE", qVar);
            f9322a.put("NO", qVar);
            f9322a.put("FO", qVar);
            f9322a.put("EE", qVar);
            f9322a.put("LV", qVar);
            f9322a.put("LT", qVar);
            f9322a.put("BY", qVar);
            f9322a.put("MD", qVar);
            f9322a.put("UA", qVar);
            f9322a.put("PL", qVar);
            f9322a.put("CZ", qVar);
            f9322a.put("SK", qVar);
            f9322a.put("HU", qVar);
            f9322a.put("DE", qVar);
            f9322a.put("AT", qVar);
            f9322a.put("CH", qVar);
            f9322a.put("LI", qVar);
            f9322a.put("GB", qVar);
            f9322a.put("IE", qVar);
            f9322a.put("NL", qVar);
            f9322a.put("BE", qVar);
            f9322a.put("LU", qVar);
            f9322a.put("FR", qVar);
            f9322a.put("RO", qVar);
            f9322a.put("BG", qVar);
            f9322a.put("RS", qVar);
            f9322a.put("MK", qVar);
            f9322a.put("AL", qVar);
            f9322a.put("GR", qVar);
            f9322a.put("SI", qVar);
            f9322a.put("HR", qVar);
            f9322a.put("IT", qVar);
            f9322a.put("SM", qVar);
            f9322a.put("MT", qVar);
            f9322a.put("ES", qVar);
            f9322a.put("PT", qVar);
            f9322a.put("AD", qVar);
            f9322a.put("CY", qVar);
            f9322a.put("DK", qVar);
            f9322a.put("IS", qVar);
            f9322a.put("UK", qVar);
            f9322a.put("EL", qVar);
            f9322a.put("RU", C4835q.Russia);
            f9322a.put("IN", C4835q.India);
        }
    }

    /* renamed from: a */
    public static boolean m15005a() {
        return m14997a() == 1;
    }

    /* renamed from: a */
    public static boolean m15006a(Context context) {
        return context != null && m14999a(context.getPackageName());
    }

    /* renamed from: a */
    public static boolean m15007a(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    /* renamed from: b */
    public static int m15008b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static C4835q m15009b(String str) {
        m14997a();
        return f9322a.get(str.toUpperCase());
    }

    /* renamed from: b */
    public static String m15010b() {
        String a = C4993u.m15732a("ro.miui.region", "");
        if (TextUtils.isEmpty(a)) {
            a = C4993u.m15732a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4993u.m15732a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4993u.m15732a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4993u.m15732a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4993u.m15732a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = m15009b(C4993u.m15732a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(a)) {
            a = C4993u.m15732a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4993u.m15732a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4993u.m15732a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4993u.m15732a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(a)) {
            C4408b.m12464a("get region from system, region = " + a);
        }
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String country = Locale.getDefault().getCountry();
        C4408b.m12464a("locale.default.country = " + country);
        return country;
    }

    /* renamed from: b */
    private static String m15011b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return split.length > 0 ? split[0] : str;
    }

    /* renamed from: b */
    public static boolean m15012b() {
        return m14997a() == 2;
    }

    /* renamed from: c */
    public static String m15013c() {
        return m14999a("ro.miui.ui.version.name");
    }

    /* renamed from: c */
    public static boolean m15014c() {
        if (f9323b < 0) {
            f9323b = m15017e() ^ true ? 1 : 0;
        }
        return f9323b > 0;
    }

    /* renamed from: d */
    public static String m15015d() {
        return m14999a("ro.build.characteristics");
    }

    /* renamed from: d */
    public static boolean m15016d() {
        return !C4835q.China.name().equalsIgnoreCase(m14999a(m15010b()).name());
    }

    /* renamed from: e */
    public static String m15017e() {
        return m14999a("ro.product.manufacturer");
    }

    /* renamed from: e */
    public static boolean m15018e() {
        String str = "";
        try {
            str = C4993u.m15732a("ro.miui.ui.version.code", str);
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(str);
    }
}
