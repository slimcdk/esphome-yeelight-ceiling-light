package p164h.p211a.p212a.p216c;

import com.miot.service.manager.timer.TimerCodec;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
import org.apache.commons.p271io.IOUtils;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10931f;
import p164h.p211a.p212a.p217d.C10933g;
import p164h.p211a.p212a.p217d.C10934h;
import p164h.p211a.p212a.p217d.C10938k;
import p164h.p211a.p212a.p228h.C11132o;
import p164h.p211a.p212a.p228h.C11133p;
import p164h.p211a.p212a.p228h.C11137q;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.c.i */
public class C10897i {

    /* renamed from: c */
    private static final C11158c f21105c = C11156b.m29015a(C10897i.class);

    /* renamed from: d */
    public static final TimeZone f21106d = TimeZone.getTimeZone("GMT");

    /* renamed from: e */
    public static final C10933g f21107e = new C10933g("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f21108f = {"Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f21109g = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan"};

    /* renamed from: h */
    private static final ThreadLocal<C10903f> f21110h = new C10898a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f21111i = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss", "EEE MMM dd HH:mm:ss yyyy", "EEE, dd MMM yyyy HH:mm:ss", "EEE dd MMM yyyy HH:mm:ss zzz", "EEE dd MMM yyyy HH:mm:ss", "EEE MMM dd yyyy HH:mm:ss zzz", "EEE MMM dd yyyy HH:mm:ss", "EEE MMM-dd-yyyy HH:mm:ss zzz", "EEE MMM-dd-yyyy HH:mm:ss", "dd MMM yyyy HH:mm:ss zzz", "dd MMM yyyy HH:mm:ss", "dd-MMM-yy HH:mm:ss zzz", "dd-MMM-yy HH:mm:ss", "MMM dd HH:mm:ss yyyy zzz", "MMM dd HH:mm:ss yyyy", "EEE MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy zzz", "EEE, MMM dd HH:mm:ss yyyy", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss zzz", "EEE dd-MMM-yy HH:mm:ss"};

    /* renamed from: j */
    public static final String f21112j = m27449m(0);

    /* renamed from: k */
    public static final C10929e f21113k = new C10938k(f21112j);

    /* renamed from: l */
    public static final String f21114l = m27447k(0).trim();

    /* renamed from: m */
    private static ConcurrentMap<String, C10929e> f21115m = new ConcurrentHashMap();

    /* renamed from: n */
    private static int f21116n = Integer.getInteger("org.eclipse.jetty.http.HttpFields.CACHE", 2000).intValue();

    /* renamed from: o */
    private static final Float f21117o = new Float("1.0");

    /* renamed from: p */
    private static final Float f21118p = new Float("0.0");

    /* renamed from: q */
    private static final C11133p f21119q;

    /* renamed from: a */
    private final ArrayList<C10905h> f21120a = new ArrayList<>(20);

    /* renamed from: b */
    private final HashMap<C10929e, C10905h> f21121b = new HashMap<>(32);

    /* renamed from: h.a.a.c.i$a */
    static class C10898a extends ThreadLocal<C10903f> {
        C10898a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C10903f initialValue() {
            return new C10903f((C10898a) null);
        }
    }

    /* renamed from: h.a.a.c.i$b */
    static class C10899b extends ThreadLocal<C10904g> {
        C10899b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C10904g initialValue() {
            return new C10904g((C10898a) null);
        }
    }

    /* renamed from: h.a.a.c.i$c */
    class C10900c implements Enumeration<String> {

        /* renamed from: a */
        final /* synthetic */ Enumeration f21122a;

        C10900c(C10897i iVar, Enumeration enumeration) {
            this.f21122a = enumeration;
        }

        /* renamed from: a */
        public String nextElement() {
            return this.f21122a.nextElement().toString();
        }

        public boolean hasMoreElements() {
            return this.f21122a.hasMoreElements();
        }
    }

