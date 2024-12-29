package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.C1648b;
import com.google.android.gms.measurement.internal.C2112a6;
import com.google.android.gms.measurement.internal.C2136c6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.c */
public final class C2811c {

    /* renamed from: a */
    private static final Set<String> f5420a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    private static final List<String> f5421b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c */
    private static final List<String> f5422c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d */
    private static final List<String> f5423d = Arrays.asList(new String[]{"_r", "_dbg"});

    static {
        Arrays.asList((String[]) C1648b.m4565a(C2136c6.f3997a, C2136c6.f3998b));
        Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});
    }

    /* renamed from: a */
    public static boolean m8544a(@NonNull String str) {
        return !f5422c.contains(str);
    }

    /* renamed from: b */
    public static boolean m8545b(@NonNull String str, @Nullable Bundle bundle) {
        if (f5421b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f5423d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m8546c(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m8544a(str) || bundle == null) {
            return false;
        }
        for (String containsKey : f5423d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c = 2;
                }
            } else if (str.equals("fdl")) {
                c = 1;
            }
        } else if (str.equals("fcm")) {
            c = 0;
        }
        if (c == 0) {
            str3 = "fcm_integration";
        } else if (c == 1) {
            str3 = "fdl_integration";
        } else if (c != 2) {
            return false;
        } else {
            str3 = "fiam_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }

    /* renamed from: d */
    public static void m8547d(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    /* renamed from: e */
    public static boolean m8548e(@NonNull String str) {
        return !f5420a.contains(str);
    }

    /* renamed from: f */
    public static String m8549f(String str) {
        String a = C2112a6.m6753a(str);
        return a != null ? a : str;
    }
}
