package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10096q;
import org.fourthline.cling.model.types.InvalidValueException;

/* renamed from: org.fourthline.cling.model.message.header.q */
public class C10056q extends UpnpHeader<C10096q> {
    /* renamed from: a */
    public String mo40448a() {
        return ((C10096q) mo40449b()).mo40637a();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            mo40451e(C10096q.m25160b(str));
        } catch (InvalidValueException e) {
            throw new InvalidHeaderException("Invalid Range Header: " + e.getMessage());
        }
    }
}