    /* renamed from: h.a.a.c.i$d */
    class C10901d implements Enumeration<String> {

        /* renamed from: a */
        C10905h f21123a = this.f21124b;

        /* renamed from: b */
        final /* synthetic */ C10905h f21124b;

        C10901d(C10897i iVar, C10905h hVar) {
            this.f21124b = hVar;
        }

        /* renamed from: a */
        public String nextElement() {
            C10905h hVar = this.f21123a;
            if (hVar != null) {
                this.f21123a = hVar.f21131c;
                return hVar.mo34503h();
            }
            throw new NoSuchElementException();
        }

        public boolean hasMoreElements() {
            return this.f21123a != null;
        }
    }

    /* renamed from: h.a.a.c.i$e */
    class C10902e implements Enumeration<String> {

        /* renamed from: a */
        C10905h f21125a = this.f21126b;

        /* renamed from: b */
        final /* synthetic */ C10905h f21126b;

        C10902e(C10897i iVar, C10905h hVar) {
            this.f21126b = hVar;
        }

        /* renamed from: a */
        public String nextElement() {
            C10905h hVar = this.f21125a;
            if (hVar != null) {
                this.f21125a = hVar.f21131c;
                return hVar.mo34503h();
            }
            throw new NoSuchElementException();
        }

        public boolean hasMoreElements() {
            return this.f21125a != null;
        }
    }

    /* renamed from: h.a.a.c.i$f */
    private static class C10903f {

        /* renamed from: a */
        private final StringBuilder f21127a;

        /* renamed from: b */
        private final GregorianCalendar f21128b;

        private C10903f() {
            this.f21127a = new StringBuilder(32);
            this.f21128b = new GregorianCalendar(C10897i.f21106d);
        }

        /* synthetic */ C10903f(C10898a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo34498a(StringBuilder sb, long j) {
            this.f21128b.setTimeInMillis(j);
            int i = this.f21128b.get(7);
            int i2 = this.f21128b.get(5);
            int i3 = this.f21128b.get(2);
            int i4 = this.f21128b.get(1) % 10000;
            int i5 = (int) ((j / 1000) % 86400);
            int i6 = i5 % 60;
            int i7 = i5 / 60;
            sb.append(C10897i.f21108f[i]);
            sb.append(',');
            sb.append(' ');
            C11137q.m28918a(sb, i2);
            sb.append('-');
            sb.append(C10897i.f21109g[i3]);
            sb.append('-');
            C11137q.m28918a(sb, i4 / 100);
            C11137q.m28918a(sb, i4 % 100);
            sb.append(' ');
            C11137q.m28918a(sb, i7 / 60);
            sb.append(':');
            C11137q.m28918a(sb, i7 % 60);
            sb.append(':');
            C11137q.m28918a(sb, i6);
            sb.append(" GMT");
        }

        /* renamed from: b */
        public String mo34499b(long j) {
            this.f21127a.setLength(0);
            this.f21128b.setTimeInMillis(j);
            int i = this.f21128b.get(7);
            int i2 = this.f21128b.get(5);
            int i3 = this.f21128b.get(2);
            int i4 = this.f21128b.get(1);
            int i5 = this.f21128b.get(11);
            int i6 = this.f21128b.get(12);
            int i7 = this.f21128b.get(13);
            this.f21127a.append(C10897i.f21108f[i]);
            this.f21127a.append(',');
            this.f21127a.append(' ');
            C11137q.m28918a(this.f21127a, i2);
            this.f21127a.append(' ');
            this.f21127a.append(C10897i.f21109g[i3]);
            this.f21127a.append(' ');
            C11137q.m28918a(this.f21127a, i4 / 100);
            C11137q.m28918a(this.f21127a, i4 % 100);
            this.f21127a.append(' ');
            C11137q.m28918a(this.f21127a, i5);
            this.f21127a.append(':');
            C11137q.m28918a(this.f21127a, i6);
            this.f21127a.append(':');
            C11137q.m28918a(this.f21127a, i7);
            this.f21127a.append(" GMT");
            return this.f21127a.toString();
        }
    }

