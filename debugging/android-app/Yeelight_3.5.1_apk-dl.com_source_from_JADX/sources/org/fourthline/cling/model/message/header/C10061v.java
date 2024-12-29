package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10098s;

/* renamed from: org.fourthline.cling.model.message.header.v */
public class C10061v extends UpnpHeader<C10098s> {
    public C10061v() {
    }

    public C10061v(C10098s sVar) {
        mo40451e(sVar);
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10098s) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            mo40451e(C10098s.m25165e(str));
        } catch (RuntimeException e) {
            throw new InvalidHeaderException("Invalid service type header value, " + e.getMessage());
        }
    }
}
