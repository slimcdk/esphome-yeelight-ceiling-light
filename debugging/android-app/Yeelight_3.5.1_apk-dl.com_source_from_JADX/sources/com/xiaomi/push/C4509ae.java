package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ae */
public class C4509ae {

    /* renamed from: a */
    private static int f7536a;

    /* renamed from: a */
    public static final String f7537a;

    /* renamed from: a */
    public static final boolean f7538a;

    /* renamed from: b */
    public static final boolean f7539b;

    /* renamed from: c */
    public static final boolean f7540c;

    /* renamed from: d */
    public static final boolean f7541d;

    /* renamed from: e */
    public static boolean f7542e;

    /* renamed from: f */
    public static final boolean f7543f;

    /* renamed from: g */
    public static final boolean f7544g;

    static {
        int i;
        String str = C4512ah.f7546a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f7537a = str;
        boolean contains = str.contains("2A2FE0D7");
        f7538a = contains;
        boolean z = false;
        f7539b = contains || "DEBUG".equalsIgnoreCase(str);
        f7540c = "LOGABLE".equalsIgnoreCase(str);
        f7541d = str.contains("YY");
        f7542e = str.equalsIgnoreCase("TEST");
        f7543f = "BETA".equalsIgnoreCase(str);
        if (str.startsWith("RC")) {
            z = true;
        }
        f7544g = z;
        f7536a = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            i = 2;
        } else if (str.equalsIgnoreCase("ONEBOX")) {
            i = 3;
        } else {
            f7536a = 1;
            return;
        }
        f7536a = i;
    }

    /* renamed from: a */
    public static int m12843a() {
        return f7536a;
    }

    /* renamed from: a */
    public static void m12844a(int i) {
        f7536a = i;
    }

    /* renamed from: a */
    public static boolean m12845a() {
        return f7536a == 2;
    }

    /* renamed from: b */
    public static boolean m12846b() {
        return f7536a == 3;
    }
}
