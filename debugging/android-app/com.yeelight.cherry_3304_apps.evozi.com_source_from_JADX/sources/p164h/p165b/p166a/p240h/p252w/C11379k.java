package p164h.p165b.p166a.p240h.p252w;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: h.b.a.h.w.k */
public class C11379k extends C11356a<Calendar> {

    /* renamed from: b */
    protected String[] f22605b;

    /* renamed from: c */
    protected String f22606c;

    public C11379k(String[] strArr, String str) {
        this.f22605b = strArr;
        this.f22606c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Date mo36084i(String str, String[] strArr) {
        String l = mo36087l(str);
        Date date = null;
        for (String simpleDateFormat : strArr) {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(simpleDateFormat);
            simpleDateFormat2.setTimeZone(mo36086k());
            try {
                date = simpleDateFormat2.parse(l);
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    /* renamed from: j */
    public String mo36041a(Calendar calendar) {
        if (calendar == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f22606c);
        simpleDateFormat.setTimeZone(mo36086k());
        return simpleDateFormat.format(calendar.getTime());
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public TimeZone mo36086k() {
        return TimeZone.getDefault();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo36087l(String str) {
        StringBuilder sb;
        String substring;
        if (str.endsWith("Z")) {
            sb = new StringBuilder();
            sb.append(str.substring(0, str.length() - 1));
            substring = "+0000";
        } else if (str.length() <= 7 || str.charAt(str.length() - 3) != ':') {
            return str;
        } else {
            if (str.charAt(str.length() - 6) != '-' && str.charAt(str.length() - 6) != '+') {
                return str;
            }
            sb = new StringBuilder();
            sb.append(str.substring(0, str.length() - 3));
            substring = str.substring(str.length() - 2);
        }
        sb.append(substring);
        return sb.toString();
    }

    /* renamed from: m */
    public Calendar mo36049f(String str) {
        if (str.equals("")) {
            return null;
        }
        Date i = mo36084i(str, this.f22605b);
        if (i != null) {
            Calendar instance = Calendar.getInstance(mo36086k());
            instance.setTime(i);
            return instance;
        }
        throw new C11391r("Can't parse date/time from: " + str);
    }
}
