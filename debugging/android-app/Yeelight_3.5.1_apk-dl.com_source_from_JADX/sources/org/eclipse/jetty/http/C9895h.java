package org.eclipse.jetty.http;

import com.miot.service.manager.timer.TimerCodec;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.p194io.IOUtils;
import org.eclipse.jetty.util.C9994m;
import org.eclipse.jetty.util.C9995n;
import org.eclipse.jetty.util.StringMap;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;
import p225w5.C11942e;
import p225w5.C11944f;
import p225w5.C11945g;
import p225w5.C11946h;

/* renamed from: org.eclipse.jetty.http.h */
public class C9895h {

    /* renamed from: c */
    private static final C9003c f18034c = C9001b.m21450a(C9895h.class);

    /* renamed from: d */
    public static final TimeZone f18035d;

    /* renamed from: e */
    public static final C11944f f18036e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f18037f = {"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f18038g = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan"};

    /* renamed from: h */
    private static final ThreadLocal<C9901f> f18039h = new C9896a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f18040i = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss", "EEE MMM dd HH:mm:ss yyyy", "EEE, dd MMM yyyy HH:mm:ss", "EEE dd MMM yyyy HH:mm:ss zzz", "EEE dd MMM yyyy HH:mm:ss", "EEE MMM dd yyyy HH:mm:ss zzz", "EEE MMM dd yyyy HH:mm:ss", "EEE MMM-dd-yyyy HH:mm:ss zzz", "EEE MMM-dd-yyyy HH:mm:ss", "dd MMM yyyy HH:mm:ss zzz", "dd MMM yyyy HH:mm:ss", "dd-MMM-yy HH:mm:ss zzz", "dd-MMM-yy HH:mm:ss", "MMM dd HH:mm:ss yyyy zzz", "MMM dd HH:mm:ss yyyy", "EEE MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss"};

    /* renamed from: j */
    private static final ThreadLocal<C9902g> f18041j = new C9897b();

    /* renamed from: k */
    public static final String f18042k;

    /* renamed from: l */
    public static final C11940d f18043l;

    /* renamed from: m */
    public static final String f18044m = m24171l(0).trim();

    /* renamed from: n */
    private static ConcurrentMap<String, C11940d> f18045n = new ConcurrentHashMap();

    /* renamed from: o */
    private static int f18046o = Integer.getInteger("org.eclipse.jetty.http.HttpFields.CACHE", 2000).intValue();

    /* renamed from: p */
    private static final Float f18047p;

    /* renamed from: q */
    private static final Float f18048q;

    /* renamed from: r */
    private static final StringMap f18049r;

    /* renamed from: a */
    private final ArrayList<C9903h> f18050a = new ArrayList<>(20);

    /* renamed from: b */
    private final HashMap<C11940d, C9903h> f18051b = new HashMap<>(32);

    /* renamed from: org.eclipse.jetty.http.h$a */
    static class C9896a extends ThreadLocal<C9901f> {
        C9896a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C9901f initialValue() {
            return new C9901f((C9896a) null);
        }
    }

    /* renamed from: org.eclipse.jetty.http.h$b */
    static class C9897b extends ThreadLocal<C9902g> {
        C9897b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C9902g initialValue() {
            return new C9902g((C9896a) null);
        }
    }

    /* renamed from: org.eclipse.jetty.http.h$c */
    class C9898c implements Enumeration<String> {

        /* renamed from: a */
        final /* synthetic */ Enumeration f18052a;

        C9898c(C9895h hVar, Enumeration enumeration) {
            this.f18052a = enumeration;
        }

        /* renamed from: a */
        public String nextElement() {
            return this.f18052a.nextElement().toString();
        }

        public boolean hasMoreElements() {
            return this.f18052a.hasMoreElements();
        }
    }

    /* renamed from: org.eclipse.jetty.http.h$d */
    class C9899d implements Enumeration<String> {

        /* renamed from: a */
        C9903h f18053a;

        /* renamed from: b */
        final /* synthetic */ C9903h f18054b;

        C9899d(C9895h hVar, C9903h hVar2) {
            this.f18054b = hVar2;
            this.f18053a = hVar2;
        }

        /* renamed from: a */
        public String nextElement() {
            C9903h hVar = this.f18053a;
            if (hVar != null) {
                this.f18053a = hVar.f18062c;
                return hVar.mo39825h();
            }
            throw new NoSuchElementException();
        }

