package org.seamless.xml;

import java.util.HashMap;
import java.util.Iterator;
import javax.xml.namespace.NamespaceContext;

public abstract class NamespaceContextMap extends HashMap<String, String> implements NamespaceContext {
    /* access modifiers changed from: protected */
    public abstract String getDefaultNamespaceURI();

    public String getNamespaceURI(String str) {
        if (str != null) {
            return str.equals("") ? getDefaultNamespaceURI() : get(str) != null ? (String) get(str) : "";
        }
        throw new IllegalArgumentException("No prefix provided!");
    }

    public String getPrefix(String str) {
        return null;
    }

    public Iterator getPrefixes(String str) {
        return null;
    }
}
