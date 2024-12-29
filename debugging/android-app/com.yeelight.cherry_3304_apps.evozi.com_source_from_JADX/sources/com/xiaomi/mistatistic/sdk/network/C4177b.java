package com.xiaomi.mistatistic.sdk.network;

import java.util.regex.Pattern;

/* renamed from: com.xiaomi.mistatistic.sdk.network.b */
public class C4177b {

    /* renamed from: a */
    private static final Pattern f7171a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f7172b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f7173c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    public static boolean m11320a(String str) {
        return f7171a.matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m11321b(String str) {
        return f7172b.matcher(str).matches();
    }

    /* renamed from: c */
    public static boolean m11322c(String str) {
        return f7173c.matcher(str).matches();
    }

    /* renamed from: d */
    public static boolean m11323d(String str) {
        return m11321b(str) || m11322c(str);
    }
}
