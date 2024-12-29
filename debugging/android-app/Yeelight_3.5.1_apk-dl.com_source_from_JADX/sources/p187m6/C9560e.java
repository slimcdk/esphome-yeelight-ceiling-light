package p187m6;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.fourthline.cling.binding.xml.Descriptor$Service$ATTRIBUTE;
import org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.C10025m;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.types.C10085g;
import org.fourthline.cling.model.types.Datatype;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import p183l6.C9535a;
import p183l6.C9536b;
import p183l6.C9537c;
import p183l6.C9540f;
import p183l6.C9541g;
import p214t6.C10409i;
import p214t6.C10411k;

/* renamed from: m6.e */
public class C9560e implements C9558c, ErrorHandler {

    /* renamed from: a */
    private static Logger f17458a = Logger.getLogger(C9558c.class.getName());

    /* renamed from: f */
    private void m23284f(C10066a aVar, Document document, Element element) {
        Element a = C10025m.m24850a(document, element, Descriptor$Service$ELEMENT.action);
        C10025m.m24854e(document, a, Descriptor$Service$ELEMENT.name, aVar.mo40474d());
        if (aVar.mo40478h()) {
            Element a2 = C10025m.m24850a(document, a, Descriptor$Service$ELEMENT.argumentList);
            for (ActionArgument g : aVar.mo40471a()) {
                m23285g(g, document, a2);
            }
        }
    }

    /* renamed from: g */
    private void m23285g(ActionArgument actionArgument, Document document, Element element) {
        Element a = C10025m.m24850a(document, element, Descriptor$Service$ELEMENT.argument);
        C10025m.m24854e(document, a, Descriptor$Service$ELEMENT.name, actionArgument.mo40464e());
        C10025m.m24854e(document, a, Descriptor$Service$ELEMENT.direction, actionArgument.mo40463d().toString().toLowerCase(Locale.ROOT));
        if (actionArgument.mo40467h()) {
            Logger logger = f17458a;
            logger.warning("UPnP specification violation: Not producing <retval> element to be compatible with WMP12: " + actionArgument);
        }
        C10025m.m24854e(document, a, Descriptor$Service$ELEMENT.relatedStateVariable, actionArgument.mo40465f());
    }

    /* renamed from: h */
    private void m23286h(C10070e eVar, Document document, Element element) {
        Element a = C10025m.m24850a(document, element, Descriptor$Service$ELEMENT.actionList);
        for (C10066a aVar : eVar.mo40529b()) {
            if (!aVar.mo40474d().equals("QueryStateVariable")) {
                m23284f(aVar, document, a);
            }
        }
    }

    /* renamed from: i */
    private void m23287i(C10070e eVar, Document document) {
        Element createElementNS = document.createElementNS("urn:schemas-upnp-org:service-1-0", Descriptor$Service$ELEMENT.scpd.toString());
        document.appendChild(createElementNS);
        m23289k(eVar, document, createElementNS);
        if (eVar.mo40537j()) {
            m23286h(eVar, document, createElementNS);
        }
        m23288j(eVar, document, createElementNS);
    }

    /* renamed from: j */
    private void m23288j(C10070e eVar, Document document, Element element) {
        Element a = C10025m.m24850a(document, element, Descriptor$Service$ELEMENT.serviceStateTable);
        for (C10071f l : eVar.mo40536i()) {
            m23290l(l, document, a);
        }
    }

    /* renamed from: k */
    private void m23289k(C10070e eVar, Document document, Element element) {
        Element a = C10025m.m24850a(document, element, Descriptor$Service$ELEMENT.specVersion);
        C10025m.m24854e(document, a, Descriptor$Service$ELEMENT.major, Integer.valueOf(eVar.mo40531d().mo40512u().mo42119a()));
        C10025m.m24854e(document, a, Descriptor$Service$ELEMENT.minor, Integer.valueOf(eVar.mo40531d().mo40512u().mo42120b()));
    }

