package org.fourthline.cling.model.message.header;

/* renamed from: org.fourthline.cling.model.message.header.y */
public class C10064y extends UpnpHeader<String> {
    public C10064y() {
    }

    public C10064y(String str) {
        mo40451e(str);
    }

    /* renamed from: a */
    public String mo40448a() {
        return (String) mo40449b();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        if (str.startsWith("uuid:")) {
            mo40451e(str);
            return;
        }
        throw new InvalidHeaderException("Invalid subscription ID header value, must start with 'uuid:': " + str);
    }
}
