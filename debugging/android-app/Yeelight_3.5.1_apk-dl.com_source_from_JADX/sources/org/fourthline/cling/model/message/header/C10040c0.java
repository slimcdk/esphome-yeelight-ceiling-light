package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10105z;

/* renamed from: org.fourthline.cling.model.message.header.c0 */
public class C10040c0 extends UpnpHeader<C10105z> {
    public C10040c0() {
    }

    public C10040c0(C10105z zVar) {
        mo40451e(zVar);
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10105z) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        if (!str.startsWith("uuid:")) {
            throw new InvalidHeaderException("Invalid UDA header value, must start with 'uuid:': " + str);
        } else if (!str.contains("::urn")) {
            mo40451e(new C10105z(str.substring(5)));
        } else {
            throw new InvalidHeaderException("Invalid UDA header value, must not contain '::urn': " + str);
        }
    }
}
