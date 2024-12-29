package p164h.p165b.p166a.p237f.p239e;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import p164h.p165b.p166a.p237f.p238d.C11177a;
import p164h.p165b.p166a.p237f.p238d.C11178b;
import p164h.p165b.p166a.p237f.p238d.C11179c;
import p164h.p165b.p166a.p237f.p238d.C11182f;
import p164h.p165b.p166a.p237f.p238d.C11183g;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.C11225o;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11321b;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p248s.C11338r;
import p164h.p165b.p166a.p240h.p252w.C11368g;
import p164h.p165b.p166a.p240h.p252w.C11374j;

/* renamed from: h.b.a.f.e.i */
public class C11193i implements C11191g, ErrorHandler {

    /* renamed from: a */
    private static Logger f22258a = Logger.getLogger(C11191g.class.getName());

    /* renamed from: f */
    private void m29163f(C11320a aVar, Document document, Element element) {
        Element a = C11225o.m29314a(document, element, C11187c.f22238f);
        C11225o.m29318e(document, a, C11187c.name, aVar.mo35856d());
        if (aVar.mo35860h()) {
            Element a2 = C11225o.m29314a(document, a, C11187c.f22240h);
            for (C11321b g : aVar.mo35853a()) {
                m29164g(g, document, a2);
            }
        }
    }

    /* renamed from: g */
    private void m29164g(C11321b bVar, Document document, Element element) {
        Element a = C11225o.m29314a(document, element, C11187c.f22241i);
        C11225o.m29318e(document, a, C11187c.name, bVar.mo35869e());
        C11225o.m29318e(document, a, C11187c.f22242j, bVar.mo35868d().toString().toLowerCase(Locale.ROOT));
        if (bVar.mo35872h()) {
            Logger logger = f22258a;
            logger.warning("UPnP specification violation: Not producing <retval> element to be compatible with WMP12: " + bVar);
        }
        C11225o.m29318e(document, a, C11187c.relatedStateVariable, bVar.mo35870f());
    }

    /* renamed from: h */
    private void m29165h(C11335o oVar, Document document, Element element) {
        Element a = C11225o.m29314a(document, element, C11187c.f22237e);
        for (C11320a aVar : oVar.mo35981b()) {
            if (!aVar.mo35856d().equals("QueryStateVariable")) {
                m29163f(aVar, document, a);
            }
        }
    }

    /* renamed from: i */
    private void m29166i(C11335o oVar, Document document) {
        Element createElementNS = document.createElementNS("urn:schemas-upnp-org:service-1-0", C11187c.f22233a.toString());
        document.appendChild(createElementNS);
        m29168k(oVar, document, createElementNS);
        if (oVar.mo35989j()) {
            m29165h(oVar, document, createElementNS);
        }
        m29167j(oVar, document, createElementNS);
    }

    /* renamed from: j */
    private void m29167j(C11335o oVar, Document document, Element element) {
        Element a = C11225o.m29314a(document, element, C11187c.serviceStateTable);
        for (C11336p l : oVar.mo35988i()) {
            m29169l(l, document, a);
        }
    }

    /* renamed from: k */
    private void m29168k(C11335o oVar, Document document, Element element) {
        Element a = C11225o.m29314a(document, element, C11187c.f22234b);
        C11225o.m29318e(document, a, C11187c.f22235c, Integer.valueOf(oVar.mo35983d().mo35905u().mo36016a()));
        C11225o.m29318e(document, a, C11187c.f22236d, Integer.valueOf(oVar.mo35983d().mo35905u().mo36017b()));
    }

