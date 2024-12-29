package org.eclipse.jetty.http;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.eclipse.jetty.util.C9995n;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;
import p225w5.C11942e;

/* renamed from: org.eclipse.jetty.http.r */
public class C9916r {

    /* renamed from: b */
    private static final C9003c f18143b = C9001b.m21450a(C9916r.class);

    /* renamed from: c */
    private static int f18144c = 15;

    /* renamed from: d */
    public static final C11942e f18145d;

    /* renamed from: e */
    public static final C11942e.C11943a f18146e;

    /* renamed from: f */
    public static final C11942e.C11943a f18147f;

    /* renamed from: g */
    public static final C11942e.C11943a f18148g;

    /* renamed from: h */
    public static final C11942e.C11943a f18149h;

    /* renamed from: i */
    public static final C11942e.C11943a f18150i;

    /* renamed from: j */
    public static final C11942e.C11943a f18151j;

    /* renamed from: k */
    public static final C11942e.C11943a f18152k;

    /* renamed from: l */
    public static final C11942e.C11943a f18153l;

    /* renamed from: m */
    public static final C11942e.C11943a f18154m;

    /* renamed from: n */
    public static final C11942e.C11943a f18155n;

    /* renamed from: o */
    public static final C11942e.C11943a f18156o;

    /* renamed from: p */
    public static final C11942e.C11943a f18157p;

    /* renamed from: q */
    private static final Map f18158q = new HashMap();

    /* renamed from: r */
    private static final Map f18159r = new HashMap();

    /* renamed from: a */
    private Map f18160a;

