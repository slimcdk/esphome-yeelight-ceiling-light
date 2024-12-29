package p011c.p083d.p084a.p085d0.p087n;

import androidx.appcompat.widget.ActivityChooserView;

/* renamed from: c.d.a.d0.n.e */
public final class C1079e {
    /* renamed from: a */
    public static int m2421a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: b */
    public static int m2422b(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: c */
    public static int m2423c(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }
}