    /* renamed from: l */
    private void m29169l(C11336p pVar, Document document, Element element) {
        String str;
        C11187c cVar;
        String str2;
        String str3;
        Element a = C11225o.m29314a(document, element, C11187c.stateVariable);
        C11225o.m29318e(document, a, C11187c.name, pVar.mo35994b());
        if (pVar.mo35996d().mo36013d() instanceof C11368g) {
            cVar = C11187c.dataType;
            str = ((C11368g) pVar.mo35996d().mo36013d()).mo36065i();
        } else {
            cVar = C11187c.dataType;
            str = pVar.mo35996d().mo36013d().mo36045e().mo36079c();
        }
        C11225o.m29318e(document, a, cVar, str);
        C11225o.m29318e(document, a, C11187c.defaultValue, pVar.mo35996d().mo36014e());
        if (pVar.mo35993a().mo36009c()) {
            str3 = C11186b.sendEvents.toString();
            str2 = "yes";
        } else {
            str3 = C11186b.sendEvents.toString();
            str2 = "no";
        }
        a.setAttribute(str3, str2);
        if (pVar.mo35996d().mo36012c() != null) {
            Element a2 = C11225o.m29314a(document, a, C11187c.f22249q);
            for (String e : pVar.mo35996d().mo36012c()) {
                C11225o.m29318e(document, a2, C11187c.f22250r, e);
            }
        }
        if (pVar.mo35996d().mo36011b() != null) {
            Element a3 = C11225o.m29314a(document, a, C11187c.f22251s);
            C11225o.m29318e(document, a3, C11187c.f22252t, Long.valueOf(pVar.mo35996d().mo36011b().mo36002b()));
            C11225o.m29318e(document, a3, C11187c.f22253u, Long.valueOf(pVar.mo35996d().mo36011b().mo36001a()));
            if (pVar.mo35996d().mo36011b().mo36003c() >= 1) {
                C11225o.m29318e(document, a3, C11187c.step, Long.valueOf(pVar.mo35996d().mo36011b().mo36003c()));
            }
        }
    }

    /* renamed from: a */
    public <S extends C11335o> S mo35555a(S s, String str) {
        if (str == null || str.length() == 0) {
            throw new C11188d("Null or empty descriptor");
        }
        try {
            Logger logger = f22258a;
            logger.fine("Populating service from XML descriptor: " + s);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            return mo35577e(s, newDocumentBuilder.parse(new InputSource(new StringReader(str.trim()))));
        } catch (C11223m e) {
            throw e;
        } catch (Exception e2) {
            throw new C11188d("Could not parse service descriptor: " + e2.toString(), e2);
        }
    }

