package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10105z;

/* renamed from: org.fourthline.cling.model.message.header.d0 */
public class C10042d0 extends UpnpHeader<C10105z> {
    public C10042d0() {
    }

    public C10042d0(C10105z zVar) {
        mo40451e(zVar);
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10105z) mo40449b()).toString() + "::upnp:rootdevice";
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        if (!str.startsWith("uuid:") || !str.endsWith("::upnp:rootdevice")) {
            throw new InvalidHeaderException("Invalid root device USN header value, must start with 'uuid:' and end with '::upnp:rootdevice' but is '" + str + "'");
        }
        mo40451e(new C10105z(str.substring(5, str.length() - 17)));
    }
}
