package org.fourthline.cling.binding.xml;

import org.w3c.dom.Node;

public enum Descriptor$Device$ELEMENT {
    root,
    specVersion,
    major,
    minor,
    URLBase,
    device,
    UDN,
    X_DLNADOC,
    X_DLNACAP,
    ProductCap,
    X_ProductCap,
    deviceType,
    friendlyName,
    manufacturer,
    manufacturerURL,
    modelDescription,
    modelName,
    modelNumber,
    modelURL,
    presentationURL,
    UPC,
    serialNumber,
    iconList,
    icon,
    width,
    height,
    depth,
    url,
    mimetype,
    serviceList,
    service,
    serviceType,
    serviceId,
    SCPDURL,
    controlURL,
    eventSubURL,
    deviceList;

    public static Descriptor$Device$ELEMENT valueOrNullOf(String str) {
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