    /* renamed from: b */
    public String mo35556b(C11335o oVar) {
        try {
            Logger logger = f22258a;
            logger.fine("Generating XML descriptor from service model: " + oVar);
            return C11225o.m29321h(mo35575c(oVar));
        } catch (Exception e) {
            throw new C11188d("Could not build DOM: " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public Document mo35575c(C11335o oVar) {
        try {
            Logger logger = f22258a;
            logger.fine("Generating XML descriptor from service model: " + oVar);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            m29166i(oVar, newDocument);
            return newDocument;
        } catch (Exception e) {
            throw new C11188d("Could not generate service descriptor: " + e.getMessage(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public <S extends C11335o> S mo35576d(S s, C11182f fVar) {
        return fVar.mo35543a(s.mo35983d());
    }

    /* renamed from: e */
    public <S extends C11335o> S mo35577e(S s, Document document) {
        try {
            Logger logger = f22258a;
            logger.fine("Populating service from DOM: " + s);
            C11182f fVar = new C11182f();
            mo35583p(fVar, s);
            mo35584q(fVar, document.getDocumentElement());
            return mo35576d(s, fVar);
        } catch (C11223m e) {
            throw e;
        } catch (Exception e2) {
            throw new C11188d("Could not parse service DOM: " + e2.toString(), e2);
        }
    }

    public void error(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    public void fatalError(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* renamed from: m */
    public void mo35580m(C11177a aVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (C11187c.name.mo35548a(item)) {
                    aVar.f22145a = C11225o.m29325l(item);
                } else if (C11187c.f22240h.mo35548a(item)) {
                    NodeList childNodes2 = item.getChildNodes();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        Node item2 = childNodes2.item(i2);
                        if (item2.getNodeType() == 1) {
                            C11178b bVar = new C11178b();
                            mo35581n(bVar, item2);
                            aVar.f22146b.add(bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public void mo35581n(C11178b bVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (C11187c.name.mo35548a(item)) {
                    bVar.f22147a = C11225o.m29325l(item);
                } else if (C11187c.f22242j.mo35548a(item)) {
                    String l = C11225o.m29325l(item);
                    try {
                        bVar.f22149c = C11321b.C11322a.valueOf(l.toUpperCase(Locale.ROOT));
                    } catch (IllegalArgumentException unused) {
                        Logger logger = f22258a;
                        logger.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + l);
                        bVar.f22149c = C11321b.C11322a.IN;
                    }
                } else if (C11187c.relatedStateVariable.mo35548a(item)) {
                    bVar.f22148b = C11225o.m29325l(item);
                } else if (C11187c.retval.mo35548a(item)) {
                    bVar.f22150d = true;
                }
            }
        }
    }

    /* renamed from: o */
    public void mo35582o(C11182f fVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && C11187c.f22238f.mo35548a(item)) {
                C11177a aVar = new C11177a();
                mo35580m(aVar, item);
                fVar.f22183f.add(aVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo35583p(C11182f fVar, C11335o oVar) {
        fVar.f22179b = oVar.mo35985f();
        fVar.f22178a = oVar.mo35986g();
        if (oVar instanceof C11334n) {
            C11334n nVar = (C11334n) oVar;
            fVar.f22181d = nVar.mo35976n();
            fVar.f22182e = nVar.mo35978p();
            fVar.f22180c = nVar.mo35977o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo35584q(C11182f fVar, Element element) {
        if (C11187c.f22233a.mo35548a(element)) {
            NodeList childNodes = element.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1 && !C11187c.f22234b.mo35548a(item)) {
                    if (C11187c.f22237e.mo35548a(item)) {
                        mo35582o(fVar, item);
                    } else if (C11187c.serviceStateTable.mo35548a(item)) {
                        mo35585r(fVar, item);
                    } else {
                        Logger logger = f22258a;
                        logger.finer("Ignoring unknown element: " + item.getNodeName());
                    }
                }
            }
            return;
        }
        throw new C11188d("Root element name is not <scpd>: " + element.getNodeName());
    }

    /* renamed from: r */
    public void mo35585r(C11182f fVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && C11187c.stateVariable.mo35548a(item)) {
                C11183g gVar = new C11183g();
                mo35586s(gVar, (Element) item);
                fVar.f22184g.add(gVar);
            }
        }
    }

    /* renamed from: s */
    public void mo35586s(C11183g gVar, Element element) {
        gVar.f22190f = new C11338r(element.getAttribute("sendEvents") != null && element.getAttribute(C11186b.sendEvents.toString()).toUpperCase(Locale.ROOT).equals("YES"));
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (C11187c.name.mo35548a(item)) {
                    gVar.f22185a = C11225o.m29325l(item);
                } else if (C11187c.dataType.mo35548a(item)) {
                    String l = C11225o.m29325l(item);
                    C11374j.C11375a a = C11374j.C11375a.m29812a(l);
                    gVar.f22186b = a != null ? a.mo36078b() : new C11368g(l);
                } else if (C11187c.defaultValue.mo35548a(item)) {
                    gVar.f22187c = C11225o.m29325l(item);
                } else if (C11187c.f22249q.mo35548a(item)) {
                    ArrayList arrayList = new ArrayList();
                    NodeList childNodes2 = item.getChildNodes();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        Node item2 = childNodes2.item(i2);
                        if (item2.getNodeType() == 1 && C11187c.f22250r.mo35548a(item2)) {
                            arrayList.add(C11225o.m29325l(item2));
                        }
                    }
                    gVar.f22188d = arrayList;
                } else if (C11187c.f22251s.mo35548a(item)) {
                    C11179c cVar = new C11179c();
                    NodeList childNodes3 = item.getChildNodes();
                    for (int i3 = 0; i3 < childNodes3.getLength(); i3++) {
                        Node item3 = childNodes3.item(i3);
                        if (item3.getNodeType() == 1) {
                            if (C11187c.f22252t.mo35548a(item3)) {
                                try {
                                    cVar.f22151a = Long.valueOf(C11225o.m29325l(item3));
                                } catch (Exception unused) {
                                }
                            } else if (C11187c.f22253u.mo35548a(item3)) {
                                cVar.f22152b = Long.valueOf(C11225o.m29325l(item3));
                            } else if (C11187c.step.mo35548a(item3)) {
                                cVar.f22153c = Long.valueOf(C11225o.m29325l(item3));
                            }
                        }
                    }
                    gVar.f22189e = cVar;
                }
            }
        }
    }

    public void warning(SAXParseException sAXParseException) {
        f22258a.warning(sAXParseException.toString());
    }
}
