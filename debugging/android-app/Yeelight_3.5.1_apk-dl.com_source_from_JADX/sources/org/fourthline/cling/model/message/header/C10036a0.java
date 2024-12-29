package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10102w;

/* renamed from: org.fourthline.cling.model.message.header.a0 */
public class C10036a0 extends C10043e {
    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            mo40451e(C10102w.m25182f(str));
        } catch (Exception e) {
            throw new InvalidHeaderException("Invalid UDA device type header value, " + e.getMessage());
        }
    }
}
