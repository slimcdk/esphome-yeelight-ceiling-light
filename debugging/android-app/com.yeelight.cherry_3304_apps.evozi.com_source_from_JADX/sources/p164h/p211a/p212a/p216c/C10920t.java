package p164h.p211a.p212a.p216c;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10931f;
import p164h.p211a.p212a.p228h.C11137q;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.c.t */
public class C10920t {

    /* renamed from: a */
    private static final C11158c f21260a = C11156b.m29015a(C10920t.class);

    /* renamed from: b */
    private static int f21261b = 15;

    /* renamed from: c */
    public static final C10931f f21262c;

    /* renamed from: d */
    public static final C10931f.C10932a f21263d = f21262c.mo34611a("multipart/byteranges", 3);

    /* renamed from: e */
    public static final C10931f.C10932a f21264e = f21262c.mo34611a("text/html", 4);

    /* renamed from: f */
    public static final C10931f.C10932a f21265f = f21262c.mo34611a("text/plain", 5);

    /* renamed from: g */
    public static final C10931f.C10932a f21266g = f21262c.mo34611a("text/xml", 6);

    /* renamed from: h */
    public static final C10931f.C10932a f21267h = f21262c.mo34611a("text/json", 7);

    /* renamed from: i */
    public static final C10931f.C10932a f21268i = f21262c.mo34611a("text/html;charset=ISO-8859-1", 8);

    /* renamed from: j */
    public static final C10931f.C10932a f21269j = f21262c.mo34611a("text/plain;charset=ISO-8859-1", 9);

    /* renamed from: k */
    public static final C10931f.C10932a f21270k = f21262c.mo34611a("text/xml;charset=ISO-8859-1", 10);

    /* renamed from: l */
    public static final C10931f.C10932a f21271l = f21262c.mo34611a("text/html;charset=UTF-8", 11);

    /* renamed from: m */
    public static final C10931f.C10932a f21272m = f21262c.mo34611a("text/plain;charset=UTF-8", 12);

    /* renamed from: n */
    public static final C10931f.C10932a f21273n = f21262c.mo34611a("text/xml;charset=UTF-8", 13);

    /* renamed from: o */
    public static final C10931f.C10932a f21274o = f21262c.mo34611a("text/json;charset=UTF-8", 14);

    /* renamed from: p */
    private static final Map f21275p = new HashMap();

    /* renamed from: q */
    private static final Map f21276q = new HashMap();

