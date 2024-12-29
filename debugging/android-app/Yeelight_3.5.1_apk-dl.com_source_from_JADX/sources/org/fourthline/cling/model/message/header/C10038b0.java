package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10104y;

/* renamed from: org.fourthline.cling.model.message.header.b0 */
public class C10038b0 extends C10061v {
    public C10038b0() {
    }

    public C10038b0(C10104y yVar) {
        super(yVar);
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            mo40451e(C10104y.m25184f(str));
        } catch (Exception e) {
            throw new InvalidHeaderException("Invalid UDA service type header value, " + e.getMessage());
        }
    }
}
