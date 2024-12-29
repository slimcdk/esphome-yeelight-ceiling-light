package org.eclipse.jetty.util;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: org.eclipse.jetty.util.h */
public class C9984h {

    /* renamed from: o */
    private static long f18395o = 3600;

    /* renamed from: a */
    private String f18396a;

    /* renamed from: b */
    private String f18397b;

    /* renamed from: c */
    private SimpleDateFormat f18398c;

    /* renamed from: d */
    private String f18399d;

    /* renamed from: e */
    private SimpleDateFormat f18400e;

    /* renamed from: f */
    private String f18401f;

    /* renamed from: g */
    private String f18402g;

    /* renamed from: h */
    private String f18403h;

    /* renamed from: i */
    private long f18404i = -1;

    /* renamed from: j */
    private long f18405j = -1;

    /* renamed from: k */
    private int f18406k = -1;

    /* renamed from: l */
    private String f18407l = null;

    /* renamed from: m */
    private Locale f18408m = null;

    /* renamed from: n */
    private DateFormatSymbols f18409n = null;

    public C9984h(String str) {
        this.f18396a = str;
        mo40247e(TimeZone.getDefault());
    }

    public C9984h(String str, Locale locale) {
        this.f18396a = str;
        this.f18408m = locale;
        mo40247e(TimeZone.getDefault());
    }

    /* renamed from: d */
    private void m24680d() {
        if (this.f18397b.indexOf("ss.SSS") < 0) {
            int indexOf = this.f18397b.indexOf("ss");
            String substring = this.f18397b.substring(0, indexOf);
            String substring2 = this.f18397b.substring(indexOf + 2);
            this.f18399d = substring + "'ss'" + substring2;
            return;
        }
        throw new IllegalStateException("ms not supported");
    }

    /* renamed from: f */
    private synchronized void m24681f(TimeZone timeZone) {
        String str;
        int indexOf = this.f18396a.indexOf("ZZZ");
        if (indexOf >= 0) {
            String substring = this.f18396a.substring(0, indexOf);
            String substring2 = this.f18396a.substring(indexOf + 3);
            int rawOffset = timeZone.getRawOffset();
            StringBuilder sb = new StringBuilder(this.f18396a.length() + 10);
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
            str = this.f18396a;
        }
        this.f18397b = str;
        m24680d();
    }

    /* renamed from: a */
    public synchronized String mo40244a(long j) {
        long j2 = j / 1000;
        long j3 = this.f18405j;
        if (j2 >= j3) {
            if (j3 <= 0 || j2 <= f18395o + j3) {
                if (j3 == j2) {
                    return this.f18407l;
                }
                Date date = new Date(j);
                long j4 = j2 / 60;
                if (this.f18404i != j4) {
                    this.f18404i = j4;
                    String format = this.f18400e.format(date);
                    this.f18401f = format;
                    int indexOf = format.indexOf("ss");
                    this.f18402g = this.f18401f.substring(0, indexOf);
                    this.f18403h = this.f18401f.substring(indexOf + 2);
                }
                this.f18405j = j2;
                StringBuilder sb = new StringBuilder(this.f18401f.length());
                sb.append(this.f18402g);
                int i = (int) (j2 % 60);
                if (i < 10) {
                    sb.append('0');
                }
                sb.append(i);
                sb.append(this.f18403h);
                String sb2 = sb.toString();
                this.f18407l = sb2;
                return sb2;
            }
        }
        return this.f18398c.format(new Date(j));
    }

    /* renamed from: b */
    public int mo40245b() {
        return this.f18406k;
    }

    /* renamed from: c */
    public String mo40246c() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f18406k = (int) (currentTimeMillis % 1000);
        return mo40244a(currentTimeMillis);
    }

    /* renamed from: e */
    public synchronized void mo40247e(TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat;
        m24681f(timeZone);
        if (this.f18408m != null) {
            this.f18398c = new SimpleDateFormat(this.f18397b, this.f18408m);
            simpleDateFormat = new SimpleDateFormat(this.f18399d, this.f18408m);
        } else if (this.f18409n != null) {
            this.f18398c = new SimpleDateFormat(this.f18397b, this.f18409n);
            simpleDateFormat = new SimpleDateFormat(this.f18399d, this.f18409n);
        } else {
            this.f18398c = new SimpleDateFormat(this.f18397b);
            simpleDateFormat = new SimpleDateFormat(this.f18399d);
        }
        this.f18400e = simpleDateFormat;
        this.f18398c.setTimeZone(timeZone);
        this.f18400e.setTimeZone(timeZone);
        this.f18405j = -1;
        this.f18404i = -1;
    }
}
