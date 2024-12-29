package p011c.p083d.p084a.p085d0.p087n;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: c.d.a.d0.n.g */
public final class C1088g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final TimeZone f1573a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    private static final ThreadLocal<DateFormat> f1574b = new C1089a();

    /* renamed from: c */
    private static final String[] f1575c;

    /* renamed from: d */
    private static final DateFormat[] f1576d;

    /* renamed from: c.d.a.d0.n.g$a */
    static class C1089a extends ThreadLocal<DateFormat> {
        C1089a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C1088g.f1573a);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f1575c = strArr;
        f1576d = new DateFormat[strArr.length];
    }

    /* renamed from: b */
    public static Date m2463b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f1574b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f1575c) {
            int length = f1575c.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f1576d[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f1575c[i], Locale.US);
                    dateFormat.setTimeZone(f1573a);
                    f1576d[i] = dateFormat;
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
