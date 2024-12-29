package org.fourthline.cling.model.message.header;

import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: org.fourthline.cling.model.message.header.k */
public class C10050k extends UpnpHeader<URL> {
    public C10050k() {
    }

    public C10050k(URL url) {
        mo40451e(url);
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((URL) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            mo40451e(new URL(str));
        } catch (MalformedURLException e) {
            throw new InvalidHeaderException("Invalid URI: " + e.getMessage());
        }
    }
}
