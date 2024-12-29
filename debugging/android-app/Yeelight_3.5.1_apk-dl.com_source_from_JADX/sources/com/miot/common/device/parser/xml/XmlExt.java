package com.miot.common.device.parser.xml;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlExt {
    public static Element getChild(Element element, String str) {
        if (element != null) {
            NodeList childNodes = element.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1 && item.getNodeName().equals(str)) {
                    return (Element) item;
                }
            }
        }
        return null;
    }

    public static String getValue(Element element, String str) {
        Element child;
        if (element == null || (child = getChild(element, str)) == null) {
            return null;
        }
        return child.getTextContent();
    }
}
