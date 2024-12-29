package com.google.gson.internal;

/* renamed from: com.google.gson.internal.d */
public final class C2514d {

    /* renamed from: a */
    private static final int f4258a = m6784a();

    /* renamed from: a */
    private static int m6784a() {
        return m6787d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m6785b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m6786c() {
        return f4258a;
    }

    /* renamed from: d */
    static int m6787d(String str) {
        int f = m6789f(str);
        if (f == -1) {
            f = m6785b(str);
        }
        if (f == -1) {
            return 6;
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m6788e() {
        return f4258a >= 9;
    }

    /* renamed from: f */
    private static int m6789f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
