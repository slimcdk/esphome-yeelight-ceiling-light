package p164h.p165b.p166a.p237f.p239e;

import com.miot.service.manager.timer.TimerCodec;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;
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
import p164h.p165b.p166a.p237f.p238d.C11180d;
import p164h.p165b.p166a.p237f.p238d.C11181e;
import p164h.p165b.p166a.p237f.p238d.C11182f;
import p164h.p165b.p166a.p240h.C11217g;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.C11225o;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p165b.p166a.p240h.p248s.C11324d;
import p164h.p165b.p166a.p240h.p248s.C11326f;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p249t.C11343c;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11370h;
import p164h.p165b.p166a.p240h.p252w.C11372i;
import p164h.p165b.p166a.p240h.p252w.C11391r;
import p164h.p165b.p166a.p240h.p252w.C11396w;
import p164h.p165b.p166a.p240h.p252w.C11397x;
import p164h.p257c.p259b.C11495a;
import p164h.p257c.p259b.C11497c;

/* renamed from: h.b.a.f.e.h */
public class C11192h implements C11189e, ErrorHandler {

    /* renamed from: a */
    private static Logger f22257a = Logger.getLogger(C11189e.class.getName());

    /* renamed from: r */
    protected static URI m29145r(String str) {
        if (str.startsWith("www.")) {
            str = "http://" + str;
        }
        if (str.contains(" ")) {
            str = str.replaceAll(" ", "%20");
        }
        try {
            return URI.create(str);
        } catch (Throwable th) {
            f22257a.fine("Illegal URI, trying with ./ prefix: " + C11495a.m30173a(th));
            try {
                return URI.create("./" + str);
            } catch (IllegalArgumentException e) {
                f22257a.warning("Illegal URI '" + str + "', ignoring value: " + C11495a.m30173a(e));
                return null;
            }
        }
    }

    /* renamed from: a */
    public <D extends C11323c> D mo35549a(D d, String str) {
        if (str == null || str.length() == 0) {
            throw new C11188d("Null or empty descriptor");
        }
        try {
            Logger logger = f22257a;
            logger.fine("Populating device from XML descriptor: " + d);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            return mo35559e(d, newDocumentBuilder.parse(new InputSource(new StringReader(str.trim()))));
        } catch (C11223m e) {
            throw e;
        } catch (Exception e2) {
            throw new C11188d("Could not parse device descriptor: " + e2.toString(), e2);
        }
    }