    /* renamed from: l */
    private void m23290l(C10071f fVar, Document document, Element element) {
        String str;
        Descriptor$Service$ELEMENT descriptor$Service$ELEMENT;
        String str2;
        String str3;
        Element a = C10025m.m24850a(document, element, Descriptor$Service$ELEMENT.stateVariable);
        C10025m.m24854e(document, a, Descriptor$Service$ELEMENT.name, fVar.mo40543b());
        if (fVar.mo40545d().mo42116d() instanceof C10085g) {
            descriptor$Service$ELEMENT = Descriptor$Service$ELEMENT.dataType;
            str = ((C10085g) fVar.mo40545d().mo42116d()).mo40598i();
        } else {
            descriptor$Service$ELEMENT = Descriptor$Service$ELEMENT.dataType;
            str = fVar.mo40545d().mo42116d().mo40560e().getDescriptorName();
        }
        C10025m.m24854e(document, a, descriptor$Service$ELEMENT, str);
        C10025m.m24854e(document, a, Descriptor$Service$ELEMENT.defaultValue, fVar.mo40545d().mo42117e());
        if (fVar.mo40542a().mo42112c()) {
            str3 = Descriptor$Service$ATTRIBUTE.sendEvents.toString();
            str2 = "yes";
        } else {
            str3 = Descriptor$Service$ATTRIBUTE.sendEvents.toString();
            str2 = "no";
        }
        a.setAttribute(str3, str2);
        if (fVar.mo40545d().mo42115c() != null) {
            Element a2 = C10025m.m24850a(document, a, Descriptor$Service$ELEMENT.allowedValueList);
            for (String e : fVar.mo40545d().mo42115c()) {
                C10025m.m24854e(document, a2, Descriptor$Service$ELEMENT.allowedValue, e);
            }
        }
        if (fVar.mo40545d().mo42114b() != null) {
            Element a3 = C10025m.m24850a(document, a, Descriptor$Service$ELEMENT.allowedValueRange);
            C10025m.m24854e(document, a3, Descriptor$Service$ELEMENT.minimum, Long.valueOf(fVar.mo40545d().mo42114b().mo42105b()));
            C10025m.m24854e(document, a3, Descriptor$Service$ELEMENT.maximum, Long.valueOf(fVar.mo40545d().mo42114b().mo42104a()));
            if (fVar.mo40545d().mo42114b().mo42106c() >= 1) {
                C10025m.m24854e(document, a3, Descriptor$Service$ELEMENT.step, Long.valueOf(fVar.mo40545d().mo42114b().mo42106c()));
            }
        }
    }

