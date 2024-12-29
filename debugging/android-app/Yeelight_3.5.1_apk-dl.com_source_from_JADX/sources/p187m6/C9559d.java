package p187m6;

import com.miot.service.manager.timer.TimerCodec;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.fourthline.cling.binding.xml.Descriptor$Device$ELEMENT;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.C10019g;
import org.fourthline.cling.model.C10025m;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.meta.C10068c;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.types.C10087h;
import org.fourthline.cling.model.types.C10097r;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10105z;
import org.fourthline.cling.model.types.DLNADoc;
import org.fourthline.cling.model.types.InvalidValueException;
import org.seamless.util.C10243a;
import org.seamless.util.C10245c;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import p183l6.C9538d;
import p183l6.C9539e;
import p183l6.C9540f;
import p214t6.C10401a;
import p214t6.C10403c;
import p214t6.C10404d;
import p214t6.C10407g;
import p214t6.C10409i;
import p218u6.C10542c;

/* renamed from: m6.d */
public class C9559d implements C9556a, ErrorHandler {

    /* renamed from: a */
    private static Logger f17457a = Logger.getLogger(C9556a.class.getName());

    /* renamed from: r */
    protected static URI m23266r(String str) {
        if (str.startsWith("www.")) {
            str = "http://" + str;
        }
        if (str.contains(" ")) {
            str = str.replaceAll(" ", "%20");
        }
        try {
            return URI.create(str);
        } catch (Throwable th) {
            f17457a.fine("Illegal URI, trying with ./ prefix: " + C10243a.m25753a(th));
            try {
                return URI.create("./" + str);
            } catch (IllegalArgumentException e) {
                f17457a.warning("Illegal URI '" + str + "', ignoring value: " + C10243a.m25753a(e));
                return null;
            }
        }
    }

