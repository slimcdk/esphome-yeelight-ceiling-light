package org.fourthline.cling.model.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: org.fourthline.cling.model.types.i */
public class C10088i extends C10073a<Calendar> {

    /* renamed from: b */
    protected String[] f18609b;

    /* renamed from: c */
    protected String f18610c;

    public C10088i(String[] strArr, String str) {
        this.f18609b = strArr;
        this.f18610c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Date mo40605i(String str, String[] strArr) {
        String l = mo40608l(str);
        Date date = null;
        for (String simpleDateFormat : strArr) {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(simpleDateFormat);
            simpleDateFormat2.setTimeZone(mo40607k());
            try {
                date = simpleDateFormat2.parse(l);
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    /* renamed from: j */
    public String mo40556a(Calendar calendar) {
        if (calendar == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f18610c);
        simpleDateFormat.setTimeZone(mo40607k());
        return simpleDateFormat.format(calendar.getTime());
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public TimeZone mo40607k() {
        return TimeZone.getDefault();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo40608l(String str) {
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
    public Calendar mo40561f(String str) {
        if (str.equals("")) {
            return null;
        }
        Date i = mo40605i(str, this.f18609b);
        if (i != null) {
            Calendar instance = Calendar.getInstance(mo40607k());
            instance.setTime(i);
            return instance;
        }
        throw new InvalidValueException("Can't parse date/time from: " + str);
    }
}