    /* renamed from: h.a.a.c.i$g */
    private static class C10904g {
        private C10904g() {
            SimpleDateFormat[] simpleDateFormatArr = new SimpleDateFormat[C10897i.f21111i.length];
        }

        /* synthetic */ C10904g(C10898a aVar) {
            this();
        }
    }

    /* renamed from: h.a.a.c.i$h */
    public static final class C10905h {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C10929e f21129a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C10929e f21130b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10905h f21131c;

        private C10905h(C10929e eVar, C10929e eVar2) {
            this.f21129a = eVar;
            this.f21130b = eVar2;
            this.f21131c = null;
        }

        /* synthetic */ C10905h(C10929e eVar, C10929e eVar2, C10898a aVar) {
            this(eVar, eVar2);
        }

        /* renamed from: e */
        public long mo34500e() {
            return C10934h.m27673i(this.f21130b);
        }

        /* renamed from: f */
        public String mo34501f() {
            return C10934h.m27670f(this.f21129a);
        }

        /* renamed from: g */
        public int mo34502g() {
            return C10910l.f21152d.mo34616f(this.f21129a);
        }

        /* renamed from: h */
        public String mo34503h() {
            return C10934h.m27670f(this.f21130b);
        }

        /* renamed from: i */
        public C10929e mo34504i() {
            return this.f21130b;
        }

        /* renamed from: j */
        public int mo34505j() {
            return C10909k.f21149d.mo34616f(this.f21130b);
        }

        /* renamed from: k */
        public void mo34506k(C10929e eVar) {
            C10929e eVar2 = this.f21129a;
            int i = -1;
            if ((eVar2 instanceof C10931f.C10932a ? ((C10931f.C10932a) eVar2).mo34621e() : -1) >= 0) {
                eVar.mo34567Z(this.f21129a);
            } else {
                int index = this.f21129a.getIndex();
                int S0 = this.f21129a.mo34562S0();
                while (index < S0) {
                    int i2 = index + 1;
                    byte X = this.f21129a.mo34606X(index);
                    if (!(X == 10 || X == 13 || X == 58)) {
                        eVar.mo34560Q0(X);
                    }
                    index = i2;
                }
            }
            eVar.mo34560Q0((byte) 58);
            eVar.mo34560Q0((byte) 32);
            C10929e eVar3 = this.f21130b;
            if (eVar3 instanceof C10931f.C10932a) {
                i = ((C10931f.C10932a) eVar3).mo34621e();
            }
            C10929e eVar4 = this.f21130b;
            if (i >= 0) {
                eVar.mo34567Z(eVar4);
            } else {
                int index2 = eVar4.getIndex();
                int S02 = this.f21130b.mo34562S0();
                while (index2 < S02) {
                    int i3 = index2 + 1;
                    byte X2 = this.f21130b.mo34606X(index2);
                    if (!(X2 == 10 || X2 == 13)) {
                        eVar.mo34560Q0(X2);
                    }
                    index2 = i3;
                }
            }
            C10934h.m27667c(eVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(mo34501f());
            sb.append("=");
            sb.append(this.f21130b);
            sb.append(this.f21131c == null ? "" : "->");
            sb.append("]");
            return sb.toString();
        }
    }