    /* renamed from: a */
    public <D extends C10067b> D mo38534a(D d, String str) {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            Logger logger = f17457a;
            logger.fine("Populating device from XML descriptor: " + d);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            return mo38544e(d, newDocumentBuilder.parse(new InputSource(new StringReader(str.trim()))));
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            throw new DescriptorBindingException("Could not parse device descriptor: " + e2.toString(), e2);
        }
    }

    /* renamed from: b */
    public String mo38535b(C10067b bVar, C10542c cVar, C10019g gVar) {
        try {
            Logger logger = f17457a;
            logger.fine("Generating XML descriptor from device model: " + bVar);
            return C10025m.m24857h(mo38542c(bVar, cVar, gVar));
        } catch (Exception e) {
            throw new DescriptorBindingException("Could not build DOM: " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public Document mo38542c(C10067b bVar, C10542c cVar, C10019g gVar) {
        try {
            Logger logger = f17457a;
            logger.fine("Generating DOM from device model: " + bVar);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            mo38550i(gVar, bVar, newDocument, cVar);
            return newDocument;
        } catch (Exception e) {
            throw new DescriptorBindingException("Could not generate device descriptor: " + e.getMessage(), e);
        }
    }

    /* renamed from: d */
    public <D extends C10067b> D mo38543d(D d, C9538d dVar) {
        return dVar.mo38497a(d);
    }

    /* renamed from: e */
    public <D extends C10067b> D mo38544e(D d, Document document) {
        try {
            Logger logger = f17457a;
            logger.fine("Populating device from DOM: " + d);
            C9538d dVar = new C9538d();
            mo38556o(dVar, document.getDocumentElement());
            return mo38543d(d, dVar);
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            throw new DescriptorBindingException("Could not parse device DOM: " + e2.toString(), e2);
        }
    }

    public void error(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo38546f(C10019g gVar, C10067b bVar, Document document, Element element, C10542c cVar) {
        Element a = C10025m.m24850a(document, element, Descriptor$Device$ELEMENT.device);
        C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.deviceType, bVar.mo40510t());
        C10401a m = bVar.mo40503m(cVar);
        C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.friendlyName, m.mo42049d());
        if (m.mo42050e() != null) {
            C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.manufacturer, m.mo42050e().mo42081a());
            C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.manufacturerURL, m.mo42050e().mo42082b());
        }
        if (m.mo42051f() != null) {
            C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.modelDescription, m.mo42051f().mo42083a());
            C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.modelName, m.mo42051f().mo42084b());
            C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.modelNumber, m.mo42051f().mo42085c());
            C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.modelURL, m.mo42051f().mo42086d());
        }
        C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.serialNumber, m.mo42054i());
        C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.UDN, bVar.mo40506p().mo42058b());
        C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.presentationURL, m.mo42052g());
        C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.UPC, m.mo42055j());
        if (m.mo42048c() != null) {
            for (DLNADoc g : m.mo42048c()) {
                C10025m.m24856g(document, a, "dlna:" + Descriptor$Device$ELEMENT.X_DLNADOC, g, "urn:schemas-dlna-org:device-1-0");
            }
        }
        C10025m.m24856g(document, a, "dlna:" + Descriptor$Device$ELEMENT.X_DLNACAP, m.mo42047b(), "urn:schemas-dlna-org:device-1-0");
        C10025m.m24856g(document, a, "sec:" + Descriptor$Device$ELEMENT.ProductCap, m.mo42053h(), "http://www.sec.co.kr/dlna");
        C10025m.m24856g(document, a, "sec:" + Descriptor$Device$ELEMENT.X_ProductCap, m.mo42053h(), "http://www.sec.co.kr/dlna");
        mo38549h(gVar, bVar, document, a);
        mo38551j(gVar, bVar, document, a);
        mo38548g(gVar, bVar, document, a, cVar);
    }

    public void fatalError(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo38548g(C10019g gVar, C10067b bVar, Document document, Element element, C10542c cVar) {
        if (bVar.mo40513v()) {
            Element a = C10025m.m24850a(document, element, Descriptor$Device$ELEMENT.deviceList);
            for (C10067b f : bVar.mo40504n()) {
                mo38546f(gVar, f, document, a, cVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo38549h(C10019g gVar, C10067b bVar, Document document, Element element) {
        Descriptor$Device$ELEMENT descriptor$Device$ELEMENT;
        URI k;
        if (bVar.mo40514w()) {
            Element a = C10025m.m24850a(document, element, Descriptor$Device$ELEMENT.iconList);
            for (C10068c cVar : bVar.mo40505o()) {
                Element a2 = C10025m.m24850a(document, a, Descriptor$Device$ELEMENT.icon);
                C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.mimetype, cVar.mo40522f());
                C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.width, Integer.valueOf(cVar.mo40524h()));
                C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.height, Integer.valueOf(cVar.mo40521e()));
                C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.depth, Integer.valueOf(cVar.mo40519c()));
                if (bVar instanceof C10407g) {
                    descriptor$Device$ELEMENT = Descriptor$Device$ELEMENT.url;
                    k = cVar.mo40523g();
                } else if (bVar instanceof C10403c) {
                    descriptor$Device$ELEMENT = Descriptor$Device$ELEMENT.url;
                    k = gVar.mo40361k(cVar);
                }
                C10025m.m24854e(document, a2, descriptor$Device$ELEMENT, k);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo38550i(C10019g gVar, C10067b bVar, Document document, C10542c cVar) {
        Element createElementNS = document.createElementNS("urn:schemas-upnp-org:device-1-0", Descriptor$Device$ELEMENT.root.toString());
        document.appendChild(createElementNS);
        mo38552k(gVar, bVar, document, createElementNS);
        mo38546f(gVar, bVar, document, createElementNS, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo38551j(C10019g gVar, C10067b bVar, Document document, Element element) {
        Descriptor$Device$ELEMENT descriptor$Device$ELEMENT;
        URI j;
        if (bVar.mo40515x()) {
            Element a = C10025m.m24850a(document, element, Descriptor$Device$ELEMENT.serviceList);
            for (C10070e eVar : bVar.mo40509s()) {
                Element a2 = C10025m.m24850a(document, a, Descriptor$Device$ELEMENT.service);
                C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.serviceType, eVar.mo40534g());
                C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.serviceId, eVar.mo40533f());
                if (eVar instanceof C10409i) {
                    C10409i iVar = (C10409i) eVar;
                    C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.SCPDURL, iVar.mo42101o());
                    C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.controlURL, iVar.mo42100n());
                    descriptor$Device$ELEMENT = Descriptor$Device$ELEMENT.eventSubURL;
                    j = iVar.mo42102p();
                } else if (eVar instanceof C10404d) {
                    C10404d dVar = (C10404d) eVar;
                    C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.SCPDURL, gVar.mo40355e(dVar));
                    C10025m.m24854e(document, a2, Descriptor$Device$ELEMENT.controlURL, gVar.mo40353c(dVar));
                    descriptor$Device$ELEMENT = Descriptor$Device$ELEMENT.eventSubURL;
                    j = gVar.mo40360j(dVar);
                }
                C10025m.m24854e(document, a2, descriptor$Device$ELEMENT, j);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo38552k(C10019g gVar, C10067b bVar, Document document, Element element) {
        Element a = C10025m.m24850a(document, element, Descriptor$Device$ELEMENT.specVersion);
        C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.major, Integer.valueOf(bVar.mo40512u().mo42119a()));
        C10025m.m24854e(document, a, Descriptor$Device$ELEMENT.minor, Integer.valueOf(bVar.mo40512u().mo42120b()));
    }

    /* renamed from: l */
    public void mo38553l(C9538d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (Descriptor$Device$ELEMENT.deviceType.equals(item)) {
                    dVar.f17381d = C10025m.m24861l(item);
                } else if (Descriptor$Device$ELEMENT.friendlyName.equals(item)) {
                    dVar.f17382e = C10025m.m24861l(item);
                } else if (Descriptor$Device$ELEMENT.manufacturer.equals(item)) {
                    dVar.f17383f = C10025m.m24861l(item);
                } else if (Descriptor$Device$ELEMENT.manufacturerURL.equals(item)) {
                    dVar.f17384g = m23266r(C10025m.m24861l(item));
                } else if (Descriptor$Device$ELEMENT.modelDescription.equals(item)) {
                    dVar.f17386i = C10025m.m24861l(item);
                } else if (Descriptor$Device$ELEMENT.modelName.equals(item)) {
                    dVar.f17385h = C10025m.m24861l(item);
                } else if (Descriptor$Device$ELEMENT.modelNumber.equals(item)) {
                    dVar.f17387j = C10025m.m24861l(item);
                } else if (Descriptor$Device$ELEMENT.modelURL.equals(item)) {
                    dVar.f17388k = m23266r(C10025m.m24861l(item));
                } else if (Descriptor$Device$ELEMENT.presentationURL.equals(item)) {
                    dVar.f17391n = m23266r(C10025m.m24861l(item));
                } else if (Descriptor$Device$ELEMENT.UPC.equals(item)) {
                    dVar.f17390m = C10025m.m24861l(item);
                } else if (Descriptor$Device$ELEMENT.serialNumber.equals(item)) {
                    dVar.f17389l = C10025m.m24861l(item);
                } else if (Descriptor$Device$ELEMENT.UDN.equals(item)) {
                    dVar.f17378a = C10105z.m25185b(C10025m.m24861l(item));
                } else if (Descriptor$Device$ELEMENT.iconList.equals(item)) {
                    mo38555n(dVar, item);
                } else if (Descriptor$Device$ELEMENT.serviceList.equals(item)) {
                    mo38557p(dVar, item);
                } else if (Descriptor$Device$ELEMENT.deviceList.equals(item)) {
                    mo38554m(dVar, item);
                } else if (Descriptor$Device$ELEMENT.X_DLNADOC.equals(item) && "dlna".equals(item.getPrefix())) {
                    String l = C10025m.m24861l(item);
                    try {
                        dVar.f17392o.add(DLNADoc.m25068c(l));
                    } catch (InvalidValueException unused) {
                        Logger logger = f17457a;
                        logger.info("Invalid X_DLNADOC value, ignoring value: " + l);
                    }
                } else if (Descriptor$Device$ELEMENT.X_DLNACAP.equals(item) && "dlna".equals(item.getPrefix())) {
                    dVar.f17393p = C10087h.m25126b(C10025m.m24861l(item));
                }
            }
        }
    }

    /* renamed from: m */
    public void mo38554m(C9538d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && Descriptor$Device$ELEMENT.device.equals(item)) {
                C9538d dVar2 = new C9538d();
                dVar.f17396s.add(dVar2);
                mo38553l(dVar2, item);
            }
        }
    }

    /* renamed from: n */
    public void mo38555n(C9538d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && Descriptor$Device$ELEMENT.icon.equals(item)) {
                C9539e eVar = new C9539e();
                NodeList childNodes2 = item.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    Node item2 = childNodes2.item(i2);
                    if (item2.getNodeType() == 1) {
                        if (Descriptor$Device$ELEMENT.width.equals(item2)) {
                            eVar.f17398b = Integer.valueOf(C10025m.m24861l(item2)).intValue();
                        } else if (Descriptor$Device$ELEMENT.height.equals(item2)) {
                            eVar.f17399c = Integer.valueOf(C10025m.m24861l(item2)).intValue();
                        } else if (Descriptor$Device$ELEMENT.depth.equals(item2)) {
                            String l = C10025m.m24861l(item2);
                            try {
                                eVar.f17400d = Integer.valueOf(l).intValue();
                            } catch (NumberFormatException e) {
                                Logger logger = f17457a;
                                logger.warning("Invalid icon depth '" + l + "', using 16 as default: " + e);
                                eVar.f17400d = 16;
                            }
                        } else if (Descriptor$Device$ELEMENT.url.equals(item2)) {
                            eVar.f17401e = m23266r(C10025m.m24861l(item2));
                        } else if (Descriptor$Device$ELEMENT.mimetype.equals(item2)) {
                            try {
                                String l2 = C10025m.m24861l(item2);
                                eVar.f17397a = l2;
                                C10245c.m25757g(l2);
                            } catch (IllegalArgumentException unused) {
                                Logger logger2 = f17457a;
                                logger2.warning("Ignoring invalid icon mime type: " + eVar.f17397a);
                                eVar.f17397a = "";
                            }
                        }
                    }
                }
                dVar.f17394q.add(eVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo38556o(C9538d dVar, Element element) {
        if (element.getNamespaceURI() == null || !element.getNamespaceURI().equals("urn:schemas-upnp-org:device-1-0")) {
            Logger logger = f17457a;
            logger.warning("Wrong XML namespace declared on root element: " + element.getNamespaceURI());
        }
        if (element.getNodeName().equals(Descriptor$Device$ELEMENT.root.name())) {
            NodeList childNodes = element.getChildNodes();
            Node node = null;
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1) {
                    if (Descriptor$Device$ELEMENT.specVersion.equals(item)) {
                        mo38558q(dVar, item);
                    } else if (Descriptor$Device$ELEMENT.URLBase.equals(item)) {
                        try {
                            String l = C10025m.m24861l(item);
                            if (l != null && l.length() > 0) {
                                dVar.f17380c = new URL(l);
                            }
                        } catch (Exception e) {
                            throw new DescriptorBindingException("Invalid URLBase: " + e.getMessage());
                        }
                    } else if (!Descriptor$Device$ELEMENT.device.equals(item)) {
                        Logger logger2 = f17457a;
                        logger2.finer("Ignoring unknown element: " + item.getNodeName());
                    } else if (node == null) {
                        node = item;
                    } else {
                        throw new DescriptorBindingException("Found multiple <device> elements in <root>");
                    }
                }
            }
            if (node != null) {
                mo38553l(dVar, node);
                return;
            }
            throw new DescriptorBindingException("No <device> element in <root>");
        }
        throw new DescriptorBindingException("Root element name is not <root>: " + element.getNodeName());
    }

    /* renamed from: p */
    public void mo38557p(C9538d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && Descriptor$Device$ELEMENT.service.equals(item)) {
                NodeList childNodes2 = item.getChildNodes();
                try {
                    C9540f fVar = new C9540f();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        Node item2 = childNodes2.item(i2);
                        if (item2.getNodeType() == 1) {
                            if (Descriptor$Device$ELEMENT.serviceType.equals(item2)) {
                                fVar.f17402a = C10098s.m25165e(C10025m.m24861l(item2));
                            } else if (Descriptor$Device$ELEMENT.serviceId.equals(item2)) {
                                fVar.f17403b = C10097r.m25162c(C10025m.m24861l(item2));
                            } else if (Descriptor$Device$ELEMENT.SCPDURL.equals(item2)) {
                                fVar.f17404c = m23266r(C10025m.m24861l(item2));
                            } else if (Descriptor$Device$ELEMENT.controlURL.equals(item2)) {
                                fVar.f17405d = m23266r(C10025m.m24861l(item2));
                            } else if (Descriptor$Device$ELEMENT.eventSubURL.equals(item2)) {
                                fVar.f17406e = m23266r(C10025m.m24861l(item2));
                            }
                        }
                    }
                    dVar.f17395r.add(fVar);
                } catch (InvalidValueException e) {
                    Logger logger = f17457a;
                    logger.warning("UPnP specification violation, skipping invalid service declaration. " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: q */
    public void mo38558q(C9538d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (Descriptor$Device$ELEMENT.major.equals(item)) {
                    String trim = C10025m.m24861l(item).trim();
                    if (!trim.equals(TimerCodec.ENABLE)) {
                        Logger logger = f17457a;
                        logger.warning("Unsupported UDA major version, ignoring: " + trim);
                        trim = TimerCodec.ENABLE;
                    }
                    dVar.f17379b.f17415a = Integer.valueOf(trim).intValue();
                } else if (Descriptor$Device$ELEMENT.minor.equals(item)) {
                    String trim2 = C10025m.m24861l(item).trim();
                    if (!trim2.equals(TimerCodec.DISENABLE)) {
                        Logger logger2 = f17457a;
                        logger2.warning("Unsupported UDA minor version, ignoring: " + trim2);
                        trim2 = TimerCodec.DISENABLE;
                    }
                    dVar.f17379b.f17416b = Integer.valueOf(trim2).intValue();
                }
            }
        }
    }

    public void warning(SAXParseException sAXParseException) {
        f17457a.warning(sAXParseException.toString());
    }
}
