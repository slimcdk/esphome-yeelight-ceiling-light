package org.fourthline.cling.transport.impl;

import com.miot.common.device.parser.xml.DddTag;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.p194io.IOUtils;
import org.fourthline.cling.model.C10025m;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.meta.C10071f;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import p148d7.C8955e;
import p210s6.C10373a;
import p210s6.C10377e;
import p226w6.C11959d;

/* renamed from: org.fourthline.cling.transport.impl.g */
public class C10130g implements C8955e, ErrorHandler {

    /* renamed from: a */
    private static Logger f18709a = Logger.getLogger(C8955e.class.getName());

    /* renamed from: a */
    public void mo36792a(C10377e eVar) {
        Logger logger = f18709a;
        logger.fine("Writing body of: " + eVar);
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            mo40751i(newDocument, mo40752j(newDocument), eVar);
            eVar.mo40411r(UpnpMessage.BodyType.STRING, mo40750h(newDocument));
            if (f18709a.isLoggable(Level.FINER)) {
                f18709a.finer("===================================== GENA BODY BEGIN ============================================");
                f18709a.finer(eVar.mo40398e().toString());
                f18709a.finer("====================================== GENA BODY END =============================================");
            }
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public void mo24983b(C10373a aVar) {
        Logger logger = f18709a;
        logger.fine("Reading body of: " + aVar);
        if (f18709a.isLoggable(Level.FINER)) {
            f18709a.finer("===================================== GENA BODY BEGIN ============================================");
            f18709a.finer(aVar.mo40398e() != null ? aVar.mo40398e().toString() : "null");
            f18709a.finer("-===================================== GENA BODY END ============================================");
        }
        String d = mo40744d(aVar);
        try {
            DocumentBuilderFactory c = mo40743c();
            c.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = c.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            mo40747f(mo40749g(newDocumentBuilder.parse(new InputSource(new StringReader(d)))), aVar);
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e.getMessage(), e, d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public DocumentBuilderFactory mo40743c() {
        return DocumentBuilderFactory.newInstance();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo40744d(UpnpMessage upnpMessage) {
        if (upnpMessage.mo40395a()) {
            return upnpMessage.mo40397c().trim();
        }
        throw new UnsupportedDataException("Can't transform null or non-string/zero-length body of: " + upnpMessage);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo40745e(Node node) {
        return node.getPrefix() != null ? node.getNodeName().substring(node.getPrefix().length() + 1) : node.getNodeName();
    }

    public void error(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo40747f(Element element, C10373a aVar) {
        NodeList childNodes = element.getChildNodes();
        C10071f[] i = aVar.mo41967z().mo40536i();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node item = childNodes.item(i2);
            if (item.getNodeType() == 1 && mo40745e(item).equals(DddTag.PL_PROPERTY)) {
                NodeList childNodes2 = item.getChildNodes();
                for (int i3 = 0; i3 < childNodes2.getLength(); i3++) {
                    Node item2 = childNodes2.item(i3);
                    if (item2.getNodeType() == 1) {
                        String e = mo40745e(item2);
                        int length = i.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            C10071f fVar = i[i4];
                            if (fVar.mo40543b().equals(e)) {
                                Logger logger = f18709a;
                                logger.fine("Reading state variable value: " + e);
                                aVar.mo41963A().add(new C11959d(fVar, C10025m.m24861l(item2)));
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
    public Element mo40749g(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null && mo40745e(documentElement).equals("propertyset")) {
            return documentElement;
        }
        throw new RuntimeException("Root element was not 'propertyset'");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo40750h(Document document) {
        String h = C10025m.m24857h(document);
        while (true) {
            if (!h.endsWith(IOUtils.LINE_SEPARATOR_UNIX) && !h.endsWith("\r")) {
                return h;
            }
            h = h.substring(0, h.length() - 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo40751i(Document document, Element element, C10377e eVar) {
        for (C11959d next : eVar.mo41978y()) {
            Element createElementNS = document.createElementNS("urn:schemas-upnp-org:event-1-0", "e:property");
            element.appendChild(createElementNS);
            C10025m.m24852c(document, createElementNS, next.mo42508d().mo40543b(), next.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Element mo40752j(Document document) {
        Element createElementNS = document.createElementNS("urn:schemas-upnp-org:event-1-0", "e:propertyset");
        document.appendChild(createElementNS);
        return createElementNS;
    }

    public void warning(SAXParseException sAXParseException) {
        f18709a.warning(sAXParseException.toString());
    }
}
