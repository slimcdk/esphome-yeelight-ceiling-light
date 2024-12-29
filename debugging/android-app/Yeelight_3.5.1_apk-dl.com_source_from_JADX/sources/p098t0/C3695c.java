package p098t0;

import com.google.code.microlog4android.Level;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: t0.c */
public class C3695c implements C3696d {

    /* renamed from: c */
    static final String[] f6212c = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    /* renamed from: a */
    private final Calendar f6213a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    /* renamed from: b */
    int f6214b = 1;

    /* renamed from: a */
    public String mo26104a(String str, String str2, long j, Level level, Object obj, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f6214b;
        if (i != 1) {
            if (i == 2) {
                return mo26108d(currentTimeMillis);
            }
            if (i == 3) {
                return mo26109e(currentTimeMillis);
            }
            currentTimeMillis = System.currentTimeMillis();
        }
        return mo26107c(currentTimeMillis);
    }

    /* renamed from: b */
    public void mo26106b(String str) {
        int i;
        if (str.equals("ABSOLUTE")) {
            i = 1;
        } else if (str.equals("DATE")) {
            i = 2;
        } else if (str.equals("ISO8601")) {
            i = 3;
        } else {
            return;
        }
        this.f6214b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo26107c(long j) {
        this.f6213a.setTime(new Date(j));
        long j2 = (long) this.f6213a.get(11);
        StringBuffer stringBuffer = new StringBuffer();
        if (j2 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(j2);
        stringBuffer.append(':');
        long j3 = (long) this.f6213a.get(12);
        if (j3 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(j3);
        stringBuffer.append(':');
        long j4 = (long) this.f6213a.get(13);
        if (j4 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(j4);
        stringBuffer.append(',');
        long j5 = (long) this.f6213a.get(14);
        if (j5 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(j5);
        return stringBuffer.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo26108d(long j) {
        this.f6213a.setTime(new Date(j));
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.f6213a.get(5);
        if (i < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(i);
        stringBuffer.append(' ');
        stringBuffer.append(f6212c[this.f6213a.get(2)]);
        stringBuffer.append(' ');
        stringBuffer.append(this.f6213a.get(1));
        stringBuffer.append(' ');
        stringBuffer.append(mo26107c(j));
        return stringBuffer.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo26109e(long j) {
        this.f6213a.setTime(new Date(j));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f6213a.get(1));
        stringBuffer.append('-');
        int i = this.f6213a.get(2) + 1;
        if (i < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(i);
        stringBuffer.append('-');
        int i2 = this.f6213a.get(5);
        if (i2 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(i2);
        stringBuffer.append(' ');
        stringBuffer.append(mo26107c(j));
        return stringBuffer.toString();
    }
}
