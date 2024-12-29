package p011c.p012a.p046d.p047x;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: c.a.d.x.j */
public class C0725j {
    /* renamed from: a */
    private static String m778a(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: b */
    private static String m779b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: c */
    public static DateFormat m780c(int i, int i2) {
        return new SimpleDateFormat(m778a(i) + " " + m779b(i2), Locale.US);
    }
}
