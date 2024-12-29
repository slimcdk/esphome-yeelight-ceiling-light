package p164h.p211a.p212a.p228h;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: h.a.a.h.h */
public class C11120h {

    /* renamed from: o */
    private static long f22013o = 3600;

    /* renamed from: a */
    private String f22014a;

    /* renamed from: b */
    private String f22015b;

    /* renamed from: c */
    private SimpleDateFormat f22016c;

    /* renamed from: d */
    private String f22017d;

    /* renamed from: e */
    private SimpleDateFormat f22018e;

    /* renamed from: f */
    private String f22019f;

    /* renamed from: g */
    private String f22020g;

    /* renamed from: h */
    private String f22021h;

    /* renamed from: i */
    private long f22022i = -1;

    /* renamed from: j */
    private long f22023j = -1;

    /* renamed from: k */
    private int f22024k = -1;

    /* renamed from: l */
    private String f22025l = null;

    /* renamed from: m */
    private Locale f22026m = null;

    /* renamed from: n */
    private DateFormatSymbols f22027n = null;

    public C11120h(String str) {
        this.f22014a = str;
        mo35360e(TimeZone.getDefault());
    }

    public C11120h(String str, Locale locale) {
        this.f22014a = str;
        this.f22026m = locale;
        mo35360e(TimeZone.getDefault());
    }

    /* renamed from: d */
    private void m28865d() {
        if (this.f22015b.indexOf("ss.SSS") < 0) {
            int indexOf = this.f22015b.indexOf("ss");
            String substring = this.f22015b.substring(0, indexOf);
            String substring2 = this.f22015b.substring(indexOf + 2);
            this.f22017d = substring + "'ss'" + substring2;
            return;
        }
        throw new IllegalStateException("ms not supported");
    }

    /* renamed from: f */
    private synchronized void m28866f(TimeZone timeZone) {
        String str;
        int indexOf = this.f22014a.indexOf("ZZZ");
        if (indexOf >= 0) {
            String substring = this.f22014a.substring(0, indexOf);
            String substring2 = this.f22014a.substring(indexOf + 3);
            int rawOffset = timeZone.getRawOffset();
            StringBuilder sb = new StringBuilder(this.f22014a.length() + 10);
            sb.append(substring);
            sb.append("'");
            if (rawOffset >= 0) {
                sb.append('+');
            } else {
                rawOffset = -rawOffset;
                sb.append('-');
            }
            int i = rawOffset / 60000;
            int i2 = i / 60;
            int i3 = i % 60;
            if (i2 < 10) {
                sb.append('0');
            }
            sb.append(i2);
            if (i3 < 10) {
                sb.append('0');
            }
            sb.append(i3);
            sb.append('\'');
            sb.append(substring2);
            str = sb.toString();
        } else {
            str = this.f22014a;
        }
        this.f22015b = str;
        m28865d();
    }

    /* renamed from: a */
    public synchronized String mo35357a(long j) {
        long j2 = j / 1000;
        if (j2 >= this.f22023j) {
            if (this.f22023j <= 0 || j2 <= this.f22023j + f22013o) {
                if (this.f22023j == j2) {
                    return this.f22025l;
                }
                Date date = new Date(j);
                long j3 = j2 / 60;
                if (this.f22022i != j3) {
                    this.f22022i = j3;
                    String format = this.f22018e.format(date);
                    this.f22019f = format;
                    int indexOf = format.indexOf("ss");
                    this.f22020g = this.f22019f.substring(0, indexOf);
                    this.f22021h = this.f22019f.substring(indexOf + 2);
                }
                this.f22023j = j2;
                StringBuilder sb = new StringBuilder(this.f22019f.length());
                sb.append(this.f22020g);
                int i = (int) (j2 % 60);
                if (i < 10) {
                    sb.append('0');
                }
                sb.append(i);
                sb.append(this.f22021h);
                String sb2 = sb.toString();
                this.f22025l = sb2;
                return sb2;
            }
        }
        return this.f22016c.format(new Date(j));
    }

    /* renamed from: b */
    public int mo35358b() {
        return this.f22024k;
    }

    /* renamed from: c */
    public String mo35359c() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f22024k = (int) (currentTimeMillis % 1000);
        return mo35357a(currentTimeMillis);
    }

    /* renamed from: e */
    public synchronized void mo35360e(TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat;
        m28866f(timeZone);
        if (this.f22026m != null) {
            this.f22016c = new SimpleDateFormat(this.f22015b, this.f22026m);
            simpleDateFormat = new SimpleDateFormat(this.f22017d, this.f22026m);
        } else if (this.f22027n != null) {
            this.f22016c = new SimpleDateFormat(this.f22015b, this.f22027n);
            simpleDateFormat = new SimpleDateFormat(this.f22017d, this.f22027n);
        } else {
            this.f22016c = new SimpleDateFormat(this.f22015b);
            simpleDateFormat = new SimpleDateFormat(this.f22017d);
        }
        this.f22018e = simpleDateFormat;
        this.f22016c.setTimeZone(timeZone);
        this.f22018e.setTimeZone(timeZone);
        this.f22023j = -1;
        this.f22022i = -1;
    }
}
