package org.fourthline.cling.binding.xml;

import org.w3c.dom.Node;

public enum Descriptor$Service$ELEMENT {
    scpd,
    specVersion,
    major,
    minor,
    actionList,
    action,
    name,
    argumentList,
    argument,
    direction,
    relatedStateVariable,
    retval,
    serviceStateTable,
    stateVariable,
    dataType,
    defaultValue,
    allowedValueList,
    allowedValue,
    allowedValueRange,
    minimum,
    maximum,
    step;

    public static Descriptor$Service$ELEMENT valueOrNullOf(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(Node node) {
        return toString().equals(node.getLocalName());
    }
}
