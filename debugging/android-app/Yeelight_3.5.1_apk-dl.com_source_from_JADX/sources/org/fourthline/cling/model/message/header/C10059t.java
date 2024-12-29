package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.NotificationSubtype;

/* renamed from: org.fourthline.cling.model.message.header.t */
public class C10059t extends UpnpHeader<NotificationSubtype> {
    public C10059t() {
        mo40451e(NotificationSubtype.ALL);
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((NotificationSubtype) mo40449b()).getHeaderString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        NotificationSubtype notificationSubtype = NotificationSubtype.ALL;
        if (!str.equals(notificationSubtype.getHeaderString())) {
            throw new InvalidHeaderException("Invalid ST header value (not " + notificationSubtype + "): " + str);
        }
    }
}
