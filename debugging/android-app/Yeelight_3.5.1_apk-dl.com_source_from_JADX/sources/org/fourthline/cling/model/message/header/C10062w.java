package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10095p;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10105z;

/* renamed from: org.fourthline.cling.model.message.header.w */
public class C10062w extends UpnpHeader<C10095p> {
    public C10062w() {
    }

    public C10062w(C10105z zVar, C10098s sVar) {
        mo40451e(new C10095p(zVar, sVar));
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10095p) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            mo40451e(C10095p.m25157c(str));
        } catch (Exception e) {
            throw new InvalidHeaderException("Invalid service USN header value, " + e.getMessage());
        }
    }
}