    static {
        C11942e eVar = new C11942e();
        f18145d = eVar;
        eVar.mo42454a("application/x-www-form-urlencoded", 1);
        eVar.mo42454a("message/http", 2);
        f18146e = eVar.mo42454a("multipart/byteranges", 3);
        f18147f = eVar.mo42454a("text/html", 4);
        f18148g = eVar.mo42454a("text/plain", 5);
        f18149h = eVar.mo42454a("text/xml", 6);
        f18150i = eVar.mo42454a("text/json", 7);
        f18151j = eVar.mo42454a("text/html;charset=ISO-8859-1", 8);
        f18152k = eVar.mo42454a("text/plain;charset=ISO-8859-1", 9);
        f18153l = eVar.mo42454a("text/xml;charset=ISO-8859-1", 10);
        f18154m = eVar.mo42454a("text/html;charset=UTF-8", 11);
        f18155n = eVar.mo42454a("text/plain;charset=UTF-8", 12);
        f18156o = eVar.mo42454a("text/xml;charset=UTF-8", 13);
        f18157p = eVar.mo42454a("text/json;charset=UTF-8", 14);
        eVar.mo42454a("text/html; charset=ISO-8859-1", 8);
        eVar.mo42454a("text/plain; charset=ISO-8859-1", 9);
        eVar.mo42454a("text/xml; charset=ISO-8859-1", 10);
        eVar.mo42454a("text/html; charset=UTF-8", 11);
        eVar.mo42454a("text/plain; charset=UTF-8", 12);
        eVar.mo42454a("text/xml; charset=UTF-8", 13);
        eVar.mo42454a("text/json; charset=UTF-8", 14);
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("org/eclipse/jetty/http/mime");
            Enumeration<String> keys = bundle.getKeys();
            while (keys.hasMoreElements()) {
                String nextElement = keys.nextElement();
                f18158q.put(C9995n.m24706b(nextElement), m24282c(bundle.getString(nextElement)));
            }
        } catch (MissingResourceException e) {
            C9003c cVar = f18143b;
            cVar.mo36847b(e.toString(), new Object[0]);
            cVar.mo36848c(e);
        }
        try {
            ResourceBundle bundle2 = ResourceBundle.getBundle("org/eclipse/jetty/http/encoding");
            Enumeration<String> keys2 = bundle2.getKeys();
            while (keys2.hasMoreElements()) {
                C11940d c = m24282c(keys2.nextElement());
                f18159r.put(c, bundle2.getString(c.toString()));
            }
        } catch (MissingResourceException e2) {
            C9003c cVar2 = f18143b;
            cVar2.mo36847b(e2.toString(), new Object[0]);
            cVar2.mo36848c(e2);
        }
        C11942e.C11943a aVar = f18147f;
        C11942e.C11943a aVar2 = f18151j;
        aVar.mo42465f("ISO-8859-1", aVar2);
        aVar.mo42465f("ISO_8859_1", aVar2);
        aVar.mo42465f("iso-8859-1", aVar2);
        C11942e.C11943a aVar3 = f18148g;
        C11942e.C11943a aVar4 = f18152k;
        aVar3.mo42465f("ISO-8859-1", aVar4);
        aVar3.mo42465f("ISO_8859_1", aVar4);
        aVar3.mo42465f("iso-8859-1", aVar4);
        C11942e.C11943a aVar5 = f18149h;
        C11942e.C11943a aVar6 = f18153l;
        aVar5.mo42465f("ISO-8859-1", aVar6);
        aVar5.mo42465f("ISO_8859_1", aVar6);
        aVar5.mo42465f("iso-8859-1", aVar6);
        C11942e.C11943a aVar7 = f18154m;
        aVar.mo42465f("UTF-8", aVar7);
        aVar.mo42465f("UTF8", aVar7);
        aVar.mo42465f("utf8", aVar7);
        aVar.mo42465f("utf-8", aVar7);
        C11942e.C11943a aVar8 = f18155n;
        aVar3.mo42465f("UTF-8", aVar8);
        aVar3.mo42465f("UTF8", aVar8);
        aVar3.mo42465f("utf8", aVar8);
        aVar3.mo42465f("utf-8", aVar8);
        C11942e.C11943a aVar9 = f18156o;
        aVar5.mo42465f("UTF-8", aVar9);
        aVar5.mo42465f("UTF8", aVar9);
        aVar5.mo42465f("utf8", aVar9);
        aVar5.mo42465f("utf-8", aVar9);
        C11942e.C11943a aVar10 = f18150i;
        C11942e.C11943a aVar11 = f18157p;
        aVar10.mo42465f("UTF-8", aVar11);
        aVar10.mo42465f("UTF8", aVar11);
        aVar10.mo42465f("utf8", aVar11);
        aVar10.mo42465f("utf-8", aVar11);
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
    public static java.lang.String m24281a(p225w5.C11940d r13) {
        /*
            boolean r0 = r13 instanceof p225w5.C11942e.C11943a
            java.lang.String r1 = "UTF-8"
            if (r0 == 0) goto L_0x0015
            r0 = r13
            w5.e$a r0 = (p225w5.C11942e.C11943a) r0
            int r0 = r0.mo42464e()
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
            int r0 = r13.mo42409L0()
            int r2 = r13.mo42416U0()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0021:
            r7 = 10
            if (r0 >= r2) goto L_0x00ab
            byte r8 = r13.mo42449W(r0)
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
            w5.e r2 = f18145d
            int r0 = r0 - r6
            w5.d r13 = r13.mo42445z(r6, r0)
            w5.d r13 = r2.mo42461h(r13)
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
            w5.e r2 = f18145d
            int r0 = r0 - r6
            w5.d r13 = r13.mo42445z(r6, r0)
            w5.d r13 = r2.mo42461h(r13)
            java.lang.String r13 = r13.toString(r1)
            return r13
        L_0x00bd:
            java.util.Map r0 = f18159r
            java.lang.Object r13 = r0.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.C9916r.m24281a(w5.d):java.lang.String");
    }

    /* renamed from: c */
    private static synchronized C11940d m24282c(String str) {
        C11942e.C11943a b;
        synchronized (C9916r.class) {
            C11942e eVar = f18145d;
            b = eVar.mo42455b(str);
            if (b == null) {
                int i = f18144c;
                f18144c = i + 1;
                b = eVar.mo42454a(str, i);
            }
        }
        return b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: w5.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p225w5.C11940d mo39860b(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0036
            r1 = -1
        L_0x0004:
            if (r0 != 0) goto L_0x0036
            int r1 = r1 + 1
            java.lang.String r2 = "."
            int r1 = r5.indexOf(r2, r1)
            if (r1 < 0) goto L_0x0036
            int r2 = r5.length()
            if (r1 < r2) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            int r2 = r1 + 1
            java.lang.String r2 = r5.substring(r2)
            java.lang.String r2 = org.eclipse.jetty.util.C9995n.m24706b(r2)
            java.util.Map r3 = r4.f18160a
            if (r3 == 0) goto L_0x002b
            java.lang.Object r0 = r3.get(r2)
            w5.d r0 = (p225w5.C11940d) r0
        L_0x002b:
            if (r0 != 0) goto L_0x0004
            java.util.Map r0 = f18158q
            java.lang.Object r0 = r0.get(r2)
            w5.d r0 = (p225w5.C11940d) r0
            goto L_0x0004
        L_0x0036:
            if (r0 != 0) goto L_0x0050
            java.util.Map r5 = r4.f18160a
            java.lang.String r1 = "*"
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r5.get(r1)
            r0 = r5
            w5.d r0 = (p225w5.C11940d) r0
        L_0x0045:
            if (r0 != 0) goto L_0x0050
            java.util.Map r5 = f18158q
            java.lang.Object r5 = r5.get(r1)
            r0 = r5
            w5.d r0 = (p225w5.C11940d) r0
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.C9916r.mo39860b(java.lang.String):w5.d");
    }
}
