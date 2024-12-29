package org.fourthline.cling.model.message.header;

import java.util.Locale;

/* renamed from: org.fourthline.cling.model.message.header.s */
public class C10058s extends UpnpHeader<String> {
    public C10058s() {
        mo40451e("upnp:rootdevice");
    }

    /* renamed from: a */
    public String mo40448a() {
        return (String) mo40449b();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        if (!str.toLowerCase(Locale.ROOT).equals(mo40449b())) {
            throw new InvalidHeaderException("Invalid root device NT header value: " + str);
        }
    }
}
