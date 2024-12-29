package p164h.p165b.p166a.p237f.p239e;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import p164h.p165b.p166a.p237f.p238d.C11177a;
import p164h.p165b.p166a.p237f.p238d.C11178b;
import p164h.p165b.p166a.p237f.p238d.C11179c;
import p164h.p165b.p166a.p237f.p238d.C11182f;
import p164h.p165b.p166a.p237f.p238d.C11183g;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.p248s.C11321b;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p248s.C11338r;
import p164h.p165b.p166a.p240h.p252w.C11368g;
import p164h.p165b.p166a.p240h.p252w.C11374j;
import p164h.p257c.p261c.C11514c;

/* renamed from: h.b.a.f.e.j */
public class C11194j extends C11193i {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Logger f22259b = Logger.getLogger(C11191g.class.getName());

    /* renamed from: h.b.a.f.e.j$a */
    static /* synthetic */ class C11195a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22260a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                h.b.a.f.e.c[] r0 = p164h.p165b.p166a.p237f.p239e.C11187c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22260a = r0
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.name     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22260a     // Catch:{ NoSuchFieldError -> 0x001d }
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.f22242j     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22260a     // Catch:{ NoSuchFieldError -> 0x0028 }
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.relatedStateVariable     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22260a     // Catch:{ NoSuchFieldError -> 0x0033 }
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.retval     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22260a     // Catch:{ NoSuchFieldError -> 0x003e }
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.dataType     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22260a     // Catch:{ NoSuchFieldError -> 0x0049 }
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.defaultValue     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f22260a     // Catch:{ NoSuchFieldError -> 0x0054 }
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.f22250r     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f22260a     // Catch:{ NoSuchFieldError -> 0x0060 }
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.f22252t     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f22260a     // Catch:{ NoSuchFieldError -> 0x006c }
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.f22253u     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f22260a     // Catch:{ NoSuchFieldError -> 0x0078 }
                h.b.a.f.e.c r1 = p164h.p165b.p166a.p237f.p239e.C11187c.step     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p237f.p239e.C11194j.C11195a.<clinit>():void");
        }
    }

    /* renamed from: h.b.a.f.e.j$b */
    protected static class C11196b extends C11203i<C11178b> {

        /* renamed from: e */
        public static final C11187c f22261e = C11187c.f22241i;

        public C11196b(C11178b bVar, C11203i iVar) {
            super(bVar, iVar);
        }

        /* renamed from: f */
        public void mo35588f(C11187c cVar) {
            int i = C11195a.f22260a[cVar.ordinal()];
            if (i == 1) {
                ((C11178b) mo36435b()).f22147a = mo36434a();
            } else if (i == 2) {
                String a = mo36434a();
                try {
                    ((C11178b) mo36435b()).f22149c = C11321b.C11322a.valueOf(a.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                    Logger t = C11194j.f22259b;
                    t.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + a);
                    ((C11178b) mo36435b()).f22149c = C11321b.C11322a.IN;
                }
            } else if (i == 3) {
                ((C11178b) mo36435b()).f22148b = mo36434a();
            } else if (i == 4) {
                ((C11178b) mo36435b()).f22150d = true;
            }
        }

        /* renamed from: g */
        public boolean mo35589g(C11187c cVar) {
            return cVar.equals(f22261e);
        }
    }

    /* renamed from: h.b.a.f.e.j$c */
    protected static class C11197c extends C11203i<List<C11178b>> {

        /* renamed from: e */
        public static final C11187c f22262e = C11187c.f22240h;

        public C11197c(List<C11178b> list, C11203i iVar) {
            super(list, iVar);
        }

        /* renamed from: g */
        public boolean mo35589g(C11187c cVar) {
            return cVar.equals(f22262e);
        }

        /* renamed from: h */
        public void mo35590h(C11187c cVar, Attributes attributes) {
            if (cVar.equals(C11196b.f22261e)) {
                C11178b bVar = new C11178b();
                ((List) mo36435b()).add(bVar);
                new C11196b(bVar, this);
            }
        }
    }

    /* renamed from: h.b.a.f.e.j$d */
    protected static class C11198d extends C11203i<C11177a> {

        /* renamed from: e */
        public static final C11187c f22263e = C11187c.f22238f;

        public C11198d(C11177a aVar, C11203i iVar) {
            super(aVar, iVar);
        }

        /* renamed from: f */
        public void mo35588f(C11187c cVar) {
            if (C11195a.f22260a[cVar.ordinal()] == 1) {
                ((C11177a) mo36435b()).f22145a = mo36434a();
            }
        }

        /* renamed from: g */
        public boolean mo35589g(C11187c cVar) {
            return cVar.equals(f22263e);
        }

        /* renamed from: h */
        public void mo35590h(C11187c cVar, Attributes attributes) {
            if (cVar.equals(C11197c.f22262e)) {
                ArrayList arrayList = new ArrayList();
                ((C11177a) mo36435b()).f22146b = arrayList;
                new C11197c(arrayList, this);
            }
        }
    }

    /* renamed from: h.b.a.f.e.j$e */
    protected static class C11199e extends C11203i<List<C11177a>> {

        /* renamed from: e */
        public static final C11187c f22264e = C11187c.f22237e;

        public C11199e(List<C11177a> list, C11203i iVar) {
            super(list, iVar);
        }

        /* renamed from: g */
        public boolean mo35589g(C11187c cVar) {
            return cVar.equals(f22264e);
        }

        /* renamed from: h */
        public void mo35590h(C11187c cVar, Attributes attributes) {
            if (cVar.equals(C11198d.f22263e)) {
                C11177a aVar = new C11177a();
                ((List) mo36435b()).add(aVar);
                new C11198d(aVar, this);
            }
        }
    }

    /* renamed from: h.b.a.f.e.j$f */
    protected static class C11200f extends C11203i<List<String>> {

        /* renamed from: e */
        public static final C11187c f22265e = C11187c.f22249q;

        public C11200f(List<String> list, C11203i iVar) {
            super(list, iVar);
        }

        /* renamed from: f */
        public void mo35588f(C11187c cVar) {
            if (C11195a.f22260a[cVar.ordinal()] == 7) {
                ((List) mo36435b()).add(mo36434a());
            }
        }

        /* renamed from: g */
        public boolean mo35589g(C11187c cVar) {
            return cVar.equals(f22265e);
        }
    }

    /* renamed from: h.b.a.f.e.j$g */
    protected static class C11201g extends C11203i<C11179c> {

        /* renamed from: e */
        public static final C11187c f22266e = C11187c.f22251s;

        public C11201g(C11179c cVar, C11203i iVar) {
            super(cVar, iVar);
        }

        /* renamed from: f */
        public void mo35588f(C11187c cVar) {
            try {
                switch (C11195a.f22260a[cVar.ordinal()]) {
                    case 8:
                        ((C11179c) mo36435b()).f22151a = Long.valueOf(mo36434a());
                        return;
                    case 9:
                        ((C11179c) mo36435b()).f22152b = Long.valueOf(mo36434a());
                        return;
                    case 10:
                        ((C11179c) mo36435b()).f22153c = Long.valueOf(mo36434a());
                        return;
                    default:
                        return;
                }
            } catch (Exception unused) {
            }
        }

        /* renamed from: g */
        public boolean mo35589g(C11187c cVar) {
            return cVar.equals(f22266e);
        }
    }

    /* renamed from: h.b.a.f.e.j$h */
    protected static class C11202h extends C11203i<C11182f> {
        public C11202h(C11182f fVar, C11514c cVar) {
            super(fVar, cVar);
        }

        /* renamed from: h */
        public void mo35590h(C11187c cVar, Attributes attributes) {
            if (cVar.equals(C11199e.f22264e)) {
                ArrayList arrayList = new ArrayList();
                ((C11182f) mo36435b()).f22183f = arrayList;
                new C11199e(arrayList, this);
            }
            if (cVar.equals(C11205k.f22268e)) {
                ArrayList arrayList2 = new ArrayList();
                ((C11182f) mo36435b()).f22184g = arrayList2;
                new C11205k(arrayList2, this);
            }
        }
    }

    /* renamed from: h.b.a.f.e.j$i */
    protected static class C11203i<I> extends C11514c.C11516b<I> {
        public C11203i(I i, C11203i iVar) {
            super(i, (C11514c.C11516b) iVar);
        }

        public C11203i(I i, C11514c cVar) {
            super(i, cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo35591d(String str, String str2, String str3) {
            C11187c b = C11187c.m29133b(str2);
            return b != null && mo35589g(b);
        }

        public void endElement(String str, String str2, String str3) {
            super.endElement(str, str2, str3);
            C11187c b = C11187c.m29133b(str2);
            if (b != null) {
                mo35588f(b);
            }
        }

        /* renamed from: f */
        public void mo35588f(C11187c cVar) {
        }

        /* renamed from: g */
        public boolean mo35589g(C11187c cVar) {
            return false;
        }

        /* renamed from: h */
        public void mo35590h(C11187c cVar, Attributes attributes) {
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            super.startElement(str, str2, str3, attributes);
            C11187c b = C11187c.m29133b(str2);
            if (b != null) {
                mo35590h(b, attributes);
            }
        }
    }

    /* renamed from: h.b.a.f.e.j$j */
    protected static class C11204j extends C11203i<C11183g> {

        /* renamed from: e */
        public static final C11187c f22267e = C11187c.stateVariable;

        public C11204j(C11183g gVar, C11203i iVar) {
            super(gVar, iVar);
        }

        /* renamed from: f */
        public void mo35588f(C11187c cVar) {
            int i = C11195a.f22260a[cVar.ordinal()];
            if (i == 1) {
                ((C11183g) mo36435b()).f22185a = mo36434a();
            } else if (i == 5) {
                String a = mo36434a();
                C11374j.C11375a a2 = C11374j.C11375a.m29812a(a);
                ((C11183g) mo36435b()).f22186b = a2 != null ? a2.mo36078b() : new C11368g(a);
            } else if (i == 6) {
                ((C11183g) mo36435b()).f22187c = mo36434a();
            }
        }

        /* renamed from: g */
        public boolean mo35589g(C11187c cVar) {
            return cVar.equals(f22267e);
        }

        /* renamed from: h */
        public void mo35590h(C11187c cVar, Attributes attributes) {
            if (cVar.equals(C11200f.f22265e)) {
                ArrayList arrayList = new ArrayList();
                ((C11183g) mo36435b()).f22188d = arrayList;
                new C11200f(arrayList, this);
            }
            if (cVar.equals(C11201g.f22266e)) {
                C11179c cVar2 = new C11179c();
                ((C11183g) mo36435b()).f22189e = cVar2;
                new C11201g(cVar2, this);
            }
        }
    }

    /* renamed from: h.b.a.f.e.j$k */
    protected static class C11205k extends C11203i<List<C11183g>> {

        /* renamed from: e */
        public static final C11187c f22268e = C11187c.serviceStateTable;

        public C11205k(List<C11183g> list, C11203i iVar) {
            super(list, iVar);
        }

        /* renamed from: g */
        public boolean mo35589g(C11187c cVar) {
            return cVar.equals(f22268e);
        }

        /* renamed from: h */
        public void mo35590h(C11187c cVar, Attributes attributes) {
            if (cVar.equals(C11204j.f22267e)) {
                C11183g gVar = new C11183g();
                String value = attributes.getValue(C11186b.sendEvents.toString());
                gVar.f22190f = new C11338r(value != null && value.toUpperCase(Locale.ROOT).equals("YES"));
                ((List) mo36435b()).add(gVar);
                new C11204j(gVar, this);
            }
        }
    }

    /* renamed from: a */
    public <S extends C11335o> S mo35555a(S s, String str) {
        if (str == null || str.length() == 0) {
            throw new C11188d("Null or empty descriptor");
        }
        try {
            f22259b.fine("Reading service from XML descriptor");
            C11514c cVar = new C11514c();
            C11182f fVar = new C11182f();
            mo35583p(fVar, s);
            new C11202h(fVar, cVar);
            cVar.mo36432f(new InputSource(new StringReader(str.trim())));
            return fVar.mo35543a(s.mo35983d());
        } catch (C11223m e) {
            throw e;
        } catch (Exception e2) {
            throw new C11188d("Could not parse service descriptor: " + e2.toString(), e2);
        }
    }
}
