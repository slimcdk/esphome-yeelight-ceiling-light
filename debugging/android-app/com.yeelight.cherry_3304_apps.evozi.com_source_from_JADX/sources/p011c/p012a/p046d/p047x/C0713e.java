package p011c.p012a.p046d.p047x;

/* renamed from: c.a.d.x.e */
public final class C0713e {

    /* renamed from: a */
    private static final int f453a = m755a();

    /* renamed from: a */
    private static int m755a() {
        return m758d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m756b(String str) {
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
    public static int m757c() {
        return f453a;
    }

    /* renamed from: d */
    static int m758d(String str) {
        int f = m760f(str);
        if (f == -1) {
            f = m756b(str);
        }
        if (f == -1) {
            return 6;
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m759e() {
        return f453a >= 9;
    }

    /* renamed from: f */
    private static int m760f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
