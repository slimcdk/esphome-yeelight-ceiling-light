package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10100u;

/* renamed from: org.fourthline.cling.model.message.header.x */
public class C10063x extends UpnpHeader<C10100u> {
    public C10063x() {
    }

    public C10063x(C10100u uVar) {
        mo40451e(uVar);
    }

    /* renamed from: a */
    public String mo40448a() {
        return "\"" + ((C10100u) mo40449b()).toString() + "\"";
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            if (!str.startsWith("\"")) {
                if (str.endsWith("\"")) {
                    throw new InvalidHeaderException("Invalid SOAP action header, must be enclosed in doublequotes:" + str);
                }
            }
            mo40451e(C10100u.m25173g(str.substring(1, str.length() - 1)));
        } catch (RuntimeException e) {
            throw new InvalidHeaderException("Invalid SOAP action header value, " + e.getMessage());
        }
    }
}
