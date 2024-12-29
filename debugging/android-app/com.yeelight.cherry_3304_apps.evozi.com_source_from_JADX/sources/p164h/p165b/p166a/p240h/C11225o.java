package p164h.p165b.p166a.p240h;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: h.b.a.h.o */
public class C11225o {
    /* renamed from: a */
    public static Element m29314a(Document document, Element element, Enum enumR) {
        return m29315b(document, element, enumR.toString());
    }

    /* renamed from: b */
    public static Element m29315b(Document document, Element element, String str) {
        Element createElement = document.createElement(str);
        element.appendChild(createElement);
        return createElement;
    }

    /* renamed from: c */
    public static Element m29316c(Document document, Element element, String str, Object obj) {
        return m29317d(document, element, str, obj, (String) null);
    }

    /* renamed from: d */
    public static Element m29317d(Document document, Element element, String str, Object obj, String str2) {
        Element createElementNS = str2 != null ? document.createElementNS(str2, str) : document.createElement(str);
        if (obj != null) {
            createElementNS.appendChild(document.createTextNode(obj.toString()));
        }
        element.appendChild(createElementNS);
        return createElementNS;
    }

    /* renamed from: e */
    public static Element m29318e(Document document, Element element, Enum enumR, Object obj) {
        return m29319f(document, element, enumR, obj, (String) null);
    }

    /* renamed from: f */
    public static Element m29319f(Document document, Element element, Enum enumR, Object obj, String str) {
        return m29320g(document, element, enumR.toString(), obj, str);
    }

    /* renamed from: g */
    public static Element m29320g(Document document, Element element, String str, Object obj, String str2) {
        return obj == null ? element : m29317d(document, element, str, obj, str2);
    }

    /* renamed from: h */
    public static String m29321h(Document document) {
        return m29322i(document, true);
    }

    /* renamed from: i */
    public static String m29322i(Document document, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"");
        sb.append(z ? "yes" : "no");
        sb.append("\"?>");
        String sb2 = sb.toString();
        return sb2 + m29326m(document.getDocumentElement(), new HashSet(), document.getDocumentElement().getNamespaceURI());
    }

    /* renamed from: j */
    public static String m29323j(String str) {
        return m29324k(str, true);
    }

    /* renamed from: k */
    public static String m29324k(String str, boolean z) {
        String replaceAll = str.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        return z ? replaceAll.replaceAll("'", "&apos;").replaceAll("\"", "&quot;") : replaceAll;
    }

    /* renamed from: l */
    public static String m29325l(Node node) {
        StringBuffer stringBuffer = new StringBuffer();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 3) {
                stringBuffer.append(item.getNodeValue());
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: m */
    protected static String m29326m(Node node, Set<String> set, String str) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (node == null) {
            return "";
        }
        if (node instanceof Element) {
            Element element = (Element) node;
            sb.append("<");
            sb.append(element.getNodeName());
            HashMap hashMap = new HashMap();
            if (element.getPrefix() != null && !set.contains(element.getPrefix())) {
                hashMap.put(element.getPrefix(), element.getNamespaceURI());
            }
            if (element.hasAttributes()) {
                NamedNodeMap attributes = element.getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    Node item = attributes.item(i);
                    if (!item.getNodeName().startsWith("xmlns")) {
                        if (item.getPrefix() != null && !set.contains(item.getPrefix())) {
                            hashMap.put(item.getPrefix(), element.getNamespaceURI());
                        }
                        sb.append(" ");
                        sb.append(item.getNodeName());
                        sb.append("=\"");
                        sb.append(item.getNodeValue());
                        sb.append("\"");
                    }
                }
            }
            if (str != null && !hashMap.containsValue(str) && !str.equals(element.getParentNode().getNamespaceURI())) {
                sb.append(" xmlns=\"");
                sb.append(str);
                sb.append("\"");
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                sb.append(" xmlns:");
                sb.append((String) entry.getKey());
                sb.append("=\"");
                sb.append((String) entry.getValue());
                sb.append("\"");
                set.add(entry.getKey());
            }
            NodeList childNodes = element.getChildNodes();
            int i2 = 0;
            while (true) {
                if (i2 >= childNodes.getLength()) {
                    z = true;
                    break;
                } else if (childNodes.item(i2).getNodeType() != 2) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                sb.append(">");
                for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                    sb.append(m29326m(childNodes.item(i3), set, childNodes.item(i3).getNamespaceURI()));
                }
                sb.append("</");
                sb.append(element.getNodeName());
                sb.append(">");
            } else {
                sb.append("/>");
            }
            for (String remove : hashMap.keySet()) {
                set.remove(remove);
            }
        } else if (node.getNodeValue() != null) {
            sb.append(m29324k(node.getNodeValue(), node instanceof Attr));
        }
        return sb.toString();
    }
}
