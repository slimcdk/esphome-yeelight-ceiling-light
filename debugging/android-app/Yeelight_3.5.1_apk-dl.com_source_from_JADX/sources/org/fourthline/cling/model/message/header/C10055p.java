package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.NotificationSubtype;

/* renamed from: org.fourthline.cling.model.message.header.p */
public class C10055p extends UpnpHeader<NotificationSubtype> {
    public C10055p() {
    }

    public C10055p(NotificationSubtype notificationSubtype) {
        mo40451e(notificationSubtype);
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((NotificationSubtype) mo40449b()).getHeaderString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        NotificationSubtype[] values = NotificationSubtype.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            NotificationSubtype notificationSubtype = values[i];
            if (str.equals(notificationSubtype.getHeaderString())) {
                mo40451e(notificationSubtype);
                break;
            }
            i++;
        }
        if (mo40449b() == null) {
            throw new InvalidHeaderException("Invalid NTS header value: " + str);
        }
    }
}
