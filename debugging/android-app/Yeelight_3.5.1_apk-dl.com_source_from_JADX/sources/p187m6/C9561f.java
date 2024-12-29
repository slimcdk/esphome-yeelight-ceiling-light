package p187m6;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import org.fourthline.cling.binding.xml.Descriptor$Service$ATTRIBUTE;
import org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.types.C10085g;
import org.fourthline.cling.model.types.Datatype;
import org.seamless.xml.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import p183l6.C9535a;
import p183l6.C9536b;
import p183l6.C9537c;
import p183l6.C9540f;
import p183l6.C9541g;
import p214t6.C10411k;

/* renamed from: m6.f */
public class C9561f extends C9560e {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Logger f17459b = Logger.getLogger(C9558c.class.getName());

    /* renamed from: m6.f$a */
    static /* synthetic */ class C9562a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17460a;

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
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT[] r0 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17460a = r0
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.name     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17460a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.direction     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17460a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.relatedStateVariable     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17460a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.retval     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17460a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.dataType     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17460a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.defaultValue     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f17460a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.allowedValue     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f17460a     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.minimum     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f17460a     // Catch:{ NoSuchFieldError -> 0x006c }
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.maximum     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f17460a     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT r1 = org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT.step     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p187m6.C9561f.C9562a.<clinit>():void");
        }
    }

    /* renamed from: m6.f$b */
    protected static class C9563b extends C9570i<C9536b> {

        /* renamed from: e */
        public static final Descriptor$Service$ELEMENT f17461e = Descriptor$Service$ELEMENT.argument;

        public C9563b(C9536b bVar, C9570i iVar) {
            super(bVar, iVar);
        }

        /* renamed from: f */
        public void mo38573f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            int i = C9562a.f17460a[descriptor$Service$ELEMENT.ordinal()];
            if (i == 1) {
                ((C9536b) mo41611b()).f17371a = mo41610a();
            } else if (i == 2) {
                String a = mo41610a();
                try {
                    ((C9536b) mo41611b()).f17373c = ActionArgument.Direction.valueOf(a.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                    Logger t = C9561f.f17459b;
                    t.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + a);
                    ((C9536b) mo41611b()).f17373c = ActionArgument.Direction.IN;
                }
            } else if (i == 3) {
                ((C9536b) mo41611b()).f17372b = mo41610a();
            } else if (i == 4) {
                ((C9536b) mo41611b()).f17374d = true;
            }
        }

        /* renamed from: g */
        public boolean mo38574g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f17461e);
        }
    }

    /* renamed from: m6.f$c */
    protected static class C9564c extends C9570i<List<C9536b>> {

        /* renamed from: e */
        public static final Descriptor$Service$ELEMENT f17462e = Descriptor$Service$ELEMENT.argumentList;

        public C9564c(List<C9536b> list, C9570i iVar) {
            super(list, iVar);
        }

        /* renamed from: g */
        public boolean mo38574g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f17462e);
        }

        /* renamed from: h */
        public void mo38575h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) {
            if (descriptor$Service$ELEMENT.equals(C9563b.f17461e)) {
                C9536b bVar = new C9536b();
                ((List) mo41611b()).add(bVar);
                new C9563b(bVar, this);
            }
        }
    }

    /* renamed from: m6.f$d */
    protected static class C9565d extends C9570i<C9535a> {

        /* renamed from: e */
        public static final Descriptor$Service$ELEMENT f17463e = Descriptor$Service$ELEMENT.action;

        public C9565d(C9535a aVar, C9570i iVar) {
            super(aVar, iVar);
        }

        /* renamed from: f */
        public void mo38573f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            if (C9562a.f17460a[descriptor$Service$ELEMENT.ordinal()] == 1) {
                ((C9535a) mo41611b()).f17369a = mo41610a();
            }
        }

        /* renamed from: g */
        public boolean mo38574g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f17463e);
        }

        /* renamed from: h */
        public void mo38575h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) {
            if (descriptor$Service$ELEMENT.equals(C9564c.f17462e)) {
                ArrayList arrayList = new ArrayList();
                ((C9535a) mo41611b()).f17370b = arrayList;
                new C9564c(arrayList, this);
            }
        }
    }

    /* renamed from: m6.f$e */
    protected static class C9566e extends C9570i<List<C9535a>> {

        /* renamed from: e */
        public static final Descriptor$Service$ELEMENT f17464e = Descriptor$Service$ELEMENT.actionList;

        public C9566e(List<C9535a> list, C9570i iVar) {
            super(list, iVar);
        }

        /* renamed from: g */
        public boolean mo38574g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f17464e);
        }

        /* renamed from: h */
        public void mo38575h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) {
            if (descriptor$Service$ELEMENT.equals(C9565d.f17463e)) {
                C9535a aVar = new C9535a();
                ((List) mo41611b()).add(aVar);
                new C9565d(aVar, this);
            }
        }
    }

    /* renamed from: m6.f$f */
    protected static class C9567f extends C9570i<List<String>> {

        /* renamed from: e */
        public static final Descriptor$Service$ELEMENT f17465e = Descriptor$Service$ELEMENT.allowedValueList;

        public C9567f(List<String> list, C9570i iVar) {
            super(list, iVar);
        }

        /* renamed from: f */
        public void mo38573f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            if (C9562a.f17460a[descriptor$Service$ELEMENT.ordinal()] == 7) {
                ((List) mo41611b()).add(mo41610a());
            }
        }

        /* renamed from: g */
        public boolean mo38574g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f17465e);
        }
    }

    /* renamed from: m6.f$g */
    protected static class C9568g extends C9570i<C9537c> {

        /* renamed from: e */
        public static final Descriptor$Service$ELEMENT f17466e = Descriptor$Service$ELEMENT.allowedValueRange;

        public C9568g(C9537c cVar, C9570i iVar) {
            super(cVar, iVar);
        }

        /* renamed from: f */
        public void mo38573f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            try {
                switch (C9562a.f17460a[descriptor$Service$ELEMENT.ordinal()]) {
                    case 8:
                        ((C9537c) mo41611b()).f17375a = Long.valueOf(mo41610a());
                        return;
                    case 9:
                        ((C9537c) mo41611b()).f17376b = Long.valueOf(mo41610a());
                        return;
                    case 10:
                        ((C9537c) mo41611b()).f17377c = Long.valueOf(mo41610a());
                        return;
                    default:
                        return;
                }
            } catch (Exception unused) {
            }
        }

        /* renamed from: g */
        public boolean mo38574g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f17466e);
        }
    }

    /* renamed from: m6.f$h */
    protected static class C9569h extends C9570i<C9540f> {
        public C9569h(C9540f fVar, SAXParser sAXParser) {
            super(fVar, sAXParser);
        }

        /* renamed from: h */
        public void mo38575h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) {
            if (descriptor$Service$ELEMENT.equals(C9566e.f17464e)) {
                ArrayList arrayList = new ArrayList();
                ((C9540f) mo41611b()).f17407f = arrayList;
                new C9566e(arrayList, this);
            }
            if (descriptor$Service$ELEMENT.equals(C9572k.f17468e)) {
                ArrayList arrayList2 = new ArrayList();
                ((C9540f) mo41611b()).f17408g = arrayList2;
                new C9572k(arrayList2, this);
            }
        }
    }

    /* renamed from: m6.f$i */
    protected static class C9570i<I> extends SAXParser.C10252a<I> {
        public C9570i(I i, C9570i iVar) {
            super(i, (SAXParser.C10252a) iVar);
        }

        public C9570i(I i, SAXParser sAXParser) {
            super(i, sAXParser);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo38576d(String str, String str2, String str3) {
            Descriptor$Service$ELEMENT valueOrNullOf = Descriptor$Service$ELEMENT.valueOrNullOf(str2);
            return valueOrNullOf != null && mo38574g(valueOrNullOf);
        }

        public void endElement(String str, String str2, String str3) {
            super.endElement(str, str2, str3);
            Descriptor$Service$ELEMENT valueOrNullOf = Descriptor$Service$ELEMENT.valueOrNullOf(str2);
            if (valueOrNullOf != null) {
                mo38573f(valueOrNullOf);
            }
        }

        /* renamed from: f */
        public void mo38573f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
        }

        /* renamed from: g */
        public boolean mo38574g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return false;
        }

        /* renamed from: h */
        public void mo38575h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) {
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            super.startElement(str, str2, str3, attributes);
            Descriptor$Service$ELEMENT valueOrNullOf = Descriptor$Service$ELEMENT.valueOrNullOf(str2);
            if (valueOrNullOf != null) {
                mo38575h(valueOrNullOf, attributes);
            }
        }
    }

    /* renamed from: m6.f$j */
    protected static class C9571j extends C9570i<C9541g> {

        /* renamed from: e */
        public static final Descriptor$Service$ELEMENT f17467e = Descriptor$Service$ELEMENT.stateVariable;

        public C9571j(C9541g gVar, C9570i iVar) {
            super(gVar, iVar);
        }

        /* renamed from: f */
        public void mo38573f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            int i = C9562a.f17460a[descriptor$Service$ELEMENT.ordinal()];
            if (i == 1) {
                ((C9541g) mo41611b()).f17409a = mo41610a();
            } else if (i == 5) {
                String a = mo41610a();
                Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(a);
                ((C9541g) mo41611b()).f17410b = byDescriptorName != null ? byDescriptorName.getDatatype() : new C10085g(a);
            } else if (i == 6) {
                ((C9541g) mo41611b()).f17411c = mo41610a();
            }
        }

        /* renamed from: g */
        public boolean mo38574g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f17467e);
        }

        /* renamed from: h */
        public void mo38575h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) {
            if (descriptor$Service$ELEMENT.equals(C9567f.f17465e)) {
                ArrayList arrayList = new ArrayList();
                ((C9541g) mo41611b()).f17412d = arrayList;
                new C9567f(arrayList, this);
            }
            if (descriptor$Service$ELEMENT.equals(C9568g.f17466e)) {
                C9537c cVar = new C9537c();
                ((C9541g) mo41611b()).f17413e = cVar;
                new C9568g(cVar, this);
            }
        }
    }

    /* renamed from: m6.f$k */
    protected static class C9572k extends C9570i<List<C9541g>> {

        /* renamed from: e */
        public static final Descriptor$Service$ELEMENT f17468e = Descriptor$Service$ELEMENT.serviceStateTable;

        public C9572k(List<C9541g> list, C9570i iVar) {
            super(list, iVar);
        }

        /* renamed from: g */
        public boolean mo38574g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f17468e);
        }

        /* renamed from: h */
        public void mo38575h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) {
            if (descriptor$Service$ELEMENT.equals(C9571j.f17467e)) {
                C9541g gVar = new C9541g();
                String value = attributes.getValue(Descriptor$Service$ATTRIBUTE.sendEvents.toString());
                gVar.f17414f = new C10411k(value != null && value.toUpperCase(Locale.ROOT).equals("YES"));
                ((List) mo41611b()).add(gVar);
                new C9571j(gVar, this);
            }
        }
    }

    /* renamed from: a */
    public <S extends C10070e> S mo38540a(S s, String str) {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            f17459b.fine("Reading service from XML descriptor");
            SAXParser sAXParser = new SAXParser();
            C9540f fVar = new C9540f();
            mo38568p(fVar, s);
            new C9569h(fVar, sAXParser);
            sAXParser.mo41608f(new InputSource(new StringReader(str.trim())));
            return fVar.mo38505a(s.mo40531d());
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            throw new DescriptorBindingException("Could not parse service descriptor: " + e2.toString(), e2);
        }
    }
}
