package p164h.p165b.p166a.p170k.p171d;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.p271io.IOUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import p164h.p165b.p166a.p170k.p172e.C4445j;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.C11225o;
import p164h.p165b.p166a.p240h.p241p.C11228b;
import p164h.p165b.p166a.p240h.p241p.C11230d;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p243r.p244k.C11254a;
import p164h.p165b.p166a.p240h.p243r.p244k.C11255b;
import p164h.p165b.p166a.p240h.p243r.p244k.C11256c;
import p164h.p165b.p166a.p240h.p248s.C11321b;
import p164h.p165b.p166a.p240h.p252w.C11386n;
import p164h.p165b.p166a.p240h.p252w.C11391r;

/* renamed from: h.b.a.k.d.p */
public class C4443p implements C4445j, ErrorHandler {

    /* renamed from: a */
    private static Logger f8014a = Logger.getLogger(C4445j.class.getName());

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo24495A(Document document, Element element, C11256c cVar, C11232f fVar) {
        mo24498D(document, element, fVar);
        cVar.mo35803b(mo24519u(document));
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo24496B(Document document, Element element, C11255b bVar, C11232f fVar) {
        mo24520v(document, mo24523x(document, element, bVar, fVar), fVar);
        bVar.mo35803b(mo24519u(document));
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo24497C(Document document, Element element, C11256c cVar, C11232f fVar) {
        mo24521w(document, mo24524y(document, element, cVar, fVar), fVar);
        cVar.mo35803b(mo24519u(document));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo24498D(Document document, Element element, C11232f fVar) {
        Element createElementNS = document.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "s:Fault");
        element.appendChild(createElementNS);
        C11225o.m29316c(document, createElementNS, "faultcode", "s:Client");
        C11225o.m29316c(document, createElementNS, "faultstring", "UPnPError");
        Element createElement = document.createElement("detail");
        createElementNS.appendChild(createElement);
        Element createElementNS2 = document.createElementNS("urn:schemas-upnp-org:control-1-0", "UPnPError");
        createElement.appendChild(createElementNS2);
        int a = fVar.mo35702c().mo35699a();
        String message = fVar.mo35702c().getMessage();
        Logger logger = f8014a;
        logger.fine("Writing fault element: " + a + " - " + message);
        C11225o.m29316c(document, createElementNS2, "errorCode", Integer.toString(a));
        C11225o.m29316c(document, createElementNS2, "errorDescription", message);
    }

    /* renamed from: a */
    public void mo24491a(C11256c cVar, C11232f fVar) {
        Logger logger = f8014a;
        logger.fine("Reading body of " + cVar + " for: " + fVar);
        if (f8014a.isLoggable(Level.FINER)) {
            f8014a.finer("===================================== SOAP BODY BEGIN ============================================");
            f8014a.finer(cVar.mo35804c());
            f8014a.finer("-===================================== SOAP BODY END ============================================");
        }
        String i = mo24507i(cVar);
        try {
            DocumentBuilderFactory e = mo24501e();
            e.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = e.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            Document parse = newDocumentBuilder.parse(new InputSource(new StringReader(i)));
            Element p = mo24514p(parse);
            C11230d q = mo24515q(parse, p);
            if (q == null) {
                mo24517s(parse, p, cVar, fVar);
            } else {
                fVar.mo35709j(q);
            }
        } catch (Exception e2) {
            throw new C11221k("Can't transform message payload: " + e2, e2, i);
        }
    }

    /* renamed from: b */
    public void mo24492b(C11255b bVar, C11232f fVar) {
        Logger logger = f8014a;
        logger.fine("Reading body of " + bVar + " for: " + fVar);
        if (f8014a.isLoggable(Level.FINER)) {
            f8014a.finer("===================================== SOAP BODY BEGIN ============================================");
            f8014a.finer(bVar.mo35804c());
            f8014a.finer("-===================================== SOAP BODY END ============================================");
        }
        String i = mo24507i(bVar);
        try {
            DocumentBuilderFactory e = mo24501e();
            e.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = e.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            Document parse = newDocumentBuilder.parse(new InputSource(new StringReader(i)));
            mo24516r(parse, mo24514p(parse), bVar, fVar);
        } catch (Exception e2) {
            throw new C11221k("Can't transform message payload: " + e2, e2, i);
        }
    }

    /* renamed from: c */
    public void mo24499c(C11255b bVar, C11232f fVar) {
        Logger logger = f8014a;
        logger.fine("Writing body of " + bVar + " for: " + fVar);
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            mo24496B(newDocument, mo24525z(newDocument), bVar, fVar);
            if (f8014a.isLoggable(Level.FINER)) {
                f8014a.finer("===================================== SOAP BODY BEGIN ============================================");
                f8014a.finer(bVar.mo35804c());
                f8014a.finer("-===================================== SOAP BODY END ============================================");
            }
        } catch (Exception e) {
            throw new C11221k("Can't transform message payload: " + e, e);
        }
    }

    /* renamed from: d */
    public void mo24500d(C11256c cVar, C11232f fVar) {
        Logger logger = f8014a;
        logger.fine("Writing body of " + cVar + " for: " + fVar);
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            Element z = mo24525z(newDocument);
            if (fVar.mo35702c() != null) {
                mo24495A(newDocument, z, cVar, fVar);
            } else {
                mo24497C(newDocument, z, cVar, fVar);
            }
            if (f8014a.isLoggable(Level.FINER)) {
                f8014a.finer("===================================== SOAP BODY BEGIN ============================================");
                f8014a.finer(cVar.mo35804c());
                f8014a.finer("-===================================== SOAP BODY END ============================================");
            }
        } catch (Exception e) {
            throw new C11221k("Can't transform message payload: " + e, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public DocumentBuilderFactory mo24501e() {
        return DocumentBuilderFactory.newInstance();
    }

    public void error(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11228b mo24503f(C11321b bVar, String str) {
        try {
            return new C11228b(bVar, str);
        } catch (C11391r e) {
            C11386n nVar = C11386n.ARGUMENT_VALUE_INVALID;
            throw new C11230d(nVar, "Wrong type or invalid value for '" + bVar.mo35869e() + "': " + e.getMessage(), (Throwable) e);
        }
    }

    public void fatalError(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Node mo24505g(List<Node> list, C11321b bVar) {
        for (Node next : list) {
            if (bVar.mo35871g(mo24508j(next))) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public List<Node> mo24506h(NodeList nodeList, C11321b[] bVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C11321b bVar : bVarArr) {
            arrayList.add(bVar.mo35869e());
            arrayList.addAll(Arrays.asList(bVar.mo35866b()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            if (item.getNodeType() == 1 && arrayList.contains(mo24508j(item))) {
                arrayList2.add(item);
            }
        }
        if (arrayList2.size() >= bVarArr.length) {
            return arrayList2;
        }
        throw new C11230d(C11386n.ARGUMENT_VALUE_INVALID, "Invalid number of input or output arguments in XML message, expected " + bVarArr.length + " but found " + arrayList2.size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo24507i(C11254a aVar) {
        if (aVar.mo35802a()) {
            return aVar.mo35804c().trim();
        }
        throw new C11221k("Can't transform null or non-string/zero-length body of: " + aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo24508j(Node node) {
        return node.getPrefix() != null ? node.getNodeName().substring(node.getPrefix().length() + 1) : node.getNodeName();
    }

    /* renamed from: k */
    public void mo24509k(Element element, C11232f fVar) {
        fVar.mo35712m(mo24513o(element.getChildNodes(), fVar.mo35700a().mo35855c()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo24510l(Element element, C11232f fVar) {
        fVar.mo35714o(mo24513o(element.getChildNodes(), fVar.mo35700a().mo35858f()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Element mo24511m(Element element, C11255b bVar, C11232f fVar) {
        NodeList childNodes = element.getChildNodes();
        Logger logger = f8014a;
        logger.fine("Looking for action request element matching namespace:" + bVar.mo35805d());
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                String j = mo24508j(item);
                if (j.equals(fVar.mo35700a().mo35856d())) {
                    if (item.getNamespaceURI() == null || !item.getNamespaceURI().equals(bVar.mo35805d())) {
                        throw new C11221k("Illegal or missing namespace on action request element: " + item);
                    }
                    Logger logger2 = f8014a;
                    logger2.fine("Reading action request element: " + j);
                    return (Element) item;
                }
            }
        }
        throw new C11221k("Could not read action request element matching namespace: " + bVar.mo35805d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Element mo24512n(Element element, C11232f fVar) {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                String j = mo24508j(item);
                if (j.equals(fVar.mo35700a().mo35856d() + "Response")) {
                    Logger logger = f8014a;
                    logger.fine("Reading action response element: " + mo24508j(item));
                    return (Element) item;
                }
            }
        }
        f8014a.fine("Could not read action response element");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C11228b[] mo24513o(NodeList nodeList, C11321b[] bVarArr) {
        List<Node> h = mo24506h(nodeList, bVarArr);
        C11228b[] bVarArr2 = new C11228b[bVarArr.length];
        int i = 0;
        while (i < bVarArr.length) {
            C11321b bVar = bVarArr[i];
            Node g = mo24505g(h, bVar);
            if (g != null) {
                Logger logger = f8014a;
                logger.fine("Reading action argument: " + bVar.mo35869e());
                bVarArr2[i] = mo24503f(bVar, C11225o.m29325l(g));
                i++;
            } else {
                C11386n nVar = C11386n.ARGUMENT_VALUE_INVALID;
                throw new C11230d(nVar, "Could not find argument '" + bVar.mo35869e() + "' node");
            }
        }
        return bVarArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Element mo24514p(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement == null || !mo24508j(documentElement).equals("Envelope")) {
            throw new RuntimeException("Response root element was not 'Envelope'");
        }
        NodeList childNodes = documentElement.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && mo24508j(item).equals("Body")) {
                return (Element) item;
            }
        }
        throw new RuntimeException("Response envelope did not contain 'Body' child element");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C11230d mo24515q(Document document, Element element) {
        return mo24518t(element);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo24516r(Document document, Element element, C11255b bVar, C11232f fVar) {
        mo24509k(mo24511m(element, bVar, fVar), fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo24517s(Document document, Element element, C11256c cVar, C11232f fVar) {
        mo24510l(mo24512n(element, fVar), fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C11230d mo24518t(Element element) {
        NodeList childNodes = element.getChildNodes();
        String str = null;
        String str2 = null;
        boolean z = false;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            short s = 1;
            if (item.getNodeType() == 1 && mo24508j(item).equals("Fault")) {
                NodeList childNodes2 = item.getChildNodes();
                int i2 = 0;
                while (i2 < childNodes2.getLength()) {
                    Node item2 = childNodes2.item(i2);
                    if (item2.getNodeType() == s && mo24508j(item2).equals("detail")) {
                        NodeList childNodes3 = item2.getChildNodes();
                        int i3 = 0;
                        while (i3 < childNodes3.getLength()) {
                            Node item3 = childNodes3.item(i3);
                            if (item3.getNodeType() == s && mo24508j(item3).equals("UPnPError")) {
                                NodeList childNodes4 = item3.getChildNodes();
                                int i4 = 0;
                                while (i4 < childNodes4.getLength()) {
                                    Node item4 = childNodes4.item(i4);
                                    if (item4.getNodeType() == s) {
                                        if (mo24508j(item4).equals("errorCode")) {
                                            str = C11225o.m29325l(item4);
                                        }
                                        if (mo24508j(item4).equals("errorDescription")) {
                                            str2 = C11225o.m29325l(item4);
                                        }
                                    }
                                    i4++;
                                    s = 1;
                                }
                            }
                            i3++;
                            s = 1;
                        }
                    }
                    i2++;
                    s = 1;
                }
                z = true;
            }
        }
        if (str != null) {
            try {
                int intValue = Integer.valueOf(str).intValue();
                C11386n a = C11386n.m29846a(intValue);
                if (a != null) {
                    f8014a.fine("Reading fault element: " + a.mo36107b() + " - " + str2);
                    return new C11230d(a, str2, false);
                }
                f8014a.fine("Reading fault element: " + intValue + " - " + str2);
                return new C11230d(intValue, str2);
            } catch (NumberFormatException unused) {
                throw new RuntimeException("Error code was not a number");
            }
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException("Received fault element but no error code");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo24519u(Document document) {
        String h = C11225o.m29321h(document);
        while (true) {
            if (!h.endsWith(IOUtils.LINE_SEPARATOR_UNIX) && !h.endsWith("\r")) {
                return h;
            }
            h = h.substring(0, h.length() - 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo24520v(Document document, Element element, C11232f fVar) {
        for (C11321b bVar : fVar.mo35700a().mo35855c()) {
            f8014a.fine("Writing action input argument: " + bVar.mo35869e());
            C11225o.m29316c(document, element, bVar.mo35869e(), fVar.mo35704e(bVar) != null ? fVar.mo35704e(bVar).toString() : "");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo24521w(Document document, Element element, C11232f fVar) {
        for (C11321b bVar : fVar.mo35700a().mo35858f()) {
            f8014a.fine("Writing action output argument: " + bVar.mo35869e());
            C11225o.m29316c(document, element, bVar.mo35869e(), fVar.mo35707h(bVar) != null ? fVar.mo35707h(bVar).toString() : "");
        }
    }

    public void warning(SAXParseException sAXParseException) {
        f8014a.warning(sAXParseException.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Element mo24523x(Document document, Element element, C11255b bVar, C11232f fVar) {
        Logger logger = f8014a;
        logger.fine("Writing action request element: " + fVar.mo35700a().mo35856d());
        String d = bVar.mo35805d();
        Element createElementNS = document.createElementNS(d, "u:" + fVar.mo35700a().mo35856d());
        element.appendChild(createElementNS);
        return createElementNS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Element mo24524y(Document document, Element element, C11256c cVar, C11232f fVar) {
        Logger logger = f8014a;
        logger.fine("Writing action response element: " + fVar.mo35700a().mo35856d());
        String d = cVar.mo35805d();
        Element createElementNS = document.createElementNS(d, "u:" + fVar.mo35700a().mo35856d() + "Response");
        element.appendChild(createElementNS);
        return createElementNS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Element mo24525z(Document document) {
        Element createElementNS = document.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "s:Envelope");
        Attr createAttributeNS = document.createAttributeNS("http://schemas.xmlsoap.org/soap/envelope/", "s:encodingStyle");
        createAttributeNS.setValue("http://schemas.xmlsoap.org/soap/encoding/");
        createElementNS.setAttributeNode(createAttributeNS);
        document.appendChild(createElementNS);
        Element createElementNS2 = document.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "s:Body");
        createElementNS.appendChild(createElementNS2);
        return createElementNS2;
    }
}
