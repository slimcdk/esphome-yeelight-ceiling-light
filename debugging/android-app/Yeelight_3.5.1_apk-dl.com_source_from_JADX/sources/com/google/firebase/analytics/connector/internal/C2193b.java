package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C1693l6;
import com.google.android.gms.measurement.internal.C1718n6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p014c0.C0613b;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
public final class C2193b {

    /* renamed from: a */
    private static final Set f3489a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    private static final List f3490b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c */
    private static final List f3491c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d */
    private static final List f3492d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e */
    private static final List f3493e = Arrays.asList((String[]) C0613b.m187a(C1718n6.f2367a, C1718n6.f2368b));

    /* renamed from: f */
    private static final List f3494f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* renamed from: a */
    public static String m5508a(String str) {
        String a = C1693l6.m4466a(str);
        return a != null ? a : str;
    }

    /* renamed from: b */
    public static void m5509b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m5510c(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r5 = r0.equals(r5)
            r0 = 1
            if (r5 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r5 = m5513f(r4)
            r1 = 0
            if (r5 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r6 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.util.List r5 = f3492d
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L_0x001b
            return r1
        L_0x002e:
            int r5 = r4.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r5 == r2) goto L_0x0057
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r5 == r2) goto L_0x004d
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r5 == r2) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            java.lang.String r5 = "fiam"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r5 = "fdl"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = 1
            goto L_0x0062
        L_0x0057:
            java.lang.String r5 = "fcm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0061
            r4 = 0
            goto L_0x0062
        L_0x0061:
            r4 = -1
        L_0x0062:
            java.lang.String r5 = "_cis"
            if (r4 == 0) goto L_0x0074
            if (r4 == r0) goto L_0x0071
            if (r4 == r3) goto L_0x006b
            return r1
        L_0x006b:
            java.lang.String r4 = "fiam_integration"
        L_0x006d:
            r6.putString(r5, r4)
            return r0
        L_0x0071:
            java.lang.String r4 = "fdl_integration"
            goto L_0x006d
        L_0x0074:
            java.lang.String r4 = "fcm_integration"
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.C2193b.m5510c(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    /* renamed from: d */
    public static boolean m5511d(String str, Bundle bundle) {
        if (f3490b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f3492d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m5512e(String str) {
        return !f3489a.contains(str);
    }

    /* renamed from: f */
    public static boolean m5513f(String str) {
        return !f3491c.contains(str);
    }
}