        public boolean hasMoreElements() {
            return this.f18053a != null;
        }
    }

    /* renamed from: org.eclipse.jetty.http.h$e */
    class C9900e implements Enumeration<String> {

        /* renamed from: a */
        C9903h f18055a;

        /* renamed from: b */
        final /* synthetic */ C9903h f18056b;

        C9900e(C9895h hVar, C9903h hVar2) {
            this.f18056b = hVar2;
            this.f18055a = hVar2;
        }

        /* renamed from: a */
        public String nextElement() {
            C9903h hVar = this.f18055a;
            if (hVar != null) {
                this.f18055a = hVar.f18062c;
                return hVar.mo39825h();
            }
            throw new NoSuchElementException();
        }

        public boolean hasMoreElements() {
            return this.f18055a != null;
        }
    }

    /* renamed from: org.eclipse.jetty.http.h$f */
    private static class C9901f {

        /* renamed from: a */
        private final StringBuilder f18057a;

        /* renamed from: b */
        private final GregorianCalendar f18058b;

        private C9901f() {
            this.f18057a = new StringBuilder(32);
            this.f18058b = new GregorianCalendar(C9895h.f18035d);
        }

        /* synthetic */ C9901f(C9896a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo39819a(StringBuilder sb, long j) {
            this.f18058b.setTimeInMillis(j);
            int i = this.f18058b.get(7);
            int i2 = this.f18058b.get(5);
            int i3 = this.f18058b.get(2);
            int i4 = this.f18058b.get(1) % 10000;
            int i5 = (int) ((j / 1000) % 86400);
            int i6 = i5 % 60;
            int i7 = i5 / 60;
            sb.append(C9895h.f18037f[i]);
            sb.append(',');
            sb.append(' ');
            C9995n.m24705a(sb, i2);
            sb.append('-');
            sb.append(C9895h.f18038g[i3]);
            sb.append('-');
            C9995n.m24705a(sb, i4 / 100);
            C9995n.m24705a(sb, i4 % 100);
            sb.append(' ');
            C9995n.m24705a(sb, i7 / 60);
            sb.append(':');
            C9995n.m24705a(sb, i7 % 60);
            sb.append(':');
            C9995n.m24705a(sb, i6);
            sb.append(" GMT");
        }

        /* renamed from: b */
        public String mo39820b(long j) {
            this.f18057a.setLength(0);
            this.f18058b.setTimeInMillis(j);
            int i = this.f18058b.get(7);
            int i2 = this.f18058b.get(5);
            int i3 = this.f18058b.get(2);
            int i4 = this.f18058b.get(1);
            int i5 = this.f18058b.get(11);
            int i6 = this.f18058b.get(12);
            int i7 = this.f18058b.get(13);
            this.f18057a.append(C9895h.f18037f[i]);
            this.f18057a.append(',');
            this.f18057a.append(' ');
            C9995n.m24705a(this.f18057a, i2);
            this.f18057a.append(' ');
            this.f18057a.append(C9895h.f18038g[i3]);
            this.f18057a.append(' ');
            C9995n.m24705a(this.f18057a, i4 / 100);
            C9995n.m24705a(this.f18057a, i4 % 100);
            this.f18057a.append(' ');
            C9995n.m24705a(this.f18057a, i5);
            this.f18057a.append(':');
            C9995n.m24705a(this.f18057a, i6);
            this.f18057a.append(':');
            C9995n.m24705a(this.f18057a, i7);
            this.f18057a.append(" GMT");
            return this.f18057a.toString();
        }
    }

    /* renamed from: org.eclipse.jetty.http.h$g */
    private static class C9902g {

        /* renamed from: a */
        final SimpleDateFormat[] f18059a;

        private C9902g() {
            this.f18059a = new SimpleDateFormat[C9895h.f18040i.length];
        }