    static {
        C10931f fVar = new C10931f();
        f21262c = fVar;
        fVar.mo34611a("application/x-www-form-urlencoded", 1);
        f21262c.mo34611a("message/http", 2);
        f21262c.mo34611a("text/html; charset=ISO-8859-1", 8);
        f21262c.mo34611a("text/plain; charset=ISO-8859-1", 9);
        f21262c.mo34611a("text/xml; charset=ISO-8859-1", 10);
        f21262c.mo34611a("text/html; charset=UTF-8", 11);
        f21262c.mo34611a("text/plain; charset=UTF-8", 12);
        f21262c.mo34611a("text/xml; charset=UTF-8", 13);
        f21262c.mo34611a("text/json; charset=UTF-8", 14);
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("org/eclipse/jetty/http/mime");
            Enumeration<String> keys = bundle.getKeys();
            while (keys.hasMoreElements()) {
                String nextElement = keys.nextElement();
                f21275p.put(C11137q.m28919b(nextElement), m27559b(bundle.getString(nextElement)));
            }
        } catch (MissingResourceException e) {
            f21260a.mo35486b(e.toString(), new Object[0]);
            f21260a.mo35487c(e);
        }
        try {
            ResourceBundle bundle2 = ResourceBundle.getBundle("org/eclipse/jetty/http/encoding");
            Enumeration<String> keys2 = bundle2.getKeys();
            while (keys2.hasMoreElements()) {
                C10929e b = m27559b(keys2.nextElement());
                f21276q.put(b, bundle2.getString(b.toString()));
            }
        } catch (MissingResourceException e2) {
            f21260a.mo35486b(e2.toString(), new Object[0]);
            f21260a.mo35487c(e2);
        }
        f21264e.mo34622f("ISO-8859-1", f21268i);
        f21264e.mo34622f("ISO_8859_1", f21268i);
        f21264e.mo34622f("iso-8859-1", f21268i);
        f21265f.mo34622f("ISO-8859-1", f21269j);
        f21265f.mo34622f("ISO_8859_1", f21269j);
        f21265f.mo34622f("iso-8859-1", f21269j);
        f21266g.mo34622f("ISO-8859-1", f21270k);
        f21266g.mo34622f("ISO_8859_1", f21270k);
        f21266g.mo34622f("iso-8859-1", f21270k);
        f21264e.mo34622f("UTF-8", f21271l);
        f21264e.mo34622f("UTF8", f21271l);
        f21264e.mo34622f("utf8", f21271l);
        f21264e.mo34622f("utf-8", f21271l);
        f21265f.mo34622f("UTF-8", f21272m);
        f21265f.mo34622f("UTF8", f21272m);
        f21265f.mo34622f("utf8", f21272m);
        f21265f.mo34622f("utf-8", f21272m);
        f21266g.mo34622f("UTF-8", f21273n);
        f21266g.mo34622f("UTF8", f21273n);
        f21266g.mo34622f("utf8", f21273n);
        f21266g.mo34622f("utf-8", f21273n);
        f21267h.mo34622f("UTF-8", f21274o);
        f21267h.mo34622f("UTF8", f21274o);
        f21267h.mo34622f("utf8", f21274o);
        f21267h.mo34622f("utf-8", f21274o);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a2, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00a7, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m27558a(p164h.p211a.p212a.p217d.C10929e r13) {
        /*
            boolean r0 = r13 instanceof p164h.p211a.p212a.p217d.C10931f.C10932a
            java.lang.String r1 = "UTF-8"
            if (r0 == 0) goto L_0x0015
            r0 = r13
            h.a.a.d.f$a r0 = (p164h.p211a.p212a.p217d.C10931f.C10932a) r0
            int r0 = r0.mo34621e()
            switch(r0) {
                case 8: goto L_0x0012;
                case 9: goto L_0x0012;
                case 10: goto L_0x0012;
                case 11: goto L_0x0011;
                case 12: goto L_0x0011;
                case 13: goto L_0x0011;
                case 14: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0015
        L_0x0011:
            return r1
        L_0x0012:
            java.lang.String r13 = "ISO-8859-1"
            return r13
        L_0x0015:
            int r0 = r13.getIndex()
            int r2 = r13.mo34562S0()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0021:
            r7 = 10
            if (r0 >= r2) goto L_0x00ab
            byte r8 = r13.mo34606X(r0)
            r9 = 34
            r10 = 1
            if (r5 == 0) goto L_0x0035
            if (r4 == r7) goto L_0x0035
            if (r9 != r8) goto L_0x00a7
            r5 = 0
            goto L_0x00a7
        L_0x0035:
            r11 = 59
            r12 = 32
            switch(r4) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x0097;
                case 2: goto L_0x008f;
                case 3: goto L_0x0089;
                case 4: goto L_0x0083;
                case 5: goto L_0x007d;
                case 6: goto L_0x0077;
                case 7: goto L_0x0070;
                case 8: goto L_0x0066;
                case 9: goto L_0x0058;
                case 10: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x00a7
        L_0x003e:
            if (r5 != 0) goto L_0x0044
            if (r11 == r8) goto L_0x0048
            if (r12 == r8) goto L_0x0048
        L_0x0044:
            if (r5 == 0) goto L_0x00a7
            if (r9 != r8) goto L_0x00a7
        L_0x0048:
            h.a.a.d.f r2 = f21262c
            int r0 = r0 - r6
            h.a.a.d.e r13 = r13.mo34582i(r6, r0)
            h.a.a.d.e r13 = r2.mo34618h(r13)
            java.lang.String r13 = r13.toString(r1)
            return r13
        L_0x0058:
            if (r12 != r8) goto L_0x005b
            goto L_0x00a7
        L_0x005b:
            if (r9 != r8) goto L_0x0062
            int r6 = r0 + 1
            r4 = 10
            goto L_0x00a2
        L_0x0062:
            r6 = r0
            r4 = 10
            goto L_0x00a7
        L_0x0066:
            r7 = 61
            if (r7 != r8) goto L_0x006d
            r4 = 9
            goto L_0x00a7
        L_0x006d:
            if (r12 == r8) goto L_0x00a7
            goto L_0x0095
        L_0x0070:
            r4 = 116(0x74, float:1.63E-43)
            if (r4 != r8) goto L_0x0095
            r4 = 8
            goto L_0x00a7
        L_0x0077:
            r4 = 101(0x65, float:1.42E-43)
            if (r4 != r8) goto L_0x0095
            r4 = 7
            goto L_0x00a7
        L_0x007d:
            r4 = 115(0x73, float:1.61E-43)
            if (r4 != r8) goto L_0x0095
            r4 = 6
            goto L_0x00a7
        L_0x0083:
            r4 = 114(0x72, float:1.6E-43)
            if (r4 != r8) goto L_0x0095
            r4 = 5
            goto L_0x00a7
        L_0x0089:
            r4 = 97
            if (r4 != r8) goto L_0x0095
            r4 = 4
            goto L_0x00a7
        L_0x008f:
            r4 = 104(0x68, float:1.46E-43)
            if (r4 != r8) goto L_0x0095
            r4 = 3
            goto L_0x00a7
        L_0x0095:
            r4 = 0
            goto L_0x00a7
        L_0x0097:
            r7 = 99
            if (r7 != r8) goto L_0x009d
            r4 = 2
            goto L_0x00a7
        L_0x009d:
            if (r12 == r8) goto L_0x00a7
            goto L_0x0095
        L_0x00a0:
            if (r9 != r8) goto L_0x00a4
        L_0x00a2:
            r5 = 1
            goto L_0x00a7
        L_0x00a4:
            if (r11 != r8) goto L_0x00a7
            r4 = 1
        L_0x00a7:
            int r0 = r0 + 1
            goto L_0x0021
        L_0x00ab:
            if (r4 != r7) goto L_0x00bd
            h.a.a.d.f r2 = f21262c
            int r0 = r0 - r6
            h.a.a.d.e r13 = r13.mo34582i(r6, r0)
            h.a.a.d.e r13 = r2.mo34618h(r13)
            java.lang.String r13 = r13.toString(r1)
            return r13
        L_0x00bd:
            java.util.Map r0 = f21276q
            java.lang.Object r13 = r0.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p216c.C10920t.m27558a(h.a.a.d.e):java.lang.String");
    }

    /* renamed from: b */
    private static synchronized C10929e m27559b(String str) {
        C10931f.C10932a b;
        synchronized (C10920t.class) {
            b = f21262c.mo34612b(str);
            if (b == null) {
                C10931f fVar = f21262c;
                int i = f21261b;
                f21261b = i + 1;
                b = fVar.mo34611a(str, i);
            }
        }
        return b;
    }
}
