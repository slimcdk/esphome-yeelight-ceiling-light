package org.fourthline.cling.transport.impl;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.p194io.IOUtils;
import org.fourthline.cling.model.C10025m;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.InvalidValueException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import p148d7.C8958h;
import p193o6.C9790b;
import p193o6.C9792d;
import p204q6.C10285a;
import p204q6.C10286b;
import p204q6.C10287c;

/* renamed from: org.fourthline.cling.transport.impl.o */
public class C10136o implements C8958h, ErrorHandler {

    /* renamed from: a */
    private static Logger f18729a = Logger.getLogger(C8958h.class.getName());

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo40766A(Document document, Element element, C10287c cVar, C9792d dVar) {
        mo40769D(document, element, dVar);
        cVar.mo41804b(mo40788u(document));
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo40767B(Document document, Element element, C10286b bVar, C9792d dVar) {
        mo40789v(document, mo40792x(document, element, bVar, dVar), dVar);
        bVar.mo41804b(mo40788u(document));
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo40768C(Document document, Element element, C10287c cVar, C9792d dVar) {
        mo40790w(document, mo40793y(document, element, cVar, dVar), dVar);
        cVar.mo41804b(mo40788u(document));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo40769D(Document document, Element element, C9792d dVar) {
        Element createElementNS = document.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "s:Fault");
        element.appendChild(createElementNS);
        C10025m.m24852c(document, createElementNS, "faultcode", "s:Client");
        C10025m.m24852c(document, createElementNS, "faultstring", "UPnPError");
        Element createElement = document.createElement("detail");
        createElementNS.appendChild(createElement);
        Element createElementNS2 = document.createElementNS("urn:schemas-upnp-org:control-1-0", "UPnPError");
        createElement.appendChild(createElementNS2);
        int errorCode = dVar.mo38969c().getErrorCode();
        String message = dVar.mo38969c().getMessage();
        Logger logger = f18729a;
        logger.fine("Writing fault element: " + errorCode + " - " + message);
        C10025m.m24852c(document, createElementNS2, "errorCode", Integer.toString(errorCode));
        C10025m.m24852c(document, createElementNS2, "errorDescription", message);
    }

    /* renamed from: a */
    public void mo36803a(C10287c cVar, C9792d dVar) {
        Logger logger = f18729a;
        logger.fine("Writing body of " + cVar + " for: " + dVar);
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            Element z = mo40794z(newDocument);
            if (dVar.mo38969c() != null) {
                mo40766A(newDocument, z, cVar, dVar);
            } else {
                mo40768C(newDocument, z, cVar, dVar);
            }
            if (f18729a.isLoggable(Level.FINER)) {
                f18729a.finer("===================================== SOAP BODY BEGIN ============================================");
                f18729a.finer(cVar.mo41805c());
                f18729a.finer("-===================================== SOAP BODY END ============================================");
            }
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e, e);
        }
    }

