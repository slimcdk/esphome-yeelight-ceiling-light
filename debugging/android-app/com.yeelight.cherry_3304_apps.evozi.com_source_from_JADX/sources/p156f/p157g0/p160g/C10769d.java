package p156f.p157g0.p160g;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p156f.p157g0.C4345c;

/* renamed from: f.g0.g.d */
public final class C10769d {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f20672a = new C10770a();

    /* renamed from: b */
    private static final String[] f20673b;

    /* renamed from: c */
    private static final DateFormat[] f20674c;

    /* renamed from: f.g0.g.d$a */
    class C10770a extends ThreadLocal<DateFormat> {
        C10770a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C4345c.f7653n);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f20673b = strArr;
        f20674c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static String m26682a(Date date) {
        return f20672a.get().format(date);
    }

    /* renamed from: b */
    public static Date m26683b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f20672a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f20673b) {
            int length = f20673b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f20674c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f20673b[i], Locale.US);
                    dateFormat.setTimeZone(C4345c.f7653n);
                    f20674c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