    static {
        f21106d.setID("GMT");
        f21107e.mo35360e(f21106d);
        new C10899b();
        C11133p pVar = new C11133p();
        f21119q = pVar;
        pVar.mo35419d((String) null, f21117o);
        f21119q.mo35419d("1.0", f21117o);
        f21119q.mo35419d(TimerCodec.ENABLE, f21117o);
        f21119q.mo35419d("0.9", new Float("0.9"));
        f21119q.mo35419d("0.8", new Float("0.8"));
        f21119q.mo35419d("0.7", new Float("0.7"));
        f21119q.mo35419d("0.66", new Float("0.66"));
        f21119q.mo35419d("0.6", new Float("0.6"));
        f21119q.mo35419d("0.5", new Float("0.5"));
        f21119q.mo35419d("0.4", new Float("0.4"));
        f21119q.mo35419d("0.33", new Float("0.33"));
        f21119q.mo35419d("0.3", new Float("0.3"));
        f21119q.mo35419d("0.2", new Float("0.2"));
        f21119q.mo35419d("0.1", new Float("0.1"));
        f21119q.mo35419d(TimerCodec.DISENABLE, f21118p);
        f21119q.mo35419d("0.0", f21118p);
    }

    /* renamed from: J */
    public static String m27442J(String str, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            return str;
        }
        if (map != null) {
            C11132o oVar = new C11132o(str.substring(indexOf), ";", false, true);
            while (oVar.hasMoreTokens()) {
                C11132o oVar2 = new C11132o(oVar.nextToken(), "= ");
                if (oVar2.hasMoreTokens()) {
                    map.put(oVar2.nextToken(), oVar2.hasMoreTokens() ? oVar2.nextToken() : null);
                }
            }
        }
        return str.substring(0, indexOf).trim();
    }

