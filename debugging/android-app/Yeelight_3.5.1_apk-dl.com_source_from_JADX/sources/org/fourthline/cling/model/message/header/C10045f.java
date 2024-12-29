package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10089j;
import org.fourthline.cling.model.types.C10094o;
import org.fourthline.cling.model.types.C10105z;

/* renamed from: org.fourthline.cling.model.message.header.f */
public class C10045f extends UpnpHeader<C10094o> {
    public C10045f() {
    }

    public C10045f(C10105z zVar, C10089j jVar) {
        mo40451e(new C10094o(zVar, jVar));
    }

    /* renamed from: a */
    public String mo40448a() {
        return ((C10094o) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            mo40451e(C10094o.m25154c(str));
        } catch (Exception e) {
            throw new InvalidHeaderException("Invalid device USN header value, " + e.getMessage());
        }
    }
}