    /* renamed from: b */
    public void mo36804b(C10286b bVar, C9792d dVar) {
        Logger logger = f18729a;
        logger.fine("Writing body of " + bVar + " for: " + dVar);
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            mo40767B(newDocument, mo40794z(newDocument), bVar, dVar);
            if (f18729a.isLoggable(Level.FINER)) {
                f18729a.finer("===================================== SOAP BODY BEGIN ============================================");
                f18729a.finer(bVar.mo41805c());
                f18729a.finer("-===================================== SOAP BODY END ============================================");
            }
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e, e);
        }
    }

    /* renamed from: c */
    public void mo24995c(C10287c cVar, C9792d dVar) {
        Logger logger = f18729a;
        logger.fine("Reading body of " + cVar + " for: " + dVar);
        if (f18729a.isLoggable(Level.FINER)) {
            f18729a.finer("===================================== SOAP BODY BEGIN ============================================");
            f18729a.finer(cVar.mo41805c());
            f18729a.finer("-===================================== SOAP BODY END ============================================");
        }
        String i = mo40776i(cVar);
        try {
            DocumentBuilderFactory e = mo40770e();
            e.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = e.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            Document parse = newDocumentBuilder.parse(new InputSource(new StringReader(i)));
            Element p = mo40783p(parse);
            ActionException q = mo40784q(parse, p);
            if (q == null) {
                mo40786s(parse, p, cVar, dVar);
            } else {
                dVar.mo38976j(q);
            }
        } catch (Exception e2) {
            throw new UnsupportedDataException("Can't transform message payload: " + e2, e2, i);
        }
    }

    /* renamed from: d */
    public void mo24996d(C10286b bVar, C9792d dVar) {
        Logger logger = f18729a;
        logger.fine("Reading body of " + bVar + " for: " + dVar);
        if (f18729a.isLoggable(Level.FINER)) {
            f18729a.finer("===================================== SOAP BODY BEGIN ============================================");
            f18729a.finer(bVar.mo41805c());
            f18729a.finer("-===================================== SOAP BODY END ============================================");
        }
        String i = mo40776i(bVar);
        try {
            DocumentBuilderFactory e = mo40770e();
            e.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = e.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            Document parse = newDocumentBuilder.parse(new InputSource(new StringReader(i)));
            mo40785r(parse, mo40783p(parse), bVar, dVar);
        } catch (Exception e2) {
            throw new UnsupportedDataException("Can't transform message payload: " + e2, e2, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public DocumentBuilderFactory mo40770e() {
        return DocumentBuilderFactory.newInstance();
    }

    public void error(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C9790b mo40772f(ActionArgument actionArgument, String str) {
        try {
            return new C9790b(actionArgument, str);
        } catch (InvalidValueException e) {
            ErrorCode errorCode = ErrorCode.ARGUMENT_VALUE_INVALID;
            throw new ActionException(errorCode, "Wrong type or invalid value for '" + actionArgument.mo40464e() + "': " + e.getMessage(), (Throwable) e);
        }
    }

    public void fatalError(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Node mo40774g(List<Node> list, ActionArgument actionArgument) {
        for (Node next : list) {
            if (actionArgument.mo40466g(mo40777j(next))) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public List<Node> mo40775h(NodeList nodeList, ActionArgument[] actionArgumentArr) {
        ArrayList arrayList = new ArrayList();
        for (ActionArgument actionArgument : actionArgumentArr) {
            arrayList.add(actionArgument.mo40464e());
            arrayList.addAll(Arrays.asList(actionArgument.mo40461b()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            if (item.getNodeType() == 1 && arrayList.contains(mo40777j(item))) {
                arrayList2.add(item);
            }
        }
        if (arrayList2.size() >= actionArgumentArr.length) {
            return arrayList2;
        }
        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Invalid number of input or output arguments in XML message, expected " + actionArgumentArr.length + " but found " + arrayList2.size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo40776i(C10285a aVar) {
        if (aVar.mo41803a()) {
            return aVar.mo41805c().trim();
        }
        throw new UnsupportedDataException("Can't transform null or non-string/zero-length body of: " + aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo40777j(Node node) {
        return node.getPrefix() != null ? node.getNodeName().substring(node.getPrefix().length() + 1) : node.getNodeName();
    }

    /* renamed from: k */
    public void mo40778k(Element element, C9792d dVar) {
        dVar.mo38979m(mo40782o(element.getChildNodes(), dVar.mo38967a().mo40473c()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo40779l(Element element, C9792d dVar) {
        dVar.mo38981o(mo40782o(element.getChildNodes(), dVar.mo38967a().mo40476f()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Element mo40780m(Element element, C10286b bVar, C9792d dVar) {
        NodeList childNodes = element.getChildNodes();
        Logger logger = f18729a;
        logger.fine("Looking for action request element matching namespace:" + bVar.mo41806d());
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                String j = mo40777j(item);
                if (j.equals(dVar.mo38967a().mo40474d())) {
                    if (item.getNamespaceURI() == null || !item.getNamespaceURI().equals(bVar.mo41806d())) {
                        throw new UnsupportedDataException("Illegal or missing namespace on action request element: " + item);
                    }
                    Logger logger2 = f18729a;
                    logger2.fine("Reading action request element: " + j);
                    return (Element) item;
                }
            }
        }
        throw new UnsupportedDataException("Could not read action request element matching namespace: " + bVar.mo41806d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Element mo40781n(Element element, C9792d dVar) {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                String j = mo40777j(item);
                if (j.equals(dVar.mo38967a().mo40474d() + "Response")) {
                    Logger logger = f18729a;
                    logger.fine("Reading action response element: " + mo40777j(item));
                    return (Element) item;
                }
            }
        }
        f18729a.fine("Could not read action response element");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C9790b[] mo40782o(NodeList nodeList, ActionArgument[] actionArgumentArr) {
        List<Node> h = mo40775h(nodeList, actionArgumentArr);
        C9790b[] bVarArr = new C9790b[actionArgumentArr.length];
        int i = 0;
        while (i < actionArgumentArr.length) {
            ActionArgument actionArgument = actionArgumentArr[i];
            Node g = mo40774g(h, actionArgument);
            if (g != null) {
                Logger logger = f18729a;
                logger.fine("Reading action argument: " + actionArgument.mo40464e());
                bVarArr[i] = mo40772f(actionArgument, C10025m.m24861l(g));
                i++;
            } else {
                ErrorCode errorCode = ErrorCode.ARGUMENT_VALUE_INVALID;
                throw new ActionException(errorCode, "Could not find argument '" + actionArgument.mo40464e() + "' node");
            }
        }
        return bVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Element mo40783p(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement == null || !mo40777j(documentElement).equals("Envelope")) {
            throw new RuntimeException("Response root element was not 'Envelope'");
        }
        NodeList childNodes = documentElement.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && mo40777j(item).equals("Body")) {
                return (Element) item;
            }
        }
        throw new RuntimeException("Response envelope did not contain 'Body' child element");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public ActionException mo40784q(Document document, Element element) {
        return mo40787t(element);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo40785r(Document document, Element element, C10286b bVar, C9792d dVar) {
        mo40778k(mo40780m(element, bVar, dVar), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo40786s(Document document, Element element, C10287c cVar, C9792d dVar) {
        mo40779l(mo40781n(element, dVar), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public ActionException mo40787t(Element element) {
        NodeList childNodes = element.getChildNodes();
        String str = null;
        String str2 = null;
        boolean z = false;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            short s = 1;
            if (item.getNodeType() == 1 && mo40777j(item).equals("Fault")) {
                NodeList childNodes2 = item.getChildNodes();
                int i2 = 0;
                while (i2 < childNodes2.getLength()) {
                    Node item2 = childNodes2.item(i2);
                    if (item2.getNodeType() == s && mo40777j(item2).equals("detail")) {
                        NodeList childNodes3 = item2.getChildNodes();
                        int i3 = 0;
                        while (i3 < childNodes3.getLength()) {
                            Node item3 = childNodes3.item(i3);
                            if (item3.getNodeType() == s && mo40777j(item3).equals("UPnPError")) {
                                NodeList childNodes4 = item3.getChildNodes();
                                int i4 = 0;
                                while (i4 < childNodes4.getLength()) {
                                    Node item4 = childNodes4.item(i4);
                                    if (item4.getNodeType() == s) {
                                        if (mo40777j(item4).equals("errorCode")) {
                                            str = C10025m.m24861l(item4);
                                        }
                                        if (mo40777j(item4).equals("errorDescription")) {
                                            str2 = C10025m.m24861l(item4);
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
                ErrorCode byCode = ErrorCode.getByCode(intValue);
                if (byCode != null) {
                    f18729a.fine("Reading fault element: " + byCode.getCode() + " - " + str2);
                    return new ActionException(byCode, str2, false);
                }
                f18729a.fine("Reading fault element: " + intValue + " - " + str2);
                return new ActionException(intValue, str2);
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
    public String mo40788u(Document document) {
        String h = C10025m.m24857h(document);
        while (true) {
            if (!h.endsWith(IOUtils.LINE_SEPARATOR_UNIX) && !h.endsWith("\r")) {
                return h;
            }
            h = h.substring(0, h.length() - 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo40789v(Document document, Element element, C9792d dVar) {
        for (ActionArgument actionArgument : dVar.mo38967a().mo40473c()) {
            f18729a.fine("Writing action input argument: " + actionArgument.mo40464e());
            C10025m.m24852c(document, element, actionArgument.mo40464e(), dVar.mo38971e(actionArgument) != null ? dVar.mo38971e(actionArgument).toString() : "");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo40790w(Document document, Element element, C9792d dVar) {
        for (ActionArgument actionArgument : dVar.mo38967a().mo40476f()) {
            f18729a.fine("Writing action output argument: " + actionArgument.mo40464e());
            C10025m.m24852c(document, element, actionArgument.mo40464e(), dVar.mo38974h(actionArgument) != null ? dVar.mo38974h(actionArgument).toString() : "");
        }
    }

    public void warning(SAXParseException sAXParseException) {
        f18729a.warning(sAXParseException.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Element mo40792x(Document document, Element element, C10286b bVar, C9792d dVar) {
        Logger logger = f18729a;
        logger.fine("Writing action request element: " + dVar.mo38967a().mo40474d());
        String d = bVar.mo41806d();
        Element createElementNS = document.createElementNS(d, "u:" + dVar.mo38967a().mo40474d());
        element.appendChild(createElementNS);
        return createElementNS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Element mo40793y(Document document, Element element, C10287c cVar, C9792d dVar) {
        Logger logger = f18729a;
        logger.fine("Writing action response element: " + dVar.mo38967a().mo40474d());
        String d = cVar.mo41806d();
        Element createElementNS = document.createElementNS(d, "u:" + dVar.mo38967a().mo40474d() + "Response");
        element.appendChild(createElementNS);
        return createElementNS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Element mo40794z(Document document) {
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
