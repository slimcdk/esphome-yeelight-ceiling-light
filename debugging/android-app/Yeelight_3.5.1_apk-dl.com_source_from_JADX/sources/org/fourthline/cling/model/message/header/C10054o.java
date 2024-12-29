package org.fourthline.cling.model.message.header;

import java.util.Locale;

/* renamed from: org.fourthline.cling.model.message.header.o */
public class C10054o extends UpnpHeader<String> {
    public C10054o() {
        mo40451e("upnp:event");
    }

    /* renamed from: a */
    public String mo40448a() {
        return (String) mo40449b();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        if (!str.toLowerCase(Locale.ROOT).equals(mo40449b())) {
            throw new InvalidHeaderException("Invalid event NT header value: " + str);
        }
    }
}
