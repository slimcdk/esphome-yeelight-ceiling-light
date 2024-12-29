package p164h.p165b.p166a.p170k.p171d;

import com.miot.common.device.parser.xml.DddTag;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.p271io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import p164h.p165b.p166a.p170k.p172e.C4444e;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.C11225o;
import p164h.p165b.p166a.p240h.p243r.C11246g;
import p164h.p165b.p166a.p240h.p243r.p246m.C11275a;
import p164h.p165b.p166a.p240h.p243r.p246m.C11279e;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p251v.C11355d;

/* renamed from: h.b.a.k.d.h */
public class C4438h implements C4444e, ErrorHandler {

    /* renamed from: a */
    private static Logger f8009a = Logger.getLogger(C4444e.class.getName());

    /* renamed from: a */
    public void mo24467a(C11279e eVar) {
        Logger logger = f8009a;
        logger.fine("Writing body of: " + eVar);
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            mo24477i(newDocument, mo24478j(newDocument), eVar);
            eVar.mo35783r(C11246g.C11247a.STRING, mo24476h(newDocument));
            if (f8009a.isLoggable(Level.FINER)) {
                f8009a.finer("===================================== GENA BODY BEGIN ============================================");
                f8009a.finer(eVar.mo35771e().toString());
                f8009a.finer("====================================== GENA BODY END =============================================");
            }
        } catch (Exception e) {
            throw new C11221k("Can't transform message payload: " + e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public void mo24468b(C11275a aVar) {
        Logger logger = f8009a;
        logger.fine("Reading body of: " + aVar);
        if (f8009a.isLoggable(Level.FINER)) {
            f8009a.finer("===================================== GENA BODY BEGIN ============================================");
            f8009a.finer(aVar.mo35771e() != null ? aVar.mo35771e().toString() : "null");
            f8009a.finer("-===================================== GENA BODY END ============================================");
        }
        String d = mo24470d(aVar);
        try {
            DocumentBuilderFactory c = mo24469c();
            c.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = c.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            mo24473f(mo24475g(newDocumentBuilder.parse(new InputSource(new StringReader(d)))), aVar);
        } catch (Exception e) {
            throw new C11221k("Can't transform message payload: " + e.getMessage(), e, d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public DocumentBuilderFactory mo24469c() {
        return DocumentBuilderFactory.newInstance();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo24470d(C11246g gVar) {
        if (gVar.mo35768a()) {
            return gVar.mo35770c().trim();
        }
        throw new C11221k("Can't transform null or non-string/zero-length body of: " + gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo24471e(Node node) {
        return node.getPrefix() != null ? node.getNodeName().substring(node.getPrefix().length() + 1) : node.getNodeName();
    }

    public void error(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo24473f(Element element, C11275a aVar) {
        NodeList childNodes = element.getChildNodes();
        C11336p[] i = aVar.mo35828z().mo35988i();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node item = childNodes.item(i2);
            if (item.getNodeType() == 1 && mo24471e(item).equals(DddTag.PL_PROPERTY)) {
                NodeList childNodes2 = item.getChildNodes();
                for (int i3 = 0; i3 < childNodes2.getLength(); i3++) {
                    Node item2 = childNodes2.item(i3);
                    if (item2.getNodeType() == 1) {
                        String e = mo24471e(item2);
                        int length = i.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            C11336p pVar = i[i4];
                            if (pVar.mo35994b().equals(e)) {
                                Logger logger = f8009a;
                                logger.fine("Reading state variable value: " + e);
                                aVar.mo35824A().add(new C11355d(pVar, C11225o.m29325l(item2)));
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
        }
    }

    public void fatalError(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Element mo24475g(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null && mo24471e(documentElement).equals("propertyset")) {
            return documentElement;
        }
        throw new RuntimeException("Root element was not 'propertyset'");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo24476h(Document document) {
        String h = C11225o.m29321h(document);
        while (true) {
            if (!h.endsWith(IOUtils.LINE_SEPARATOR_UNIX) && !h.endsWith("\r")) {
                return h;
            }
            h = h.substring(0, h.length() - 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo24477i(Document document, Element element, C11279e eVar) {
        for (C11355d next : eVar.mo35839y()) {
            Element createElementNS = document.createElementNS("urn:schemas-upnp-org:event-1-0", "e:property");
            element.appendChild(createElementNS);
            C11225o.m29316c(document, createElementNS, next.mo36040d().mo35994b(), next.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Element mo24478j(Document document) {
        Element createElementNS = document.createElementNS("urn:schemas-upnp-org:event-1-0", "e:propertyset");
        document.appendChild(createElementNS);
        return createElementNS;
    }

    public void warning(SAXParseException sAXParseException) {
        f8009a.warning(sAXParseException.toString());
    }
}
