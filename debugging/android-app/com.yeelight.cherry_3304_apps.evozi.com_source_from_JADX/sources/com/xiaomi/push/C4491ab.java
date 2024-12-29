package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ab */
public class C4491ab {

    /* renamed from: a */
    private static int f8141a;

    /* renamed from: a */
    public static final String f8142a;

    /* renamed from: a */
    public static final boolean f8143a;

    /* renamed from: b */
    public static final boolean f8144b;

    /* renamed from: c */
    public static final boolean f8145c = "LOGABLE".equalsIgnoreCase(f8142a);

    /* renamed from: d */
    public static final boolean f8146d = f8142a.contains("YY");

    /* renamed from: e */
    public static boolean f8147e = f8142a.equalsIgnoreCase("TEST");

    /* renamed from: f */
    public static final boolean f8148f = "BETA".equalsIgnoreCase(f8142a);

    /* renamed from: g */
    public static final boolean f8149g;

    static {
        int i;
        String str = C4494ae.f8151a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f8142a = str;
        boolean contains = str.contains("2A2FE0D7");
        f8143a = contains;
        boolean z = false;
        f8144b = contains || "DEBUG".equalsIgnoreCase(f8142a);
        String str2 = f8142a;
        if (str2 != null && str2.startsWith("RC")) {
            z = true;
        }
        f8149g = z;
        f8141a = 1;
        if (f8142a.equalsIgnoreCase("SANDBOX")) {
            i = 2;
        } else if (f8142a.equalsIgnoreCase("ONEBOX")) {
            i = 3;
        } else {
            f8141a = 1;
            return;
        }
        f8141a = i;
    }

    /* renamed from: a */
    public static int m13256a() {
        return f8141a;
    }

    /* renamed from: a */
    public static void m13257a(int i) {
        f8141a = i;
    }

    /* renamed from: a */
    public static boolean m13258a() {
        return f8141a == 2;
    }

    /* renamed from: b */
    public static boolean m13259b() {
        return f8141a == 3;
    }
}