    /* renamed from: b */
    public String mo35550b(C11323c cVar, C11343c cVar2, C11217g gVar) {
        try {
            Logger logger = f22257a;
            logger.fine("Generating XML descriptor from device model: " + cVar);
            return C11225o.m29321h(mo35557c(cVar, cVar2, gVar));
        } catch (Exception e) {
            throw new C11188d("Could not build DOM: " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public Document mo35557c(C11323c cVar, C11343c cVar2, C11217g gVar) {
        try {
            Logger logger = f22257a;
            logger.fine("Generating DOM from device model: " + cVar);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            mo35565i(gVar, cVar, newDocument, cVar2);
            return newDocument;
        } catch (Exception e) {
            throw new C11188d("Could not generate device descriptor: " + e.getMessage(), e);
        }
    }

    /* renamed from: d */
    public <D extends C11323c> D mo35558d(D d, C11180d dVar) {
        return dVar.mo35535a(d);
    }

    /* renamed from: e */
    public <D extends C11323c> D mo35559e(D d, Document document) {
        try {
            Logger logger = f22257a;
            logger.fine("Populating device from DOM: " + d);
            C11180d dVar = new C11180d();
            mo35571o(dVar, document.getDocumentElement());
            return mo35558d(d, dVar);
        } catch (C11223m e) {
            throw e;
        } catch (Exception e2) {
            throw new C11188d("Could not parse device DOM: " + e2.toString(), e2);
        }
    }

    public void error(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo35561f(C11217g gVar, C11323c cVar, Document document, Element element, C11343c cVar2) {
        Element a = C11225o.m29314a(document, element, C11185a.f22210f);
        C11225o.m29318e(document, a, C11185a.deviceType, cVar.mo35903t());
        C11324d m = cVar.mo35896m(cVar2);
        C11225o.m29318e(document, a, C11185a.friendlyName, m.mo35913d());
        if (m.mo35914e() != null) {
            C11225o.m29318e(document, a, C11185a.f22218n, m.mo35914e().mo35957a());
            C11225o.m29318e(document, a, C11185a.f22219o, m.mo35914e().mo35958b());
        }
        if (m.mo35915f() != null) {
            C11225o.m29318e(document, a, C11185a.f22220p, m.mo35915f().mo35959a());
            C11225o.m29318e(document, a, C11185a.f22221q, m.mo35915f().mo35960b());
            C11225o.m29318e(document, a, C11185a.f22222r, m.mo35915f().mo35961c());
            C11225o.m29318e(document, a, C11185a.f22223s, m.mo35915f().mo35962d());
        }
        C11225o.m29318e(document, a, C11185a.serialNumber, m.mo35918i());
        C11225o.m29318e(document, a, C11185a.UDN, cVar.mo35899p().mo35922b());
        C11225o.m29318e(document, a, C11185a.presentationURL, m.mo35916g());
        C11225o.m29318e(document, a, C11185a.UPC, m.mo35919j());
        if (m.mo35912c() != null) {
            for (C11372i g : m.mo35912c()) {
                C11225o.m29320g(document, a, "dlna:" + C11185a.X_DLNADOC, g, "urn:schemas-dlna-org:device-1-0");
            }
        }
        C11225o.m29320g(document, a, "dlna:" + C11185a.X_DLNACAP, m.mo35911b(), "urn:schemas-dlna-org:device-1-0");
        C11225o.m29320g(document, a, "sec:" + C11185a.ProductCap, m.mo35917h(), "http://www.sec.co.kr/dlna");
        C11225o.m29320g(document, a, "sec:" + C11185a.X_ProductCap, m.mo35917h(), "http://www.sec.co.kr/dlna");
        mo35564h(gVar, cVar, document, a);
        mo35566j(gVar, cVar, document, a);
        mo35563g(gVar, cVar, document, a, cVar2);
    }

    public void fatalError(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo35563g(C11217g gVar, C11323c cVar, Document document, Element element, C11343c cVar2) {
        if (cVar.mo35906v()) {
            Element a = C11225o.m29314a(document, element, C11185a.f22203O);
            for (C11323c f : cVar.mo35897n()) {
                mo35561f(gVar, f, document, a, cVar2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo35564h(C11217g gVar, C11323c cVar, Document document, Element element) {
        C11185a aVar;
        URI k;
        if (cVar.mo35907w()) {
            Element a = C11225o.m29314a(document, element, C11185a.iconList);
            for (C11326f fVar : cVar.mo35898o()) {
                Element a2 = C11225o.m29314a(document, a, C11185a.icon);
                C11225o.m29318e(document, a2, C11185a.mimetype, fVar.mo35932f());
                C11225o.m29318e(document, a2, C11185a.width, Integer.valueOf(fVar.mo35934h()));
                C11225o.m29318e(document, a2, C11185a.height, Integer.valueOf(fVar.mo35931e()));
                C11225o.m29318e(document, a2, C11185a.depth, Integer.valueOf(fVar.mo35929c()));
                if (cVar instanceof C11332l) {
                    aVar = C11185a.f22194B;
                    k = fVar.mo35933g();
                } else if (cVar instanceof C11327g) {
                    aVar = C11185a.f22194B;
                    k = gVar.mo35656k(fVar);
                }
                C11225o.m29318e(document, a2, aVar, k);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo35565i(C11217g gVar, C11323c cVar, Document document, C11343c cVar2) {
        Element createElementNS = document.createElementNS("urn:schemas-upnp-org:device-1-0", C11185a.f22205a.toString());
        document.appendChild(createElementNS);
        mo35567k(gVar, cVar, document, createElementNS);
        mo35561f(gVar, cVar, document, createElementNS, cVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo35566j(C11217g gVar, C11323c cVar, Document document, Element element) {
        C11185a aVar;
        URI j;
        if (cVar.mo35908x()) {
            Element a = C11225o.m29314a(document, element, C11185a.f22196H);
            for (C11335o oVar : cVar.mo35902s()) {
                Element a2 = C11225o.m29314a(document, a, C11185a.service);
                C11225o.m29318e(document, a2, C11185a.serviceType, oVar.mo35986g());
                C11225o.m29318e(document, a2, C11185a.serviceId, oVar.mo35985f());
                if (oVar instanceof C11334n) {
                    C11334n nVar = (C11334n) oVar;
                    C11225o.m29318e(document, a2, C11185a.f22200L, nVar.mo35977o());
                    C11225o.m29318e(document, a2, C11185a.controlURL, nVar.mo35976n());
                    aVar = C11185a.eventSubURL;
                    j = nVar.mo35978p();
                } else if (oVar instanceof C11328h) {
                    C11328h hVar = (C11328h) oVar;
                    C11225o.m29318e(document, a2, C11185a.f22200L, gVar.mo35650e(hVar));
                    C11225o.m29318e(document, a2, C11185a.controlURL, gVar.mo35648c(hVar));
                    aVar = C11185a.eventSubURL;
                    j = gVar.mo35655j(hVar);
                }
                C11225o.m29318e(document, a2, aVar, j);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo35567k(C11217g gVar, C11323c cVar, Document document, Element element) {
        Element a = C11225o.m29314a(document, element, C11185a.f22206b);
        C11225o.m29318e(document, a, C11185a.f22207c, Integer.valueOf(cVar.mo35905u().mo36016a()));
        C11225o.m29318e(document, a, C11185a.f22208d, Integer.valueOf(cVar.mo35905u().mo36017b()));
    }

    /* renamed from: l */
    public void mo35568l(C11180d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (C11185a.deviceType.mo35547a(item)) {
                    dVar.f22157d = C11225o.m29325l(item);
                } else if (C11185a.friendlyName.mo35547a(item)) {
                    dVar.f22158e = C11225o.m29325l(item);
                } else if (C11185a.f22218n.mo35547a(item)) {
                    dVar.f22159f = C11225o.m29325l(item);
                } else if (C11185a.f22219o.mo35547a(item)) {
                    dVar.f22160g = m29145r(C11225o.m29325l(item));
                } else if (C11185a.f22220p.mo35547a(item)) {
                    dVar.f22162i = C11225o.m29325l(item);
                } else if (C11185a.f22221q.mo35547a(item)) {
                    dVar.f22161h = C11225o.m29325l(item);
                } else if (C11185a.f22222r.mo35547a(item)) {
                    dVar.f22163j = C11225o.m29325l(item);
                } else if (C11185a.f22223s.mo35547a(item)) {
                    dVar.f22164k = m29145r(C11225o.m29325l(item));
                } else if (C11185a.presentationURL.mo35547a(item)) {
                    dVar.f22167n = m29145r(C11225o.m29325l(item));
                } else if (C11185a.UPC.mo35547a(item)) {
                    dVar.f22166m = C11225o.m29325l(item);
                } else if (C11185a.serialNumber.mo35547a(item)) {
                    dVar.f22165l = C11225o.m29325l(item);
                } else if (C11185a.UDN.mo35547a(item)) {
                    dVar.f22154a = C11365e0.m29787b(C11225o.m29325l(item));
                } else if (C11185a.iconList.mo35547a(item)) {
                    mo35570n(dVar, item);
                } else if (C11185a.f22196H.mo35547a(item)) {
                    mo35572p(dVar, item);
                } else if (C11185a.f22203O.mo35547a(item)) {
                    mo35569m(dVar, item);
                } else if (C11185a.X_DLNADOC.mo35547a(item) && "dlna".equals(item.getPrefix())) {
                    String l = C11225o.m29325l(item);
                    try {
                        dVar.f22168o.add(C11372i.m29802c(l));
                    } catch (C11391r unused) {
                        Logger logger = f22257a;
                        logger.info("Invalid X_DLNADOC value, ignoring value: " + l);
                    }
                } else if (C11185a.X_DLNACAP.mo35547a(item) && "dlna".equals(item.getPrefix())) {
                    dVar.f22169p = C11370h.m29798b(C11225o.m29325l(item));
                }
            }
        }
    }

    /* renamed from: m */
    public void mo35569m(C11180d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && C11185a.f22210f.mo35547a(item)) {
                C11180d dVar2 = new C11180d();
                dVar.f22172s.add(dVar2);
                mo35568l(dVar2, item);
            }
        }
    }

    /* renamed from: n */
    public void mo35570n(C11180d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && C11185a.icon.mo35547a(item)) {
                C11181e eVar = new C11181e();
                NodeList childNodes2 = item.getChildNodes();
                for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                    Node item2 = childNodes2.item(i2);
                    if (item2.getNodeType() == 1) {
                        if (C11185a.width.mo35547a(item2)) {
                            eVar.f22174b = Integer.valueOf(C11225o.m29325l(item2)).intValue();
                        } else if (C11185a.height.mo35547a(item2)) {
                            eVar.f22175c = Integer.valueOf(C11225o.m29325l(item2)).intValue();
                        } else if (C11185a.depth.mo35547a(item2)) {
                            String l = C11225o.m29325l(item2);
                            try {
                                eVar.f22176d = Integer.valueOf(l).intValue();
                            } catch (NumberFormatException e) {
                                Logger logger = f22257a;
                                logger.warning("Invalid icon depth '" + l + "', using 16 as default: " + e);
                                eVar.f22176d = 16;
                            }
                        } else if (C11185a.f22194B.mo35547a(item2)) {
                            eVar.f22177e = m29145r(C11225o.m29325l(item2));
                        } else if (C11185a.mimetype.mo35547a(item2)) {
                            try {
                                String l2 = C11225o.m29325l(item2);
                                eVar.f22173a = l2;
                                C11497c.m30177g(l2);
                            } catch (IllegalArgumentException unused) {
                                Logger logger2 = f22257a;
                                logger2.warning("Ignoring invalid icon mime type: " + eVar.f22173a);
                                eVar.f22173a = "";
                            }
                        }
                    }
                }
                dVar.f22170q.add(eVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo35571o(C11180d dVar, Element element) {
        if (element.getNamespaceURI() == null || !element.getNamespaceURI().equals("urn:schemas-upnp-org:device-1-0")) {
            Logger logger = f22257a;
            logger.warning("Wrong XML namespace declared on root element: " + element.getNamespaceURI());
        }
        if (element.getNodeName().equals(C11185a.f22205a.name())) {
            NodeList childNodes = element.getChildNodes();
            Node node = null;
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1) {
                    if (C11185a.f22206b.mo35547a(item)) {
                        mo35573q(dVar, item);
                    } else if (C11185a.URLBase.mo35547a(item)) {
                        try {
                            String l = C11225o.m29325l(item);
                            if (l != null && l.length() > 0) {
                                dVar.f22156c = new URL(l);
                            }
                        } catch (Exception e) {
                            throw new C11188d("Invalid URLBase: " + e.getMessage());
                        }
                    } else if (!C11185a.f22210f.mo35547a(item)) {
                        Logger logger2 = f22257a;
                        logger2.finer("Ignoring unknown element: " + item.getNodeName());
                    } else if (node == null) {
                        node = item;
                    } else {
                        throw new C11188d("Found multiple <device> elements in <root>");
                    }
                }
            }
            if (node != null) {
                mo35568l(dVar, node);
                return;
            }
            throw new C11188d("No <device> element in <root>");
        }
        throw new C11188d("Root element name is not <root>: " + element.getNodeName());
    }

    /* renamed from: p */
    public void mo35572p(C11180d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && C11185a.service.mo35547a(item)) {
                NodeList childNodes2 = item.getChildNodes();
                try {
                    C11182f fVar = new C11182f();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        Node item2 = childNodes2.item(i2);
                        if (item2.getNodeType() == 1) {
                            if (C11185a.serviceType.mo35547a(item2)) {
                                fVar.f22178a = C11397x.m29873e(C11225o.m29325l(item2));
                            } else if (C11185a.serviceId.mo35547a(item2)) {
                                fVar.f22179b = C11396w.m29870c(C11225o.m29325l(item2));
                            } else if (C11185a.f22200L.mo35547a(item2)) {
                                fVar.f22180c = m29145r(C11225o.m29325l(item2));
                            } else if (C11185a.controlURL.mo35547a(item2)) {
                                fVar.f22181d = m29145r(C11225o.m29325l(item2));
                            } else if (C11185a.eventSubURL.mo35547a(item2)) {
                                fVar.f22182e = m29145r(C11225o.m29325l(item2));
                            }
                        }
                    }
                    dVar.f22171r.add(fVar);
                } catch (C11391r e) {
                    Logger logger = f22257a;
                    logger.warning("UPnP specification violation, skipping invalid service declaration. " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: q */
    public void mo35573q(C11180d dVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (C11185a.f22207c.mo35547a(item)) {
                    String trim = C11225o.m29325l(item).trim();
                    if (!trim.equals(TimerCodec.ENABLE)) {
                        Logger logger = f22257a;
                        logger.warning("Unsupported UDA major version, ignoring: " + trim);
                        trim = TimerCodec.ENABLE;
                    }
                    dVar.f22155b.f22191a = Integer.valueOf(trim).intValue();
                } else if (C11185a.f22208d.mo35547a(item)) {
                    String trim2 = C11225o.m29325l(item).trim();
                    if (!trim2.equals(TimerCodec.DISENABLE)) {
                        Logger logger2 = f22257a;
                        logger2.warning("Unsupported UDA minor version, ignoring: " + trim2);
                        trim2 = TimerCodec.DISENABLE;
                    }
                    dVar.f22155b.f22192b = Integer.valueOf(trim2).intValue();
                }
            }
        }
    }

    public void warning(SAXParseException sAXParseException) {
        f22257a.warning(sAXParseException.toString());
    }
}
