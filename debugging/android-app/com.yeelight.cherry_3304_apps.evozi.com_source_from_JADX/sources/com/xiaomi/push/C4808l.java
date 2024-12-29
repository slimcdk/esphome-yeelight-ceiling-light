package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.xiaomi.push.l */
public class C4808l {

    /* renamed from: a */
    private static int f9847a = 0;

    /* renamed from: a */
    private static Map<String, C4811o> f9848a = null;

    /* renamed from: b */
    private static int f9849b = -1;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028 A[Catch:{ all -> 0x002c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int m15356a() {
        /*
            java.lang.Class<com.xiaomi.push.l> r0 = com.xiaomi.push.C4808l.class
            monitor-enter(r0)
            int r1 = f9847a     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x004a
            r1 = 0
            java.lang.String r2 = "ro.miui.ui.version.code"
            java.lang.String r2 = m15357a((java.lang.String) r2)     // Catch:{ all -> 0x002c }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x002c }
            r3 = 1
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = "ro.miui.ui.version.name"
            java.lang.String r2 = m15357a((java.lang.String) r2)     // Catch:{ all -> 0x002c }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            if (r2 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r3 = 2
        L_0x0029:
            f9847a = r3     // Catch:{ all -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r2 = move-exception
            java.lang.String r3 = "get isMIUI failed"
            com.xiaomi.channel.commonutils.logger.C3989b.m10677a((java.lang.String) r3, (java.lang.Throwable) r2)     // Catch:{ all -> 0x004e }
            f9847a = r1     // Catch:{ all -> 0x004e }
        L_0x0034:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r1.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "isMIUI's value is: "
            r1.append(r2)     // Catch:{ all -> 0x004e }
            int r2 = f9847a     // Catch:{ all -> 0x004e }
            r1.append(r2)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004e }
            com.xiaomi.channel.commonutils.logger.C3989b.m10679b(r1)     // Catch:{ all -> 0x004e }
        L_0x004a:
            int r1 = f9847a     // Catch:{ all -> 0x004e }
            monitor-exit(r0)
            return r1
        L_0x004e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4808l.m15356a():int");
    }

    /* renamed from: a */
    public static C4811o m15357a(String str) {
        C4811o b = m15362b(str);
        return b == null ? C4811o.Global : b;
    }

    /* renamed from: a */
    public static synchronized String m15358a() {
        synchronized (C4808l.class) {
            int a = C4937t.m15865a();
            return (!m15356a() || a <= 0) ? "" : a < 2 ? "alpha" : a < 3 ? "development" : "stable";
        }
    }

    /* renamed from: a */
    public static String m15359a(String str) {
        try {
            return (String) C4525ba.m13405a("android.os.SystemProperties", "get", str, "");
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static void m15360a() {
        if (f9848a == null) {
            HashMap hashMap = new HashMap();
            f9848a = hashMap;
            hashMap.put("CN", C4811o.China);
            f9848a.put("FI", C4811o.Europe);
            f9848a.put("SE", C4811o.Europe);
            f9848a.put("NO", C4811o.Europe);
            f9848a.put("FO", C4811o.Europe);
            f9848a.put("EE", C4811o.Europe);
            f9848a.put("LV", C4811o.Europe);
            f9848a.put("LT", C4811o.Europe);
            f9848a.put("BY", C4811o.Europe);
            f9848a.put("MD", C4811o.Europe);
            f9848a.put("UA", C4811o.Europe);
            f9848a.put("PL", C4811o.Europe);
            f9848a.put("CZ", C4811o.Europe);
            f9848a.put("SK", C4811o.Europe);
            f9848a.put("HU", C4811o.Europe);
            f9848a.put("DE", C4811o.Europe);
            f9848a.put("AT", C4811o.Europe);
            f9848a.put("CH", C4811o.Europe);
            f9848a.put("LI", C4811o.Europe);
            f9848a.put("GB", C4811o.Europe);
            f9848a.put("IE", C4811o.Europe);
            f9848a.put("NL", C4811o.Europe);
            f9848a.put("BE", C4811o.Europe);
            f9848a.put("LU", C4811o.Europe);
            f9848a.put("FR", C4811o.Europe);
            f9848a.put("RO", C4811o.Europe);
            f9848a.put("BG", C4811o.Europe);
            f9848a.put("RS", C4811o.Europe);
            f9848a.put("MK", C4811o.Europe);
            f9848a.put("AL", C4811o.Europe);
            f9848a.put("GR", C4811o.Europe);
            f9848a.put("SI", C4811o.Europe);
            f9848a.put("HR", C4811o.Europe);
            f9848a.put("IT", C4811o.Europe);
            f9848a.put("SM", C4811o.Europe);
            f9848a.put("MT", C4811o.Europe);
            f9848a.put("ES", C4811o.Europe);
            f9848a.put("PT", C4811o.Europe);
            f9848a.put("AD", C4811o.Europe);
            f9848a.put("CY", C4811o.Europe);
            f9848a.put("DK", C4811o.Europe);
            f9848a.put("RU", C4811o.Russia);
            f9848a.put("IN", C4811o.India);
        }
    }

    /* renamed from: a */
    public static synchronized boolean m15361a() {
        boolean z;
        synchronized (C4808l.class) {
            z = true;
            if (m15356a() != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private static C4811o m15362b(String str) {
        m15356a();
        return f9848a.get(str.toUpperCase());
    }

    /* renamed from: b */
    public static String m15363b() {
        String a = C4816s.m15380a("ro.miui.region", "");
        if (TextUtils.isEmpty(a)) {
            a = C4816s.m15380a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4816s.m15380a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4816s.m15380a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4816s.m15380a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4816s.m15380a("ro.product.country.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4816s.m15380a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4816s.m15380a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4816s.m15380a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a)) {
            a = C4816s.m15380a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(a)) {
            C3989b.m10669a("get region from system, region = " + a);
        }
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String country = Locale.getDefault().getCountry();
        C3989b.m10669a("locale.default.country = " + country);
        return country;
    }

    /* renamed from: b */
    public static synchronized boolean m15364b() {
        boolean z;
        synchronized (C4808l.class) {
            z = m15356a() == 2;
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m15365c() {
        if (f9849b < 0) {
            Object a = C4525ba.m13405a("miui.external.SdkHelper", "isMiuiSystem", new Object[0]);
            f9849b = 0;
            if (a != null && (a instanceof Boolean) && !Boolean.class.cast(a).booleanValue()) {
                f9849b = 1;
            }
        }
        return f9849b > 0;
    }

    /* renamed from: d */
    public static boolean m15366d() {
        return !C4811o.China.name().equalsIgnoreCase(m15357a(m15363b()).name());
    }
}