    /* renamed from: j */
    private C10929e m27446j(String str) {
        C10929e eVar = (C10929e) f21115m.get(str);
        if (eVar != null) {
            return eVar;
        }
        try {
            C10938k kVar = new C10938k(str, "ISO-8859-1");
            if (f21116n <= 0) {
                return kVar;
            }
            if (f21115m.size() > f21116n) {
                f21115m.clear();
            }
            C10929e putIfAbsent = f21115m.putIfAbsent(str, kVar);
            return putIfAbsent != null ? putIfAbsent : kVar;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: k */
    public static String m27447k(long j) {
        StringBuilder sb = new StringBuilder(28);
        m27448l(sb, j);
        return sb.toString();
    }

    /* renamed from: l */
    public static void m27448l(StringBuilder sb, long j) {
        f21110h.get().mo34498a(sb, j);
    }

    /* renamed from: m */
    public static String m27449m(long j) {
        return f21110h.get().mo34499b(j);
    }

    /* renamed from: p */
    private C10905h m27450p(String str) {
        return this.f21121b.get(C10910l.f21152d.mo34617g(str));
    }

    /* renamed from: q */
    private C10905h m27451q(C10929e eVar) {
        return this.f21121b.get(C10910l.f21152d.mo34618h(eVar));
    }

    /* renamed from: A */
    public void mo34458A(C10929e eVar, String str) {
        mo34459B(C10910l.f21152d.mo34618h(eVar), m27446j(str));
    }

    /* renamed from: B */
    public void mo34459B(C10929e eVar, C10929e eVar2) {
        mo34465H(eVar);
        if (eVar2 != null) {
            if (!(eVar instanceof C10931f.C10932a)) {
                eVar = C10910l.f21152d.mo34618h(eVar);
            }
            if (!(eVar2 instanceof C10931f.C10932a)) {
                eVar2 = C10909k.f21149d.mo34618h(eVar2).mo34566Y0();
            }
            C10905h hVar = new C10905h(eVar, eVar2, (C10898a) null);
            this.f21120a.add(hVar);
            this.f21121b.put(eVar, hVar);
        }
    }

    /* renamed from: C */
    public void mo34460C(String str, long j) {
        mo34461D(C10910l.f21152d.mo34617g(str), j);
    }

    /* renamed from: D */
    public void mo34461D(C10929e eVar, long j) {
        mo34459B(eVar, new C10938k(m27449m(j)));
    }

    /* renamed from: E */
    public void mo34462E(String str, long j) {
        mo34459B(C10910l.f21152d.mo34617g(str), C10934h.m27671g(j));
    }

    /* renamed from: F */
    public void mo34463F(C10929e eVar, long j) {
        mo34459B(eVar, C10934h.m27671g(j));
    }

    /* renamed from: G */
    public void mo34464G(String str) {
        mo34465H(C10910l.f21152d.mo34617g(str));
    }

    /* renamed from: H */
    public void mo34465H(C10929e eVar) {
        if (!(eVar instanceof C10931f.C10932a)) {
            eVar = C10910l.f21152d.mo34618h(eVar);
        }
        for (C10905h remove = this.f21121b.remove(eVar); remove != null; remove = remove.f21131c) {
            this.f21120a.remove(remove);
        }
    }

    /* renamed from: I */
    public int mo34466I() {
        return this.f21120a.size();
    }

    /* renamed from: d */
    public void mo34467d(String str, String str2) {
        if (str2 != null) {
            mo34468e(C10910l.f21152d.mo34617g(str), m27446j(str2));
        }
    }

    /* renamed from: e */
    public void mo34468e(C10929e eVar, C10929e eVar2) {
        if (eVar2 != null) {
            if (!(eVar instanceof C10931f.C10932a)) {
                eVar = C10910l.f21152d.mo34618h(eVar);
            }
            C10929e Y0 = eVar.mo34566Y0();
            if (!(eVar2 instanceof C10931f.C10932a) && C10909k.m27509i(C10910l.f21152d.mo34616f(Y0))) {
                eVar2 = C10909k.f21149d.mo34618h(eVar2);
            }
            C10929e Y02 = eVar2.mo34566Y0();
            C10905h hVar = null;
            for (C10905h hVar2 = this.f21121b.get(Y0); hVar2 != null; hVar2 = hVar2.f21131c) {
                hVar = hVar2;
            }
            C10905h hVar3 = new C10905h(Y0, Y02, (C10898a) null);
            this.f21120a.add(hVar3);
            if (hVar != null) {
                C10905h unused = hVar.f21131c = hVar3;
            } else {
                this.f21121b.put(Y0, hVar3);
            }
        } else {
            throw new IllegalArgumentException("null value");
        }
    }

    /* renamed from: f */
    public void mo34469f(String str, String str2, String str3, String str4, long j, String str5, boolean z, boolean z2, int i) {
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
        C11132o.m28908c(sb, str6, "\"\\\n\r\t\f\b%+ ;=");
        sb.append('=');
        String sb2 = sb.toString();
        if (str7 != null && str2.length() > 0) {
            C11132o.m28908c(sb, str7, "\"\\\n\r\t\f\b%+ ;=");
        }
        if (str10 != null && str5.length() > 0) {
            sb.append(";Comment=");
            C11132o.m28908c(sb, str10, "\"\\\n\r\t\f\b%+ ;=");
        }
        boolean z4 = true;
        if (str9 == null || str4.length() <= 0) {
            z3 = false;
        } else {
            sb.append(";Path=");
            if (str4.trim().startsWith("\"")) {
                sb.append(str9);
            } else {
                C11132o.m28908c(sb, str9, "\"\\\n\r\t\f\b%+ ;=");
            }
            z3 = true;
        }
        if (str8 == null || str3.length() <= 0) {
            z4 = false;
        } else {
            sb.append(";Domain=");
            C11132o.m28908c(sb, str8.toLowerCase(Locale.ENGLISH), "\"\\\n\r\t\f\b%+ ;=");
        }
        if (j2 >= 0) {
            sb.append(";Expires=");
            if (j2 == 0) {
                sb.append(f21114l);
            } else {
                m27448l(sb, System.currentTimeMillis() + (1000 * j2));
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
        C10905h p = m27450p("Set-Cookie");
        C10905h hVar = null;
        while (true) {
            if (p == null) {
                break;
            }
            String obj = p.f21130b == null ? null : p.f21130b.toString();
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
            hVar = p;
            p = p.f21131c;
        }
        this.f21120a.remove(p);
        if (hVar == null) {
            this.f21121b.put(C10910l.f21162n, p.f21131c);
        } else {
            C10905h unused = hVar.f21131c = p.f21131c;
        }
        mo34468e(C10910l.f21162n, new C10938k(sb3));
        mo34459B(C10910l.f21158j, f21113k);
    }

    /* renamed from: g */
    public void mo34470g(C10895g gVar) {
        mo34469f(gVar.mo34449d(), gVar.mo34451f(), gVar.mo34447b(), gVar.mo34450e(), (long) gVar.mo34448c(), gVar.mo34446a(), gVar.mo34454i(), gVar.mo34453h(), gVar.mo34452g());
    }

    /* renamed from: h */
    public void mo34471h() {
        this.f21120a.clear();
        this.f21121b.clear();
    }

    /* renamed from: i */
    public boolean mo34472i(C10929e eVar) {
        return this.f21121b.containsKey(C10910l.f21152d.mo34618h(eVar));
    }

    /* renamed from: n */
    public C10929e mo34473n(C10929e eVar) {
        C10905h q = m27451q(eVar);
        if (q == null) {
            return null;
        }
        return q.f21130b;
    }

    /* renamed from: o */
    public C10905h mo34474o(int i) {
        return this.f21120a.get(i);
    }

    /* renamed from: r */
    public Enumeration<String> mo34475r() {
        return new C10900c(this, Collections.enumeration(this.f21121b.keySet()));
    }

    /* renamed from: s */
    public Collection<String> mo34476s() {
        ArrayList arrayList = new ArrayList(this.f21120a.size());
        Iterator<C10905h> it = this.f21120a.iterator();
        while (it.hasNext()) {
            C10905h next = it.next();
            if (next != null) {
                arrayList.add(C10934h.m27670f(next.f21129a));
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    public long mo34477t(C10929e eVar) {
        C10905h q = m27451q(eVar);
        if (q == null) {
            return -1;
        }
        return q.mo34500e();
    }

    public String toString() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < this.f21120a.size(); i++) {
                C10905h hVar = this.f21120a.get(i);
                if (hVar != null) {
                    String f = hVar.mo34501f();
                    if (f != null) {
                        stringBuffer.append(f);
                    }
                    stringBuffer.append(": ");
                    String h = hVar.mo34503h();
                    if (h != null) {
                        stringBuffer.append(h);
                    }
                    stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
                }
            }
            stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            return stringBuffer.toString();
        } catch (Exception e) {
            f21105c.mo35495k(e);
            return e.toString();
        }
    }

    /* renamed from: u */
    public String mo34479u(String str) {
        C10905h p = m27450p(str);
        if (p == null) {
            return null;
        }
        return p.mo34503h();
    }

    /* renamed from: v */
    public String mo34480v(C10929e eVar) {
        C10905h q = m27451q(eVar);
        if (q == null) {
            return null;
        }
        return q.mo34503h();
    }

    /* renamed from: w */
    public Enumeration<String> mo34481w(String str) {
        C10905h p = m27450p(str);
        return p == null ? Collections.enumeration(Collections.emptyList()) : new C10901d(this, p);
    }

    /* renamed from: x */
    public Enumeration<String> mo34482x(C10929e eVar) {
        C10905h q = m27451q(eVar);
        return q == null ? Collections.enumeration(Collections.emptyList()) : new C10902e(this, q);
    }

    /* renamed from: y */
    public Collection<String> mo34483y(String str) {
        C10905h p = m27450p(str);
        if (p == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (p != null) {
            arrayList.add(p.mo34503h());
            p = p.f21131c;
        }
        return arrayList;
    }

    /* renamed from: z */
    public void mo34484z(String str, String str2) {
        if (str2 == null) {
            mo34464G(str);
        } else {
            mo34459B(C10910l.f21152d.mo34617g(str), m27446j(str2));
        }
    }
}