    /* renamed from: a */
    public <S extends C10070e> S mo38540a(S s, String str) {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            Logger logger = f17458a;
            logger.fine("Populating service from XML descriptor: " + s);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(this);
            return mo38562e(s, newDocumentBuilder.parse(new InputSource(new StringReader(str.trim()))));
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            throw new DescriptorBindingException("Could not parse service descriptor: " + e2.toString(), e2);
        }
    }

    /* renamed from: b */
    public String mo38541b(C10070e eVar) {
        try {
            Logger logger = f17458a;
            logger.fine("Generating XML descriptor from service model: " + eVar);
            return C10025m.m24857h(mo38560c(eVar));
        } catch (Exception e) {
            throw new DescriptorBindingException("Could not build DOM: " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public Document mo38560c(C10070e eVar) {
        try {
            Logger logger = f17458a;
            logger.fine("Generating XML descriptor from service model: " + eVar);
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            m23287i(eVar, newDocument);
            return newDocument;
        } catch (Exception e) {
            throw new DescriptorBindingException("Could not generate service descriptor: " + e.getMessage(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public <S extends C10070e> S mo38561d(S s, C9540f fVar) {
        return fVar.mo38505a(s.mo40531d());
    }

    /* renamed from: e */
    public <S extends C10070e> S mo38562e(S s, Document document) {
        try {
            Logger logger = f17458a;
            logger.fine("Populating service from DOM: " + s);
            C9540f fVar = new C9540f();
            mo38568p(fVar, s);
            mo38569q(fVar, document.getDocumentElement());
            return mo38561d(s, fVar);
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            throw new DescriptorBindingException("Could not parse service DOM: " + e2.toString(), e2);
        }
    }

    public void error(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    public void fatalError(SAXParseException sAXParseException) {
        throw sAXParseException;
    }

    /* renamed from: m */
    public void mo38565m(C9535a aVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (Descriptor$Service$ELEMENT.name.equals(item)) {
                    aVar.f17369a = C10025m.m24861l(item);
                } else if (Descriptor$Service$ELEMENT.argumentList.equals(item)) {
                    NodeList childNodes2 = item.getChildNodes();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        Node item2 = childNodes2.item(i2);
                        if (item2.getNodeType() == 1) {
                            C9536b bVar = new C9536b();
                            mo38566n(bVar, item2);
                            aVar.f17370b.add(bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public void mo38566n(C9536b bVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (Descriptor$Service$ELEMENT.name.equals(item)) {
                    bVar.f17371a = C10025m.m24861l(item);
                } else if (Descriptor$Service$ELEMENT.direction.equals(item)) {
                    String l = C10025m.m24861l(item);
                    try {
                        bVar.f17373c = ActionArgument.Direction.valueOf(l.toUpperCase(Locale.ROOT));
                    } catch (IllegalArgumentException unused) {
                        Logger logger = f17458a;
                        logger.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + l);
                        bVar.f17373c = ActionArgument.Direction.IN;
                    }
                } else if (Descriptor$Service$ELEMENT.relatedStateVariable.equals(item)) {
                    bVar.f17372b = C10025m.m24861l(item);
                } else if (Descriptor$Service$ELEMENT.retval.equals(item)) {
                    bVar.f17374d = true;
                }
            }
        }
    }

    /* renamed from: o */
    public void mo38567o(C9540f fVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && Descriptor$Service$ELEMENT.action.equals(item)) {
                C9535a aVar = new C9535a();
                mo38565m(aVar, item);
                fVar.f17407f.add(aVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo38568p(C9540f fVar, C10070e eVar) {
        fVar.f17403b = eVar.mo40533f();
        fVar.f17402a = eVar.mo40534g();
        if (eVar instanceof C10409i) {
            C10409i iVar = (C10409i) eVar;
            fVar.f17405d = iVar.mo42100n();
            fVar.f17406e = iVar.mo42102p();
            fVar.f17404c = iVar.mo42101o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo38569q(C9540f fVar, Element element) {
        if (Descriptor$Service$ELEMENT.scpd.equals(element)) {
            NodeList childNodes = element.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1 && !Descriptor$Service$ELEMENT.specVersion.equals(item)) {
                    if (Descriptor$Service$ELEMENT.actionList.equals(item)) {
                        mo38567o(fVar, item);
                    } else if (Descriptor$Service$ELEMENT.serviceStateTable.equals(item)) {
                        mo38570r(fVar, item);
                    } else {
                        Logger logger = f17458a;
                        logger.finer("Ignoring unknown element: " + item.getNodeName());
                    }
                }
            }
            return;
        }
        throw new DescriptorBindingException("Root element name is not <scpd>: " + element.getNodeName());
    }

    /* renamed from: r */
    public void mo38570r(C9540f fVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1 && Descriptor$Service$ELEMENT.stateVariable.equals(item)) {
                C9541g gVar = new C9541g();
                mo38571s(gVar, (Element) item);
                fVar.f17408g.add(gVar);
            }
        }
    }

    /* renamed from: s */
    public void mo38571s(C9541g gVar, Element element) {
        gVar.f17414f = new C10411k(element.getAttribute("sendEvents") != null && element.getAttribute(Descriptor$Service$ATTRIBUTE.sendEvents.toString()).toUpperCase(Locale.ROOT).equals("YES"));
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                if (Descriptor$Service$ELEMENT.name.equals(item)) {
                    gVar.f17409a = C10025m.m24861l(item);
                } else if (Descriptor$Service$ELEMENT.dataType.equals(item)) {
                    String l = C10025m.m24861l(item);
                    Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(l);
                    gVar.f17410b = byDescriptorName != null ? byDescriptorName.getDatatype() : new C10085g(l);
                } else if (Descriptor$Service$ELEMENT.defaultValue.equals(item)) {
                    gVar.f17411c = C10025m.m24861l(item);
                } else if (Descriptor$Service$ELEMENT.allowedValueList.equals(item)) {
                    ArrayList arrayList = new ArrayList();
                    NodeList childNodes2 = item.getChildNodes();
                    for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                        Node item2 = childNodes2.item(i2);
                        if (item2.getNodeType() == 1 && Descriptor$Service$ELEMENT.allowedValue.equals(item2)) {
                            arrayList.add(C10025m.m24861l(item2));
                        }
                    }
                    gVar.f17412d = arrayList;
                } else if (Descriptor$Service$ELEMENT.allowedValueRange.equals(item)) {
                    C9537c cVar = new C9537c();
                    NodeList childNodes3 = item.getChildNodes();
                    for (int i3 = 0; i3 < childNodes3.getLength(); i3++) {
                        Node item3 = childNodes3.item(i3);
                        if (item3.getNodeType() == 1) {
                            if (Descriptor$Service$ELEMENT.minimum.equals(item3)) {
                                try {
                                    cVar.f17375a = Long.valueOf(C10025m.m24861l(item3));
                                } catch (Exception unused) {
                                }
                            } else if (Descriptor$Service$ELEMENT.maximum.equals(item3)) {
                                cVar.f17376b = Long.valueOf(C10025m.m24861l(item3));
                            } else if (Descriptor$Service$ELEMENT.step.equals(item3)) {
                                cVar.f17377c = Long.valueOf(C10025m.m24861l(item3));
                            }
                        }
                    }
                    gVar.f17413e = cVar;
                }
            }
        }
    }

    public void warning(SAXParseException sAXParseException) {
        f17458a.warning(sAXParseException.toString());
    }
}
