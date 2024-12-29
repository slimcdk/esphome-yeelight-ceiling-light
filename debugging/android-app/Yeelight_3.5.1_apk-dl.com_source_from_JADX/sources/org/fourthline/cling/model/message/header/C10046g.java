package org.fourthline.cling.model.message.header;

/* renamed from: org.fourthline.cling.model.message.header.g */
public class C10046g extends UpnpHeader<String> {
    public C10046g() {
        mo40451e("");
    }

    /* renamed from: a */
    public String mo40448a() {
        return (String) mo40449b();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        if (str != null && str.length() > 0) {
            throw new InvalidHeaderException("Invalid EXT header, it has no value: " + str);
        }
    }
}
