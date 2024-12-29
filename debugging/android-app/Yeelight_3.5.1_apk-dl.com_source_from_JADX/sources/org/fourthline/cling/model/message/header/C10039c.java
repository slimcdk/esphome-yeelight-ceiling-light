package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.C10081e;
import org.fourthline.cling.model.types.InvalidValueException;

/* renamed from: org.fourthline.cling.model.message.header.c */
public class C10039c extends UpnpHeader<C10081e> {
    /* renamed from: a */
    public String mo40448a() {
        return ((C10081e) mo40449b()).mo40595b(true, "bytes ");
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        try {
            mo40451e(C10081e.m25112d(str, "bytes "));
        } catch (InvalidValueException e) {
            throw new InvalidHeaderException("Invalid Range Header: " + e.getMessage());
        }
    }
}
