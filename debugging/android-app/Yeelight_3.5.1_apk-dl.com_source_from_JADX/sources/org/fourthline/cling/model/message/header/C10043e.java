package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10089j;

/* renamed from: org.fourthline.cling.model.message.header.e */
public class C10043e extends UpnpHeader<C10089j> {
    public C10043e() {
    }

    public C10043e(C10089j jVar) {
        mo40451e(jVar);
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10089j) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            mo40451e(C10089j.m25135e(str));
        } catch (RuntimeException e) {
            throw new InvalidHeaderException("Invalid device type header value, " + e.getMessage());
        }
    }
}