        /* synthetic */ C9902g(C9896a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo39821a(String str) {
            int i = 0;
            int i2 = 0;
            while (true) {
                SimpleDateFormat[] simpleDateFormatArr = this.f18059a;
                if (i2 < simpleDateFormatArr.length) {
                    if (simpleDateFormatArr[i2] == null) {
                        simpleDateFormatArr[i2] = new SimpleDateFormat(C9895h.f18040i[i2], Locale.US);
                        this.f18059a[i2].setTimeZone(C9895h.f18035d);
                    }
                    try {
                        return ((Date) this.f18059a[i2].parseObject(str)).getTime();
                    } catch (Exception unused) {
                        i2++;
                    }
                } else if (!str.endsWith(" GMT")) {
                    return -1;
                } else {
                    String substring = str.substring(0, str.length() - 4);
                    while (true) {
                        SimpleDateFormat[] simpleDateFormatArr2 = this.f18059a;
                        if (i >= simpleDateFormatArr2.length) {
                            return -1;
                        }
                        try {
                            return ((Date) simpleDateFormatArr2[i].parseObject(substring)).getTime();
                        } catch (Exception unused2) {
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: org.eclipse.jetty.http.h$h */
    public static final class C9903h {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C11940d f18060a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C11940d f18061b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C9903h f18062c;

        private C9903h(C11940d dVar, C11940d dVar2) {
            this.f18060a = dVar;
            this.f18061b = dVar2;
            this.f18062c = null;
        }

        /* synthetic */ C9903h(C11940d dVar, C11940d dVar2, C9896a aVar) {
            this(dVar, dVar2);
        }

        /* renamed from: e */
        public long mo39822e() {
            return C11945g.m30571i(this.f18061b);
        }

        /* renamed from: f */
        public String mo39823f() {
            return C11945g.m30568f(this.f18060a);
        }

        /* renamed from: g */
        public int mo39824g() {
            return C9908k.f18084d.mo42459f(this.f18060a);
        }

        /* renamed from: h */
        public String mo39825h() {
            return C11945g.m30568f(this.f18061b);
        }

        /* renamed from: i */
        public C11940d mo39826i() {
            return this.f18061b;
        }

        /* renamed from: j */
        public int mo39827j() {
            return C9907j.f18080d.mo42459f(this.f18061b);
        }

        /* renamed from: k */
        public void mo39828k(C11940d dVar) {
            C11940d dVar2 = this.f18060a;
            int i = -1;
            if ((dVar2 instanceof C11942e.C11943a ? ((C11942e.C11943a) dVar2).mo42464e() : -1) >= 0) {
                dVar.mo42405E0(this.f18060a);
            } else {
                int L0 = this.f18060a.mo42409L0();
                int U0 = this.f18060a.mo42416U0();
                while (L0 < U0) {
                    int i2 = L0 + 1;
                    byte W = this.f18060a.mo42449W(L0);
                    if (!(W == 10 || W == 13 || W == 58)) {
                        dVar.mo42414S0(W);
                    }
                    L0 = i2;
                }
            }
            dVar.mo42414S0((byte) 58);
            dVar.mo42414S0((byte) 32);
            C11940d dVar3 = this.f18061b;
            if (dVar3 instanceof C11942e.C11943a) {
                i = ((C11942e.C11943a) dVar3).mo42464e();
            }
            C11940d dVar4 = this.f18061b;
            if (i >= 0) {
                dVar.mo42405E0(dVar4);
            } else {
                int L02 = dVar4.mo42409L0();
                int U02 = this.f18061b.mo42416U0();
                while (L02 < U02) {
                    int i3 = L02 + 1;
                    byte W2 = this.f18061b.mo42449W(L02);
                    if (!(W2 == 10 || W2 == 13)) {
                        dVar.mo42414S0(W2);
                    }
                    L02 = i3;
                }
            }
            C11945g.m30565c(dVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(mo39823f());
            sb.append("=");
            sb.append(this.f18061b);
            sb.append(this.f18062c == null ? "" : "->");
            sb.append("]");
            return sb.toString();
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        f18035d = timeZone;
        C11944f fVar = new C11944f("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f18036e = fVar;
        timeZone.setID("GMT");
        fVar.mo40247e(timeZone);
        String n = m24173n(0);
        f18042k = n;
        f18043l = new C11946h(n);
        Float f = new Float("1.0");
        f18047p = f;
        Float f2 = new Float("0.0");
        f18048q = f2;
        StringMap stringMap = new StringMap();
        f18049r = stringMap;
        stringMap.put((String) null, (Object) f);
        stringMap.put("1.0", (Object) f);
        stringMap.put(TimerCodec.ENABLE, (Object) f);
        stringMap.put("0.9", (Object) new Float("0.9"));
        stringMap.put("0.8", (Object) new Float("0.8"));
        stringMap.put("0.7", (Object) new Float("0.7"));
        stringMap.put("0.66", (Object) new Float("0.66"));
        stringMap.put("0.6", (Object) new Float("0.6"));
        stringMap.put("0.5", (Object) new Float("0.5"));
        stringMap.put("0.4", (Object) new Float("0.4"));
        stringMap.put("0.33", (Object) new Float("0.33"));
        stringMap.put("0.3", (Object) new Float("0.3"));
        stringMap.put("0.2", (Object) new Float("0.2"));
        stringMap.put("0.1", (Object) new Float("0.1"));
        stringMap.put(TimerCodec.DISENABLE, (Object) f2);
        stringMap.put("0.0", (Object) f2);
    }

    /* renamed from: L */
    public static String m24166L(String str, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            return str;
        }
        if (map != null) {
            C9994m mVar = new C9994m(str.substring(indexOf), ";", false, true);
            while (mVar.hasMoreTokens()) {
                C9994m mVar2 = new C9994m(mVar.nextToken(), "= ");
                if (mVar2.hasMoreTokens()) {
                    map.put(mVar2.nextToken(), mVar2.hasMoreTokens() ? mVar2.nextToken() : null);
                }
            }
        }
        return str.substring(0, indexOf).trim();
    }

    /* renamed from: k */
    private C11940d m24170k(String str) {
        C11940d dVar = (C11940d) f18045n.get(str);
        if (dVar != null) {
            return dVar;
        }
        try {
            C11946h hVar = new C11946h(str, "ISO-8859-1");
            if (f18046o <= 0) {
                return hVar;
            }
            if (f18045n.size() > f18046o) {
                f18045n.clear();
            }
            C11940d putIfAbsent = f18045n.putIfAbsent(str, hVar);
            return putIfAbsent != null ? putIfAbsent : hVar;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    public static String m24171l(long j) {
        StringBuilder sb = new StringBuilder(28);
        m24172m(sb, j);
        return sb.toString();
    }

    /* renamed from: m */
    public static void m24172m(StringBuilder sb, long j) {
        f18039h.get().mo39819a(sb, j);
    }

    /* renamed from: n */
    public static String m24173n(long j) {
        return f18039h.get().mo39820b(j);
    }

    /* renamed from: r */
    private C9903h m24174r(String str) {
        return this.f18051b.get(C9908k.f18084d.mo42460g(str));
    }

    /* renamed from: s */
    private C9903h m24175s(C11940d dVar) {
        return this.f18051b.get(C9908k.f18084d.mo42461h(dVar));
    }

    /* renamed from: A */
    public Collection<String> mo39777A(String str) {
        C9903h r = m24174r(str);
        if (r == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (r != null) {
            arrayList.add(r.mo39825h());
            r = r.f18062c;
        }
        return arrayList;
    }

    /* renamed from: B */
    public void mo39778B(String str, String str2) {
        if (str2 == null) {
            mo39785I(str);
        } else {
            mo39780D(C9908k.f18084d.mo42460g(str), m24170k(str2));
        }
    }

    /* renamed from: C */
    public void mo39779C(C11940d dVar, String str) {
        mo39780D(C9908k.f18084d.mo42461h(dVar), m24170k(str));
    }

    /* renamed from: D */
    public void mo39780D(C11940d dVar, C11940d dVar2) {
        mo39786J(dVar);
        if (dVar2 != null) {
            if (!(dVar instanceof C11942e.C11943a)) {
                dVar = C9908k.f18084d.mo42461h(dVar);
            }
            if (!(dVar2 instanceof C11942e.C11943a)) {
                dVar2 = C9907j.f18080d.mo42461h(dVar2).mo42421b1();
            }
            C9903h hVar = new C9903h(dVar, dVar2, (C9896a) null);
            this.f18050a.add(hVar);
            this.f18051b.put(dVar, hVar);
        }
    }

    /* renamed from: E */
    public void mo39781E(String str, long j) {
        mo39782F(C9908k.f18084d.mo42460g(str), j);
    }

    /* renamed from: F */
    public void mo39782F(C11940d dVar, long j) {
        mo39780D(dVar, new C11946h(m24173n(j)));
    }

    /* renamed from: G */
    public void mo39783G(String str, long j) {
        mo39780D(C9908k.f18084d.mo42460g(str), C11945g.m30569g(j));
    }

    /* renamed from: H */
    public void mo39784H(C11940d dVar, long j) {
        mo39780D(dVar, C11945g.m30569g(j));
    }

    /* renamed from: I */
    public void mo39785I(String str) {
        mo39786J(C9908k.f18084d.mo42460g(str));
    }

    /* renamed from: J */
    public void mo39786J(C11940d dVar) {
        if (!(dVar instanceof C11942e.C11943a)) {
            dVar = C9908k.f18084d.mo42461h(dVar);
        }
        for (C9903h remove = this.f18051b.remove(dVar); remove != null; remove = remove.f18062c) {
            this.f18050a.remove(remove);
        }
    }

    /* renamed from: K */
    public int mo39787K() {
        return this.f18050a.size();
    }

    /* renamed from: d */
    public void mo39788d(String str, String str2) {
        if (str2 != null) {
            mo39789e(C9908k.f18084d.mo42460g(str), m24170k(str2));
        }
    }

    /* renamed from: e */
    public void mo39789e(C11940d dVar, C11940d dVar2) {
        if (dVar2 != null) {
            if (!(dVar instanceof C11942e.C11943a)) {
                dVar = C9908k.f18084d.mo42461h(dVar);
            }
            C11940d b1 = dVar.mo42421b1();
            if (!(dVar2 instanceof C11942e.C11943a) && C9907j.m24236i(C9908k.f18084d.mo42459f(b1))) {
                dVar2 = C9907j.f18080d.mo42461h(dVar2);
            }
            C11940d b12 = dVar2.mo42421b1();
            C9903h hVar = null;
            for (C9903h hVar2 = this.f18051b.get(b1); hVar2 != null; hVar2 = hVar2.f18062c) {
                hVar = hVar2;
            }
            C9903h hVar3 = new C9903h(b1, b12, (C9896a) null);
            this.f18050a.add(hVar3);
            if (hVar != null) {
                C9903h unused = hVar.f18062c = hVar3;
            } else {
                this.f18051b.put(b1, hVar3);
            }
        } else {
            throw new IllegalArgumentException("null value");
        }
    }

    /* renamed from: f */
    public void mo39790f(String str, String str2, String str3, String str4, long j, String str5, boolean z, boolean z2, int i) {
        boolean z3;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        long j2 = j;
        String str10 = str5;
        if (str6 == null || str.length() == 0) {
            throw new IllegalArgumentException("Bad cookie name");
        }
        StringBuilder sb = new StringBuilder(128);
        C9994m.m24703c(sb, str6, "\"\\\n\r\t\f\b%+ ;=");
        sb.append('=');
        String sb2 = sb.toString();
        if (str7 != null && str2.length() > 0) {
            C9994m.m24703c(sb, str7, "\"\\\n\r\t\f\b%+ ;=");
        }
        if (str10 != null && str5.length() > 0) {
            sb.append(";Comment=");
            C9994m.m24703c(sb, str10, "\"\\\n\r\t\f\b%+ ;=");
        }
        boolean z4 = true;
        if (str9 == null || str4.length() <= 0) {
            z3 = false;
        } else {
            sb.append(";Path=");
            if (str4.trim().startsWith("\"")) {
                sb.append(str9);
            } else {
                C9994m.m24703c(sb, str9, "\"\\\n\r\t\f\b%+ ;=");
            }
            z3 = true;
        }
        if (str8 == null || str3.length() <= 0) {
            z4 = false;
        } else {
            sb.append(";Domain=");
            C9994m.m24703c(sb, str8.toLowerCase(Locale.ENGLISH), "\"\\\n\r\t\f\b%+ ;=");
        }
        if (j2 >= 0) {
            sb.append(";Expires=");
            if (j2 == 0) {
                sb.append(f18044m);
            } else {
                m24172m(sb, System.currentTimeMillis() + (1000 * j2));
            }
            if (i > 0) {
                sb.append(";Max-Age=");
                sb.append(j2);
            }
        }
        if (z) {
            sb.append(";Secure");
        }
        if (z2) {
            sb.append(";HttpOnly");
        }
        String sb3 = sb.toString();
        C9903h r = m24174r("Set-Cookie");
        C9903h hVar = null;
        while (true) {
            if (r == null) {
                break;
            }
            String obj = r.f18061b == null ? null : r.f18061b.toString();
            if (obj != null && obj.startsWith(sb2)) {
                if (z4 || obj.contains("Domain")) {
                    if (z4) {
                        if (!obj.contains("Domain=" + str8)) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                if (!z3 && !obj.contains("Path")) {
                    break;
                } else if (z3) {
                    if (obj.contains("Path=" + str9)) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            hVar = r;
            r = r.f18062c;
        }
        this.f18050a.remove(r);
        if (hVar == null) {
            this.f18051b.put(C9908k.f18096p, r.f18062c);
        } else {
            C9903h unused = hVar.f18062c = r.f18062c;
        }
        mo39789e(C9908k.f18096p, new C11946h(sb3));
        mo39780D(C9908k.f18091k, f18043l);
    }

    /* renamed from: g */
    public void mo39791g(C9894g gVar) {
        mo39790f(gVar.mo39771d(), gVar.mo39773f(), gVar.mo39769b(), gVar.mo39772e(), (long) gVar.mo39770c(), gVar.mo39768a(), gVar.mo39776i(), gVar.mo39775h(), gVar.mo39774g());
    }

    /* renamed from: h */
    public void mo39792h() {
        this.f18050a.clear();
        this.f18051b.clear();
    }

    /* renamed from: i */
    public boolean mo39793i(String str) {
        return this.f18051b.containsKey(C9908k.f18084d.mo42460g(str));
    }

    /* renamed from: j */
    public boolean mo39794j(C11940d dVar) {
        return this.f18051b.containsKey(C9908k.f18084d.mo42461h(dVar));
    }

    /* renamed from: o */
    public C11940d mo39795o(C11940d dVar) {
        C9903h s = m24175s(dVar);
        if (s == null) {
            return null;
        }
        return s.f18061b;
    }

    /* renamed from: p */
    public long mo39796p(String str) {
        String L;
        C9903h r = m24174r(str);
        if (r == null || (L = m24166L(C11945g.m30568f(r.f18061b), (Map<String, String>) null)) == null) {
            return -1;
        }
        long a = f18041j.get().mo39821a(L);
        if (a != -1) {
            return a;
        }
        throw new IllegalArgumentException("Cannot convert date: " + L);
    }

    /* renamed from: q */
    public C9903h mo39797q(int i) {
        return this.f18050a.get(i);
    }

    /* renamed from: t */
    public Enumeration<String> mo39798t() {
        return new C9898c(this, Collections.enumeration(this.f18051b.keySet()));
    }

    public String toString() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < this.f18050a.size(); i++) {
                C9903h hVar = this.f18050a.get(i);
                if (hVar != null) {
                    String f = hVar.mo39823f();
                    if (f != null) {
                        stringBuffer.append(f);
                    }
                    stringBuffer.append(": ");
                    String h = hVar.mo39825h();
                    if (h != null) {
                        stringBuffer.append(h);
                    }
                    stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
                }
            }
            stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            return stringBuffer.toString();
        } catch (Exception e) {
            f18034c.mo36856j(e);
            return e.toString();
        }
    }

    /* renamed from: u */
    public Collection<String> mo39800u() {
        ArrayList arrayList = new ArrayList(this.f18050a.size());
        Iterator<C9903h> it = this.f18050a.iterator();
        while (it.hasNext()) {
            C9903h next = it.next();
            if (next != null) {
                arrayList.add(C11945g.m30568f(next.f18060a));
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    public long mo39801v(C11940d dVar) {
        C9903h s = m24175s(dVar);
        if (s == null) {
            return -1;
        }
        return s.mo39822e();
    }

    /* renamed from: w */
    public String mo39802w(String str) {
        C9903h r = m24174r(str);
        if (r == null) {
            return null;
        }
        return r.mo39825h();
    }

    /* renamed from: x */
    public String mo39803x(C11940d dVar) {
        C9903h s = m24175s(dVar);
        if (s == null) {
            return null;
        }
        return s.mo39825h();
    }

    /* renamed from: y */
    public Enumeration<String> mo39804y(String str) {
        C9903h r = m24174r(str);
        return r == null ? Collections.enumeration(Collections.emptyList()) : new C9899d(this, r);
    }

    /* renamed from: z */
    public Enumeration<String> mo39805z(C11940d dVar) {
        C9903h s = m24175s(dVar);
        return s == null ? Collections.enumeration(Collections.emptyList()) : new C9900e(this, s);
    }
}
